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
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 13;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 14;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 16;BA.debugLine="Public Tag As Object";
_tag = new Object();
 //BA.debugLineNum = 18;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim MyPanel As Panel";
_mypanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Dim MyTextboxB4X As B4XView";
_mytextboxb4x = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Dim iconCircleB4X As B4XView";
_iconcircleb4x = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Dim iconCircle As Label";
_iconcircle = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private MyHintLabel As B4XView";
_myhintlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private MyHLabel As Label 'MyHintLabel Buna Eşitl";
_myhlabel = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private MyErrorLabelB4X As B4XView";
_myerrorlabelb4x = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private MyErrorLabel As Label 'MyHintLabel Buna E";
_myerrorlabel = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private ilkAcilis As Boolean=True";
_ilkacilis = __c.True;
 //BA.debugLineNum = 35;BA.debugLine="Private NormalHintArkaPlanUzunlugu As Double";
_normalhintarkaplanuzunlugu = 0;
 //BA.debugLineNum = 38;BA.debugLine="Dim MyTextbox As EditText";
_mytextbox = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Dim PanelArkaPlanOzellikleri As ColorDrawable";
_panelarkaplanozellikleri = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 48;BA.debugLine="Dim MyPanelRadiusProperty As Int";
_mypanelradiusproperty = 0;
 //BA.debugLineNum = 49;BA.debugLine="Dim MyPanelBackgroundColorProperty As String";
_mypanelbackgroundcolorproperty = "";
 //BA.debugLineNum = 50;BA.debugLine="Dim CircleColorProperty As Int";
_circlecolorproperty = 0;
 //BA.debugLineNum = 51;BA.debugLine="Dim iconCircleSizeProperty As Int";
_iconcirclesizeproperty = 0;
 //BA.debugLineNum = 52;BA.debugLine="Dim iconCircleColorProperty As String";
_iconcirclecolorproperty = "";
 //BA.debugLineNum = 53;BA.debugLine="Dim HintNameProperty As String";
_hintnameproperty = "";
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public String  _clearerror() throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Public Sub ClearError";
 //BA.debugLineNum = 218;BA.debugLine="MyErrorLabel.Visible=False";
_myerrorlabel.setVisible(__c.False);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
int _hintyukseklik = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _c = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
com.iox.ioxsvg.ioxsvg _svg = null;
int[] _val = null;
String _colorset = "";
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _iconfont = null;
 //BA.debugLineNum = 87;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
 //BA.debugLineNum = 88;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 89;BA.debugLine="Tag = mBase.Tag";
_tag = _mbase.getTag();
 //BA.debugLineNum = 90;BA.debugLine="mBase.Tag = Me";
_mbase.setTag(this);
 //BA.debugLineNum = 94;BA.debugLine="Dim HintYukseklik As Int=DipToCurrent(MyHintLabel";
_hintyukseklik = __c.DipToCurrent((int) (_myhintlabel.getTextSize()/(double)0.77));
 //BA.debugLineNum = 96;BA.debugLine="MyPanelRadiusProperty = Props.Get(\"MyPanelRadius\"";
_mypanelradiusproperty = (int)(BA.ObjectToNumber(_props.Get((Object)("MyPanelRadius"))));
 //BA.debugLineNum = 97;BA.debugLine="MyPanelBackgroundColorProperty = Props.Get(\"MyPan";
_mypanelbackgroundcolorproperty = BA.ObjectToString(_props.Get((Object)("MyPanelBackgroundColor")));
 //BA.debugLineNum = 98;BA.debugLine="CircleColorProperty = Props.Get(\"CircleColor\")";
_circlecolorproperty = (int)(BA.ObjectToNumber(_props.Get((Object)("CircleColor"))));
 //BA.debugLineNum = 99;BA.debugLine="iconCircleSizeProperty = Props.Get(\"iconCircleSiz";
_iconcirclesizeproperty = (int)(BA.ObjectToNumber(_props.Get((Object)("iconCircleSize"))));
 //BA.debugLineNum = 100;BA.debugLine="iconCircleColorProperty = Props.Get(\"iconCircleCo";
_iconcirclecolorproperty = BA.ObjectToString(_props.Get((Object)("iconCircleColor")));
 //BA.debugLineNum = 101;BA.debugLine="HintNameProperty = Props.Get(\"HintText\")";
_hintnameproperty = BA.ObjectToString(_props.Get((Object)("HintText")));
 //BA.debugLineNum = 108;BA.debugLine="PanelArkaPlanOzellikleri.Initialize2(MyPanelBackg";
