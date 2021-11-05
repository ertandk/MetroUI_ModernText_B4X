
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
        shared.bi = [[B4IShellBI alloc] init:shared];
        shared.__c = [B4ICommon new];
    }
    return shared;
}
- (int)debugAppId {
    return 32;
}


- (NSString*)  _addpage:(NSString*) _id :(NSObject*) _b4xpage{
B4IRDebugUtils.currentModule=@"b4xpages";
if ([B4IDebug shouldDelegate: @"addpage"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"addpage::" :@[[B4I nilToNSNull:_id],[B4I nilToNSNull:_b4xpage]]]);}
B4IRDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
B4IRDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="GetManager.AddPage(Id, B4XPage)";
[[self _getmanager] _addpage /*NSString**/ :nil :_id :_b4xpage];
B4IRDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return @"";
}
- (b4i_b4xpagesmanager*)  _getmanager{
B4IRDebugUtils.currentModule=@"b4xpages";
if ([B4IDebug shouldDelegate: @"getmanager"])
	 {return ((b4i_b4xpagesmanager*) [B4IDebug delegate:self.bi :@"getmanager" :nil]);}
B4IRDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub GetManager As B4XPagesManager";
B4IRDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Return mPM";
if (true) return (b4i_b4xpagesmanager*)(self->__mpm);
B4IRDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _addpageandcreate:(NSString*) _id :(NSObject*) _b4xpage{
B4IRDebugUtils.currentModule=@"b4xpages";
if ([B4IDebug shouldDelegate: @"addpageandcreate"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"addpageandcreate::" :@[[B4I nilToNSNull:_id],[B4I nilToNSNull:_b4xpage]]]);}
B4IRDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
B4IRDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="GetManager.AddPageAndCreate(Id, B4XPage)";
[[self _getmanager] _addpageandcreate /*NSString**/ :nil :_id :_b4xpage];
B4IRDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _closepage:(NSObject*) _b4xpage{
B4IRDebugUtils.currentModule=@"b4xpages";
if ([B4IDebug shouldDelegate: @"closepage"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"closepage:" :@[[B4I nilToNSNull:_b4xpage]]]);}
B4IRDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
B4IRDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="GetManager.ClosePage (B4XPage)";
[[self _getmanager] _closepage /*NSString**/ :nil :_b4xpage];
B4IRDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="End Sub";
return @"";
}
- (B4IPage*)  _getnativeparent:(NSObject*) _b4xpage{
B4IRDebugUtils.currentModule=@"b4xpages";
if ([B4IDebug shouldDelegate: @"getnativeparent"])
	 {return ((B4IPage*) [B4IDebug delegate:self.bi :@"getnativeparent:" :@[[B4I nilToNSNull:_b4xpage]]]);}
B4IRDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub GetNativeParent (B4XPage As Object) As";
B4IRDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Return GetManager.FindPIFromB4XPage(B4XPage).Pare";
if (true) return [[self _getmanager] _findpifromb4xpage /*_b4xpageinfo**/ :nil :_b4xpage]->_Parent /*_b4xpageparent**/ ->_NativeType /*B4IPage**/ ;
B4IRDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="End Sub";
return nil;
}
- (NSObject*)  _getpage:(NSString*) _id{
B4IRDebugUtils.currentModule=@"b4xpages";
if ([B4IDebug shouldDelegate: @"getpage"])
	 {return ((NSObject*) [B4IDebug delegate:self.bi :@"getpage:" :@[[B4I nilToNSNull:_id]]]);}
B4IRDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub GetPage (Id As String) As Object";
B4IRDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Return GetManager.GetPage(Id)";
if (true) return [[self _getmanager] _getpage /*NSObject**/ :nil :_id];
B4IRDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _getpageid:(NSObject*) _b4xpage{
B4IRDebugUtils.currentModule=@"b4xpages";
if ([B4IDebug shouldDelegate: @"getpageid"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"getpageid:" :@[[B4I nilToNSNull:_b4xpage]]]);}
B4IRDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Public Sub GetPageId (B4XPage As Object) As String";
B4IRDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Return GetManager.FindPIFromB4XPage(B4XPage).Id";
if (true) return [[self _getmanager] _findpifromb4xpage /*_b4xpageinfo**/ :nil :_b4xpage]->_Id /*NSString**/ ;
B4IRDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _internalsetpagesmanager:(NSObject*) _pm{
B4IRDebugUtils.currentModule=@"b4xpages";
if ([B4IDebug shouldDelegate: @"internalsetpagesmanager"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"internalsetpagesmanager:" :@[[B4I nilToNSNull:_pm]]]);}
B4IRDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub InternalSetPagesManager(PM As Object)";
B4IRDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Delegate.Initialize";
[self->__delegate _initialize /*NSString**/ :nil :self.bi];
B4IRDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="mPM = PM";
self->__mpm = _pm;
B4IRDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _isinitialized{
B4IRDebugUtils.currentModule=@"b4xpages";
if ([B4IDebug shouldDelegate: @"isinitialized"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"isinitialized" :nil]).boolValue;}
B4IRDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub IsInitialized As Boolean";
B4IRDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Return mPM Is B4XPagesManager";
if (true) return [self->__mpm isKindOfClass: [b4i_b4xpagesmanager class]];
B4IRDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return false;
}
- (b4i_b4xmainpage*)  _mainpage{
B4IRDebugUtils.currentModule=@"b4xpages";
if ([B4IDebug shouldDelegate: @"mainpage"])
	 {return ((b4i_b4xmainpage*) [B4IDebug delegate:self.bi :@"mainpage" :nil]);}
B4IRDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub MainPage As B4XMainPage";
B4IRDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Return GetManager.MainPage";
if (true) return [self _getmanager]->__mainpage /*b4i_b4xmainpage**/ ;
B4IRDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _process_globals{
self->__main=[b4i_main new];
self->__b4xcollections=[b4i_b4xcollections new];
B4IRDebugUtils.currentModule=@"b4xpages";
if ([B4IDebug shouldDelegate: @"process_globals"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);}
B4IRDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub Process_Globals";
B4IRDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Private mPM As Object";
self->__mpm = [NSObject new];
B4IRDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Public Delegate As B4XPagesDelegator";
self->__delegate = [b4i_b4xpagesdelegator new];
B4IRDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Public GlobalContext As Object";
self->__globalcontext = [NSObject new];
B4IRDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _settitle:(NSObject*) _b4xpage :(NSObject*) _title{
B4IRDebugUtils.currentModule=@"b4xpages";
if ([B4IDebug shouldDelegate: @"settitle"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"settitle::" :@[[B4I nilToNSNull:_b4xpage],[B4I nilToNSNull:_title]]]);}
B4IRDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
B4IRDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="GetManager.SetTitle(B4XPage, Title)";
[[self _getmanager] _settitle /*NSString**/ :nil :_b4xpage :_title];
B4IRDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _showpage:(NSString*) _id{
B4IRDebugUtils.currentModule=@"b4xpages";
if ([B4IDebug shouldDelegate: @"showpage"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"showpage:" :@[[B4I nilToNSNull:_id]]]);}
B4IRDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub ShowPage (Id As String)";
B4IRDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="GetManager.ShowPage(Id)";
[[self _getmanager] _showpage /*NSString**/ :nil :_id];
B4IRDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _showpageandremovepreviouspages:(NSString*) _id{
B4IRDebugUtils.currentModule=@"b4xpages";
if ([B4IDebug shouldDelegate: @"showpageandremovepreviouspages"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"showpageandremovepreviouspages:" :@[[B4I nilToNSNull:_id]]]);}
B4IRDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
B4IRDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="GetManager.ShowPageAndRemovePreviousPages (Id)";
[[self _getmanager] _showpageandremovepreviouspages /*NSString**/ :nil :_id];
B4IRDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return @"";
}
@end