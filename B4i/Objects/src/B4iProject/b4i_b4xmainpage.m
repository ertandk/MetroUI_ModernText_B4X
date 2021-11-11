
#import "b4i_b4xmainpage.h"
#import "b4i_main.h"
#import "b4i_metroui_moderntext.h"
#import "b4i_b4xpages.h"
#import "b4i_b4xbitset.h"
#import "b4i_b4xbytesbuilder.h"
#import "b4i_b4xcollections.h"
#import "b4i_b4xorderedmap.h"
#import "b4i_b4xset.h"
#import "b4i_b4xpagesdelegator.h"
#import "b4i_b4xpagesmanager.h"


@implementation b4i_b4xmainpage 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xmainpage) instance released.");
}

- (NSString*)  _b4xpage_created:(b4i_b4xmainpage*) __ref :(B4XViewWrapper*) _root1{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xmainpage";
if ([B4IDebug shouldDelegate: @"b4xpage_created"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"b4xpage_created:" :@[[B4I nilToNSNull:_root1]]]);}
B4IRDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
B4IRDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="Root = Root1";
__ref->__root /*B4XViewWrapper**/  = _root1;
B4IRDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="Root.LoadLayout(\"MainPage\")";
[__ref->__root /*B4XViewWrapper**/  LoadLayout:@"MainPage" :self.bi];
B4IRDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _button1_click:(b4i_b4xmainpage*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xmainpage";
if ([B4IDebug shouldDelegate: @"button1_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"button1_click" :nil]);}
BOOL _hatavar = false;
B4IRDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Private Sub Button1_Click";
B4IRDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Dim Hatavar As Boolean";
_hatavar = false;
B4IRDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Hatavar=Text_Kontrol(Name_Text,\"Please fill in th";
_hatavar = [__ref _text_kontrol /*BOOL*/ :nil :__ref->__name_text /*b4i_metroui_moderntext**/  :@"Please fill in the Name !" :_hatavar];
B4IRDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="Hatavar=Text_Kontrol(Surname_Text,\"Please fill in";
_hatavar = [__ref _text_kontrol /*BOOL*/ :nil :__ref->__surname_text /*b4i_metroui_moderntext**/  :@"Please fill in the Surname !" :_hatavar];
B4IRDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Hatavar=Text_Kontrol(Email_Text,\"Please fill in t";
_hatavar = [__ref _text_kontrol /*BOOL*/ :nil :__ref->__email_text /*b4i_metroui_moderntext**/  :@"Please fill in the E-Mail !" :_hatavar];
B4IRDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _text_kontrol:(b4i_b4xmainpage*) __ref :(b4i_metroui_moderntext*) _textbox :(NSString*) _hatamesajı :(BOOL) _hatavar{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xmainpage";
if ([B4IDebug shouldDelegate: @"text_kontrol"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"text_kontrol:::" :@[[B4I nilToNSNull:_textbox],[B4I nilToNSNull:_hatamesajı],@(_hatavar)]]).boolValue;}
B4IRDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Text_Kontrol (TextBox As MetroUI_ModernText,Ha";
B4IRDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="If TextBox.Text=\"\" Then";
if ([[_textbox _gettext /*NSString**/ :nil] isEqual:@""]) { 
B4IRDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="TextBox.ShowError(HataMesajı)";
[_textbox _showerror /*NSString**/ :nil :_hatamesajı];
B4IRDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="Return True";
if (true) return true;
 };
B4IRDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="If HataMesajı <> \"\" Then";
if ([_hatamesajı isEqual:@""] == false) { 
B4IRDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="If TextBox.Text = \"\" Then";
if ([[_textbox _gettext /*NSString**/ :nil] isEqual:@""]) { 
B4IRDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="TextBox.ShowError(HataMesajı)";
[_textbox _showerror /*NSString**/ :nil :_hatamesajı];
B4IRDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="Return True";
if (true) return true;
 };
 };
B4IRDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="If HataVar = True Then ' Bunu Şunun İçin Yaptık B";
if (_hatavar==true) { 
B4IRDebugUtils.currentLine=524302;
 //BA.debugLineNum = 524302;BA.debugLine="Return True";
if (true) return true;
 };
B4IRDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="Return False";
if (true) return false;
B4IRDebugUtils.currentLine=524305;
 //BA.debugLineNum = 524305;BA.debugLine="End Sub";
return false;
}
- (NSString*)  _class_globals:(b4i_b4xmainpage*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
B4IRDebugUtils.currentModule=@"b4xmainpage";
B4IRDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Private Root As B4XView";
self->__root = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="Private xui As XUI";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="Private Name_Text As MetroUI_ModernText";
self->__name_text = [b4i_metroui_moderntext new];
B4IRDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="Private Surname_Text As MetroUI_ModernText";
self->__surname_text = [b4i_metroui_moderntext new];
B4IRDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="Private Email_Text As MetroUI_ModernText";
self->__email_text = [b4i_metroui_moderntext new];
B4IRDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize:(b4i_b4xmainpage*) __ref :(B4I*) _ba{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xmainpage";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:" :@[[B4I nilToNSNull:_ba]]]);}
B4IRDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Public Sub Initialize";
B4IRDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="End Sub";
return @"";
}
@end