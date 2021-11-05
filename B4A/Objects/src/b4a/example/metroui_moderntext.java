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
public anywheresoftware.b4a.objects.PanelWrapper _mypanel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mytextboxb4x = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _iconcircleb4x = null;
public anywheresoftware.b4a.objects.LabelWrapper _iconcircle = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _myhintlabel = null;
public anywheresoftware.b4a.objects.LabelWrapper _myhlabel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _myerrorlabelb4x = null;
public anywheresoftware.b4a.objects.LabelWrapper _myerrorlabel = null;
public boolean _ilkacilis = false;
public double _normalhintarkaplanuzunlugu = 0;
public anywheresoftware.b4a.objects.EditTextWrapper _mytextbox = null;
public anywheresoftware.b4a.objects.drawable.ColorDrawable _panelarkaplanozellikleri = null;
public int _mypanelradiusproperty = 0;
public String _mypanelbackgroundcolorproperty = "";
public int _circlecolorproperty = 0;
public int _iconcirclesizeproperty = 0;
public String _iconcirclecolorproperty = "";
public String _hintnameproperty = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _gettext(b4a.example.metroui_moderntext __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_moderntext";
if (Debug.shouldDelegate(ba, "gettext", false))
	 {return ((String) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub getText As String";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Return MyTextboxB4X.Text";
if (true) return __ref._mytextboxb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return "";
}
public String  _showerror(b4a.example.metroui_moderntext __ref,String _errortext) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_moderntext";
if (Debug.shouldDelegate(ba, "showerror", false))
	 {return ((String) Debug.delegate(ba, "showerror", new Object[] {_errortext}));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub ShowError(ErrorText As String)";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="MyErrorLabel.Visible=True";
__ref._myerrorlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="MyErrorLabel.Text=ErrorText";
__ref._myerrorlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_errortext));
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.example.metroui_moderntext __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_moderntext";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.metroui_moderntext __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_moderntext";
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="Dim MyPanel As Panel";
_mypanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="Dim MyTextboxB4X As B4XView";
_mytextboxb4x = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="Dim iconCircleB4X As B4XView";
_iconcircleb4x = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=917520;
 //BA.debugLineNum = 917520;BA.debugLine="Dim iconCircle As Label";
_iconcircle = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=917521;
 //BA.debugLineNum = 917521;BA.debugLine="Private MyHintLabel As B4XView";
_myhintlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=917522;
 //BA.debugLineNum = 917522;BA.debugLine="Private MyHLabel As Label 'MyHintLabel Buna Eşitl";
_myhlabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=917524;
 //BA.debugLineNum = 917524;BA.debugLine="Private MyErrorLabelB4X As B4XView";
_myerrorlabelb4x = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=917525;
 //BA.debugLineNum = 917525;BA.debugLine="Private MyErrorLabel As Label 'MyHintLabel Buna E";
_myerrorlabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=917527;
 //BA.debugLineNum = 917527;BA.debugLine="Private ilkAcilis As Boolean=True";
_ilkacilis = __c.True;
RDebugUtils.currentLine=917528;
 //BA.debugLineNum = 917528;BA.debugLine="Private NormalHintArkaPlanUzunlugu As Double";
_normalhintarkaplanuzunlugu = 0;
RDebugUtils.currentLine=917531;
 //BA.debugLineNum = 917531;BA.debugLine="Dim MyTextbox As EditText";
_mytextbox = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=917532;
 //BA.debugLineNum = 917532;BA.debugLine="Dim PanelArkaPlanOzellikleri As ColorDrawable";
_panelarkaplanozellikleri = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=917541;
 //BA.debugLineNum = 917541;BA.debugLine="Dim MyPanelRadiusProperty As Int";
_mypanelradiusproperty = 0;
RDebugUtils.currentLine=917542;
 //BA.debugLineNum = 917542;BA.debugLine="Dim MyPanelBackgroundColorProperty As String";
_mypanelbackgroundcolorproperty = "";
RDebugUtils.currentLine=917543;
 //BA.debugLineNum = 917543;BA.debugLine="Dim CircleColorProperty As Int";
_circlecolorproperty = 0;
RDebugUtils.currentLine=917544;
 //BA.debugLineNum = 917544;BA.debugLine="Dim iconCircleSizeProperty As Int";
_iconcirclesizeproperty = 0;
RDebugUtils.currentLine=917545;
 //BA.debugLineNum = 917545;BA.debugLine="Dim iconCircleColorProperty As String";
_iconcirclecolorproperty = "";
RDebugUtils.currentLine=917546;
 //BA.debugLineNum = 917546;BA.debugLine="Dim HintNameProperty As String";
_hintnameproperty = "";
RDebugUtils.currentLine=917549;
 //BA.debugLineNum = 917549;BA.debugLine="End Sub";
return "";
}
public String  _clearerror(b4a.example.metroui_moderntext __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_moderntext";
if (Debug.shouldDelegate(ba, "clearerror", false))
	 {return ((String) Debug.delegate(ba, "clearerror", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub ClearError";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="MyErrorLabel.Visible=False";
__ref._myerrorlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.metroui_moderntext __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_moderntext";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
int _hintyukseklik = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _c = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
com.iox.ioxsvg.ioxsvg _svg = null;
int[] _val = null;
String _colorset = "";
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _iconfont = null;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="Dim HintYukseklik As Int=DipToCurrent(MyHintLabel";
_hintyukseklik = __c.DipToCurrent((int) (__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextSize()/(double)0.77));
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="MyPanelRadiusProperty = Props.Get(\"MyPanelRadius\"";
__ref._mypanelradiusproperty /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("MyPanelRadius"))));
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="MyPanelBackgroundColorProperty = Props.Get(\"MyPan";
__ref._mypanelbackgroundcolorproperty /*String*/  = BA.ObjectToString(_props.Get((Object)("MyPanelBackgroundColor")));
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="CircleColorProperty = Props.Get(\"CircleColor\")";
__ref._circlecolorproperty /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("CircleColor"))));
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="iconCircleSizeProperty = Props.Get(\"iconCircleSiz";
__ref._iconcirclesizeproperty /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("iconCircleSize"))));
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="iconCircleColorProperty = Props.Get(\"iconCircleCo";
__ref._iconcirclecolorproperty /*String*/  = BA.ObjectToString(_props.Get((Object)("iconCircleColor")));
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="HintNameProperty = Props.Get(\"HintText\")";
__ref._hintnameproperty /*String*/  = BA.ObjectToString(_props.Get((Object)("HintText")));
RDebugUtils.currentLine=1048597;
 //BA.debugLineNum = 1048597;BA.debugLine="PanelArkaPlanOzellikleri.Initialize2(MyPanelBackg";
