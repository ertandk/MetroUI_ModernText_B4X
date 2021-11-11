
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
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xpagesmanager) instance released.");
}

- (NSString*)  _initialize:(b4i_b4xpagesmanager*) __ref :(B4I*) _ba :(B4INavigationControllerWrapper*) _navcontrol{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize::" :@[[B4I nilToNSNull:_ba],[B4I nilToNSNull:_navcontrol]]]);}
BOOL _nonmainpagewasadded = false;
B4IRDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Public Sub Initialize (NavControl As NavigationCon";
B4IRDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="IdToB4XPage.Initialize";
[__ref->__idtob4xpage /*b4i_b4xorderedmap**/  _initialize /*NSString**/ :nil :self.bi];
B4IRDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="RootB4XToPage.Initialize";
[__ref->__rootb4xtopage /*b4i_b4xorderedmap**/  _initialize /*NSString**/ :nil :self.bi];
B4IRDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="mStackOfPageIds.Initialize";
[__ref->__mstackofpageids /*b4i_b4xset**/  _initialize /*NSString**/ :nil :self.bi];
B4IRDebugUtils.currentLine=6225935;
 //BA.debugLineNum = 6225935;BA.debugLine="mMainForm = NavControl";
__ref->__mmainform /*B4INavigationControllerWrapper**/  = _navcontrol;
B4IRDebugUtils.currentLine=6225937;
 //BA.debugLineNum = 6225937;BA.debugLine="B4XPages.InternalSetPagesManager(Me)";
[self->__b4xpages _internalsetpagesmanager /*NSString**/ :self];
B4IRDebugUtils.currentLine=6225938;
 //BA.debugLineNum = 6225938;BA.debugLine="MainPage.Initialize";
[__ref->__mainpage /*b4i_b4xmainpage**/  _initialize /*NSString**/ :nil :self.bi];
B4IRDebugUtils.currentLine=6225939;
 //BA.debugLineNum = 6225939;BA.debugLine="Dim NonMainPageWasAdded As Boolean = IdToB4XPage.";
_nonmainpagewasadded = [__ref->__idtob4xpage /*b4i_b4xorderedmap**/  _getsize /*int*/ :nil]>0;
B4IRDebugUtils.currentLine=6225940;
 //BA.debugLineNum = 6225940;BA.debugLine="IdToB4XPage.Put(\"~~~~~temp~~~~\", CreateB4XPageInf";
[__ref->__idtob4xpage /*b4i_b4xorderedmap**/  _put /*NSString**/ :nil :(NSObject*)(@"~~~~~temp~~~~") :(NSObject*)([__ref _createb4xpageinfo /*_b4xpageinfo**/ :nil :(NSObject*)(__ref->__mainpage /*b4i_b4xmainpage**/ ) :@"" :false :(NSObject*)(@"")])];
B4IRDebugUtils.currentLine=6225941;
 //BA.debugLineNum = 6225941;BA.debugLine="BackgroundStateChanged(True)";
[__ref _backgroundstatechanged /*NSString**/ :nil :true];
B4IRDebugUtils.currentLine=6225942;
 //BA.debugLineNum = 6225942;BA.debugLine="IdToB4XPage.Remove(\"~~~~~temp~~~~\")";
[__ref->__idtob4xpage /*b4i_b4xorderedmap**/  _remove /*NSString**/ :nil :(NSObject*)(@"~~~~~temp~~~~")];
B4IRDebugUtils.currentLine=6225943;
 //BA.debugLineNum = 6225943;BA.debugLine="AddPageAndCreate(\"MainPage\", MainPage)";
[__ref _addpageandcreate /*NSString**/ :nil :@"MainPage" :(NSObject*)(__ref->__mainpage /*b4i_b4xmainpage**/ )];
B4IRDebugUtils.currentLine=6225944;
 //BA.debugLineNum = 6225944;BA.debugLine="If LogEvents = False Then";
if (__ref->__logevents /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=6225945;
 //BA.debugLineNum = 6225945;BA.debugLine="Log(\"Call B4XPages.GetManager.LogEvents = True t";
[self->___c LogImpl:@"96225945" :@"Call B4XPages.GetManager.LogEvents = True to enable logging B4XPages events." :0];
 };
B4IRDebugUtils.currentLine=6225947;
 //BA.debugLineNum = 6225947;BA.debugLine="If NonMainPageWasAdded Then";
if (_nonmainpagewasadded) { 
B4IRDebugUtils.currentLine=6225948;
 //BA.debugLineNum = 6225948;BA.debugLine="If Not(xui.IsB4i) Then";
if ((!([__ref->__xui /*B4IXUI**/  IsB4i]))) { 
B4IRDebugUtils.currentLine=6225949;
 //BA.debugLineNum = 6225949;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
[__ref _raiseevent /*NSString**/ :nil :[__ref _gettoppage /*_b4xpageinfo**/ :nil] :@"B4XPage_Appear" :(B4IArray*)(nil)];
 };
 };
B4IRDebugUtils.currentLine=6225952;
 //BA.debugLineNum = 6225952;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _addpage:(b4i_b4xpagesmanager*) __ref :(NSString*) _id :(NSObject*) _b4xpage{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"addpage"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"addpage::" :@[[B4I nilToNSNull:_id],[B4I nilToNSNull:_b4xpage]]]);}
NSString* _idtolower = @"";
B4IRDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
B4IRDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="Dim IdToLower As String = Id.ToLowerCase";
_idtolower = [_id ToLowerCase];
B4IRDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="If IdToB4XPage.ContainsKey(IdToLower) Then";
if ([__ref->__idtob4xpage /*b4i_b4xorderedmap**/  _containskey /*BOOL*/ :nil :(NSObject*)(_idtolower)]) { 
B4IRDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="Log($\"Page with this id already exists: ${IdToLo";
[self->___c LogImpl:@"96291459" :([@[@"Page with this id already exists: ",[self->___c SmartStringFormatter:@"" :(NSObject*)(_idtolower)],@"!"] componentsJoinedByString:@""]) :0];
B4IRDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=6291462;
 //BA.debugLineNum = 6291462;BA.debugLine="IdToB4XPage.Put(IdToLower, CreateB4XPageInfo(B4XP";
[__ref->__idtob4xpage /*b4i_b4xorderedmap**/  _put /*NSString**/ :nil :(NSObject*)(_idtolower) :(NSObject*)([__ref _createb4xpageinfo /*_b4xpageinfo**/ :nil :_b4xpage :_idtolower :false :(NSObject*)(_id)])];
B4IRDebugUtils.currentLine=6291463;
 //BA.debugLineNum = 6291463;BA.debugLine="If IdToB4XPage.Size = 1 Then ShowPage(IdToLower)";
if ([__ref->__idtob4xpage /*b4i_b4xorderedmap**/  _getsize /*int*/ :nil]==1) { 
[__ref _showpage /*NSString**/ :nil :_idtolower];};
B4IRDebugUtils.currentLine=6291464;
 //BA.debugLineNum = 6291464;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _addpageandcreate:(b4i_b4xpagesmanager*) __ref :(NSString*) _id :(NSObject*) _b4xpage{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"addpageandcreate"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"addpageandcreate::" :@[[B4I nilToNSNull:_id],[B4I nilToNSNull:_b4xpage]]]);}
B4IRDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
B4IRDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="AddPage (Id, B4XPage)";
[__ref _addpage /*NSString**/ :nil :_id :_b4xpage];
B4IRDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="CreatePageIfNeeded(GetPageFromId(Id))";
[__ref _createpageifneeded /*NSString**/ :nil :[__ref _getpagefromid /*_b4xpageinfo**/ :nil :_id]];
B4IRDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _closepage:(b4i_b4xpagesmanager*) __ref :(NSObject*) _b4xpage{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"closepage"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"closepage:" :@[[B4I nilToNSNull:_b4xpage]]]);}
_b4xpageinfo* _pi = nil;
B4IRDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
B4IRDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
_pi = [__ref _findpifromb4xpage /*_b4xpageinfo**/ :nil :_b4xpage];
B4IRDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="If mStackOfPageIds.Contains(pi.Id) = False Then R";
if ([__ref->__mstackofpageids /*b4i_b4xset**/  _contains /*BOOL*/ :nil :(NSObject*)(_pi->_Id /*NSString**/ )]==false) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="If xui.IsB4i And GetTopPage <> pi Then";
if ([__ref->__xui /*B4IXUI**/  IsB4i] && [[__ref _gettoppage /*_b4xpageinfo**/ :nil] isEqual:_pi] == false) { 
B4IRDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="Log(\"Only top page can be closed\")";
[self->___c LogImpl:@"96553604" :@"Only top page can be closed" :0];
B4IRDebugUtils.currentLine=6553605;
 //BA.debugLineNum = 6553605;BA.debugLine="Return";
if (true) return @"";
 }else if([__ref->__xui /*B4IXUI**/  IsB4i] && [__ref->__mstackofpageids /*b4i_b4xset**/  _getsize /*int*/ :nil]==1) { 
B4IRDebugUtils.currentLine=6553607;
 //BA.debugLineNum = 6553607;BA.debugLine="Log(\"First page cannot be closed\")";
[self->___c LogImpl:@"96553607" :@"First page cannot be closed" :0];
B4IRDebugUtils.currentLine=6553608;
 //BA.debugLineNum = 6553608;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=6553610;
 //BA.debugLineNum = 6553610;BA.debugLine="ClosePageImpl(pi)";
[__ref _closepageimpl /*NSString**/ :nil :_pi];
B4IRDebugUtils.currentLine=6553611;
 //BA.debugLineNum = 6553611;BA.debugLine="If GetTopPage = pi Then";
if ([[__ref _gettoppage /*_b4xpageinfo**/ :nil] isEqual:_pi]) { 
B4IRDebugUtils.currentLine=6553612;
 //BA.debugLineNum = 6553612;BA.debugLine="TopPageDisappear";
[__ref _toppagedisappear /*NSString**/ :nil];
 };
B4IRDebugUtils.currentLine=6553614;
 //BA.debugLineNum = 6553614;BA.debugLine="If xui.IsB4A And mStackOfPageIds.Size = 1 Then Re";
if ([__ref->__xui /*B4IXUI**/  IsB4A] && [__ref->__mstackofpageids /*b4i_b4xset**/  _getsize /*int*/ :nil]==1) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=6553615;
 //BA.debugLineNum = 6553615;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
[__ref->__mstackofpageids /*b4i_b4xset**/  _remove /*NSString**/ :nil :(NSObject*)(_pi->_Id /*NSString**/ )];
B4IRDebugUtils.currentLine=6553616;
 //BA.debugLineNum = 6553616;BA.debugLine="If xui.IsB4A Then ShowPageImpl(GetTopPage)";
if ([__ref->__xui /*B4IXUI**/  IsB4A]) { 
[__ref _showpageimpl /*NSString**/ :nil :[__ref _gettoppage /*_b4xpageinfo**/ :nil]];};
B4IRDebugUtils.currentLine=6553617;
 //BA.debugLineNum = 6553617;BA.debugLine="TopPageAppear";
[__ref _toppageappear /*NSString**/ :nil];
B4IRDebugUtils.currentLine=6553618;
 //BA.debugLineNum = 6553618;BA.debugLine="End Sub";
return @"";
}
- (_b4xpageinfo*)  _findpifromb4xpage:(b4i_b4xpagesmanager*) __ref :(NSObject*) _page{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"findpifromb4xpage"])
	 {return ((_b4xpageinfo*) [B4IDebug delegate:self.bi :@"findpifromb4xpage:" :@[[B4I nilToNSNull:_page]]]);}
