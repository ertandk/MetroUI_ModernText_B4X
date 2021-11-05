
#import "b4i_b4xpagesmanager.h"
#import "b4i_main.h"
#import "b4i_b4xmainpage.h"
#import "b4i_metroui_moderntext.h"
#import "b4i_b4xpages.h"
#import "b4i_b4xbitset.h"
#import "b4i_b4xbytesbuilder.h"
#import "b4i_b4xcollections.h"
#import "b4i_b4xorderedmap.h"
#import "b4i_b4xset.h"
#import "b4i_b4xpagesdelegator.h"

@implementation _b4xpageparent
-(void)Initialize{
self.IsInitialized = true;
self->_NativeType = [B4IPage new];
}
- (NSString*)description {
return [B4I TypeToString:self :false];}
@end
@implementation _b4xpageinfo
-(void)Initialize{
self.IsInitialized = true;
self->_B4XPage = [NSObject new];
self->_Id = @"";
self->_Created = false;
self->_Title = [NSObject new];
self->_Root = [B4XViewWrapper new];
self->_IsFirst = false;
self->_Parent = [_b4xpageparent new];
}
- (NSString*)description {
return [B4I TypeToString:self :false];}
@end

@implementation b4i_b4xpagesmanager 


+ (B4I*)createBI {
    return [B4I alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xpagesmanager) instance released.");
}
- (NSString*)  _activity_pause{
 //BA.debugLineNum = 632;BA.debugLine="Public Sub Activity_Pause";
 //BA.debugLineNum = 633;BA.debugLine="RaiseEventWithResult(GetTopPage, \"B4XPage_Disappe";
[self _raiseeventwithresult:[self _gettoppage] :@"B4XPage_Disappear" :(B4IArray*)(nil)];
 //BA.debugLineNum = 634;BA.debugLine="BackgroundStateChanged(False)";
[self _backgroundstatechanged:false];
 //BA.debugLineNum = 635;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _activity_resume{
BOOL _shouldraise = false;
 //BA.debugLineNum = 607;BA.debugLine="Public Sub Activity_Resume";
 //BA.debugLineNum = 608;BA.debugLine="Dim ShouldRaise As Boolean = IsForeground = False";
_shouldraise = self->__isforeground==false;
 //BA.debugLineNum = 609;BA.debugLine="BackgroundStateChanged(True)";
[self _backgroundstatechanged:true];
 //BA.debugLineNum = 610;BA.debugLine="If ShouldRaise Then";
if (_shouldraise) { 
 //BA.debugLineNum = 611;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
[self _raiseevent:[self _gettoppage] :@"B4XPage_Appear" :(B4IArray*)(nil)];
 };
 //BA.debugLineNum = 613;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _addpage:(NSString*) _id :(NSObject*) _b4xpage{
NSString* _idtolower = @"";
 //BA.debugLineNum = 141;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
 //BA.debugLineNum = 142;BA.debugLine="Dim IdToLower As String = Id.ToLowerCase";
_idtolower = [_id ToLowerCase];
 //BA.debugLineNum = 143;BA.debugLine="If IdToB4XPage.ContainsKey(IdToLower) Then";
if ([self->__idtob4xpage _containskey /*BOOL*/ :(NSObject*)(_idtolower)]) { 
 //BA.debugLineNum = 144;BA.debugLine="Log($\"Page with this id already exists: ${IdToLo";
[self->___c LogImpl:@"96291459" :([@[@"Page with this id already exists: ",[self->___c SmartStringFormatter:@"" :(NSObject*)(_idtolower)],@"!"] componentsJoinedByString:@""]) :0];
 //BA.debugLineNum = 145;BA.debugLine="Return";
if (true) return @"";
 };
 //BA.debugLineNum = 147;BA.debugLine="IdToB4XPage.Put(IdToLower, CreateB4XPageInfo(B4XP";
[self->__idtob4xpage _put /*NSString**/ :(NSObject*)(_idtolower) :(NSObject*)([self _createb4xpageinfo:_b4xpage :_idtolower :false :(NSObject*)(_id)])];
 //BA.debugLineNum = 148;BA.debugLine="If IdToB4XPage.Size = 1 Then ShowPage(IdToLower)";
if ([self->__idtob4xpage _getsize /*int*/ ]==1) { 
[self _showpage:_idtolower];};
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _addpageandcreate:(NSString*) _id :(NSObject*) _b4xpage{
 //BA.debugLineNum = 151;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
 //BA.debugLineNum = 152;BA.debugLine="AddPage (Id, B4XPage)";
[self _addpage:_id :_b4xpage];
 //BA.debugLineNum = 153;BA.debugLine="CreatePageIfNeeded(GetPageFromId(Id))";
[self _createpageifneeded:[self _getpagefromid:_id]];
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _b4ipage_appear{
B4IPage* _page = nil;
_b4xpageinfo* _pi = nil;
 //BA.debugLineNum = 231;BA.debugLine="Private Sub B4iPage_Appear";
 //BA.debugLineNum = 232;BA.debugLine="Dim page As Page = Sender";
_page = [B4IPage new];
_page = (B4IPage*) [B4IObjectWrapper createWrapper:[B4IPage new] object:(UIViewController*)([self->___c Sender:self.bi])];
 //BA.debugLineNum = 233;BA.debugLine="Dim pi As B4XPageInfo = RootB4XToPage.Get(page.Ro";
_pi = (_b4xpageinfo*)([self->__rootb4xtopage _get /*NSObject**/ :(NSObject*)(([_page RootPanel]).object)]);
 //BA.debugLineNum = 234;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
[self->__mstackofpageids _add /*NSString**/ :(NSObject*)(_pi->_Id /*NSString**/ )];
 //BA.debugLineNum = 235;BA.debugLine="UpdateStackString";
[self _updatestackstring];
 //BA.debugLineNum = 236;BA.debugLine="RaiseEvent(pi, \"B4XPage_Appear\", Null)";
[self _raiseevent:_pi :@"B4XPage_Appear" :(B4IArray*)(nil)];
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _b4ipage_barbuttonclick:(NSString*) _tag{
B4IPage* _page = nil;
 //BA.debugLineNum = 268;BA.debugLine="Private Sub B4iPage_BarButtonClick (Tag As String)";
 //BA.debugLineNum = 269;BA.debugLine="Dim page As Page = Sender";
_page = [B4IPage new];
_page = (B4IPage*) [B4IObjectWrapper createWrapper:[B4IPage new] object:(UIViewController*)([self->___c Sender:self.bi])];
 //BA.debugLineNum = 270;BA.debugLine="RaiseEvent(GetPageInfoFromRoot(page.RootPanel), \"";
[self _raiseevent:[self _getpageinfofromroot:(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)(([_page RootPanel]).object)]] :@"B4XPage_MenuClick" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(_tag)]]]];
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _b4ipage_disappear{
B4IPage* _page = nil;
_b4xpageinfo* _pi = nil;
 //BA.debugLineNum = 239;BA.debugLine="Private Sub B4iPage_Disappear";
 //BA.debugLineNum = 240;BA.debugLine="Dim page As Page = Sender";
_page = [B4IPage new];
_page = (B4IPage*) [B4IObjectWrapper createWrapper:[B4IPage new] object:(UIViewController*)([self->___c Sender:self.bi])];
 //BA.debugLineNum = 241;BA.debugLine="Dim pi As B4XPageInfo = RootB4XToPage.Get(page.Ro";
_pi = (_b4xpageinfo*)([self->__rootb4xtopage _get /*NSObject**/ :(NSObject*)(([_page RootPanel]).object)]);
 //BA.debugLineNum = 242;BA.debugLine="RaiseEvent(pi, \"B4XPage_Disappear\", Null)";
[self _raiseevent:_pi :@"B4XPage_Disappear" :(B4IArray*)(nil)];
 //BA.debugLineNum = 243;BA.debugLine="If GetTopPage = pi Then";
if ([[self _gettoppage] isEqual:_pi]) { 
 //BA.debugLineNum = 244;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
[self->__mstackofpageids _remove /*NSString**/ :(NSObject*)(_pi->_Id /*NSString**/ )];
 };
 //BA.debugLineNum = 246;BA.debugLine="UpdateStackString";
[self _updatestackstring];
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _b4ipage_keyboardstatechanged:(float) _height{
B4IPage* _page = nil;
_b4xpageinfo* _pi = nil;
 //BA.debugLineNum = 253;BA.debugLine="Private Sub B4iPage_KeyboardStateChanged (Height A";
 //BA.debugLineNum = 254;BA.debugLine="Dim page As Page";
_page = [B4IPage new];
 //BA.debugLineNum = 255;BA.debugLine="If (Sender Is Page) = False Then";
if (([[self->___c Sender:self.bi] isKindOfClass: [UIViewController class]])==false) { 
 //BA.debugLineNum = 256;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = [self _gettoppage];
 //BA.debugLineNum = 257;BA.debugLine="If pi <> Null Then";
if (_pi!= nil) { 
 //BA.debugLineNum = 258;BA.debugLine="page = pi.Parent.NativeType";
_page = _pi->_Parent /*_b4xpageparent**/ ->_NativeType /*B4IPage**/ ;
 };
 }else {
 //BA.debugLineNum = 261;BA.debugLine="page = Sender";
_page = (B4IPage*) [B4IObjectWrapper createWrapper:[B4IPage new] object:(UIViewController*)([self->___c Sender:self.bi])];
 };
 //BA.debugLineNum = 263;BA.debugLine="If page.IsInitialized Then";
if ([_page IsInitialized]) { 
 //BA.debugLineNum = 264;BA.debugLine="RaiseEvent(GetPageInfoFromRoot(page.RootPanel),";
[self _raiseevent:[self _getpageinfofromroot:(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)(([_page RootPanel]).object)]] :@"B4XPage_KeyboardStateChanged" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@(_height))]]]];
 };
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _b4ipage_resize:(float) _width :(float) _height{
 //BA.debugLineNum = 249;BA.debugLine="Private Sub B4iPage_Resize (Width As Float, Height";
 //BA.debugLineNum = 250;BA.debugLine="RaiseEvent(GetPageInfoFromRoot(Sender), \"B4XPage_";
[self _raiseevent:[self _getpageinfofromroot:(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)([self->___c Sender:self.bi])]] :@"B4XPage_Resize" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@(_width))],[B4I nilToNSNull:(NSObject*)(@(_height))]]]];
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _backgroundstatechanged:(BOOL) _newstate{
NSString* _ev = @"";
_b4xpageinfo* _pi = nil;
 //BA.debugLineNum = 615;BA.debugLine="Private Sub BackgroundStateChanged (NewState As Bo";
 //BA.debugLineNum = 616;BA.debugLine="If IsForeground = NewState Then Return";
if (self->__isforeground==_newstate) { 
if (true) return @"";};
 //BA.debugLineNum = 617;BA.debugLine="IsForeground = NewState";
self->__isforeground = _newstate;
 //BA.debugLineNum = 618;BA.debugLine="Dim ev As String";
_ev = @"";
 //BA.debugLineNum = 619;BA.debugLine="If IsForeground Then ev = \"B4XPage_Foreground\" El";
if (self->__isforeground) { 
_ev = @"B4XPage_Foreground";}
else {
_ev = @"B4XPage_Background";};
 //BA.debugLineNum = 620;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
{
const id<B4IIterable> group5 = [self->__idtob4xpage _getvalues /*B4IList**/ ];
const int groupLen5 = group5.Size
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_pi = (_b4xpageinfo*)([group5 Get:index5]);
 //BA.debugLineNum = 621;BA.debugLine="If xui.SubExists(pi.B4XPage, ev, 0) Then";
if ([self->__xui SubExists:_pi->_B4XPage /*NSObject**/  :_ev :(int) (0)]) { 
 //BA.debugLineNum = 622;BA.debugLine="LogEvent(pi, ev)";
[self _logevent:_pi :_ev];
 //BA.debugLineNum = 623;BA.debugLine="If IsForeground Then";
if (self->__isforeground) { 
 //BA.debugLineNum = 624;BA.debugLine="CallSubDelayed(pi.B4XPage, ev)";
[self->___c CallSubDelayed:self.bi :_pi->_B4XPage /*NSObject**/  :_ev];
 }else {
 //BA.debugLineNum = 626;BA.debugLine="CallSub(pi.B4XPage, ev)";
[self->___c CallSub:self.bi :_pi->_B4XPage /*NSObject**/  :_ev];
 };
 };
 }
};
 //BA.debugLineNum = 630;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals{
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
 //BA.debugLineNum = 22;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private IdToB4XPage As B4XOrderedMap";
