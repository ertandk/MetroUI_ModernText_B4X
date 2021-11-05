package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bbcodeview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.bbcodeview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.bbcodeview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _internalbbviewurl{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.collections.List Lines;
public void Initialize() {
IsInitialized = true;
Lines = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
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
public anywheresoftware.b4a.objects.B4XViewWrapper _backgroundimageview = null;
public b4a.example.bctextengine._bcparagraph _paragraph = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _touchpanel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _sv = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _padding = null;
public b4a.example.bbcodeparser._bbcodeparsedata _parsedata = null;
public Object _tag = null;
public boolean _lazyloading = false;
public anywheresoftware.b4a.objects.collections.List _imageviewscache = null;
public b4a.example.b4xorderedmap _usedimageviews = null;
public anywheresoftware.b4a.objects.collections.List _externalruns = null;
public boolean _disableautomaticdrawingsinlazymode = false;
public boolean _rtl = false;
public anywheresoftware.b4a.objects.collections.Map _urltolines = null;
public boolean _autounderlineurls = false;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _base_resize(b4a.example.bbcodeview __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="sv.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="sv.ScrollViewContentWidth = Width";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewContentWidth((int) (_width));
RDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="If DisableAutomaticDrawingsInLazyMode Then Return";
if (__ref._disableautomaticdrawingsinlazymode /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="If Runs.IsInitialized Then";
if (__ref._runs /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
RDebugUtils.currentLine=10223621;
 //BA.debugLineNum = 10223621;BA.debugLine="If ParseData.NeedToReparseWhenResize Then";
if (__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .NeedToReparseWhenResize /*boolean*/ ) { 
RDebugUtils.currentLine=10223622;
 //BA.debugLineNum = 10223622;BA.debugLine="ParseAndDraw";
__ref._parseanddraw /*String*/ (null);
 }else {
RDebugUtils.currentLine=10223624;
 //BA.debugLineNum = 10223624;BA.debugLine="Redraw";
__ref._redraw /*String*/ (null);
 };
 };
RDebugUtils.currentLine=10223627;
 //BA.debugLineNum = 10223627;BA.debugLine="End Sub";
return "";
}
public String  _parseanddraw(b4a.example.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "parseanddraw", true))
	 {return ((String) Debug.delegate(ba, "parseanddraw", null));}
anywheresoftware.b4a.objects.collections.List _pe = null;
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Public Sub ParseAndDraw";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="ParseData.NeedToReparseWhenResize = False";
__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .NeedToReparseWhenResize /*boolean*/  = __c.False;
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="ParseData.Text = mText";
__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .Text /*String*/  = __ref._mtext /*String*/ ;
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="ParseData.URLs.Clear";
__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="ParseData.Width = (mBase.Width - Padding.Left - P";
__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .Width /*int*/  = (int) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()-__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getRight()));
RDebugUtils.currentLine=10813446;
 //BA.debugLineNum = 10813446;BA.debugLine="Dim pe As List = mTextEngine.TagParser.Parse(Pars";
_pe = new anywheresoftware.b4a.objects.collections.List();
_pe = __ref._mtextengine /*b4a.example.bctextengine*/ ._tagparser /*b4a.example.bbcodeparser*/ ._parse /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ );
RDebugUtils.currentLine=10813447;
 //BA.debugLineNum = 10813447;BA.debugLine="sv.ScrollViewInnerPanel.RemoveAllViews";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().RemoveAllViews();
RDebugUtils.currentLine=10813448;
 //BA.debugLineNum = 10813448;BA.debugLine="If TouchPanel.IsInitialized Then";
if (__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=10813449;
 //BA.debugLineNum = 10813449;BA.debugLine="sv.ScrollViewInnerPanel.AddView(TouchPanel, 0, 0";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().AddView((android.view.View)(__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 };
RDebugUtils.currentLine=10813451;
 //BA.debugLineNum = 10813451;BA.debugLine="sv.ScrollViewInnerPanel.AddView(ForegroundImageVi";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().AddView((android.view.View)(__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=10813452;
 //BA.debugLineNum = 10813452;BA.debugLine="If ExternalRuns.IsInitialized And ExternalRuns.Si";
if (__ref._externalruns /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized() && __ref._externalruns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=10813453;
 //BA.debugLineNum = 10813453;BA.debugLine="Runs = ExternalRuns";
__ref._runs /*anywheresoftware.b4a.objects.collections.List*/  = __ref._externalruns /*anywheresoftware.b4a.objects.collections.List*/ ;
 }else {
RDebugUtils.currentLine=10813455;
 //BA.debugLineNum = 10813455;BA.debugLine="Runs = mTextEngine.TagParser.CreateRuns(pe, Pars";
__ref._runs /*anywheresoftware.b4a.objects.collections.List*/  = __ref._mtextengine /*b4a.example.bctextengine*/ ._tagparser /*b4a.example.bbcodeparser*/ ._createruns /*anywheresoftware.b4a.objects.collections.List*/ (null,_pe,__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ );
 };
RDebugUtils.currentLine=10813458;
 //BA.debugLineNum = 10813458;BA.debugLine="Redraw";
__ref._redraw /*String*/ (null);
RDebugUtils.currentLine=10813459;
 //BA.debugLineNum = 10813459;BA.debugLine="End Sub";
return "";
}
public String  _redraw(b4a.example.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "redraw", true))
	 {return ((String) Debug.delegate(ba, "redraw", null));}
