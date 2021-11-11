package hds.modernuixxx;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_metroui_moderntext_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "bi"),__ref,238);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "metroui_moderntext","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 238;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(8192);
 BA.debugLineNum = 240;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private mEventName As String 'ignore";
b4i_metroui_moderntext._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4i_metroui_moderntext._meventname);
 //BA.debugLineNum = 13;BA.debugLine="Private mCallBack As Object 'ignore";
b4i_metroui_moderntext._mcallback = RemoteObject.createNew ("NSObject");__ref.setField("_mcallback",b4i_metroui_moderntext._mcallback);
 //BA.debugLineNum = 14;BA.debugLine="Public mBase As B4XView";
b4i_metroui_moderntext._mbase = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_mbase",b4i_metroui_moderntext._mbase);
 //BA.debugLineNum = 15;BA.debugLine="Private xui As XUI 'ignore";
b4i_metroui_moderntext._xui = RemoteObject.createNew ("B4IXUI");__ref.setField("_xui",b4i_metroui_moderntext._xui);
 //BA.debugLineNum = 16;BA.debugLine="Public Tag As Object";
b4i_metroui_moderntext._tag = RemoteObject.createNew ("NSObject");__ref.setField("_tag",b4i_metroui_moderntext._tag);
 //BA.debugLineNum = 18;BA.debugLine="Dim img As ImageView";
b4i_metroui_moderntext._img = RemoteObject.createNew ("B4IImageViewWrapper");__ref.setField("_img",b4i_metroui_moderntext._img);
 //BA.debugLineNum = 22;BA.debugLine="Dim MyPanel As Panel";
b4i_metroui_moderntext._mypanel = RemoteObject.createNew ("B4IPanelWrapper");__ref.setField("_mypanel",b4i_metroui_moderntext._mypanel);
 //BA.debugLineNum = 23;BA.debugLine="Dim MyTextboxB4X As B4XView";
b4i_metroui_moderntext._mytextboxb4x = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_mytextboxb4x",b4i_metroui_moderntext._mytextboxb4x);
 //BA.debugLineNum = 26;BA.debugLine="Dim iconCircleB4X As B4XView";
b4i_metroui_moderntext._iconcircleb4x = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_iconcircleb4x",b4i_metroui_moderntext._iconcircleb4x);
 //BA.debugLineNum = 27;BA.debugLine="Dim iconCircle As Label";
b4i_metroui_moderntext._iconcircle = RemoteObject.createNew ("B4ILabelWrapper");__ref.setField("_iconcircle",b4i_metroui_moderntext._iconcircle);
 //BA.debugLineNum = 28;BA.debugLine="Private MyHintLabel As B4XView";
b4i_metroui_moderntext._myhintlabel = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_myhintlabel",b4i_metroui_moderntext._myhintlabel);
 //BA.debugLineNum = 29;BA.debugLine="Private MyHLabel As Label 'MyHintLabel Buna Eşitl";
b4i_metroui_moderntext._myhlabel = RemoteObject.createNew ("B4ILabelWrapper");__ref.setField("_myhlabel",b4i_metroui_moderntext._myhlabel);
 //BA.debugLineNum = 31;BA.debugLine="Private MyErrorLabelB4X As B4XView";
b4i_metroui_moderntext._myerrorlabelb4x = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_myerrorlabelb4x",b4i_metroui_moderntext._myerrorlabelb4x);
 //BA.debugLineNum = 32;BA.debugLine="Private MyErrorLabel As Label 'MyHintLabel Buna E";
b4i_metroui_moderntext._myerrorlabel = RemoteObject.createNew ("B4ILabelWrapper");__ref.setField("_myerrorlabel",b4i_metroui_moderntext._myerrorlabel);
 //BA.debugLineNum = 34;BA.debugLine="Private ilkAcilis As Boolean=True";
b4i_metroui_moderntext._ilkacilis = b4i_main.__c.runMethod(true,"True");__ref.setField("_ilkacilis",b4i_metroui_moderntext._ilkacilis);
 //BA.debugLineNum = 35;BA.debugLine="Private NormalHintArkaPlanUzunlugu As Double";
b4i_metroui_moderntext._normalhintarkaplanuzunlugu = RemoteObject.createImmutable(0.0);__ref.setField("_normalhintarkaplanuzunlugu",b4i_metroui_moderntext._normalhintarkaplanuzunlugu);
 //BA.debugLineNum = 42;BA.debugLine="Dim MyTextbox As TextField";
b4i_metroui_moderntext._mytextbox = RemoteObject.createNew ("B4ITextFieldWrapper");__ref.setField("_mytextbox",b4i_metroui_moderntext._mytextbox);
 //BA.debugLineNum = 43;BA.debugLine="Private svg As SVG";
b4i_metroui_moderntext._svg = RemoteObject.createNew ("iSVG");__ref.setField("_svg",b4i_metroui_moderntext._svg);
 //BA.debugLineNum = 48;BA.debugLine="Dim MyPanelRadiusProperty As Int";
