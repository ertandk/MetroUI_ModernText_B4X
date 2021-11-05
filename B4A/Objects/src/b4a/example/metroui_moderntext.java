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
public String _vvvvvv4 = "";
public Object _vvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvv6 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvv5 = null;
public Object _vvvvvv7 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _vvvvvv0 = null;
public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvv1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvv2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _vvvvvvv3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvv4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _vvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvv6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _vvvvvvv7 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvv0 = null;
public anywheresoftware.b4a.objects.LabelWrapper _vvvvvvvv1 = null;
public boolean _vvvvvvvv2 = false;
public double _vvvvvvvv3 = 0;
public anywheresoftware.b4a.objects.drawable.ColorDrawable _vvvvvvvv4 = null;
public int _vvvvvvvv5 = 0;
public String _vvvvvvvv6 = "";
public int _vvvvvvvv7 = 0;
public int _vvvvvvvv0 = 0;
public String _vvvvvvvvv1 = "";
public String _vvvvvvvvv2 = "";
public b4a.example.main _vvvv6 = null;
public b4a.example.starter _vvvv7 = null;
public b4a.example.b4xpages _vvvv0 = null;
public b4a.example.b4xcollections _vvvvv1 = null;
public b4a.example.httputils2service _vvvvv2 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvv4 = "";
 //BA.debugLineNum = 13;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvv5 = new Object();
 //BA.debugLineNum = 14;BA.debugLine="Public mBase As B4XView";
_vvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private xui As XUI 'ignore";
_vvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 16;BA.debugLine="Public Tag As Object";
_vvvvvv7 = new Object();
 //BA.debugLineNum = 18;BA.debugLine="Dim img As ImageView";
_vvvvvv0 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim MyPanel As Panel";
_vvvvvvv1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Dim MyTextboxB4X As B4XView";
_vvvvvvv2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Dim MyTextbox As EditText";
_vvvvvvv3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Dim iconCircleB4X As B4XView";
_vvvvvvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Dim iconCircle As Label";
_vvvvvvv5 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private MyHintLabel As B4XView";
_vvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private MyHLabel As Label 'MyHintLabel Buna Eşitl";
_vvvvvvv7 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private MyErrorLabelB4X As B4XView";
_vvvvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private MyErrorLabel As Label 'MyHintLabel Buna E";
_vvvvvvvv1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private ilkAcilis As Boolean=True";
_vvvvvvvv2 = __c.True;
 //BA.debugLineNum = 35;BA.debugLine="Private NormalHintArkaPlanUzunlugu As Double";
_vvvvvvvv3 = 0;
 //BA.debugLineNum = 38;BA.debugLine="Dim PanelArkaPlanOzellikleri As ColorDrawable";
_vvvvvvvv4 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 43;BA.debugLine="Dim MyPanelRadiusProperty As Int";
_vvvvvvvv5 = 0;
 //BA.debugLineNum = 44;BA.debugLine="Dim MyPanelBackgroundColorProperty As String";
_vvvvvvvv6 = "";
 //BA.debugLineNum = 45;BA.debugLine="Dim CircleColorProperty As Int";
_vvvvvvvv7 = 0;
 //BA.debugLineNum = 46;BA.debugLine="Dim iconCircleSizeProperty As Int";
_vvvvvvvv0 = 0;
 //BA.debugLineNum = 47;BA.debugLine="Dim iconCircleColorProperty As String";
_vvvvvvvvv1 = "";
 //BA.debugLineNum = 48;BA.debugLine="Dim HintNameProperty As String";
_vvvvvvvvv2 = "";
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public String  _vvvvv3() throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Public Sub ClearError";
 //BA.debugLineNum = 169;BA.debugLine="MyErrorLabel.Visible=False";
_vvvvvvvv1.setVisible(__c.False);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 71;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
 //BA.debugLineNum = 72;BA.debugLine="mBase = Base";
_vvvvvv6 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 73;BA.debugLine="Tag = mBase.Tag";
_vvvvvv7 = _vvvvvv6.getTag();
 //BA.debugLineNum = 74;BA.debugLine="mBase.Tag = Me";
_vvvvvv6.setTag(this);
 //BA.debugLineNum = 76;BA.debugLine="img.Gravity=Gravity.FILL";