b4a.example.bctextengine._bctextrun _r = null;
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Public Sub Redraw";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="Dim Style As BCParagraphStyle = mTextEngine.Creat";
_style = __ref._mtextengine /*b4a.example.bctextengine*/ ._createstyle /*b4a.example.bctextengine._bcparagraphstyle*/ (null);
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="Style.Padding = Padding";
__ref._style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/  = __ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ ;
RDebugUtils.currentLine=10878979;
 //BA.debugLineNum = 10878979;BA.debugLine="Style.MaxWidth = mBase.Width";
__ref._style /*b4a.example.bctextengine._bcparagraphstyle*/ .MaxWidth /*int*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth();
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="Style.ResizeHeightAutomatically = True";
__ref._style /*b4a.example.bctextengine._bcparagraphstyle*/ .ResizeHeightAutomatically /*boolean*/  = __c.True;
RDebugUtils.currentLine=10878981;
 //BA.debugLineNum = 10878981;BA.debugLine="Style.RTL = RTL";
__ref._style /*b4a.example.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/  = __ref._rtl /*boolean*/ ;
RDebugUtils.currentLine=10878982;
 //BA.debugLineNum = 10878982;BA.debugLine="URLToLines.Clear";
__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=10878983;
 //BA.debugLineNum = 10878983;BA.debugLine="If LazyLoading Then";
if (__ref._lazyloading /*boolean*/ ) { 
RDebugUtils.currentLine=10878984;
 //BA.debugLineNum = 10878984;BA.debugLine="CleanExistingImageViews(False, UsedImageViews.Ke";
__ref._cleanexistingimageviews /*String*/ (null,__c.False,__ref._usedimageviews /*b4a.example.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null),(int) (0),(int) (0));
RDebugUtils.currentLine=10878985;
 //BA.debugLineNum = 10878985;BA.debugLine="UsedImageViews.Clear";
__ref._usedimageviews /*b4a.example.b4xorderedmap*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=10878986;
 //BA.debugLineNum = 10878986;BA.debugLine="Paragraph = mTextEngine.PrepareForLazyDrawing(Ru";
__ref._paragraph /*b4a.example.bctextengine._bcparagraph*/  = __ref._mtextengine /*b4a.example.bctextengine*/ ._prepareforlazydrawing /*b4a.example.bctextengine._bcparagraph*/ (null,__ref._runs /*anywheresoftware.b4a.objects.collections.List*/ ,__ref._style /*b4a.example.bctextengine._bcparagraphstyle*/ ,__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=10878987;
 //BA.debugLineNum = 10878987;BA.debugLine="ForegroundImageView.SetLayoutAnimated(0, Style.P";
__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (__ref._style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()),(int) (__ref._style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()),(int) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentWidth()-__ref._style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()),(int) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentHeight()-__ref._style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getHeight()));
RDebugUtils.currentLine=10878988;
 //BA.debugLineNum = 10878988;BA.debugLine="If AutoUnderlineURLs And ParseData.URLs.Size > 0";
if (__ref._autounderlineurls /*boolean*/  && __ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
RDebugUtils.currentLine=10878989;
 //BA.debugLineNum = 10878989;BA.debugLine="CollectURLs";
__ref._collecturls /*String*/ (null);
RDebugUtils.currentLine=10878990;
 //BA.debugLineNum = 10878990;BA.debugLine="For Each r As BCTextRun In URLToLines.Keys";
{
final anywheresoftware.b4a.BA.IterableList group14 = __ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_r = (b4a.example.bctextengine._bctextrun)(group14.Get(index14));
RDebugUtils.currentLine=10878991;
 //BA.debugLineNum = 10878991;BA.debugLine="r.Underline = False";
_r.Underline /*boolean*/  = __c.False;
 }
};
 };
RDebugUtils.currentLine=10878994;
 //BA.debugLineNum = 10878994;BA.debugLine="DrawVisibleRegion";
