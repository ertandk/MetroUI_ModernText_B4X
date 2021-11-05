
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
        shared.bi = [[B4I alloc] init:shared];
        shared.__c = [B4ICommon new];
    }
    return shared;
}

- (NSString*)  _application_background{
 //BA.debugLineNum = 30;BA.debugLine="Private Sub Application_Background";
 //BA.debugLineNum = 31;BA.debugLine="B4XPages.Delegate.Activity_Pause";
[self->__b4xpages->__delegate /*b4i_b4xpagesdelegator**/  _activity_pause /*NSString**/ ];
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _application_foreground{
 //BA.debugLineNum = 34;BA.debugLine="Private Sub Application_Foreground";
 //BA.debugLineNum = 35;BA.debugLine="B4XPages.Delegate.Activity_Resume";
[self->__b4xpages->__delegate /*b4i_b4xpagesdelegator**/  _activity_resume /*NSString**/ ];
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _application_start:(B4INavigationControllerWrapper*) _nav{
[self initializeStaticModules];
b4i_b4xpagesmanager* _pagesmanager = nil;
 //BA.debugLineNum = 22;BA.debugLine="Private Sub Application_Start (Nav As NavigationCo";
 //BA.debugLineNum = 23;BA.debugLine="NavControl = Nav";
self->__navcontrol = _nav;
 //BA.debugLineNum = 24;BA.debugLine="Dim PagesManager As B4XPagesManager";
_pagesmanager = [b4i_b4xpagesmanager new];
 //BA.debugLineNum = 25;BA.debugLine="PagesManager.Initialize(NavControl)";
[_pagesmanager _initialize /*NSString**/ :self.bi :self->__navcontrol];
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 16;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 17;BA.debugLine="Public App As Application";
self->__app = [B4IApplicationWrapper new];
 //BA.debugLineNum = 18;BA.debugLine="Public NavControl As NavigationController";
self->__navcontrol = [B4INavigationControllerWrapper new];
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return @"";
}
@end