_b4xpageinfo* _pi = nil;
B4IRDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Public Sub FindPIFromB4XPage (Page As Object) As B";
B4IRDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
{
const id<B4IIterable> group1 = [__ref->__idtob4xpage /*b4i_b4xorderedmap**/  _getvalues /*B4IList**/ :nil];
const int groupLen1 = group1.Size
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_pi = (_b4xpageinfo*)([group1 Get:index1]);
B4IRDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="If pi.B4XPage = Page Then";
if ([_pi->_B4XPage /*NSObject**/  isEqual:_page]) { 
B4IRDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="Return pi";
if (true) return _pi;
 };
 }
};
B4IRDebugUtils.currentLine=7077894;
 //BA.debugLineNum = 7077894;BA.debugLine="Return Null";
if (true) return (_b4xpageinfo*)(nil);
B4IRDebugUtils.currentLine=7077895;
 //BA.debugLineNum = 7077895;BA.debugLine="End Sub";
return nil;
}
- (NSObject*)  _getpage:(b4i_b4xpagesmanager*) __ref :(NSString*) _id{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"getpage"])
	 {return ((NSObject*) [B4IDebug delegate:self.bi :@"getpage:" :@[[B4I nilToNSNull:_id]]]);}
B4IRDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Public Sub GetPage (Id As String) As Object";
B4IRDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="Return GetPageFromId(Id).B4XPage";
if (true) return [__ref _getpagefromid /*_b4xpageinfo**/ :nil :_id]->_B4XPage /*NSObject**/ ;
B4IRDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _settitle:(b4i_b4xpagesmanager*) __ref :(NSObject*) _b4xpage :(NSObject*) _title{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"settitle"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"settitle::" :@[[B4I nilToNSNull:_b4xpage],[B4I nilToNSNull:_title]]]);}
_b4xpageinfo* _pi = nil;
B4IRDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
B4IRDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
_pi = [__ref _findpifromb4xpage /*_b4xpageinfo**/ :nil :_b4xpage];
B4IRDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="pi.Title = Title";
_pi->_Title /*NSObject**/  = _title;
B4IRDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="pi.Parent.NativeType.Title = Title";
[_pi->_Parent /*_b4xpageparent**/ ->_NativeType /*B4IPage**/  setTitle:[self.bi ObjectToString:_title]];
B4IRDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _showpage:(b4i_b4xpagesmanager*) __ref :(NSString*) _id{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"showpage"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"showpage:" :@[[B4I nilToNSNull:_id]]]);}
_b4xpageinfo* _pi = nil;
int _index = 0;
int _i = 0;
B4IRDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Public Sub ShowPage (Id As String)";
B4IRDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
_pi = [__ref _getpagefromid /*_b4xpageinfo**/ :nil :_id];
B4IRDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="If pi = GetTopPage Then Return";
if ([_pi isEqual:[__ref _gettoppage /*_b4xpageinfo**/ :nil]]) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="CreatePageIfNeeded(pi)";
[__ref _createpageifneeded /*NSString**/ :nil :_pi];
B4IRDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="TopPageDisappear";
[__ref _toppagedisappear /*NSString**/ :nil];
B4IRDebugUtils.currentLine=6422539;
 //BA.debugLineNum = 6422539;BA.debugLine="If mStackOfPageIds.Contains(pi.Id) Then";
