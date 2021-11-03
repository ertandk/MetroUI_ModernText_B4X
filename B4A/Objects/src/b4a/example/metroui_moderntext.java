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
public String  _base_resize(b4a.example.metroui_moderntext __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_moderntext";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.metroui_moderntext __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_moderntext";
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=8454149;
 //BA.debugLineNum = 8454149;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=8454151;
 //BA.debugLineNum = 8454151;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=8454152;
 //BA.debugLineNum = 8454152;BA.debugLine="Dim Color As String";
_color = "";
RDebugUtils.currentLine=8454154;
 //BA.debugLineNum = 8454154;BA.debugLine="Dim MyPanel As Panel";
_mypanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8454155;
 //BA.debugLineNum = 8454155;BA.debugLine="Dim MyTextbox As EditText";
_mytextbox = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=8454157;
 //BA.debugLineNum = 8454157;BA.debugLine="Dim PhotoPanel As Panel";
_photopanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8454159;
 //BA.debugLineNum = 8454159;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.metroui_moderntext __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_moderntext";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper _c = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
com.iox.ioxsvg.ioxsvg _svg = null;
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=8585220;
 //BA.debugLineNum = 8585220;BA.debugLine="img.Gravity=Gravity.FILL";
__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=8585222;
 //BA.debugLineNum = 8585222;BA.debugLine="mBase.AddView(img,0,0,mBase.Width,mBase.Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=8585224;
 //BA.debugLineNum = 8585224;BA.debugLine="Dim c As Canvas";
_c = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=8585226;
 //BA.debugLineNum = 8585226;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=8585228;
 //BA.debugLineNum = 8585228;BA.debugLine="Dim svg As ioxSVG";
_svg = new com.iox.ioxsvg.ioxsvg();
RDebugUtils.currentLine=8585229;
 //BA.debugLineNum = 8585229;BA.debugLine="b.InitializeMutable(img.Width,img.Height)";
_b.InitializeMutable(__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getWidth(),__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getHeight());
RDebugUtils.currentLine=8585231;
 //BA.debugLineNum = 8585231;BA.debugLine="c.Initialize2(b)";
_c.Initialize2((android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=8585232;
 //BA.debugLineNum = 8585232;BA.debugLine="Color=\"#000000\"";
__ref._color /*String*/  = "#000000";
RDebugUtils.currentLine=8585234;
 //BA.debugLineNum = 8585234;BA.debugLine="svg.Initialize2($\"<?xml version=\"1.0\" encoding=\"U";
_svg._vvv3(("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"+"	<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">\n"+"	<svg width=\"100%\" height=\"100%\" viewBox=\"0 0 100% 100%\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\">\n"+"	<g id=\"#fc7424ff\">\n"+"	<path fill=\""+__c.SmartStringFormatter("",(Object)(__ref._color /*String*/ ))+"\" opacity=\"1.00\" d=\" M 37.22 3.35 C 45.06 -0.03 53.78 0.53 62.09 1.04 C 76.14 3.27 88.01 12.36 96.84 23.13 C 107.21 34.19 117.48 45.36 128.00 56.27 L 128.00 57.76 C 116.32 71.13 103.73 83.71 92.28 97.28 C 84.97 105.16 75.47 111.16 64.97 113.67 C 57.45 114.82 49.69 114.84 42.18 113.56 C 30.18 110.46 19.22 103.11 12.17 92.86 C 6.67 86.03 3.76 77.56 2.04 69.06 C 0.99 63.79 -0.11 58.36 0.85 52.98 C 2.18 45.24 3.63 37.35 7.29 30.31 C 13.44 18.03 24.11 7.82 37.22 3.35 Z\" />\n"+"	</g>\n"+"	</svg>\n"+"	"));
RDebugUtils.currentLine=8585245;
 //BA.debugLineNum = 8585245;BA.debugLine="Log(svg.DocumentWidth)";
__c.LogImpl("88585245",BA.NumberToString(_svg._getvvvv0()),0);
RDebugUtils.currentLine=8585246;
 //BA.debugLineNum = 8585246;BA.debugLine="Log(c.Bitmap.Width)";
__c.LogImpl("88585246",BA.NumberToString(_c.getBitmap().getWidth()),0);
RDebugUtils.currentLine=8585247;
 //BA.debugLineNum = 8585247;BA.debugLine="Log(b.Width)";
__c.LogImpl("88585247",BA.NumberToString(_b.getWidth()),0);
RDebugUtils.currentLine=8585253;
 //BA.debugLineNum = 8585253;BA.debugLine="svg.DocumentWidth = img.Width";
_svg._setvvvv0((float) (__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getWidth()));
RDebugUtils.currentLine=8585254;
 //BA.debugLineNum = 8585254;BA.debugLine="svg.DocumentHeight = img.Height";
_svg._setvvvv5((float) (__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=8585255;
 //BA.debugLineNum = 8585255;BA.debugLine="svg.RenderToCanvas(c)";
_svg._vvv4(_c);
RDebugUtils.currentLine=8585256;
 //BA.debugLineNum = 8585256;BA.debugLine="img.Bitmap=b";
__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=8585259;
 //BA.debugLineNum = 8585259;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.metroui_moderntext __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="metroui_moderntext";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="img.Initialize(\"img\")";
__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .Initialize(ba,"img");
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="MyPanel.Initialize(\"MyPanel\")";
__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"MyPanel");
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="PhotoPanel.Initialize(\"PhotoPanel\")";
__ref._photopanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"PhotoPanel");
RDebugUtils.currentLine=8519686;
 //BA.debugLineNum = 8519686;BA.debugLine="MyTextbox.Initialize(\"MyTextbox\")";
__ref._mytextbox /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"MyTextbox");
RDebugUtils.currentLine=8519687;
 //BA.debugLineNum = 8519687;BA.debugLine="End Sub";
return "";
}
}