__ref._panelarkaplanozellikleri /*anywheresoftware.b4a.objects.drawable.ColorDrawable*/ .Initialize2((int)(Double.parseDouble(__ref._mypanelbackgroundcolorproperty /*String*/ )),__ref._mypanelradiusproperty /*int*/ ,(int) (0),__c.Colors.White);
RDebugUtils.currentLine=1048598;
 //BA.debugLineNum = 1048598;BA.debugLine="MyPanel.Background=PanelArkaPlanOzellikleri";
__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(__ref._panelarkaplanozellikleri /*anywheresoftware.b4a.objects.drawable.ColorDrawable*/ .getObject()));
RDebugUtils.currentLine=1048609;
 //BA.debugLineNum = 1048609;BA.debugLine="mBase.AddView(MyPanel,0,0,mBase.Width,mBase.Heigh";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=1048615;
 //BA.debugLineNum = 1048615;BA.debugLine="MyPanel.AddView(MyTextboxB4X,60dip,0,mBase.Width-";
__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._mytextboxb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.DipToCurrent((int) (60)),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (70))),__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=1048616;
 //BA.debugLineNum = 1048616;BA.debugLine="MyPanel.AddView(img,0,0,MyTextboxB4X.left  ,mBase";
__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mytextboxb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=1048618;
 //BA.debugLineNum = 1048618;BA.debugLine="MyPanel.AddView(iconCircle,img.Left-5dip,img.Top,";
