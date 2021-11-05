package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class metroui_moderntext_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "ba"),__ref,228);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "metroui_moderntext","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 228;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(8);
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
metroui_moderntext._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",metroui_moderntext._meventname);
 //BA.debugLineNum = 13;BA.debugLine="Private mCallBack As Object 'ignore";
metroui_moderntext._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",metroui_moderntext._mcallback);
 //BA.debugLineNum = 14;BA.debugLine="Public mBase As B4XView";
metroui_moderntext._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",metroui_moderntext._mbase);
 //BA.debugLineNum = 15;BA.debugLine="Private xui As XUI 'ignore";
metroui_moderntext._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",metroui_moderntext._xui);
 //BA.debugLineNum = 16;BA.debugLine="Public Tag As Object";
metroui_moderntext._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",metroui_moderntext._tag);
 //BA.debugLineNum = 18;BA.debugLine="Dim img As ImageView";
metroui_moderntext._img = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_img",metroui_moderntext._img);
 //BA.debugLineNum = 22;BA.debugLine="Dim MyPanel As Panel";
metroui_moderntext._mypanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_mypanel",metroui_moderntext._mypanel);
 //BA.debugLineNum = 23;BA.debugLine="Dim MyTextboxB4X As B4XView";
metroui_moderntext._mytextboxb4x = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mytextboxb4x",metroui_moderntext._mytextboxb4x);
 //BA.debugLineNum = 26;BA.debugLine="Dim iconCircleB4X As B4XView";
metroui_moderntext._iconcircleb4x = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_iconcircleb4x",metroui_moderntext._iconcircleb4x);
 //BA.debugLineNum = 27;BA.debugLine="Dim iconCircle As Label";
metroui_moderntext._iconcircle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_iconcircle",metroui_moderntext._iconcircle);
 //BA.debugLineNum = 28;BA.debugLine="Private MyHintLabel As B4XView";
metroui_moderntext._myhintlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_myhintlabel",metroui_moderntext._myhintlabel);
 //BA.debugLineNum = 29;BA.debugLine="Private MyHLabel As Label 'MyHintLabel Buna Eşitl";
metroui_moderntext._myhlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_myhlabel",metroui_moderntext._myhlabel);
 //BA.debugLineNum = 31;BA.debugLine="Private MyErrorLabelB4X As B4XView";
metroui_moderntext._myerrorlabelb4x = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_myerrorlabelb4x",metroui_moderntext._myerrorlabelb4x);
 //BA.debugLineNum = 32;BA.debugLine="Private MyErrorLabel As Label 'MyHintLabel Buna E";
metroui_moderntext._myerrorlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_myerrorlabel",metroui_moderntext._myerrorlabel);
 //BA.debugLineNum = 34;BA.debugLine="Private ilkAcilis As Boolean=True";
metroui_moderntext._ilkacilis = metroui_moderntext.__c.getField(true,"True");__ref.setField("_ilkacilis",metroui_moderntext._ilkacilis);
 //BA.debugLineNum = 35;BA.debugLine="Private NormalHintArkaPlanUzunlugu As Double";
metroui_moderntext._normalhintarkaplanuzunlugu = RemoteObject.createImmutable(0);__ref.setField("_normalhintarkaplanuzunlugu",metroui_moderntext._normalhintarkaplanuzunlugu);
 //BA.debugLineNum = 38;BA.debugLine="Dim MyTextbox As EditText";
metroui_moderntext._mytextbox = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_mytextbox",metroui_moderntext._mytextbox);
 //BA.debugLineNum = 39;BA.debugLine="Dim PanelArkaPlanOzellikleri As ColorDrawable";
metroui_moderntext._panelarkaplanozellikleri = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");__ref.setField("_panelarkaplanozellikleri",metroui_moderntext._panelarkaplanozellikleri);
 //BA.debugLineNum = 48;BA.debugLine="Dim MyPanelRadiusProperty As Int";
metroui_moderntext._mypanelradiusproperty = RemoteObject.createImmutable(0);__ref.setField("_mypanelradiusproperty",metroui_moderntext._mypanelradiusproperty);
 //BA.debugLineNum = 49;BA.debugLine="Dim MyPanelBackgroundColorProperty As String";