b4i_metroui_moderntext._mypanelradiusproperty = RemoteObject.createImmutable(0);__ref.setField("_mypanelradiusproperty",b4i_metroui_moderntext._mypanelradiusproperty);
 //BA.debugLineNum = 49;BA.debugLine="Dim MyPanelBackgroundColorProperty As String";
b4i_metroui_moderntext._mypanelbackgroundcolorproperty = RemoteObject.createImmutable("");__ref.setField("_mypanelbackgroundcolorproperty",b4i_metroui_moderntext._mypanelbackgroundcolorproperty);
 //BA.debugLineNum = 50;BA.debugLine="Dim CircleColorProperty As Int";
b4i_metroui_moderntext._circlecolorproperty = RemoteObject.createImmutable(0);__ref.setField("_circlecolorproperty",b4i_metroui_moderntext._circlecolorproperty);
 //BA.debugLineNum = 51;BA.debugLine="Dim iconCircleSizeProperty As Int";
b4i_metroui_moderntext._iconcirclesizeproperty = RemoteObject.createImmutable(0);__ref.setField("_iconcirclesizeproperty",b4i_metroui_moderntext._iconcirclesizeproperty);
 //BA.debugLineNum = 52;BA.debugLine="Dim iconCircleColorProperty As String";
b4i_metroui_moderntext._iconcirclecolorproperty = RemoteObject.createImmutable("");__ref.setField("_iconcirclecolorproperty",b4i_metroui_moderntext._iconcirclecolorproperty);
 //BA.debugLineNum = 53;BA.debugLine="Dim HintNameProperty As String";
b4i_metroui_moderntext._hintnameproperty = RemoteObject.createImmutable("");__ref.setField("_hintnameproperty",b4i_metroui_moderntext._hintnameproperty);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clearerror(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearError (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "bi"),__ref,233);
if (RapidSub.canDelegate("clearerror")) { return __ref.runUserSub(false, "metroui_moderntext","clearerror", __ref);}
 BA.debugLineNum = 233;BA.debugLine="Public Sub ClearError";
Debug.ShouldStop(256);
 BA.debugLineNum = 234;BA.debugLine="MyErrorLabel.Visible=False";
Debug.ShouldStop(512);
__ref.getField(false,"_myerrorlabel" /*RemoteObject*/ ).runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "bi"),__ref,87);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "metroui_moderntext","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _hintyukseklik = RemoteObject.createImmutable(0);
RemoteObject _bc = RemoteObject.declareNull("B4IByteConverter");
RemoteObject _val = null;
RemoteObject _colorset = RemoteObject.createImmutable("");
RemoteObject _iconfont = RemoteObject.declareNull("B4XFont");
Debug.locals.put("Base", _base);
Debug.locals.put("lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 87;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="mBase = Base";
Debug.ShouldStop(8388608);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 89;BA.debugLine="Tag = mBase.Tag";
Debug.ShouldStop(16777216);
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"Tag"));
 BA.debugLineNum = 90;BA.debugLine="mBase.Tag = Me";
Debug.ShouldStop(33554432);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag:",__ref);
 BA.debugLineNum = 94;BA.debugLine="Dim HintYukseklik As Int=DipToCurrent(MyHintLabel";
Debug.ShouldStop(536870912);
_hintyukseklik = b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"TextSize"),RemoteObject.createImmutable(0.77)}, "/",0, 0))));Debug.locals.put("HintYukseklik", _hintyukseklik);Debug.locals.put("HintYukseklik", _hintyukseklik);
 BA.debugLineNum = 96;BA.debugLine="MyPanelRadiusProperty = Props.Get(\"MyPanelRadius\"";
Debug.ShouldStop(-2147483648);
__ref.setField ("_mypanelradiusproperty" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("MyPanelRadius"))))));
 BA.debugLineNum = 97;BA.debugLine="MyPanelBackgroundColorProperty = Props.Get(\"MyPan";
Debug.ShouldStop(1);
__ref.setField ("_mypanelbackgroundcolorproperty" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("MyPanelBackgroundColor"))))));
 BA.debugLineNum = 98;BA.debugLine="CircleColorProperty = Props.Get(\"CircleColor\")";
Debug.ShouldStop(2);
__ref.setField ("_circlecolorproperty" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("CircleColor"))))));
 BA.debugLineNum = 99;BA.debugLine="iconCircleSizeProperty = Props.Get(\"iconCircleSiz";
Debug.ShouldStop(4);
__ref.setField ("_iconcirclesizeproperty" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("iconCircleSize"))))));
 BA.debugLineNum = 100;BA.debugLine="iconCircleColorProperty = Props.Get(\"iconCircleCo";
Debug.ShouldStop(8);
__ref.setField ("_iconcirclecolorproperty" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("iconCircleColor"))))));
 BA.debugLineNum = 101;BA.debugLine="HintNameProperty = Props.Get(\"HintText\")";
Debug.ShouldStop(16);
__ref.setField ("_hintnameproperty" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("HintText"))))));
 BA.debugLineNum = 113;BA.debugLine="MyPanel.SetBorder(0,xui.Color_White,MyPanelRadius";
