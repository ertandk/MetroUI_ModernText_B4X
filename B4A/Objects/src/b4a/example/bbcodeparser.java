package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bbcodeparser extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.bbcodeparser");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.bbcodeparser.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _bbcodetextnode{
public boolean IsInitialized;
public String Text;
public anywheresoftware.b4a.objects.collections.List Tags;
public void Initialize() {
IsInitialized = true;
Text = "";
Tags = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bbcodetagnode{
public boolean IsInitialized;
public String Tag;
public anywheresoftware.b4a.objects.collections.Map Extra;
public boolean CanHaveNestedTags;
public void Initialize() {
IsInitialized = true;
Tag = "";
Extra = new anywheresoftware.b4a.objects.collections.Map();
CanHaveNestedTags = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bbcodeparsedata{
public boolean IsInitialized;
public String Text;
public anywheresoftware.b4a.objects.collections.Map URLs;
public int Width;
public anywheresoftware.b4a.objects.B4XViewWrapper ViewsPanel;
public anywheresoftware.b4a.objects.collections.Map Views;
public boolean NeedToReparseWhenResize;
public anywheresoftware.b4a.objects.collections.Map ImageCache;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont DefaultBoldFont;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont DefaultFont;
public int DefaultColor;
public int UrlColor;
public void Initialize() {
IsInitialized = true;
Text = "";
URLs = new anywheresoftware.b4a.objects.collections.Map();
Width = 0;
ViewsPanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
Views = new anywheresoftware.b4a.objects.collections.Map();
NeedToReparseWhenResize = false;
ImageCache = new anywheresoftware.b4a.objects.collections.Map();
DefaultBoldFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
DefaultFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
DefaultColor = 0;
UrlColor = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.b4xset _allowedtags = null;
public anywheresoftware.b4a.objects.collections.List _stack = null;
public int _start = 0;
public b4a.example.bctextengine _mtextengine = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _urlcolor = 0;
public anywheresoftware.b4a.objects.collections.Map _colorsmap = null;
public anywheresoftware.b4a.keywords.StringBuilderWrapper _errorstring = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _class_globals(b4a.example.bbcodeparser __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="Type BBCodeTextNode (Text As String, Tags As List";
;
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="Type BBCodeTagNode (Tag As String, Extra As Map,";
;
RDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="Type BBCodeParseData (Text As String, URLs As Map";
;
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="Private AllowedTags As B4XSet";
_allowedtags = new b4a.example.b4xset();
RDebugUtils.currentLine=8912902;
 //BA.debugLineNum = 8912902;BA.debugLine="Private Stack As List";
_stack = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8912903;
 //BA.debugLineNum = 8912903;BA.debugLine="Private Start As Int";
_start = 0;
RDebugUtils.currentLine=8912904;
 //BA.debugLineNum = 8912904;BA.debugLine="Private mTextEngine As BCTextEngine";
_mtextengine = new b4a.example.bctextengine();
RDebugUtils.currentLine=8912905;
 //BA.debugLineNum = 8912905;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=8912906;
 //BA.debugLineNum = 8912906;BA.debugLine="Public UrlColor As Int = 0xFF003FFF";
_urlcolor = (int) (0xff003fff);
RDebugUtils.currentLine=8912907;
 //BA.debugLineNum = 8912907;BA.debugLine="Public ColorsMap As Map";
_colorsmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=8912908;
 //BA.debugLineNum = 8912908;BA.debugLine="Public ErrorString As StringBuilder";
_errorstring = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=8912909;
 //BA.debugLineNum = 8912909;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _createruns(b4a.example.bbcodeparser __ref,anywheresoftware.b4a.objects.collections.List _texts,b4a.example.bbcodeparser._bbcodeparsedata _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "createruns", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createruns", new Object[] {_texts,_data}));}
anywheresoftware.b4a.objects.collections.List _runs = null;
b4a.example.bbcodeparser._bbcodetextnode _textnode = null;
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Public Sub CreateRuns (Texts As List, Data As BBCo";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="Dim Runs As List";
_runs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="Runs.Initialize";
_runs.Initialize();
RDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="For Each TextNode As BBCodeTextNode In Texts";
{
final anywheresoftware.b4a.BA.IterableList group3 = _texts;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_textnode = (b4a.example.bbcodeparser._bbcodetextnode)(group3.Get(index3));
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="TextToRun(TextNode, Runs, Data)";
__ref._texttorun /*String*/ (null,_textnode,_runs,_data);
 }
};
RDebugUtils.currentLine=9568262;
 //BA.debugLineNum = 9568262;BA.debugLine="Return Runs";
if (true) return _runs;
RDebugUtils.currentLine=9568263;
 //BA.debugLineNum = 9568263;BA.debugLine="End Sub";
return null;
}
public String  _texttorun(b4a.example.bbcodeparser __ref,b4a.example.bbcodeparser._bbcodetextnode _text,anywheresoftware.b4a.objects.collections.List _runslist,b4a.example.bbcodeparser._bbcodeparsedata _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "texttorun", true))
	 {return ((String) Debug.delegate(ba, "texttorun", new Object[] {_text,_runslist,_data}));}
anywheresoftware.b4a.objects.collections.List _list = null;
b4a.example.bctextengine._bctextrun _run = null;
boolean _customfont = false;
int _fontsize = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _currentfont = null;
boolean _islistelement = false;
int _i = 0;
b4a.example.bbcodeparser._bbcodetagnode _tag = null;
b4a.example.bctextengine._bcstyledunderline _uu = null;
String _url = "";
String _clr = "";
String _name = "";
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _newfont = null;
b4a.example.bctextengine._bctextrun _parent = null;
b4a.example.bctextengine._bcconnectedruns _cr = null;
String _dir = "";
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Private Sub TextToRun (Text As BBCodeTextNode, Run";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Dim list As List = RunsList";
_list = new anywheresoftware.b4a.objects.collections.List();
_list = _runslist;
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="Dim Run As BCTextRun = mTextEngine.CreateRun(Text";
_run = __ref._mtextengine /*b4a.example.bctextengine*/ ._createrun /*b4a.example.bctextengine._bctextrun*/ (null,_text.Text /*String*/ );
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="Run.TextColor = Data.DefaultColor";
_run.TextColor /*int*/  = _data.DefaultColor /*int*/ ;
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="Run.TextFont = Data.DefaultFont";
_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _data.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="Dim customfont As Boolean";
_customfont = false;
RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="Dim FontSize As Int = Data.DefaultFont.Size";
_fontsize = (int) (_data.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getSize());
RDebugUtils.currentLine=9633799;
 //BA.debugLineNum = 9633799;BA.debugLine="Dim CurrentFont As B4XFont = Data.DefaultFont";
_currentfont = _data.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=9633800;
 //BA.debugLineNum = 9633800;BA.debugLine="Dim IsListElement As Boolean";
_islistelement = false;
RDebugUtils.currentLine=9633801;
 //BA.debugLineNum = 9633801;BA.debugLine="For i = 0 To Text.Tags.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=9633802;
 //BA.debugLineNum = 9633802;BA.debugLine="Dim tag As BBCodeTagNode = Text.Tags.Get(i)";
_tag = (b4a.example.bbcodeparser._bbcodetagnode)(_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=9633803;
 //BA.debugLineNum = 9633803;BA.debugLine="Select tag.Tag";
switch (BA.switchObjectToInt(_tag.Tag /*String*/ ,"u","b","url","color","img","view","vertical","textsize","font","alignment","span","indent","list","*","e","direction","fontawesome","materialicons")) {
case 0: {
RDebugUtils.currentLine=9633805;
 //BA.debugLineNum = 9633805;BA.debugLine="Run.Underline = True";
_run.Underline /*boolean*/  = __c.True;
RDebugUtils.currentLine=9633806;
 //BA.debugLineNum = 9633806;BA.debugLine="If tag.Extra.IsInitialized Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
RDebugUtils.currentLine=9633807;
 //BA.debugLineNum = 9633807;BA.debugLine="Dim uu As BCStyledUnderline";
_uu = new b4a.example.bctextengine._bcstyledunderline();
RDebugUtils.currentLine=9633808;
 //BA.debugLineNum = 9633808;BA.debugLine="uu.Initialize";
_uu.Initialize();
RDebugUtils.currentLine=9633809;
 //BA.debugLineNum = 9633809;BA.debugLine="uu.Style = tag.Extra.GetDefault(\"style\", mTex";
_uu.Style /*String*/  = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("style"),(Object)(__ref._mtextengine /*b4a.example.bctextengine*/ ._defaultunderlinestyle /*b4a.example.bctextengine._bcstyledunderline*/ .Style /*String*/ )));
RDebugUtils.currentLine=9633810;
 //BA.debugLineNum = 9633810;BA.debugLine="uu.Style = uu.Style.ToLowerCase";
_uu.Style /*String*/  = _uu.Style /*String*/ .toLowerCase();
RDebugUtils.currentLine=9633811;
 //BA.debugLineNum = 9633811;BA.debugLine="If tag.Extra.ContainsKey(\"color\") Then uu.Clr";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("color"))) { 
_uu.Clr /*int*/  = __ref._parsecolorstring /*int*/ (null,BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("color"))));}
else {
_uu.Clr /*int*/  = (int) (0);};
RDebugUtils.currentLine=9633812;
 //BA.debugLineNum = 9633812;BA.debugLine="uu.Thickness = DipToCurrent(tag.Extra.GetDefa";
_uu.Thickness /*float*/  = (float) (__c.DipToCurrent((int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("thickness"),(Object)(1))))));
RDebugUtils.currentLine=9633813;
 //BA.debugLineNum = 9633813;BA.debugLine="If Run.Extra.IsInitialized = False Then Run.E";
if (_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=9633814;
 //BA.debugLineNum = 9633814;BA.debugLine="Run.Extra.Put(mTextEngine.EXTRA_STYLEDUNDERLI";
_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._mtextengine /*b4a.example.bctextengine*/ ._extra_styledunderline /*String*/ ),(Object)(_uu));
 };
 break; }
