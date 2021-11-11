
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
#import "b4i_b4xpagesmanager.h"


@implementation b4i_main 


+ (instancetype)new {
    static b4i_main* shared = nil;
    if (shared == nil) {
        shared = [self alloc];
        shared.bi = [[B4IShellBI alloc] init:shared];
        shared.__c = [B4ICommon new];
    }
    return shared;
}
- (int)debugAppId {
    return 14;
}


- (NSString*)  _application_background{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"application_background"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"application_background" :nil]);}
B4IRDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Private Sub Application_Background";
B4IRDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="B4XPages.Delegate.Activity_Pause";
[self->__b4xpages->__delegate /*b4i_b4xpagesdelegator**/  _activity_pause /*NSString**/ :nil];
B4IRDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _application_foreground{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"application_foreground"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"application_foreground" :nil]);}
B4IRDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Private Sub Application_Foreground";
B4IRDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="B4XPages.Delegate.Activity_Resume";
[self->__b4xpages->__delegate /*b4i_b4xpagesdelegator**/  _activity_resume /*NSString**/ :nil];
B4IRDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _application_start:(B4INavigationControllerWrapper*) _nav{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"application_start"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"application_start:" :@[[B4I nilToNSNull:_nav]]]);}
b4i_b4xpagesmanager* _pagesmanager = nil;
B4IRDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Private Sub Application_Start (Nav As NavigationCo";
B4IRDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="NavControl = Nav";
self->__navcontrol = _nav;
B4IRDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="Dim PagesManager As B4XPagesManager";
_pagesmanager = [b4i_b4xpagesmanager new];
B4IRDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="PagesManager.Initialize(NavControl)";
[_pagesmanager _initialize /*NSString**/ :nil :self.bi :self->__navcontrol];
B4IRDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="End Sub";
return @"";
}

- (void)initializeStaticModules {
    [[b4i_main new]initializeModule];
[[b4i_b4xpages new]initializeModule];
[[b4i_b4xcollections new]initializeModule];

}
- (NSString*)  _process_globals{
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"process_globals"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);}
B4IRDebugUtils.currentLine=0;
 //BA.debugLineNum = 0;BA.debugLine="Sub Process_Globals";
B4IRDebugUtils.currentLine=1;
 //BA.debugLineNum = 1;BA.debugLine="Public App As Application";
self->__app = [B4IApplicationWrapper new];
B4IRDebugUtils.currentLine=2;
 //BA.debugLineNum = 2;BA.debugLine="Public NavControl As NavigationController";
self->__navcontrol = [B4INavigationControllerWrapper new];
B4IRDebugUtils.currentLine=4;
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return @"";
}
@end