Debug.ShouldStop(65536);
__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runVoidMethod ("SetBorder:::",(Object)(BA.numberCast(float.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_White")),(Object)(BA.numberCast(float.class, __ref.getField(true,"_mypanelradiusproperty" /*RemoteObject*/ ))));
 BA.debugLineNum = 114;BA.debugLine="MyPanel.Color=xui.Color_White";
Debug.ShouldStop(131072);
__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runMethod(true,"setColor:",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_White"));
 BA.debugLineNum = 118;BA.debugLine="mBase.AddView(MyPanel,0,0,mBase.Width,mBase.Heigh";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView:::::",(Object)(((__ref.getField(false,"_mypanel" /*RemoteObject*/ )).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Height"),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 0))));
 BA.debugLineNum = 123;BA.debugLine="MyPanel.AddView(MyTextboxB4X,65dip,0,mBase.Width-";
Debug.ShouldStop(67108864);
__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runVoidMethod ("AddView:::::",(Object)(((__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ )).getObject())),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 65))))),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Width"),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 70)))}, "-",1, 0))),(Object)(__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runMethod(true,"Height")));
 BA.debugLineNum = 124;BA.debugLine="MyPanel.AddView(img,0,0,MyTextboxB4X.left-5dip  ,";
Debug.ShouldStop(134217728);
__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runVoidMethod ("AddView:::::",(Object)(((__ref.getField(false,"_img" /*RemoteObject*/ )).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"Left"),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Height"),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 0))));
 BA.debugLineNum = 129;BA.debugLine="MyPanel.AddView(iconCircle,img.Left-5dip,img.Top,";
Debug.ShouldStop(1);
__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runVoidMethod ("AddView:::::",(Object)(((__ref.getField(false,"_iconcircle" /*RemoteObject*/ )).getObject())),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(true,"Left"),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 0))),(Object)(__ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(true,"Top")),(Object)(__ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(__ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(true,"Height")));
 BA.debugLineNum = 131;BA.debugLine="MyTextboxB4X.Color=Colors.Transparent";
Debug.ShouldStop(4);
__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"setColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Transparent"));
 BA.debugLineNum = 132;BA.debugLine="Dim bc As ByteConverter";
Debug.ShouldStop(8);
_bc = RemoteObject.createNew ("B4IByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 133;BA.debugLine="Dim val(1) As Int";
Debug.ShouldStop(16);
_val = RemoteObject.createNew("B4IArray").runMethod(false, "initObjects:::", (Object)new RemoteObject[] {BA.numberCast(int.class, 1)}, 0, null);Debug.locals.put("val", _val);
 BA.debugLineNum = 134;BA.debugLine="val(0)=CircleColorProperty";
Debug.ShouldStop(32);
_val.runVoidMethod ("setObjectFastN::", BA.numberCast(int.class, 0),__ref.getField(true,"_circlecolorproperty" /*RemoteObject*/ ));
 BA.debugLineNum = 135;BA.debugLine="Dim ColorSet As String = bc.HexFromBytes(bc.IntsT";
Debug.ShouldStop(64);
_colorset = _bc.runMethod(true,"HexFromBytes:",(Object)(_bc.runMethod(false,"IntsToBytes:",(Object)(_val))));Debug.locals.put("ColorSet", _colorset);Debug.locals.put("ColorSet", _colorset);
 BA.debugLineNum = 136;BA.debugLine="ColorSet=\"#\" & ColorSet.SubString(2)";
Debug.ShouldStop(128);
_colorset = RemoteObject.concat(RemoteObject.createImmutable("#"),_colorset.runMethod(true,"SubString:",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("ColorSet", _colorset);
 BA.debugLineNum = 163;BA.debugLine="Dim svg As SVG = SVGFromString($\"<?xml version=\"1";
Debug.ShouldStop(4);
b4i_metroui_moderntext._svg = RemoteObject.createNew ("iSVG");
b4i_metroui_moderntext._svg = __ref.runClassMethod (b4i_metroui_moderntext.class, "_svgfromstring:" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"),RemoteObject.createImmutable("	<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">\n"),RemoteObject.createImmutable("	<svg width=\"128\" height=\"115\" viewBox=\"0 0 128 115\" preserveAspectRatio=\"none\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\">\n"),RemoteObject.createImmutable("	<g id=\"#fc7424ff\">\n"),RemoteObject.createImmutable("	<path fill=\""),b4i_main.__c.runMethod(true,"SmartStringFormatter::",(Object)(BA.ObjectToString("")),(Object)((_colorset))),RemoteObject.createImmutable("\" opacity=\"1.00\" d=\" M 37.22 3.35 C 45.06 -0.03 53.78 0.53 62.09 1.04 C 76.14 3.27 88.01 12.36 96.84 23.13 C 107.21 34.19 117.48 45.36 128.00 56.27 L 128.00 57.76 C 116.32 71.13 103.73 83.71 92.28 97.28 C 84.97 105.16 75.47 111.16 64.97 113.67 C 57.45 114.82 49.69 114.84 42.18 113.56 C 30.18 110.46 19.22 103.11 12.17 92.86 C 6.67 86.03 3.76 77.56 2.04 69.06 C 0.99 63.79 -0.11 58.36 0.85 52.98 C 2.18 45.24 3.63 37.35 7.29 30.31 C 13.44 18.03 24.11 7.82 37.22 3.35 Z\" />\n"),RemoteObject.createImmutable("	</g>\n"),RemoteObject.createImmutable("	</svg>\n"),RemoteObject.createImmutable("")))));__ref.setField("_svg",b4i_metroui_moderntext._svg);
 BA.debugLineNum = 172;BA.debugLine="img.Bitmap=svg.Export(img.Width,img.Height)";