case 1: {
RDebugUtils.currentLine=9633817;
 //BA.debugLineNum = 9633817;BA.debugLine="customfont = True";
_customfont = __c.True;
RDebugUtils.currentLine=9633818;
 //BA.debugLineNum = 9633818;BA.debugLine="CurrentFont = Data.DefaultBoldFont";
_currentfont = _data.DefaultBoldFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
 break; }
case 2: {
RDebugUtils.currentLine=9633820;
 //BA.debugLineNum = 9633820;BA.debugLine="Dim url As String";
_url = "";
RDebugUtils.currentLine=9633821;
 //BA.debugLineNum = 9633821;BA.debugLine="If tag.Extra.IsInitialized Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
RDebugUtils.currentLine=9633822;
 //BA.debugLineNum = 9633822;BA.debugLine="url = tag.Extra.Get(\"url\")";
_url = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("url")));
 }else {
RDebugUtils.currentLine=9633824;
 //BA.debugLineNum = 9633824;BA.debugLine="url = Text.Text";
_url = _text.Text /*String*/ ;
RDebugUtils.currentLine=9633825;
 //BA.debugLineNum = 9633825;BA.debugLine="Run.TextDirection = mTextEngine.TextDirection";
_run.TextDirection /*int*/  = __ref._mtextengine /*b4a.example.bctextengine*/ ._textdirectionltr /*int*/ ;
 };
RDebugUtils.currentLine=9633827;
 //BA.debugLineNum = 9633827;BA.debugLine="If Data.URLs.IsInitialized Then Data.URLs.Put(";
if (_data.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
_data.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_run),(Object)(_url));};
RDebugUtils.currentLine=9633828;
 //BA.debugLineNum = 9633828;BA.debugLine="Run.Underline = True";
_run.Underline /*boolean*/  = __c.True;
RDebugUtils.currentLine=9633829;
 //BA.debugLineNum = 9633829;BA.debugLine="Run.TextColor = UrlColor";
_run.TextColor /*int*/  = __ref._urlcolor /*int*/ ;
 break; }
case 3: {
RDebugUtils.currentLine=9633831;
 //BA.debugLineNum = 9633831;BA.debugLine="Dim clr As String = tag.Extra.Get(\"color\")";
_clr = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("color")));
RDebugUtils.currentLine=9633832;
 //BA.debugLineNum = 9633832;BA.debugLine="Run.TextColor = ParseColorString(clr)";
_run.TextColor /*int*/  = __ref._parsecolorstring /*int*/ (null,_clr);
 break; }
case 4: {
RDebugUtils.currentLine=9633834;
 //BA.debugLineNum = 9633834;BA.debugLine="SetImageView(tag, Run, Data)";
__ref._setimageview /*void*/ (null,_tag,_run,_data);
RDebugUtils.currentLine=9633835;
 //BA.debugLineNum = 9633835;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("vertical"))) { 
RDebugUtils.currentLine=9633836;
 //BA.debugLineNum = 9633836;BA.debugLine="Run.VerticalOffset = GetDimensionFromTag(tag,";
_run.VerticalOffset /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"vertical",_data);
 };
RDebugUtils.currentLine=9633838;
 //BA.debugLineNum = 9633838;BA.debugLine="Data.ViewsPanel.AddView(Run.View, 0, 0, Run.Vi";
_data.ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 break; }
case 5: {
RDebugUtils.currentLine=9633840;
 //BA.debugLineNum = 9633840;BA.debugLine="Run.View = GetView(tag, Data)";
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._getview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_tag,_data);
RDebugUtils.currentLine=9633841;
 //BA.debugLineNum = 9633841;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then Run.";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("vertical"))) { 
_run.VerticalOffset /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"vertical",_data);};
RDebugUtils.currentLine=9633842;
 //BA.debugLineNum = 9633842;BA.debugLine="If tag.Extra.ContainsKey(\"width\") Then Run.Vie";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("width"))) { 
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._getdimensionfromtag /*int*/ (null,_tag,"width",_data));};
RDebugUtils.currentLine=9633843;
 //BA.debugLineNum = 9633843;BA.debugLine="If tag.Extra.ContainsKey(\"height\") Then Run.Vi";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("height"))) { 
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._getdimensionfromtag /*int*/ (null,_tag,"height",_data));};
RDebugUtils.currentLine=9633844;
 //BA.debugLineNum = 9633844;BA.debugLine="Data.ViewsPanel.AddView(Run.View, 0, 0, Run.Vi";
_data.ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 break; }
case 6: {
RDebugUtils.currentLine=9633846;
 //BA.debugLineNum = 9633846;BA.debugLine="Run.VerticalOffset = GetDimensionFromTag(tag,";
_run.VerticalOffset /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"vertical",_data);
 break; }
case 7: {
RDebugUtils.currentLine=9633848;
 //BA.debugLineNum = 9633848;BA.debugLine="FontSize = tag.Extra.Get(\"textsize\")";
_fontsize = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("textsize"))));
 break; }
case 8: {
RDebugUtils.currentLine=9633850;
 //BA.debugLineNum = 9633850;BA.debugLine="customfont = True";
_customfont = __c.True;
RDebugUtils.currentLine=9633851;
 //BA.debugLineNum = 9633851;BA.debugLine="Dim name As String = tag.Extra.Get(tag.Tag)";
_name = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_tag.Tag /*String*/ )));
RDebugUtils.currentLine=9633852;
 //BA.debugLineNum = 9633852;BA.debugLine="If mTextEngine.CustomFonts.ContainsKey(name) =";
if (__ref._mtextengine /*b4a.example.bctextengine*/ ._customfonts /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_name))==__c.False) { 
RDebugUtils.currentLine=9633853;
 //BA.debugLineNum = 9633853;BA.debugLine="Log(\"Font missing from TextEngine.CustomFonts";
__c.LogImpl("99633853","Font missing from TextEngine.CustomFonts: "+_name,0);
 }else {
RDebugUtils.currentLine=9633855;
 //BA.debugLineNum = 9633855;BA.debugLine="Dim NewFont As B4XFont =  mTextEngine.CustomF";
_newfont = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont)(__ref._mtextengine /*b4a.example.bctextengine*/ ._customfonts /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_name)));
RDebugUtils.currentLine=9633856;
 //BA.debugLineNum = 9633856;BA.debugLine="CurrentFont = NewFont";
_currentfont = _newfont;
RDebugUtils.currentLine=9633857;
 //BA.debugLineNum = 9633857;BA.debugLine="If tag.Extra.ContainsKey(\"size\") Then FontSiz";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("size"))) { 
_fontsize = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("size"))));};
 };
 break; }
case 9: {
RDebugUtils.currentLine=9633860;
 //BA.debugLineNum = 9633860;BA.debugLine="Run.HorizontalAlignment = tag.Extra.Get(\"align";
_run.HorizontalAlignment /*String*/  = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("alignment")));
 break; }