_vvvvvv0.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 78;BA.debugLine="Dim HintYukseklik As Int=DipToCurrent(MyHintLabel";
_hintyukseklik = __c.DipToCurrent((int) (_vvvvvvv6.getTextSize()/(double)0.77));
 //BA.debugLineNum = 80;BA.debugLine="MyPanelRadiusProperty = Props.Get(\"MyPanelRadius\"";
_vvvvvvvv5 = (int)(BA.ObjectToNumber(_props.Get((Object)("MyPanelRadius"))));
 //BA.debugLineNum = 81;BA.debugLine="MyPanelBackgroundColorProperty = Props.Get(\"MyPan";
_vvvvvvvv6 = BA.ObjectToString(_props.Get((Object)("MyPanelBackgroundColor")));
 //BA.debugLineNum = 82;BA.debugLine="CircleColorProperty = Props.Get(\"CircleColor\")";
_vvvvvvvv7 = (int)(BA.ObjectToNumber(_props.Get((Object)("CircleColor"))));
 //BA.debugLineNum = 83;BA.debugLine="iconCircleSizeProperty = Props.Get(\"iconCircleSiz";
_vvvvvvvv0 = (int)(BA.ObjectToNumber(_props.Get((Object)("iconCircleSize"))));
 //BA.debugLineNum = 84;BA.debugLine="iconCircleColorProperty = Props.Get(\"iconCircleCo";
_vvvvvvvvv1 = BA.ObjectToString(_props.Get((Object)("iconCircleColor")));
 //BA.debugLineNum = 85;BA.debugLine="HintNameProperty = Props.Get(\"HintText\")";
_vvvvvvvvv2 = BA.ObjectToString(_props.Get((Object)("HintText")));
 //BA.debugLineNum = 90;BA.debugLine="PanelArkaPlanOzellikleri.Initialize2(MyPanelBackg";
_vvvvvvvv4.Initialize2((int)(Double.parseDouble(_vvvvvvvv6)),_vvvvvvvv5,(int) (0),__c.Colors.White);
 //BA.debugLineNum = 91;BA.debugLine="MyPanel.Background=PanelArkaPlanOzellikleri";
_vvvvvvv1.setBackground((android.graphics.drawable.Drawable)(_vvvvvvvv4.getObject()));
 //BA.debugLineNum = 93;BA.debugLine="mBase.AddView(MyPanel,0,0,mBase.Width,mBase.Heigh";
_vvvvvv6.AddView((android.view.View)(_vvvvvvv1.getObject()),(int) (0),(int) (0),_vvvvvv6.getWidth(),_vvvvvv6.getHeight());
 //BA.debugLineNum = 94;BA.debugLine="MyPanel.AddView(MyTextbox,60dip,0,mBase.Width-70d";
_vvvvvvv1.AddView((android.view.View)(_vvvvvvv3.getObject()),__c.DipToCurrent((int) (60)),(int) (0),(int) (_vvvvvv6.getWidth()-__c.DipToCurrent((int) (70))),_vvvvvvv1.getHeight());
 //BA.debugLineNum = 95;BA.debugLine="MyPanel.AddView(img,0,0,MyTextbox.left  ,mBase.He";
_vvvvvvv1.AddView((android.view.View)(_vvvvvv0.getObject()),(int) (0),(int) (0),_vvvvvvv3.getLeft(),_vvvvvv6.getHeight());
 //BA.debugLineNum = 96;BA.debugLine="MyPanel.AddView(iconCircle,img.Left-5dip,img.Top,";
_vvvvvvv1.AddView((android.view.View)(_vvvvvvv5.getObject()),(int) (_vvvvvv0.getLeft()-__c.DipToCurrent((int) (5))),_vvvvvv0.getTop(),_vvvvvv0.getWidth(),_vvvvvv0.getHeight());
 //BA.debugLineNum = 98;BA.debugLine="MyTextbox.Color=Colors.Transparent";
_vvvvvvv3.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 100;BA.debugLine="Dim c As Canvas";
_c = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
 //BA.debugLineNum = 102;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 103;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
 //BA.debugLineNum = 104;BA.debugLine="Dim svg As ioxSVG";
