
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
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_metroui_moderntext) instance released.");
}

- (NSString*)  _gettext:(b4i_metroui_moderntext*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"metroui_moderntext";
if ([B4IDebug shouldDelegate: @"gettext"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"gettext" :nil]);}
B4IRDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub getText As String";
B4IRDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Return MyTextboxB4X.Text";
if (true) return [__ref->__mytextboxb4x /*B4XViewWrapper**/  Text];
B4IRDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _showerror:(b4i_metroui_moderntext*) __ref :(NSString*) _errortext{
__ref = self;
B4IRDebugUtils.currentModule=@"metroui_moderntext";
if ([B4IDebug shouldDelegate: @"showerror"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"showerror:" :@[[B4I nilToNSNull:_errortext]]]);}
B4IRDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub ShowError(ErrorText As String)";
B4IRDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="MyErrorLabel.Visible=True";
[__ref->__myerrorlabel /*B4ILabelWrapper**/  setVisible:true];
B4IRDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="MyErrorLabel.Text=ErrorText";
[__ref->__myerrorlabel /*B4ILabelWrapper**/  setText:_errortext];
B4IRDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _base_resize:(b4i_metroui_moderntext*) __ref :(double) _width :(double) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"metroui_moderntext";
if ([B4IDebug shouldDelegate: @"base_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"base_resize::" :@[@(_width),@(_height)]]);}
B4IRDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
B4IRDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_metroui_moderntext*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
B4IRDebugUtils.currentModule=@"metroui_moderntext";
B4IRDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Private mEventName As String 'ignore";
self->__meventname = @"";
B4IRDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Private mCallBack As Object 'ignore";
self->__mcallback = [NSObject new];
B4IRDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Public mBase As B4XView";
self->__mbase = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Private xui As XUI 'ignore";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Public Tag As Object";
self->__tag = [NSObject new];
B4IRDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="Dim img As ImageView";
self->__img = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="Dim MyPanel As Panel";
self->__mypanel = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="Dim MyTextboxB4X As B4XView";
self->__mytextboxb4x = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=589839;
 //BA.debugLineNum = 589839;BA.debugLine="Dim iconCircleB4X As B4XView";
self->__iconcircleb4x = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="Dim iconCircle As Label";
self->__iconcircle = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=589841;
 //BA.debugLineNum = 589841;BA.debugLine="Private MyHintLabel As B4XView";
self->__myhintlabel = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="Private MyHLabel As Label 'MyHintLabel Buna Eşitl";
self->__myhlabel = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=589844;
 //BA.debugLineNum = 589844;BA.debugLine="Private MyErrorLabelB4X As B4XView";
self->__myerrorlabelb4x = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=589845;
 //BA.debugLineNum = 589845;BA.debugLine="Private MyErrorLabel As Label 'MyHintLabel Buna E";
self->__myerrorlabel = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=589847;
 //BA.debugLineNum = 589847;BA.debugLine="Private ilkAcilis As Boolean=True";
self->__ilkacilis = true;
B4IRDebugUtils.currentLine=589848;
 //BA.debugLineNum = 589848;BA.debugLine="Private NormalHintArkaPlanUzunlugu As Double";
self->__normalhintarkaplanuzunlugu = 0.0;
B4IRDebugUtils.currentLine=589855;
 //BA.debugLineNum = 589855;BA.debugLine="Dim MyTextbox As TextField";
self->__mytextbox = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=589856;
 //BA.debugLineNum = 589856;BA.debugLine="Private svg As SVG";
self->__svg = [iSVG new];
B4IRDebugUtils.currentLine=589861;
 //BA.debugLineNum = 589861;BA.debugLine="Dim MyPanelRadiusProperty As Int";
self->__mypanelradiusproperty = 0;
B4IRDebugUtils.currentLine=589862;
 //BA.debugLineNum = 589862;BA.debugLine="Dim MyPanelBackgroundColorProperty As String";
self->__mypanelbackgroundcolorproperty = @"";
B4IRDebugUtils.currentLine=589863;
 //BA.debugLineNum = 589863;BA.debugLine="Dim CircleColorProperty As Int";
self->__circlecolorproperty = 0;
B4IRDebugUtils.currentLine=589864;
 //BA.debugLineNum = 589864;BA.debugLine="Dim iconCircleSizeProperty As Int";
self->__iconcirclesizeproperty = 0;
B4IRDebugUtils.currentLine=589865;
 //BA.debugLineNum = 589865;BA.debugLine="Dim iconCircleColorProperty As String";
self->__iconcirclecolorproperty = @"";
B4IRDebugUtils.currentLine=589866;
 //BA.debugLineNum = 589866;BA.debugLine="Dim HintNameProperty As String";
self->__hintnameproperty = @"";
B4IRDebugUtils.currentLine=589869;
 //BA.debugLineNum = 589869;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _clearerror:(b4i_metroui_moderntext*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"metroui_moderntext";
if ([B4IDebug shouldDelegate: @"clearerror"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"clearerror" :nil]);}
B4IRDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub ClearError";
B4IRDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="MyErrorLabel.Visible=False";
[__ref->__myerrorlabel /*B4ILabelWrapper**/  setVisible:false];
B4IRDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _designercreateview:(b4i_metroui_moderntext*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props{
__ref = self;
B4IRDebugUtils.currentModule=@"metroui_moderntext";
if ([B4IDebug shouldDelegate: @"designercreateview"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"designercreateview:::" :@[[B4I nilToNSNull:_base],[B4I nilToNSNull:_lbl],[B4I nilToNSNull:_props]]]);}
int _hintyukseklik = 0;
B4XFont* _iconfont = nil;
B4IRDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
B4IRDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="mBase = Base";
__ref->__mbase /*B4XViewWrapper**/  = (B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)(_base)];
B4IRDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Tag = mBase.Tag";
__ref->__tag /*NSObject**/  = [__ref->__mbase /*B4XViewWrapper**/  Tag];
B4IRDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="mBase.Tag = Me";
[__ref->__mbase /*B4XViewWrapper**/  setTag:self];
B4IRDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="Dim HintYukseklik As Int=DipToCurrent(MyHintLabel";
_hintyukseklik = ((int) ([__ref->__myhintlabel /*B4XViewWrapper**/  TextSize]/(double)0.77));
B4IRDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="MyPanelRadiusProperty = Props.Get(\"MyPanelRadius\"";
__ref->__mypanelradiusproperty /*int*/  = [self.bi ObjectToNumber:[_props Get:(NSObject*)(@"MyPanelRadius")]].intValue;
B4IRDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="MyPanelBackgroundColorProperty = Props.Get(\"MyPan";
__ref->__mypanelbackgroundcolorproperty /*NSString**/  = [self.bi ObjectToString:[_props Get:(NSObject*)(@"MyPanelBackgroundColor")]];
B4IRDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="CircleColorProperty = Props.Get(\"CircleColor\")";
__ref->__circlecolorproperty /*int*/  = [self.bi ObjectToNumber:[_props Get:(NSObject*)(@"CircleColor")]].intValue;
B4IRDebugUtils.currentLine=720908;
 //BA.debugLineNum = 720908;BA.debugLine="iconCircleSizeProperty = Props.Get(\"iconCircleSiz";
__ref->__iconcirclesizeproperty /*int*/  = [self.bi ObjectToNumber:[_props Get:(NSObject*)(@"iconCircleSize")]].intValue;
B4IRDebugUtils.currentLine=720909;
 //BA.debugLineNum = 720909;BA.debugLine="iconCircleColorProperty = Props.Get(\"iconCircleCo";
__ref->__iconcirclecolorproperty /*NSString**/  = [self.bi ObjectToString:[_props Get:(NSObject*)(@"iconCircleColor")]];
B4IRDebugUtils.currentLine=720910;
 //BA.debugLineNum = 720910;BA.debugLine="HintNameProperty = Props.Get(\"HintText\")";
__ref->__hintnameproperty /*NSString**/  = [self.bi ObjectToString:[_props Get:(NSObject*)(@"HintText")]];
B4IRDebugUtils.currentLine=720922;
 //BA.debugLineNum = 720922;BA.debugLine="MyPanel.SetBorder(0,xui.Color_White,MyPanelRadius";
[__ref->__mypanel /*B4IPanelWrapper**/  SetBorder:(float) (0) :[__ref->__xui /*B4IXUI**/  Color_White] :(float) (__ref->__mypanelradiusproperty /*int*/ )];
B4IRDebugUtils.currentLine=720923;
 //BA.debugLineNum = 720923;BA.debugLine="MyPanel.Color=xui.Color_White";
[__ref->__mypanel /*B4IPanelWrapper**/  setColor:[__ref->__xui /*B4IXUI**/  Color_White]];
B4IRDebugUtils.currentLine=720927;
 //BA.debugLineNum = 720927;BA.debugLine="mBase.AddView(MyPanel,0,0,mBase.Width,mBase.Heigh";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__mypanel /*B4IPanelWrapper**/ ).object) :(float) (0) :(float) (0) :[__ref->__mbase /*B4XViewWrapper**/  Width] :(float) ([__ref->__mbase /*B4XViewWrapper**/  Height]-((int) (2)))];
B4IRDebugUtils.currentLine=720932;
 //BA.debugLineNum = 720932;BA.debugLine="MyPanel.AddView(MyTextboxB4X,65dip,0,mBase.Width-";
[__ref->__mypanel /*B4IPanelWrapper**/  AddView:(UIView*)((__ref->__mytextboxb4x /*B4XViewWrapper**/ ).object) :(float) (((int) (65))) :(float) (0) :(float) ([__ref->__mbase /*B4XViewWrapper**/  Width]-((int) (70))) :[__ref->__mypanel /*B4IPanelWrapper**/  Height]];
B4IRDebugUtils.currentLine=720933;
 //BA.debugLineNum = 720933;BA.debugLine="MyPanel.AddView(img,0,0,MyTextboxB4X.left-5dip  ,";
[__ref->__mypanel /*B4IPanelWrapper**/  AddView:(UIView*)((__ref->__img /*B4IImageViewWrapper**/ ).object) :(float) (0) :(float) (0) :(float) ([__ref->__mytextboxb4x /*B4XViewWrapper**/  Left]-((int) (5))) :(float) ([__ref->__mbase /*B4XViewWrapper**/  Height]-((int) (2)))];
B4IRDebugUtils.currentLine=720938;
 //BA.debugLineNum = 720938;BA.debugLine="MyPanel.AddView(iconCircle,img.Left-5dip,img.Top,";
[__ref->__mypanel /*B4IPanelWrapper**/  AddView:(UIView*)((__ref->__iconcircle /*B4ILabelWrapper**/ ).object) :(float) ([__ref->__img /*B4IImageViewWrapper**/  Left]-((int) (5))) :[__ref->__img /*B4IImageViewWrapper**/  Top] :[__ref->__img /*B4IImageViewWrapper**/  Width] :[__ref->__img /*B4IImageViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=720940;
 //BA.debugLineNum = 720940;BA.debugLine="MyTextboxB4X.Color=Colors.Transparent";
[__ref->__mytextboxb4x /*B4XViewWrapper**/  setColor:[[self->___c Colors] Transparent]];
B4IRDebugUtils.currentLine=720972;
 //BA.debugLineNum = 720972;BA.debugLine="svg.Initialize(File.DirAssets,\"icon.svg\")";
[__ref->__svg /*iSVG**/  Initialize:[[self->___c File] DirAssets] :@"icon.svg"];
B4IRDebugUtils.currentLine=720974;
 //BA.debugLineNum = 720974;BA.debugLine="img.Bitmap=svg.Export(img.Width,img.Height)";
[__ref->__img /*B4IImageViewWrapper**/  setBitmap:[__ref->__svg /*iSVG**/  Export:[__ref->__img /*B4IImageViewWrapper**/  Width] :[__ref->__img /*B4IImageViewWrapper**/  Height]]];
B4IRDebugUtils.currentLine=720976;
 //BA.debugLineNum = 720976;BA.debugLine="Log(File.ReadString(File.DirAssets,\"icon.svg\"))";
[self->___c LogImpl:@"4720976" :[[self->___c File] ReadString:[[self->___c File] DirAssets] :@"icon.svg"] :0];
B4IRDebugUtils.currentLine=720982;
 //BA.debugLineNum = 720982;BA.debugLine="Dim IconFont As B4XFont";
_iconfont = [B4XFont new];
B4IRDebugUtils.currentLine=720987;
 //BA.debugLineNum = 720987;BA.debugLine="IconFont = xui.CreateFont(Font.CreateFontAwesome(";
_iconfont = [__ref->__xui /*B4IXUI**/  CreateFont:(UIFont*)(([[self->___c Font] CreateFontAwesome:(float) (__ref->__iconcirclesizeproperty /*int*/ )]).object) :(float) (__ref->__iconcirclesizeproperty /*int*/ )];
B4IRDebugUtils.currentLine=720994;
 //BA.debugLineNum = 720994;BA.debugLine="iconCircleB4X.SetTextAlignment(\"CENTER\",\"CENTER\")";
[__ref->__iconcircleb4x /*B4XViewWrapper**/  SetTextAlignment:@"CENTER" :@"CENTER"];
B4IRDebugUtils.currentLine=720995;
 //BA.debugLineNum = 720995;BA.debugLine="iconCircleB4X.TextColor=iconCircleColorProperty";
[__ref->__iconcircleb4x /*B4XViewWrapper**/  setTextColor:[self.bi ObjectToNumber:__ref->__iconcirclecolorproperty /*NSString**/ ].intValue];
B4IRDebugUtils.currentLine=720996;
 //BA.debugLineNum = 720996;BA.debugLine="iconCircleB4X.TextSize=iconCircleSizeProperty";
[__ref->__iconcircleb4x /*B4XViewWrapper**/  setTextSize:(float) (__ref->__iconcirclesizeproperty /*int*/ )];
B4IRDebugUtils.currentLine=720998;
 //BA.debugLineNum = 720998;BA.debugLine="iconCircleB4X.Font=IconFont";
[__ref->__iconcircleb4x /*B4XViewWrapper**/  setFont:_iconfont];
B4IRDebugUtils.currentLine=720999;
 //BA.debugLineNum = 720999;BA.debugLine="iconCircleB4X.Text=\"\"";
[__ref->__iconcircleb4x /*B4XViewWrapper**/  setText:@""];
B4IRDebugUtils.currentLine=721001;
 //BA.debugLineNum = 721001;BA.debugLine="MyHintLabel.Text=HintNameProperty";
[__ref->__myhintlabel /*B4XViewWrapper**/  setText:__ref->__hintnameproperty /*NSString**/ ];
B4IRDebugUtils.currentLine=721002;
 //BA.debugLineNum = 721002;BA.debugLine="NormalHintArkaPlanUzunlugu=UzunlukHesapla(HintNam";
__ref->__normalhintarkaplanuzunlugu /*double*/  = [__ref _uzunlukhesapla /*double*/ :nil :__ref->__hintnameproperty /*NSString**/ ];
B4IRDebugUtils.currentLine=721003;
 //BA.debugLineNum = 721003;BA.debugLine="MyPanel.AddView(MyHintLabel, MyTextboxB4X.Left +";
[__ref->__mypanel /*B4IPanelWrapper**/  AddView:(UIView*)((__ref->__myhintlabel /*B4XViewWrapper**/ ).object) :(float) ([__ref->__mytextboxb4x /*B4XViewWrapper**/  Left]+((int) (4))) :(float) ([__ref->__mypanel /*B4IPanelWrapper**/  Height]/(double)2-((int) (11))) :(float) (__ref->__normalhintarkaplanuzunlugu /*double*/ ) :(float) (_hintyukseklik)];
B4IRDebugUtils.currentLine=721005;
 //BA.debugLineNum = 721005;BA.debugLine="MyPanel.AddView(MyErrorLabel,MyTextboxB4X.Left +";
[__ref->__mypanel /*B4IPanelWrapper**/  AddView:(UIView*)((__ref->__myerrorlabel /*B4ILabelWrapper**/ ).object) :(float) ([__ref->__mytextboxb4x /*B4XViewWrapper**/  Left]+((int) (4))) :(float) ([__ref->__mypanel /*B4IPanelWrapper**/  Height]-((int) (18))) :[__ref->__mypanel /*B4IPanelWrapper**/  Width] :(float) (((int) (20)))];
B4IRDebugUtils.currentLine=721006;
 //BA.debugLineNum = 721006;BA.debugLine="MyErrorLabel.Visible=False";
[__ref->__myerrorlabel /*B4ILabelWrapper**/  setVisible:false];
B4IRDebugUtils.currentLine=721009;
 //BA.debugLineNum = 721009;BA.debugLine="MyErrorLabelB4X.TextColor=xui.Color_Red";
[__ref->__myerrorlabelb4x /*B4XViewWrapper**/  setTextColor:[__ref->__xui /*B4IXUI**/  Color_Red]];
B4IRDebugUtils.currentLine=721010;
 //BA.debugLineNum = 721010;BA.debugLine="MyErrorLabelB4X.TextSize=11";
[__ref->__myerrorlabelb4x /*B4XViewWrapper**/  setTextSize:(float) (11)];
B4IRDebugUtils.currentLine=721011;
 //BA.debugLineNum = 721011;BA.debugLine="MyErrorLabelB4X.Text=\"Lütfen E-Mail Adresinizi Gi";
[__ref->__myerrorlabelb4x /*B4XViewWrapper**/  setText:@"Lütfen E-Mail Adresinizi Giriniz!"];
B4IRDebugUtils.currentLine=721015;
 //BA.debugLineNum = 721015;BA.debugLine="End Sub";
return @"";
}
- (double)  _uzunlukhesapla:(b4i_metroui_moderntext*) __ref :(NSString*) _nametext{
__ref = self;
B4IRDebugUtils.currentModule=@"metroui_moderntext";
if ([B4IDebug shouldDelegate: @"uzunlukhesapla"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"uzunlukhesapla:" :@[[B4I nilToNSNull:_nametext]]]).doubleValue;}
B4XViewWrapper* _uzunpanel = nil;
B4XCanvas* _canvas1 = nil;
B4XRect* _rect = nil;
double _sonuc = 0.0;
B4IRDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub UzunlukHesapla (NameText As String) As";
B4IRDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Dim UzunPanel As B4XView = xui.CreatePanel(\"\")";
_uzunpanel = [B4XViewWrapper new];
_uzunpanel = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@""];
B4IRDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="UzunPanel.SetLayoutAnimated(0,0,0,MyPanel.Width,M";
[_uzunpanel SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :[__ref->__mypanel /*B4IPanelWrapper**/  Width] :[__ref->__mypanel /*B4IPanelWrapper**/  Height]];
B4IRDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Dim canvas1 As B4XCanvas";
_canvas1 = [B4XCanvas new];
B4IRDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="canvas1.Initialize(UzunPanel)";
[_canvas1 Initialize:(UIView*)((_uzunpanel).object)];
B4IRDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="Dim Rect As B4XRect = canvas1.MeasureText(NameTex";
_rect = [B4XRect new];
_rect = [_canvas1 MeasureText:_nametext :[__ref->__myhintlabel /*B4XViewWrapper**/  Font]];
B4IRDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="Dim Sonuc As Double=(Rect.Width*1.08)";
_sonuc = ([_rect Width]*1.08);
B4IRDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="Sonuc=Sonuc+3dip";
_sonuc = _sonuc+((int) (3));
B4IRDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="Return Sonuc";
if (true) return _sonuc;
B4IRDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="End Sub";
return 0.0;
}
- (B4XFont*)  _gettextfont:(b4i_metroui_moderntext*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"metroui_moderntext";
if ([B4IDebug shouldDelegate: @"gettextfont"])
	 {return ((B4XFont*) [B4IDebug delegate:self.bi :@"gettextfont" :nil]);}
B4IRDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub getTextFont As B4XFont";
B4IRDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Return MyTextboxB4X.Font";
if (true) return [__ref->__mytextboxb4x /*B4XViewWrapper**/  Font];
B4IRDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _initialize:(b4i_metroui_moderntext*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"metroui_moderntext";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:::" :@[[B4I nilToNSNull:_ba],[B4I nilToNSNull:_callback],[B4I nilToNSNull:_eventname]]]);}
B4IRDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
B4IRDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="mEventName = EventName";
__ref->__meventname /*NSString**/  = _eventname;
B4IRDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="mCallBack = Callback";
__ref->__mcallback /*NSObject**/  = _callback;
B4IRDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="img.Initialize(\"img\")";
[__ref->__img /*B4IImageViewWrapper**/  Initialize:self.bi :@"img"];
B4IRDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="MyPanel.Initialize(\"MyPanel\")";
[__ref->__mypanel /*B4IPanelWrapper**/  Initialize:self.bi :@"MyPanel"];
B4IRDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="iconCircle.Initialize(\"iconCircle\")";
[__ref->__iconcircle /*B4ILabelWrapper**/  Initialize:self.bi :@"iconCircle"];
B4IRDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="MyHLabel.Initialize(\"MyHLabel\")";
[__ref->__myhlabel /*B4ILabelWrapper**/  Initialize:self.bi :@"MyHLabel"];
B4IRDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="MyErrorLabel.Initialize(\"MyErrorLabel\")";
[__ref->__myerrorlabel /*B4ILabelWrapper**/  Initialize:self.bi :@"MyErrorLabel"];
B4IRDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="MyTextbox.Initialize(\"MyTextbox\")";
[__ref->__mytextbox /*B4ITextFieldWrapper**/  Initialize:self.bi :@"MyTextbox"];
B4IRDebugUtils.currentLine=655376;
 //BA.debugLineNum = 655376;BA.debugLine="MyTextbox.BorderStyle=0";
[__ref->__mytextbox /*B4ITextFieldWrapper**/  setBorderStyle:(int) (0)];
B4IRDebugUtils.currentLine=655380;
 //BA.debugLineNum = 655380;BA.debugLine="MyTextboxB4X=MyTextbox";
__ref->__mytextboxb4x /*B4XViewWrapper**/  = (B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)((__ref->__mytextbox /*B4ITextFieldWrapper**/ ).object)];
B4IRDebugUtils.currentLine=655381;
 //BA.debugLineNum = 655381;BA.debugLine="iconCircleB4X=iconCircle";
__ref->__iconcircleb4x /*B4XViewWrapper**/  = (B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)((__ref->__iconcircle /*B4ILabelWrapper**/ ).object)];
B4IRDebugUtils.currentLine=655382;
 //BA.debugLineNum = 655382;BA.debugLine="MyHintLabel=MyHLabel";