__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._iconcircle /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getLeft()-__c.DipToCurrent((int) (5))),__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getTop(),__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getWidth(),__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getHeight());
RDebugUtils.currentLine=1048620;
 //BA.debugLineNum = 1048620;BA.debugLine="MyTextboxB4X.Color=Colors.Transparent";
__ref._mytextboxb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=1048625;
 //BA.debugLineNum = 1048625;BA.debugLine="Dim c As Canvas";
_c = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=1048627;
 //BA.debugLineNum = 1048627;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=1048628;
 //BA.debugLineNum = 1048628;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=1048629;
 //BA.debugLineNum = 1048629;BA.debugLine="Dim svg As ioxSVG";
_svg = new com.iox.ioxsvg.ioxsvg();
RDebugUtils.currentLine=1048630;
 //BA.debugLineNum = 1048630;BA.debugLine="Dim val(1) As Int";
_val = new int[(int) (1)];
;
RDebugUtils.currentLine=1048631;
 //BA.debugLineNum = 1048631;BA.debugLine="val(0)=CircleColorProperty";
_val[(int) (0)] = __ref._circlecolorproperty /*int*/ ;
RDebugUtils.currentLine=1048632;
 //BA.debugLineNum = 1048632;BA.debugLine="Dim ColorSet As String = bc.HexFromBytes(bc.IntsT";
_colorset = _bc.HexFromBytes(_bc.IntsToBytes(_val));
RDebugUtils.currentLine=1048633;
 //BA.debugLineNum = 1048633;BA.debugLine="ColorSet=\"#\" & ColorSet.SubString(2)";
_colorset = "#"+_colorset.substring((int) (2));
RDebugUtils.currentLine=1048634;
 //BA.debugLineNum = 1048634;BA.debugLine="b.InitializeMutable(img.Width,img.Height)";
_b.InitializeMutable(__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getWidth(),__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getHeight());
RDebugUtils.currentLine=1048635;
 //BA.debugLineNum = 1048635;BA.debugLine="c.Initialize2(b)";