__ref._drawvisibleregion /*String*/ (null);
 }else {
RDebugUtils.currentLine=10878996;
 //BA.debugLineNum = 10878996;BA.debugLine="Paragraph = mTextEngine.DrawText(Runs, Style, Fo";
__ref._paragraph /*b4a.example.bctextengine._bcparagraph*/  = __ref._mtextengine /*b4a.example.bctextengine*/ ._drawtext /*b4a.example.bctextengine._bcparagraph*/ (null,__ref._runs /*anywheresoftware.b4a.objects.collections.List*/ ,__ref._style /*b4a.example.bctextengine._bcparagraphstyle*/ ,__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
 };
RDebugUtils.currentLine=10878998;
 //BA.debugLineNum = 10878998;BA.debugLine="If TouchPanel.IsInitialized Then";
if (__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=10878999;
 //BA.debugLineNum = 10878999;BA.debugLine="TouchPanel.SetLayoutAnimated(0, ForegroundImageV";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 };
RDebugUtils.currentLine=10879001;
 //BA.debugLineNum = 10879001;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=9895939;
 //BA.debugLineNum = 9895939;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=9895941;
 //BA.debugLineNum = 9895941;BA.debugLine="Private Runs As List";
_runs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9895942;
 //BA.debugLineNum = 9895942;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=9895943;
 //BA.debugLineNum = 9895943;BA.debugLine="Public Style As BCParagraphStyle";
_style = new b4a.example.bctextengine._bcparagraphstyle();
RDebugUtils.currentLine=9895944;
 //BA.debugLineNum = 9895944;BA.debugLine="Private mTextEngine As BCTextEngine";
_mtextengine = new b4a.example.bctextengine();
RDebugUtils.currentLine=9895945;
 //BA.debugLineNum = 9895945;BA.debugLine="Private mText As String";
_mtext = "";
RDebugUtils.currentLine=9895946;
 //BA.debugLineNum = 9895946;BA.debugLine="Public ForegroundImageView As B4XView";
_foregroundimageview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9895947;
 //BA.debugLineNum = 9895947;BA.debugLine="Public BackgroundImageView As B4XView";
_backgroundimageview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9895948;
 //BA.debugLineNum = 9895948;BA.debugLine="Public Paragraph As BCParagraph";
_paragraph = new b4a.example.bctextengine._bcparagraph();
RDebugUtils.currentLine=9895949;
 //BA.debugLineNum = 9895949;BA.debugLine="Private TouchPanel As B4XView";
_touchpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9895950;
 //BA.debugLineNum = 9895950;BA.debugLine="Public sv As B4XView";
_sv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9895951;
 //BA.debugLineNum = 9895951;BA.debugLine="Public Padding As B4XRect";
_padding = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=9895952;
 //BA.debugLineNum = 9895952;BA.debugLine="Public ParseData As BBCodeParseData";
_parsedata = new b4a.example.bbcodeparser._bbcodeparsedata();
RDebugUtils.currentLine=9895953;
 //BA.debugLineNum = 9895953;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=9895954;
 //BA.debugLineNum = 9895954;BA.debugLine="Public LazyLoading As Boolean";
_lazyloading = false;
RDebugUtils.currentLine=9895955;
 //BA.debugLineNum = 9895955;BA.debugLine="Private ImageViewsCache As List";
_imageviewscache = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9895956;
 //BA.debugLineNum = 9895956;BA.debugLine="Private UsedImageViews As B4XOrderedMap";
_usedimageviews = new b4a.example.b4xorderedmap();
RDebugUtils.currentLine=9895957;
 //BA.debugLineNum = 9895957;BA.debugLine="Public ExternalRuns As List";
_externalruns = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9895958;
 //BA.debugLineNum = 9895958;BA.debugLine="Public DisableAutomaticDrawingsInLazyMode As Bool";
_disableautomaticdrawingsinlazymode = false;
RDebugUtils.currentLine=9895959;
 //BA.debugLineNum = 9895959;BA.debugLine="Type InternalBBViewURL (Lines As List)";
;
RDebugUtils.currentLine=9895960;
 //BA.debugLineNum = 9895960;BA.debugLine="Public RTL As Boolean";
_rtl = false;
RDebugUtils.currentLine=9895961;
 //BA.debugLineNum = 9895961;BA.debugLine="Private URLToLines As Map";
_urltolines = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=9895962;
 //BA.debugLineNum = 9895962;BA.debugLine="Public AutoUnderlineURLs As Boolean";
_autounderlineurls = false;
RDebugUtils.currentLine=9895963;
 //BA.debugLineNum = 9895963;BA.debugLine="End Sub";
return "";
}
public String  _cleanexistingimageviews(b4a.example.bbcodeview __ref,boolean _invisibleonly,anywheresoftware.b4a.objects.collections.List _existing,int _offset,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "cleanexistingimageviews", true))
	 {return ((String) Debug.delegate(ba, "cleanexistingimageviews", new Object[] {_invisibleonly,_existing,_offset,_height}));}
