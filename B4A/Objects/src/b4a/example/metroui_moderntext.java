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
public anywheresoftware.b4a.objects.B4XViewWrapper _labelb4x = null;
public anywheresoftware.b4a.objects.LabelWrapper _label = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _canvas1 = null;
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
RDebugUtils.currentLine=851985;
 //BA.debugLineNum = 851985;BA.debugLine="Private Labelb4x As B4XView";
_labelb4x = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=851986;
 //BA.debugLineNum = 851986;BA.debugLine="Private Label As Label";
_label = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=851988;
 //BA.debugLineNum = 851988;BA.debugLine="Dim PhotoPanel As Panel";
_photopanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=851990;
 //BA.debugLineNum = 851990;BA.debugLine="Dim canvas1 As Canvas";
_canvas1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=851992;
 //BA.debugLineNum = 851992;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.metroui_moderntext __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_moderntext";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _panelarkaplanozellikleri = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _iconfont = null;
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
_panelarkaplanozellikleri.Initialize2(__c.Colors.White,(int) (80),(int) (0),__c.Colors.White);
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="MyPanel.Background=PanelArkaPlanOzellikleri";
__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_panelarkaplanozellikleri.getObject()));
RDebugUtils.currentLine=983086;
 //BA.debugLineNum = 983086;BA.debugLine="Dim IconFont As B4XFont";
_iconfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=983088;
 //BA.debugLineNum = 983088;BA.debugLine="IconFont = xui.CreateFont(Typeface.LoadFromAssets";
_iconfont = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont(__c.Typeface.LoadFromAssets("icomoon.ttf"),(float) (128));
RDebugUtils.currentLine=983094;
 //BA.debugLineNum = 983094;BA.debugLine="Labelb4x.Font = IconFont";
__ref._labelb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(_iconfont);
RDebugUtils.currentLine=983096;
 //BA.debugLineNum = 983096;BA.debugLine="Labelb4x.TextSize = 50";
__ref._labelb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextSize((float) (50));
RDebugUtils.currentLine=983097;
 //BA.debugLineNum = 983097;BA.debugLine="Labelb4x.TextColor = xui.Color_Blue";
__ref._labelb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
RDebugUtils.currentLine=983098;
 //BA.debugLineNum = 983098;BA.debugLine="Labelb4x.Color=Colors.Red";
__ref._labelb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__c.Colors.Red);
RDebugUtils.currentLine=983099;
 //BA.debugLineNum = 983099;BA.debugLine="Labelb4x.SetTextAlignment(\"CENTER\",\"CENTER\")";
__ref._labelb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=983101;
 //BA.debugLineNum = 983101;BA.debugLine="Labelb4x.Text = Chr(0xe900)";
__ref._labelb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__c.Chr((int) (0xe900))));
RDebugUtils.currentLine=983103;
 //BA.debugLineNum = 983103;BA.debugLine="mBase.AddView(MyPanel,0,0,mBase.Width,mBase.Heigh";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=983105;
 //BA.debugLineNum = 983105;BA.debugLine="MyPanel.AddView(Labelb4x,0,0,150,MyPanel.Height)";
__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._labelb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (150),__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=983107;
 //BA.debugLineNum = 983107;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="Label.Initialize(\"Label\")";
__ref._label /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"Label");
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="Labelb4x  = Label";
__ref._labelb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._label /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()));
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="End Sub";
return "";
}
}