self->__idtob4xpage = [b4i_b4xorderedmap new];
 //BA.debugLineNum = 24;BA.debugLine="Private RootB4XToPage As B4XOrderedMap";
self->__rootb4xtopage = [b4i_b4xorderedmap new];
 //BA.debugLineNum = 32;BA.debugLine="Type B4XPageParent (NativeType As Page)";
;
 //BA.debugLineNum = 34;BA.debugLine="Type B4XPageInfo (B4XPage As Object, Id As String";
;
 //BA.debugLineNum = 38;BA.debugLine="Public mStackOfPageIds As B4XSet";
self->__mstackofpageids = [b4i_b4xset new];
 //BA.debugLineNum = 39;BA.debugLine="Private xui As XUI 'ignore";
self->__xui = [B4IXUI new];
 //BA.debugLineNum = 47;BA.debugLine="Private mMainForm As NavigationController";
self->__mmainform = [B4INavigationControllerWrapper new];
 //BA.debugLineNum = 49;BA.debugLine="Public IsForeground As Boolean";
self->__isforeground = false;
 //BA.debugLineNum = 50;BA.debugLine="Public TransitionAnimationDuration As Int = 100";
self->__transitionanimationduration = (int) (100);
 //BA.debugLineNum = 51;BA.debugLine="Public MainPage As B4XMainPage";
