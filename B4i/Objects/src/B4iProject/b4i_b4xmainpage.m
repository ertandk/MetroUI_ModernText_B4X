
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
    return [B4I alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xmainpage) instance released.");
}
- (NSString*)  _b4xpage_created:(B4XViewWrapper*) _root1{
 //BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 21;BA.debugLine="Root = Root1";
self->__root = _root1;
 //BA.debugLineNum = 22;BA.debugLine="Root.LoadLayout(\"MainPage\")";
[self->__root LoadLayout:@"MainPage" :self.bi];
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _button1_click{
BOOL _hatavar = false;
 //BA.debugLineNum = 27;BA.debugLine="Private Sub Button1_Click";
 //BA.debugLineNum = 28;BA.debugLine="Dim Hatavar As Boolean";
_hatavar = false;
 //BA.debugLineNum = 29;BA.debugLine="Hatavar=Text_Kontrol(Name_Text,\"Please fill in th";
_hatavar = [self _text_kontrol:self->__name_text :@"Please fill in the Name !" :_hatavar];
 //BA.debugLineNum = 30;BA.debugLine="Hatavar=Text_Kontrol(Surname_Text,\"Please fill in";
_hatavar = [self _text_kontrol:self->__surname_text :@"Please fill in the Surname !" :_hatavar];
 //BA.debugLineNum = 31;BA.debugLine="Hatavar=Text_Kontrol(Email_Text,\"Please fill in t";
_hatavar = [self _text_kontrol:self->__email_text :@"Please fill in the E-Mail !" :_hatavar];
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals{
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private Root As B4XView";
self->__root = [B4XViewWrapper new];
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
self->__xui = [B4IXUI new];
 //BA.debugLineNum = 10;BA.debugLine="Private Name_Text As MetroUI_ModernText";
self->__name_text = [b4i_metroui_moderntext new];
 //BA.debugLineNum = 11;BA.debugLine="Private Surname_Text As MetroUI_ModernText";
self->__surname_text = [b4i_metroui_moderntext new];
 //BA.debugLineNum = 12;BA.debugLine="Private Email_Text As MetroUI_ModernText";
self->__email_text = [b4i_metroui_moderntext new];
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize:(B4I*) _ba{
[self initializeClassModule];
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _text_kontrol:(b4i_metroui_moderntext*) _textbox :(NSString*) _hatamesajı :(BOOL) _hatavar{
 //BA.debugLineNum = 34;BA.debugLine="Sub Text_Kontrol (TextBox As MetroUI_ModernText,Ha";
 //BA.debugLineNum = 35;BA.debugLine="If TextBox.Text=\"\" Then";
if ([[_textbox _gettext /*NSString**/ ] isEqual:@""]) { 
 //BA.debugLineNum = 36;BA.debugLine="TextBox.ShowError(HataMesajı)";
[_textbox _showerror /*NSString**/ :_hatamesajı];
 //BA.debugLineNum = 37;BA.debugLine="Return True";
if (true) return true;
 };
 //BA.debugLineNum = 40;BA.debugLine="If HataMesajı <> \"\" Then";
if ([_hatamesajı isEqual:@""] == false) { 
 //BA.debugLineNum = 41;BA.debugLine="If TextBox.Text = \"\" Then";
if ([[_textbox _gettext /*NSString**/ ] isEqual:@""]) { 
 //BA.debugLineNum = 42;BA.debugLine="TextBox.ShowError(HataMesajı)";
[_textbox _showerror /*NSString**/ :_hatamesajı];
 //BA.debugLineNum = 43;BA.debugLine="Return True";
if (true) return true;
 };
 };
 //BA.debugLineNum = 47;BA.debugLine="If HataVar = True Then ' Bunu Şunun İçin Yaptık B";
if (_hatavar==true) { 
 //BA.debugLineNum = 48;BA.debugLine="Return True";
if (true) return true;
 };
 //BA.debugLineNum = 50;BA.debugLine="Return False";
if (true) return false;
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return false;
}
@end
