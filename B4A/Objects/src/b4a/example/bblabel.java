package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bblabel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.bblabel");
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
public anywheresoftware.b4a.objects.collections.List _runs = null;
public b4a.example.bctextengine._bcparagraphstyle _style = null;
public b4a.example.bctextengine _mtextengine = null;
public String _mtext = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _foregroundimageview = null;
public b4a.example.bctextengine._bcparagraph _paragraph = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _padding = null;
public b4a.example.bbcodeparser._bbcodeparsedata _parsedata = null;
public Object _tag = null;
public boolean _disableresizeevent = false;
public boolean _wordwrap = false;
public boolean _rtl = false;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _base_resize(b4a.example.bblabel __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="If DisableResizeEvent Then Return";
if (__ref._disableresizeevent /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="If Runs.IsInitialized Then";
if (__ref._runs /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
RDebugUtils.currentLine=11730947;
 //BA.debugLineNum = 11730947;BA.debugLine="If ParseData.NeedToReparseWhenResize Then";
if (__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .NeedToReparseWhenResize /*boolean*/ ) { 
RDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="ParseAndDraw";
__ref._parseanddraw /*String*/ (null);
 }else {
RDebugUtils.currentLine=11730950;
 //BA.debugLineNum = 11730950;BA.debugLine="Redraw";
__ref._redraw /*String*/ (null);
 };
 };
RDebugUtils.currentLine=11730953;
 //BA.debugLineNum = 11730953;BA.debugLine="End Sub";
return "";
}
public String  _parseanddraw(b4a.example.bblabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "parseanddraw", true))
	 {return ((String) Debug.delegate(ba, "parseanddraw", null));}
int _i = 0;
anywheresoftware.b4a.objects.collections.List _pe = null;
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Public Sub ParseAndDraw";
RDebugUtils.currentLine=12058625;
 //BA.debugLineNum = 12058625;BA.debugLine="For i = mBase.NumberOfViews - 1 To 1 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (1);
_i = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="mBase.GetView(i).RemoveViewFromParent";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_i).RemoveViewFromParent();
 }
};
RDebugUtils.currentLine=12058628;
 //BA.debugLineNum = 12058628;BA.debugLine="ParseData.NeedToReparseWhenResize = False";
__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .NeedToReparseWhenResize /*boolean*/  = __c.False;
RDebugUtils.currentLine=12058629;
 //BA.debugLineNum = 12058629;BA.debugLine="ParseData.Text = mText";
__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .Text /*String*/  = __ref._mtext /*String*/ ;
RDebugUtils.currentLine=12058630;
 //BA.debugLineNum = 12058630;BA.debugLine="ParseData.Width = (mBase.Width - Padding.Left - P";
__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .Width /*int*/  = (int) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()-__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getRight()));
RDebugUtils.currentLine=12058631;
 //BA.debugLineNum = 12058631;BA.debugLine="Dim pe As List = mTextEngine.TagParser.Parse(Pars";
_pe = new anywheresoftware.b4a.objects.collections.List();
_pe = __ref._mtextengine /*b4a.example.bctextengine*/ ._tagparser /*b4a.example.bbcodeparser*/ ._parse /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ );
RDebugUtils.currentLine=12058632;
 //BA.debugLineNum = 12058632;BA.debugLine="Runs = mTextEngine.TagParser.CreateRuns(pe, Parse";
__ref._runs /*anywheresoftware.b4a.objects.collections.List*/  = __ref._mtextengine /*b4a.example.bctextengine*/ ._tagparser /*b4a.example.bbcodeparser*/ ._createruns /*anywheresoftware.b4a.objects.collections.List*/ (null,_pe,__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ );
RDebugUtils.currentLine=12058633;
 //BA.debugLineNum = 12058633;BA.debugLine="Redraw";
__ref._redraw /*String*/ (null);
RDebugUtils.currentLine=12058634;
 //BA.debugLineNum = 12058634;BA.debugLine="End Sub";
return "";
}
public String  _redraw(b4a.example.bblabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "redraw", true))
	 {return ((String) Debug.delegate(ba, "redraw", null));}
int _dx = 0;
int _dy = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Public Sub Redraw";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="Dim Style As BCParagraphStyle = mTextEngine.Creat";
_style = __ref._mtextengine /*b4a.example.bctextengine*/ ._createstyle /*b4a.example.bctextengine._bcparagraphstyle*/ (null);
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="Style.Padding = Padding";
__ref._style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/  = __ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ ;
RDebugUtils.currentLine=12124163;
 //BA.debugLineNum = 12124163;BA.debugLine="Style.MaxWidth = mBase.Width";
