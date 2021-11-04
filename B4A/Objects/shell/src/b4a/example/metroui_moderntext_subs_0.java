package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class metroui_moderntext_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "metroui_moderntext","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 79;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(16384);
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private mEventName As String 'ignore";
metroui_moderntext._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",metroui_moderntext._meventname);
 //BA.debugLineNum = 4;BA.debugLine="Private mCallBack As Object 'ignore";
metroui_moderntext._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",metroui_moderntext._mcallback);
 //BA.debugLineNum = 5;BA.debugLine="Public mBase As B4XView";
metroui_moderntext._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",metroui_moderntext._mbase);
 //BA.debugLineNum = 6;BA.debugLine="Private xui As XUI 'ignore";
metroui_moderntext._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",metroui_moderntext._xui);
 //BA.debugLineNum = 7;BA.debugLine="Public Tag As Object";
metroui_moderntext._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",metroui_moderntext._tag);
 //BA.debugLineNum = 9;BA.debugLine="Dim img As ImageView";
metroui_moderntext._img = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_img",metroui_moderntext._img);
 //BA.debugLineNum = 10;BA.debugLine="Dim Color As String";
metroui_moderntext._color = RemoteObject.createImmutable("");__ref.setField("_color",metroui_moderntext._color);
 //BA.debugLineNum = 12;BA.debugLine="Dim MyPanel As Panel";
metroui_moderntext._mypanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_mypanel",metroui_moderntext._mypanel);
 //BA.debugLineNum = 13;BA.debugLine="Dim MyTextbox As EditText";
metroui_moderntext._mytextbox = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_mytextbox",metroui_moderntext._mytextbox);
 //BA.debugLineNum = 15;BA.debugLine="Dim PhotoPanel As Panel";