case 10: {
RDebugUtils.currentLine=9633862;
 //BA.debugLineNum = 9633862;BA.debugLine="If tag.Extra.ContainsKey(\"run\") = False Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("run"))==__c.False) { 
RDebugUtils.currentLine=9633863;
 //BA.debugLineNum = 9633863;BA.debugLine="Dim parent As BCTextRun = mTextEngine.CreateC";
_parent = __ref._mtextengine /*b4a.example.bctextengine*/ ._createconnectedparent /*b4a.example.bctextengine._bctextrun*/ (null);
RDebugUtils.currentLine=9633864;
 //BA.debugLineNum = 9633864;BA.debugLine="Dim cr As BCConnectedRuns = parent.Extra.Get(";
_cr = (b4a.example.bctextengine._bcconnectedruns)(_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._mtextengine /*b4a.example.bctextengine*/ ._extra_connectedruns /*String*/ )));
RDebugUtils.currentLine=9633865;
 //BA.debugLineNum = 9633865;BA.debugLine="cr.ConnectedWidth = GetDimensionFromTag(tag,";
_cr.ConnectedWidth /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"minwidth",_data);
RDebugUtils.currentLine=9633866;
 //BA.debugLineNum = 9633866;BA.debugLine="cr.Alignment = tag.Extra.GetDefault(\"alignmen";
_cr.Alignment /*String*/  = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("alignment"),(Object)("left")));
RDebugUtils.currentLine=9633867;
 //BA.debugLineNum = 9633867;BA.debugLine="RunsList.Add(parent)";
_runslist.Add((Object)(_parent));
RDebugUtils.currentLine=9633868;
 //BA.debugLineNum = 9633868;BA.debugLine="tag.Extra.Put(\"run\", parent)";
_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("run"),(Object)(_parent));
 };
RDebugUtils.currentLine=9633870;
 //BA.debugLineNum = 9633870;BA.debugLine="Dim parent As BCTextRun = tag.Extra.Get(\"run\")";
_parent = (b4a.example.bctextengine._bctextrun)(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("run")));
RDebugUtils.currentLine=9633871;
 //BA.debugLineNum = 9633871;BA.debugLine="Dim cr As BCConnectedRuns = parent.Extra.Get(m";
_cr = (b4a.example.bctextengine._bcconnectedruns)(_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._mtextengine /*b4a.example.bctextengine*/ ._extra_connectedruns /*String*/ )));
RDebugUtils.currentLine=9633872;
 //BA.debugLineNum = 9633872;BA.debugLine="list = cr.Runs";
_list = _cr.Runs /*anywheresoftware.b4a.objects.collections.List*/ ;
 break; }
case 11: {
RDebugUtils.currentLine=9633874;
 //BA.debugLineNum = 9633874;BA.debugLine="Run.IndentLevel = tag.Extra.Get(\"indent\")";
_run.IndentLevel /*int*/  = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("indent"))));
 break; }
case 12: {
RDebugUtils.currentLine=9633876;
 //BA.debugLineNum = 9633876;BA.debugLine="Run.IndentLevel = Run.IndentLevel + 1";
_run.IndentLevel /*int*/  = (int) (_run.IndentLevel /*int*/ +1);
 break; }
case 13: {
RDebugUtils.currentLine=9633878;
 //BA.debugLineNum = 9633878;BA.debugLine="IsListElement = True";
_islistelement = __c.True;
 break; }
case 14: {
RDebugUtils.currentLine=9633880;
 //BA.debugLineNum = 9633880;BA.debugLine="Run.TextChars = mTextEngine.CreateBCTextChars(";
_run.TextChars /*b4a.example.bctextengine._bctextchars*/  = __ref._mtextengine /*b4a.example.bctextengine*/ ._createbctextchars /*b4a.example.bctextengine._bctextchars*/ (null,new String[]{BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_tag.Tag /*String*/ )))},(int) (0),(int) (1));
RDebugUtils.currentLine=9633881;
 //BA.debugLineNum = 9633881;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then Run.";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("vertical"))) { 
_run.VerticalOffset /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"vertical",_data);};
 break; }
case 15: {
RDebugUtils.currentLine=9633883;
 //BA.debugLineNum = 9633883;BA.debugLine="Dim dir As String = tag.Extra.Get(\"direction\")";
_dir = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("direction")));
RDebugUtils.currentLine=9633884;
 //BA.debugLineNum = 9633884;BA.debugLine="Select dir.ToLowerCase";
switch (BA.switchObjectToInt(_dir.toLowerCase(),"ltr","rtl","unknown")) {
case 0: {
RDebugUtils.currentLine=9633886;
 //BA.debugLineNum = 9633886;BA.debugLine="Run.TextDirection = mTextEngine.TextDirectio";
_run.TextDirection /*int*/  = __ref._mtextengine /*b4a.example.bctextengine*/ ._textdirectionltr /*int*/ ;
 break; }
case 1: {
RDebugUtils.currentLine=9633888;
 //BA.debugLineNum = 9633888;BA.debugLine="Run.TextDirection = mTextEngine.TextDirectio";
_run.TextDirection /*int*/  = __ref._mtextengine /*b4a.example.bctextengine*/ ._textdirectionrtl /*int*/ ;
 break; }
case 2: {
RDebugUtils.currentLine=9633890;
 //BA.debugLineNum = 9633890;BA.debugLine="Run.TextDirection = mTextEngine.TextDirectio";
_run.TextDirection /*int*/  = __ref._mtextengine /*b4a.example.bctextengine*/ ._textdirectionunknown /*int*/ ;
 break; }
}
;
 break; }
case 16: 
case 17: {
RDebugUtils.currentLine=9633893;
 //BA.debugLineNum = 9633893;BA.debugLine="customfont = True";
_customfont = __c.True;
RDebugUtils.currentLine=9633894;
 //BA.debugLineNum = 9633894;BA.debugLine="If tag.Tag = \"fontawesome\" Then";
if ((_tag.Tag /*String*/ ).equals("fontawesome")) { 
RDebugUtils.currentLine=9633895;
 //BA.debugLineNum = 9633895;BA.debugLine="CurrentFont = xui.CreateFontAwesome(FontSize)";
_currentfont = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFontAwesome((float) (_fontsize));
 }else {
RDebugUtils.currentLine=9633897;
 //BA.debugLineNum = 9633897;BA.debugLine="CurrentFont = xui.CreateMaterialIcons(FontSiz";
_currentfont = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons((float) (_fontsize));
 };
RDebugUtils.currentLine=9633899;
 //BA.debugLineNum = 9633899;BA.debugLine="Run.TextChars = mTextEngine.CreateBCTextCharsF";
_run.TextChars /*b4a.example.bctextengine._bctextchars*/  = __ref._mtextengine /*b4a.example.bctextengine*/ ._createbctextcharsfromstring /*b4a.example.bctextengine._bctextchars*/ (null,BA.ObjectToString(__c.Chr(__ref._parsecodepoint /*int*/ (null,BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_tag.Tag /*String*/ )))))));
RDebugUtils.currentLine=9633900;
 //BA.debugLineNum = 9633900;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then Run.";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("vertical"))) { 
_run.VerticalOffset /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"vertical",_data);};
RDebugUtils.currentLine=9633901;
 //BA.debugLineNum = 9633901;BA.debugLine="If tag.Extra.ContainsKey(\"size\") Then FontSize";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("size"))) { 
_fontsize = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("size"))));};
 break; }
}
;
 }
};
RDebugUtils.currentLine=9633904;
 //BA.debugLineNum = 9633904;BA.debugLine="If IsListElement Then";
if (_islistelement) { 
RDebugUtils.currentLine=9633905;
 //BA.debugLineNum = 9633905;BA.debugLine="Run = HandleListElement(Text, Run)";
_run = __ref._handlelistelement /*b4a.example.bctextengine._bctextrun*/ (null,_text,_run);
 };
RDebugUtils.currentLine=9633907;
 //BA.debugLineNum = 9633907;BA.debugLine="If customfont Or FontSize <> Data.DefaultFont.Siz";
if (_customfont || _fontsize!=_data.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getSize()) { 
RDebugUtils.currentLine=9633920;
 //BA.debugLineNum = 9633920;BA.debugLine="Run.TextFont = xui.CreateFont2(CurrentFont, Font";
_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont2(_currentfont,(float) (_fontsize));
 };