_c.Initialize2((android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=1048636;
 //BA.debugLineNum = 1048636;BA.debugLine="svg.Initialize2($\"<?xml version=\"1.0\" encoding=\"U";
_svg._vvv3(("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"+"	<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">\n"+"	<svg width=\"100%\" height=\"100%\" viewBox=\"0 0 128 115\" preserveAspectRatio=\"none\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\">\n"+"	<g id=\"#fc7424ff\">\n"+"	<path fill=\""+__c.SmartStringFormatter("",(Object)(_colorset))+"\" opacity=\"1.00\" d=\" M 37.22 3.35 C 45.06 -0.03 53.78 0.53 62.09 1.04 C 76.14 3.27 88.01 12.36 96.84 23.13 C 107.21 34.19 117.48 45.36 128.00 56.27 L 128.00 57.76 C 116.32 71.13 103.73 83.71 92.28 97.28 C 84.97 105.16 75.47 111.16 64.97 113.67 C 57.45 114.82 49.69 114.84 42.18 113.56 C 30.18 110.46 19.22 103.11 12.17 92.86 C 6.67 86.03 3.76 77.56 2.04 69.06 C 0.99 63.79 -0.11 58.36 0.85 52.98 C 2.18 45.24 3.63 37.35 7.29 30.31 C 13.44 18.03 24.11 7.82 37.22 3.35 Z\" />\n"+"	</g>\n"+"	</svg>\n"+"	"));
RDebugUtils.currentLine=1048644;
 //BA.debugLineNum = 1048644;BA.debugLine="svg.DocumentWidth = img.Width";
_svg._setvvvv0((float) (__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getWidth()));
RDebugUtils.currentLine=1048645;
 //BA.debugLineNum = 1048645;BA.debugLine="svg.DocumentHeight = img.Height";
_svg._setvvvv5((float) (__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=1048646;
 //BA.debugLineNum = 1048646;BA.debugLine="svg.RenderToCanvas(c)";
_svg._vvv4(_c);
RDebugUtils.currentLine=1048647;
 //BA.debugLineNum = 1048647;BA.debugLine="img.Bitmap=b";
__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=1048659;
 //BA.debugLineNum = 1048659;BA.debugLine="Dim IconFont As B4XFont";
_iconfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=1048661;
 //BA.debugLineNum = 1048661;BA.debugLine="IconFont = xui.CreateFont(Typeface.FONTAWESOME,i";
_iconfont = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont(__c.Typeface.getFONTAWESOME(),(float) (__ref._iconcirclesizeproperty /*int*/ ));
RDebugUtils.currentLine=1048671;
 //BA.debugLineNum = 1048671;BA.debugLine="iconCircleB4X.SetTextAlignment(\"CENTER\",\"CENTER\")";
__ref._iconcircleb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=1048672;
 //BA.debugLineNum = 1048672;BA.debugLine="iconCircleB4X.TextColor=iconCircleColorProperty";
__ref._iconcircleb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor((int)(Double.parseDouble(__ref._iconcirclecolorproperty /*String*/ )));
RDebugUtils.currentLine=1048673;
 //BA.debugLineNum = 1048673;BA.debugLine="iconCircleB4X.TextSize=iconCircleSizeProperty";
__ref._iconcircleb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextSize((float) (__ref._iconcirclesizeproperty /*int*/ ));
RDebugUtils.currentLine=1048675;
 //BA.debugLineNum = 1048675;BA.debugLine="iconCircleB4X.Font=IconFont";
__ref._iconcircleb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(_iconfont);
RDebugUtils.currentLine=1048676;
 //BA.debugLineNum = 1048676;BA.debugLine="iconCircleB4X.Text=\"\"";
__ref._iconcircleb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1048678;
 //BA.debugLineNum = 1048678;BA.debugLine="MyHintLabel.Text=HintNameProperty";
__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._hintnameproperty /*String*/ ));
RDebugUtils.currentLine=1048679;
 //BA.debugLineNum = 1048679;BA.debugLine="NormalHintArkaPlanUzunlugu=UzunlukHesapla(HintNam";
__ref._normalhintarkaplanuzunlugu /*double*/  = __ref._uzunlukhesapla /*double*/ (null,__ref._hintnameproperty /*String*/ );
RDebugUtils.currentLine=1048680;
 //BA.debugLineNum = 1048680;BA.debugLine="MyPanel.AddView(MyHintLabel, MyTextboxB4X.Left +";
__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (__ref._mytextboxb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__c.DipToCurrent((int) (4))),(int) (__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()/(double)2-__c.DipToCurrent((int) (11))),(int) (__ref._normalhintarkaplanuzunlugu /*double*/ ),_hintyukseklik);
RDebugUtils.currentLine=1048682;
 //BA.debugLineNum = 1048682;BA.debugLine="MyPanel.AddView(MyErrorLabel,MyTextboxB4X.Left +";
__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._myerrorlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (__ref._mytextboxb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__c.DipToCurrent((int) (4))),(int) (__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__c.DipToCurrent((int) (18))),__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=1048683;
 //BA.debugLineNum = 1048683;BA.debugLine="MyErrorLabel.Visible=False";
__ref._myerrorlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1048686;
 //BA.debugLineNum = 1048686;BA.debugLine="MyErrorLabelB4X.TextColor=xui.Color_Red";
__ref._myerrorlabelb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=1048687;
 //BA.debugLineNum = 1048687;BA.debugLine="MyErrorLabelB4X.TextSize=11";
__ref._myerrorlabelb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextSize((float) (11));
RDebugUtils.currentLine=1048688;
 //BA.debugLineNum = 1048688;BA.debugLine="MyErrorLabelB4X.Text=\"Lütfen E-Mail Adresinizi Gi";
__ref._myerrorlabelb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Lütfen E-Mail Adresinizi Giriniz!"));
RDebugUtils.currentLine=1048692;
 //BA.debugLineNum = 1048692;BA.debugLine="End Sub";
return "";
}
public double  _uzunlukhesapla(b4a.example.metroui_moderntext __ref,String _nametext) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_moderntext";
if (Debug.shouldDelegate(ba, "uzunlukhesapla", false))
	 {return ((Double) Debug.delegate(ba, "uzunlukhesapla", new Object[] {_nametext}));}