metroui_moderntext._photopanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_photopanel",metroui_moderntext._photopanel);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "metroui_moderntext","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _panelarkaplanozellikleri = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _svg = RemoteObject.declareNull("com.iox.ioxsvg.ioxsvg");
Debug.locals.put("Base", _base);
Debug.locals.put("lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 31;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="mBase = Base";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 33;BA.debugLine="Tag = mBase.Tag";
Debug.ShouldStop(1);
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 34;BA.debugLine="mBase.Tag = Me";
Debug.ShouldStop(2);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 35;BA.debugLine="img.Gravity=Gravity.FILL";
Debug.ShouldStop(4);
__ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(true,"setGravity",metroui_moderntext.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 37;BA.debugLine="Dim PanelArkaPlanOzellikleri As ColorDrawable";
Debug.ShouldStop(16);
_panelarkaplanozellikleri = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("PanelArkaPlanOzellikleri", _panelarkaplanozellikleri);
 BA.debugLineNum = 38;BA.debugLine="PanelArkaPlanOzellikleri.Initialize2(Colors.White";
Debug.ShouldStop(32);
_panelarkaplanozellikleri.runVoidMethod ("Initialize2",(Object)(metroui_moderntext.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 250)),(Object)(BA.numberCast(int.class, 0)),(Object)(metroui_moderntext.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 39;BA.debugLine="MyPanel.Background=PanelArkaPlanOzellikleri";
Debug.ShouldStop(64);
__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runMethod(false,"setBackground",(_panelarkaplanozellikleri.getObject()));
 BA.debugLineNum = 41;BA.debugLine="mBase.AddView(MyPanel,0,0,mBase.Width,mBase.Heigh";
Debug.ShouldStop(256);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mypanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 42;BA.debugLine="MyPanel.AddView(MyTextbox,70dip,0,mBase.Width-70d";
Debug.ShouldStop(512);
__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mytextbox" /*RemoteObject*/ ).getObject())),(Object)(metroui_moderntext.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),metroui_moderntext.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))}, "-",1, 1)),(Object)(__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 43;BA.debugLine="MyPanel.AddView(img,-0.5dip,0,MyTextbox.left  ,mB";
Debug.ShouldStop(1024);
__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_img" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, -(double) (0 + metroui_moderntext.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0.5))).<Integer>get().intValue()))),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mytextbox" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 45;BA.debugLine="MyTextbox.Color=Colors.Transparent";
Debug.ShouldStop(4096);
__ref.getField(false,"_mytextbox" /*RemoteObject*/ ).runVoidMethod ("setColor",metroui_moderntext.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 47;BA.debugLine="Dim c As Canvas";
Debug.ShouldStop(16384);
_c = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("c", _c);
 BA.debugLineNum = 49;BA.debugLine="Dim b As Bitmap";
Debug.ShouldStop(65536);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 51;BA.debugLine="Dim svg As ioxSVG";
Debug.ShouldStop(262144);
_svg = RemoteObject.createNew ("com.iox.ioxsvg.ioxsvg");Debug.locals.put("svg", _svg);
 BA.debugLineNum = 53;BA.debugLine="b.InitializeMutable(img.Width,img.Height)";
Debug.ShouldStop(1048576);
_b.runVoidMethod ("InitializeMutable",(Object)(__ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 56;BA.debugLine="c.Initialize2(b)";
Debug.ShouldStop(8388608);
_c.runVoidMethod ("Initialize2",(Object)((_b.getObject())));
 BA.debugLineNum = 57;BA.debugLine="Color=\"#067dc1\"";
Debug.ShouldStop(16777216);
__ref.setField ("_color" /*RemoteObject*/ ,BA.ObjectToString("#067dc1"));
 BA.debugLineNum = 59;BA.debugLine="svg.Initialize2($\"<?xml version=\"1.0\" encoding=\"U";
Debug.ShouldStop(67108864);
_svg.runVoidMethod ("_vvv3",(Object)((RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"),RemoteObject.createImmutable("	<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">\n"),RemoteObject.createImmutable("	<svg width=\"100%\" height=\"100%\" viewBox=\"0 0 128 115\" preserveAspectRatio=\"none\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\">\n"),RemoteObject.createImmutable("	<g id=\"#fc7424ff\">\n"),RemoteObject.createImmutable("	<path fill=\""),metroui_moderntext.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_color" /*RemoteObject*/ )))),RemoteObject.createImmutable("\" opacity=\"1.00\" d=\" M 37.22 3.35 C 45.06 -0.03 53.78 0.53 62.09 1.04 C 76.14 3.27 88.01 12.36 96.84 23.13 C 107.21 34.19 117.48 45.36 128.00 56.27 L 128.00 57.76 C 116.32 71.13 103.73 83.71 92.28 97.28 C 84.97 105.16 75.47 111.16 64.97 113.67 C 57.45 114.82 49.69 114.84 42.18 113.56 C 30.18 110.46 19.22 103.11 12.17 92.86 C 6.67 86.03 3.76 77.56 2.04 69.06 C 0.99 63.79 -0.11 58.36 0.85 52.98 C 2.18 45.24 3.63 37.35 7.29 30.31 C 13.44 18.03 24.11 7.82 37.22 3.35 Z\" />\n"),RemoteObject.createImmutable("	</g>\n"),RemoteObject.createImmutable("	</svg>\n"),RemoteObject.createImmutable("	")))));
 BA.debugLineNum = 68;BA.debugLine="svg.DocumentWidth = img.Width";
Debug.ShouldStop(8);
_svg.runMethod(true,"_setvvvv0",BA.numberCast(float.class, __ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(true,"getWidth")));
 BA.debugLineNum = 69;BA.debugLine="svg.DocumentHeight = img.Height";
Debug.ShouldStop(16);
_svg.runMethod(true,"_setvvvv5",BA.numberCast(float.class, __ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 71;BA.debugLine="svg.RenderToCanvas(c)";
Debug.ShouldStop(64);
_svg.runVoidMethod ("_vvv4",(Object)(_c));
 BA.debugLineNum = 72;BA.debugLine="img.Bitmap=b";
Debug.ShouldStop(128);
__ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(false,"setBitmap",(_b.getObject()));
 BA.debugLineNum = 75;BA.debugLine="Log(img.Height)";
Debug.ShouldStop(1024);
metroui_moderntext.__c.runVoidMethod ("LogImpl","0983084",BA.NumberToString(__ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(true,"getHeight")),0);
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "metroui_moderntext","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(524288);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 21;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(1048576);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 22;BA.debugLine="img.Initialize(\"img\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_img" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("img")));
 BA.debugLineNum = 23;BA.debugLine="MyPanel.Initialize(\"MyPanel\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MyPanel")));
 BA.debugLineNum = 24;BA.debugLine="PhotoPanel.Initialize(\"PhotoPanel\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_photopanel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("PhotoPanel")));
 BA.debugLineNum = 25;BA.debugLine="MyTextbox.Initialize(\"MyTextbox\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mytextbox" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MyTextbox")));
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}