Debug.ShouldStop(2048);
__ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(false,"setBitmap:",__ref.getField(false,"_svg" /*RemoteObject*/ ).runMethod(false,"Export::",(Object)(__ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(__ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(true,"Height"))));
 BA.debugLineNum = 174;BA.debugLine="Log(File.ReadString(File.DirAssets,\"icon.svg\"))";
Debug.ShouldStop(8192);
b4i_main.__c.runVoidMethod ("LogImpl:::","1720983",b4i_main.__c.runMethod(false,"File").runMethod(true,"ReadString::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("icon.svg"))),0);
 BA.debugLineNum = 178;BA.debugLine="Dim IconFont As B4XFont";
Debug.ShouldStop(131072);
_iconfont = RemoteObject.createNew ("B4XFont");Debug.locals.put("IconFont", _iconfont);
 BA.debugLineNum = 183;BA.debugLine="IconFont = xui.CreateFont(Font.CreateFontAwesome(";
Debug.ShouldStop(4194304);
_iconfont = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateFont::",(Object)(((b4i_main.__c.runMethod(false,"Font").runMethod(false,"CreateFontAwesome:",(Object)(BA.numberCast(float.class, __ref.getField(true,"_iconcirclesizeproperty" /*RemoteObject*/ ))))).getObject())),(Object)(BA.numberCast(float.class, __ref.getField(true,"_iconcirclesizeproperty" /*RemoteObject*/ ))));Debug.locals.put("IconFont", _iconfont);
 BA.debugLineNum = 187;BA.debugLine="iconCircleB4X.SetTextAlignment(\"CENTER\",\"CENTER\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_iconcircleb4x" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment::",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 188;BA.debugLine="iconCircleB4X.TextColor=iconCircleColorProperty";
Debug.ShouldStop(134217728);
__ref.getField(false,"_iconcircleb4x" /*RemoteObject*/ ).runMethod(true,"setTextColor:",BA.numberCast(int.class, __ref.getField(true,"_iconcirclecolorproperty" /*RemoteObject*/ )));
 BA.debugLineNum = 189;BA.debugLine="iconCircleB4X.TextSize=iconCircleSizeProperty";
Debug.ShouldStop(268435456);
__ref.getField(false,"_iconcircleb4x" /*RemoteObject*/ ).runMethod(true,"setTextSize:",BA.numberCast(float.class, __ref.getField(true,"_iconcirclesizeproperty" /*RemoteObject*/ )));
 BA.debugLineNum = 191;BA.debugLine="iconCircleB4X.Font=IconFont";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_iconcircleb4x" /*RemoteObject*/ ).runMethod(false,"setFont:",_iconfont);
 BA.debugLineNum = 192;BA.debugLine="iconCircleB4X.Text=\"\"";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_iconcircleb4x" /*RemoteObject*/ ).runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 194;BA.debugLine="MyHintLabel.Text=HintNameProperty";
Debug.ShouldStop(2);
__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"setText:",__ref.getField(true,"_hintnameproperty" /*RemoteObject*/ ));
 BA.debugLineNum = 195;BA.debugLine="NormalHintArkaPlanUzunlugu=UzunlukHesapla(HintNam";
Debug.ShouldStop(4);
__ref.setField ("_normalhintarkaplanuzunlugu" /*RemoteObject*/ ,__ref.runClassMethod (b4i_metroui_moderntext.class, "_uzunlukhesapla:" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_hintnameproperty" /*RemoteObject*/ ))));
 BA.debugLineNum = 196;BA.debugLine="MyPanel.AddView(MyHintLabel, MyTextboxB4X.Left +";
Debug.ShouldStop(8);
__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runVoidMethod ("AddView:::::",(Object)(((__ref.getField(false,"_myhintlabel" /*RemoteObject*/ )).getObject())),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"Left"),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runMethod(true,"Height"),RemoteObject.createImmutable(2),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 11)))}, "/-",1, 0))),(Object)(BA.numberCast(float.class, __ref.getField(true,"_normalhintarkaplanuzunlugu" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, _hintyukseklik)));
 BA.debugLineNum = 198;BA.debugLine="MyPanel.AddView(MyErrorLabel,MyTextboxB4X.Left +";