if ([__ref->__mstackofpageids /*b4i_b4xset**/  _contains /*BOOL*/ :nil :(NSObject*)(_pi->_Id /*NSString**/ )]) { 
B4IRDebugUtils.currentLine=6422540;
 //BA.debugLineNum = 6422540;BA.debugLine="Dim index As Int = mStackOfPageIds.AsList.IndexO";
_index = [[__ref->__mstackofpageids /*b4i_b4xset**/  _aslist /*B4IList**/ :nil] IndexOf:(NSObject*)(_pi->_Id /*NSString**/ )];
B4IRDebugUtils.currentLine=6422541;
 //BA.debugLineNum = 6422541;BA.debugLine="For i = mStackOfPageIds.Size - 1 To index + 1 St";
{
const int step7 = -1;
const int limit7 = (int) (_index+1);
_i = (int) ([__ref->__mstackofpageids /*b4i_b4xset**/  _getsize /*int*/ :nil]-1) ;
for (;_i >= limit7 ;_i = _i + step7 ) {
B4IRDebugUtils.currentLine=6422542;
 //BA.debugLineNum = 6422542;BA.debugLine="mStackOfPageIds.Remove(mStackOfPageIds.AsList.G";
[__ref->__mstackofpageids /*b4i_b4xset**/  _remove /*NSString**/ :nil :[[__ref->__mstackofpageids /*b4i_b4xset**/  _aslist /*B4IList**/ :nil] Get:_i]];
 }
};
 };
B4IRDebugUtils.currentLine=6422546;
 //BA.debugLineNum = 6422546;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
[__ref->__mstackofpageids /*b4i_b4xset**/  _remove /*NSString**/ :nil :(NSObject*)(_pi->_Id /*NSString**/ )];
B4IRDebugUtils.currentLine=6422547;
 //BA.debugLineNum = 6422547;BA.debugLine="ShowPageImpl(pi)";
[__ref _showpageimpl /*NSString**/ :nil :_pi];
B4IRDebugUtils.currentLine=6422548;
 //BA.debugLineNum = 6422548;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
[__ref->__mstackofpageids /*b4i_b4xset**/  _add /*NSString**/ :nil :(NSObject*)(_pi->_Id /*NSString**/ )];
B4IRDebugUtils.currentLine=6422549;
 //BA.debugLineNum = 6422549;BA.debugLine="TopPageAppear";
[__ref _toppageappear /*NSString**/ :nil];
B4IRDebugUtils.currentLine=6422550;
 //BA.debugLineNum = 6422550;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _showpageandremovepreviouspages:(b4i_b4xpagesmanager*) __ref :(NSString*) _id{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"showpageandremovepreviouspages"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"showpageandremovepreviouspages:" :@[[B4I nilToNSNull:_id]]]);}
_b4xpageinfo* _pi = nil;
B4IRDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
B4IRDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="If GetTopPage = Null Then";
if ([__ref _gettoppage /*_b4xpageinfo**/ :nil]== nil) { 
B4IRDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="ShowPage(Id)";
[__ref _showpage /*NSString**/ :nil :_id];
B4IRDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
_pi = [__ref _getpagefromid /*_b4xpageinfo**/ :nil :_id];
B4IRDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="CreatePageIfNeeded(pi)";
[__ref _createpageifneeded /*NSString**/ :nil :_pi];
B4IRDebugUtils.currentLine=6488071;
 //BA.debugLineNum = 6488071;BA.debugLine="TopPageDisappear";
[__ref _toppagedisappear /*NSString**/ :nil];
B4IRDebugUtils.currentLine=6488073;
 //BA.debugLineNum = 6488073;BA.debugLine="mMainForm.SetPagesStack(Array(pi.Parent.NativeTyp";
[__ref->__mmainform /*B4INavigationControllerWrapper**/  SetPagesStack:[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)((_pi->_Parent /*_b4xpageparent**/ ->_NativeType /*B4IPage**/ ).object)]]]]];
B4IRDebugUtils.currentLine=6488085;
 //BA.debugLineNum = 6488085;BA.debugLine="mStackOfPageIds.Clear";
[__ref->__mstackofpageids /*b4i_b4xset**/  _clear /*NSString**/ :nil];
B4IRDebugUtils.currentLine=6488086;
 //BA.debugLineNum = 6488086;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
[__ref->__mstackofpageids /*b4i_b4xset**/  _add /*NSString**/ :nil :(NSObject*)(_pi->_Id /*NSString**/ )];
B4IRDebugUtils.currentLine=6488087;
 //BA.debugLineNum = 6488087;BA.debugLine="If xui.IsB4A Or xui.IsB4J Then";
if ([__ref->__xui /*B4IXUI**/  IsB4A] || [__ref->__xui /*B4IXUI**/  IsB4J]) { 
B4IRDebugUtils.currentLine=6488088;
 //BA.debugLineNum = 6488088;BA.debugLine="ShowPageImpl(pi)";
[__ref _showpageimpl /*NSString**/ :nil :_pi];
 };
B4IRDebugUtils.currentLine=6488090;
 //BA.debugLineNum = 6488090;BA.debugLine="TopPageAppear";
[__ref _toppageappear /*NSString**/ :nil];
B4IRDebugUtils.currentLine=6488091;
 //BA.debugLineNum = 6488091;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _activity_pause:(b4i_b4xpagesmanager*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
B4IRDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Public Sub Activity_Pause";
B4IRDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="RaiseEventWithResult(GetTopPage, \"B4XPage_Disappe";
[__ref _raiseeventwithresult /*NSObject**/ :nil :[__ref _gettoppage /*_b4xpageinfo**/ :nil] :@"B4XPage_Disappear" :(B4IArray*)(nil)];
B4IRDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="BackgroundStateChanged(False)";
[__ref _backgroundstatechanged /*NSString**/ :nil :false];
B4IRDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _activity_resume:(b4i_b4xpagesmanager*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"activity_resume"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"activity_resume" :nil]);}
BOOL _shouldraise = false;
B4IRDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Public Sub Activity_Resume";
B4IRDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Dim ShouldRaise As Boolean = IsForeground = False";
_shouldraise = __ref->__isforeground /*BOOL*/ ==false;
B4IRDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="BackgroundStateChanged(True)";
[__ref _backgroundstatechanged /*NSString**/ :nil :true];
B4IRDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="If ShouldRaise Then";
if (_shouldraise) { 
B4IRDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
[__ref _raiseevent /*NSString**/ :nil :[__ref _gettoppage /*_b4xpageinfo**/ :nil] :@"B4XPage_Appear" :(B4IArray*)(nil)];
 };
