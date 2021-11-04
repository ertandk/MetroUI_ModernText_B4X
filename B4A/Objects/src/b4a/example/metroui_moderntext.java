package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class metroui_moderntext extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.metroui_moderntext");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.metroui_moderntext.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
public String _color = "";
public anywheresoftware.b4a.objects.PanelWrapper _mypanel = null;
public anywheresoftware.b4a.objects.EditTextWrapper _mytextbox = null;
public anywheresoftware.b4a.objects.PanelWrapper _photopanel = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _base_resize(b4a.example.metroui_moderntext __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_moderntext";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.metroui_moderntext __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_moderntext";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="Dim Color As String";
_color = "";
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="Dim MyPanel As Panel";
_mypanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="Dim MyTextbox As EditText";
_mytextbox = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="Dim PhotoPanel As Panel";
_photopanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=851983;
 //BA.debugLineNum = 851983;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.metroui_moderntext __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_moderntext";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _panelarkaplanozellikleri = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _c = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
com.iox.ioxsvg.ioxsvg _svg = null;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="img.Gravity=Gravity.FILL";
__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="Dim PanelArkaPlanOzellikleri As ColorDrawable";
_panelarkaplanozellikleri = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="PanelArkaPlanOzellikleri.Initialize2(Colors.White";
_panelarkaplanozellikleri.Initialize2(__c.Colors.White,(int) (250),(int) (0),__c.Colors.White);
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="MyPanel.Background=PanelArkaPlanOzellikleri";
__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_panelarkaplanozellikleri.getObject()));
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="mBase.AddView(MyPanel,0,0,mBase.Width,mBase.Heigh";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="MyPanel.AddView(MyTextbox,70dip,0,mBase.Width-70d";
__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._mytextbox /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),__c.DipToCurrent((int) (70)),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (70))),__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="MyPanel.AddView(img,-0.5dip,0,MyTextbox.left  ,mB";
__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getObject()),(int) (-__c.DipToCurrent((int) (0.5))),(int) (0),__ref._mytextbox /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getLeft(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="MyTextbox.Color=Colors.Transparent";
__ref._mytextbox /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="Dim c As Canvas";
_c = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=983058;
 //BA.debugLineNum = 983058;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="Dim svg As ioxSVG";
_svg = new com.iox.ioxsvg.ioxsvg();
RDebugUtils.currentLine=983062;
 //BA.debugLineNum = 983062;BA.debugLine="b.InitializeMutable(img.Width,img.Height)";
_b.InitializeMutable(__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getWidth(),__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getHeight());
RDebugUtils.currentLine=983065;
 //BA.debugLineNum = 983065;BA.debugLine="c.Initialize2(b)";
_c.Initialize2((android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=983066;
 //BA.debugLineNum = 983066;BA.debugLine="Color=\"#067dc1\"";
__ref._color /*String*/  = "#067dc1";
RDebugUtils.currentLine=983068;
 //BA.debugLineNum = 983068;BA.debugLine="svg.Initialize2($\"<?xml version=\"1.0\" encoding=\"U";
_svg._vvv3(("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"+"	<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">\n"+"	<svg width=\"100%\" height=\"100%\" viewBox=\"0 0 128 115\" preserveAspectRatio=\"none\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\">\n"+"	<g id=\"#fc7424ff\">\n"+"	<path fill=\""+__c.SmartStringFormatter("",(Object)(__ref._color /*String*/ ))+"\" opacity=\"1.00\" d=\" M 37.22 3.35 C 45.06 -0.03 53.78 0.53 62.09 1.04 C 76.14 3.27 88.01 12.36 96.84 23.13 C 107.21 34.19 117.48 45.36 128.00 56.27 L 128.00 57.76 C 116.32 71.13 103.73 83.71 92.28 97.28 C 84.97 105.16 75.47 111.16 64.97 113.67 C 57.45 114.82 49.69 114.84 42.18 113.56 C 30.18 110.46 19.22 103.11 12.17 92.86 C 6.67 86.03 3.76 77.56 2.04 69.06 C 0.99 63.79 -0.11 58.36 0.85 52.98 C 2.18 45.24 3.63 37.35 7.29 30.31 C 13.44 18.03 24.11 7.82 37.22 3.35 Z\" />\n"+"	</g>\n"+"	</svg>\n"+"	"));
RDebugUtils.currentLine=983077;
 //BA.debugLineNum = 983077;BA.debugLine="svg.DocumentWidth = img.Width";
_svg._setvvvv0((float) (__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getWidth()));
RDebugUtils.currentLine=983078;
 //BA.debugLineNum = 983078;BA.debugLine="svg.DocumentHeight = img.Height";
_svg._setvvvv5((float) (__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=983080;
 //BA.debugLineNum = 983080;BA.debugLine="svg.RenderToCanvas(c)";
_svg._vvv4(_c);
RDebugUtils.currentLine=983081;
 //BA.debugLineNum = 983081;BA.debugLine="img.Bitmap=b";
__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=983084;
 //BA.debugLineNum = 983084;BA.debugLine="Log(img.Height)";
__c.LogImpl("0983084",BA.NumberToString(__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getHeight()),0);
RDebugUtils.currentLine=983086;
 //BA.debugLineNum = 983086;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.metroui_moderntext __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="metroui_moderntext";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="img.Initialize(\"img\")";
__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .Initialize(ba,"img");
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="MyPanel.Initialize(\"MyPanel\")";
__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"MyPanel");
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="PhotoPanel.Initialize(\"PhotoPanel\")";
__ref._photopanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"PhotoPanel");
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="MyTextbox.Initialize(\"MyTextbox\")";
__ref._mytextbox /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"MyTextbox");
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="End Sub";
return "";
}
}