metroui_moderntext._mypanelbackgroundcolorproperty = RemoteObject.createImmutable("");__ref.setField("_mypanelbackgroundcolorproperty",metroui_moderntext._mypanelbackgroundcolorproperty);
 //BA.debugLineNum = 50;BA.debugLine="Dim CircleColorProperty As Int";
metroui_moderntext._circlecolorproperty = RemoteObject.createImmutable(0);__ref.setField("_circlecolorproperty",metroui_moderntext._circlecolorproperty);
 //BA.debugLineNum = 51;BA.debugLine="Dim iconCircleSizeProperty As Int";
metroui_moderntext._iconcirclesizeproperty = RemoteObject.createImmutable(0);__ref.setField("_iconcirclesizeproperty",metroui_moderntext._iconcirclesizeproperty);
 //BA.debugLineNum = 52;BA.debugLine="Dim iconCircleColorProperty As String";
metroui_moderntext._iconcirclecolorproperty = RemoteObject.createImmutable("");__ref.setField("_iconcirclecolorproperty",metroui_moderntext._iconcirclecolorproperty);
 //BA.debugLineNum = 53;BA.debugLine="Dim HintNameProperty As String";
metroui_moderntext._hintnameproperty = RemoteObject.createImmutable("");__ref.setField("_hintnameproperty",metroui_moderntext._hintnameproperty);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clearerror(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearError (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "ba"),__ref,223);
if (RapidSub.canDelegate("clearerror")) { return __ref.runUserSub(false, "metroui_moderntext","clearerror", __ref);}
 BA.debugLineNum = 223;BA.debugLine="Public Sub ClearError";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 224;BA.debugLine="MyErrorLabel.Visible=False";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_myerrorlabel" /*RemoteObject*/ ).runMethod(true,"setVisible",metroui_moderntext.__c.getField(true,"False"));
 BA.debugLineNum = 225;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("DesignerCreateView (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "metroui_moderntext","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _hintyukseklik = RemoteObject.createImmutable(0);
RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
RemoteObject _svg = RemoteObject.declareNull("com.iox.ioxsvg.ioxsvg");
RemoteObject _val = null;
RemoteObject _colorset = RemoteObject.createImmutable("");
RemoteObject _iconfont = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
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
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 90;BA.debugLine="mBase.Tag = Me";
Debug.ShouldStop(33554432);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 94;BA.debugLine="Dim HintYukseklik As Int=DipToCurrent(MyHintLabel";
Debug.ShouldStop(536870912);
_hintyukseklik = metroui_moderntext.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"getTextSize"),RemoteObject.createImmutable(0.77)}, "/",0, 0))));Debug.locals.put("HintYukseklik", _hintyukseklik);Debug.locals.put("HintYukseklik", _hintyukseklik);
 BA.debugLineNum = 96;BA.debugLine="MyPanelRadiusProperty = Props.Get(\"MyPanelRadius\"";
Debug.ShouldStop(-2147483648);
__ref.setField ("_mypanelradiusproperty" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MyPanelRadius"))))));
 BA.debugLineNum = 97;BA.debugLine="MyPanelBackgroundColorProperty = Props.Get(\"MyPan";
Debug.ShouldStop(1);
__ref.setField ("_mypanelbackgroundcolorproperty" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MyPanelBackgroundColor"))))));
 BA.debugLineNum = 98;BA.debugLine="CircleColorProperty = Props.Get(\"CircleColor\")";
Debug.ShouldStop(2);
__ref.setField ("_circlecolorproperty" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CircleColor"))))));
 BA.debugLineNum = 99;BA.debugLine="iconCircleSizeProperty = Props.Get(\"iconCircleSiz";
Debug.ShouldStop(4);
__ref.setField ("_iconcirclesizeproperty" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("iconCircleSize"))))));
 BA.debugLineNum = 100;BA.debugLine="iconCircleColorProperty = Props.Get(\"iconCircleCo";