B4IRDebugUtils.currentLine=8060934;
 //BA.debugLineNum = 8060934;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _mainform_resize:(b4i_b4xpagesmanager*) __ref :(double) _width :(double) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"mainform_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"mainform_resize::" :@[@(_width),@(_height)]]);}
int _w = 0;
int _h = 0;
B4IRDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Public Sub MainForm_Resize(Width As Double, Height";
B4IRDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="Dim w As Int = Width";
_w = (int) (_width);
B4IRDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="Dim h As Int = Height";
_h = (int) (_height);
B4IRDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="RaiseEvent(GetPageInfoFromRoot(Sender), \"B4XPage_";
[__ref _raiseevent /*NSString**/ :nil :[__ref _getpageinfofromroot /*_b4xpageinfo**/ :nil :(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)([self->___c Sender:self.bi])]] :@"B4XPage_Resize" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@(_w))],[B4I nilToNSNull:(NSObject*)(@(_h))]]]];
B4IRDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="End Sub";
return @"";
}
- (NSObject*)  _raiseeventwithresult:(b4i_b4xpagesmanager*) __ref :(_b4xpageinfo*) _targetpage :(NSString*) _subname :(B4IArray*) _params{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"raiseeventwithresult"])
	 {return ((NSObject*) [B4IDebug delegate:self.bi :@"raiseeventwithresult:::" :@[[B4I nilToNSNull:_targetpage],[B4I nilToNSNull:_subname],[B4I nilToNSNull:_params]]]);}
int _length = 0;
B4IRDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Public Sub RaiseEventWithResult (TargetPage As B4X";
B4IRDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="If TargetPage = Null Then Return Null";
if (_targetpage== nil) { 
if (true) return nil;};
B4IRDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="Dim length As Int";
_length = 0;
B4IRDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
if (_params== nil) { 
_length = (int) (0);}
else {
_length = _params.Length;};
B4IRDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="LogEvent(TargetPage, SubName)";
[__ref _logevent /*NSString**/ :nil :_targetpage :_subname];
B4IRDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
if ([__ref->__xui /*B4IXUI**/  SubExists:_targetpage->_B4XPage /*NSObject**/  :_subname :_length]==false) { 
if (true) return nil;};
B4IRDebugUtils.currentLine=7798790;
 //BA.debugLineNum = 7798790;BA.debugLine="Select length";
switch (_length) {
case 0: {
B4IRDebugUtils.currentLine=7798792;
 //BA.debugLineNum = 7798792;BA.debugLine="Return CallSub(TargetPage.B4XPage, SubName)";
if (true) return [self->___c CallSub:self.bi :_targetpage->_B4XPage /*NSObject**/  :_subname];
 break; }
case 1: {
B4IRDebugUtils.currentLine=7798794;
 //BA.debugLineNum = 7798794;BA.debugLine="Return CallSub2(TargetPage.B4XPage, SubName, Pa";
if (true) return [self->___c CallSub2:self.bi :_targetpage->_B4XPage /*NSObject**/  :_subname :((NSObject*)[_params getObjectFast:(int) (0)])];
 break; }
case 2: {
B4IRDebugUtils.currentLine=7798796;
 //BA.debugLineNum = 7798796;BA.debugLine="Return CallSub3(TargetPage.B4XPage, SubName, Pa";
if (true) return [self->___c CallSub3:self.bi :_targetpage->_B4XPage /*NSObject**/  :_subname :((NSObject*)[_params getObjectFast:(int) (0)]) :((NSObject*)[_params getObjectFast:(int) (1)])];
 break; }
default: {
B4IRDebugUtils.currentLine=7798798;
 //BA.debugLineNum = 7798798;BA.debugLine="Log(\"Too many parameters\")";
[self->___c LogImpl:@"97798798" :@"Too many parameters" :0];
 break; }
}
;
B4IRDebugUtils.currentLine=7798800;
 //BA.debugLineNum = 7798800;BA.debugLine="Return Null";
if (true) return nil;
B4IRDebugUtils.currentLine=7798801;
 //BA.debugLineNum = 7798801;BA.debugLine="End Sub";
return nil;
}
- (_b4xpageinfo*)  _gettoppage:(b4i_b4xpagesmanager*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"gettoppage"])
	 {return ((_b4xpageinfo*) [B4IDebug delegate:self.bi :@"gettoppage" :nil]);}