b4a.example.bctextengine._bctextline _line = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv = null;
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Private Sub CleanExistingImageViews (InvisibleOnly";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="For Each Line As BCTextLine In Existing";
{
final anywheresoftware.b4a.BA.IterableList group1 = _existing;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (b4a.example.bctextengine._bctextline)(group1.Get(index1));
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="If InvisibleOnly = False Or LineIsVisible(Line,";
if (_invisibleonly==__c.False || __ref._lineisvisible /*boolean*/ (null,_line,_offset,_height)==__c.False) { 
RDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="Dim xiv As B4XView = UsedImageViews.Get(Line)";
_xiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._usedimageviews /*b4a.example.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_line))));
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="xiv.RemoveViewFromParent";
_xiv.RemoveViewFromParent();
RDebugUtils.currentLine=10747909;
 //BA.debugLineNum = 10747909;BA.debugLine="xiv.SetBitmap(Null)";
_xiv.SetBitmap((android.graphics.Bitmap)(__c.Null));
RDebugUtils.currentLine=10747910;
 //BA.debugLineNum = 10747910;BA.debugLine="ImageViewsCache.Add(xiv)";
__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_xiv.getObject()));
RDebugUtils.currentLine=10747911;
 //BA.debugLineNum = 10747911;BA.debugLine="If InvisibleOnly = True Then UsedImageViews.Rem";
if (_invisibleonly==__c.True) { 
__ref._usedimageviews /*b4a.example.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_line));};
 };
 }
};
RDebugUtils.currentLine=10747914;
 //BA.debugLineNum = 10747914;BA.debugLine="End Sub";
return "";
}
public boolean  _lineisvisible(b4a.example.bbcodeview __ref,b4a.example.bctextengine._bctextline _line,int _offset,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "lineisvisible", true))
	 {return ((Boolean) Debug.delegate(ba, "lineisvisible", new Object[] {_line,_offset,_height}));}
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Private Sub LineIsVisible(line As BCTextLine, offs";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="Return line.BaselineY + line.MaxHeightBelowBaseLi";
if (true) return _line.BaselineY /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ >=_offset && _line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ <=_offset+_height;
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="End Sub";
return false;
}
public String  _collecturls(b4a.example.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "collecturls", true))
	 {return ((String) Debug.delegate(ba, "collecturls", null));}
b4a.example.bctextengine._bctextline _line = null;
b4a.example.bctextengine._bcunbreakabletext _un = null;
b4a.example.bctextengine._bcsinglestylesection _st = null;
b4a.example.bbcodeview._internalbbviewurl _extra = null;
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Private Sub CollectURLs";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._paragraph /*b4a.example.bctextengine._bcparagraph*/ .TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (b4a.example.bctextengine._bctextline)(group1.Get(index1));
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group2 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_un = (b4a.example.bctextengine._bcunbreakabletext)(group2.Get(index2));
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="For Each st As BCSingleStyleSection In un.Singl";
{
final anywheresoftware.b4a.BA.IterableList group3 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_st = (b4a.example.bctextengine._bcsinglestylesection)(group3.Get(index3));
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="If ParseData.URLs.ContainsKey(st.Run) Then";
if (__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_st.Run /*b4a.example.bctextengine._bctextrun*/ ))) { 
RDebugUtils.currentLine=11141125;
 //BA.debugLineNum = 11141125;BA.debugLine="Dim extra As InternalBBViewURL";
_extra = new b4a.example.bbcodeview._internalbbviewurl();
RDebugUtils.currentLine=11141126;
 //BA.debugLineNum = 11141126;BA.debugLine="If URLToLines.ContainsKey(st.Run) = False The";
if (__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_st.Run /*b4a.example.bctextengine._bctextrun*/ ))==__c.False) { 
RDebugUtils.currentLine=11141127;
 //BA.debugLineNum = 11141127;BA.debugLine="extra = CreateBCURLExtraData";
_extra = __ref._createbcurlextradata /*b4a.example.bbcodeview._internalbbviewurl*/ (null);
RDebugUtils.currentLine=11141128;
 //BA.debugLineNum = 11141128;BA.debugLine="URLToLines.Put(st.Run, extra)";
__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_st.Run /*b4a.example.bctextengine._bctextrun*/ ),(Object)(_extra));
 }else {
RDebugUtils.currentLine=11141130;
 //BA.debugLineNum = 11141130;BA.debugLine="extra = URLToLines.Get(st.Run)";
_extra = (b4a.example.bbcodeview._internalbbviewurl)(__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_st.Run /*b4a.example.bctextengine._bctextrun*/ )));
 };
RDebugUtils.currentLine=11141132;
 //BA.debugLineNum = 11141132;BA.debugLine="If extra.Lines.IndexOf(line) = -1 Then";
if (_extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_line))==-1) { 
RDebugUtils.currentLine=11141133;
 //BA.debugLineNum = 11141133;BA.debugLine="extra.Lines.Add(line)";
_extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_line));
 };
 };
 }
};
 }
};
 }
};
RDebugUtils.currentLine=11141139;
 //BA.debugLineNum = 11141139;BA.debugLine="End Sub";
return "";
}
public b4a.example.bbcodeview._internalbbviewurl  _createbcurlextradata(b4a.example.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "createbcurlextradata", true))
	 {return ((b4a.example.bbcodeview._internalbbviewurl) Debug.delegate(ba, "createbcurlextradata", null));}
b4a.example.bbcodeview._internalbbviewurl _t1 = null;
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Private Sub CreateBCURLExtraData  As InternalBBVie";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="Dim t1 As InternalBBViewURL";
_t1 = new b4a.example.bbcodeview._internalbbviewurl();
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="t1.Lines.Initialize";
_t1.Lines /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=11206661;
 //BA.debugLineNum = 11206661;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(b4a.example.bbcodeview __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.ScrollViewWrapper _sp = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=10158089;
 //BA.debugLineNum = 10158089;BA.debugLine="Dim sp As ScrollView";
_sp = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=10158090;
 //BA.debugLineNum = 10158090;BA.debugLine="sp.Initialize2(50dip, \"sv\")";