self->__mainpage = [b4i_b4xmainpage new];
 //BA.debugLineNum = 52;BA.debugLine="Private StackString As String";
self->__stackstring = @"";
 //BA.debugLineNum = 53;BA.debugLine="Public LogEvents As Boolean = False";
self->__logevents = false;
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _closepage:(NSObject*) _b4xpage{
_b4xpageinfo* _pi = nil;
 //BA.debugLineNum = 209;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
 //BA.debugLineNum = 210;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
_pi = [self _findpifromb4xpage:_b4xpage];
 //BA.debugLineNum = 211;BA.debugLine="If mStackOfPageIds.Contains(pi.Id) = False Then R";
if ([self->__mstackofpageids _contains /*BOOL*/ :(NSObject*)(_pi->_Id /*NSString**/ )]==false) { 
if (true) return @"";};
 //BA.debugLineNum = 212;BA.debugLine="If xui.IsB4i And GetTopPage <> pi Then";
if ([self->__xui IsB4i] && [[self _gettoppage] isEqual:_pi] == false) { 
 //BA.debugLineNum = 213;BA.debugLine="Log(\"Only top page can be closed\")";
[self->___c LogImpl:@"96553604" :@"Only top page can be closed" :0];
 //BA.debugLineNum = 214;BA.debugLine="Return";
if (true) return @"";
 }else if([self->__xui IsB4i] && [self->__mstackofpageids _getsize /*int*/ ]==1) { 
 //BA.debugLineNum = 216;BA.debugLine="Log(\"First page cannot be closed\")";
[self->___c LogImpl:@"96553607" :@"First page cannot be closed" :0];
 //BA.debugLineNum = 217;BA.debugLine="Return";
if (true) return @"";
 };
 //BA.debugLineNum = 219;BA.debugLine="ClosePageImpl(pi)";
[self _closepageimpl:_pi];
 //BA.debugLineNum = 220;BA.debugLine="If GetTopPage = pi Then";
if ([[self _gettoppage] isEqual:_pi]) { 
 //BA.debugLineNum = 221;BA.debugLine="TopPageDisappear";
[self _toppagedisappear];
 };
 //BA.debugLineNum = 223;BA.debugLine="If xui.IsB4A And mStackOfPageIds.Size = 1 Then Re";
if ([self->__xui IsB4A] && [self->__mstackofpageids _getsize /*int*/ ]==1) { 
if (true) return @"";};
 //BA.debugLineNum = 224;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
[self->__mstackofpageids _remove /*NSString**/ :(NSObject*)(_pi->_Id /*NSString**/ )];
 //BA.debugLineNum = 225;BA.debugLine="If xui.IsB4A Then ShowPageImpl(GetTopPage)";
if ([self->__xui IsB4A]) { 
[self _showpageimpl:[self _gettoppage]];};
 //BA.debugLineNum = 226;BA.debugLine="TopPageAppear";
[self _toppageappear];
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _closepageimpl:(_b4xpageinfo*) _pi{
 //BA.debugLineNum = 312;BA.debugLine="Private Sub ClosePageImpl (pi As B4XPageInfo) 'ign";
 //BA.debugLineNum = 326;BA.debugLine="mMainForm.RemoveCurrentPage2(TransitionAnimationD";
[self->__mmainform RemoveCurrentPage2:self->__transitionanimationduration>0];
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return @"";
}
- (_b4xpageinfo*)  _createb4xpageinfo:(NSObject*) _b4xpage :(NSString*) _id :(BOOL) _created :(NSObject*) _title{
_b4xpageinfo* _t1 = nil;
 //BA.debugLineNum = 417;BA.debugLine="Private Sub CreateB4XPageInfo (B4XPage As Object,";
 //BA.debugLineNum = 418;BA.debugLine="Dim t1 As B4XPageInfo";
_t1 = [_b4xpageinfo new];
 //BA.debugLineNum = 419;BA.debugLine="t1.Initialize";
[_t1 Initialize];
 //BA.debugLineNum = 420;BA.debugLine="t1.B4XPage = B4XPage";
_t1->_B4XPage /*NSObject**/  = _b4xpage;
 //BA.debugLineNum = 421;BA.debugLine="t1.Id = Id";
_t1->_Id /*NSString**/  = _id;
 //BA.debugLineNum = 422;BA.debugLine="t1.Created = Created";
_t1->_Created /*BOOL*/  = _created;
 //BA.debugLineNum = 423;BA.debugLine="t1.Title = Title";
_t1->_Title /*NSObject**/  = _title;
 //BA.debugLineNum = 424;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 425;BA.debugLine="End Sub";
return nil;
}
- (_b4xpageparent*)  _createb4xpageparent:(B4IPage*) _nativetype{
_b4xpageparent* _t1 = nil;
 //BA.debugLineNum = 599;BA.debugLine="Private Sub CreateB4XPageParent (NativeType As Pag";
 //BA.debugLineNum = 601;BA.debugLine="Dim t1 As B4XPageParent";
_t1 = [_b4xpageparent new];
 //BA.debugLineNum = 602;BA.debugLine="t1.Initialize";
[_t1 Initialize];
 //BA.debugLineNum = 603;BA.debugLine="t1.NativeType = NativeType";
_t1->_NativeType /*B4IPage**/  = _nativetype;
 //BA.debugLineNum = 604;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 605;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _createpageifneeded:(_b4xpageinfo*) _pi{
 //BA.debugLineNum = 349;BA.debugLine="Private Sub CreatePageIfNeeded(pi As B4XPageInfo)";
 //BA.debugLineNum = 350;BA.debugLine="If pi.Created Then Return";
if (_pi->_Created /*BOOL*/ ) { 
if (true) return @"";};
 //BA.debugLineNum = 351;BA.debugLine="pi.IsFirst = IdToB4XPage.Size = 1";
_pi->_IsFirst /*BOOL*/  = [self->__idtob4xpage _getsize /*int*/ ]==1;
 //BA.debugLineNum = 352;BA.debugLine="CreatePageImpl (pi)";
[self _createpageimpl:_pi];
 //BA.debugLineNum = 353;BA.debugLine="pi.Created = True";
_pi->_Created /*BOOL*/  = true;
 //BA.debugLineNum = 354;BA.debugLine="RootB4XToPage.Put(pi.Root, pi)";
[self->__rootb4xtopage _put /*NSString**/ :(NSObject*)((_pi->_Root /*B4XViewWrapper**/ ).object) :(NSObject*)(_pi)];
 //BA.debugLineNum = 355;BA.debugLine="LogEvent(pi, \"B4XPage_Created\")";
[self _logevent:_pi :@"B4XPage_Created"];
 //BA.debugLineNum = 356;BA.debugLine="CallSub2(pi.B4XPage, \"B4XPage_Created\", pi.root)";
[self->___c CallSub2:self.bi :_pi->_B4XPage /*NSObject**/  :@"B4XPage_Created" :(NSObject*)(_pi->_Root /*B4XViewWrapper**/ )];
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _createpageimpl:(_b4xpageinfo*) _pi{
B4IPage* _page = nil;
 //BA.debugLineNum = 366;BA.debugLine="Private Sub CreatePageImpl (pi As B4XPageInfo)";
 //BA.debugLineNum = 383;BA.debugLine="Dim page As Page";
_page = [B4IPage new];
 //BA.debugLineNum = 384;BA.debugLine="page.Initialize(\"B4iPage\")";
[_page Initialize:self.bi :@"B4iPage"];
 //BA.debugLineNum = 385;BA.debugLine="pi.Parent = CreateB4XPageParent(page)";
_pi->_Parent /*_b4xpageparent**/  = [self _createb4xpageparent:_page];
 //BA.debugLineNum = 386;BA.debugLine="pi.Root = pi.Parent.NativeType.RootPanel";
_pi->_Root /*B4XViewWrapper**/  = (B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)(([_pi->_Parent /*_b4xpageparent**/ ->_NativeType /*B4IPage**/  RootPanel]).object)];
 //BA.debugLineNum = 387;BA.debugLine="pi.Parent.NativeType.Title = pi.Title";
[_pi->_Parent /*_b4xpageparent**/ ->_NativeType /*B4IPage**/  setTitle:[self.bi ObjectToString:_pi->_Title /*NSObject**/ ]];
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return @"";
}
- (_b4xpageinfo*)  _findpifromb4xpage:(NSObject*) _page{
_b4xpageinfo* _pi = nil;
 //BA.debugLineNum = 303;BA.debugLine="Public Sub FindPIFromB4XPage (Page As Object) As B";
 //BA.debugLineNum = 304;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
{
const id<B4IIterable> group1 = [self->__idtob4xpage _getvalues /*B4IList**/ ];
const int groupLen1 = group1.Size
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_pi = (_b4xpageinfo*)([group1 Get:index1]);
 //BA.debugLineNum = 305;BA.debugLine="If pi.B4XPage = Page Then";
if ([_pi->_B4XPage /*NSObject**/  isEqual:_page]) { 
 //BA.debugLineNum = 306;BA.debugLine="Return pi";
if (true) return _pi;
 };
 }
};
 //BA.debugLineNum = 309;BA.debugLine="Return Null";
if (true) return (_b4xpageinfo*)(nil);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return nil;
}
- (NSObject*)  _getpage:(NSString*) _id{
 //BA.debugLineNum = 391;BA.debugLine="Public Sub GetPage (Id As String) As Object";
 //BA.debugLineNum = 392;BA.debugLine="Return GetPageFromId(Id).B4XPage";
if (true) return [self _getpagefromid:_id]->_B4XPage /*NSObject**/ ;
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
return nil;
}
- (_b4xpageinfo*)  _getpagefromid:(NSString*) _id{
_b4xpageinfo* _pi = nil;
 //BA.debugLineNum = 395;BA.debugLine="Private Sub GetPageFromId (id As String) As B4XPag";
 //BA.debugLineNum = 396;BA.debugLine="Dim pi As B4XPageInfo = IdToB4XPage.Get(id.ToLowe";
_pi = (_b4xpageinfo*)([self->__idtob4xpage _get /*NSObject**/ :(NSObject*)([_id ToLowerCase])]);
 //BA.debugLineNum = 397;BA.debugLine="If pi = Null Then";
if (_pi== nil) { 
 //BA.debugLineNum = 398;BA.debugLine="Log(\"Error: page id not found: \" & id)";
[self->___c LogImpl:@"97536643" :[@[@"Error: page id not found: ",_id] componentsJoinedByString:@""] :0];
 //BA.debugLineNum = 399;BA.debugLine="Log(\"Ids: \" & IdToB4XPage.Keys) 'ignore";
[self->___c LogImpl:@"97536644" :[@[@"Ids: ",[self.bi ObjectToString:[self->__idtob4xpage _getkeys /*B4IList**/ ]]] componentsJoinedByString:@""] :0];
 };
 //BA.debugLineNum = 401;BA.debugLine="Return pi";
if (true) return _pi;
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return nil;
}
- (_b4xpageinfo*)  _getpageinfofromroot:(B4XViewWrapper*) _root{
 //BA.debugLineNum = 404;BA.debugLine="Public Sub GetPageInfoFromRoot (Root As B4XView) A";
 //BA.debugLineNum = 405;BA.debugLine="Return RootB4XToPage.Get(Root)";
if (true) return (_b4xpageinfo*)([self->__rootb4xtopage _get /*NSObject**/ :(NSObject*)((_root).object)]);
 //BA.debugLineNum = 406;BA.debugLine="End Sub";
return nil;
}
- (_b4xpageinfo*)  _gettoppage{
 //BA.debugLineNum = 589;BA.debugLine="Public Sub GetTopPage As B4XPageInfo";
 //BA.debugLineNum = 590;BA.debugLine="If mStackOfPageIds.Size = 0 Then Return Null";
if ([self->__mstackofpageids _getsize /*int*/ ]==0) { 
if (true) return (_b4xpageinfo*)(nil);};
 //BA.debugLineNum = 591;BA.debugLine="Return IdToB4XPage.Get(mStackOfPageIds.AsList.Get";
if (true) return (_b4xpageinfo*)([self->__idtob4xpage _get /*NSObject**/ :[[self->__mstackofpageids _aslist /*B4IList**/ ] Get:(int) ([self->__mstackofpageids _getsize /*int*/ ]-1)]]);
 //BA.debugLineNum = 592;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _initialize:(B4I*) _ba :(B4INavigationControllerWrapper*) _navcontrol{
[self initializeClassModule];
BOOL _nonmainpagewasadded = false;
 //BA.debugLineNum = 61;BA.debugLine="Public Sub Initialize (NavControl As NavigationCon";
 //BA.debugLineNum = 63;BA.debugLine="IdToB4XPage.Initialize";
[self->__idtob4xpage _initialize /*NSString**/ :self.bi];
 //BA.debugLineNum = 64;BA.debugLine="RootB4XToPage.Initialize";
[self->__rootb4xtopage _initialize /*NSString**/ :self.bi];
 //BA.debugLineNum = 65;BA.debugLine="mStackOfPageIds.Initialize";
[self->__mstackofpageids _initialize /*NSString**/ :self.bi];
 //BA.debugLineNum = 76;BA.debugLine="mMainForm = NavControl";
self->__mmainform = _navcontrol;
 //BA.debugLineNum = 78;BA.debugLine="B4XPages.InternalSetPagesManager(Me)";
[self->__b4xpages _internalsetpagesmanager /*NSString**/ :self];
 //BA.debugLineNum = 79;BA.debugLine="MainPage.Initialize";
[self->__mainpage _initialize /*NSString**/ :self.bi];
 //BA.debugLineNum = 80;BA.debugLine="Dim NonMainPageWasAdded As Boolean = IdToB4XPage.";
_nonmainpagewasadded = [self->__idtob4xpage _getsize /*int*/ ]>0;
 //BA.debugLineNum = 81;BA.debugLine="IdToB4XPage.Put(\"~~~~~temp~~~~\", CreateB4XPageInf";
[self->__idtob4xpage _put /*NSString**/ :(NSObject*)(@"~~~~~temp~~~~") :(NSObject*)([self _createb4xpageinfo:(NSObject*)(self->__mainpage) :@"" :false :(NSObject*)(@"")])];
 //BA.debugLineNum = 82;BA.debugLine="BackgroundStateChanged(True)";
[self _backgroundstatechanged:true];
 //BA.debugLineNum = 83;BA.debugLine="IdToB4XPage.Remove(\"~~~~~temp~~~~\")";
[self->__idtob4xpage _remove /*NSString**/ :(NSObject*)(@"~~~~~temp~~~~")];
 //BA.debugLineNum = 84;BA.debugLine="AddPageAndCreate(\"MainPage\", MainPage)";
[self _addpageandcreate:@"MainPage" :(NSObject*)(self->__mainpage)];
 //BA.debugLineNum = 85;BA.debugLine="If LogEvents = False Then";
if (self->__logevents==false) { 
 //BA.debugLineNum = 86;BA.debugLine="Log(\"Call B4XPages.GetManager.LogEvents = True t";
[self->___c LogImpl:@"96225945" :@"Call B4XPages.GetManager.LogEvents = True to enable logging B4XPages events." :0];
 };
 //BA.debugLineNum = 88;BA.debugLine="If NonMainPageWasAdded Then";
if (_nonmainpagewasadded) { 
 //BA.debugLineNum = 89;BA.debugLine="If Not(xui.IsB4i) Then";
if ((!([self->__xui IsB4i]))) { 
 //BA.debugLineNum = 90;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
[self _raiseevent:[self _gettoppage] :@"B4XPage_Appear" :(B4IArray*)(nil)];
 };
 };
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _logevent:(_b4xpageinfo*) _pi :(NSString*) _ev{
NSString* _msg = @"";
 //BA.debugLineNum = 637;BA.debugLine="Private Sub LogEvent (pi As B4XPageInfo, ev As Str";
 //BA.debugLineNum = 638;BA.debugLine="If LogEvents Then";
if (self->__logevents) { 
 //BA.debugLineNum = 639;BA.debugLine="Dim msg As String = $\"*** ${pi.Id}: ${ev} ${Stac";
_msg = ([@[@"*** ",[self->___c SmartStringFormatter:@"" :(NSObject*)(_pi->_Id /*NSString**/ )],@": ",[self->___c SmartStringFormatter:@"" :(NSObject*)(_ev)],@" ",[self->___c SmartStringFormatter:@"" :(NSObject*)(self->__stackstring)],@""] componentsJoinedByString:@""]);
 //BA.debugLineNum = 640;BA.debugLine="Log(msg)";
[self->___c LogImpl:@"98257539" :_msg :0];
 };
 //BA.debugLineNum = 642;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _mainform_resize:(double) _width :(double) _height{
int _w = 0;
int _h = 0;
 //BA.debugLineNum = 582;BA.debugLine="Public Sub MainForm_Resize(Width As Double, Height";
 //BA.debugLineNum = 583;BA.debugLine="Dim w As Int = Width";
_w = (int) (_width);
 //BA.debugLineNum = 584;BA.debugLine="Dim h As Int = Height";
_h = (int) (_height);
 //BA.debugLineNum = 585;BA.debugLine="RaiseEvent(GetPageInfoFromRoot(Sender), \"B4XPage_";
[self _raiseevent:[self _getpageinfofromroot:(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)([self->___c Sender:self.bi])]] :@"B4XPage_Resize" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@(_w))],[B4I nilToNSNull:(NSObject*)(@(_h))]]]];
 //BA.debugLineNum = 586;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _raiseevent:(_b4xpageinfo*) _targetpage :(NSString*) _subname :(B4IArray*) _params{