Debug.ShouldStop(32);
__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runVoidMethod ("AddView:::::",(Object)(((__ref.getField(false,"_myerrorlabel" /*RemoteObject*/ )).getObject())),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"Left"),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runMethod(true,"Height"),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 18)))}, "-",1, 0))),(Object)(__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 20))))));
 BA.debugLineNum = 199;BA.debugLine="MyErrorLabel.Visible=False";
Debug.ShouldStop(64);
__ref.getField(false,"_myerrorlabel" /*RemoteObject*/ ).runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 201;BA.debugLine="MyErrorLabelB4X.TextColor=xui.Color_Red";
Debug.ShouldStop(256);
__ref.getField(false,"_myerrorlabelb4x" /*RemoteObject*/ ).runMethod(true,"setTextColor:",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_Red"));
 BA.debugLineNum = 202;BA.debugLine="MyErrorLabelB4X.TextSize=11";
Debug.ShouldStop(512);
__ref.getField(false,"_myerrorlabelb4x" /*RemoteObject*/ ).runMethod(true,"setTextSize:",BA.numberCast(float.class, 11));
 BA.debugLineNum = 203;BA.debugLine="MyErrorLabelB4X.Text=\"Lütfen E-Mail Adresinizi Gi";
Debug.ShouldStop(1024);
__ref.getField(false,"_myerrorlabelb4x" /*RemoteObject*/ ).runMethod(true,"setText:",BA.ObjectToString("Lütfen E-Mail Adresinizi Giriniz!"));
 BA.debugLineNum = 205;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getText (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "bi"),__ref,261);
if (RapidSub.canDelegate("gettext")) { return __ref.runUserSub(false, "metroui_moderntext","gettext", __ref);}
 BA.debugLineNum = 261;BA.debugLine="Public Sub getText As String";
Debug.ShouldStop(16);
 BA.debugLineNum = 262;BA.debugLine="Return MyTextboxB4X.Text";
Debug.ShouldStop(32);
if (true) return __ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"Text");
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettextfont(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTextFont (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "bi"),__ref,269);
if (RapidSub.canDelegate("gettextfont")) { return __ref.runUserSub(false, "metroui_moderntext","gettextfont", __ref);}
 BA.debugLineNum = 269;BA.debugLine="Public Sub getTextFont As B4XFont";
Debug.ShouldStop(4096);
 BA.debugLineNum = 270;BA.debugLine="Return MyTextboxB4X.Font";