_sp.Initialize2(ba,__c.DipToCurrent((int) (50)),"sv");
RDebugUtils.currentLine=10158096;
 //BA.debugLineNum = 10158096;BA.debugLine="LazyLoading = Props.GetDefault(\"LazyLoading\", Tru";
__ref._lazyloading /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("LazyLoading"),(Object)(__c.True)));
RDebugUtils.currentLine=10158097;
 //BA.debugLineNum = 10158097;BA.debugLine="AutoUnderlineURLs = Props.GetDefault(\"AutoUnderli";
__ref._autounderlineurls /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("AutoUnderline"),(Object)(__c.True)));
RDebugUtils.currentLine=10158098;
 //BA.debugLineNum = 10158098;BA.debugLine="If LazyLoading Then";
if (__ref._lazyloading /*boolean*/ ) { 
RDebugUtils.currentLine=10158099;
 //BA.debugLineNum = 10158099;BA.debugLine="ImageViewsCache.Initialize";
__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=10158100;
 //BA.debugLineNum = 10158100;BA.debugLine="UsedImageViews = B4XCollections.CreateOrderedMap";
__ref._usedimageviews /*b4a.example.b4xorderedmap*/  = _b4xcollections._createorderedmap /*b4a.example.b4xorderedmap*/ (ba);
 };
RDebugUtils.currentLine=10158102;
 //BA.debugLineNum = 10158102;BA.debugLine="sv = sp";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_sp.getObject()));
RDebugUtils.currentLine=10158103;
 //BA.debugLineNum = 10158103;BA.debugLine="sv.Color = mBase.Color";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor());
RDebugUtils.currentLine=10158104;
 //BA.debugLineNum = 10158104;BA.debugLine="sv.ScrollViewInnerPanel.Color = mBase.Color";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().setColor(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor());
RDebugUtils.currentLine=10158105;
 //BA.debugLineNum = 10158105;BA.debugLine="mBase.AddView(sv, 0, 0, mBase.Width, mBase.Height";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=10158106;
 //BA.debugLineNum = 10158106;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=10158107;
 //BA.debugLineNum = 10158107;BA.debugLine="mText = xlbl.Text";
__ref._mtext /*String*/  = _xlbl.getText();
RDebugUtils.currentLine=10158108;
 //BA.debugLineNum = 10158108;BA.debugLine="ParseData.DefaultColor = xlbl.TextColor";
__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .DefaultColor /*int*/  = _xlbl.getTextColor();
RDebugUtils.currentLine=10158109;
 //BA.debugLineNum = 10158109;BA.debugLine="ParseData.DefaultFont = xlbl.Font";
__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xlbl.getFont();
RDebugUtils.currentLine=10158110;
 //BA.debugLineNum = 10158110;BA.debugLine="ParseData.ViewsPanel = sv.ScrollViewInnerPanel";
__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel();
RDebugUtils.currentLine=10158111;
 //BA.debugLineNum = 10158111;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_linkcl";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_linkclicked",(int) (1))) { 
RDebugUtils.currentLine=10158112;
 //BA.debugLineNum = 10158112;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"TouchPanel");
 };
RDebugUtils.currentLine=10158119;
 //BA.debugLineNum = 10158119;BA.debugLine="ParseData.DefaultBoldFont = xui.CreateFont(Typefa";
__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .DefaultBoldFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont(__c.Typeface.CreateNew(_lbl.getTypeface(),__c.Typeface.STYLE_BOLD),_xlbl.getTextSize());
RDebugUtils.currentLine=10158123;
 //BA.debugLineNum = 10158123;BA.debugLine="End Sub";
return "";
}
public String  _drawvisibleregion(b4a.example.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "drawvisibleregion", true))
	 {return ((String) Debug.delegate(ba, "drawvisibleregion", null));}
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Private Sub DrawVisibleRegion";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="If DisableAutomaticDrawingsInLazyMode Then Return";
if (__ref._disableautomaticdrawingsinlazymode /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="UpdateVisibleRegion(sv.ScrollViewOffsetY * mTextE";
__ref._updatevisibleregion /*String*/ (null,(int) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewOffsetY()*__ref._mtextengine /*b4a.example.bctextengine*/ ._mscale /*float*/ ),(int) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*__ref._mtextengine /*b4a.example.bctextengine*/ ._mscale /*float*/ ));
RDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="End Sub";
return "";
}
public String  _updatevisibleregion(b4a.example.bbcodeview __ref,int _offsety,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "updatevisibleregion", true))
	 {return ((String) Debug.delegate(ba, "updatevisibleregion", new Object[] {_offsety,_height}));}