_panelarkaplanozellikleri.Initialize2((int)(Double.parseDouble(_mypanelbackgroundcolorproperty)),_mypanelradiusproperty,(int) (0),__c.Colors.White);
 //BA.debugLineNum = 109;BA.debugLine="MyPanel.Background=PanelArkaPlanOzellikleri";
_mypanel.setBackground((android.graphics.drawable.Drawable)(_panelarkaplanozellikleri.getObject()));
 //BA.debugLineNum = 120;BA.debugLine="mBase.AddView(MyPanel,0,0,mBase.Width,mBase.Heigh";
_mbase.AddView((android.view.View)(_mypanel.getObject()),(int) (0),(int) (0),_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 126;BA.debugLine="MyPanel.AddView(MyTextboxB4X,60dip,0,mBase.Width-";
_mypanel.AddView((android.view.View)(_mytextboxb4x.getObject()),__c.DipToCurrent((int) (60)),(int) (0),(int) (_mbase.getWidth()-__c.DipToCurrent((int) (70))),_mypanel.getHeight());
 //BA.debugLineNum = 127;BA.debugLine="MyPanel.AddView(img,0,0,MyTextboxB4X.left  ,mBase";
_mypanel.AddView((android.view.View)(_img.getObject()),(int) (0),(int) (0),_mytextboxb4x.getLeft(),(int) (_mbase.getHeight()-__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 129;BA.debugLine="MyPanel.AddView(iconCircle,img.Left-5dip,img.Top,";
_mypanel.AddView((android.view.View)(_iconcircle.getObject()),(int) (_img.getLeft()-__c.DipToCurrent((int) (5))),_img.getTop(),_img.getWidth(),_img.getHeight());
 //BA.debugLineNum = 131;BA.debugLine="MyTextboxB4X.Color=Colors.Transparent";
_mytextboxb4x.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 136;BA.debugLine="Dim c As Canvas";
_c = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
 //BA.debugLineNum = 138;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 139;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
 //BA.debugLineNum = 140;BA.debugLine="Dim svg As ioxSVG";
_svg = new com.iox.ioxsvg.ioxsvg();
 //BA.debugLineNum = 141;BA.debugLine="Dim val(1) As Int";
_val = new int[(int) (1)];
;
 //BA.debugLineNum = 142;BA.debugLine="val(0)=CircleColorProperty";
_val[(int) (0)] = _circlecolorproperty;
 //BA.debugLineNum = 143;BA.debugLine="Dim ColorSet As String = bc.HexFromBytes(bc.IntsT";
_colorset = _bc.HexFromBytes(_bc.IntsToBytes(_val));
 //BA.debugLineNum = 144;BA.debugLine="ColorSet=\"#\" & ColorSet.SubString(2)";
_colorset = "#"+_colorset.substring((int) (2));
 //BA.debugLineNum = 145;BA.debugLine="b.InitializeMutable(img.Width,img.Height)";
_b.InitializeMutable(_img.getWidth(),_img.getHeight());
 //BA.debugLineNum = 146;BA.debugLine="c.Initialize2(b)";
_c.Initialize2((android.graphics.Bitmap)(_b.getObject()));
 //BA.debugLineNum = 147;BA.debugLine="svg.Initialize2($\"<?xml version=\"1.0\" encoding=\"U";
_svg._vvv3(("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"+"	<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">\n"+"	<svg width=\"100%\" height=\"100%\" viewBox=\"0 0 128 115\" preserveAspectRatio=\"none\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\">\n"+"	<g id=\"#fc7424ff\">\n"+"	<path fill=\""+__c.SmartStringFormatter("",(Object)(_colorset))+"\" opacity=\"1.00\" d=\" M 37.22 3.35 C 45.06 -0.03 53.78 0.53 62.09 1.04 C 76.14 3.27 88.01 12.36 96.84 23.13 C 107.21 34.19 117.48 45.36 128.00 56.27 L 128.00 57.76 C 116.32 71.13 103.73 83.71 92.28 97.28 C 84.97 105.16 75.47 111.16 64.97 113.67 C 57.45 114.82 49.69 114.84 42.18 113.56 C 30.18 110.46 19.22 103.11 12.17 92.86 C 6.67 86.03 3.76 77.56 2.04 69.06 C 0.99 63.79 -0.11 58.36 0.85 52.98 C 2.18 45.24 3.63 37.35 7.29 30.31 C 13.44 18.03 24.11 7.82 37.22 3.35 Z\" />\n"+"	</g>\n"+"	</svg>\n"+"	"));
 //BA.debugLineNum = 155;BA.debugLine="svg.DocumentWidth = img.Width";
_svg._setvvvv0((float) (_img.getWidth()));
 //BA.debugLineNum = 156;BA.debugLine="svg.DocumentHeight = img.Height";
_svg._setvvvv5((float) (_img.getHeight()));
 //BA.debugLineNum = 157;BA.debugLine="svg.RenderToCanvas(c)";
_svg._vvv4(_c);
 //BA.debugLineNum = 158;BA.debugLine="img.Bitmap=b";
_img.setBitmap((android.graphics.Bitmap)(_b.getObject()));
 //BA.debugLineNum = 170;BA.debugLine="Dim IconFont As B4XFont";
_iconfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 172;BA.debugLine="IconFont = xui.CreateFont(Typeface.FONTAWESOME,i";
_iconfont = _xui.CreateFont(__c.Typeface.getFONTAWESOME(),(float) (_iconcirclesizeproperty));
 //BA.debugLineNum = 179;BA.debugLine="iconCircleB4X.SetTextAlignment(\"CENTER\",\"CENTER\")";
_iconcircleb4x.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 180;BA.debugLine="iconCircleB4X.TextColor=iconCircleColorProperty";
_iconcircleb4x.setTextColor((int)(Double.parseDouble(_iconcirclecolorproperty)));
 //BA.debugLineNum = 181;BA.debugLine="iconCircleB4X.TextSize=iconCircleSizeProperty";
_iconcircleb4x.setTextSize((float) (_iconcirclesizeproperty));
 //BA.debugLineNum = 183;BA.debugLine="iconCircleB4X.Font=IconFont";
_iconcircleb4x.setFont(_iconfont);
 //BA.debugLineNum = 184;BA.debugLine="iconCircleB4X.Text=\"\"";
_iconcircleb4x.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 186;BA.debugLine="MyHintLabel.Text=HintNameProperty";
_myhintlabel.setText(BA.ObjectToCharSequence(_hintnameproperty));
 //BA.debugLineNum = 187;BA.debugLine="NormalHintArkaPlanUzunlugu=UzunlukHesapla(HintNam";
_normalhintarkaplanuzunlugu = _uzunlukhesapla(_hintnameproperty);
 //BA.debugLineNum = 188;BA.debugLine="MyPanel.AddView(MyHintLabel, MyTextboxB4X.Left +";
_mypanel.AddView((android.view.View)(_myhintlabel.getObject()),(int) (_mytextboxb4x.getLeft()+__c.DipToCurrent((int) (4))),(int) (_mypanel.getHeight()/(double)2-__c.DipToCurrent((int) (11))),(int) (_normalhintarkaplanuzunlugu),_hintyukseklik);
 //BA.debugLineNum = 190;BA.debugLine="MyPanel.AddView(MyErrorLabel,MyTextboxB4X.Left +";
_mypanel.AddView((android.view.View)(_myerrorlabel.getObject()),(int) (_mytextboxb4x.getLeft()+__c.DipToCurrent((int) (4))),(int) (_mypanel.getHeight()-__c.DipToCurrent((int) (18))),_mypanel.getWidth(),__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 191;BA.debugLine="MyErrorLabel.Visible=False";
_myerrorlabel.setVisible(__c.False);
 //BA.debugLineNum = 193;BA.debugLine="MyErrorLabelB4X.TextColor=xui.Color_Red";
_myerrorlabelb4x.setTextColor(_xui.Color_Red);
 //BA.debugLineNum = 194;BA.debugLine="MyErrorLabelB4X.TextSize=11";
_myerrorlabelb4x.setTextSize((float) (11));
 //BA.debugLineNum = 195;BA.debugLine="MyErrorLabelB4X.Text=\"Lütfen E-Mail Adresinizi Gi";
_myerrorlabelb4x.setText(BA.ObjectToCharSequence("Lütfen E-Mail Adresinizi Giriniz!"));
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return "";
}
public String  _gettext() throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="Public Sub getText As String";
 //BA.debugLineNum = 246;BA.debugLine="Return MyTextboxB4X.Text";
if (true) return _mytextboxb4x.getText();
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont  _gettextfont() throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Public Sub getTextFont As B4XFont";
 //BA.debugLineNum = 254;BA.debugLine="Return MyTextboxB4X.Font";
if (true) return _mytextboxb4x.getFont();
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 58;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 59;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 60;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 61;BA.debugLine="img.Initialize(\"img\")";
_img.Initialize(ba,"img");
 //BA.debugLineNum = 62;BA.debugLine="MyPanel.Initialize(\"MyPanel\")";
_mypanel.Initialize(ba,"MyPanel");
 //BA.debugLineNum = 64;BA.debugLine="iconCircle.Initialize(\"iconCircle\")";
_iconcircle.Initialize(ba,"iconCircle");
 //BA.debugLineNum = 65;BA.debugLine="MyHLabel.Initialize(\"MyHLabel\")";
_myhlabel.Initialize(ba,"MyHLabel");
 //BA.debugLineNum = 66;BA.debugLine="MyErrorLabel.Initialize(\"MyErrorLabel\")";
_myerrorlabel.Initialize(ba,"MyErrorLabel");
 //BA.debugLineNum = 69;BA.debugLine="MyTextbox.Initialize(\"MyTextbox\")";
_mytextbox.Initialize(ba,"MyTextbox");
 //BA.debugLineNum = 78;BA.debugLine="MyTextboxB4X=MyTextbox";
_mytextboxb4x = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_mytextbox.getObject()));
 //BA.debugLineNum = 79;BA.debugLine="iconCircleB4X=iconCircle";
_iconcircleb4x = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iconcircle.getObject()));
 //BA.debugLineNum = 80;BA.debugLine="MyHintLabel=MyHLabel";