Debug.ShouldStop(8192);
if (true) return __ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(false,"Font");
 BA.debugLineNum = 271;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "bi"),__ref,58);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "metroui_moderntext","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("initializeClassModule");
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 58;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(67108864);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 60;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(134217728);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 61;BA.debugLine="img.Initialize(\"img\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_img" /*RemoteObject*/ ).runVoidMethod ("Initialize::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("img")));
 BA.debugLineNum = 62;BA.debugLine="MyPanel.Initialize(\"MyPanel\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runVoidMethod ("Initialize::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("MyPanel")));
 BA.debugLineNum = 64;BA.debugLine="iconCircle.Initialize(\"iconCircle\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_iconcircle" /*RemoteObject*/ ).runVoidMethod ("Initialize::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("iconCircle")));
 BA.debugLineNum = 65;BA.debugLine="MyHLabel.Initialize(\"MyHLabel\")";
Debug.ShouldStop(1);
__ref.getField(false,"_myhlabel" /*RemoteObject*/ ).runVoidMethod ("Initialize::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("MyHLabel")));
 BA.debugLineNum = 66;BA.debugLine="MyErrorLabel.Initialize(\"MyErrorLabel\")";
Debug.ShouldStop(2);
__ref.getField(false,"_myerrorlabel" /*RemoteObject*/ ).runVoidMethod ("Initialize::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("MyErrorLabel")));
 BA.debugLineNum = 73;BA.debugLine="MyTextbox.Initialize(\"MyTextbox\")";
Debug.ShouldStop(256);
__ref.getField(false,"_mytextbox" /*RemoteObject*/ ).runVoidMethod ("Initialize::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("MyTextbox")));
 BA.debugLineNum = 74;BA.debugLine="MyTextbox.BorderStyle=0";
Debug.ShouldStop(512);
__ref.getField(false,"_mytextbox" /*RemoteObject*/ ).runMethod(true,"setBorderStyle:",BA.numberCast(int.class, 0));
 BA.debugLineNum = 78;BA.debugLine="MyTextboxB4X=MyTextbox";
Debug.ShouldStop(8192);
__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).setObject ((__ref.getField(false,"_mytextbox" /*RemoteObject*/ )).getObject());
 BA.debugLineNum = 79;BA.debugLine="iconCircleB4X=iconCircle";
Debug.ShouldStop(16384);
__ref.getField(false,"_iconcircleb4x" /*RemoteObject*/ ).setObject ((__ref.getField(false,"_iconcircle" /*RemoteObject*/ )).getObject());
 BA.debugLineNum = 80;BA.debugLine="MyHintLabel=MyHLabel";
Debug.ShouldStop(32768);
__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).setObject ((__ref.getField(false,"_myhlabel" /*RemoteObject*/ )).getObject());
 BA.debugLineNum = 81;BA.debugLine="MyErrorLabelB4X=MyErrorLabel";
Debug.ShouldStop(65536);
__ref.getField(false,"_myerrorlabelb4x" /*RemoteObject*/ ).setObject ((__ref.getField(false,"_myerrorlabel" /*RemoteObject*/ )).getObject());
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mytextbox_action(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MyTextBox_Action (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "bi"),__ref,336);
if (RapidSub.canDelegate("mytextbox_action")) { return __ref.runUserSub(false, "metroui_moderntext","mytextbox_action", __ref);}
 BA.debugLineNum = 336;BA.debugLine="Private Sub MyTextBox_Action";
Debug.ShouldStop(32768);
 BA.debugLineNum = 337;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_EnterPr";
Debug.ShouldStop(65536);
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists:::",(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_EnterPressed"))),(Object)(BA.numberCast(int.class, 0))).getBoolean()) { 
b4i_main.__c.runMethodAndSync(false,"CallSub:::",__ref.getField(false, "bi"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_EnterPressed"))));};
 BA.debugLineNum = 338;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mytextbox_beginedit(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MyTextBox_BeginEdit (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "bi"),__ref,273);
if (RapidSub.canDelegate("mytextbox_beginedit")) { return __ref.runUserSub(false, "metroui_moderntext","mytextbox_beginedit", __ref);}
 BA.debugLineNum = 273;BA.debugLine="Private Sub MyTextBox_BeginEdit";
Debug.ShouldStop(65536);
 BA.debugLineNum = 274;BA.debugLine="CallSub2(Me,\"MyTextBox_FocusChanged\",True)";
Debug.ShouldStop(131072);
b4i_main.__c.runMethodAndSync(false,"CallSub2::::",__ref.getField(false, "bi"),(Object)(__ref),(Object)(BA.ObjectToString("MyTextBox_FocusChanged")),(Object)((b4i_main.__c.runMethod(true,"True"))));
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mytextbox_endedit(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MyTextBox_EndEdit (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "bi"),__ref,276);
if (RapidSub.canDelegate("mytextbox_endedit")) { return __ref.runUserSub(false, "metroui_moderntext","mytextbox_endedit", __ref);}
 BA.debugLineNum = 276;BA.debugLine="Private Sub MyTextBox_EndEdit";
Debug.ShouldStop(524288);
 BA.debugLineNum = 277;BA.debugLine="CallSub2(Me,\"MyTextBox_FocusChanged\",False)";
Debug.ShouldStop(1048576);
b4i_main.__c.runMethodAndSync(false,"CallSub2::::",__ref.getField(false, "bi"),(Object)(__ref),(Object)(BA.ObjectToString("MyTextBox_FocusChanged")),(Object)((b4i_main.__c.runMethod(true,"False"))));
 BA.debugLineNum = 278;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mytextbox_enterpressed(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MyTextBox_EnterPressed (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "bi"),__ref,329);
if (RapidSub.canDelegate("mytextbox_enterpressed")) { return __ref.runUserSub(false, "metroui_moderntext","mytextbox_enterpressed", __ref);}
 BA.debugLineNum = 329;BA.debugLine="private Sub MyTextBox_EnterPressed";
Debug.ShouldStop(256);
 BA.debugLineNum = 333;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_EnterPr";
Debug.ShouldStop(4096);
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists:::",(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_EnterPressed"))),(Object)(BA.numberCast(int.class, 0))).getBoolean()) { 
b4i_main.__c.runMethodAndSync(false,"CallSub:::",__ref.getField(false, "bi"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_EnterPressed"))));};
 BA.debugLineNum = 334;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mytextbox_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("MyTextBox_FocusChanged (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "bi"),__ref,280);
if (RapidSub.canDelegate("mytextbox_focuschanged")) { return __ref.runUserSub(false, "metroui_moderntext","mytextbox_focuschanged", __ref, _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 280;BA.debugLine="Private Sub MyTextBox_FocusChanged (HasFocus As Bo";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 281;BA.debugLine="If HasFocus = False Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_hasfocus,b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 282;BA.debugLine="If MyTextboxB4X.Text.Length=0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"Text").runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 288;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 200)),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"Left")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runMethod(true,"Height"),RemoteObject.createImmutable(2),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 11)))}, "/-",1, 0))),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"Height")));
 }else 
{ BA.debugLineNum = 290;BA.debugLine="Else if MyTextboxB4X.Text.Length>0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"Text").runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 292;BA.debugLine="MyErrorLabel.Visible=False";
Debug.ShouldStop(8);
__ref.getField(false,"_myerrorlabel" /*RemoteObject*/ ).runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 293;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
Debug.ShouldStop(16);
__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 200)),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"Left")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"Top"),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2.5)))}, "-",1, 0))),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"Height")));
 }}