B4IRDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Public Sub GetTopPage As B4XPageInfo";
B4IRDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="If mStackOfPageIds.Size = 0 Then Return Null";
if ([__ref->__mstackofpageids /*b4i_b4xset**/  _getsize /*int*/ :nil]==0) { 
if (true) return (_b4xpageinfo*)(nil);};
B4IRDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="Return IdToB4XPage.Get(mStackOfPageIds.AsList.Get";
if (true) return (_b4xpageinfo*)([__ref->__idtob4xpage /*b4i_b4xorderedmap**/  _get /*NSObject**/ :nil :[[__ref->__mstackofpageids /*b4i_b4xset**/  _aslist /*B4IList**/ :nil] Get:(int) ([__ref->__mstackofpageids /*b4i_b4xset**/  _getsize /*int*/ :nil]-1)]]);
B4IRDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _backgroundstatechanged:(b4i_b4xpagesmanager*) __ref :(BOOL) _newstate{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"backgroundstatechanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"backgroundstatechanged:" :@[@(_newstate)]]);}
NSString* _ev = @"";
_b4xpageinfo* _pi = nil;
B4IRDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Private Sub BackgroundStateChanged (NewState As Bo";
B4IRDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="If IsForeground = NewState Then Return";
if (__ref->__isforeground /*BOOL*/ ==_newstate) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="IsForeground = NewState";
__ref->__isforeground /*BOOL*/  = _newstate;
B4IRDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="Dim ev As String";
_ev = @"";
B4IRDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="If IsForeground Then ev = \"B4XPage_Foreground\" El";
if (__ref->__isforeground /*BOOL*/ ) { 
_ev = @"B4XPage_Foreground";}
else {
_ev = @"B4XPage_Background";};
B4IRDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
{
const id<B4IIterable> group5 = [__ref->__idtob4xpage /*b4i_b4xorderedmap**/  _getvalues /*B4IList**/ :nil];
const int groupLen5 = group5.Size
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_pi = (_b4xpageinfo*)([group5 Get:index5]);
B4IRDebugUtils.currentLine=8126470;
 //BA.debugLineNum = 8126470;BA.debugLine="If xui.SubExists(pi.B4XPage, ev, 0) Then";
if ([__ref->__xui /*B4IXUI**/  SubExists:_pi->_B4XPage /*NSObject**/  :_ev :(int) (0)]) { 
B4IRDebugUtils.currentLine=8126471;
 //BA.debugLineNum = 8126471;BA.debugLine="LogEvent(pi, ev)";
[__ref _logevent /*NSString**/ :nil :_pi :_ev];
B4IRDebugUtils.currentLine=8126472;
 //BA.debugLineNum = 8126472;BA.debugLine="If IsForeground Then";
if (__ref->__isforeground /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=8126473;
 //BA.debugLineNum = 8126473;BA.debugLine="CallSubDelayed(pi.B4XPage, ev)";
[self->___c CallSubDelayed:self.bi :_pi->_B4XPage /*NSObject**/  :_ev];
 }else {
B4IRDebugUtils.currentLine=8126475;
 //BA.debugLineNum = 8126475;BA.debugLine="CallSub(pi.B4XPage, ev)";
[self->___c CallSub:self.bi :_pi->_B4XPage /*NSObject**/  :_ev];
 };
 };
 }
};
B4IRDebugUtils.currentLine=8126479;
 //BA.debugLineNum = 8126479;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _raiseevent:(b4i_b4xpagesmanager*) __ref :(_b4xpageinfo*) _targetpage :(NSString*) _subname :(B4IArray*) _params{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"raiseevent"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"raiseevent:::" :@[[B4I nilToNSNull:_targetpage],[B4I nilToNSNull:_subname],[B4I nilToNSNull:_params]]]);}
int _length = 0;
B4IRDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Public Sub RaiseEvent (TargetPage As B4XPageInfo,";
B4IRDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="If TargetPage = Null Then Return";
if (_targetpage== nil) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="Dim length As Int";
_length = 0;
B4IRDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
if (_params== nil) { 
_length = (int) (0);}
else {
_length = _params.Length;};
B4IRDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="LogEvent(TargetPage, SubName)";
[__ref _logevent /*NSString**/ :nil :_targetpage :_subname];
B4IRDebugUtils.currentLine=7733253;
 //BA.debugLineNum = 7733253;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
if ([__ref->__xui /*B4IXUI**/  SubExists:_targetpage->_B4XPage /*NSObject**/  :_subname :_length]==false) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="Select length";
switch (_length) {
case 0: {
B4IRDebugUtils.currentLine=7733256;
 //BA.debugLineNum = 7733256;BA.debugLine="CallSubDelayed(TargetPage.B4XPage, SubName)";
[self->___c CallSubDelayed:self.bi :_targetpage->_B4XPage /*NSObject**/  :_subname];
 break; }
case 1: {
B4IRDebugUtils.currentLine=7733258;
 //BA.debugLineNum = 7733258;BA.debugLine="CallSubDelayed2(TargetPage.B4XPage, SubName, Pa";
[self->___c CallSubDelayed2:self.bi :_targetpage->_B4XPage /*NSObject**/  :_subname :((NSObject*)[_params getObjectFast:(int) (0)])];
 break; }
case 2: {
B4IRDebugUtils.currentLine=7733260;
 //BA.debugLineNum = 7733260;BA.debugLine="CallSubDelayed3(TargetPage.B4XPage, SubName, Pa";
[self->___c CallSubDelayed3:self.bi :_targetpage->_B4XPage /*NSObject**/  :_subname :((NSObject*)[_params getObjectFast:(int) (0)]) :((NSObject*)[_params getObjectFast:(int) (1)])];
 break; }
default: {
B4IRDebugUtils.currentLine=7733262;
 //BA.debugLineNum = 7733262;BA.debugLine="Log(\"Too many parameters\")";
[self->___c LogImpl:@"97733262" :@"Too many parameters" :0];
 break; }
}
;
B4IRDebugUtils.currentLine=7733264;
 //BA.debugLineNum = 7733264;BA.debugLine="End Sub";
return @"";
}
- (_b4xpageinfo*)  _createb4xpageinfo:(b4i_b4xpagesmanager*) __ref :(NSObject*) _b4xpage :(NSString*) _id :(BOOL) _created :(NSObject*) _title{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"createb4xpageinfo"])
	 {return ((_b4xpageinfo*) [B4IDebug delegate:self.bi :@"createb4xpageinfo::::" :@[[B4I nilToNSNull:_b4xpage],[B4I nilToNSNull:_id],@(_created),[B4I nilToNSNull:_title]]]);}
_b4xpageinfo* _t1 = nil;
B4IRDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Private Sub CreateB4XPageInfo (B4XPage As Object,";
B4IRDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="Dim t1 As B4XPageInfo";
_t1 = [_b4xpageinfo new];
B4IRDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="t1.Initialize";
[_t1 Initialize];
B4IRDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="t1.B4XPage = B4XPage";
_t1->_B4XPage /*NSObject**/  = _b4xpage;
B4IRDebugUtils.currentLine=7667716;
 //BA.debugLineNum = 7667716;BA.debugLine="t1.Id = Id";
_t1->_Id /*NSString**/  = _id;
B4IRDebugUtils.currentLine=7667717;
 //BA.debugLineNum = 7667717;BA.debugLine="t1.Created = Created";
_t1->_Created /*BOOL*/  = _created;
B4IRDebugUtils.currentLine=7667718;
 //BA.debugLineNum = 7667718;BA.debugLine="t1.Title = Title";
_t1->_Title /*NSObject**/  = _title;
B4IRDebugUtils.currentLine=7667719;
 //BA.debugLineNum = 7667719;BA.debugLine="Return t1";
if (true) return _t1;
B4IRDebugUtils.currentLine=7667720;
 //BA.debugLineNum = 7667720;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _createpageifneeded:(b4i_b4xpagesmanager*) __ref :(_b4xpageinfo*) _pi{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"createpageifneeded"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"createpageifneeded:" :@[[B4I nilToNSNull:_pi]]]);}
B4IRDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Private Sub CreatePageIfNeeded(pi As B4XPageInfo)";
B4IRDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="If pi.Created Then Return";
if (_pi->_Created /*BOOL*/ ) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="pi.IsFirst = IdToB4XPage.Size = 1";
_pi->_IsFirst /*BOOL*/  = [__ref->__idtob4xpage /*b4i_b4xorderedmap**/  _getsize /*int*/ :nil]==1;
B4IRDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="CreatePageImpl (pi)";
[__ref _createpageimpl /*NSString**/ :nil :_pi];
B4IRDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="pi.Created = True";
_pi->_Created /*BOOL*/  = true;
B4IRDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="RootB4XToPage.Put(pi.Root, pi)";
[__ref->__rootb4xtopage /*b4i_b4xorderedmap**/  _put /*NSString**/ :nil :(NSObject*)((_pi->_Root /*B4XViewWrapper**/ ).object) :(NSObject*)(_pi)];
B4IRDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="LogEvent(pi, \"B4XPage_Created\")";
[__ref _logevent /*NSString**/ :nil :_pi :@"B4XPage_Created"];
B4IRDebugUtils.currentLine=7274503;
 //BA.debugLineNum = 7274503;BA.debugLine="CallSub2(pi.B4XPage, \"B4XPage_Created\", pi.root)";
[self->___c CallSubDebug2:self.bi :_pi->_B4XPage /*NSObject**/  :@"B4XPage_Created" :(NSObject*)(_pi->_Root /*B4XViewWrapper**/ )];
B4IRDebugUtils.currentLine=7274505;
 //BA.debugLineNum = 7274505;BA.debugLine="End Sub";
return @"";
}
- (_b4xpageinfo*)  _getpagefromid:(b4i_b4xpagesmanager*) __ref :(NSString*) _id{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"getpagefromid"])
	 {return ((_b4xpageinfo*) [B4IDebug delegate:self.bi :@"getpagefromid:" :@[[B4I nilToNSNull:_id]]]);}