Debug.ShouldStop(8);
__ref.setField ("_iconcirclecolorproperty" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("iconCircleColor"))))));
 BA.debugLineNum = 101;BA.debugLine="HintNameProperty = Props.Get(\"HintText\")";
Debug.ShouldStop(16);
__ref.setField ("_hintnameproperty" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("HintText"))))));
 BA.debugLineNum = 108;BA.debugLine="PanelArkaPlanOzellikleri.Initialize2(MyPanelBackg";
Debug.ShouldStop(2048);
__ref.getField(false,"_panelarkaplanozellikleri" /*RemoteObject*/ ).runVoidMethod ("Initialize2",(Object)(BA.numberCast(int.class, __ref.getField(true,"_mypanelbackgroundcolorproperty" /*RemoteObject*/ ))),(Object)(__ref.getField(true,"_mypanelradiusproperty" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(metroui_moderntext.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 109;BA.debugLine="MyPanel.Background=PanelArkaPlanOzellikleri";
Debug.ShouldStop(4096);
__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runMethod(false,"setBackground",(__ref.getField(false,"_panelarkaplanozellikleri" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 120;BA.debugLine="mBase.AddView(MyPanel,0,0,mBase.Width,mBase.Heigh";
Debug.ShouldStop(8388608);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mypanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 126;BA.debugLine="MyPanel.AddView(MyTextboxB4X,60dip,0,mBase.Width-";
Debug.ShouldStop(536870912);
__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).getObject())),(Object)(metroui_moderntext.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),metroui_moderntext.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))}, "-",1, 1)),(Object)(__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 127;BA.debugLine="MyPanel.AddView(img,0,0,MyTextboxB4X.left  ,mBase";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_img" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),metroui_moderntext.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "-",1, 1)));
 BA.debugLineNum = 129;BA.debugLine="MyPanel.AddView(iconCircle,img.Left-5dip,img.Top,";
Debug.ShouldStop(1);
__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_iconcircle" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(true,"getLeft"),metroui_moderntext.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 1)),(Object)(__ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(__ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 131;BA.debugLine="MyTextboxB4X.Color=Colors.Transparent";
Debug.ShouldStop(4);
__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"setColor",metroui_moderntext.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 136;BA.debugLine="Dim c As Canvas";
Debug.ShouldStop(128);
_c = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("c", _c);
 BA.debugLineNum = 138;BA.debugLine="Dim b As Bitmap";
Debug.ShouldStop(512);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 139;BA.debugLine="Dim bc As ByteConverter";
Debug.ShouldStop(1024);
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 140;BA.debugLine="Dim svg As ioxSVG";
Debug.ShouldStop(2048);
_svg = RemoteObject.createNew ("com.iox.ioxsvg.ioxsvg");Debug.locals.put("svg", _svg);
 BA.debugLineNum = 141;BA.debugLine="Dim val(1) As Int";
Debug.ShouldStop(4096);
_val = RemoteObject.createNewArray ("int", new int[] {1}, new Object[]{});Debug.locals.put("val", _val);
 BA.debugLineNum = 142;BA.debugLine="val(0)=CircleColorProperty";
Debug.ShouldStop(8192);
_val.setArrayElement (__ref.getField(true,"_circlecolorproperty" /*RemoteObject*/ ),BA.numberCast(int.class, 0));
 BA.debugLineNum = 143;BA.debugLine="Dim ColorSet As String = bc.HexFromBytes(bc.IntsT";
Debug.ShouldStop(16384);
_colorset = _bc.runMethod(true,"HexFromBytes",(Object)(_bc.runMethod(false,"IntsToBytes",(Object)(_val))));Debug.locals.put("ColorSet", _colorset);Debug.locals.put("ColorSet", _colorset);
 BA.debugLineNum = 144;BA.debugLine="ColorSet=\"#\" & ColorSet.SubString(2)";
Debug.ShouldStop(32768);
_colorset = RemoteObject.concat(RemoteObject.createImmutable("#"),_colorset.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("ColorSet", _colorset);
 BA.debugLineNum = 145;BA.debugLine="b.InitializeMutable(img.Width,img.Height)";
Debug.ShouldStop(65536);
_b.runVoidMethod ("InitializeMutable",(Object)(__ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 146;BA.debugLine="c.Initialize2(b)";
Debug.ShouldStop(131072);
_c.runVoidMethod ("Initialize2",(Object)((_b.getObject())));
 BA.debugLineNum = 147;BA.debugLine="svg.Initialize2($\"<?xml version=\"1.0\" encoding=\"U";
Debug.ShouldStop(262144);
_svg.runVoidMethod ("_vvv3",(Object)((RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"),RemoteObject.createImmutable("	<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">\n"),RemoteObject.createImmutable("	<svg width=\"100%\" height=\"100%\" viewBox=\"0 0 128 115\" preserveAspectRatio=\"none\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\">\n"),RemoteObject.createImmutable("	<g id=\"#fc7424ff\">\n"),RemoteObject.createImmutable("	<path fill=\""),metroui_moderntext.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colorset))),RemoteObject.createImmutable("\" opacity=\"1.00\" d=\" M 37.22 3.35 C 45.06 -0.03 53.78 0.53 62.09 1.04 C 76.14 3.27 88.01 12.36 96.84 23.13 C 107.21 34.19 117.48 45.36 128.00 56.27 L 128.00 57.76 C 116.32 71.13 103.73 83.71 92.28 97.28 C 84.97 105.16 75.47 111.16 64.97 113.67 C 57.45 114.82 49.69 114.84 42.18 113.56 C 30.18 110.46 19.22 103.11 12.17 92.86 C 6.67 86.03 3.76 77.56 2.04 69.06 C 0.99 63.79 -0.11 58.36 0.85 52.98 C 2.18 45.24 3.63 37.35 7.29 30.31 C 13.44 18.03 24.11 7.82 37.22 3.35 Z\" />\n"),RemoteObject.createImmutable("	</g>\n"),RemoteObject.createImmutable("	</svg>\n"),RemoteObject.createImmutable("	")))));
 BA.debugLineNum = 155;BA.debugLine="svg.DocumentWidth = img.Width";