_svg = new com.iox.ioxsvg.ioxsvg();
 //BA.debugLineNum = 105;BA.debugLine="Dim val(1) As Int";
_val = new int[(int) (1)];
;
 //BA.debugLineNum = 106;BA.debugLine="val(0)=CircleColorProperty";
_val[(int) (0)] = _vvvvvvvv7;
 //BA.debugLineNum = 107;BA.debugLine="Dim ColorSet As String = bc.HexFromBytes(bc.IntsT";
_colorset = _bc.HexFromBytes(_bc.IntsToBytes(_val));
 //BA.debugLineNum = 108;BA.debugLine="ColorSet=\"#\" & ColorSet.SubString(2)";
_colorset = "#"+_colorset.substring((int) (2));
 //BA.debugLineNum = 109;BA.debugLine="b.InitializeMutable(img.Width,img.Height)";
_b.InitializeMutable(_vvvvvv0.getWidth(),_vvvvvv0.getHeight());
 //BA.debugLineNum = 110;BA.debugLine="c.Initialize2(b)";
_c.Initialize2((android.graphics.Bitmap)(_b.getObject()));
 //BA.debugLineNum = 111;BA.debugLine="svg.Initialize2($\"<?xml version=\"1.0\" encoding=\"U";
_svg._vvv3(("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"+"	<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">\n"+"	<svg width=\"100%\" height=\"100%\" viewBox=\"0 0 128 115\" preserveAspectRatio=\"none\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\">\n"+"	<g id=\"#fc7424ff\">\n"+"	<path fill=\""+__c.SmartStringFormatter("",(Object)(_colorset))+"\" opacity=\"1.00\" d=\" M 37.22 3.35 C 45.06 -0.03 53.78 0.53 62.09 1.04 C 76.14 3.27 88.01 12.36 96.84 23.13 C 107.21 34.19 117.48 45.36 128.00 56.27 L 128.00 57.76 C 116.32 71.13 103.73 83.71 92.28 97.28 C 84.97 105.16 75.47 111.16 64.97 113.67 C 57.45 114.82 49.69 114.84 42.18 113.56 C 30.18 110.46 19.22 103.11 12.17 92.86 C 6.67 86.03 3.76 77.56 2.04 69.06 C 0.99 63.79 -0.11 58.36 0.85 52.98 C 2.18 45.24 3.63 37.35 7.29 30.31 C 13.44 18.03 24.11 7.82 37.22 3.35 Z\" />\n"+"	</g>\n"+"	</svg>\n"+"	"));
 //BA.debugLineNum = 119;BA.debugLine="svg.DocumentWidth = img.Width";
_svg._setvvvv0((float) (_vvvvvv0.getWidth()));
 //BA.debugLineNum = 120;BA.debugLine="svg.DocumentHeight = img.Height";
_svg._setvvvv5((float) (_vvvvvv0.getHeight()));
 //BA.debugLineNum = 121;BA.debugLine="svg.RenderToCanvas(c)";
_svg._vvv4(_c);
 //BA.debugLineNum = 122;BA.debugLine="img.Bitmap=b";
_vvvvvv0.setBitmap((android.graphics.Bitmap)(_b.getObject()));
 //BA.debugLineNum = 124;BA.debugLine="Dim IconFont As B4XFont";
_iconfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 125;BA.debugLine="IconFont = xui.CreateFont(Typeface.FONTAWESOME,ic";
_iconfont = _vvvv5.CreateFont(__c.Typeface.getFONTAWESOME(),(float) (_vvvvvvvv0));
 //BA.debugLineNum = 127;BA.debugLine="iconCircleB4X.SetTextAlignment(\"CENTER\",\"CENTER\")";
_vvvvvvv4.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 128;BA.debugLine="iconCircleB4X.TextColor=iconCircleColorProperty";
_vvvvvvv4.setTextColor((int)(Double.parseDouble(_vvvvvvvvv1)));
 //BA.debugLineNum = 129;BA.debugLine="iconCircleB4X.TextSize=iconCircleSizeProperty";
_vvvvvvv4.setTextSize((float) (_vvvvvvvv0));
 //BA.debugLineNum = 131;BA.debugLine="iconCircleB4X.Font=IconFont";