anywheresoftware.b4a.objects.B4XViewWrapper _uzunpanel = null;
anywheresoftware.b4a.objects.B4XCanvas _canvas1 = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rect = null;
double _sonuc = 0;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub UzunlukHesapla (NameText As String) As";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Dim UzunPanel As B4XView = xui.CreatePanel(\"\")";
_uzunpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_uzunpanel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="UzunPanel.SetLayoutAnimated(0,0,0,MyPanel.Width,M";
_uzunpanel.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="Dim canvas1 As B4XCanvas";
_canvas1 = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="canvas1.Initialize(UzunPanel)";
_canvas1.Initialize(_uzunpanel);
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="Dim Rect As B4XRect = canvas1.MeasureText(NameTex";
_rect = _canvas1.MeasureText(_nametext,__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont());
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="Dim Sonuc As Double=(Rect.Width*1.08)";
_sonuc = (_rect.getWidth()*1.08);
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="Return Sonuc";
if (true) return _sonuc;
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont  _gettextfont(b4a.example.metroui_moderntext __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_moderntext";
if (Debug.shouldDelegate(ba, "gettextfont", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) Debug.delegate(ba, "gettextfont", null));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub getTextFont As B4XFont";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Return MyTextboxB4X.Font";
if (true) return __ref._mytextboxb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont();
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.metroui_moderntext __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="metroui_moderntext";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="img.Initialize(\"img\")";
__ref._img /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .Initialize(ba,"img");
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="MyPanel.Initialize(\"MyPanel\")";
__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"MyPanel");
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="iconCircle.Initialize(\"iconCircle\")";
__ref._iconcircle /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"iconCircle");
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="MyHLabel.Initialize(\"MyHLabel\")";
__ref._myhlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"MyHLabel");
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="MyErrorLabel.Initialize(\"MyErrorLabel\")";
__ref._myerrorlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"MyErrorLabel");
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="MyTextbox.Initialize(\"MyTextbox\")";
__ref._mytextbox /*anywheresoftware.b4a.objects.EditTextWrapper*/ .Initialize(ba,"MyTextbox");
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="MyTextboxB4X=MyTextbox";
__ref._mytextboxb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._mytextbox /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()));
RDebugUtils.currentLine=983061;
 //BA.debugLineNum = 983061;BA.debugLine="iconCircleB4X=iconCircle";
__ref._iconcircleb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._iconcircle /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()));
RDebugUtils.currentLine=983062;
 //BA.debugLineNum = 983062;BA.debugLine="MyHintLabel=MyHLabel";
__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._myhlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()));
RDebugUtils.currentLine=983063;
 //BA.debugLineNum = 983063;BA.debugLine="MyErrorLabelB4X=MyErrorLabel";
__ref._myerrorlabelb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._myerrorlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()));
RDebugUtils.currentLine=983066;
 //BA.debugLineNum = 983066;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_action(b4a.example.metroui_moderntext __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_moderntext";