;
 }else {
 BA.debugLineNum = 297;BA.debugLine="If MyTextboxB4X.Text.Length=0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"Text").runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 299;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
Debug.ShouldStop(1024);
__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 200)),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"Left")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"Top"),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2.5)))}, "-",1, 0))),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"Height")));
 }else {
 };
 };
 BA.debugLineNum = 309;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
Debug.ShouldStop(1048576);
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists:::",(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_FocusChanged"))),(Object)(BA.numberCast(int.class, 1))).getBoolean()) { 
b4i_main.__c.runMethodAndSync(false,"CallSub2::::",__ref.getField(false, "bi"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_FocusChanged"))),(Object)((_hasfocus)));};
 BA.debugLineNum = 310;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mytextbox_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("MyTextBox_TextChanged (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "bi"),__ref,313);
if (RapidSub.canDelegate("mytextbox_textchanged")) { return __ref.runUserSub(false, "metroui_moderntext","mytextbox_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 313;BA.debugLine="Private Sub MyTextBox_TextChanged (Old As String,";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 315;BA.debugLine="If New.Length>Old.Length Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",_new.runMethod(true,"Length"),BA.numberCast(double.class, _old.runMethod(true,"Length")))) { 
 BA.debugLineNum = 316;BA.debugLine="MyErrorLabel.Visible=False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_myerrorlabel" /*RemoteObject*/ ).runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 317;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.le";
Debug.ShouldStop(268435456);
__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 200)),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"Left")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"Top"),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2.5)))}, "-",1, 0))),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"Height")));
 };
 BA.debugLineNum = 326;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_TextCha";
