
#import "b4i_b4xpages.h"
#import "b4i_main.h"
#import "b4i_b4xmainpage.h"
#import "b4i_metroui_moderntext.h"
#import "b4i_b4xbitset.h"
#import "b4i_b4xbytesbuilder.h"
#import "b4i_b4xcollections.h"
#import "b4i_b4xorderedmap.h"
#import "b4i_b4xset.h"
#import "b4i_b4xpagesdelegator.h"
#import "b4i_b4xpagesmanager.h"


@implementation b4i_b4xpages 


+ (instancetype)new {
    static b4i_b4xpages* shared = nil;
    if (shared == nil) {
        shared = [self alloc];
        shared.bi = [[B4I alloc] init:shared];
        shared.__c = [B4ICommon new];
    }
    return shared;
}

- (NSString*)  _addpage:(NSString*) _id :(NSObject*) _b4xpage{
 //BA.debugLineNum = 37;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
 //BA.debugLineNum = 38;BA.debugLine="GetManager.AddPage(Id, B4XPage)";
[[self _getmanager] _addpage /*NSString**/ :_id :_b4xpage];
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _addpageandcreate:(NSString*) _id :(NSObject*) _b4xpage{
 //BA.debugLineNum = 42;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
 //BA.debugLineNum = 43;BA.debugLine="GetManager.AddPageAndCreate(Id, B4XPage)";
[[self _getmanager] _addpageandcreate /*NSString**/ :_id :_b4xpage];
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _closepage:(NSObject*) _b4xpage{
 //BA.debugLineNum = 62;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
 //BA.debugLineNum = 63;BA.debugLine="GetManager.ClosePage (B4XPage)";
[[self _getmanager] _closepage /*NSString**/ :_b4xpage];
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return @"";
}
- (b4i_b4xpagesmanager*)  _getmanager{
 //BA.debugLineNum = 14;BA.debugLine="Public Sub GetManager As B4XPagesManager";
 //BA.debugLineNum = 15;BA.debugLine="Return mPM";
if (true) return (b4i_b4xpagesmanager*)(self->__mpm);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return nil;
}
- (B4IPage*)  _getnativeparent:(NSObject*) _b4xpage{
 //BA.debugLineNum = 85;BA.debugLine="Public Sub GetNativeParent (B4XPage As Object) As";
 //BA.debugLineNum = 87;BA.debugLine="Return GetManager.FindPIFromB4XPage(B4XPage).Pare";
if (true) return [[self _getmanager] _findpifromb4xpage /*_b4xpageinfo**/ :_b4xpage]->_Parent /*_b4xpageparent**/ ->_NativeType /*B4IPage**/ ;
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return nil;
}
- (NSObject*)  _getpage:(NSString*) _id{
 //BA.debugLineNum = 27;BA.debugLine="Public Sub GetPage (Id As String) As Object";
 //BA.debugLineNum = 28;BA.debugLine="Return GetManager.GetPage(Id)";
if (true) return [[self _getmanager] _getpage /*NSObject**/ :_id];
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _getpageid:(NSObject*) _b4xpage{
 //BA.debugLineNum = 32;BA.debugLine="Public Sub GetPageId (B4XPage As Object) As String";
 //BA.debugLineNum = 33;BA.debugLine="Return GetManager.FindPIFromB4XPage(B4XPage).Id";
if (true) return [[self _getmanager] _findpifromb4xpage /*_b4xpageinfo**/ :_b4xpage]->_Id /*NSString**/ ;
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _internalsetpagesmanager:(NSObject*) _pm{
 //BA.debugLineNum = 19;BA.debugLine="Public Sub InternalSetPagesManager(PM As Object)";
 //BA.debugLineNum = 20;BA.debugLine="Delegate.Initialize";
[self->__delegate _initialize /*NSString**/ :self.bi];
 //BA.debugLineNum = 21;BA.debugLine="mPM = PM";
self->__mpm = _pm;
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _isinitialized{
 //BA.debugLineNum = 9;BA.debugLine="Public Sub IsInitialized As Boolean";
 //BA.debugLineNum = 10;BA.debugLine="Return mPM Is B4XPagesManager";
if (true) return [self->__mpm isKindOfClass: [b4i_b4xpagesmanager class]];
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return false;
}
- (b4i_b4xmainpage*)  _mainpage{
 //BA.debugLineNum = 73;BA.debugLine="Public Sub MainPage As B4XMainPage";
 //BA.debugLineNum = 74;BA.debugLine="Return GetManager.MainPage";
if (true) return [self _getmanager]->__mainpage /*b4i_b4xmainpage**/ ;
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _process_globals{
self->__main=[b4i_main new];
self->__b4xcollections=[b4i_b4xcollections new];
 //BA.debugLineNum = 1;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private mPM As Object";
self->__mpm = [NSObject new];
 //BA.debugLineNum = 3;BA.debugLine="Public Delegate As B4XPagesDelegator";
self->__delegate = [b4i_b4xpagesdelegator new];
 //BA.debugLineNum = 4;BA.debugLine="Public GlobalContext As Object";
self->__globalcontext = [NSObject new];
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _settitle:(NSObject*) _b4xpage :(NSObject*) _title{
 //BA.debugLineNum = 68;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
 //BA.debugLineNum = 69;BA.debugLine="GetManager.SetTitle(B4XPage, Title)";
[[self _getmanager] _settitle /*NSString**/ :_b4xpage :_title];
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _showpage:(NSString*) _id{
 //BA.debugLineNum = 50;BA.debugLine="Public Sub ShowPage (Id As String)";
 //BA.debugLineNum = 51;BA.debugLine="GetManager.ShowPage(Id)";
[[self _getmanager] _showpage /*NSString**/ :_id];
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _showpageandremovepreviouspages:(NSString*) _id{
 //BA.debugLineNum = 56;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
 //BA.debugLineNum = 57;BA.debugLine="GetManager.ShowPageAndRemovePreviousPages (Id)";
[[self _getmanager] _showpageandremovepreviouspages /*NSString**/ :_id];
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return @"";
}
@end