RDebugUtils.currentLine=9633923;
 //BA.debugLineNum = 9633923;BA.debugLine="list.Add(Run)";
_list.Add((Object)(_run));
RDebugUtils.currentLine=9633924;
 //BA.debugLineNum = 9633924;BA.debugLine="End Sub";
return "";
}
public b4a.example.bbcodeparser._bbcodetagnode  _createtagnode(b4a.example.bbcodeparser __ref,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "createtagnode", true))
	 {return ((b4a.example.bbcodeparser._bbcodetagnode) Debug.delegate(ba, "createtagnode", new Object[] {_tag}));}
b4a.example.bbcodeparser._bbcodetagnode _n = null;
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Private Sub CreateTagNode (Tag As String) As BBCod";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="Dim n As BBCodeTagNode";
_n = new b4a.example.bbcodeparser._bbcodetagnode();
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="n.Initialize";
_n.Initialize();
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="n.Tag = Tag";
_n.Tag /*String*/  = _tag;
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="n.CanHaveNestedTags = True";
_n.CanHaveNestedTags /*boolean*/  = __c.True;
RDebugUtils.currentLine=9502725;
 //BA.debugLineNum = 9502725;BA.debugLine="Return n";
if (true) return _n;
RDebugUtils.currentLine=9502726;
 //BA.debugLineNum = 9502726;BA.debugLine="End Sub";
return null;
}
public b4a.example.bbcodeparser._bbcodetextnode  _createtextnode(b4a.example.bbcodeparser __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "createtextnode", true))
	 {return ((b4a.example.bbcodeparser._bbcodetextnode) Debug.delegate(ba, "createtextnode", new Object[] {_text}));}
b4a.example.bbcodeparser._bbcodetextnode _n = null;
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Private Sub CreateTextNode(Text As String) As BBCo";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="Dim n As BBCodeTextNode";
_n = new b4a.example.bbcodeparser._bbcodetextnode();
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="n.Initialize";
_n.Initialize();
RDebugUtils.currentLine=9437187;
 //BA.debugLineNum = 9437187;BA.debugLine="n.Text = Text";
_n.Text /*String*/  = _text;
RDebugUtils.currentLine=9437188;
 //BA.debugLineNum = 9437188;BA.debugLine="n.Tags.Initialize";
_n.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=9437189;
 //BA.debugLineNum = 9437189;BA.debugLine="n.Tags.AddAll(Stack)";
_n.Tags /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=9437190;
 //BA.debugLineNum = 9437190;BA.debugLine="Return n";
if (true) return _n;
RDebugUtils.currentLine=9437191;
 //BA.debugLineNum = 9437191;BA.debugLine="End Sub";
return null;
}
public String  _error(b4a.example.bbcodeparser __ref,String _msg) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "error", true))
	 {return ((String) Debug.delegate(ba, "error", new Object[] {_msg}));}
String _s = "";
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Private Sub Error (msg As String)";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="Dim s As String = $\"Error (position - ${Start}):";
_s = ("Error (position - "+__c.SmartStringFormatter("",(Object)(__ref._start /*int*/ ))+"): "+__c.SmartStringFormatter("",(Object)(_msg))+"");
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="LogColor(s, Colors.Red)";
__c.LogImpl("99371651",_s,__c.Colors.Red);
RDebugUtils.currentLine=9371655;
 //BA.debugLineNum = 9371655;BA.debugLine="ErrorString.Append(s).Append(CRLF)";
__ref._errorstring /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_s).Append(__c.CRLF);
RDebugUtils.currentLine=9371656;
 //BA.debugLineNum = 9371656;BA.debugLine="End Sub";
return "";
}
public int  _getdimensionfromtag(b4a.example.bbcodeparser __ref,b4a.example.bbcodeparser._bbcodetagnode _tag,String _key,b4a.example.bbcodeparser._bbcodeparsedata _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "getdimensionfromtag", true))
	 {return ((Integer) Debug.delegate(ba, "getdimensionfromtag", new Object[] {_tag,_key,_data}));}
String _s = "";
int _i = 0;
float _v = 0f;
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Private Sub GetDimensionFromTag (Tag As BBCodeTagN";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="Dim s As String = Tag.Extra.GetDefault(Key, \"\")";
_s = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_key),(Object)("")));
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="If s = \"\" Then Return -1";
if ((_s).equals("")) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=9895939;
 //BA.debugLineNum = 9895939;BA.debugLine="Dim i As Int = s.IndexOf(\"%\")";
_i = _s.indexOf("%");
RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="If i > -1 Then";
if (_i>-1) { 
RDebugUtils.currentLine=9895941;
 //BA.debugLineNum = 9895941;BA.debugLine="Dim v As Float = s.SubString2(0, i) / 100";
_v = (float) ((double)(Double.parseDouble(_s.substring((int) (0),_i)))/(double)100);
RDebugUtils.currentLine=9895942;
 //BA.debugLineNum = 9895942;BA.debugLine="If s.EndsWith(\"%x\") Then";
if (_s.endsWith("%x")) { 
RDebugUtils.currentLine=9895943;
 //BA.debugLineNum = 9895943;BA.debugLine="Data.NeedToReparseWhenResize = True";
_data.NeedToReparseWhenResize /*boolean*/  = __c.True;
RDebugUtils.currentLine=9895944;
 //BA.debugLineNum = 9895944;BA.debugLine="Return v * Data.Width";
if (true) return (int) (_v*_data.Width /*int*/ );
 };
 };
RDebugUtils.currentLine=9895947;
 //BA.debugLineNum = 9895947;BA.debugLine="Return DipToCurrent(s)";
if (true) return __c.DipToCurrent((int)(Double.parseDouble(_s)));
RDebugUtils.currentLine=9895948;
 //BA.debugLineNum = 9895948;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getview(b4a.example.bbcodeparser __ref,b4a.example.bbcodeparser._bbcodetagnode _tag,b4a.example.bbcodeparser._bbcodeparsedata _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "getview", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getview", new Object[] {_tag,_data}));}
String _id = "";
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Private Sub GetView (Tag As BBCodeTagNode, Data As";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="Dim id As String = Tag.Extra.Get(\"view\")";
_id = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("view")));
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="If Data.Views.ContainsKey(id) = False Then";
if (_data.Views /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_id))==__c.False) { 
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="Error(\"Missing view: \" & id)";
__ref._error /*String*/ (null,"Missing view: "+_id);
 };
RDebugUtils.currentLine=10027013;
 //BA.debugLineNum = 10027013;BA.debugLine="Dim v As B4XView = Data.Views.Get(id)";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_data.Views /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_id))));
RDebugUtils.currentLine=10027014;
 //BA.debugLineNum = 10027014;BA.debugLine="Return v";
if (true) return _v;
RDebugUtils.currentLine=10027015;
 //BA.debugLineNum = 10027015;BA.debugLine="End Sub";
return null;
}
public b4a.example.bctextengine._bctextrun  _handlelistelement(b4a.example.bbcodeparser __ref,b4a.example.bbcodeparser._bbcodetextnode _text,b4a.example.bctextengine._bctextrun _run) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "handlelistelement", true))
	 {return ((b4a.example.bctextengine._bctextrun) Debug.delegate(ba, "handlelistelement", new Object[] {_text,_run}));}
int _i = 0;
b4a.example.bbcodeparser._bbcodetagnode _tag = null;
String _liststyle = "";
int _count = 0;
b4a.example.bctextengine._bctextrun _parent = null;
b4a.example.bctextengine._bcconnectedruns _cr = null;
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Private Sub HandleListElement (Text As BBCodeTextN";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="For i = Text.Tags.Size - 1 To 0 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="Dim tag As BBCodeTagNode = Text.Tags.Get(i)";
_tag = (b4a.example.bbcodeparser._bbcodetagnode)(_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="If tag.Tag = \"list\" Then";
if ((_tag.Tag /*String*/ ).equals("list")) { 
RDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="Dim liststyle As String";
_liststyle = "";
RDebugUtils.currentLine=9830405;
 //BA.debugLineNum = 9830405;BA.debugLine="If tag.extra.IsInitialized Then liststyle = tag";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
_liststyle = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("style"),(Object)("unordered")));};
RDebugUtils.currentLine=9830406;
 //BA.debugLineNum = 9830406;BA.debugLine="If liststyle = \"\" Or liststyle.ToLowerCase = \"u";