Debug.ShouldStop(32);
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists:::",(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TextChanged"))),(Object)(BA.numberCast(int.class, 2))).getBoolean()) { 
b4i_main.__c.runMethodAndSync(false,"CallSub3:::::",__ref.getField(false, "bi"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TextChanged"))),(Object)((_old)),(Object)((_new)));};
 BA.debugLineNum = 327;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("setText (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "bi"),__ref,242);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "metroui_moderntext","settext", __ref, _text);}
Debug.locals.put("Text", _text);
 BA.debugLineNum = 242;BA.debugLine="Public Sub setText(Text As String)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 243;BA.debugLine="If ilkAcilis=True Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_ilkacilis" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"True"))) { 
 BA.debugLineNum = 245;BA.debugLine="If Text.Length=0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_text.runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 249;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
Debug.ShouldStop(16777216);
__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 200)),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"Left")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"Height"),RemoteObject.createImmutable(2.2)}, "/",0, 0))),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"Height")));
 }else {
 BA.debugLineNum = 252;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
Debug.ShouldStop(134217728);
__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 200)),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"Left")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"Top"),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2.5)))}, "-",1, 0))),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"Height")));
 };
 };
 BA.debugLineNum = 255;BA.debugLine="MyTextboxB4X.Text=Text";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"setText:",_text);
 BA.debugLineNum = 259;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextfont(RemoteObject __ref,RemoteObject _fnt) throws Exception{
try {
		Debug.PushSubsStack("setTextFont (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "bi"),__ref,265);
if (RapidSub.canDelegate("settextfont")) { return __ref.runUserSub(false, "metroui_moderntext","settextfont", __ref, _fnt);}
Debug.locals.put("Fnt", _fnt);
 BA.debugLineNum = 265;BA.debugLine="Public Sub setTextFont(Fnt As B4XFont)";
Debug.ShouldStop(256);
 BA.debugLineNum = 266;BA.debugLine="MyTextboxB4X.Font=Fnt";
Debug.ShouldStop(512);
__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(false,"setFont:",_fnt);
 BA.debugLineNum = 267;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showerror(RemoteObject __ref,RemoteObject _errortext) throws Exception{
try {
		Debug.PushSubsStack("ShowError (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "bi"),__ref,228);
if (RapidSub.canDelegate("showerror")) { return __ref.runUserSub(false, "metroui_moderntext","showerror", __ref, _errortext);}
Debug.locals.put("ErrorText", _errortext);
 BA.debugLineNum = 228;BA.debugLine="Public Sub ShowError(ErrorText As String)";
Debug.ShouldStop(8);
 BA.debugLineNum = 229;BA.debugLine="MyErrorLabel.Visible=True";
Debug.ShouldStop(16);
__ref.getField(false,"_myerrorlabel" /*RemoteObject*/ ).runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 230;BA.debugLine="MyErrorLabel.Text=ErrorText";
Debug.ShouldStop(32);
__ref.getField(false,"_myerrorlabel" /*RemoteObject*/ ).runMethod(true,"setText:",_errortext);
 BA.debugLineNum = 231;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _svgfromstring(RemoteObject __ref,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("SVGFromString (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "bi"),__ref,207);
if (RapidSub.canDelegate("svgfromstring")) { return __ref.runUserSub(false, "metroui_moderntext","svgfromstring", __ref, _s);}
RemoteObject _svgimage = RemoteObject.declareNull("B4INativeObject");
Debug.locals.put("s", _s);
 BA.debugLineNum = 207;BA.debugLine="Private Sub SVGFromString(s As String) As SVG";
Debug.ShouldStop(16384);
 BA.debugLineNum = 208;BA.debugLine="Dim svgimage As NativeObject";
Debug.ShouldStop(32768);
_svgimage = RemoteObject.createNew ("B4INativeObject");Debug.locals.put("svgimage", _svgimage);
 BA.debugLineNum = 209;BA.debugLine="svgimage = svgimage.Initialize(\"SVGKImage\").RunMe";
Debug.ShouldStop(65536);
_svgimage = _svgimage.runMethod(false,"Initialize:",(Object)(RemoteObject.createImmutable("SVGKImage"))).runMethod(false,"RunMethod::",(Object)(BA.ObjectToString("new")),(Object)((b4i_main.__c.runMethod(false,"Null")))).runMethod(false,"RunMethod::",(Object)(BA.ObjectToString("initWithData:")),(Object)(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {_svgimage.runMethod(false,"ArrayToNSData:",(Object)(_s.runMethod(false,"GetBytes:",(Object)(RemoteObject.createImmutable("utf8")))))})));Debug.locals.put("svgimage", _svgimage);
 BA.debugLineNum = 210;BA.debugLine="Dim svg As SVG = svgimage";
Debug.ShouldStop(131072);
b4i_metroui_moderntext._svg = RemoteObject.createNew ("iSVG");
b4i_metroui_moderntext._svg = BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("iSVG"), (_svgimage).getObject());__ref.setField("_svg",b4i_metroui_moderntext._svg);
 BA.debugLineNum = 211;BA.debugLine="Return svg";
Debug.ShouldStop(262144);
if (true) return __ref.getField(false,"_svg" /*RemoteObject*/ );
 BA.debugLineNum = 212;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _uzunlukhesapla(RemoteObject __ref,RemoteObject _nametext) throws Exception{
try {
		Debug.PushSubsStack("UzunlukHesapla (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "bi"),__ref,215);
if (RapidSub.canDelegate("uzunlukhesapla")) { return __ref.runUserSub(false, "metroui_moderntext","uzunlukhesapla", __ref, _nametext);}
RemoteObject _uzunpanel = RemoteObject.declareNull("B4XViewWrapper");
RemoteObject _canvas1 = RemoteObject.declareNull("B4XCanvas");
RemoteObject _rect = RemoteObject.declareNull("B4XRect");
RemoteObject _sonuc = RemoteObject.createImmutable(0.0);
Debug.locals.put("NameText", _nametext);
 BA.debugLineNum = 215;BA.debugLine="Private Sub UzunlukHesapla (NameText As String) As";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 216;BA.debugLine="Dim UzunPanel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(8388608);
_uzunpanel = RemoteObject.createNew ("B4XViewWrapper");
_uzunpanel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("UzunPanel", _uzunpanel);Debug.locals.put("UzunPanel", _uzunpanel);
 BA.debugLineNum = 217;BA.debugLine="UzunPanel.SetLayoutAnimated(0,0,0,MyPanel.Width,M";
Debug.ShouldStop(16777216);
_uzunpanel.runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runMethod(true,"Height")));
 BA.debugLineNum = 218;BA.debugLine="Dim canvas1 As B4XCanvas";
Debug.ShouldStop(33554432);
_canvas1 = RemoteObject.createNew ("B4XCanvas");Debug.locals.put("canvas1", _canvas1);
 BA.debugLineNum = 219;BA.debugLine="canvas1.Initialize(UzunPanel)";
Debug.ShouldStop(67108864);
_canvas1.runVoidMethod ("Initialize:",(Object)(((_uzunpanel).getObject())));
 BA.debugLineNum = 220;BA.debugLine="Dim Rect As B4XRect = canvas1.MeasureText(NameTex";
Debug.ShouldStop(134217728);
_rect = RemoteObject.createNew ("B4XRect");
_rect = _canvas1.runMethod(false,"MeasureText::",(Object)(_nametext),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(false,"Font")));Debug.locals.put("Rect", _rect);Debug.locals.put("Rect", _rect);
 BA.debugLineNum = 221;BA.debugLine="Dim Sonuc As Double=(Rect.Width*1.08)";
Debug.ShouldStop(268435456);
_sonuc = (RemoteObject.solve(new RemoteObject[] {_rect.runMethod(true,"Width"),RemoteObject.createImmutable(1.08)}, "*",0, 0));Debug.locals.put("Sonuc", _sonuc);Debug.locals.put("Sonuc", _sonuc);
 BA.debugLineNum = 223;BA.debugLine="Sonuc=Sonuc+3dip";
Debug.ShouldStop(1073741824);
_sonuc = RemoteObject.solve(new RemoteObject[] {_sonuc,b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 3)))}, "+",1, 0);Debug.locals.put("Sonuc", _sonuc);
 BA.debugLineNum = 225;BA.debugLine="Return Sonuc";
Debug.ShouldStop(1);
if (true) return _sonuc;
 BA.debugLineNum = 226;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(0.0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}