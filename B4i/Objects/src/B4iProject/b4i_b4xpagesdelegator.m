
#import "b4i_b4xpagesdelegator.h"
#import "b4i_main.h"
#import "b4i_b4xmainpage.h"
#import "b4i_metroui_moderntext.h"
#import "b4i_b4xpages.h"
#import "b4i_b4xbitset.h"
#import "b4i_b4xbytesbuilder.h"
#import "b4i_b4xcollections.h"
#import "b4i_b4xorderedmap.h"
#import "b4i_b4xset.h"
#import "b4i_b4xpagesmanager.h"


@implementation b4i_b4xpagesdelegator 


+ (B4I*)createBI {
    return [B4I alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xpagesdelegator) instance released.");
}
- (NSString*)  _activity_pause{
 //BA.debugLineNum = 52;BA.debugLine="Public Sub Activity_Pause";
 //BA.debugLineNum = 53;BA.debugLine="B4XPages.GetManager.Activity_Pause";
[[self->__b4xpages _getmanager /*b4i_b4xpagesmanager**/ ] _activity_pause /*NSString**/ ];
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _activity_resume{
 //BA.debugLineNum = 48;BA.debugLine="Public Sub Activity_Resume";
 //BA.debugLineNum = 49;BA.debugLine="B4XPages.GetManager.Activity_Resume";
[[self->__b4xpages _getmanager /*b4i_b4xpagesmanager**/ ] _activity_resume /*NSString**/ ];
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals{
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize:(B4I*) _ba{
[self initializeClassModule];
 //BA.debugLineNum = 4;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _mainform_resize:(double) _width :(double) _height{
 //BA.debugLineNum = 44;BA.debugLine="Public Sub MainForm_Resize(Width As Double, Height";
 //BA.debugLineNum = 45;BA.debugLine="B4XPages.GetManager.MainForm_Resize(Width, Height";
[[self->__b4xpages _getmanager /*b4i_b4xpagesmanager**/ ] _mainform_resize /*NSString**/ :_width :_height];
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return @"";
}
@end