if ((_liststyle).equals("") || (_liststyle.toLowerCase()).equals("unordered")) { 
RDebugUtils.currentLine=9830407;
 //BA.debugLineNum = 9830407;BA.debugLine="Run.TextChars =  mTextEngine.CreateBCTextChars";
_run.TextChars /*b4a.example.bctextengine._bctextchars*/  = __ref._mtextengine /*b4a.example.bctextengine*/ ._createbctextcharsfromstring /*b4a.example.bctextengine._bctextchars*/ (null,BA.ObjectToString(__c.Chr((int) (0x2022)))+" ");
 }else {
RDebugUtils.currentLine=9830409;
 //BA.debugLineNum = 9830409;BA.debugLine="Dim count As Int = tag.Extra.GetDefault(\"count";
_count = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("count"),(Object)(1))));
RDebugUtils.currentLine=9830410;
 //BA.debugLineNum = 9830410;BA.debugLine="Dim parent As BCTextRun = mTextEngine.CreateCo";
_parent = __ref._mtextengine /*b4a.example.bctextengine*/ ._createconnectedparent /*b4a.example.bctextengine._bctextrun*/ (null);
RDebugUtils.currentLine=9830411;
 //BA.debugLineNum = 9830411;BA.debugLine="Run.TextChars = mTextEngine.CreateBCTextCharsF";
_run.TextChars /*b4a.example.bctextengine._bctextchars*/  = __ref._mtextengine /*b4a.example.bctextengine*/ ._createbctextcharsfromstring /*b4a.example.bctextengine._bctextchars*/ (null,BA.NumberToString((_count))+". ");
RDebugUtils.currentLine=9830412;
 //BA.debugLineNum = 9830412;BA.debugLine="Dim cr As BCConnectedRuns = parent.Extra.Get(m";
_cr = (b4a.example.bctextengine._bcconnectedruns)(_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._mtextengine /*b4a.example.bctextengine*/ ._extra_connectedruns /*String*/ )));
RDebugUtils.currentLine=9830413;
 //BA.debugLineNum = 9830413;BA.debugLine="cr.Runs.Add(Run)";
_cr.Runs /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_run));
RDebugUtils.currentLine=9830414;
 //BA.debugLineNum = 9830414;BA.debugLine="cr.Alignment = \"right\"";
_cr.Alignment /*String*/  = "right";
RDebugUtils.currentLine=9830415;
 //BA.debugLineNum = 9830415;BA.debugLine="cr.ConnectedWidth = mTextEngine.GetFontMetrics";
_cr.ConnectedWidth /*int*/  = (int) (__ref._mtextengine /*b4a.example.bctextengine*/ ._getfontmetrics /*b4a.example.bctextengine._bcfontmetrics*/ (null,_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_run.TextColor /*int*/ ).xWidth /*int*/ *3/(double)__ref._mtextengine /*b4a.example.bctextengine*/ ._mscale /*float*/ );
RDebugUtils.currentLine=9830416;
 //BA.debugLineNum = 9830416;BA.debugLine="parent.IndentLevel = Run.IndentLevel";
_parent.IndentLevel /*int*/  = _run.IndentLevel /*int*/ ;
RDebugUtils.currentLine=9830417;
 //BA.debugLineNum = 9830417;BA.debugLine="Run = parent";
_run = _parent;
RDebugUtils.currentLine=9830418;
 //BA.debugLineNum = 9830418;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
RDebugUtils.currentLine=9830419;
 //BA.debugLineNum = 9830419;BA.debugLine="tag.Extra.Put(\"count\", count)";
_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("count"),(Object)(_count));
 };
RDebugUtils.currentLine=9830421;
 //BA.debugLineNum = 9830421;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=9830424;
 //BA.debugLineNum = 9830424;BA.debugLine="Return Run";
if (true) return _run;
RDebugUtils.currentLine=9830425;
 //BA.debugLineNum = 9830425;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.bbcodeparser __ref,anywheresoftware.b4a.BA _ba,b4a.example.bctextengine _textengine) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_textengine}));}
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Public Sub Initialize (TextEngine As BCTextEngine)";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="AllowedTags = B4XCollections.CreateSet2(Array(\"b\"";
__ref._allowedtags /*b4a.example.b4xset*/  = _b4xcollections._createset2 /*b4a.example.b4xset*/ (ba,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("b"),(Object)("u"),(Object)("url"),(Object)("plain"),(Object)("color"),(Object)("img"),(Object)("view"),(Object)("vertical"),(Object)("textsize"),(Object)("alignment"),(Object)("span"),(Object)("indent"),(Object)("list"),(Object)("*"),(Object)("fontawesome"),(Object)("materialicons"),(Object)("e"),(Object)("font"),(Object)("direction")}));
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="ColorsMap = CreateMap(\"black\": xui.Color_Black, _";
__ref._colorsmap /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("black"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black),(Object)("darkgray"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_DarkGray),(Object)("gray"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray),(Object)("lightgray"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_LightGray),(Object)("white"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White),(Object)("red"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red),(Object)("green"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Green),(Object)("blue"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue),(Object)("yellow"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Yellow),(Object)("cyan"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Cyan),(Object)("magenta"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Magenta),(Object)("transparent"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent)});
RDebugUtils.currentLine=8978447;
 //BA.debugLineNum = 8978447;BA.debugLine="mTextEngine = TextEngine";
__ref._mtextengine /*b4a.example.bctextengine*/  = _textengine;
RDebugUtils.currentLine=8978448;
 //BA.debugLineNum = 8978448;BA.debugLine="ErrorString.Initialize";
__ref._errorstring /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Initialize();
RDebugUtils.currentLine=8978449;
 //BA.debugLineNum = 8978449;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _parse(b4a.example.bbcodeparser __ref,b4a.example.bbcodeparser._bbcodeparsedata _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "parse", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "parse", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.List _parsedelements = null;
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matcher = null;
int _lastmatchend = 0;
boolean _skipuntilendtag = false;
String _tag = "";
boolean _closedtag = false;
b4a.example.bbcodeparser._bbcodetagnode _t = null;
b4a.example.bbcodeparser._bbcodetagnode _n = null;
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Public Sub Parse (Data As BBCodeParseData) As List";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="ErrorString.Initialize";
__ref._errorstring /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Initialize();
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="Dim ParsedElements As List";
_parsedelements = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="ParsedElements.Initialize";
_parsedelements.Initialize();
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="Stack.Initialize";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=9043973;
 //BA.debugLineNum = 9043973;BA.debugLine="Stack.Add(CreateTagNode(\"noop\"))";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createtagnode /*b4a.example.bbcodeparser._bbcodetagnode*/ (null,"noop")));
RDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="Dim matcher As Matcher = Regex.Matcher(\"(?<!\\[)\\[";
_matcher = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matcher = __c.Regex.Matcher("(?<!\\[)\\[[^\\[\\]]+\\]",_data.Text /*String*/ );
RDebugUtils.currentLine=9043975;
 //BA.debugLineNum = 9043975;BA.debugLine="Dim LastMatchEnd As Int = 0";
_lastmatchend = (int) (0);
RDebugUtils.currentLine=9043976;
 //BA.debugLineNum = 9043976;BA.debugLine="Dim skipUntilEndTag As Boolean = False";
_skipuntilendtag = __c.False;
RDebugUtils.currentLine=9043977;
 //BA.debugLineNum = 9043977;BA.debugLine="Do While matcher.Find";
