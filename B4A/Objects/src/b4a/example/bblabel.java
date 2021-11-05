package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bblabel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.bblabel");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.bblabel.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvv4 = "";
public Object _vvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvv6 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvv5 = null;
public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvv7 = null;
public b4a.example.bctextengine._bcparagraphstyle _vvvvvvvvvvvvvvvvvvvvvv0 = null;
public b4a.example.bctextengine _vvvvvvvvvvvvvvvvvvvv4 = null;
public String _vvvvvvvvvvvvvvvvvvvvvvv1 = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvv2 = null;
public b4a.example.bctextengine._bcparagraph _vvvvvvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _vvvvvvvvvvvvvvvvvvvvvvv7 = null;
public b4a.example.bbcodeparser._bbcodeparsedata _vvvvvvvvvvvvvvvvvvvvvvv0 = null;
public Object _vvvvvv7 = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvv6 = false;
public b4a.example.main _vvvv6 = null;
public b4a.example.starter _vvvv7 = null;
public b4a.example.b4xpages _vvvv0 = null;
public b4a.example.b4xcollections _vvvvv1 = null;
public b4a.example.httputils2service _vvvvv2 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 52;BA.debugLine="If DisableResizeEvent Then Return";
if (_vvvvvvvvvvvvvvvvvvvvvvvvv1) { 
if (true) return "";};
 //BA.debugLineNum = 53;BA.debugLine="If Runs.IsInitialized Then";
if (_vvvvvvvvvvvvvvvvvvvvvv7.IsInitialized()) { 
 //BA.debugLineNum = 54;BA.debugLine="If ParseData.NeedToReparseWhenResize Then";
if (_vvvvvvvvvvvvvvvvvvvvvvv0.NeedToReparseWhenResize /*boolean*/ ) { 
 //BA.debugLineNum = 55;BA.debugLine="ParseAndDraw";
_vvvvvvvvvvvvvvvvvvvvvv1();
 }else {
 //BA.debugLineNum = 57;BA.debugLine="Redraw";
_vvvvvvvvvvvvvvvvvvvvvv2();
 };
 };
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvv4 = "";
 //BA.debugLineNum = 3;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvv5 = new Object();
 //BA.debugLineNum = 4;BA.debugLine="Public mBase As B4XView 'ignore";
_vvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI 'ignore";
_vvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 6;BA.debugLine="Private Runs As List";
_vvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="Public Style As BCParagraphStyle";
_vvvvvvvvvvvvvvvvvvvvvv0 = new b4a.example.bctextengine._bcparagraphstyle();
 //BA.debugLineNum = 8;BA.debugLine="Private mTextEngine As BCTextEngine";
_vvvvvvvvvvvvvvvvvvvv4 = new b4a.example.bctextengine();
 //BA.debugLineNum = 9;BA.debugLine="Private mText As String";
_vvvvvvvvvvvvvvvvvvvvvvv1 = "";
 //BA.debugLineNum = 10;BA.debugLine="Public ForegroundImageView As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Public Paragraph As BCParagraph";
_vvvvvvvvvvvvvvvvvvvvvvv4 = new b4a.example.bctextengine._bcparagraph();
 //BA.debugLineNum = 12;BA.debugLine="Public Padding As B4XRect";
_vvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 13;BA.debugLine="Public ParseData As BBCodeParseData";
_vvvvvvvvvvvvvvvvvvvvvvv0 = new b4a.example.bbcodeparser._bbcodeparsedata();
 //BA.debugLineNum = 14;BA.debugLine="Public Tag As Object";
_vvvvvv7 = new Object();
 //BA.debugLineNum = 15;BA.debugLine="Public DisableResizeEvent As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
 //BA.debugLineNum = 16;BA.debugLine="Public WordWrap As Boolean = True";
_vvvvvvvvvvvvvvvvvvvvvvvvv2 = __c.True;
 //BA.debugLineNum = 17;BA.debugLine="Public RTL As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvv6 = false;
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
 //BA.debugLineNum = 30;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 31;BA.debugLine="mBase = Base";
_vvvvvv6 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 32;BA.debugLine="Tag = mBase.Tag";
_vvvvvv7 = _vvvvvv6.getTag();
 //BA.debugLineNum = 33;BA.debugLine="mBase.Tag = Me";
_vvvvvv6.setTag(this);
 //BA.debugLineNum = 34;BA.debugLine="mBase.AddView(ForegroundImageView, 0, 0, mBase.Wi";
_vvvvvv6.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvv2.getObject()),(int) (0),(int) (0),_vvvvvv6.getWidth(),_vvvvvv6.getHeight());
 //BA.debugLineNum = 35;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 36;BA.debugLine="ParseData.DefaultColor = xlbl.TextColor";