Debug.ShouldStop(67108864);
_svg.runMethod(true,"_setvvvv0",BA.numberCast(float.class, __ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(true,"getWidth")));
 BA.debugLineNum = 156;BA.debugLine="svg.DocumentHeight = img.Height";
Debug.ShouldStop(134217728);
_svg.runMethod(true,"_setvvvv5",BA.numberCast(float.class, __ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 157;BA.debugLine="svg.RenderToCanvas(c)";
Debug.ShouldStop(268435456);
_svg.runVoidMethod ("_vvv4",(Object)(_c));
 BA.debugLineNum = 158;BA.debugLine="img.Bitmap=b";
Debug.ShouldStop(536870912);
__ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(false,"setBitmap",(_b.getObject()));
 BA.debugLineNum = 170;BA.debugLine="Dim IconFont As B4XFont";
Debug.ShouldStop(512);
_iconfont = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");Debug.locals.put("IconFont", _iconfont);
 BA.debugLineNum = 172;BA.debugLine="IconFont = xui.CreateFont(Typeface.FONTAWESOME,i";
Debug.ShouldStop(2048);
_iconfont = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateFont",(Object)(metroui_moderntext.__c.getField(false,"Typeface").runMethod(false,"getFONTAWESOME")),(Object)(BA.numberCast(float.class, __ref.getField(true,"_iconcirclesizeproperty" /*RemoteObject*/ ))));Debug.locals.put("IconFont", _iconfont);
 BA.debugLineNum = 182;BA.debugLine="iconCircleB4X.SetTextAlignment(\"CENTER\",\"CENTER\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_iconcircleb4x" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 183;BA.debugLine="iconCircleB4X.TextColor=iconCircleColorProperty";
Debug.ShouldStop(4194304);
__ref.getField(false,"_iconcircleb4x" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, __ref.getField(true,"_iconcirclecolorproperty" /*RemoteObject*/ )));
 BA.debugLineNum = 184;BA.debugLine="iconCircleB4X.TextSize=iconCircleSizeProperty";
Debug.ShouldStop(8388608);
__ref.getField(false,"_iconcircleb4x" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, __ref.getField(true,"_iconcirclesizeproperty" /*RemoteObject*/ )));
 BA.debugLineNum = 186;BA.debugLine="iconCircleB4X.Font=IconFont";