boolean _foundfirst = false;
anywheresoftware.b4a.objects.collections.List _existing = null;
b4a.example.bctextengine._bctextline _line = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv = null;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Public Sub UpdateVisibleRegion (OffsetY As Int, He";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="Dim foundFirst As Boolean";
_foundfirst = false;
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="Dim Existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="Existing.Initialize";
_existing.Initialize();
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="Existing.AddAll(UsedImageViews.Keys)";
_existing.AddAll(__ref._usedimageviews /*b4a.example.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null));
RDebugUtils.currentLine=10616837;
 //BA.debugLineNum = 10616837;BA.debugLine="CleanExistingImageViews(True, Existing, OffsetY,";
__ref._cleanexistingimageviews /*String*/ (null,__c.True,_existing,_offsety,_height);
RDebugUtils.currentLine=10616838;
 //BA.debugLineNum = 10616838;BA.debugLine="For Each Line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group6 = __ref._paragraph /*b4a.example.bctextengine._bcparagraph*/ .TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_line = (b4a.example.bctextengine._bctextline)(group6.Get(index6));
RDebugUtils.currentLine=10616839;
 //BA.debugLineNum = 10616839;BA.debugLine="If LineIsVisible (Line, OffsetY, Height) Then";
if (__ref._lineisvisible /*boolean*/ (null,_line,_offsety,_height)) { 
RDebugUtils.currentLine=10616840;
 //BA.debugLineNum = 10616840;BA.debugLine="foundFirst = True";
_foundfirst = __c.True;
RDebugUtils.currentLine=10616841;
 //BA.debugLineNum = 10616841;BA.debugLine="If UsedImageViews.ContainsKey(Line) Then";
if (__ref._usedimageviews /*b4a.example.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_line))) { 
RDebugUtils.currentLine=10616842;
 //BA.debugLineNum = 10616842;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=10616844;
 //BA.debugLineNum = 10616844;BA.debugLine="Dim xiv As B4XView";
_xiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=10616845;
 //BA.debugLineNum = 10616845;BA.debugLine="If ImageViewsCache.Size = 0 Then";
if (__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
RDebugUtils.currentLine=10616846;
 //BA.debugLineNum = 10616846;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=10616847;
 //BA.debugLineNum = 10616847;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=10616848;
 //BA.debugLineNum = 10616848;BA.debugLine="xiv = iv";
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 }else {
RDebugUtils.currentLine=10616850;
 //BA.debugLineNum = 10616850;BA.debugLine="xiv = ImageViewsCache.Get(ImageViewsCache.Size";
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1))));
RDebugUtils.currentLine=10616851;
 //BA.debugLineNum = 10616851;BA.debugLine="ImageViewsCache.RemoveAt(ImageViewsCache.Size";
__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 };
RDebugUtils.currentLine=10616853;
 //BA.debugLineNum = 10616853;BA.debugLine="sv.ScrollViewInnerPanel.AddView(xiv, 0, 0, 0, 0";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().AddView((android.view.View)(_xiv.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=10616854;
 //BA.debugLineNum = 10616854;BA.debugLine="xiv.SendToBack";
_xiv.SendToBack();
RDebugUtils.currentLine=10616855;
 //BA.debugLineNum = 10616855;BA.debugLine="mTextEngine.DrawSingleLine(Line, xiv, Paragraph";
__ref._mtextengine /*b4a.example.bctextengine*/ ._drawsingleline /*String*/ (null,_line,_xiv,__ref._paragraph /*b4a.example.bctextengine._bcparagraph*/ );
RDebugUtils.currentLine=10616856;
 //BA.debugLineNum = 10616856;BA.debugLine="UsedImageViews.Put(Line, xiv)";
__ref._usedimageviews /*b4a.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_line),(Object)(_xiv.getObject()));
 }else {
RDebugUtils.currentLine=10616858;
 //BA.debugLineNum = 10616858;BA.debugLine="If foundFirst Then Exit";
if (_foundfirst) { 
if (true) break;};
 };
 }
};
RDebugUtils.currentLine=10616861;
 //BA.debugLineNum = 10616861;BA.debugLine="End Sub";
return "";
}
public b4a.example.bctextengine._bctextrun  _findtouchedrun(b4a.example.bbcodeview __ref,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "findtouchedrun", true))
	 {return ((b4a.example.bctextengine._bctextrun) Debug.delegate(ba, "findtouchedrun", new Object[] {_x,_y}));}
int _offsetx = 0;
int _offsety = 0;
b4a.example.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Private Sub FindTouchedRun(x As Float, y As Float)";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="For Each offsetx As Int In Array(0, -5dip, 5dip)";
{
final Object[] group1 = new Object[]{(Object)(0),(Object)(-__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (5)))};
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_offsetx = (int)(BA.ObjectToNumber(group1[index1]));
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="For Each offsety As Int In Array(0, -3dip, 3dip)";
{
final Object[] group2 = new Object[]{(Object)(0),(Object)(-__c.DipToCurrent((int) (3))),(Object)(__c.DipToCurrent((int) (3)))};
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_offsety = (int)(BA.ObjectToNumber(group2[index2]));
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="Dim single As BCSingleStyleSection = mTextEngin";
_single = __ref._mtextengine /*b4a.example.bctextengine*/ ._findsinglestylesection /*b4a.example.bctextengine._bcsinglestylesection*/ (null,__ref._paragraph /*b4a.example.bctextengine._bcparagraph*/ ,(int) (_x+_offsetx),(int) (_y+_offsety));
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="If single <> Null Then";
if (_single!= null) { 
RDebugUtils.currentLine=11010053;
 //BA.debugLineNum = 11010053;BA.debugLine="Return single.Run";
if (true) return _single.Run /*b4a.example.bctextengine._bctextrun*/ ;
 };
 }
};
 }
};
RDebugUtils.currentLine=11010057;
 //BA.debugLineNum = 11010057;BA.debugLine="Return Null";