_b4xpageinfo* _pi = nil;
B4IRDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Private Sub GetPageFromId (id As String) As B4XPag";
B4IRDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="Dim pi As B4XPageInfo = IdToB4XPage.Get(id.ToLowe";
_pi = (_b4xpageinfo*)([__ref->__idtob4xpage /*b4i_b4xorderedmap**/  _get /*NSObject**/ :nil :(NSObject*)([_id ToLowerCase])]);
B4IRDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="If pi = Null Then";
if (_pi== nil) { 
B4IRDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="Log(\"Error: page id not found: \" & id)";
[self->___c LogImpl:@"97536643" :[@[@"Error: page id not found: ",_id] componentsJoinedByString:@""] :0];
B4IRDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="Log(\"Ids: \" & IdToB4XPage.Keys) 'ignore";
[self->___c LogImpl:@"97536644" :[@[@"Ids: ",[self.bi ObjectToString:[__ref->__idtob4xpage /*b4i_b4xorderedmap**/  _getkeys /*B4IList**/ :nil]]] componentsJoinedByString:@""] :0];
 };
B4IRDebugUtils.currentLine=7536646;
 //BA.debugLineNum = 7536646;BA.debugLine="Return pi";
if (true) return _pi;
B4IRDebugUtils.currentLine=7536647;
 //BA.debugLineNum = 7536647;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _b4ipage_appear:(b4i_b4xpagesmanager*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"b4ipage_appear"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"b4ipage_appear" :nil]);}
B4IPage* _page = nil;
_b4xpageinfo* _pi = nil;
B4IRDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Private Sub B4iPage_Appear";
B4IRDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="Dim page As Page = Sender";
_page = [B4IPage new];
_page = (B4IPage*) [B4IObjectWrapper createWrapper:[B4IPage new] object:(UIViewController*)([self->___c Sender:self.bi])];
B4IRDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="Dim pi As B4XPageInfo = RootB4XToPage.Get(page.Ro";
_pi = (_b4xpageinfo*)([__ref->__rootb4xtopage /*b4i_b4xorderedmap**/  _get /*NSObject**/ :nil :(NSObject*)(([_page RootPanel]).object)]);
B4IRDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
[__ref->__mstackofpageids /*b4i_b4xset**/  _add /*NSString**/ :nil :(NSObject*)(_pi->_Id /*NSString**/ )];
B4IRDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="UpdateStackString";
[__ref _updatestackstring /*NSString**/ :nil];
B4IRDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="RaiseEvent(pi, \"B4XPage_Appear\", Null)";
[__ref _raiseevent /*NSString**/ :nil :_pi :@"B4XPage_Appear" :(B4IArray*)(nil)];
B4IRDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _updatestackstring:(b4i_b4xpagesmanager*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"updatestackstring"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"updatestackstring" :nil]);}
B4IStringBuilder* _sb = nil;
NSString* _id = @"";
B4IRDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Public Sub UpdateStackString";
B4IRDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="Dim sb As StringBuilder";
_sb = [B4IStringBuilder new];
B4IRDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="sb.Initialize";
[_sb Initialize];
B4IRDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="sb.Append(\"[\")";
[_sb Append:@"["];
B4IRDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="If mStackOfPageIds.Size > 0 Then";
if ([__ref->__mstackofpageids /*b4i_b4xset**/  _getsize /*int*/ :nil]>0) { 
B4IRDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="For Each id As String In mStackOfPageIds.AsList";
{
const id<B4IIterable> group5 = [__ref->__mstackofpageids /*b4i_b4xset**/  _aslist /*B4IList**/ :nil];
const int groupLen5 = group5.Size
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_id = [self.bi ObjectToString:[group5 Get:index5]];
B4IRDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="sb.Append(id).Append(\", \")";
[[_sb Append:_id] Append:@", "];
 }
};
B4IRDebugUtils.currentLine=8323080;
 //BA.debugLineNum = 8323080;BA.debugLine="sb.Remove(sb.Length - 2, sb.Length)";
[_sb Remove:(int) ([_sb Length]-2) :[_sb Length]];
 };
B4IRDebugUtils.currentLine=8323082;
 //BA.debugLineNum = 8323082;BA.debugLine="sb.Append(\"]\")";
[_sb Append:@"]"];
B4IRDebugUtils.currentLine=8323083;
 //BA.debugLineNum = 8323083;BA.debugLine="StackString = sb.ToString";
__ref->__stackstring /*NSString**/  = [_sb ToString];
B4IRDebugUtils.currentLine=8323084;
 //BA.debugLineNum = 8323084;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _b4ipage_barbuttonclick:(b4i_b4xpagesmanager*) __ref :(NSString*) _tag{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"b4ipage_barbuttonclick"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"b4ipage_barbuttonclick:" :@[[B4I nilToNSNull:_tag]]]);}
B4IPage* _page = nil;
B4IRDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Private Sub B4iPage_BarButtonClick (Tag As String)";
B4IRDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Dim page As Page = Sender";
_page = [B4IPage new];
_page = (B4IPage*) [B4IObjectWrapper createWrapper:[B4IPage new] object:(UIViewController*)([self->___c Sender:self.bi])];
B4IRDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="RaiseEvent(GetPageInfoFromRoot(page.RootPanel), \"";
[__ref _raiseevent /*NSString**/ :nil :[__ref _getpageinfofromroot /*_b4xpageinfo**/ :nil :(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)(([_page RootPanel]).object)]] :@"B4XPage_MenuClick" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(_tag)]]]];
B4IRDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="End Sub";
return @"";
}
- (_b4xpageinfo*)  _getpageinfofromroot:(b4i_b4xpagesmanager*) __ref :(B4XViewWrapper*) _root{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"getpageinfofromroot"])
	 {return ((_b4xpageinfo*) [B4IDebug delegate:self.bi :@"getpageinfofromroot:" :@[[B4I nilToNSNull:_root]]]);}
B4IRDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Public Sub GetPageInfoFromRoot (Root As B4XView) A";
B4IRDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="Return RootB4XToPage.Get(Root)";
if (true) return (_b4xpageinfo*)([__ref->__rootb4xtopage /*b4i_b4xorderedmap**/  _get /*NSObject**/ :nil :(NSObject*)((_root).object)]);
B4IRDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _b4ipage_disappear:(b4i_b4xpagesmanager*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"b4ipage_disappear"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"b4ipage_disappear" :nil]);}
B4IPage* _page = nil;
_b4xpageinfo* _pi = nil;
B4IRDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Private Sub B4iPage_Disappear";
B4IRDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Dim page As Page = Sender";
_page = [B4IPage new];
_page = (B4IPage*) [B4IObjectWrapper createWrapper:[B4IPage new] object:(UIViewController*)([self->___c Sender:self.bi])];
B4IRDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="Dim pi As B4XPageInfo = RootB4XToPage.Get(page.Ro";
_pi = (_b4xpageinfo*)([__ref->__rootb4xtopage /*b4i_b4xorderedmap**/  _get /*NSObject**/ :nil :(NSObject*)(([_page RootPanel]).object)]);
B4IRDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="RaiseEvent(pi, \"B4XPage_Disappear\", Null)";
[__ref _raiseevent /*NSString**/ :nil :_pi :@"B4XPage_Disappear" :(B4IArray*)(nil)];
B4IRDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="If GetTopPage = pi Then";
if ([[__ref _gettoppage /*_b4xpageinfo**/ :nil] isEqual:_pi]) { 
B4IRDebugUtils.currentLine=6684677;
 //BA.debugLineNum = 6684677;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
[__ref->__mstackofpageids /*b4i_b4xset**/  _remove /*NSString**/ :nil :(NSObject*)(_pi->_Id /*NSString**/ )];
 };