_vvvvvvv4.setFont(_iconfont);
 //BA.debugLineNum = 132;BA.debugLine="iconCircleB4X.Text=\"\"";
_vvvvvvv4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 134;BA.debugLine="MyHintLabel.Text=HintNameProperty";
_vvvvvvv6.setText(BA.ObjectToCharSequence(_vvvvvvvvv2));
 //BA.debugLineNum = 135;BA.debugLine="NormalHintArkaPlanUzunlugu=UzunlukHesapla(HintNam";
_vvvvvvvv3 = _vvvvvv1(_vvvvvvvvv2);
 //BA.debugLineNum = 136;BA.debugLine="MyPanel.AddView(MyHintLabel, MyTextbox.Left + 4di";
_vvvvvvv1.AddView((android.view.View)(_vvvvvvv6.getObject()),(int) (_vvvvvvv3.getLeft()+__c.DipToCurrent((int) (4))),(int) (_vvvvvvv1.getHeight()/(double)2-__c.DipToCurrent((int) (10))),(int) (_vvvvvvvv3),_hintyukseklik);
 //BA.debugLineNum = 138;BA.debugLine="MyPanel.AddView(MyErrorLabel,MyTextbox.Left + 4di";
_vvvvvvv1.AddView((android.view.View)(_vvvvvvvv1.getObject()),(int) (_vvvvvvv3.getLeft()+__c.DipToCurrent((int) (4))),(int) (_vvvvvvv1.getHeight()-__c.DipToCurrent((int) (18))),_vvvvvvv1.getWidth(),__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 139;BA.debugLine="MyErrorLabel.Visible=False";
_vvvvvvvv1.setVisible(__c.False);
 //BA.debugLineNum = 142;BA.debugLine="MyErrorLabel.TextColor=xui.Color_Red";
_vvvvvvvv1.setTextColor(_vvvv5.Color_Red);
 //BA.debugLineNum = 143;BA.debugLine="MyErrorLabel.TextSize=11";
_vvvvvvvv1.setTextSize((float) (11));
 //BA.debugLineNum = 144;BA.debugLine="MyErrorLabel.Text=\"Lütfen E-Mail Adresinizi Girin";
_vvvvvvvv1.setText(BA.ObjectToCharSequence("Lütfen E-Mail Adresinizi Giriniz!"));
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return "";
}
public String  _getvvvvvv2() throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Public Sub getText As String";
 //BA.debugLineNum = 197;BA.debugLine="Return MyTextboxB4X.Text";
if (true) return _vvvvvvv2.getText();
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont  _getvvvvvv3() throws Exception{
 //BA.debugLineNum = 204;BA.debugLine="Public Sub getTextFont As B4XFont";
 //BA.debugLineNum = 205;BA.debugLine="Return MyTextboxB4X.Font";
if (true) return _vvvvvvv2.getFont();
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 53;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 54;BA.debugLine="mEventName = EventName";
_vvvvvv4 = _eventname;
 //BA.debugLineNum = 55;BA.debugLine="mCallBack = Callback";
_vvvvvv5 = _callback;
 //BA.debugLineNum = 56;BA.debugLine="img.Initialize(\"img\")";
_vvvvvv0.Initialize(ba,"img");
 //BA.debugLineNum = 57;BA.debugLine="MyPanel.Initialize(\"MyPanel\")";
_vvvvvvv1.Initialize(ba,"MyPanel");
 //BA.debugLineNum = 58;BA.debugLine="MyTextbox.Initialize(\"MyTextbox\")";
_vvvvvvv3.Initialize(ba,"MyTextbox");
 //BA.debugLineNum = 59;BA.debugLine="iconCircle.Initialize(\"iconCircle\")";
_vvvvvvv5.Initialize(ba,"iconCircle");
 //BA.debugLineNum = 60;BA.debugLine="MyHLabel.Initialize(\"MyHLabel\")";
_vvvvvvv7.Initialize(ba,"MyHLabel");
 //BA.debugLineNum = 61;BA.debugLine="MyErrorLabel.Initialize(\"MyErrorLabel\")";
_vvvvvvvv1.Initialize(ba,"MyErrorLabel");
 //BA.debugLineNum = 62;BA.debugLine="MyTextboxB4X=MyTextbox";
_vvvvvvv2 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_vvvvvvv3.getObject()));
 //BA.debugLineNum = 63;BA.debugLine="iconCircleB4X=iconCircle";