if (true) return (b4a.example.bctextengine._bctextrun)(__c.Null);
RDebugUtils.currentLine=11010058;
 //BA.debugLineNum = 11010058;BA.debugLine="End Sub";
return null;
}
public String  _gettext(b4a.example.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "gettext", true))
	 {return ((String) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Public Sub getText As String";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="Return mText";
if (true) return __ref._mtext /*String*/ ;
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="End Sub";
return "";
}
public b4a.example.bctextengine  _gettextengine(b4a.example.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "gettextengine", true))
	 {return ((b4a.example.bctextengine) Debug.delegate(ba, "gettextengine", null));}
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Public Sub getTextEngine As BCTextEngine";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="Return mTextEngine";
if (true) return __ref._mtextengine /*b4a.example.bctextengine*/ ;
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getviews(b4a.example.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "getviews", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getviews", null));}
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Public Sub getViews As Map";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="Return ParseData.Views";
if (true) return __ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .Views /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.bbcodeview __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=9961477;
 //BA.debugLineNum = 9961477;BA.debugLine="ForegroundImageView = iv";
__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=9961478;
 //BA.debugLineNum = 9961478;BA.debugLine="ParseData.Initialize";
__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .Initialize();
RDebugUtils.currentLine=9961479;
 //BA.debugLineNum = 9961479;BA.debugLine="ParseData.Views.Initialize";
__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .Views /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=9961480;
 //BA.debugLineNum = 9961480;BA.debugLine="ParseData.URLs.Initialize";
__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=9961481;
 //BA.debugLineNum = 9961481;BA.debugLine="If xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=9961482;
 //BA.debugLineNum = 9961482;BA.debugLine="Padding.Initialize(5dip, 5dip, 20dip, 5dip)";
__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (20))),(float) (__c.DipToCurrent((int) (5))));
 }else {
RDebugUtils.currentLine=9961484;
 //BA.debugLineNum = 9961484;BA.debugLine="Padding.Initialize(5dip, 5dip, 5dip, 5dip)";
__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))));
 };
RDebugUtils.currentLine=9961486;
 //BA.debugLineNum = 9961486;BA.debugLine="ParseData.ImageCache.Initialize";
__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .ImageCache /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=9961487;
 //BA.debugLineNum = 9961487;BA.debugLine="URLToLines.Initialize";
__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=9961488;
 //BA.debugLineNum = 9961488;BA.debugLine="End Sub";
return "";
}
public String  _markurl(b4a.example.bbcodeview __ref,b4a.example.bctextengine._bctextrun _run) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "markurl", true))
	 {return ((String) Debug.delegate(ba, "markurl", new Object[] {_run}));}
b4a.example.bctextengine._bctextrun _r = null;
b4a.example.bbcodeview._internalbbviewurl _extra = null;
b4a.example.bctextengine._bctextline _line = null;
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Private Sub MarkURL (Run As BCTextRun)";
RDebugUtils.currentLine=11075594;
 //BA.debugLineNum = 11075594;BA.debugLine="For Each r As BCTextRun In URLToLines.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_r = (b4a.example.bctextengine._bctextrun)(group1.Get(index1));
RDebugUtils.currentLine=11075595;
 //BA.debugLineNum = 11075595;BA.debugLine="If r.Underline <> (r = Run) Then";
if (_r.Underline /*boolean*/ !=((_r).equals(_run))) { 
RDebugUtils.currentLine=11075596;
 //BA.debugLineNum = 11075596;BA.debugLine="r.Underline = r = Run";
_r.Underline /*boolean*/  = (_r).equals(_run);
RDebugUtils.currentLine=11075597;
 //BA.debugLineNum = 11075597;BA.debugLine="Dim extra As InternalBBViewURL = URLToLines.Get";
_extra = (b4a.example.bbcodeview._internalbbviewurl)(__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_r)));
RDebugUtils.currentLine=11075598;
 //BA.debugLineNum = 11075598;BA.debugLine="For Each line As BCTextLine In extra.Lines";
{
final anywheresoftware.b4a.BA.IterableList group5 = _extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_line = (b4a.example.bctextengine._bctextline)(group5.Get(index5));
RDebugUtils.currentLine=11075599;
 //BA.debugLineNum = 11075599;BA.debugLine="If UsedImageViews.ContainsKey(line) Then";
if (__ref._usedimageviews /*b4a.example.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_line))) { 
RDebugUtils.currentLine=11075600;
 //BA.debugLineNum = 11075600;BA.debugLine="mTextEngine.DrawSingleLine(line, UsedImageVie";
__ref._mtextengine /*b4a.example.bctextengine*/ ._drawsingleline /*String*/ (null,_line,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._usedimageviews /*b4a.example.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_line)))),__ref._paragraph /*b4a.example.bctextengine._bcparagraph*/ );
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=11075605;
 //BA.debugLineNum = 11075605;BA.debugLine="End Sub";
return "";
}
public String  _settext(b4a.example.bbcodeview __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Public Sub setText(t As String)";
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="mText = t";
__ref._mtext /*String*/  = _t;
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="ParseAndDraw";
__ref._parseanddraw /*String*/ (null);
RDebugUtils.currentLine=10420227;
 //BA.debugLineNum = 10420227;BA.debugLine="End Sub";
return "";
}
public String  _settextengine(b4a.example.bbcodeview __ref,b4a.example.bctextengine _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "settextengine", true))
	 {return ((String) Debug.delegate(ba, "settextengine", new Object[] {_b}));}
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Public Sub setTextEngine (b As BCTextEngine)";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="mTextEngine = b";
__ref._mtextengine /*b4a.example.bctextengine*/  = _b;
RDebugUtils.currentLine=10289157;
 //BA.debugLineNum = 10289157;BA.debugLine="If mText <> \"\" Then";