_myhintlabel = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_myhlabel.getObject()));
 //BA.debugLineNum = 81;BA.debugLine="MyErrorLabelB4X=MyErrorLabel";
_myerrorlabelb4x = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_myerrorlabel.getObject()));
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_action() throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Private Sub MyTextBox_Action";
 //BA.debugLineNum = 321;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_EnterPr";
if (_xui.SubExists(ba,_mcallback,_meventname+"_EnterPressed",(int) (0))) { 
__c.CallSubNew(ba,_mcallback,_meventname+"_EnterPressed");};
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_beginedit() throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Private Sub MyTextBox_BeginEdit";
 //BA.debugLineNum = 258;BA.debugLine="CallSub2(Me,\"MyTextBox_FocusChanged\",True)";
__c.CallSubNew2(ba,this,"MyTextBox_FocusChanged",(Object)(__c.True));
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_endedit() throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Private Sub MyTextBox_EndEdit";
 //BA.debugLineNum = 261;BA.debugLine="CallSub2(Me,\"MyTextBox_FocusChanged\",False)";
__c.CallSubNew2(ba,this,"MyTextBox_FocusChanged",(Object)(__c.False));
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_enterpressed() throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="private Sub MyTextBox_EnterPressed";
 //BA.debugLineNum = 317;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_EnterPr";