__ref._style /*b4a.example.bctextengine._bcparagraphstyle*/ .MaxWidth /*int*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth();
RDebugUtils.currentLine=12124164;
 //BA.debugLineNum = 12124164;BA.debugLine="Style.HorizontalAlignment = \"left\"";
__ref._style /*b4a.example.bctextengine._bcparagraphstyle*/ .HorizontalAlignment /*String*/  = "left";
RDebugUtils.currentLine=12124165;
 //BA.debugLineNum = 12124165;BA.debugLine="Style.WordWrap = WordWrap";
__ref._style /*b4a.example.bctextengine._bcparagraphstyle*/ .WordWrap /*boolean*/  = __ref._wordwrap /*boolean*/ ;
RDebugUtils.currentLine=12124166;
 //BA.debugLineNum = 12124166;BA.debugLine="Style.RTL = RTL";
__ref._style /*b4a.example.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/  = __ref._rtl /*boolean*/ ;
RDebugUtils.currentLine=12124167;
 //BA.debugLineNum = 12124167;BA.debugLine="Paragraph = mTextEngine.DrawText(Runs, Style, For";
__ref._paragraph /*b4a.example.bctextengine._bcparagraph*/  = __ref._mtextengine /*b4a.example.bctextengine*/ ._drawtext /*b4a.example.bctextengine._bcparagraph*/ (null,__ref._runs /*anywheresoftware.b4a.objects.collections.List*/ ,__ref._style /*b4a.example.bctextengine._bcparagraphstyle*/ ,__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Null)));
RDebugUtils.currentLine=12124168;
 //BA.debugLineNum = 12124168;BA.debugLine="Dim dx As Int = mBase.Width / 2 - ForegroundImage";
_dx = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft());
RDebugUtils.currentLine=12124169;
 //BA.debugLineNum = 12124169;BA.debugLine="Dim dy As Int = mBase.Height / 2 - ForegroundImag";
_dy = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop());
RDebugUtils.currentLine=12124170;
 //BA.debugLineNum = 12124170;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group10 = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group10.Get(index10)));
RDebugUtils.currentLine=12124171;
 //BA.debugLineNum = 12124171;BA.debugLine="v.Left = v.Left + dx";
_v.setLeft((int) (_v.getLeft()+_dx));
RDebugUtils.currentLine=12124172;
 //BA.debugLineNum = 12124172;BA.debugLine="v.Top = v.Top + dy";
_v.setTop((int) (_v.getTop()+_dy));
 }
};
RDebugUtils.currentLine=12124174;
 //BA.debugLineNum = 12124174;BA.debugLine="ForegroundImageView.Visible = Paragraph.Height >";
__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__ref._paragraph /*b4a.example.bctextengine._bcparagraph*/ .Height /*int*/ >0);
RDebugUtils.currentLine=12124175;
 //BA.debugLineNum = 12124175;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.bblabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=11534341;
 //BA.debugLineNum = 11534341;BA.debugLine="Private Runs As List";
_runs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11534342;
 //BA.debugLineNum = 11534342;BA.debugLine="Public Style As BCParagraphStyle";
_style = new b4a.example.bctextengine._bcparagraphstyle();
RDebugUtils.currentLine=11534343;
 //BA.debugLineNum = 11534343;BA.debugLine="Private mTextEngine As BCTextEngine";
_mtextengine = new b4a.example.bctextengine();
RDebugUtils.currentLine=11534344;
 //BA.debugLineNum = 11534344;BA.debugLine="Private mText As String";
_mtext = "";
RDebugUtils.currentLine=11534345;
 //BA.debugLineNum = 11534345;BA.debugLine="Public ForegroundImageView As B4XView";
_foregroundimageview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=11534346;
 //BA.debugLineNum = 11534346;BA.debugLine="Public Paragraph As BCParagraph";
_paragraph = new b4a.example.bctextengine._bcparagraph();
RDebugUtils.currentLine=11534347;
 //BA.debugLineNum = 11534347;BA.debugLine="Public Padding As B4XRect";
_padding = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=11534348;
 //BA.debugLineNum = 11534348;BA.debugLine="Public ParseData As BBCodeParseData";
_parsedata = new b4a.example.bbcodeparser._bbcodeparsedata();
RDebugUtils.currentLine=11534349;
 //BA.debugLineNum = 11534349;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=11534350;
 //BA.debugLineNum = 11534350;BA.debugLine="Public DisableResizeEvent As Boolean";
