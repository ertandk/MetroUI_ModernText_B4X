
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
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xpagesdelegator) instance released.");
}

- (NSString*)  _activity_pause:(b4i_b4xpagesdelegator*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesdelegator";
B4IRDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Public Sub Activity_Pause";
B4IRDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="B4XPages.GetManager.Activity_Pause";
[[self->__b4xpages _getmanager /*b4i_b4xpagesmanager**/ ] _activity_pause /*NSString**/ :nil];
B4IRDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _activity_resume:(b4i_b4xpagesdelegator*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesdelegator";
if ([B4IDebug shouldDelegate: @"activity_resume"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"activity_resume" :nil]);}
B4IRDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Public Sub Activity_Resume";
B4IRDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="B4XPages.GetManager.Activity_Resume";
[[self->__b4xpages _getmanager /*b4i_b4xpagesmanager**/ ] _activity_resume /*NSString**/ :nil];
B4IRDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize:(b4i_b4xpagesdelegator*) __ref :(B4I*) _ba{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xpagesdelegator";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:" :@[[B4I nilToNSNull:_ba]]]);}
B4IRDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Public Sub Initialize";
B4IRDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_b4xpagesdelegator*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
B4IRDebugUtils.currentModule=@"b4xpagesdelegator";
B4IRDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _mainform_resize:(b4i_b4xpagesdelegator*) __ref :(double) _width :(double) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xpagesdelegator";
if ([B4IDebug shouldDelegate: @"mainform_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"mainform_resize::" :@[@(_width),@(_height)]]);}
B4IRDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Public Sub MainForm_Resize(Width As Double, Height";
B4IRDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="B4XPages.GetManager.MainForm_Resize(Width, Height";
[[self->__b4xpages _getmanager /*b4i_b4xpagesmanager**/ ] _mainform_resize /*NSString**/ :nil :_width :_height];
B4IRDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="End Sub";
return @"";
}
@end