B4IRDebugUtils.currentLine=6684679;
 //BA.debugLineNum = 6684679;BA.debugLine="UpdateStackString";
[__ref _updatestackstring /*NSString**/ :nil];
B4IRDebugUtils.currentLine=6684680;
 //BA.debugLineNum = 6684680;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _b4ipage_keyboardstatechanged:(b4i_b4xpagesmanager*) __ref :(float) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"b4ipage_keyboardstatechanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"b4ipage_keyboardstatechanged:" :@[@(_height)]]);}
B4IPage* _page = nil;
_b4xpageinfo* _pi = nil;
B4IRDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Private Sub B4iPage_KeyboardStateChanged (Height A";
B4IRDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Dim page As Page";
_page = [B4IPage new];
B4IRDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="If (Sender Is Page) = False Then";
if (([[self->___c Sender:self.bi] isKindOfClass: [UIViewController class]])==false) { 
B4IRDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = [__ref _gettoppage /*_b4xpageinfo**/ :nil];
B4IRDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="If pi <> Null Then";
if (_pi!= nil) { 
B4IRDebugUtils.currentLine=6815749;
 //BA.debugLineNum = 6815749;BA.debugLine="page = pi.Parent.NativeType";
_page = _pi->_Parent /*_b4xpageparent**/ ->_NativeType /*B4IPage**/ ;
 };
 }else {
B4IRDebugUtils.currentLine=6815752;
 //BA.debugLineNum = 6815752;BA.debugLine="page = Sender";
_page = (B4IPage*) [B4IObjectWrapper createWrapper:[B4IPage new] object:(UIViewController*)([self->___c Sender:self.bi])];
 };
B4IRDebugUtils.currentLine=6815754;
 //BA.debugLineNum = 6815754;BA.debugLine="If page.IsInitialized Then";
if ([_page IsInitialized]) { 
B4IRDebugUtils.currentLine=6815755;
 //BA.debugLineNum = 6815755;BA.debugLine="RaiseEvent(GetPageInfoFromRoot(page.RootPanel),";
[__ref _raiseevent /*NSString**/ :nil :[__ref _getpageinfofromroot /*_b4xpageinfo**/ :nil :(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)(([_page RootPanel]).object)]] :@"B4XPage_KeyboardStateChanged" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@(_height))]]]];
 };
B4IRDebugUtils.currentLine=6815757;
 //BA.debugLineNum = 6815757;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _b4ipage_resize:(b4i_b4xpagesmanager*) __ref :(float) _width :(float) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"b4ipage_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"b4ipage_resize::" :@[@(_width),@(_height)]]);}