Debug.ShouldStop(33554432);
__ref.getField(false,"_iconcircleb4x" /*RemoteObject*/ ).runMethod(false,"setFont",_iconfont);
 BA.debugLineNum = 187;BA.debugLine="iconCircleB4X.Text=\"\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_iconcircleb4x" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 189;BA.debugLine="MyHintLabel.Text=HintNameProperty";
Debug.ShouldStop(268435456);
__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_hintnameproperty" /*RemoteObject*/ )));
 BA.debugLineNum = 190;BA.debugLine="NormalHintArkaPlanUzunlugu=UzunlukHesapla(HintNam";
Debug.ShouldStop(536870912);
__ref.setField ("_normalhintarkaplanuzunlugu" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.metroui_moderntext.class, "_uzunlukhesapla" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_hintnameproperty" /*RemoteObject*/ ))));
 BA.debugLineNum = 191;BA.debugLine="MyPanel.AddView(MyHintLabel, MyTextboxB4X.Left +";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"getLeft"),metroui_moderntext.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2),metroui_moderntext.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 11)))}, "/-",1, 0))),(Object)(BA.numberCast(int.class, __ref.getField(true,"_normalhintarkaplanuzunlugu" /*RemoteObject*/ ))),(Object)(_hintyukseklik));
 BA.debugLineNum = 193;BA.debugLine="MyPanel.AddView(MyErrorLabel,MyTextboxB4X.Left +";
Debug.ShouldStop(1);
__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_myerrorlabel" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"getLeft"),metroui_moderntext.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runMethod(true,"getHeight"),metroui_moderntext.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 18)))}, "-",1, 1)),(Object)(__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(metroui_moderntext.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 194;BA.debugLine="MyErrorLabel.Visible=False";
Debug.ShouldStop(2);
__ref.getField(false,"_myerrorlabel" /*RemoteObject*/ ).runMethod(true,"setVisible",metroui_moderntext.__c.getField(true,"False"));
 BA.debugLineNum = 197;BA.debugLine="MyErrorLabelB4X.TextColor=xui.Color_Red";
Debug.ShouldStop(16);
__ref.getField(false,"_myerrorlabelb4x" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 BA.debugLineNum = 198;BA.debugLine="MyErrorLabelB4X.TextSize=11";
Debug.ShouldStop(32);
__ref.getField(false,"_myerrorlabelb4x" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 11));
 BA.debugLineNum = 199;BA.debugLine="MyErrorLabelB4X.Text=\"Lütfen E-Mail Adresinizi Gi";
Debug.ShouldStop(64);
__ref.getField(false,"_myerrorlabelb4x" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Lütfen E-Mail Adresinizi Giriniz!"));
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("getText (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "ba"),__ref,251);
if (RapidSub.canDelegate("gettext")) { return __ref.runUserSub(false, "metroui_moderntext","gettext", __ref);}
 BA.debugLineNum = 251;BA.debugLine="Public Sub getText As String";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 252;BA.debugLine="Return MyTextboxB4X.Text";
Debug.ShouldStop(134217728);
if (true) return __ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"getText");
 BA.debugLineNum = 253;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("getTextFont (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "ba"),__ref,259);
if (RapidSub.canDelegate("gettextfont")) { return __ref.runUserSub(false, "metroui_moderntext","gettextfont", __ref);}
 BA.debugLineNum = 259;BA.debugLine="Public Sub getTextFont As B4XFont";
Debug.ShouldStop(4);
 BA.debugLineNum = 260;BA.debugLine="Return MyTextboxB4X.Font";
Debug.ShouldStop(8);
if (true) return __ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(false,"getFont");
 BA.debugLineNum = 261;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Initialize (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "metroui_moderntext","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
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
__ref.getField(false,"_img" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("img")));
 BA.debugLineNum = 62;BA.debugLine="MyPanel.Initialize(\"MyPanel\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MyPanel")));
 BA.debugLineNum = 64;BA.debugLine="iconCircle.Initialize(\"iconCircle\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_iconcircle" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("iconCircle")));
 BA.debugLineNum = 65;BA.debugLine="MyHLabel.Initialize(\"MyHLabel\")";
