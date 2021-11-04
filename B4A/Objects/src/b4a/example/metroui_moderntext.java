package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class metroui_moderntext extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.metroui_moderntext");
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
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 4;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 5;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 7;BA.debugLine="Public Tag As Object";
_tag = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Dim Color As String";
_color = "";
 //BA.debugLineNum = 12;BA.debugLine="Dim MyPanel As Panel";
_mypanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Dim MyTextbox As EditText";
_mytextbox = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Dim PhotoPanel As Panel";
_photopanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.drawable.ColorDrawable _panelarkaplanozellikleri = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _c = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
com.iox.ioxsvg.ioxsvg _svg = null;
 //BA.debugLineNum = 29;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 30;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 31;BA.debugLine="Tag = mBase.Tag";
_tag = _mbase.getTag();
 //BA.debugLineNum = 32;BA.debugLine="mBase.Tag = Me";
_mbase.setTag(this);
 //BA.debugLineNum = 33;BA.debugLine="img.Gravity=Gravity.FILL";
_img.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 35;BA.debugLine="Dim PanelArkaPlanOzellikleri As ColorDrawable";
_panelarkaplanozellikleri = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 36;BA.debugLine="PanelArkaPlanOzellikleri.Initialize2(Colors.White";
_panelarkaplanozellikleri.Initialize2(__c.Colors.White,(int) (70),(int) (0),__c.Colors.White);
 //BA.debugLineNum = 37;BA.debugLine="MyPanel.Background=PanelArkaPlanOzellikleri";
_mypanel.setBackground((android.graphics.drawable.Drawable)(_panelarkaplanozellikleri.getObject()));
 //BA.debugLineNum = 39;BA.debugLine="mBase.AddView(MyPanel,0,0,mBase.Width,51.5dip)";
_mbase.AddView((android.view.View)(_mypanel.getObject()),(int) (0),(int) (0),_mbase.getWidth(),__c.DipToCurrent((int) (51.5)));
 //BA.debugLineNum = 40;BA.debugLine="MyPanel.AddView(MyTextbox,55dip,0,mBase.Width-70d";
_mypanel.AddView((android.view.View)(_mytextbox.getObject()),__c.DipToCurrent((int) (55)),(int) (0),(int) (_mbase.getWidth()-__c.DipToCurrent((int) (70))),_mypanel.getHeight());
 //BA.debugLineNum = 41;BA.debugLine="MyPanel.AddView(img,-7.8dip,0,MyTextbox.Left+10di";
_mypanel.AddView((android.view.View)(_img.getObject()),(int) (-__c.DipToCurrent((int) (7.8))),(int) (0),(int) (_mytextbox.getLeft()+__c.DipToCurrent((int) (10))),_mbase.getHeight());
 //BA.debugLineNum = 43;BA.debugLine="MyTextbox.Color=Colors.Transparent";
_mytextbox.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 45;BA.debugLine="Dim c As Canvas";
_c = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Dim svg As ioxSVG";
_svg = new com.iox.ioxsvg.ioxsvg();
 //BA.debugLineNum = 51;BA.debugLine="If img.Height<500 Then";
if (_img.getHeight()<500) { 
 //BA.debugLineNum = 53;BA.debugLine="b.InitializeMutable(img.Width,img.Height * 0.898";
_b.InitializeMutable(_img.getWidth(),(int) (_img.getHeight()*0.89843));
 }else {
 //BA.debugLineNum = 57;BA.debugLine="b.InitializeMutable(img.Width,img.Height - 850)";
_b.InitializeMutable(_img.getWidth(),(int) (_img.getHeight()-850));
 };
 //BA.debugLineNum = 62;BA.debugLine="c.Initialize2(b)";
_c.Initialize2((android.graphics.Bitmap)(_b.getObject()));
 //BA.debugLineNum = 63;BA.debugLine="Color=\"#067dc1\"";
_color = "#067dc1";
 //BA.debugLineNum = 65;BA.debugLine="svg.Initialize2($\"<?xml version=\"1.0\" encoding=\"U";
_svg._vvv3(("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"+"	<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">\n"+"	<svg width=\"128pt\" height=\"115pt\" viewBox=\"0 0 128 115\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\">\n"+"	<g id=\"#fc7424ff\">\n"+"	<path fill=\""+__c.SmartStringFormatter("",(Object)(_color))+"\" opacity=\"1.00\" d=\" M 37.22 3.35 C 45.06 -0.03 53.78 0.53 62.09 1.04 C 76.14 3.27 88.01 12.36 96.84 23.13 C 107.21 34.19 117.48 45.36 128.00 56.27 L 128.00 57.76 C 116.32 71.13 103.73 83.71 92.28 97.28 C 84.97 105.16 75.47 111.16 64.97 113.67 C 57.45 114.82 49.69 114.84 42.18 113.56 C 30.18 110.46 19.22 103.11 12.17 92.86 C 6.67 86.03 3.76 77.56 2.04 69.06 C 0.99 63.79 -0.11 58.36 0.85 52.98 C 2.18 45.24 3.63 37.35 7.29 30.31 C 13.44 18.03 24.11 7.82 37.22 3.35 Z\" />\n"+"	</g>\n"+"	</svg>\n"+"	"));
 //BA.debugLineNum = 74;BA.debugLine="svg.DocumentWidth = img.Width";
_svg._setvvvv0((float) (_img.getWidth()));
 //BA.debugLineNum = 75;BA.debugLine="If img.Height<500 Then";
if (_img.getHeight()<500) { 
 //BA.debugLineNum = 77;BA.debugLine="svg.DocumentHeight = img.Height * 0.89843";
_svg._setvvvv5((float) (_img.getHeight()*0.89843));
 }else {
 //BA.debugLineNum = 81;BA.debugLine="svg.DocumentHeight = img.Height - 850";
_svg._setvvvv5((float) (_img.getHeight()-850));
 };
 //BA.debugLineNum = 84;BA.debugLine="svg.RenderToCanvas(c)";
_svg._vvv4(_c);
 //BA.debugLineNum = 85;BA.debugLine="img.Bitmap=b";
_img.setBitmap((android.graphics.Bitmap)(_b.getObject()));
 //BA.debugLineNum = 87;BA.debugLine="Log(img.Height)";
__c.LogImpl("8983098",BA.NumberToString(_img.getHeight()),0);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 20;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 21;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 22;BA.debugLine="img.Initialize(\"img\")";
_img.Initialize(ba,"img");
 //BA.debugLineNum = 23;BA.debugLine="MyPanel.Initialize(\"MyPanel\")";
_mypanel.Initialize(ba,"MyPanel");
 //BA.debugLineNum = 24;BA.debugLine="PhotoPanel.Initialize(\"PhotoPanel\")";
_photopanel.Initialize(ba,"PhotoPanel");
 //BA.debugLineNum = 25;BA.debugLine="MyTextbox.Initialize(\"MyTextbox\")";
_mytextbox.Initialize(ba,"MyTextbox");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