if (_xui.SubExists(ba,_mcallback,_meventname+"_EnterPressed",(int) (0))) { 
__c.CallSubNew(ba,_mcallback,_meventname+"_EnterPressed");};
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_focuschanged(boolean _hasfocus) throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Private Sub MyTextBox_FocusChanged (HasFocus As Bo";
 //BA.debugLineNum = 265;BA.debugLine="If HasFocus = False Then";
if (_hasfocus==__c.False) { 
 //BA.debugLineNum = 266;BA.debugLine="If MyTextboxB4X.Text.Length=0 Then";
if (_mytextboxb4x.getText().length()==0) { 
 //BA.debugLineNum = 270;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
_myhintlabel.SetLayoutAnimated((int) (200),_myhintlabel.getLeft(),(int) (_mypanel.getHeight()/(double)2-__c.DipToCurrent((int) (10))),_myhintlabel.getWidth(),_myhintlabel.getHeight());
 }else if(_mytextboxb4x.getText().length()>0) { 
 //BA.debugLineNum = 276;BA.debugLine="MyErrorLabel.Visible=False";
_myerrorlabel.setVisible(__c.False);
 //BA.debugLineNum = 277;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
_myhintlabel.SetLayoutAnimated((int) (200),_myhintlabel.getLeft(),(int) (_mytextboxb4x.getTop()-__c.DipToCurrent((int) (2.5))),_myhintlabel.getWidth(),_myhintlabel.getHeight());
 };
 }else {
 //BA.debugLineNum = 281;BA.debugLine="If MyTextboxB4X.Text.Length=0 Then";
if (_mytextboxb4x.getText().length()==0) { 
 //BA.debugLineNum = 283;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
_myhintlabel.SetLayoutAnimated((int) (200),_myhintlabel.getLeft(),(int) (_mytextboxb4x.getTop()-__c.DipToCurrent((int) (2.5))),_myhintlabel.getWidth(),_myhintlabel.getHeight());
 }else {
 };
 };
 //BA.debugLineNum = 293;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
if (_xui.SubExists(ba,_mcallback,_meventname+"_FocusChanged",(int) (1))) { 
__c.CallSubNew2(ba,_mcallback,_meventname+"_FocusChanged",(Object)(_hasfocus));};
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 297;BA.debugLine="Private Sub MyTextBox_TextChanged (Old As String,";
 //BA.debugLineNum = 299;BA.debugLine="If New.Length>Old.Length Then";
if (_new.length()>_old.length()) { 
 //BA.debugLineNum = 300;BA.debugLine="MyErrorLabel.Visible=False";
_myerrorlabel.setVisible(__c.False);
 //BA.debugLineNum = 301;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.le";
_myhintlabel.SetLayoutAnimated((int) (200),_myhintlabel.getLeft(),(int) (_mytextboxb4x.getTop()-__c.DipToCurrent((int) (2.5))),_myhintlabel.getWidth(),_myhintlabel.getHeight());
 };
 //BA.debugLineNum = 310;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_TextCha";
if (_xui.SubExists(ba,_mcallback,_meventname+"_TextChanged",(int) (2))) { 
__c.CallSubNew3(ba,_mcallback,_meventname+"_TextChanged",(Object)(_old),(Object)(_new));};
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return "";
}
public String  _settext(String _text) throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Public Sub setText(Text As String)";
 //BA.debugLineNum = 227;BA.debugLine="If ilkAcilis=True Then";