Debug.ShouldStop(1);
__ref.getField(false,"_myhlabel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MyHLabel")));
 BA.debugLineNum = 66;BA.debugLine="MyErrorLabel.Initialize(\"MyErrorLabel\")";
Debug.ShouldStop(2);
__ref.getField(false,"_myerrorlabel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MyErrorLabel")));
 BA.debugLineNum = 69;BA.debugLine="MyTextbox.Initialize(\"MyTextbox\")";
Debug.ShouldStop(16);
__ref.getField(false,"_mytextbox" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MyTextbox")));
 BA.debugLineNum = 78;BA.debugLine="MyTextboxB4X=MyTextbox";
Debug.ShouldStop(8192);
__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).setObject (__ref.getField(false,"_mytextbox" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 79;BA.debugLine="iconCircleB4X=iconCircle";
Debug.ShouldStop(16384);
__ref.getField(false,"_iconcircleb4x" /*RemoteObject*/ ).setObject (__ref.getField(false,"_iconcircle" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 80;BA.debugLine="MyHintLabel=MyHLabel";
Debug.ShouldStop(32768);
__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).setObject (__ref.getField(false,"_myhlabel" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 81;BA.debugLine="MyErrorLabelB4X=MyErrorLabel";
Debug.ShouldStop(65536);
__ref.getField(false,"_myerrorlabelb4x" /*RemoteObject*/ ).setObject (__ref.getField(false,"_myerrorlabel" /*RemoteObject*/ ).getObject());
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
		Debug.PushSubsStack("MyTextBox_Action (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "ba"),__ref,326);
if (RapidSub.canDelegate("mytextbox_action")) { return __ref.runUserSub(false, "metroui_moderntext","mytextbox_action", __ref);}
 BA.debugLineNum = 326;BA.debugLine="Private Sub MyTextBox_Action";
Debug.ShouldStop(32);
 BA.debugLineNum = 327;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_EnterPr";
Debug.ShouldStop(64);
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_EnterPressed"))),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
metroui_moderntext.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_EnterPressed"))));};
 BA.debugLineNum = 328;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("MyTextBox_BeginEdit (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "ba"),__ref,263);
if (RapidSub.canDelegate("mytextbox_beginedit")) { return __ref.runUserSub(false, "metroui_moderntext","mytextbox_beginedit", __ref);}
 BA.debugLineNum = 263;BA.debugLine="Private Sub MyTextBox_BeginEdit";
Debug.ShouldStop(64);
 BA.debugLineNum = 264;BA.debugLine="CallSub2(Me,\"MyTextBox_FocusChanged\",True)";
Debug.ShouldStop(128);
metroui_moderntext.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("MyTextBox_FocusChanged")),(Object)((metroui_moderntext.__c.getField(true,"True"))));
 BA.debugLineNum = 265;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("MyTextBox_EndEdit (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "ba"),__ref,266);
if (RapidSub.canDelegate("mytextbox_endedit")) { return __ref.runUserSub(false, "metroui_moderntext","mytextbox_endedit", __ref);}
 BA.debugLineNum = 266;BA.debugLine="Private Sub MyTextBox_EndEdit";
Debug.ShouldStop(512);
 BA.debugLineNum = 267;BA.debugLine="CallSub2(Me,\"MyTextBox_FocusChanged\",False)";
Debug.ShouldStop(1024);
metroui_moderntext.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("MyTextBox_FocusChanged")),(Object)((metroui_moderntext.__c.getField(true,"False"))));
 BA.debugLineNum = 268;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("MyTextBox_EnterPressed (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "ba"),__ref,319);
if (RapidSub.canDelegate("mytextbox_enterpressed")) { return __ref.runUserSub(false, "metroui_moderntext","mytextbox_enterpressed", __ref);}
 BA.debugLineNum = 319;BA.debugLine="private Sub MyTextBox_EnterPressed";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 323;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_EnterPr";
Debug.ShouldStop(4);
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_EnterPressed"))),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
metroui_moderntext.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_EnterPressed"))));};
 BA.debugLineNum = 324;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("MyTextBox_FocusChanged (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "ba"),__ref,270);
if (RapidSub.canDelegate("mytextbox_focuschanged")) { return __ref.runUserSub(false, "metroui_moderntext","mytextbox_focuschanged", __ref, _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 270;BA.debugLine="Private Sub MyTextBox_FocusChanged (HasFocus As Bo";
Debug.ShouldStop(8192);
 BA.debugLineNum = 271;BA.debugLine="If HasFocus = False Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_hasfocus,metroui_moderntext.__c.getField(true,"False"))) { 
 BA.debugLineNum = 272;BA.debugLine="If MyTextboxB4X.Text.Length=0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 276;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
Debug.ShouldStop(524288);
__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2),metroui_moderntext.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "/-",1, 0))),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 }else 
{ BA.debugLineNum = 280;BA.debugLine="Else if MyTextboxB4X.Text.Length>0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 282;BA.debugLine="MyErrorLabel.Visible=False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_myerrorlabel" /*RemoteObject*/ ).runMethod(true,"setVisible",metroui_moderntext.__c.getField(true,"False"));
 BA.debugLineNum = 283;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
Debug.ShouldStop(67108864);
__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"getTop"),metroui_moderntext.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2.5)))}, "-",1, 1)),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 }}
;
 }else {
 BA.debugLineNum = 287;BA.debugLine="If MyTextboxB4X.Text.Length=0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 289;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
Debug.ShouldStop(1);
__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"getTop"),metroui_moderntext.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2.5)))}, "-",1, 1)),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 }else {
 };
 };
 BA.debugLineNum = 299;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