_vvvvvvvvvvvvvvvvvvvvvvv0.DefaultColor /*int*/  = _xlbl.getTextColor();
 //BA.debugLineNum = 37;BA.debugLine="ParseData.DefaultFont = xlbl.Font";
_vvvvvvvvvvvvvvvvvvvvvvv0.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xlbl.getFont();
 //BA.debugLineNum = 38;BA.debugLine="ParseData.ViewsPanel = mBase";
_vvvvvvvvvvvvvvvvvvvvvvv0.ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _vvvvvv6;
 //BA.debugLineNum = 39;BA.debugLine="mText = xlbl.Text";
_vvvvvvvvvvvvvvvvvvvvvvv1 = _xlbl.getText();
 //BA.debugLineNum = 44;BA.debugLine="ParseData.DefaultBoldFont = xui.CreateFont(Typefa";
_vvvvvvvvvvvvvvvvvvvvvvv0.DefaultBoldFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _vvvv5.CreateFont(__c.Typeface.CreateNew(_lbl.getTypeface(),__c.Typeface.STYLE_BOLD),_xlbl.getTextSize());
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _getvvvvvv2() throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Public Sub getText As String";
 //BA.debugLineNum = 82;BA.debugLine="Return mText";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvv1;
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public b4a.example.bctextengine  _getvvvvvvvvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Public Sub getTextEngine As BCTextEngine";
 //BA.debugLineNum = 73;BA.debugLine="Return mTextEngine";
if (true) return _vvvvvvvvvvvvvvvvvvvv4;
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 21;BA.debugLine="mEventName = EventName";
_vvvvvv4 = _eventname;
 //BA.debugLineNum = 22;BA.debugLine="mCallBack = Callback";
_vvvvvv5 = _callback;
 //BA.debugLineNum = 23;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 24;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
 //BA.debugLineNum = 25;BA.debugLine="ForegroundImageView = iv";
_vvvvvvvvvvvvvvvvvvvvvvv2 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 //BA.debugLineNum = 26;BA.debugLine="ParseData.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvv0.Initialize();
 //BA.debugLineNum = 27;BA.debugLine="Padding.Initialize(2dip, 2dip, 2dip, 2dip)";