if (_ilkacilis==__c.True) { 
 //BA.debugLineNum = 229;BA.debugLine="If Text.Length=0 Then";
if (_text.length()==0) { 
 //BA.debugLineNum = 231;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
_myhintlabel.SetLayoutAnimated((int) (200),_myhintlabel.getLeft(),(int) (_mytextbox.getHeight()/(double)2),_myhintlabel.getWidth(),_myhintlabel.getHeight());
 }else {
 //BA.debugLineNum = 236;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
_myhintlabel.SetLayoutAnimated((int) (200),_myhintlabel.getLeft(),(int) (_mytextboxb4x.getTop()-__c.DipToCurrent((int) (2.5))),_myhintlabel.getWidth(),_myhintlabel.getHeight());
 };
 };
 //BA.debugLineNum = 239;BA.debugLine="MyTextboxB4X.Text=Text";
_mytextboxb4x.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return "";
}
public String  _settextfont(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Public Sub setTextFont(Fnt As B4XFont)";
 //BA.debugLineNum = 250;BA.debugLine="MyTextboxB4X.Font=Fnt";
_mytextboxb4x.setFont(_fnt);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return "";
}
public String  _showerror(String _errortext) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Public Sub ShowError(ErrorText As String)";
 //BA.debugLineNum = 213;BA.debugLine="MyErrorLabel.Visible=True";
_myerrorlabel.setVisible(__c.True);
 //BA.debugLineNum = 214;BA.debugLine="MyErrorLabel.Text=ErrorText";
_myerrorlabel.setText(BA.ObjectToCharSequence(_errortext));
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return "";
}
public double  _uzunlukhesapla(String _nametext) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _uzunpanel = null;
anywheresoftware.b4a.objects.B4XCanvas _canvas1 = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rect = null;
double _sonuc = 0;
 //BA.debugLineNum = 199;BA.debugLine="Private Sub UzunlukHesapla (NameText As String) As";
 //BA.debugLineNum = 200;BA.debugLine="Dim UzunPanel As B4XView = xui.CreatePanel(\"\")";
_uzunpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_uzunpanel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 201;BA.debugLine="UzunPanel.SetLayoutAnimated(0,0,0,MyPanel.Width,M";
_uzunpanel.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_mypanel.getWidth(),_mypanel.getHeight());
 //BA.debugLineNum = 202;BA.debugLine="Dim canvas1 As B4XCanvas";
_canvas1 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 203;BA.debugLine="canvas1.Initialize(UzunPanel)";
_canvas1.Initialize(_uzunpanel);
 //BA.debugLineNum = 204;BA.debugLine="Dim Rect As B4XRect = canvas1.MeasureText(NameTex";
_rect = _canvas1.MeasureText(_nametext,_myhintlabel.getFont());
 //BA.debugLineNum = 205;BA.debugLine="Dim Sonuc As Double=(Rect.Width*1.08)";
_sonuc = (_rect.getWidth()*1.08);
 //BA.debugLineNum = 209;BA.debugLine="Return Sonuc";
if (true) return _sonuc;
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return 0;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "MYTEXTBOX_FOCUSCHANGED"))
	return _mytextbox_focuschanged((Boolean) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