while (_matcher.Find()) {
RDebugUtils.currentLine=9043978;
 //BA.debugLineNum = 9043978;BA.debugLine="Start = matcher.GetStart(0)";
__ref._start /*int*/  = _matcher.GetStart((int) (0));
RDebugUtils.currentLine=9043979;
 //BA.debugLineNum = 9043979;BA.debugLine="If Start > LastMatchEnd And skipUntilEndTag = Fa";
if (__ref._start /*int*/ >_lastmatchend && _skipuntilendtag==__c.False) { 
RDebugUtils.currentLine=9043980;
 //BA.debugLineNum = 9043980;BA.debugLine="ParsedElements.Add(CreateTextNode(Data.Text.Sub";
_parsedelements.Add((Object)(__ref._createtextnode /*b4a.example.bbcodeparser._bbcodetextnode*/ (null,_data.Text /*String*/ .substring(_lastmatchend,__ref._start /*int*/ ))));
 };
RDebugUtils.currentLine=9043982;
 //BA.debugLineNum = 9043982;BA.debugLine="Dim tag As String = matcher.Match.SubString2(1,";
_tag = _matcher.getMatch().substring((int) (1),(int) (_matcher.getMatch().length()-1));
RDebugUtils.currentLine=9043983;
 //BA.debugLineNum = 9043983;BA.debugLine="If tag.StartsWith(\"/\") Then";
if (_tag.startsWith("/")) { 
RDebugUtils.currentLine=9043984;
 //BA.debugLineNum = 9043984;BA.debugLine="tag = tag.SubString(1).ToLowerCase";
_tag = _tag.substring((int) (1)).toLowerCase();
RDebugUtils.currentLine=9043985;
 //BA.debugLineNum = 9043985;BA.debugLine="If StackPeek.Tag <> tag Then";
if ((__ref._stackpeek /*b4a.example.bbcodeparser._bbcodetagnode*/ (null).Tag /*String*/ ).equals(_tag) == false) { 
RDebugUtils.currentLine=9043986;
 //BA.debugLineNum = 9043986;BA.debugLine="If StackPeek.CanHaveNestedTags = False Then";
if (__ref._stackpeek /*b4a.example.bbcodeparser._bbcodetagnode*/ (null).CanHaveNestedTags /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=9043987;
 //BA.debugLineNum = 9043987;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=9043989;
 //BA.debugLineNum = 9043989;BA.debugLine="Error(\"Closing tag does not match: \" & tag)";
__ref._error /*String*/ (null,"Closing tag does not match: "+_tag);
RDebugUtils.currentLine=9043990;
 //BA.debugLineNum = 9043990;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 };
RDebugUtils.currentLine=9043992;
 //BA.debugLineNum = 9043992;BA.debugLine="If skipUntilEndTag Then";
if (_skipuntilendtag) { 
RDebugUtils.currentLine=9043993;
 //BA.debugLineNum = 9043993;BA.debugLine="If Start > LastMatchEnd Then";
if (__ref._start /*int*/ >_lastmatchend) { 
RDebugUtils.currentLine=9043994;
 //BA.debugLineNum = 9043994;BA.debugLine="ParsedElements.Add(CreateTextNode(Data.Text.S";
_parsedelements.Add((Object)(__ref._createtextnode /*b4a.example.bbcodeparser._bbcodetextnode*/ (null,_data.Text /*String*/ .substring(_lastmatchend,__ref._start /*int*/ ))));
 };
 };
RDebugUtils.currentLine=9043997;
 //BA.debugLineNum = 9043997;BA.debugLine="StackPop";
__ref._stackpop /*String*/ (null);
RDebugUtils.currentLine=9043998;
 //BA.debugLineNum = 9043998;BA.debugLine="skipUntilEndTag = False";
_skipuntilendtag = __c.False;
 }else {
RDebugUtils.currentLine=9044000;
 //BA.debugLineNum = 9044000;BA.debugLine="If StackPeek.CanHaveNestedTags = False Then Con";
if (__ref._stackpeek /*b4a.example.bbcodeparser._bbcodetagnode*/ (null).CanHaveNestedTags /*boolean*/ ==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=9044001;
 //BA.debugLineNum = 9044001;BA.debugLine="Dim ClosedTag As Boolean";
_closedtag = false;
RDebugUtils.currentLine=9044002;
 //BA.debugLineNum = 9044002;BA.debugLine="If tag.EndsWith(\"/\") Then";
if (_tag.endsWith("/")) { 
RDebugUtils.currentLine=9044003;
 //BA.debugLineNum = 9044003;BA.debugLine="ClosedTag = True";
_closedtag = __c.True;
RDebugUtils.currentLine=9044004;
 //BA.debugLineNum = 9044004;BA.debugLine="tag = tag.SubString2(0, tag.Length - 1)";
_tag = _tag.substring((int) (0),(int) (_tag.length()-1));
 }else 
{RDebugUtils.currentLine=9044005;
 //BA.debugLineNum = 9044005;BA.debugLine="Else If tag = \"*\" Then";
if ((_tag).equals("*")) { 
RDebugUtils.currentLine=9044006;
 //BA.debugLineNum = 9044006;BA.debugLine="ClosedTag = True";
_closedtag = __c.True;
 }}
;
RDebugUtils.currentLine=9044008;
 //BA.debugLineNum = 9044008;BA.debugLine="tag = tag.Trim";
_tag = _tag.trim();
RDebugUtils.currentLine=9044009;
 //BA.debugLineNum = 9044009;BA.debugLine="Dim t As BBCodeTagNode = ParseTag(tag)";
_t = __ref._parsetag /*b4a.example.bbcodeparser._bbcodetagnode*/ (null,_tag);
RDebugUtils.currentLine=9044010;
 //BA.debugLineNum = 9044010;BA.debugLine="If AllowedTags.Contains(t.Tag) = False Then";
if (__ref._allowedtags /*b4a.example.b4xset*/ ._contains /*boolean*/ (null,(Object)(_t.Tag /*String*/ ))==__c.False) { 
RDebugUtils.currentLine=9044011;
 //BA.debugLineNum = 9044011;BA.debugLine="Error(\"Invalid tag: \" & tag)";
__ref._error /*String*/ (null,"Invalid tag: "+_tag);
RDebugUtils.currentLine=9044012;
 //BA.debugLineNum = 9044012;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 };
RDebugUtils.currentLine=9044014;
 //BA.debugLineNum = 9044014;BA.debugLine="StackPush(t)";
__ref._stackpush /*String*/ (null,_t);
RDebugUtils.currentLine=9044015;
 //BA.debugLineNum = 9044015;BA.debugLine="If t.Tag = \"plain\" Then";
if ((_t.Tag /*String*/ ).equals("plain")) { 
RDebugUtils.currentLine=9044016;
 //BA.debugLineNum = 9044016;BA.debugLine="Dim n As BBCodeTagNode = StackPeek";
_n = __ref._stackpeek /*b4a.example.bbcodeparser._bbcodetagnode*/ (null);
RDebugUtils.currentLine=9044017;
 //BA.debugLineNum = 9044017;BA.debugLine="n.CanHaveNestedTags = False";
_n.CanHaveNestedTags /*boolean*/  = __c.False;
RDebugUtils.currentLine=9044018;
 //BA.debugLineNum = 9044018;BA.debugLine="skipUntilEndTag = True";
_skipuntilendtag = __c.True;
 };
RDebugUtils.currentLine=9044020;
 //BA.debugLineNum = 9044020;BA.debugLine="If ClosedTag Then";
if (_closedtag) { 
RDebugUtils.currentLine=9044021;
 //BA.debugLineNum = 9044021;BA.debugLine="ParsedElements.Add(CreateTextNode(\"\"))";
_parsedelements.Add((Object)(__ref._createtextnode /*b4a.example.bbcodeparser._bbcodetextnode*/ (null,"")));
RDebugUtils.currentLine=9044022;
 //BA.debugLineNum = 9044022;BA.debugLine="StackPop";
__ref._stackpop /*String*/ (null);
 };
 };
RDebugUtils.currentLine=9044025;
 //BA.debugLineNum = 9044025;BA.debugLine="LastMatchEnd = matcher.GetEnd(0)";
_lastmatchend = _matcher.GetEnd((int) (0));
 }
;
RDebugUtils.currentLine=9044027;
 //BA.debugLineNum = 9044027;BA.debugLine="If Data.Text.Length > LastMatchEnd Then";
if (_data.Text /*String*/ .length()>_lastmatchend) { 
RDebugUtils.currentLine=9044028;
 //BA.debugLineNum = 9044028;BA.debugLine="ParsedElements.Add(CreateTextNode(Data.Text.SubS";
_parsedelements.Add((Object)(__ref._createtextnode /*b4a.example.bbcodeparser._bbcodetextnode*/ (null,_data.Text /*String*/ .substring(_lastmatchend,_data.Text /*String*/ .length()))));
 };
RDebugUtils.currentLine=9044030;
 //BA.debugLineNum = 9044030;BA.debugLine="Return ParsedElements";
if (true) return _parsedelements;
RDebugUtils.currentLine=9044031;
 //BA.debugLineNum = 9044031;BA.debugLine="End Sub";
return null;
}
public b4a.example.bbcodeparser._bbcodetagnode  _stackpeek(b4a.example.bbcodeparser __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "stackpeek", true))
	 {return ((b4a.example.bbcodeparser._bbcodetagnode) Debug.delegate(ba, "stackpeek", null));}
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Private Sub StackPeek As BBCodeTagNode";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="Return Stack.Get(Stack.Size - 1)";
if (true) return (b4a.example.bbcodeparser._bbcodetagnode)(__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="End Sub";
return null;
}
public String  _stackpop(b4a.example.bbcodeparser __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "stackpop", true))
	 {return ((String) Debug.delegate(ba, "stackpop", null));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Private Sub StackPop";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="Stack.RemoveAt(Stack.Size - 1)";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="End Sub";
return "";
}
public b4a.example.bbcodeparser._bbcodetagnode  _parsetag(b4a.example.bbcodeparser __ref,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "parsetag", true))
	 {return ((b4a.example.bbcodeparser._bbcodetagnode) Debug.delegate(ba, "parsetag", new Object[] {_tag}));}