if ((__ref._mtext /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=10289158;
 //BA.debugLineNum = 10289158;BA.debugLine="setText(mText)";
__ref._settext /*String*/ (null,__ref._mtext /*String*/ );
 };
RDebugUtils.currentLine=10289160;
 //BA.debugLineNum = 10289160;BA.debugLine="End Sub";
return "";
}
public String  _setviews(b4a.example.bbcodeview __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "setviews", true))
	 {return ((String) Debug.delegate(ba, "setviews", new Object[] {_m}));}
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Public Sub setViews (m As Map)";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="ParseData.Views = m";
__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .Views /*anywheresoftware.b4a.objects.collections.Map*/  = _m;
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="End Sub";
return "";
}
public String  _sv_scrollchanged(b4a.example.bbcodeview __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "sv_scrollchanged", true))
	 {return ((String) Debug.delegate(ba, "sv_scrollchanged", new Object[] {_position}));}
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Private Sub sv_ScrollChanged(Position As Int)";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="If LazyLoading Then DrawVisibleRegion";
if (__ref._lazyloading /*boolean*/ ) { 
__ref._drawvisibleregion /*String*/ (null);};
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="End Sub";
return "";
}
public String  _touchpanel_touch(b4a.example.bbcodeview __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "touchpanel_touch", true))
	 {return ((String) Debug.delegate(ba, "touchpanel_touch", new Object[] {_action,_x,_y}));}
b4a.example.bctextengine._bctextrun _run = null;
String _url = "";
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="Dim run As BCTextRun = Null";
_run = (b4a.example.bctextengine._bctextrun)(__c.Null);
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="If URLToLines.Size > 0 Or Action = TouchPanel.TOU";
if (__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0 || _action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP) { 
RDebugUtils.currentLine=10944515;
 //BA.debugLineNum = 10944515;BA.debugLine="run = FindTouchedRun(X, Y)";
_run = __ref._findtouchedrun /*b4a.example.bctextengine._bctextrun*/ (null,_x,_y);
 };
RDebugUtils.currentLine=10944517;
 //BA.debugLineNum = 10944517;BA.debugLine="If run <> Null And ParseData.URLs.ContainsKey(run";
if (_run!= null && __ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_run))) { 
RDebugUtils.currentLine=10944518;
 //BA.debugLineNum = 10944518;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_UP Then";
if (_action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP) { 
RDebugUtils.currentLine=10944519;
 //BA.debugLineNum = 10944519;BA.debugLine="Dim url As String = ParseData.Urls.Get(run)";
_url = BA.ObjectToString(__ref._parsedata /*b4a.example.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_run)));
RDebugUtils.currentLine=10944520;
 //BA.debugLineNum = 10944520;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_LinkC";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_LinkClicked",(Object)(_url));
RDebugUtils.currentLine=10944521;
 //BA.debugLineNum = 10944521;BA.debugLine="MarkURL(Null)";
__ref._markurl /*String*/ (null,(b4a.example.bctextengine._bctextrun)(__c.Null));
 }else 
{RDebugUtils.currentLine=10944522;
 //BA.debugLineNum = 10944522;BA.debugLine="Else If (xui.IsB4i And Action = 4) Or (xui.IsB4A";
if ((__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i() && _action==4) || (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() && _action==3)) { 
RDebugUtils.currentLine=10944523;
 //BA.debugLineNum = 10944523;BA.debugLine="MarkURL(Null)";
__ref._markurl /*String*/ (null,(b4a.example.bctextengine._bctextrun)(__c.Null));
 }else {
RDebugUtils.currentLine=10944526;
 //BA.debugLineNum = 10944526;BA.debugLine="MarkURL(run)";
__ref._markurl /*String*/ (null,_run);
 }}
;
RDebugUtils.currentLine=10944528;
 //BA.debugLineNum = 10944528;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10944530;
 //BA.debugLineNum = 10944530;BA.debugLine="MarkURL(Null)";
__ref._markurl /*String*/ (null,(b4a.example.bctextengine._bctextrun)(__c.Null));
RDebugUtils.currentLine=10944531;
 //BA.debugLineNum = 10944531;BA.debugLine="End Sub";
return "";
}
}