int _length = 0;
 //BA.debugLineNum = 545;BA.debugLine="Public Sub RaiseEvent (TargetPage As B4XPageInfo,";
 //BA.debugLineNum = 546;BA.debugLine="If TargetPage = Null Then Return";
if (_targetpage== nil) { 
if (true) return @"";};
 //BA.debugLineNum = 547;BA.debugLine="Dim length As Int";
_length = 0;
 //BA.debugLineNum = 548;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
if (_params== nil) { 
_length = (int) (0);}
else {
_length = _params.Length;};
 //BA.debugLineNum = 549;BA.debugLine="LogEvent(TargetPage, SubName)";
[self _logevent:_targetpage :_subname];
 //BA.debugLineNum = 550;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
if ([self->__xui SubExists:_targetpage->_B4XPage /*NSObject**/  :_subname :_length]==false) { 
if (true) return @"";};
 //BA.debugLineNum = 551;BA.debugLine="Select length";
switch (_length) {
case 0: {
 //BA.debugLineNum = 553;BA.debugLine="CallSubDelayed(TargetPage.B4XPage, SubName)";
[self->___c CallSubDelayed:self.bi :_targetpage->_B4XPage /*NSObject**/  :_subname];
 break; }
case 1: {
 //BA.debugLineNum = 555;BA.debugLine="CallSubDelayed2(TargetPage.B4XPage, SubName, Pa";
[self->___c CallSubDelayed2:self.bi :_targetpage->_B4XPage /*NSObject**/  :_subname :((NSObject*)[_params getObjectFast:(int) (0)])];
 break; }
case 2: {
 //BA.debugLineNum = 557;BA.debugLine="CallSubDelayed3(TargetPage.B4XPage, SubName, Pa";
[self->___c CallSubDelayed3:self.bi :_targetpage->_B4XPage /*NSObject**/  :_subname :((NSObject*)[_params getObjectFast:(int) (0)]) :((NSObject*)[_params getObjectFast:(int) (1)])];
 break; }
default: {
 //BA.debugLineNum = 559;BA.debugLine="Log(\"Too many parameters\")";
[self->___c LogImpl:@"97733262" :@"Too many parameters" :0];
 break; }
}
;
 //BA.debugLineNum = 561;BA.debugLine="End Sub";