B4IRDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Private Sub B4iPage_Resize (Width As Float, Height";
B4IRDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="RaiseEvent(GetPageInfoFromRoot(Sender), \"B4XPage_";
[__ref _raiseevent /*NSString**/ :nil :[__ref _getpageinfofromroot /*_b4xpageinfo**/ :nil :(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)([self->___c Sender:self.bi])]] :@"B4XPage_Resize" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@(_width))],[B4I nilToNSNull:(NSObject*)(@(_height))]]]];
B4IRDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _logevent:(b4i_b4xpagesmanager*) __ref :(_b4xpageinfo*) _pi :(NSString*) _ev{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"logevent"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"logevent::" :@[[B4I nilToNSNull:_pi],[B4I nilToNSNull:_ev]]]);}
NSString* _msg = @"";
B4IRDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Private Sub LogEvent (pi As B4XPageInfo, ev As Str";
B4IRDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="If LogEvents Then";
if (__ref->__logevents /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="Dim msg As String = $\"*** ${pi.Id}: ${ev} ${Stac";
_msg = ([@[@"*** ",[self->___c SmartStringFormatter:@"" :(NSObject*)(_pi->_Id /*NSString**/ )],@": ",[self->___c SmartStringFormatter:@"" :(NSObject*)(_ev)],@" ",[self->___c SmartStringFormatter:@"" :(NSObject*)(__ref->__stackstring /*NSString**/ )],@""] componentsJoinedByString:@""]);
B4IRDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="Log(msg)";
[self->___c LogImpl:@"98257539" :_msg :0];
 };
B4IRDebugUtils.currentLine=8257541;
 //BA.debugLineNum = 8257541;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_b4xpagesmanager*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
B4IRDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="Private IdToB4XPage As B4XOrderedMap";
self->__idtob4xpage = [b4i_b4xorderedmap new];
B4IRDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="Private RootB4XToPage As B4XOrderedMap";
self->__rootb4xtopage = [b4i_b4xorderedmap new];
B4IRDebugUtils.currentLine=6160394;
 //BA.debugLineNum = 6160394;BA.debugLine="Type B4XPageParent (NativeType As Page)";
;
B4IRDebugUtils.currentLine=6160396;
 //BA.debugLineNum = 6160396;BA.debugLine="Type B4XPageInfo (B4XPage As Object, Id As String";
;
B4IRDebugUtils.currentLine=6160400;
 //BA.debugLineNum = 6160400;BA.debugLine="Public mStackOfPageIds As B4XSet";
self->__mstackofpageids = [b4i_b4xset new];
B4IRDebugUtils.currentLine=6160401;
 //BA.debugLineNum = 6160401;BA.debugLine="Private xui As XUI 'ignore";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=6160409;
 //BA.debugLineNum = 6160409;BA.debugLine="Private mMainForm As NavigationController";
self->__mmainform = [B4INavigationControllerWrapper new];
B4IRDebugUtils.currentLine=6160411;
 //BA.debugLineNum = 6160411;BA.debugLine="Public IsForeground As Boolean";
self->__isforeground = false;
B4IRDebugUtils.currentLine=6160412;
 //BA.debugLineNum = 6160412;BA.debugLine="Public TransitionAnimationDuration As Int = 100";
self->__transitionanimationduration = (int) (100);
B4IRDebugUtils.currentLine=6160413;
 //BA.debugLineNum = 6160413;BA.debugLine="Public MainPage As B4XMainPage";
self->__mainpage = [b4i_b4xmainpage new];
B4IRDebugUtils.currentLine=6160414;
 //BA.debugLineNum = 6160414;BA.debugLine="Private StackString As String";
self->__stackstring = @"";
B4IRDebugUtils.currentLine=6160415;
 //BA.debugLineNum = 6160415;BA.debugLine="Public LogEvents As Boolean = False";
self->__logevents = false;
B4IRDebugUtils.currentLine=6160416;
 //BA.debugLineNum = 6160416;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _closepageimpl:(b4i_b4xpagesmanager*) __ref :(_b4xpageinfo*) _pi{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"closepageimpl"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"closepageimpl:" :@[[B4I nilToNSNull:_pi]]]);}
B4IRDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Private Sub ClosePageImpl (pi As B4XPageInfo) 'ign";
B4IRDebugUtils.currentLine=7143438;
 //BA.debugLineNum = 7143438;BA.debugLine="mMainForm.RemoveCurrentPage2(TransitionAnimationD";
[__ref->__mmainform /*B4INavigationControllerWrapper**/  RemoveCurrentPage2:__ref->__transitionanimationduration /*int*/ >0];
B4IRDebugUtils.currentLine=7143440;
 //BA.debugLineNum = 7143440;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _toppagedisappear:(b4i_b4xpagesmanager*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"toppagedisappear"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"toppagedisappear" :nil]);}
_b4xpageinfo* _pi = nil;
B4IRDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Private Sub TopPageDisappear";
B4IRDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="If xui.IsB4J Then Return";
if ([__ref->__xui /*B4IXUI**/  IsB4J]) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = [__ref _gettoppage /*_b4xpageinfo**/ :nil];
B4IRDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="If pi = Null Then Return";
if (_pi== nil) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=6946820;
 //BA.debugLineNum = 6946820;BA.debugLine="If Not(xui.IsB4i) Then";
if ((!([__ref->__xui /*B4IXUI**/  IsB4i]))) { 
B4IRDebugUtils.currentLine=6946821;
 //BA.debugLineNum = 6946821;BA.debugLine="If IsForeground Then";
if (__ref->__isforeground /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=6946822;
 //BA.debugLineNum = 6946822;BA.debugLine="RaiseEventWithResult(pi, \"B4XPage_Disappear\", N";
[__ref _raiseeventwithresult /*NSObject**/ :nil :_pi :@"B4XPage_Disappear" :(B4IArray*)(nil)];
 };
 };
B4IRDebugUtils.currentLine=6946825;
 //BA.debugLineNum = 6946825;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _showpageimpl:(b4i_b4xpagesmanager*) __ref :(_b4xpageinfo*) _pi{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"showpageimpl"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"showpageimpl:" :@[[B4I nilToNSNull:_pi]]]);}
B4IRDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Private Sub ShowPageImpl (pi As B4XPageInfo)";
B4IRDebugUtils.currentLine=7208975;
 //BA.debugLineNum = 7208975;BA.debugLine="mMainForm.ShowPage2(pi.Parent.NativeType, Transit";
[__ref->__mmainform /*B4INavigationControllerWrapper**/  ShowPage2:(UIViewController*)((_pi->_Parent /*_b4xpageparent**/ ->_NativeType /*B4IPage**/ ).object) :__ref->__transitionanimationduration /*int*/ >0];
B4IRDebugUtils.currentLine=7208977;
 //BA.debugLineNum = 7208977;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _toppageappear:(b4i_b4xpagesmanager*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"toppageappear"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"toppageappear" :nil]);}
_b4xpageinfo* _pi = nil;
B4IRDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Private Sub TopPageAppear";
B4IRDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = [__ref _gettoppage /*_b4xpageinfo**/ :nil];
B4IRDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="If pi = Null Then Return";
if (_pi== nil) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="pi.Parent.NativeType.Title = pi.Title";
[_pi->_Parent /*_b4xpageparent**/ ->_NativeType /*B4IPage**/  setTitle:[self.bi ObjectToString:_pi->_Title /*NSObject**/ ]];
B4IRDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="If Not(xui.IsB4i) Then";
if ((!([__ref->__xui /*B4IXUI**/  IsB4i]))) { 
B4IRDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="If IsForeground Then";
if (__ref->__isforeground /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=7012358;
 //BA.debugLineNum = 7012358;BA.debugLine="RaiseEvent(pi, \"B4XPage_Appear\", Null)";
[__ref _raiseevent /*NSString**/ :nil :_pi :@"B4XPage_Appear" :(B4IArray*)(nil)];
 };
 };
B4IRDebugUtils.currentLine=7012367;
 //BA.debugLineNum = 7012367;BA.debugLine="UpdateStackString";
[__ref _updatestackstring /*NSString**/ :nil];
B4IRDebugUtils.currentLine=7012368;
 //BA.debugLineNum = 7012368;BA.debugLine="End Sub";
return @"";
}
- (_b4xpageparent*)  _createb4xpageparent:(b4i_b4xpagesmanager*) __ref :(B4IPage*) _nativetype{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"createb4xpageparent"])
	 {return ((_b4xpageparent*) [B4IDebug delegate:self.bi :@"createb4xpageparent:" :@[[B4I nilToNSNull:_nativetype]]]);}
_b4xpageparent* _t1 = nil;
B4IRDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Private Sub CreateB4XPageParent (NativeType As Pag";
B4IRDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="Dim t1 As B4XPageParent";
_t1 = [_b4xpageparent new];
B4IRDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="t1.Initialize";
[_t1 Initialize];
B4IRDebugUtils.currentLine=7995396;
 //BA.debugLineNum = 7995396;BA.debugLine="t1.NativeType = NativeType";
_t1->_NativeType /*B4IPage**/  = _nativetype;
B4IRDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="Return t1";
if (true) return _t1;
B4IRDebugUtils.currentLine=7995398;
 //BA.debugLineNum = 7995398;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _createpageimpl:(b4i_b4xpagesmanager*) __ref :(_b4xpageinfo*) _pi{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesmanager";
if ([B4IDebug shouldDelegate: @"createpageimpl"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"createpageimpl:" :@[[B4I nilToNSNull:_pi]]]);}
B4IPage* _page = nil;
B4IRDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Private Sub CreatePageImpl (pi As B4XPageInfo)";
B4IRDebugUtils.currentLine=7405585;
 //BA.debugLineNum = 7405585;BA.debugLine="Dim page As Page";
_page = [B4IPage new];
B4IRDebugUtils.currentLine=7405586;
 //BA.debugLineNum = 7405586;BA.debugLine="page.Initialize(\"B4iPage\")";
[_page Initialize:self.bi :@"B4iPage"];
B4IRDebugUtils.currentLine=7405587;
 //BA.debugLineNum = 7405587;BA.debugLine="pi.Parent = CreateB4XPageParent(page)";
_pi->_Parent /*_b4xpageparent**/  = [__ref _createb4xpageparent /*_b4xpageparent**/ :nil :_page];
B4IRDebugUtils.currentLine=7405588;
 //BA.debugLineNum = 7405588;BA.debugLine="pi.Root = pi.Parent.NativeType.RootPanel";
_pi->_Root /*B4XViewWrapper**/  = (B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)(([_pi->_Parent /*_b4xpageparent**/ ->_NativeType /*B4IPage**/  RootPanel]).object)];
B4IRDebugUtils.currentLine=7405589;
 //BA.debugLineNum = 7405589;BA.debugLine="pi.Parent.NativeType.Title = pi.Title";
[_pi->_Parent /*_b4xpageparent**/ ->_NativeType /*B4IPage**/  setTitle:[self.bi ObjectToString:_pi->_Title /*NSObject**/ ]];
B4IRDebugUtils.currentLine=7405591;
 //BA.debugLineNum = 7405591;BA.debugLine="End Sub";
return @"";
}
@end