__ref->__myhintlabel /*B4XViewWrapper**/  = (B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)((__ref->__myhlabel /*B4ILabelWrapper**/ ).object)];
B4IRDebugUtils.currentLine=655383;
 //BA.debugLineNum = 655383;BA.debugLine="MyErrorLabelB4X=MyErrorLabel";
__ref->__myerrorlabelb4x /*B4XViewWrapper**/  = (B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)((__ref->__myerrorlabel /*B4ILabelWrapper**/ ).object)];
B4IRDebugUtils.currentLine=655386;
 //BA.debugLineNum = 655386;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _mytextbox_action:(b4i_metroui_moderntext*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"metroui_moderntext";
if ([B4IDebug shouldDelegate: @"mytextbox_action"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"mytextbox_action" :nil]);}
B4IRDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub MyTextBox_Action";
B4IRDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_EnterPr";
if ([__ref->__xui /*B4IXUI**/  SubExists:__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_EnterPressed"] componentsJoinedByString:@""] :(int) (0)]) { 
[self->___c CallSub:self.bi :__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_EnterPressed"] componentsJoinedByString:@""]];};
B4IRDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _mytextbox_beginedit:(b4i_metroui_moderntext*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"metroui_moderntext";
if ([B4IDebug shouldDelegate: @"mytextbox_beginedit"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"mytextbox_beginedit" :nil]);}
B4IRDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub MyTextBox_BeginEdit";
B4IRDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="CallSub2(Me,\"MyTextBox_FocusChanged\",True)";
[self->___c CallSubDebug2:self.bi :self :@"MyTextBox_FocusChanged" :(NSObject*)(@(true))];
B4IRDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _mytextbox_focuschanged:(b4i_metroui_moderntext*) __ref :(BOOL) _hasfocus{
__ref = self;
B4IRDebugUtils.currentModule=@"metroui_moderntext";
if ([B4IDebug shouldDelegate: @"mytextbox_focuschanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"mytextbox_focuschanged:" :@[@(_hasfocus)]]);}
B4IRDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Private Sub MyTextBox_FocusChanged (HasFocus As Bo";
B4IRDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="If HasFocus = False Then";
if (_hasfocus==false) { 
B4IRDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="If MyTextboxB4X.Text.Length=0 Then";
if ([[__ref->__mytextboxb4x /*B4XViewWrapper**/  Text] Length]==0) { 
B4IRDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
[__ref->__myhintlabel /*B4XViewWrapper**/  SetLayoutAnimated:(int) (200) :[__ref->__myhintlabel /*B4XViewWrapper**/  Left] :(float) ([__ref->__mypanel /*B4IPanelWrapper**/  Height]/(double)2-((int) (11))) :[__ref->__myhintlabel /*B4XViewWrapper**/  Width] :[__ref->__myhintlabel /*B4XViewWrapper**/  Height]];
 }else if([[__ref->__mytextboxb4x /*B4XViewWrapper**/  Text] Length]>0) { 
B4IRDebugUtils.currentLine=1441804;
 //BA.debugLineNum = 1441804;BA.debugLine="MyErrorLabel.Visible=False";
[__ref->__myerrorlabel /*B4ILabelWrapper**/  setVisible:false];
B4IRDebugUtils.currentLine=1441805;
 //BA.debugLineNum = 1441805;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
[__ref->__myhintlabel /*B4XViewWrapper**/  SetLayoutAnimated:(int) (200) :[__ref->__myhintlabel /*B4XViewWrapper**/  Left] :(float) ([__ref->__mytextboxb4x /*B4XViewWrapper**/  Top]-((int) (2.5))) :[__ref->__myhintlabel /*B4XViewWrapper**/  Width] :[__ref->__myhintlabel /*B4XViewWrapper**/  Height]];
 };
 }else {
B4IRDebugUtils.currentLine=1441809;
 //BA.debugLineNum = 1441809;BA.debugLine="If MyTextboxB4X.Text.Length=0 Then";
if ([[__ref->__mytextboxb4x /*B4XViewWrapper**/  Text] Length]==0) { 
B4IRDebugUtils.currentLine=1441811;
 //BA.debugLineNum = 1441811;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
[__ref->__myhintlabel /*B4XViewWrapper**/  SetLayoutAnimated:(int) (200) :[__ref->__myhintlabel /*B4XViewWrapper**/  Left] :(float) ([__ref->__mytextboxb4x /*B4XViewWrapper**/  Top]-((int) (2.5))) :[__ref->__myhintlabel /*B4XViewWrapper**/  Width] :[__ref->__myhintlabel /*B4XViewWrapper**/  Height]];
 }else {
 };
 };
B4IRDebugUtils.currentLine=1441821;
 //BA.debugLineNum = 1441821;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
if ([__ref->__xui /*B4IXUI**/  SubExists:__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_FocusChanged"] componentsJoinedByString:@""] :(int) (1)]) { 
[self->___c CallSub2:self.bi :__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_FocusChanged"] componentsJoinedByString:@""] :(NSObject*)(@(_hasfocus))];};
B4IRDebugUtils.currentLine=1441822;
 //BA.debugLineNum = 1441822;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _mytextbox_endedit:(b4i_metroui_moderntext*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"metroui_moderntext";
if ([B4IDebug shouldDelegate: @"mytextbox_endedit"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"mytextbox_endedit" :nil]);}
B4IRDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Private Sub MyTextBox_EndEdit";
B4IRDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="CallSub2(Me,\"MyTextBox_FocusChanged\",False)";
[self->___c CallSubDebug2:self.bi :self :@"MyTextBox_FocusChanged" :(NSObject*)(@(false))];
B4IRDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _mytextbox_enterpressed:(b4i_metroui_moderntext*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"metroui_moderntext";
if ([B4IDebug shouldDelegate: @"mytextbox_enterpressed"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"mytextbox_enterpressed" :nil]);}
B4IRDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="private Sub MyTextBox_EnterPressed";
B4IRDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_EnterPr";
if ([__ref->__xui /*B4IXUI**/  SubExists:__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_EnterPressed"] componentsJoinedByString:@""] :(int) (0)]) { 
[self->___c CallSub:self.bi :__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_EnterPressed"] componentsJoinedByString:@""]];};
B4IRDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _mytextbox_textchanged:(b4i_metroui_moderntext*) __ref :(NSString*) _old :(NSString*) _new{
__ref = self;
B4IRDebugUtils.currentModule=@"metroui_moderntext";
if ([B4IDebug shouldDelegate: @"mytextbox_textchanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"mytextbox_textchanged::" :@[[B4I nilToNSNull:_old],[B4I nilToNSNull:_new]]]);}
B4IRDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Private Sub MyTextBox_TextChanged (Old As String,";
B4IRDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="If New.Length>Old.Length Then";
if ([_new Length]>[_old Length]) { 
B4IRDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="MyErrorLabel.Visible=False";
[__ref->__myerrorlabel /*B4ILabelWrapper**/  setVisible:false];
B4IRDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.le";
[__ref->__myhintlabel /*B4XViewWrapper**/  SetLayoutAnimated:(int) (200) :[__ref->__myhintlabel /*B4XViewWrapper**/  Left] :(float) ([__ref->__mytextboxb4x /*B4XViewWrapper**/  Top]-((int) (2.5))) :[__ref->__myhintlabel /*B4XViewWrapper**/  Width] :[__ref->__myhintlabel /*B4XViewWrapper**/  Height]];
 };
B4IRDebugUtils.currentLine=1507341;
 //BA.debugLineNum = 1507341;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_TextCha";
if ([__ref->__xui /*B4IXUI**/  SubExists:__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_TextChanged"] componentsJoinedByString:@""] :(int) (2)]) { 
[self->___c CallSub3:self.bi :__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_TextChanged"] componentsJoinedByString:@""] :(NSObject*)(_old) :(NSObject*)(_new)];};
B4IRDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _settext:(b4i_metroui_moderntext*) __ref :(NSString*) _text{
__ref = self;
B4IRDebugUtils.currentModule=@"metroui_moderntext";
if ([B4IDebug shouldDelegate: @"settext"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"settext:" :@[[B4I nilToNSNull:_text]]]);}
B4IRDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub setText(Text As String)";
B4IRDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="If ilkAcilis=True Then";
if (__ref->__ilkacilis /*BOOL*/ ==true) { 
B4IRDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="If Text.Length=0 Then";
if ([_text Length]==0) { 
B4IRDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
[__ref->__myhintlabel /*B4XViewWrapper**/  SetLayoutAnimated:(int) (200) :[__ref->__myhintlabel /*B4XViewWrapper**/  Left] :(float) ([__ref->__mytextboxb4x /*B4XViewWrapper**/  Height]/(double)2.2) :[__ref->__myhintlabel /*B4XViewWrapper**/  Width] :[__ref->__myhintlabel /*B4XViewWrapper**/  Height]];
 }else {
B4IRDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
[__ref->__myhintlabel /*B4XViewWrapper**/  SetLayoutAnimated:(int) (200) :[__ref->__myhintlabel /*B4XViewWrapper**/  Left] :(float) ([__ref->__mytextboxb4x /*B4XViewWrapper**/  Top]-((int) (2.5))) :[__ref->__myhintlabel /*B4XViewWrapper**/  Width] :[__ref->__myhintlabel /*B4XViewWrapper**/  Height]];
 };
 };
B4IRDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="MyTextboxB4X.Text=Text";
[__ref->__mytextboxb4x /*B4XViewWrapper**/  setText:_text];
B4IRDebugUtils.currentLine=1048593;
 //BA.debugLineNum = 1048593;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _settextfont:(b4i_metroui_moderntext*) __ref :(B4XFont*) _fnt{
__ref = self;
B4IRDebugUtils.currentModule=@"metroui_moderntext";
if ([B4IDebug shouldDelegate: @"settextfont"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"settextfont:" :@[[B4I nilToNSNull:_fnt]]]);}
B4IRDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub setTextFont(Fnt As B4XFont)";
B4IRDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="MyTextboxB4X.Font=Fnt";
[__ref->__mytextboxb4x /*B4XViewWrapper**/  setFont:_fnt];
B4IRDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return @"";
}
@end