_vvvvvvv4 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_vvvvvvv5.getObject()));
 //BA.debugLineNum = 64;BA.debugLine="MyHintLabel=MyHLabel";
_vvvvvvv6 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_vvvvvvv7.getObject()));
 //BA.debugLineNum = 65;BA.debugLine="MyErrorLabelB4X=MyErrorLabel";
_vvvvvvv0 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_vvvvvvvv1.getObject()));
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_action() throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Private Sub MyTextBox_Action";
 //BA.debugLineNum = 272;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_EnterPr";
if (_vvvv5.SubExists(ba,_vvvvvv5,_vvvvvv4+"_EnterPressed",(int) (0))) { 
__c.CallSubNew(ba,_vvvvvv5,_vvvvvv4+"_EnterPressed");};
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_beginedit() throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Private Sub MyTextBox_BeginEdit";
 //BA.debugLineNum = 209;BA.debugLine="CallSub2(Me,\"MyTextBox_FocusChanged\",True)";
__c.CallSubNew2(ba,this,"MyTextBox_FocusChanged",(Object)(__c.True));
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_endedit() throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Private Sub MyTextBox_EndEdit";
 //BA.debugLineNum = 212;BA.debugLine="CallSub2(Me,\"MyTextBox_FocusChanged\",False)";
__c.CallSubNew2(ba,this,"MyTextBox_FocusChanged",(Object)(__c.False));
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_enterpressed() throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="private Sub MyTextBox_EnterPressed";
 //BA.debugLineNum = 268;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_EnterPr";