_disableresizeevent = false;
RDebugUtils.currentLine=11534351;
 //BA.debugLineNum = 11534351;BA.debugLine="Public WordWrap As Boolean = True";
_wordwrap = __c.True;
RDebugUtils.currentLine=11534352;
 //BA.debugLineNum = 11534352;BA.debugLine="Public RTL As Boolean";
_rtl = false;
RDebugUtils.currentLine=11534353;
 //BA.debugLineNum = 11534353;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.bblabel __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=11665411;
 //BA.debugLineNum = 11665411;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=11665412;
 //BA.debugLineNum = 11665412;BA.debugLine="mBase.AddView(ForegroundImageView, 0, 0, mBase.Wi";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=11665413;
 //BA.debugLineNum = 11665413;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=11665414;
 //BA.debugLineNum = 11665414;BA.debugLine="ParseData.DefaultColor = xlbl.TextColor";
__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .DefaultColor /*int*/  = _xlbl.getTextColor();
RDebugUtils.currentLine=11665415;
 //BA.debugLineNum = 11665415;BA.debugLine="ParseData.DefaultFont = xlbl.Font";
__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xlbl.getFont();
RDebugUtils.currentLine=11665416;
 //BA.debugLineNum = 11665416;BA.debugLine="ParseData.ViewsPanel = mBase";
__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=11665417;
 //BA.debugLineNum = 11665417;BA.debugLine="mText = xlbl.Text";
__ref._mtext /*String*/  = _xlbl.getText();
RDebugUtils.currentLine=11665422;
 //BA.debugLineNum = 11665422;BA.debugLine="ParseData.DefaultBoldFont = xui.CreateFont(Typefa";
__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .DefaultBoldFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont(__c.Typeface.CreateNew(_lbl.getTypeface(),__c.Typeface.STYLE_BOLD),_xlbl.getTextSize());
RDebugUtils.currentLine=11665426;
 //BA.debugLineNum = 11665426;BA.debugLine="End Sub";
return "";
}
public String  _gettext(b4a.example.bblabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "gettext", true))
	 {return ((String) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Public Sub getText As String";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="Return mText";
if (true) return __ref._mtext /*String*/ ;
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="End Sub";
return "";
}
public b4a.example.bctextengine  _gettextengine(b4a.example.bblabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "gettextengine", true))
	 {return ((b4a.example.bctextengine) Debug.delegate(ba, "gettextengine", null));}
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Public Sub getTextEngine As BCTextEngine";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="Return mTextEngine";
if (true) return __ref._mtextengine /*b4a.example.bctextengine*/ ;
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.bblabel __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=11599876;
 //BA.debugLineNum = 11599876;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=11599877;
 //BA.debugLineNum = 11599877;BA.debugLine="ForegroundImageView = iv";
__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=11599878;
 //BA.debugLineNum = 11599878;BA.debugLine="ParseData.Initialize";
__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .Initialize();
RDebugUtils.currentLine=11599879;
 //BA.debugLineNum = 11599879;BA.debugLine="Padding.Initialize(2dip, 2dip, 2dip, 2dip)";
__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__c.DipToCurrent((int) (2))),(float) (__c.DipToCurrent((int) (2))),(float) (__c.DipToCurrent((int) (2))),(float) (__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=11599880;
 //BA.debugLineNum = 11599880;BA.debugLine="End Sub";
return "";
}
public String  _settext(b4a.example.bblabel __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Public Sub setText(t As String)";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="mText = t";
__ref._mtext /*String*/  = _t;
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="ParseAndDraw";
__ref._parseanddraw /*String*/ (null);
RDebugUtils.currentLine=11927555;
 //BA.debugLineNum = 11927555;BA.debugLine="End Sub";
return "";
}
public String  _settextengine(b4a.example.bblabel __ref,b4a.example.bctextengine _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "settextengine", true))
	 {return ((String) Debug.delegate(ba, "settextengine", new Object[] {_b}));}
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Public Sub setTextEngine (b As BCTextEngine)";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="mTextEngine = b";
__ref._mtextengine /*b4a.example.bctextengine*/  = _b;
RDebugUtils.currentLine=11796485;
 //BA.debugLineNum = 11796485;BA.debugLine="If mText <> \"\" Then";
if ((__ref._mtext /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=11796486;
 //BA.debugLineNum = 11796486;BA.debugLine="setText(mText)";
__ref._settext /*String*/ (null,__ref._mtext /*String*/ );
 };
RDebugUtils.currentLine=11796488;
 //BA.debugLineNum = 11796488;BA.debugLine="End Sub";
return "";
}
}