_vvvvvvvvvvvvvvvvvvvvvvv7.Initialize((float) (__c.DipToCurrent((int) (2))),(float) (__c.DipToCurrent((int) (2))),(float) (__c.DipToCurrent((int) (2))),(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.collections.List _pe = null;
 //BA.debugLineNum = 85;BA.debugLine="Public Sub ParseAndDraw";
 //BA.debugLineNum = 86;BA.debugLine="For i = mBase.NumberOfViews - 1 To 1 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (1);
_i = (int) (_vvvvvv6.getNumberOfViews()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 87;BA.debugLine="mBase.GetView(i).RemoveViewFromParent";
_vvvvvv6.GetView(_i).RemoveViewFromParent();
 }
};
 //BA.debugLineNum = 89;BA.debugLine="ParseData.NeedToReparseWhenResize = False";
_vvvvvvvvvvvvvvvvvvvvvvv0.NeedToReparseWhenResize /*boolean*/  = __c.False;
 //BA.debugLineNum = 90;BA.debugLine="ParseData.Text = mText";
_vvvvvvvvvvvvvvvvvvvvvvv0.Text /*String*/  = _vvvvvvvvvvvvvvvvvvvvvvv1;
 //BA.debugLineNum = 91;BA.debugLine="ParseData.Width = (mBase.Width - Padding.Left - P";
_vvvvvvvvvvvvvvvvvvvvvvv0.Width /*int*/  = (int) ((_vvvvvv6.getWidth()-_vvvvvvvvvvvvvvvvvvvvvvv7.getLeft()-_vvvvvvvvvvvvvvvvvvvvvvv7.getRight()));
 //BA.debugLineNum = 92;BA.debugLine="Dim pe As List = mTextEngine.TagParser.Parse(Pars";
_pe = new anywheresoftware.b4a.objects.collections.List();
_pe = _vvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*b4a.example.bbcodeparser*/ ._vvvvvvvvvvvvvvvvvv0 /*anywheresoftware.b4a.objects.collections.List*/ (_vvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 93;BA.debugLine="Runs = mTextEngine.TagParser.CreateRuns(pe, Parse";
_vvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*b4a.example.bbcodeparser*/ ._vvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4a.objects.collections.List*/ (_pe,_vvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 94;BA.debugLine="Redraw";
_vvvvvvvvvvvvvvvvvvvvvv2();
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
int _dx = 0;
int _dy = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
 //BA.debugLineNum = 97;BA.debugLine="Public Sub Redraw";
 //BA.debugLineNum = 98;BA.debugLine="Dim Style As BCParagraphStyle = mTextEngine.Creat";
_vvvvvvvvvvvvvvvvvvvvvv0 = _vvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvv6 /*b4a.example.bctextengine._bcparagraphstyle*/ ();
 //BA.debugLineNum = 99;BA.debugLine="Style.Padding = Padding";
_vvvvvvvvvvvvvvvvvvvvvv0.Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/  = _vvvvvvvvvvvvvvvvvvvvvvv7;
 //BA.debugLineNum = 100;BA.debugLine="Style.MaxWidth = mBase.Width";
_vvvvvvvvvvvvvvvvvvvvvv0.MaxWidth /*int*/  = _vvvvvv6.getWidth();
 //BA.debugLineNum = 101;BA.debugLine="Style.HorizontalAlignment = \"left\"";
_vvvvvvvvvvvvvvvvvvvvvv0.HorizontalAlignment /*String*/  = "left";
 //BA.debugLineNum = 102;BA.debugLine="Style.WordWrap = WordWrap";
_vvvvvvvvvvvvvvvvvvvvvv0.WordWrap /*boolean*/  = _vvvvvvvvvvvvvvvvvvvvvvvvv2;
 //BA.debugLineNum = 103;BA.debugLine="Style.RTL = RTL";
_vvvvvvvvvvvvvvvvvvvvvv0.RTL /*boolean*/  = _vvvvvvvvvvvvvvvvvvvvvvvv6;
 //BA.debugLineNum = 104;BA.debugLine="Paragraph = mTextEngine.DrawText(Runs, Style, For";
_vvvvvvvvvvvvvvvvvvvvvvv4 = _vvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*b4a.example.bctextengine._bcparagraph*/ (_vvvvvvvvvvvvvvvvvvvvvv7,_vvvvvvvvvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvvvvvvvvvv2,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Null)));
 //BA.debugLineNum = 105;BA.debugLine="Dim dx As Int = mBase.Width / 2 - ForegroundImage";
_dx = (int) (_vvvvvv6.getWidth()/(double)2-_vvvvvvvvvvvvvvvvvvvvvvv2.getWidth()/(double)2-_vvvvvvvvvvvvvvvvvvvvvvv2.getLeft());
 //BA.debugLineNum = 106;BA.debugLine="Dim dy As Int = mBase.Height / 2 - ForegroundImag";
_dy = (int) (_vvvvvv6.getHeight()/(double)2-_vvvvvvvvvvvvvvvvvvvvvvv2.getHeight()/(double)2-_vvvvvvvvvvvvvvvvvvvvvvv2.getTop());
 //BA.debugLineNum = 107;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group10 = _vvvvvv6.GetAllViewsRecursive();
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group10.Get(index10)));
 //BA.debugLineNum = 108;BA.debugLine="v.Left = v.Left + dx";
_v.setLeft((int) (_v.getLeft()+_dx));
 //BA.debugLineNum = 109;BA.debugLine="v.Top = v.Top + dy";
_v.setTop((int) (_v.getTop()+_dy));
 }
};
 //BA.debugLineNum = 111;BA.debugLine="ForegroundImageView.Visible = Paragraph.Height >";
_vvvvvvvvvvvvvvvvvvvvvvv2.setVisible(_vvvvvvvvvvvvvvvvvvvvvvv4.Height /*int*/ >0);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvv2(String _t) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Public Sub setText(t As String)";
 //BA.debugLineNum = 77;BA.debugLine="mText = t";
_vvvvvvvvvvvvvvvvvvvvvvv1 = _t;
 //BA.debugLineNum = 78;BA.debugLine="ParseAndDraw";
_vvvvvvvvvvvvvvvvvvvvvv1();
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvv5(b4a.example.bctextengine _b) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Public Sub setTextEngine (b As BCTextEngine)";
 //BA.debugLineNum = 63;BA.debugLine="mTextEngine = b";
_vvvvvvvvvvvvvvvvvvvv4 = _b;
 //BA.debugLineNum = 67;BA.debugLine="If mText <> \"\" Then";
if ((_vvvvvvvvvvvvvvvvvvvvvvv1).equals("") == false) { 
 //BA.debugLineNum = 68;BA.debugLine="setText(mText)";
_setvvvvvv2(_vvvvvvvvvvvvvvvvvvvvvvv1);
 };
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "SETTEXTENGINE"))
	return _setvvvvvvvvvvvvvvvvvvvvvv5((b4a.example.bctextengine) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