if (_vvvv5.SubExists(ba,_vvvvvv5,_vvvvvv4+"_EnterPressed",(int) (0))) { 
__c.CallSubNew(ba,_vvvvvv5,_vvvvvv4+"_EnterPressed");};
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_focuschanged(boolean _hasfocus) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Private Sub MyTextBox_FocusChanged (HasFocus As Bo";
 //BA.debugLineNum = 216;BA.debugLine="If HasFocus = False Then";
if (_hasfocus==__c.False) { 
 //BA.debugLineNum = 217;BA.debugLine="If MyTextbox.Text.Length=0 Then";
if (_vvvvvvv3.getText().length()==0) { 
 //BA.debugLineNum = 221;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
_vvvvvvv6.SetLayoutAnimated((int) (200),_vvvvvvv6.getLeft(),(int) (_vvvvvvv1.getHeight()/(double)2-__c.DipToCurrent((int) (10))),_vvvvvvv6.getWidth(),_vvvvvvv6.getHeight());
 }else if(_vvvvvvv2.getText().length()>0) { 
 //BA.debugLineNum = 228;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
_vvvvvvv6.SetLayoutAnimated((int) (200),_vvvvvvv6.getLeft(),(int) (_vvvvvvv3.getTop()-__c.DipToCurrent((int) (2.5))),_vvvvvvv6.getWidth(),_vvvvvvv6.getHeight());
 };
 }else {
 //BA.debugLineNum = 232;BA.debugLine="If MyTextbox.Text.Length=0 Then";
if (_vvvvvvv3.getText().length()==0) { 
 //BA.debugLineNum = 234;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
_vvvvvvv6.SetLayoutAnimated((int) (200),_vvvvvvv6.getLeft(),(int) (_vvvvvvv3.getTop()-__c.DipToCurrent((int) (2.5))),_vvvvvvv6.getWidth(),_vvvvvvv6.getHeight());
 }else {
 };
 };
 //BA.debugLineNum = 244;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_FocusCh";
if (_vvvv5.SubExists(ba,_vvvvvv5,_vvvvvv4+"_FocusChanged",(int) (1))) { 
__c.CallSubNew2(ba,_vvvvvv5,_vvvvvv4+"_FocusChanged",(Object)(_hasfocus));};
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return "";
}
public String  _mytextbox_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Private Sub MyTextBox_TextChanged (Old As String,";
 //BA.debugLineNum = 250;BA.debugLine="If New.Length>Old.Length Then";
if (_new.length()>_old.length()) { 
 //BA.debugLineNum = 252;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.le";
_vvvvvvv6.SetLayoutAnimated((int) (200),_vvvvvvv6.getLeft(),(int) (_vvvvvvv3.getTop()-__c.DipToCurrent((int) (2.5))),_vvvvvvv6.getWidth(),_vvvvvvv6.getHeight());
 };
 //BA.debugLineNum = 261;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_TextCha";
if (_vvvv5.SubExists(ba,_vvvvvv5,_vvvvvv4+"_TextChanged",(int) (2))) { 
__c.CallSubNew3(ba,_vvvvvv5,_vvvvvv4+"_TextChanged",(Object)(_old),(Object)(_new));};
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvv2(String _text) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Public Sub setText(Text As String)";
 //BA.debugLineNum = 178;BA.debugLine="If ilkAcilis=True Then";
if (_vvvvvvvv2==__c.True) { 
 //BA.debugLineNum = 180;BA.debugLine="If Text.Length=0 Then";
if (_text.length()==0) { 
 //BA.debugLineNum = 182;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
_vvvvvvv6.SetLayoutAnimated((int) (200),_vvvvvvv6.getLeft(),(int) (_vvvvvvv3.getHeight()/(double)2),_vvvvvvv6.getWidth(),_vvvvvvv6.getHeight());
 }else {
 //BA.debugLineNum = 187;BA.debugLine="MyHintLabel.SetLayoutAnimated(200,MyHintLabel.l";
_vvvvvvv6.SetLayoutAnimated((int) (200),_vvvvvvv6.getLeft(),(int) (_vvvvvvv3.getTop()-__c.DipToCurrent((int) (2.5))),_vvvvvvv6.getWidth(),_vvvvvvv6.getHeight());
 };
 };
 //BA.debugLineNum = 190;BA.debugLine="MyTextbox.Text=Text";
_vvvvvvv3.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvv3(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Public Sub setTextFont(Fnt As B4XFont)";
 //BA.debugLineNum = 201;BA.debugLine="MyTextboxB4X.Font=Fnt";
_vvvvvvv2.setFont(_fnt);
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return "";
}
public String  _vvvvv0(String _errortext) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Public Sub ShowError(ErrorText As String)";
 //BA.debugLineNum = 164;BA.debugLine="MyErrorLabel.Visible=True";
_vvvvvvvv1.setVisible(__c.True);
 //BA.debugLineNum = 165;BA.debugLine="MyErrorLabel.Text=ErrorText";
_vvvvvvvv1.setText(BA.ObjectToCharSequence(_errortext));
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return "";
}
public double  _vvvvvv1(String _nametext) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _uzunpanel = null;
anywheresoftware.b4a.objects.B4XCanvas _canvas1 = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rect = null;
double _sonuc = 0;
 //BA.debugLineNum = 150;BA.debugLine="Private Sub UzunlukHesapla (NameText As String) As";
 //BA.debugLineNum = 151;BA.debugLine="Dim UzunPanel As B4XView = xui.CreatePanel(\"\")";
_uzunpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_uzunpanel = _vvvv5.CreatePanel(ba,"");
 //BA.debugLineNum = 152;BA.debugLine="UzunPanel.SetLayoutAnimated(0,0,0,MyPanel.Width,M";
_uzunpanel.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_vvvvvvv1.getWidth(),_vvvvvvv1.getHeight());
 //BA.debugLineNum = 153;BA.debugLine="Dim canvas1 As B4XCanvas";
_canvas1 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 154;BA.debugLine="canvas1.Initialize(UzunPanel)";
_canvas1.Initialize(_uzunpanel);
 //BA.debugLineNum = 155;BA.debugLine="Dim Rect As B4XRect = canvas1.MeasureText(NameTex";
_rect = _canvas1.MeasureText(_nametext,_vvvvvvv6.getFont());
 //BA.debugLineNum = 156;BA.debugLine="Dim Sonuc As Double=(Rect.Width*1.08)";
_sonuc = (_rect.getWidth()*1.08);
 //BA.debugLineNum = 160;BA.debugLine="Return Sonuc";
if (true) return _sonuc;
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return 0;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "MYTEXTBOX_FOCUSCHANGED"))
	return _mytextbox_focuschanged((Boolean) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