return @"";
}
- (NSObject*)  _raiseeventwithresult:(_b4xpageinfo*) _targetpage :(NSString*) _subname :(B4IArray*) _params{
int _length = 0;
 //BA.debugLineNum = 563;BA.debugLine="Public Sub RaiseEventWithResult (TargetPage As B4X";
 //BA.debugLineNum = 564;BA.debugLine="If TargetPage = Null Then Return Null";
if (_targetpage== nil) { 
if (true) return nil;};
 //BA.debugLineNum = 565;BA.debugLine="Dim length As Int";
_length = 0;
 //BA.debugLineNum = 566;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
if (_params== nil) { 
_length = (int) (0);}
else {
_length = _params.Length;};
 //BA.debugLineNum = 567;BA.debugLine="LogEvent(TargetPage, SubName)";
[self _logevent:_targetpage :_subname];
 //BA.debugLineNum = 568;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
if ([self->__xui SubExists:_targetpage->_B4XPage /*NSObject**/  :_subname :_length]==false) { 
if (true) return nil;};
 //BA.debugLineNum = 569;BA.debugLine="Select length";
switch (_length) {
case 0: {
 //BA.debugLineNum = 571;BA.debugLine="Return CallSub(TargetPage.B4XPage, SubName)";
if (true) return [self->___c CallSub:self.bi :_targetpage->_B4XPage /*NSObject**/  :_subname];
 break; }
case 1: {
 //BA.debugLineNum = 573;BA.debugLine="Return CallSub2(TargetPage.B4XPage, SubName, Pa";
if (true) return [self->___c CallSub2:self.bi :_targetpage->_B4XPage /*NSObject**/  :_subname :((NSObject*)[_params getObjectFast:(int) (0)])];
 break; }
case 2: {
 //BA.debugLineNum = 575;BA.debugLine="Return CallSub3(TargetPage.B4XPage, SubName, Pa";
if (true) return [self->___c CallSub3:self.bi :_targetpage->_B4XPage /*NSObject**/  :_subname :((NSObject*)[_params getObjectFast:(int) (0)]) :((NSObject*)[_params getObjectFast:(int) (1)])];
 break; }
default: {
 //BA.debugLineNum = 577;BA.debugLine="Log(\"Too many parameters\")";
[self->___c LogImpl:@"97798798" :@"Too many parameters" :0];
 break; }
}
;
 //BA.debugLineNum = 579;BA.debugLine="Return Null";
if (true) return nil;
 //BA.debugLineNum = 580;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _settitle:(NSObject*) _b4xpage :(NSObject*) _title{
_b4xpageinfo* _pi = nil;
 //BA.debugLineNum = 360;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
 //BA.debugLineNum = 361;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
_pi = [self _findpifromb4xpage:_b4xpage];
 //BA.debugLineNum = 362;BA.debugLine="pi.Title = Title";
_pi->_Title /*NSObject**/  = _title;
 //BA.debugLineNum = 363;BA.debugLine="pi.Parent.NativeType.Title = Title";
[_pi->_Parent /*_b4xpageparent**/ ->_NativeType /*B4IPage**/  setTitle:[self.bi ObjectToString:_title]];
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _showpage:(NSString*) _id{
_b4xpageinfo* _pi = nil;
int _index = 0;
int _i = 0;
 //BA.debugLineNum = 156;BA.debugLine="Public Sub ShowPage (Id As String)";
 //BA.debugLineNum = 157;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
_pi = [self _getpagefromid:_id];
 //BA.debugLineNum = 158;BA.debugLine="If pi = GetTopPage Then Return";
if ([_pi isEqual:[self _gettoppage]]) { 
if (true) return @"";};
 //BA.debugLineNum = 159;BA.debugLine="CreatePageIfNeeded(pi)";
[self _createpageifneeded:_pi];
 //BA.debugLineNum = 160;BA.debugLine="TopPageDisappear";
[self _toppagedisappear];
 //BA.debugLineNum = 167;BA.debugLine="If mStackOfPageIds.Contains(pi.Id) Then";
if ([self->__mstackofpageids _contains /*BOOL*/ :(NSObject*)(_pi->_Id /*NSString**/ )]) { 
 //BA.debugLineNum = 168;BA.debugLine="Dim index As Int = mStackOfPageIds.AsList.IndexO";
_index = [[self->__mstackofpageids _aslist /*B4IList**/ ] IndexOf:(NSObject*)(_pi->_Id /*NSString**/ )];
 //BA.debugLineNum = 169;BA.debugLine="For i = mStackOfPageIds.Size - 1 To index + 1 St";
{
const int step7 = -1;
const int limit7 = (int) (_index+1);
_i = (int) ([self->__mstackofpageids _getsize /*int*/ ]-1) ;
for (;_i >= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 170;BA.debugLine="mStackOfPageIds.Remove(mStackOfPageIds.AsList.G";
[self->__mstackofpageids _remove /*NSString**/ :[[self->__mstackofpageids _aslist /*B4IList**/ ] Get:_i]];
 }
};
 };
 //BA.debugLineNum = 174;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
[self->__mstackofpageids _remove /*NSString**/ :(NSObject*)(_pi->_Id /*NSString**/ )];
 //BA.debugLineNum = 175;BA.debugLine="ShowPageImpl(pi)";
[self _showpageimpl:_pi];
 //BA.debugLineNum = 176;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
[self->__mstackofpageids _add /*NSString**/ :(NSObject*)(_pi->_Id /*NSString**/ )];
 //BA.debugLineNum = 177;BA.debugLine="TopPageAppear";
[self _toppageappear];
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _showpageandremovepreviouspages:(NSString*) _id{
_b4xpageinfo* _pi = nil;
 //BA.debugLineNum = 180;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
 //BA.debugLineNum = 181;BA.debugLine="If GetTopPage = Null Then";
if ([self _gettoppage]== nil) { 
 //BA.debugLineNum = 182;BA.debugLine="ShowPage(Id)";
[self _showpage:_id];
 //BA.debugLineNum = 183;BA.debugLine="Return";
if (true) return @"";
 };
 //BA.debugLineNum = 185;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
_pi = [self _getpagefromid:_id];
 //BA.debugLineNum = 186;BA.debugLine="CreatePageIfNeeded(pi)";
[self _createpageifneeded:_pi];
 //BA.debugLineNum = 187;BA.debugLine="TopPageDisappear";
[self _toppagedisappear];
 //BA.debugLineNum = 189;BA.debugLine="mMainForm.SetPagesStack(Array(pi.Parent.NativeTyp";
[self->__mmainform SetPagesStack:[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)((_pi->_Parent /*_b4xpageparent**/ ->_NativeType /*B4IPage**/ ).object)]]]]];
 //BA.debugLineNum = 201;BA.debugLine="mStackOfPageIds.Clear";