if (Debug.shouldDelegate(ba, "mytextbox_action", false))
	 {return ((String) Debug.delegate(ba, "mytextbox_action", null));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub MyTextBox_Action";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_EnterPr";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_EnterPressed",(int) (0))) { 
__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_EnterPressed");};
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_beginedit(b4a.example.metroui_moderntext __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_moderntext";
if (Debug.shouldDelegate(ba, "mytextbox_beginedit", false))
	 {return ((String) Debug.delegate(ba, "mytextbox_beginedit", null));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub MyTextBox_BeginEdit";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="CallSub2(Me,\"MyTextBox_FocusChanged\",True)";
__c.CallSubDebug2(ba,this,"MyTextBox_FocusChanged",(Object)(__c.True));
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_focuschanged(b4a.example.metroui_moderntext __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_moderntext";
if (Debug.shouldDelegate(ba, "mytextbox_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "mytextbox_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub MyTextBox_FocusChanged (HasFocus As Bo";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="If HasFocus = False Then";
if (_hasfocus==__c.False) { 
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="If MyTextboxB4X.Text.Length=0 Then";
if (__ref._mytextboxb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().length()==0) { 
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (200),__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),(int) (__ref._mypanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()/(double)2-__c.DipToCurrent((int) (10))),__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 }else 
{RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="Else if MyTextboxB4X.Text.Length>0 Then";
if (__ref._mytextboxb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().length()>0) { 
RDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="MyErrorLabel.Visible=False";
__ref._myerrorlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1769485;
 //BA.debugLineNum = 1769485;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (200),__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),(int) (__ref._mytextboxb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()-__c.DipToCurrent((int) (2.5))),__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 }}
;
 }else {
RDebugUtils.currentLine=1769489;
 //BA.debugLineNum = 1769489;BA.debugLine="If MyTextboxB4X.Text.Length=0 Then";
if (__ref._mytextboxb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().length()==0) { 
RDebugUtils.currentLine=1769491;
 //BA.debugLineNum = 1769491;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (200),__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),(int) (__ref._mytextboxb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()-__c.DipToCurrent((int) (2.5))),__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 }else {
 };
 };
RDebugUtils.currentLine=1769501;
 //BA.debugLineNum = 1769501;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(int) (1))) { 
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(Object)(_hasfocus));};
RDebugUtils.currentLine=1769502;
 //BA.debugLineNum = 1769502;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_endedit(b4a.example.metroui_moderntext __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_moderntext";
if (Debug.shouldDelegate(ba, "mytextbox_endedit", false))
	 {return ((String) Debug.delegate(ba, "mytextbox_endedit", null));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Private Sub MyTextBox_EndEdit";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="CallSub2(Me,\"MyTextBox_FocusChanged\",False)";
__c.CallSubDebug2(ba,this,"MyTextBox_FocusChanged",(Object)(__c.False));
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_enterpressed(b4a.example.metroui_moderntext __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_moderntext";
if (Debug.shouldDelegate(ba, "mytextbox_enterpressed", false))
	 {return ((String) Debug.delegate(ba, "mytextbox_enterpressed", null));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="private Sub MyTextBox_EnterPressed";
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_EnterPr";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_EnterPressed",(int) (0))) { 
__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_EnterPressed");};
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_textchanged(b4a.example.metroui_moderntext __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_moderntext";
if (Debug.shouldDelegate(ba, "mytextbox_textchanged", false))
	 {return ((String) Debug.delegate(ba, "mytextbox_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Private Sub MyTextBox_TextChanged (Old As String,";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="If New.Length>Old.Length Then";
if (_new.length()>_old.length()) { 
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="MyErrorLabel.Visible=False";
__ref._myerrorlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.le";
__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (200),__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),(int) (__ref._mytextboxb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()-__c.DipToCurrent((int) (2.5))),__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 };
RDebugUtils.currentLine=1835021;
 //BA.debugLineNum = 1835021;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_TextCha";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TextChanged",(int) (2))) { 
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TextChanged",(Object)(_old),(Object)(_new));};
RDebugUtils.currentLine=1835022;
 //BA.debugLineNum = 1835022;BA.debugLine="End Sub";
return "";
}
public String  _settext(b4a.example.metroui_moderntext __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_moderntext";
if (Debug.shouldDelegate(ba, "settext", false))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_text}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub setText(Text As String)";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="If ilkAcilis=True Then";
if (__ref._ilkacilis /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="If Text.Length=0 Then";
if (_text.length()==0) { 
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (200),__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),(int) (__ref._mytextbox /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getHeight()/(double)2),__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 }else {
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (200),__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),(int) (__ref._mytextboxb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()-__c.DipToCurrent((int) (2.5))),__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._myhintlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 };
 };
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="MyTextboxB4X.Text=Text";
__ref._mytextboxb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=1376273;
 //BA.debugLineNum = 1376273;BA.debugLine="End Sub";
return "";
}
public String  _settextfont(b4a.example.metroui_moderntext __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
__ref = this;
RDebugUtils.currentModule="metroui_moderntext";
if (Debug.shouldDelegate(ba, "settextfont", false))
	 {return ((String) Debug.delegate(ba, "settextfont", new Object[] {_fnt}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub setTextFont(Fnt As B4XFont)";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="MyTextboxB4X.Font=Fnt";
__ref._mytextboxb4x /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(_fnt);
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return "";
}
}