Debug.ShouldStop(1024);
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_FocusChanged"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
metroui_moderntext.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_FocusChanged"))),(Object)((_hasfocus)));};
 BA.debugLineNum = 300;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("MyTextBox_TextChanged (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "ba"),__ref,303);
if (RapidSub.canDelegate("mytextbox_textchanged")) { return __ref.runUserSub(false, "metroui_moderntext","mytextbox_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 303;BA.debugLine="Private Sub MyTextBox_TextChanged (Old As String,";
Debug.ShouldStop(16384);
 BA.debugLineNum = 305;BA.debugLine="If New.Length>Old.Length Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_new.runMethod(true,"length"),BA.numberCast(double.class, _old.runMethod(true,"length")))) { 
 BA.debugLineNum = 306;BA.debugLine="MyErrorLabel.Visible=False";
Debug.ShouldStop(131072);
__ref.getField(false,"_myerrorlabel" /*RemoteObject*/ ).runMethod(true,"setVisible",metroui_moderntext.__c.getField(true,"False"));
 BA.debugLineNum = 307;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.le";
Debug.ShouldStop(262144);
__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"getTop"),metroui_moderntext.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2.5)))}, "-",1, 1)),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 };
 BA.debugLineNum = 316;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_TextCha";
Debug.ShouldStop(134217728);
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TextChanged"))),(Object)(BA.numberCast(int.class, 2))).<Boolean>get().booleanValue()) { 
metroui_moderntext.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_TextChanged"))),(Object)((_old)),(Object)((_new)));};
 BA.debugLineNum = 317;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("setText (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "ba"),__ref,232);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "metroui_moderntext","settext", __ref, _text);}
Debug.locals.put("Text", _text);
 BA.debugLineNum = 232;BA.debugLine="Public Sub setText(Text As String)";
Debug.ShouldStop(128);
 BA.debugLineNum = 233;BA.debugLine="If ilkAcilis=True Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_ilkacilis" /*RemoteObject*/ ),metroui_moderntext.__c.getField(true,"True"))) { 
 BA.debugLineNum = 235;BA.debugLine="If Text.Length=0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_text.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 237;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
Debug.ShouldStop(4096);
__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mytextbox" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 }else {
 BA.debugLineNum = 242;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
Debug.ShouldStop(131072);
__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"getTop"),metroui_moderntext.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2.5)))}, "-",1, 1)),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 };
 };
 BA.debugLineNum = 245;BA.debugLine="MyTextboxB4X.Text=Text";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_text));
 BA.debugLineNum = 249;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("setTextFont (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "ba"),__ref,255);
if (RapidSub.canDelegate("settextfont")) { return __ref.runUserSub(false, "metroui_moderntext","settextfont", __ref, _fnt);}
Debug.locals.put("Fnt", _fnt);
 BA.debugLineNum = 255;BA.debugLine="Public Sub setTextFont(Fnt As B4XFont)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 256;BA.debugLine="MyTextboxB4X.Font=Fnt";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mytextboxb4x" /*RemoteObject*/ ).runMethod(false,"setFont",_fnt);
 BA.debugLineNum = 257;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("ShowError (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "ba"),__ref,218);
if (RapidSub.canDelegate("showerror")) { return __ref.runUserSub(false, "metroui_moderntext","showerror", __ref, _errortext);}
Debug.locals.put("ErrorText", _errortext);
 BA.debugLineNum = 218;BA.debugLine="Public Sub ShowError(ErrorText As String)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 219;BA.debugLine="MyErrorLabel.Visible=True";
Debug.ShouldStop(67108864);
__ref.getField(false,"_myerrorlabel" /*RemoteObject*/ ).runMethod(true,"setVisible",metroui_moderntext.__c.getField(true,"True"));
 BA.debugLineNum = 220;BA.debugLine="MyErrorLabel.Text=ErrorText";
Debug.ShouldStop(134217728);
__ref.getField(false,"_myerrorlabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_errortext));
 BA.debugLineNum = 221;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _uzunlukhesapla(RemoteObject __ref,RemoteObject _nametext) throws Exception{
try {
		Debug.PushSubsStack("UzunlukHesapla (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "ba"),__ref,205);
if (RapidSub.canDelegate("uzunlukhesapla")) { return __ref.runUserSub(false, "metroui_moderntext","uzunlukhesapla", __ref, _nametext);}
RemoteObject _uzunpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _canvas1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _rect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _sonuc = RemoteObject.createImmutable(0);
Debug.locals.put("NameText", _nametext);
 BA.debugLineNum = 205;BA.debugLine="Private Sub UzunlukHesapla (NameText As String) As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 206;BA.debugLine="Dim UzunPanel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(8192);
_uzunpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_uzunpanel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("UzunPanel", _uzunpanel);Debug.locals.put("UzunPanel", _uzunpanel);
 BA.debugLineNum = 207;BA.debugLine="UzunPanel.SetLayoutAnimated(0,0,0,MyPanel.Width,M";
Debug.ShouldStop(16384);
_uzunpanel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 208;BA.debugLine="Dim canvas1 As B4XCanvas";
Debug.ShouldStop(32768);
_canvas1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");Debug.locals.put("canvas1", _canvas1);
 BA.debugLineNum = 209;BA.debugLine="canvas1.Initialize(UzunPanel)";
Debug.ShouldStop(65536);
_canvas1.runVoidMethod ("Initialize",(Object)(_uzunpanel));
 BA.debugLineNum = 210;BA.debugLine="Dim Rect As B4XRect = canvas1.MeasureText(NameTex";
Debug.ShouldStop(131072);
_rect = _canvas1.runMethod(false,"MeasureText",(Object)(_nametext),(Object)(__ref.getField(false,"_myhintlabel" /*RemoteObject*/ ).runMethod(false,"getFont")));Debug.locals.put("Rect", _rect);Debug.locals.put("Rect", _rect);
 BA.debugLineNum = 211;BA.debugLine="Dim Sonuc As Double=(Rect.Width*1.08)";
Debug.ShouldStop(262144);
_sonuc = (RemoteObject.solve(new RemoteObject[] {_rect.runMethod(true,"getWidth"),RemoteObject.createImmutable(1.08)}, "*",0, 0));Debug.locals.put("Sonuc", _sonuc);Debug.locals.put("Sonuc", _sonuc);
 BA.debugLineNum = 215;BA.debugLine="Return Sonuc";
Debug.ShouldStop(4194304);
if (true) return _sonuc;
 BA.debugLineNum = 216;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}