[self->__mstackofpageids _clear /*NSString**/ ];
 //BA.debugLineNum = 202;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
[self->__mstackofpageids _add /*NSString**/ :(NSObject*)(_pi->_Id /*NSString**/ )];
 //BA.debugLineNum = 203;BA.debugLine="If xui.IsB4A Or xui.IsB4J Then";
if ([self->__xui IsB4A] || [self->__xui IsB4J]) { 
 //BA.debugLineNum = 204;BA.debugLine="ShowPageImpl(pi)";
[self _showpageimpl:_pi];
 };
 //BA.debugLineNum = 206;BA.debugLine="TopPageAppear";
[self _toppageappear];
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _showpageimpl:(_b4xpageinfo*) _pi{
 //BA.debugLineNum = 330;BA.debugLine="Private Sub ShowPageImpl (pi As B4XPageInfo)";
 //BA.debugLineNum = 345;BA.debugLine="mMainForm.ShowPage2(pi.Parent.NativeType, Transit";
[self->__mmainform ShowPage2:(UIViewController*)((_pi->_Parent /*_b4xpageparent**/ ->_NativeType /*B4IPage**/ ).object) :self->__transitionanimationduration>0];
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _toppageappear{
_b4xpageinfo* _pi = nil;
 //BA.debugLineNum = 285;BA.debugLine="Private Sub TopPageAppear";
 //BA.debugLineNum = 286;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = [self _gettoppage];
 //BA.debugLineNum = 287;BA.debugLine="If pi = Null Then Return";
if (_pi== nil) { 
if (true) return @"";};
 //BA.debugLineNum = 288;BA.debugLine="pi.Parent.NativeType.Title = pi.Title";
[_pi->_Parent /*_b4xpageparent**/ ->_NativeType /*B4IPage**/  setTitle:[self.bi ObjectToString:_pi->_Title /*NSObject**/ ]];
 //BA.debugLineNum = 289;BA.debugLine="If Not(xui.IsB4i) Then";
if ((!([self->__xui IsB4i]))) { 
 //BA.debugLineNum = 290;BA.debugLine="If IsForeground Then";
if (self->__isforeground) { 
 //BA.debugLineNum = 291;BA.debugLine="RaiseEvent(pi, \"B4XPage_Appear\", Null)";
[self _raiseevent:_pi :@"B4XPage_Appear" :(B4IArray*)(nil)];
 };
 };
 //BA.debugLineNum = 300;BA.debugLine="UpdateStackString";
[self _updatestackstring];
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _toppagedisappear{
_b4xpageinfo* _pi = nil;
 //BA.debugLineNum = 274;BA.debugLine="Private Sub TopPageDisappear";
 //BA.debugLineNum = 275;BA.debugLine="If xui.IsB4J Then Return";
if ([self->__xui IsB4J]) { 
if (true) return @"";};
 //BA.debugLineNum = 276;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = [self _gettoppage];
 //BA.debugLineNum = 277;BA.debugLine="If pi = Null Then Return";
if (_pi== nil) { 
if (true) return @"";};
 //BA.debugLineNum = 278;BA.debugLine="If Not(xui.IsB4i) Then";
if ((!([self->__xui IsB4i]))) { 
 //BA.debugLineNum = 279;BA.debugLine="If IsForeground Then";
if (self->__isforeground) { 
 //BA.debugLineNum = 280;BA.debugLine="RaiseEventWithResult(pi, \"B4XPage_Disappear\", N";
[self _raiseeventwithresult:_pi :@"B4XPage_Disappear" :(B4IArray*)(nil)];
 };
 };
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _updatestackstring{
B4IStringBuilder* _sb = nil;
NSString* _id = @"";
 //BA.debugLineNum = 644;BA.debugLine="Public Sub UpdateStackString";
 //BA.debugLineNum = 645;BA.debugLine="Dim sb As StringBuilder";
_sb = [B4IStringBuilder new];
 //BA.debugLineNum = 646;BA.debugLine="sb.Initialize";
[_sb Initialize];
 //BA.debugLineNum = 647;BA.debugLine="sb.Append(\"[\")";
[_sb Append:@"["];
 //BA.debugLineNum = 648;BA.debugLine="If mStackOfPageIds.Size > 0 Then";
if ([self->__mstackofpageids _getsize /*int*/ ]>0) { 
 //BA.debugLineNum = 649;BA.debugLine="For Each id As String In mStackOfPageIds.AsList";
{
const id<B4IIterable> group5 = [self->__mstackofpageids _aslist /*B4IList**/ ];
const int groupLen5 = group5.Size
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_id = [self.bi ObjectToString:[group5 Get:index5]];
 //BA.debugLineNum = 650;BA.debugLine="sb.Append(id).Append(\", \")";
[[_sb Append:_id] Append:@", "];
 }
};
 //BA.debugLineNum = 652;BA.debugLine="sb.Remove(sb.Length - 2, sb.Length)";
[_sb Remove:(int) ([_sb Length]-2) :[_sb Length]];
 };
 //BA.debugLineNum = 654;BA.debugLine="sb.Append(\"]\")";
[_sb Append:@"]"];
 //BA.debugLineNum = 655;BA.debugLine="StackString = sb.ToString";
self->__stackstring = [_sb ToString];
 //BA.debugLineNum = 656;BA.debugLine="End Sub";
return @"";
}
@end
