package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class metroui_moderntext_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "metroui_moderntext","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 112;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(32768);
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
 //BA.debugLineNum = 19;BA.debugLine="Private Labelb4x As B4XView";
metroui_moderntext._labelb4x = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_labelb4x",metroui_moderntext._labelb4x);
 //BA.debugLineNum = 20;BA.debugLine="Private Label As Label";
metroui_moderntext._label = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label",metroui_moderntext._label);
 //BA.debugLineNum = 22;BA.debugLine="Dim PhotoPanel As Panel";
metroui_moderntext._photopanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_photopanel",metroui_moderntext._photopanel);
 //BA.debugLineNum = 24;BA.debugLine="Dim canvas1 As Canvas";
metroui_moderntext._canvas1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");__ref.setField("_canvas1",metroui_moderntext._canvas1);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "metroui_moderntext","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _panelarkaplanozellikleri = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _iconfont = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
Debug.locals.put("Base", _base);
Debug.locals.put("lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 43;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="mBase = Base";
Debug.ShouldStop(2048);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 45;BA.debugLine="Tag = mBase.Tag";
Debug.ShouldStop(4096);
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 46;BA.debugLine="mBase.Tag = Me";
Debug.ShouldStop(8192);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 47;BA.debugLine="img.Gravity=Gravity.FILL";
Debug.ShouldStop(16384);
__ref.getField(false,"_img" /*RemoteObject*/ ).runMethod(true,"setGravity",metroui_moderntext.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 49;BA.debugLine="Dim PanelArkaPlanOzellikleri As ColorDrawable";
Debug.ShouldStop(65536);
_panelarkaplanozellikleri = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("PanelArkaPlanOzellikleri", _panelarkaplanozellikleri);
 BA.debugLineNum = 50;BA.debugLine="PanelArkaPlanOzellikleri.Initialize2(Colors.White";
Debug.ShouldStop(131072);
_panelarkaplanozellikleri.runVoidMethod ("Initialize2",(Object)(metroui_moderntext.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 80)),(Object)(BA.numberCast(int.class, 0)),(Object)(metroui_moderntext.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 51;BA.debugLine="MyPanel.Background=PanelArkaPlanOzellikleri";
Debug.ShouldStop(262144);
__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runMethod(false,"setBackground",(_panelarkaplanozellikleri.getObject()));
 BA.debugLineNum = 89;BA.debugLine="Dim IconFont As B4XFont";
Debug.ShouldStop(16777216);
_iconfont = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");Debug.locals.put("IconFont", _iconfont);
 BA.debugLineNum = 91;BA.debugLine="IconFont = xui.CreateFont(Typeface.LoadFromAssets";
Debug.ShouldStop(67108864);
_iconfont = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateFont",(Object)(metroui_moderntext.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("icomoon.ttf")))),(Object)(BA.numberCast(float.class, 128)));Debug.locals.put("IconFont", _iconfont);
 BA.debugLineNum = 97;BA.debugLine="Labelb4x.Font = IconFont";
Debug.ShouldStop(1);
__ref.getField(false,"_labelb4x" /*RemoteObject*/ ).runMethod(false,"setFont",_iconfont);
 BA.debugLineNum = 99;BA.debugLine="Labelb4x.TextSize = 50";
Debug.ShouldStop(4);
__ref.getField(false,"_labelb4x" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, 50));
 BA.debugLineNum = 100;BA.debugLine="Labelb4x.TextColor = xui.Color_Blue";
Debug.ShouldStop(8);
__ref.getField(false,"_labelb4x" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 BA.debugLineNum = 101;BA.debugLine="Labelb4x.Color=Colors.Red";
Debug.ShouldStop(16);
__ref.getField(false,"_labelb4x" /*RemoteObject*/ ).runMethod(true,"setColor",metroui_moderntext.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 102;BA.debugLine="Labelb4x.SetTextAlignment(\"CENTER\",\"CENTER\")";
Debug.ShouldStop(32);
__ref.getField(false,"_labelb4x" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 104;BA.debugLine="Labelb4x.Text = Chr(0xe900)";
Debug.ShouldStop(128);
__ref.getField(false,"_labelb4x" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(metroui_moderntext.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe900)))));
 BA.debugLineNum = 106;BA.debugLine="mBase.AddView(MyPanel,0,0,mBase.Width,mBase.Heigh";
Debug.ShouldStop(512);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mypanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 108;BA.debugLine="MyPanel.AddView(Labelb4x,0,0,150,MyPanel.Height)";
Debug.ShouldStop(2048);
__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_labelb4x" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 150)),(Object)(__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Initialize (metroui_moderntext) ","metroui_moderntext",2,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "metroui_moderntext","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 28;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(268435456);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 30;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(536870912);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 31;BA.debugLine="img.Initialize(\"img\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_img" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("img")));
 BA.debugLineNum = 32;BA.debugLine="MyPanel.Initialize(\"MyPanel\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mypanel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MyPanel")));
 BA.debugLineNum = 33;BA.debugLine="PhotoPanel.Initialize(\"PhotoPanel\")";
Debug.ShouldStop(1);
__ref.getField(false,"_photopanel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("PhotoPanel")));
 BA.debugLineNum = 34;BA.debugLine="MyTextbox.Initialize(\"MyTextbox\")";
Debug.ShouldStop(2);
__ref.getField(false,"_mytextbox" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MyTextbox")));
 BA.debugLineNum = 36;BA.debugLine="Label.Initialize(\"Label\")";
Debug.ShouldStop(8);
__ref.getField(false,"_label" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Label")));
 BA.debugLineNum = 38;BA.debugLine="Labelb4x  = Label";
Debug.ShouldStop(32);
__ref.getField(false,"_labelb4x" /*RemoteObject*/ ).setObject (__ref.getField(false,"_label" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}