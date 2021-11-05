
#import "b4i_metroui_moderntext.h"
#import "b4i_main.h"
#import "b4i_b4xmainpage.h"
#import "b4i_b4xpages.h"
#import "b4i_b4xbitset.h"
#import "b4i_b4xbytesbuilder.h"
#import "b4i_b4xcollections.h"
#import "b4i_b4xorderedmap.h"
#import "b4i_b4xset.h"
#import "b4i_b4xpagesdelegator.h"
#import "b4i_b4xpagesmanager.h"


@implementation b4i_metroui_moderntext 


+ (B4I*)createBI {
    return [B4I alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_metroui_moderntext) instance released.");
}
- (NSString*)  _base_resize:(double) _width :(double) _height{
 //BA.debugLineNum = 231;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals{
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
 //BA.debugLineNum = 11;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private mEventName As String 'ignore";
self->__meventname = @"";
 //BA.debugLineNum = 13;BA.debugLine="Private mCallBack As Object 'ignore";
self->__mcallback = [NSObject new];
 //BA.debugLineNum = 14;BA.debugLine="Public mBase As B4XView";
self->__mbase = [B4XViewWrapper new];
 //BA.debugLineNum = 15;BA.debugLine="Private xui As XUI 'ignore";
self->__xui = [B4IXUI new];
 //BA.debugLineNum = 16;BA.debugLine="Public Tag As Object";
self->__tag = [NSObject new];
 //BA.debugLineNum = 18;BA.debugLine="Dim img As ImageView";
self->__img = [B4IImageViewWrapper new];
 //BA.debugLineNum = 22;BA.debugLine="Dim MyPanel As Panel";
self->__mypanel = [B4IPanelWrapper new];
 //BA.debugLineNum = 23;BA.debugLine="Dim MyTextboxB4X As B4XView";
self->__mytextboxb4x = [B4XViewWrapper new];
 //BA.debugLineNum = 26;BA.debugLine="Dim iconCircleB4X As B4XView";
self->__iconcircleb4x = [B4XViewWrapper new];
 //BA.debugLineNum = 27;BA.debugLine="Dim iconCircle As Label";
self->__iconcircle = [B4ILabelWrapper new];
 //BA.debugLineNum = 28;BA.debugLine="Private MyHintLabel As B4XView";
self->__myhintlabel = [B4XViewWrapper new];
 //BA.debugLineNum = 29;BA.debugLine="Private MyHLabel As Label 'MyHintLabel Buna Eşitl";
self->__myhlabel = [B4ILabelWrapper new];
 //BA.debugLineNum = 31;BA.debugLine="Private MyErrorLabelB4X As B4XView";
self->__myerrorlabelb4x = [B4XViewWrapper new];
 //BA.debugLineNum = 32;BA.debugLine="Private MyErrorLabel As Label 'MyHintLabel Buna E";
self->__myerrorlabel = [B4ILabelWrapper new];
 //BA.debugLineNum = 34;BA.debugLine="Private ilkAcilis As Boolean=True";
self->__ilkacilis = true;
 //BA.debugLineNum = 35;BA.debugLine="Private NormalHintArkaPlanUzunlugu As Double";
self->__normalhintarkaplanuzunlugu = 0.0;
 //BA.debugLineNum = 42;BA.debugLine="Dim MyTextbox As TextField";
self->__mytextbox = [B4ITextFieldWrapper new];
 //BA.debugLineNum = 43;BA.debugLine="Private svg As SVG";
self->__svg = [iSVG new];
 //BA.debugLineNum = 48;BA.debugLine="Dim MyPanelRadiusProperty As Int";
self->__mypanelradiusproperty = 0;
 //BA.debugLineNum = 49;BA.debugLine="Dim MyPanelBackgroundColorProperty As String";
self->__mypanelbackgroundcolorproperty = @"";
 //BA.debugLineNum = 50;BA.debugLine="Dim CircleColorProperty As Int";
self->__circlecolorproperty = 0;
 //BA.debugLineNum = 51;BA.debugLine="Dim iconCircleSizeProperty As Int";
self->__iconcirclesizeproperty = 0;
 //BA.debugLineNum = 52;BA.debugLine="Dim iconCircleColorProperty As String";
self->__iconcirclecolorproperty = @"";
 //BA.debugLineNum = 53;BA.debugLine="Dim HintNameProperty As String";
self->__hintnameproperty = @"";
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _clearerror{
 //BA.debugLineNum = 226;BA.debugLine="Public Sub ClearError";
 //BA.debugLineNum = 227;BA.debugLine="MyErrorLabel.Visible=False";
[self->__myerrorlabel setVisible:false];
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _designercreateview:(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props{
int _hintyukseklik = 0;
B4XFont* _iconfont = nil;
 //BA.debugLineNum = 87;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
 //BA.debugLineNum = 88;BA.debugLine="mBase = Base";
self->__mbase = (B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)(_base)];
 //BA.debugLineNum = 89;BA.debugLine="Tag = mBase.Tag";
self->__tag = [self->__mbase Tag];
 //BA.debugLineNum = 90;BA.debugLine="mBase.Tag = Me";
[self->__mbase setTag:self];
 //BA.debugLineNum = 94;BA.debugLine="Dim HintYukseklik As Int=DipToCurrent(MyHintLabel";
_hintyukseklik = ((int) ([self->__myhintlabel TextSize]/(double)0.77));
 //BA.debugLineNum = 96;BA.debugLine="MyPanelRadiusProperty = Props.Get(\"MyPanelRadius\"";
self->__mypanelradiusproperty = [self.bi ObjectToNumber:[_props Get:(NSObject*)(@"MyPanelRadius")]].intValue;
 //BA.debugLineNum = 97;BA.debugLine="MyPanelBackgroundColorProperty = Props.Get(\"MyPan";
self->__mypanelbackgroundcolorproperty = [self.bi ObjectToString:[_props Get:(NSObject*)(@"MyPanelBackgroundColor")]];
 //BA.debugLineNum = 98;BA.debugLine="CircleColorProperty = Props.Get(\"CircleColor\")";
self->__circlecolorproperty = [self.bi ObjectToNumber:[_props Get:(NSObject*)(@"CircleColor")]].intValue;
 //BA.debugLineNum = 99;BA.debugLine="iconCircleSizeProperty = Props.Get(\"iconCircleSiz";
self->__iconcirclesizeproperty = [self.bi ObjectToNumber:[_props Get:(NSObject*)(@"iconCircleSize")]].intValue;
 //BA.debugLineNum = 100;BA.debugLine="iconCircleColorProperty = Props.Get(\"iconCircleCo";
self->__iconcirclecolorproperty = [self.bi ObjectToString:[_props Get:(NSObject*)(@"iconCircleColor")]];
 //BA.debugLineNum = 101;BA.debugLine="HintNameProperty = Props.Get(\"HintText\")";
self->__hintnameproperty = [self.bi ObjectToString:[_props Get:(NSObject*)(@"HintText")]];
 //BA.debugLineNum = 113;BA.debugLine="MyPanel.SetBorder(0,xui.Color_White,MyPanelRadius";
[self->__mypanel SetBorder:(float) (0) :[self->__xui Color_White] :(float) (self->__mypanelradiusproperty)];
 //BA.debugLineNum = 114;BA.debugLine="MyPanel.Color=xui.Color_White";
[self->__mypanel setColor:[self->__xui Color_White]];
 //BA.debugLineNum = 118;BA.debugLine="mBase.AddView(MyPanel,0,0,mBase.Width,mBase.Heigh";
[self->__mbase AddView:(UIView*)((self->__mypanel).object) :(float) (0) :(float) (0) :[self->__mbase Width] :(float) ([self->__mbase Height]-((int) (2)))];
 //BA.debugLineNum = 123;BA.debugLine="MyPanel.AddView(MyTextboxB4X,65dip,0,mBase.Width-";
[self->__mypanel AddView:(UIView*)((self->__mytextboxb4x).object) :(float) (((int) (65))) :(float) (0) :(float) ([self->__mbase Width]-((int) (70))) :[self->__mypanel Height]];
 //BA.debugLineNum = 124;BA.debugLine="MyPanel.AddView(img,0,0,MyTextboxB4X.left-5dip  ,";
[self->__mypanel AddView:(UIView*)((self->__img).object) :(float) (0) :(float) (0) :(float) ([self->__mytextboxb4x Left]-((int) (5))) :(float) ([self->__mbase Height]-((int) (2)))];
 //BA.debugLineNum = 129;BA.debugLine="MyPanel.AddView(iconCircle,img.Left-5dip,img.Top,";
[self->__mypanel AddView:(UIView*)((self->__iconcircle).object) :(float) ([self->__img Left]-((int) (5))) :[self->__img Top] :[self->__img Width] :[self->__img Height]];
 //BA.debugLineNum = 131;BA.debugLine="MyTextboxB4X.Color=Colors.Transparent";
[self->__mytextboxb4x setColor:[[self->___c Colors] Transparent]];
 //BA.debugLineNum = 163;BA.debugLine="svg.Initialize(File.DirAssets,\"icon.svg\")";
[self->__svg Initialize:[[self->___c File] DirAssets] :@"icon.svg"];
 //BA.debugLineNum = 165;BA.debugLine="img.Bitmap=svg.Export(img.Width,img.Height)";
[self->__img setBitmap:[self->__svg Export:[self->__img Width] :[self->__img Height]]];
 //BA.debugLineNum = 167;BA.debugLine="Log(File.ReadString(File.DirAssets,\"icon.svg\"))";
[self->___c LogImpl:@"5720976" :[[self->___c File] ReadString:[[self->___c File] DirAssets] :@"icon.svg"] :0];
 //BA.debugLineNum = 173;BA.debugLine="Dim IconFont As B4XFont";
_iconfont = [B4XFont new];
 //BA.debugLineNum = 178;BA.debugLine="IconFont = xui.CreateFont(Font.CreateFontAwesome(";
_iconfont = [self->__xui CreateFont:(UIFont*)(([[self->___c Font] CreateFontAwesome:(float) (self->__iconcirclesizeproperty)]).object) :(float) (self->__iconcirclesizeproperty)];
 //BA.debugLineNum = 185;BA.debugLine="iconCircleB4X.SetTextAlignment(\"CENTER\",\"CENTER\")";
[self->__iconcircleb4x SetTextAlignment:@"CENTER" :@"CENTER"];
 //BA.debugLineNum = 186;BA.debugLine="iconCircleB4X.TextColor=iconCircleColorProperty";
[self->__iconcircleb4x setTextColor:[self.bi ObjectToNumber:self->__iconcirclecolorproperty].intValue];
 //BA.debugLineNum = 187;BA.debugLine="iconCircleB4X.TextSize=iconCircleSizeProperty";
[self->__iconcircleb4x setTextSize:(float) (self->__iconcirclesizeproperty)];
 //BA.debugLineNum = 189;BA.debugLine="iconCircleB4X.Font=IconFont";
[self->__iconcircleb4x setFont:_iconfont];
 //BA.debugLineNum = 190;BA.debugLine="iconCircleB4X.Text=\"\"";
[self->__iconcircleb4x setText:@""];
 //BA.debugLineNum = 192;BA.debugLine="MyHintLabel.Text=HintNameProperty";
[self->__myhintlabel setText:self->__hintnameproperty];
 //BA.debugLineNum = 193;BA.debugLine="NormalHintArkaPlanUzunlugu=UzunlukHesapla(HintNam";
self->__normalhintarkaplanuzunlugu = [self _uzunlukhesapla:self->__hintnameproperty];
 //BA.debugLineNum = 194;BA.debugLine="MyPanel.AddView(MyHintLabel, MyTextboxB4X.Left +";
[self->__mypanel AddView:(UIView*)((self->__myhintlabel).object) :(float) ([self->__mytextboxb4x Left]+((int) (4))) :(float) ([self->__mypanel Height]/(double)2-((int) (11))) :(float) (self->__normalhintarkaplanuzunlugu) :(float) (_hintyukseklik)];
 //BA.debugLineNum = 196;BA.debugLine="MyPanel.AddView(MyErrorLabel,MyTextboxB4X.Left +";
[self->__mypanel AddView:(UIView*)((self->__myerrorlabel).object) :(float) ([self->__mytextboxb4x Left]+((int) (4))) :(float) ([self->__mypanel Height]-((int) (18))) :[self->__mypanel Width] :(float) (((int) (20)))];
 //BA.debugLineNum = 197;BA.debugLine="MyErrorLabel.Visible=False";
[self->__myerrorlabel setVisible:false];
 //BA.debugLineNum = 200;BA.debugLine="MyErrorLabelB4X.TextColor=xui.Color_Red";
[self->__myerrorlabelb4x setTextColor:[self->__xui Color_Red]];
 //BA.debugLineNum = 201;BA.debugLine="MyErrorLabelB4X.TextSize=11";
[self->__myerrorlabelb4x setTextSize:(float) (11)];
 //BA.debugLineNum = 202;BA.debugLine="MyErrorLabelB4X.Text=\"Lütfen E-Mail Adresinizi Gi";
[self->__myerrorlabelb4x setText:@"Lütfen E-Mail Adresinizi Giriniz!"];
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _gettext{
 //BA.debugLineNum = 254;BA.debugLine="Public Sub getText As String";
 //BA.debugLineNum = 255;BA.debugLine="Return MyTextboxB4X.Text";
if (true) return [self->__mytextboxb4x Text];
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return @"";
}
- (B4XFont*)  _gettextfont{
 //BA.debugLineNum = 262;BA.debugLine="Public Sub getTextFont As B4XFont";
 //BA.debugLineNum = 263;BA.debugLine="Return MyTextboxB4X.Font";
if (true) return [self->__mytextboxb4x Font];
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _initialize:(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname{
[self initializeClassModule];
 //BA.debugLineNum = 58;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 59;BA.debugLine="mEventName = EventName";
self->__meventname = _eventname;
 //BA.debugLineNum = 60;BA.debugLine="mCallBack = Callback";
self->__mcallback = _callback;
 //BA.debugLineNum = 61;BA.debugLine="img.Initialize(\"img\")";
[self->__img Initialize:self.bi :@"img"];
 //BA.debugLineNum = 62;BA.debugLine="MyPanel.Initialize(\"MyPanel\")";
[self->__mypanel Initialize:self.bi :@"MyPanel"];
 //BA.debugLineNum = 64;BA.debugLine="iconCircle.Initialize(\"iconCircle\")";
[self->__iconcircle Initialize:self.bi :@"iconCircle"];
 //BA.debugLineNum = 65;BA.debugLine="MyHLabel.Initialize(\"MyHLabel\")";
[self->__myhlabel Initialize:self.bi :@"MyHLabel"];
 //BA.debugLineNum = 66;BA.debugLine="MyErrorLabel.Initialize(\"MyErrorLabel\")";
[self->__myerrorlabel Initialize:self.bi :@"MyErrorLabel"];
 //BA.debugLineNum = 73;BA.debugLine="MyTextbox.Initialize(\"MyTextbox\")";
[self->__mytextbox Initialize:self.bi :@"MyTextbox"];
 //BA.debugLineNum = 74;BA.debugLine="MyTextbox.BorderStyle=0";
[self->__mytextbox setBorderStyle:(int) (0)];
 //BA.debugLineNum = 78;BA.debugLine="MyTextboxB4X=MyTextbox";
self->__mytextboxb4x = (B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)((self->__mytextbox).object)];
 //BA.debugLineNum = 79;BA.debugLine="iconCircleB4X=iconCircle";
self->__iconcircleb4x = (B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)((self->__iconcircle).object)];
 //BA.debugLineNum = 80;BA.debugLine="MyHintLabel=MyHLabel";
self->__myhintlabel = (B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)((self->__myhlabel).object)];
 //BA.debugLineNum = 81;BA.debugLine="MyErrorLabelB4X=MyErrorLabel";
self->__myerrorlabelb4x = (B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)((self->__myerrorlabel).object)];
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _mytextbox_action{
 //BA.debugLineNum = 329;BA.debugLine="Private Sub MyTextBox_Action";
 //BA.debugLineNum = 330;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_EnterPr";
if ([self->__xui SubExists:self->__mcallback :[@[self->__meventname,@"_EnterPressed"] componentsJoinedByString:@""] :(int) (0)]) { 
[self->___c CallSub:self.bi :self->__mcallback :[@[self->__meventname,@"_EnterPressed"] componentsJoinedByString:@""]];};
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _mytextbox_beginedit{
 //BA.debugLineNum = 266;BA.debugLine="Private Sub MyTextBox_BeginEdit";
 //BA.debugLineNum = 267;BA.debugLine="CallSub2(Me,\"MyTextBox_FocusChanged\",True)";
[self->___c CallSub2:self.bi :self :@"MyTextBox_FocusChanged" :(NSObject*)(@(true))];
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _mytextbox_endedit{
 //BA.debugLineNum = 269;BA.debugLine="Private Sub MyTextBox_EndEdit";
 //BA.debugLineNum = 270;BA.debugLine="CallSub2(Me,\"MyTextBox_FocusChanged\",False)";
[self->___c CallSub2:self.bi :self :@"MyTextBox_FocusChanged" :(NSObject*)(@(false))];
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _mytextbox_enterpressed{
 //BA.debugLineNum = 322;BA.debugLine="private Sub MyTextBox_EnterPressed";
 //BA.debugLineNum = 326;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_EnterPr";
if ([self->__xui SubExists:self->__mcallback :[@[self->__meventname,@"_EnterPressed"] componentsJoinedByString:@""] :(int) (0)]) { 
[self->___c CallSub:self.bi :self->__mcallback :[@[self->__meventname,@"_EnterPressed"] componentsJoinedByString:@""]];};
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _mytextbox_focuschanged:(BOOL) _hasfocus{
 //BA.debugLineNum = 273;BA.debugLine="Private Sub MyTextBox_FocusChanged (HasFocus As Bo";
 //BA.debugLineNum = 274;BA.debugLine="If HasFocus = False Then";
if (_hasfocus==false) { 
 //BA.debugLineNum = 275;BA.debugLine="If MyTextboxB4X.Text.Length=0 Then";
if ([[self->__mytextboxb4x Text] Length]==0) { 
 //BA.debugLineNum = 281;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
[self->__myhintlabel SetLayoutAnimated:(int) (200) :[self->__myhintlabel Left] :(float) ([self->__mypanel Height]/(double)2-((int) (11))) :[self->__myhintlabel Width] :[self->__myhintlabel Height]];
 }else if([[self->__mytextboxb4x Text] Length]>0) { 
 //BA.debugLineNum = 285;BA.debugLine="MyErrorLabel.Visible=False";
[self->__myerrorlabel setVisible:false];
 //BA.debugLineNum = 286;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
[self->__myhintlabel SetLayoutAnimated:(int) (200) :[self->__myhintlabel Left] :(float) ([self->__mytextboxb4x Top]-((int) (2.5))) :[self->__myhintlabel Width] :[self->__myhintlabel Height]];
 };
 }else {
 //BA.debugLineNum = 290;BA.debugLine="If MyTextboxB4X.Text.Length=0 Then";
if ([[self->__mytextboxb4x Text] Length]==0) { 
 //BA.debugLineNum = 292;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
[self->__myhintlabel SetLayoutAnimated:(int) (200) :[self->__myhintlabel Left] :(float) ([self->__mytextboxb4x Top]-((int) (2.5))) :[self->__myhintlabel Width] :[self->__myhintlabel Height]];
 }else {
 };
 };
 //BA.debugLineNum = 302;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
if ([self->__xui SubExists:self->__mcallback :[@[self->__meventname,@"_FocusChanged"] componentsJoinedByString:@""] :(int) (1)]) { 
[self->___c CallSub2:self.bi :self->__mcallback :[@[self->__meventname,@"_FocusChanged"] componentsJoinedByString:@""] :(NSObject*)(@(_hasfocus))];};
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _mytextbox_textchanged:(NSString*) _old :(NSString*) _new{
 //BA.debugLineNum = 306;BA.debugLine="Private Sub MyTextBox_TextChanged (Old As String,";
 //BA.debugLineNum = 308;BA.debugLine="If New.Length>Old.Length Then";
if ([_new Length]>[_old Length]) { 
 //BA.debugLineNum = 309;BA.debugLine="MyErrorLabel.Visible=False";
[self->__myerrorlabel setVisible:false];
 //BA.debugLineNum = 310;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.le";
[self->__myhintlabel SetLayoutAnimated:(int) (200) :[self->__myhintlabel Left] :(float) ([self->__mytextboxb4x Top]-((int) (2.5))) :[self->__myhintlabel Width] :[self->__myhintlabel Height]];
 };
 //BA.debugLineNum = 319;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_TextCha";
if ([self->__xui SubExists:self->__mcallback :[@[self->__meventname,@"_TextChanged"] componentsJoinedByString:@""] :(int) (2)]) { 
[self->___c CallSub3:self.bi :self->__mcallback :[@[self->__meventname,@"_TextChanged"] componentsJoinedByString:@""] :(NSObject*)(_old) :(NSObject*)(_new)];};
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _settext:(NSString*) _text{
 //BA.debugLineNum = 235;BA.debugLine="Public Sub setText(Text As String)";
 //BA.debugLineNum = 236;BA.debugLine="If ilkAcilis=True Then";
if (self->__ilkacilis==true) { 
 //BA.debugLineNum = 238;BA.debugLine="If Text.Length=0 Then";
if ([_text Length]==0) { 
 //BA.debugLineNum = 242;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
[self->__myhintlabel SetLayoutAnimated:(int) (200) :[self->__myhintlabel Left] :(float) ([self->__mytextboxb4x Height]/(double)2.2) :[self->__myhintlabel Width] :[self->__myhintlabel Height]];
 }else {
 //BA.debugLineNum = 245;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
[self->__myhintlabel SetLayoutAnimated:(int) (200) :[self->__myhintlabel Left] :(float) ([self->__mytextboxb4x Top]-((int) (2.5))) :[self->__myhintlabel Width] :[self->__myhintlabel Height]];
 };
 };
 //BA.debugLineNum = 248;BA.debugLine="MyTextboxB4X.Text=Text";
[self->__mytextboxb4x setText:_text];
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _settextfont:(B4XFont*) _fnt{
 //BA.debugLineNum = 258;BA.debugLine="Public Sub setTextFont(Fnt As B4XFont)";
 //BA.debugLineNum = 259;BA.debugLine="MyTextboxB4X.Font=Fnt";
[self->__mytextboxb4x setFont:_fnt];
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _showerror:(NSString*) _errortext{
 //BA.debugLineNum = 221;BA.debugLine="Public Sub ShowError(ErrorText As String)";
 //BA.debugLineNum = 222;BA.debugLine="MyErrorLabel.Visible=True";
[self->__myerrorlabel setVisible:true];
 //BA.debugLineNum = 223;BA.debugLine="MyErrorLabel.Text=ErrorText";
[self->__myerrorlabel setText:_errortext];
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return @"";
}
- (double)  _uzunlukhesapla:(NSString*) _nametext{
B4XViewWrapper* _uzunpanel = nil;
B4XCanvas* _canvas1 = nil;
B4XRect* _rect = nil;
double _sonuc = 0.0;
 //BA.debugLineNum = 208;BA.debugLine="Private Sub UzunlukHesapla (NameText As String) As";
 //BA.debugLineNum = 209;BA.debugLine="Dim UzunPanel As B4XView = xui.CreatePanel(\"\")";
_uzunpanel = [B4XViewWrapper new];
_uzunpanel = [self->__xui CreatePanel:self.bi :@""];
 //BA.debugLineNum = 210;BA.debugLine="UzunPanel.SetLayoutAnimated(0,0,0,MyPanel.Width,M";
[_uzunpanel SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :[self->__mypanel Width] :[self->__mypanel Height]];
 //BA.debugLineNum = 211;BA.debugLine="Dim canvas1 As B4XCanvas";
_canvas1 = [B4XCanvas new];
 //BA.debugLineNum = 212;BA.debugLine="canvas1.Initialize(UzunPanel)";
[_canvas1 Initialize:(UIView*)((_uzunpanel).object)];
 //BA.debugLineNum = 213;BA.debugLine="Dim Rect As B4XRect = canvas1.MeasureText(NameTex";
_rect = [B4XRect new];
_rect = [_canvas1 MeasureText:_nametext :[self->__myhintlabel Font]];
 //BA.debugLineNum = 214;BA.debugLine="Dim Sonuc As Double=(Rect.Width*1.08)";
_sonuc = ([_rect Width]*1.08);
 //BA.debugLineNum = 216;BA.debugLine="Sonuc=Sonuc+3dip";
_sonuc = _sonuc+((int) (3));
 //BA.debugLineNum = 218;BA.debugLine="Return Sonuc";
if (true) return _sonuc;
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return 0.0;
}
@end