b4a.example.bbcodeparser._bbcodetagnode _res = null;
int _i = 0;
int _last = 0;
String _c = "";
String _key = "";
int _i2 = 0;
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Private Sub ParseTag (tag As String) As BBCodeTagN";
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="If tag.Contains(\"=\") = False Then Return CreateTa";
if (_tag.contains("=")==__c.False) { 
if (true) return __ref._createtagnode /*b4a.example.bbcodeparser._bbcodetagnode*/ (null,_tag.toLowerCase());};
RDebugUtils.currentLine=9109509;
 //BA.debugLineNum = 9109509;BA.debugLine="Dim res As BBCodeTagNode = CreateTagNode(\"\")";
_res = __ref._createtagnode /*b4a.example.bbcodeparser._bbcodetagnode*/ (null,"");
RDebugUtils.currentLine=9109510;
 //BA.debugLineNum = 9109510;BA.debugLine="res.Extra.Initialize";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=9109511;
 //BA.debugLineNum = 9109511;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=9109512;
 //BA.debugLineNum = 9109512;BA.debugLine="Dim last As Int = -1";
_last = (int) (-1);
RDebugUtils.currentLine=9109513;
 //BA.debugLineNum = 9109513;BA.debugLine="Do While i < tag.Length";
while (_i<_tag.length()) {
RDebugUtils.currentLine=9109514;
 //BA.debugLineNum = 9109514;BA.debugLine="Dim c As String = tag.CharAt(i)";
_c = BA.ObjectToString(_tag.charAt(_i));
RDebugUtils.currentLine=9109515;
 //BA.debugLineNum = 9109515;BA.debugLine="If c = \"=\" Then";
if ((_c).equals("=")) { 
RDebugUtils.currentLine=9109516;
 //BA.debugLineNum = 9109516;BA.debugLine="Dim key As String = tag.SubString2(last + 1, i)";
_key = _tag.substring((int) (_last+1),_i).toLowerCase();
RDebugUtils.currentLine=9109517;
 //BA.debugLineNum = 9109517;BA.debugLine="If res.tag = \"\" Then 'option #2";
if ((_res.Tag /*String*/ ).equals("")) { 
RDebugUtils.currentLine=9109518;
 //BA.debugLineNum = 9109518;BA.debugLine="res.Tag = key";
_res.Tag /*String*/  = _key;
 };
RDebugUtils.currentLine=9109520;
 //BA.debugLineNum = 9109520;BA.debugLine="Dim i2 As Int";
_i2 = 0;
RDebugUtils.currentLine=9109521;
 //BA.debugLineNum = 9109521;BA.debugLine="If tag.CharAt(i + 1) = QUOTE Then";
if (_tag.charAt((int) (_i+1))==BA.ObjectToChar(__c.QUOTE)) { 
RDebugUtils.currentLine=9109522;
 //BA.debugLineNum = 9109522;BA.debugLine="i2 = tag.IndexOf2(QUOTE, i + 2)";
_i2 = _tag.indexOf(__c.QUOTE,(int) (_i+2));
RDebugUtils.currentLine=9109523;
 //BA.debugLineNum = 9109523;BA.debugLine="res.Extra.Put(key, tag.SubString2(i + 2, i2))";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_tag.substring((int) (_i+2),_i2)));
 }else {
RDebugUtils.currentLine=9109525;
 //BA.debugLineNum = 9109525;BA.debugLine="i2 = tag.IndexOf2(\" \", i + 2)";
_i2 = _tag.indexOf(" ",(int) (_i+2));
RDebugUtils.currentLine=9109526;
 //BA.debugLineNum = 9109526;BA.debugLine="If i2 = -1 Then i2 = tag.Length";
if (_i2==-1) { 
_i2 = _tag.length();};
RDebugUtils.currentLine=9109527;
 //BA.debugLineNum = 9109527;BA.debugLine="res.Extra.Put(key, tag.SubString2(i + 1, i2))";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_tag.substring((int) (_i+1),_i2)));
 };
RDebugUtils.currentLine=9109529;
 //BA.debugLineNum = 9109529;BA.debugLine="i = i2";
_i = _i2;
RDebugUtils.currentLine=9109530;
 //BA.debugLineNum = 9109530;BA.debugLine="last = i";
_last = _i;
 };
RDebugUtils.currentLine=9109532;
 //BA.debugLineNum = 9109532;BA.debugLine="If c = \" \" Then";
if ((_c).equals(" ")) { 
RDebugUtils.currentLine=9109533;
 //BA.debugLineNum = 9109533;BA.debugLine="If res.Extra.Size = 0 Then";
if (_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()==0) { 
RDebugUtils.currentLine=9109534;
 //BA.debugLineNum = 9109534;BA.debugLine="Dim key As String = tag.SubString2(0, i).ToLow";
_key = _tag.substring((int) (0),_i).toLowerCase();
RDebugUtils.currentLine=9109535;
 //BA.debugLineNum = 9109535;BA.debugLine="res.Tag = key";
_res.Tag /*String*/  = _key;
 };
RDebugUtils.currentLine=9109537;
 //BA.debugLineNum = 9109537;BA.debugLine="last = i";
_last = _i;
 };
RDebugUtils.currentLine=9109539;
 //BA.debugLineNum = 9109539;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
RDebugUtils.currentLine=9109541;
 //BA.debugLineNum = 9109541;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=9109542;
 //BA.debugLineNum = 9109542;BA.debugLine="End Sub";
return null;
}
public String  _stackpush(b4a.example.bbcodeparser __ref,b4a.example.bbcodeparser._bbcodetagnode _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "stackpush", true))
	 {return ((String) Debug.delegate(ba, "stackpush", new Object[] {_tag}));}
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Private Sub StackPush (Tag As BBCodeTagNode)";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="Stack.Add(Tag)";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_tag));
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="End Sub";
return "";
}
public int  _parsecodepoint(b4a.example.bbcodeparser __ref,String _raw) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "parsecodepoint", true))
	 {return ((Integer) Debug.delegate(ba, "parsecodepoint", new Object[] {_raw}));}
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Private Sub ParseCodepoint (raw As String) As Int";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="If raw.StartsWith(\"0x\") Then raw = raw.SubString(";
if (_raw.startsWith("0x")) { 
_raw = _raw.substring((int) (2));};
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="Return Bit.ParseInt(raw, 16)";
if (true) return __c.Bit.ParseInt(_raw,(int) (16));
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="End Sub";
return 0;
}
public int  _parsecolorstring(b4a.example.bbcodeparser __ref,String _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "parsecolorstring", true))
	 {return ((Integer) Debug.delegate(ba, "parsecolorstring", new Object[] {_clr}));}
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Private Sub ParseColorString(clr As String) As Int";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="clr = clr.ToLowerCase";
_clr = _clr.toLowerCase();
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="If clr.StartsWith(\"#\") Then";
if (_clr.startsWith("#")) { 
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="Return Bit.Or(0xff000000, Bit.ParseInt(clr.SubSt";
if (true) return __c.Bit.Or((int) (0xff000000),__c.Bit.ParseInt(_clr.substring((int) (1)),(int) (16)));
 }else 
{RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="Else If clr.StartsWith(\"0x\") Then";
if (_clr.startsWith("0x")) { 
RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="Return Bit.Or(0xff000000, Bit.ParseInt(clr.SubSt";
if (true) return __c.Bit.Or((int) (0xff000000),__c.Bit.ParseInt(_clr.substring((int) (4)),(int) (16)));
 }else 
{RDebugUtils.currentLine=9764870;
 //BA.debugLineNum = 9764870;BA.debugLine="Else If ColorsMap.ContainsKey(clr) Then";
if (__ref._colorsmap /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_clr))) { 
RDebugUtils.currentLine=9764871;
 //BA.debugLineNum = 9764871;BA.debugLine="Return ColorsMap.Get(clr)";
if (true) return (int)(BA.ObjectToNumber(__ref._colorsmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_clr))));
 }else {
RDebugUtils.currentLine=9764873;
 //BA.debugLineNum = 9764873;BA.debugLine="Error(\"Invalid color value: \" & clr)";
__ref._error /*String*/ (null,"Invalid color value: "+_clr);
RDebugUtils.currentLine=9764874;
 //BA.debugLineNum = 9764874;BA.debugLine="Return xui.Color_Black";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
 }}}
;
RDebugUtils.currentLine=9764876;
 //BA.debugLineNum = 9764876;BA.debugLine="End Sub";
return 0;
}
public void  _setimageview(b4a.example.bbcodeparser __ref,b4a.example.bbcodeparser._bbcodetagnode _tag,b4a.example.bctextengine._bctextrun _run,b4a.example.bbcodeparser._bbcodeparsedata _data) throws Exception{
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "setimageview", true))
	 {Debug.delegate(ba, "setimageview", new Object[] {_tag,_run,_data}); return;}
ResumableSub_SetImageView rsub = new ResumableSub_SetImageView(this,__ref,_tag,_run,_data);
rsub.resume(ba, null);
}
public static class ResumableSub_SetImageView extends BA.ResumableSub {
public ResumableSub_SetImageView(b4a.example.bbcodeparser parent,b4a.example.bbcodeparser __ref,b4a.example.bbcodeparser._bbcodetagnode _tag,b4a.example.bctextengine._bctextrun _run,b4a.example.bbcodeparser._bbcodeparsedata _data) {
this.parent = parent;
this.__ref = __ref;
this._tag = _tag;
this._run = _run;
this._data = _data;
this.__ref = parent;
}
b4a.example.bbcodeparser __ref;
b4a.example.bbcodeparser parent;
b4a.example.bbcodeparser._bbcodetagnode _tag;
b4a.example.bctextengine._bctextrun _run;
b4a.example.bbcodeparser._bbcodeparsedata _data;
String _url = "";
String _dir = "";
String _filename = "";
int _width = 0;
int _height = 0;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
b4a.example.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="bbcodeparser";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="Dim url As String = Tag.Extra.GetDefault(\"url\", \"";
_url = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("url"),(Object)("")));
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="Dim dir As String = Tag.Extra.GetDefault(\"dir\", F";
_dir = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("dir"),(Object)(parent.__c.File.getDirAssets())));
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="Dim filename As String = Tag.Extra.GetDefault(\"fi";
_filename = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("filename"),(Object)("")));
RDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="Dim width As Int = GetDimensionFromTag(Tag, \"widt";
_width = __ref._getdimensionfromtag /*int*/ (null,_tag,"width",_data);
RDebugUtils.currentLine=9961477;
 //BA.debugLineNum = 9961477;BA.debugLine="Dim height As Int = GetDimensionFromTag(Tag, \"hei";
_height = __ref._getdimensionfromtag /*int*/ (null,_tag,"height",_data);
RDebugUtils.currentLine=9961478;
 //BA.debugLineNum = 9961478;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=9961479;
 //BA.debugLineNum = 9961479;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=9961483;
 //BA.debugLineNum = 9961483;BA.debugLine="Dim xiv As B4XView = iv";
_xiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=9961484;
 //BA.debugLineNum = 9961484;BA.debugLine="run.View = xiv";
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xiv;
RDebugUtils.currentLine=9961485;
 //BA.debugLineNum = 9961485;BA.debugLine="Dim bmp As B4XBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=9961486;
 //BA.debugLineNum = 9961486;BA.debugLine="If url <> \"\" Then";
if (true) break;

case 1:
//if
this.state = 26;
if ((_url).equals("") == false) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=9961487;
 //BA.debugLineNum = 9961487;BA.debugLine="xiv.SetLayoutAnimated(0, 0, 0, width, height)";
_xiv.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=9961488;
 //BA.debugLineNum = 9961488;BA.debugLine="If data.ImageCache.ContainsKey(url) Then";
if (true) break;

case 4:
//if
this.state = 13;
if (_data.ImageCache /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_url))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 13;
RDebugUtils.currentLine=9961489;
 //BA.debugLineNum = 9961489;BA.debugLine="xiv.SetBitmap(data.ImageCache.Get(url))";
_xiv.SetBitmap((android.graphics.Bitmap)(_data.ImageCache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_url))));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=9961491;
 //BA.debugLineNum = 9961491;BA.debugLine="Dim j As HttpJob";
_j = new b4a.example.httpjob();
RDebugUtils.currentLine=9961492;
 //BA.debugLineNum = 9961492;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=9961493;
 //BA.debugLineNum = 9961493;BA.debugLine="j.Download(url)";
_j._download /*String*/ (null,_url);
RDebugUtils.currentLine=9961494;
 //BA.debugLineNum = 9961494;BA.debugLine="Wait For (j) JobDone (j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "bbcodeparser", "setimageview"), (Object)(_j));
this.state = 27;
return;
case 27:
//C
this.state = 9;
_j = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=9961495;
 //BA.debugLineNum = 9961495;BA.debugLine="If j.Success Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_j._success /*boolean*/ ) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=9961496;
 //BA.debugLineNum = 9961496;BA.debugLine="bmp = j.GetBitmap";
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_j._getbitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (null).getObject()));
RDebugUtils.currentLine=9961497;
 //BA.debugLineNum = 9961497;BA.debugLine="bmp = bmp.Resize(width, height, True)";
_bmp = _bmp.Resize(_width,_height,parent.__c.True);
RDebugUtils.currentLine=9961498;
 //BA.debugLineNum = 9961498;BA.debugLine="data.ImageCache.Put(url, bmp)";
_data.ImageCache /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_url),(Object)(_bmp.getObject()));
RDebugUtils.currentLine=9961499;
 //BA.debugLineNum = 9961499;BA.debugLine="xiv.SetBitmap(bmp)";
_xiv.SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=9961501;
 //BA.debugLineNum = 9961501;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 13:
//C
this.state = 26;
;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=9961504;
 //BA.debugLineNum = 9961504;BA.debugLine="If width = -1 And height = -1 Then";
if (true) break;

case 16:
//if
this.state = 25;
if (_width==-1 && _height==-1) { 
this.state = 18;
}else 
{RDebugUtils.currentLine=9961506;
 //BA.debugLineNum = 9961506;BA.debugLine="Else if width > -1 And height > -1 Then";
if (_width>-1 && _height>-1) { 
this.state = 20;
}else 
{RDebugUtils.currentLine=9961508;
 //BA.debugLineNum = 9961508;BA.debugLine="Else if width > -1 Then";
if (_width>-1) { 
this.state = 22;
}else {
this.state = 24;
}}}
if (true) break;

case 18:
//C
this.state = 25;
RDebugUtils.currentLine=9961505;
 //BA.debugLineNum = 9961505;BA.debugLine="bmp = xui.LoadBitmap(dir, filename)";
_bmp = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmap(_dir,_filename);
 if (true) break;

case 20:
//C
this.state = 25;
RDebugUtils.currentLine=9961507;
 //BA.debugLineNum = 9961507;BA.debugLine="bmp = xui.LoadBitmapResize(dir, filename, width";
_bmp = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(_dir,_filename,_width,_height,parent.__c.False);
 if (true) break;

case 22:
//C
this.state = 25;
RDebugUtils.currentLine=9961509;
 //BA.debugLineNum = 9961509;BA.debugLine="bmp = xui.LoadBitmapResize(dir, filename, width";
_bmp = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(_dir,_filename,_width,(int) (10000),parent.__c.True);
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=9961511;
 //BA.debugLineNum = 9961511;BA.debugLine="bmp = xui.LoadBitmapResize(dir, filename, 10000";
_bmp = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(_dir,_filename,(int) (10000),_height,parent.__c.True);
 if (true) break;

case 25:
//C
this.state = 26;
;
RDebugUtils.currentLine=9961513;
 //BA.debugLineNum = 9961513;BA.debugLine="xiv.SetBitmap(bmp)";
_xiv.SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=9961514;
 //BA.debugLineNum = 9961514;BA.debugLine="xiv.SetLayoutAnimated(0, 0, 0, bmp.Width, bmp.He";
_xiv.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_bmp.getWidth()),(int) (_bmp.getHeight()));
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=9961516;
 //BA.debugLineNum = 9961516;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}