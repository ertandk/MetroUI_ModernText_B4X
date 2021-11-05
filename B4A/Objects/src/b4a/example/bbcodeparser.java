package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bbcodeparser extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.bbcodeparser");
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.b4xset _vvvvvvvvvvvvvvvvvvvv1 = null;
public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvv2 = null;
public int _vvvvvvvvvvvvvvvvvvvv3 = 0;
public b4a.example.bctextengine _vvvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvv5 = null;
public int _vvvvvvvvvvvvvvvvvvvv5 = 0;
public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvv6 = null;
public anywheresoftware.b4a.keywords.StringBuilderWrapper _vvvvvvvvvvvvvvvvvvvv7 = null;
public b4a.example.main _vvvv6 = null;
public b4a.example.starter _vvvv7 = null;
public b4a.example.b4xpages _vvvv0 = null;
public b4a.example.b4xcollections _vvvvv1 = null;
public b4a.example.httputils2service _vvvvv2 = null;
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
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Type BBCodeTextNode (Text As String, Tags As List";
;
 //BA.debugLineNum = 3;BA.debugLine="Type BBCodeTagNode (Tag As String, Extra As Map,";
;
 //BA.debugLineNum = 4;BA.debugLine="Type BBCodeParseData (Text As String, URLs As Map";
;
 //BA.debugLineNum = 6;BA.debugLine="Private AllowedTags As B4XSet";
_vvvvvvvvvvvvvvvvvvvv1 = new b4a.example.b4xset();
 //BA.debugLineNum = 7;BA.debugLine="Private Stack As List";
_vvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 8;BA.debugLine="Private Start As Int";
_vvvvvvvvvvvvvvvvvvvv3 = 0;
 //BA.debugLineNum = 9;BA.debugLine="Private mTextEngine As BCTextEngine";
_vvvvvvvvvvvvvvvvvvvv4 = new b4a.example.bctextengine();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
_vvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Public UrlColor As Int = 0xFF003FFF";
_vvvvvvvvvvvvvvvvvvvv5 = (int) (0xff003fff);
 //BA.debugLineNum = 12;BA.debugLine="Public ColorsMap As Map";
_vvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 13;BA.debugLine="Public ErrorString As StringBuilder";
_vvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _vvvvvvvvvvvvvvvvvv1(anywheresoftware.b4a.objects.collections.List _texts,b4a.example.bbcodeparser._bbcodeparsedata _data) throws Exception{
anywheresoftware.b4a.objects.collections.List _runs = null;
b4a.example.bbcodeparser._bbcodetextnode _textnode = null;
 //BA.debugLineNum = 181;BA.debugLine="Public Sub CreateRuns (Texts As List, Data As BBCo";
 //BA.debugLineNum = 182;BA.debugLine="Dim Runs As List";
_runs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 183;BA.debugLine="Runs.Initialize";
_runs.Initialize();
 //BA.debugLineNum = 184;BA.debugLine="For Each TextNode As BBCodeTextNode In Texts";
{
final anywheresoftware.b4a.BA.IterableList group3 = _texts;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_textnode = (b4a.example.bbcodeparser._bbcodetextnode)(group3.Get(index3));
 //BA.debugLineNum = 185;BA.debugLine="TextToRun(TextNode, Runs, Data)";
_vvvvvvvvvvvvvvvvvvv0(_textnode,_runs,_data);
 }
};
 //BA.debugLineNum = 187;BA.debugLine="Return Runs";
if (true) return _runs;
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4a.example.bbcodeparser._bbcodetagnode  _vvvvvvvvvvvvvvvvvv2(String _tag) throws Exception{
b4a.example.bbcodeparser._bbcodetagnode _n = null;
 //BA.debugLineNum = 173;BA.debugLine="Private Sub CreateTagNode (Tag As String) As BBCod";
 //BA.debugLineNum = 174;BA.debugLine="Dim n As BBCodeTagNode";
_n = new b4a.example.bbcodeparser._bbcodetagnode();
 //BA.debugLineNum = 175;BA.debugLine="n.Initialize";
_n.Initialize();
 //BA.debugLineNum = 176;BA.debugLine="n.Tag = Tag";
_n.Tag /*String*/  = _tag;
 //BA.debugLineNum = 177;BA.debugLine="n.CanHaveNestedTags = True";
_n.CanHaveNestedTags /*boolean*/  = __c.True;
 //BA.debugLineNum = 178;BA.debugLine="Return n";
if (true) return _n;
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public b4a.example.bbcodeparser._bbcodetextnode  _vvvvvvvvvvvvvvvvvv3(String _text) throws Exception{
b4a.example.bbcodeparser._bbcodetextnode _n = null;
 //BA.debugLineNum = 163;BA.debugLine="Private Sub CreateTextNode(Text As String) As BBCo";
 //BA.debugLineNum = 164;BA.debugLine="Dim n As BBCodeTextNode";
_n = new b4a.example.bbcodeparser._bbcodetextnode();
 //BA.debugLineNum = 165;BA.debugLine="n.Initialize";
_n.Initialize();
 //BA.debugLineNum = 166;BA.debugLine="n.Text = Text";
_n.Text /*String*/  = _text;
 //BA.debugLineNum = 167;BA.debugLine="n.Tags.Initialize";
_n.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 168;BA.debugLine="n.Tags.AddAll(Stack)";
_n.Tags /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(_vvvvvvvvvvvvvvvvvvvv2);
 //BA.debugLineNum = 169;BA.debugLine="Return n";
if (true) return _n;
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvvvvv4(String _msg) throws Exception{
String _s = "";
 //BA.debugLineNum = 153;BA.debugLine="Private Sub Error (msg As String)";
 //BA.debugLineNum = 154;BA.debugLine="Dim s As String = $\"Error (position - ${Start}):";
_s = ("Error (position - "+__c.SmartStringFormatter("",(Object)(_vvvvvvvvvvvvvvvvvvvv3))+"): "+__c.SmartStringFormatter("",(Object)(_msg))+"");
 //BA.debugLineNum = 156;BA.debugLine="LogColor(s, Colors.Red)";
__c.LogImpl("99175043",_s,__c.Colors.Red);
 //BA.debugLineNum = 160;BA.debugLine="ErrorString.Append(s).Append(CRLF)";
_vvvvvvvvvvvvvvvvvvvv7.Append(_s).Append(__c.CRLF);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public int  _vvvvvvvvvvvvvvvvvv5(b4a.example.bbcodeparser._bbcodetagnode _tag,String _key,b4a.example.bbcodeparser._bbcodeparsedata _data) throws Exception{
String _s = "";
int _i = 0;
float _v = 0f;
 //BA.debugLineNum = 370;BA.debugLine="Private Sub GetDimensionFromTag (Tag As BBCodeTagN";
 //BA.debugLineNum = 371;BA.debugLine="Dim s As String = Tag.Extra.GetDefault(Key, \"\")";
_s = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_key),(Object)("")));
 //BA.debugLineNum = 372;BA.debugLine="If s = \"\" Then Return -1";
if ((_s).equals("")) { 
if (true) return (int) (-1);};
 //BA.debugLineNum = 373;BA.debugLine="Dim i As Int = s.IndexOf(\"%\")";
_i = _s.indexOf("%");
 //BA.debugLineNum = 374;BA.debugLine="If i > -1 Then";
if (_i>-1) { 
 //BA.debugLineNum = 375;BA.debugLine="Dim v As Float = s.SubString2(0, i) / 100";
_v = (float) ((double)(Double.parseDouble(_s.substring((int) (0),_i)))/(double)100);
 //BA.debugLineNum = 376;BA.debugLine="If s.EndsWith(\"%x\") Then";
if (_s.endsWith("%x")) { 
 //BA.debugLineNum = 377;BA.debugLine="Data.NeedToReparseWhenResize = True";
_data.NeedToReparseWhenResize /*boolean*/  = __c.True;
 //BA.debugLineNum = 378;BA.debugLine="Return v * Data.Width";
if (true) return (int) (_v*_data.Width /*int*/ );
 };
 };
 //BA.debugLineNum = 381;BA.debugLine="Return DipToCurrent(s)";
if (true) return __c.DipToCurrent((int)(Double.parseDouble(_s)));
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _vvvvvvvvvvvvvvvvvv6(b4a.example.bbcodeparser._bbcodetagnode _tag,b4a.example.bbcodeparser._bbcodeparsedata _data) throws Exception{
String _id = "";
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
 //BA.debugLineNum = 437;BA.debugLine="Private Sub GetView (Tag As BBCodeTagNode, Data As";
 //BA.debugLineNum = 438;BA.debugLine="Dim id As String = Tag.Extra.Get(\"view\")";
_id = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("view")));
 //BA.debugLineNum = 439;BA.debugLine="If Data.Views.ContainsKey(id) = False Then";
if (_data.Views /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_id))==__c.False) { 
 //BA.debugLineNum = 440;BA.debugLine="Error(\"Missing view: \" & id)";
_vvvvvvvvvvvvvvvvvv4("Missing view: "+_id);
 };
 //BA.debugLineNum = 442;BA.debugLine="Dim v As B4XView = Data.Views.Get(id)";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_data.Views /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_id))));
 //BA.debugLineNum = 443;BA.debugLine="Return v";
if (true) return _v;
 //BA.debugLineNum = 444;BA.debugLine="End Sub";
return null;
}
public b4a.example.bctextengine._bctextrun  _vvvvvvvvvvvvvvvvvv7(b4a.example.bbcodeparser._bbcodetextnode _text,b4a.example.bctextengine._bctextrun _run) throws Exception{
int _i = 0;
b4a.example.bbcodeparser._bbcodetagnode _tag = null;
String _liststyle = "";
int _count = 0;
b4a.example.bctextengine._bctextrun _parent = null;
b4a.example.bctextengine._bcconnectedruns _cr = null;
 //BA.debugLineNum = 343;BA.debugLine="Private Sub HandleListElement (Text As BBCodeTextN";
 //BA.debugLineNum = 344;BA.debugLine="For i = Text.Tags.Size - 1 To 0 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 345;BA.debugLine="Dim tag As BBCodeTagNode = Text.Tags.Get(i)";
_tag = (b4a.example.bbcodeparser._bbcodetagnode)(_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 //BA.debugLineNum = 346;BA.debugLine="If tag.Tag = \"list\" Then";
if ((_tag.Tag /*String*/ ).equals("list")) { 
 //BA.debugLineNum = 347;BA.debugLine="Dim liststyle As String";
_liststyle = "";
 //BA.debugLineNum = 348;BA.debugLine="If tag.extra.IsInitialized Then liststyle = tag";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
_liststyle = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("style"),(Object)("unordered")));};
 //BA.debugLineNum = 349;BA.debugLine="If liststyle = \"\" Or liststyle.ToLowerCase = \"u";
if ((_liststyle).equals("") || (_liststyle.toLowerCase()).equals("unordered")) { 
 //BA.debugLineNum = 350;BA.debugLine="Run.TextChars =  mTextEngine.CreateBCTextChars";
_run.TextChars /*b4a.example.bctextengine._bctextchars*/  = _vvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvv7 /*b4a.example.bctextengine._bctextchars*/ (BA.ObjectToString(__c.Chr((int) (0x2022)))+" ");
 }else {
 //BA.debugLineNum = 352;BA.debugLine="Dim count As Int = tag.Extra.GetDefault(\"count";
_count = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("count"),(Object)(1))));
 //BA.debugLineNum = 353;BA.debugLine="Dim parent As BCTextRun = mTextEngine.CreateCo";
_parent = _vvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvv0 /*b4a.example.bctextengine._bctextrun*/ ();
 //BA.debugLineNum = 354;BA.debugLine="Run.TextChars = mTextEngine.CreateBCTextCharsF";
_run.TextChars /*b4a.example.bctextengine._bctextchars*/  = _vvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvv7 /*b4a.example.bctextengine._bctextchars*/ (BA.NumberToString((_count))+". ");
 //BA.debugLineNum = 355;BA.debugLine="Dim cr As BCConnectedRuns = parent.Extra.Get(m";
_cr = (b4a.example.bctextengine._bcconnectedruns)(_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_vvvvvvvvvvvvvvvvvvvv4._extra_connectedruns /*String*/ )));
 //BA.debugLineNum = 356;BA.debugLine="cr.Runs.Add(Run)";
_cr.Runs /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_run));
 //BA.debugLineNum = 357;BA.debugLine="cr.Alignment = \"right\"";
_cr.Alignment /*String*/  = "right";
 //BA.debugLineNum = 358;BA.debugLine="cr.ConnectedWidth = mTextEngine.GetFontMetrics";
_cr.ConnectedWidth /*int*/  = (int) (_vvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*b4a.example.bctextengine._bcfontmetrics*/ (_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_run.TextColor /*int*/ ).xWidth /*int*/ *3/(double)_vvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*float*/ );
 //BA.debugLineNum = 359;BA.debugLine="parent.IndentLevel = Run.IndentLevel";
_parent.IndentLevel /*int*/  = _run.IndentLevel /*int*/ ;
 //BA.debugLineNum = 360;BA.debugLine="Run = parent";
_run = _parent;
 //BA.debugLineNum = 361;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
 //BA.debugLineNum = 362;BA.debugLine="tag.Extra.Put(\"count\", count)";
_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("count"),(Object)(_count));
 };
 //BA.debugLineNum = 364;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 367;BA.debugLine="Return Run";
if (true) return _run;
 //BA.debugLineNum = 368;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,b4a.example.bctextengine _textengine) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize (TextEngine As BCTextEngine)";
 //BA.debugLineNum = 18;BA.debugLine="AllowedTags = B4XCollections.CreateSet2(Array(\"b\"";
_vvvvvvvvvvvvvvvvvvvv1 = _vvvvv1._vvvv1 /*b4a.example.b4xset*/ (ba,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("b"),(Object)("u"),(Object)("url"),(Object)("plain"),(Object)("color"),(Object)("img"),(Object)("view"),(Object)("vertical"),(Object)("textsize"),(Object)("alignment"),(Object)("span"),(Object)("indent"),(Object)("list"),(Object)("*"),(Object)("fontawesome"),(Object)("materialicons"),(Object)("e"),(Object)("font"),(Object)("direction")}));
 //BA.debugLineNum = 20;BA.debugLine="ColorsMap = CreateMap(\"black\": xui.Color_Black, _";
_vvvvvvvvvvvvvvvvvvvv6 = __c.createMap(new Object[] {(Object)("black"),(Object)(_vvvv5.Color_Black),(Object)("darkgray"),(Object)(_vvvv5.Color_DarkGray),(Object)("gray"),(Object)(_vvvv5.Color_Gray),(Object)("lightgray"),(Object)(_vvvv5.Color_LightGray),(Object)("white"),(Object)(_vvvv5.Color_White),(Object)("red"),(Object)(_vvvv5.Color_Red),(Object)("green"),(Object)(_vvvv5.Color_Green),(Object)("blue"),(Object)(_vvvv5.Color_Blue),(Object)("yellow"),(Object)(_vvvv5.Color_Yellow),(Object)("cyan"),(Object)(_vvvv5.Color_Cyan),(Object)("magenta"),(Object)(_vvvv5.Color_Magenta),(Object)("transparent"),(Object)(_vvvv5.Color_Transparent)});
 //BA.debugLineNum = 32;BA.debugLine="mTextEngine = TextEngine";
_vvvvvvvvvvvvvvvvvvvv4 = _textengine;
 //BA.debugLineNum = 33;BA.debugLine="ErrorString.Initialize";
_vvvvvvvvvvvvvvvvvvvv7.Initialize();
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _vvvvvvvvvvvvvvvvvv0(b4a.example.bbcodeparser._bbcodeparsedata _data) throws Exception{
anywheresoftware.b4a.objects.collections.List _parsedelements = null;
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matcher = null;
int _lastmatchend = 0;
boolean _skipuntilendtag = false;
String _tag = "";
boolean _closedtag = false;
b4a.example.bbcodeparser._bbcodetagnode _t = null;
b4a.example.bbcodeparser._bbcodetagnode _n = null;
 //BA.debugLineNum = 36;BA.debugLine="Public Sub Parse (Data As BBCodeParseData) As List";
 //BA.debugLineNum = 37;BA.debugLine="ErrorString.Initialize";
_vvvvvvvvvvvvvvvvvvvv7.Initialize();
 //BA.debugLineNum = 38;BA.debugLine="Dim ParsedElements As List";
_parsedelements = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 39;BA.debugLine="ParsedElements.Initialize";
_parsedelements.Initialize();
 //BA.debugLineNum = 40;BA.debugLine="Stack.Initialize";
_vvvvvvvvvvvvvvvvvvvv2.Initialize();
 //BA.debugLineNum = 41;BA.debugLine="Stack.Add(CreateTagNode(\"noop\"))";
_vvvvvvvvvvvvvvvvvvvv2.Add((Object)(_vvvvvvvvvvvvvvvvvv2("noop")));
 //BA.debugLineNum = 42;BA.debugLine="Dim matcher As Matcher = Regex.Matcher(\"(?<!\\[)\\[";
_matcher = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matcher = __c.Regex.Matcher("(?<!\\[)\\[[^\\[\\]]+\\]",_data.Text /*String*/ );
 //BA.debugLineNum = 43;BA.debugLine="Dim LastMatchEnd As Int = 0";
_lastmatchend = (int) (0);
 //BA.debugLineNum = 44;BA.debugLine="Dim skipUntilEndTag As Boolean = False";
_skipuntilendtag = __c.False;
 //BA.debugLineNum = 45;BA.debugLine="Do While matcher.Find";
while (_matcher.Find()) {
 //BA.debugLineNum = 46;BA.debugLine="Start = matcher.GetStart(0)";
_vvvvvvvvvvvvvvvvvvvv3 = _matcher.GetStart((int) (0));
 //BA.debugLineNum = 47;BA.debugLine="If Start > LastMatchEnd And skipUntilEndTag = Fa";
if (_vvvvvvvvvvvvvvvvvvvv3>_lastmatchend && _skipuntilendtag==__c.False) { 
 //BA.debugLineNum = 48;BA.debugLine="ParsedElements.Add(CreateTextNode(Data.Text.Sub";
_parsedelements.Add((Object)(_vvvvvvvvvvvvvvvvvv3(_data.Text /*String*/ .substring(_lastmatchend,_vvvvvvvvvvvvvvvvvvvv3))));
 };
 //BA.debugLineNum = 50;BA.debugLine="Dim tag As String = matcher.Match.SubString2(1,";
_tag = _matcher.getMatch().substring((int) (1),(int) (_matcher.getMatch().length()-1));
 //BA.debugLineNum = 51;BA.debugLine="If tag.StartsWith(\"/\") Then";
if (_tag.startsWith("/")) { 
 //BA.debugLineNum = 52;BA.debugLine="tag = tag.SubString(1).ToLowerCase";
_tag = _tag.substring((int) (1)).toLowerCase();
 //BA.debugLineNum = 53;BA.debugLine="If StackPeek.Tag <> tag Then";
if ((_vvvvvvvvvvvvvvvvvvv5().Tag /*String*/ ).equals(_tag) == false) { 
 //BA.debugLineNum = 54;BA.debugLine="If StackPeek.CanHaveNestedTags = False Then";
if (_vvvvvvvvvvvvvvvvvvv5().CanHaveNestedTags /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 55;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 57;BA.debugLine="Error(\"Closing tag does not match: \" & tag)";
_vvvvvvvvvvvvvvvvvv4("Closing tag does not match: "+_tag);
 //BA.debugLineNum = 58;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 };
 //BA.debugLineNum = 60;BA.debugLine="If skipUntilEndTag Then";
if (_skipuntilendtag) { 
 //BA.debugLineNum = 61;BA.debugLine="If Start > LastMatchEnd Then";
if (_vvvvvvvvvvvvvvvvvvvv3>_lastmatchend) { 
 //BA.debugLineNum = 62;BA.debugLine="ParsedElements.Add(CreateTextNode(Data.Text.S";
_parsedelements.Add((Object)(_vvvvvvvvvvvvvvvvvv3(_data.Text /*String*/ .substring(_lastmatchend,_vvvvvvvvvvvvvvvvvvvv3))));
 };
 };
 //BA.debugLineNum = 65;BA.debugLine="StackPop";
_vvvvvvvvvvvvvvvvvvv6();
 //BA.debugLineNum = 66;BA.debugLine="skipUntilEndTag = False";
_skipuntilendtag = __c.False;
 }else {
 //BA.debugLineNum = 68;BA.debugLine="If StackPeek.CanHaveNestedTags = False Then Con";
if (_vvvvvvvvvvvvvvvvvvv5().CanHaveNestedTags /*boolean*/ ==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 69;BA.debugLine="Dim ClosedTag As Boolean";
_closedtag = false;
 //BA.debugLineNum = 70;BA.debugLine="If tag.EndsWith(\"/\") Then";
if (_tag.endsWith("/")) { 
 //BA.debugLineNum = 71;BA.debugLine="ClosedTag = True";
_closedtag = __c.True;
 //BA.debugLineNum = 72;BA.debugLine="tag = tag.SubString2(0, tag.Length - 1)";
_tag = _tag.substring((int) (0),(int) (_tag.length()-1));
 }else if((_tag).equals("*")) { 
 //BA.debugLineNum = 74;BA.debugLine="ClosedTag = True";
_closedtag = __c.True;
 };
 //BA.debugLineNum = 76;BA.debugLine="tag = tag.Trim";
_tag = _tag.trim();
 //BA.debugLineNum = 77;BA.debugLine="Dim t As BBCodeTagNode = ParseTag(tag)";
_t = _vvvvvvvvvvvvvvvvvvv3(_tag);
 //BA.debugLineNum = 78;BA.debugLine="If AllowedTags.Contains(t.Tag) = False Then";
if (_vvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvvv7 /*boolean*/ ((Object)(_t.Tag /*String*/ ))==__c.False) { 
 //BA.debugLineNum = 79;BA.debugLine="Error(\"Invalid tag: \" & tag)";
_vvvvvvvvvvvvvvvvvv4("Invalid tag: "+_tag);
 //BA.debugLineNum = 80;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 };
 //BA.debugLineNum = 82;BA.debugLine="StackPush(t)";
_vvvvvvvvvvvvvvvvvvv7(_t);
 //BA.debugLineNum = 83;BA.debugLine="If t.Tag = \"plain\" Then";
if ((_t.Tag /*String*/ ).equals("plain")) { 
 //BA.debugLineNum = 84;BA.debugLine="Dim n As BBCodeTagNode = StackPeek";
_n = _vvvvvvvvvvvvvvvvvvv5();
 //BA.debugLineNum = 85;BA.debugLine="n.CanHaveNestedTags = False";
_n.CanHaveNestedTags /*boolean*/  = __c.False;
 //BA.debugLineNum = 86;BA.debugLine="skipUntilEndTag = True";
_skipuntilendtag = __c.True;
 };
 //BA.debugLineNum = 88;BA.debugLine="If ClosedTag Then";
if (_closedtag) { 
 //BA.debugLineNum = 89;BA.debugLine="ParsedElements.Add(CreateTextNode(\"\"))";
_parsedelements.Add((Object)(_vvvvvvvvvvvvvvvvvv3("")));
 //BA.debugLineNum = 90;BA.debugLine="StackPop";
_vvvvvvvvvvvvvvvvvvv6();
 };
 };
 //BA.debugLineNum = 93;BA.debugLine="LastMatchEnd = matcher.GetEnd(0)";
_lastmatchend = _matcher.GetEnd((int) (0));
 }
;
 //BA.debugLineNum = 95;BA.debugLine="If Data.Text.Length > LastMatchEnd Then";
if (_data.Text /*String*/ .length()>_lastmatchend) { 
 //BA.debugLineNum = 96;BA.debugLine="ParsedElements.Add(CreateTextNode(Data.Text.SubS";
_parsedelements.Add((Object)(_vvvvvvvvvvvvvvvvvv3(_data.Text /*String*/ .substring(_lastmatchend,_data.Text /*String*/ .length()))));
 };
 //BA.debugLineNum = 98;BA.debugLine="Return ParsedElements";
if (true) return _parsedelements;
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public int  _vvvvvvvvvvvvvvvvvvv1(String _raw) throws Exception{
 //BA.debugLineNum = 324;BA.debugLine="Private Sub ParseCodepoint (raw As String) As Int";
 //BA.debugLineNum = 325;BA.debugLine="If raw.StartsWith(\"0x\") Then raw = raw.SubString(";
if (_raw.startsWith("0x")) { 
_raw = _raw.substring((int) (2));};
 //BA.debugLineNum = 326;BA.debugLine="Return Bit.ParseInt(raw, 16)";
if (true) return __c.Bit.ParseInt(_raw,(int) (16));
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return 0;
}
public int  _vvvvvvvvvvvvvvvvvvv2(String _clr) throws Exception{
 //BA.debugLineNum = 329;BA.debugLine="Private Sub ParseColorString(clr As String) As Int";
 //BA.debugLineNum = 330;BA.debugLine="clr = clr.ToLowerCase";
_clr = _clr.toLowerCase();
 //BA.debugLineNum = 331;BA.debugLine="If clr.StartsWith(\"#\") Then";
if (_clr.startsWith("#")) { 
 //BA.debugLineNum = 332;BA.debugLine="Return Bit.Or(0xff000000, Bit.ParseInt(clr.SubSt";
if (true) return __c.Bit.Or((int) (0xff000000),__c.Bit.ParseInt(_clr.substring((int) (1)),(int) (16)));
 }else if(_clr.startsWith("0x")) { 
 //BA.debugLineNum = 334;BA.debugLine="Return Bit.Or(0xff000000, Bit.ParseInt(clr.SubSt";
if (true) return __c.Bit.Or((int) (0xff000000),__c.Bit.ParseInt(_clr.substring((int) (4)),(int) (16)));
 }else if(_vvvvvvvvvvvvvvvvvvvv6.ContainsKey((Object)(_clr))) { 
 //BA.debugLineNum = 336;BA.debugLine="Return ColorsMap.Get(clr)";
if (true) return (int)(BA.ObjectToNumber(_vvvvvvvvvvvvvvvvvvvv6.Get((Object)(_clr))));
 }else {
 //BA.debugLineNum = 338;BA.debugLine="Error(\"Invalid color value: \" & clr)";
_vvvvvvvvvvvvvvvvvv4("Invalid color value: "+_clr);
 //BA.debugLineNum = 339;BA.debugLine="Return xui.Color_Black";
if (true) return _vvvv5.Color_Black;
 };
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return 0;
}
public b4a.example.bbcodeparser._bbcodetagnode  _vvvvvvvvvvvvvvvvvvv3(String _tag) throws Exception{
b4a.example.bbcodeparser._bbcodetagnode _res = null;
int _i = 0;
int _last = 0;
String _c = "";
String _key = "";
int _i2 = 0;
 //BA.debugLineNum = 101;BA.debugLine="Private Sub ParseTag (tag As String) As BBCodeTagN";
 //BA.debugLineNum = 105;BA.debugLine="If tag.Contains(\"=\") = False Then Return CreateTa";
if (_tag.contains("=")==__c.False) { 
if (true) return _vvvvvvvvvvvvvvvvvv2(_tag.toLowerCase());};
 //BA.debugLineNum = 106;BA.debugLine="Dim res As BBCodeTagNode = CreateTagNode(\"\")";
_res = _vvvvvvvvvvvvvvvvvv2("");
 //BA.debugLineNum = 107;BA.debugLine="res.Extra.Initialize";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 108;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 109;BA.debugLine="Dim last As Int = -1";
_last = (int) (-1);
 //BA.debugLineNum = 110;BA.debugLine="Do While i < tag.Length";
while (_i<_tag.length()) {
 //BA.debugLineNum = 111;BA.debugLine="Dim c As String = tag.CharAt(i)";
_c = BA.ObjectToString(_tag.charAt(_i));
 //BA.debugLineNum = 112;BA.debugLine="If c = \"=\" Then";
if ((_c).equals("=")) { 
 //BA.debugLineNum = 113;BA.debugLine="Dim key As String = tag.SubString2(last + 1, i)";
_key = _tag.substring((int) (_last+1),_i).toLowerCase();
 //BA.debugLineNum = 114;BA.debugLine="If res.tag = \"\" Then 'option #2";
if ((_res.Tag /*String*/ ).equals("")) { 
 //BA.debugLineNum = 115;BA.debugLine="res.Tag = key";
_res.Tag /*String*/  = _key;
 };
 //BA.debugLineNum = 117;BA.debugLine="Dim i2 As Int";
_i2 = 0;
 //BA.debugLineNum = 118;BA.debugLine="If tag.CharAt(i + 1) = QUOTE Then";
if (_tag.charAt((int) (_i+1))==BA.ObjectToChar(__c.QUOTE)) { 
 //BA.debugLineNum = 119;BA.debugLine="i2 = tag.IndexOf2(QUOTE, i + 2)";
_i2 = _tag.indexOf(__c.QUOTE,(int) (_i+2));
 //BA.debugLineNum = 120;BA.debugLine="res.Extra.Put(key, tag.SubString2(i + 2, i2))";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_tag.substring((int) (_i+2),_i2)));
 }else {
 //BA.debugLineNum = 122;BA.debugLine="i2 = tag.IndexOf2(\" \", i + 2)";
_i2 = _tag.indexOf(" ",(int) (_i+2));
 //BA.debugLineNum = 123;BA.debugLine="If i2 = -1 Then i2 = tag.Length";
if (_i2==-1) { 
_i2 = _tag.length();};
 //BA.debugLineNum = 124;BA.debugLine="res.Extra.Put(key, tag.SubString2(i + 1, i2))";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_tag.substring((int) (_i+1),_i2)));
 };
 //BA.debugLineNum = 126;BA.debugLine="i = i2";
_i = _i2;
 //BA.debugLineNum = 127;BA.debugLine="last = i";
_last = _i;
 };
 //BA.debugLineNum = 129;BA.debugLine="If c = \" \" Then";
if ((_c).equals(" ")) { 
 //BA.debugLineNum = 130;BA.debugLine="If res.Extra.Size = 0 Then";
if (_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()==0) { 
 //BA.debugLineNum = 131;BA.debugLine="Dim key As String = tag.SubString2(0, i).ToLow";
_key = _tag.substring((int) (0),_i).toLowerCase();
 //BA.debugLineNum = 132;BA.debugLine="res.Tag = key";
_res.Tag /*String*/  = _key;
 };
 //BA.debugLineNum = 134;BA.debugLine="last = i";
_last = _i;
 };
 //BA.debugLineNum = 136;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
 //BA.debugLineNum = 138;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public void  _vvvvvvvvvvvvvvvvvvv4(b4a.example.bbcodeparser._bbcodetagnode _tag,b4a.example.bctextengine._bctextrun _run,b4a.example.bbcodeparser._bbcodeparsedata _data) throws Exception{
ResumableSub_SetImageView rsub = new ResumableSub_SetImageView(this,_tag,_run,_data);
rsub.resume(ba, null);
}
public static class ResumableSub_SetImageView extends BA.ResumableSub {
public ResumableSub_SetImageView(b4a.example.bbcodeparser parent,b4a.example.bbcodeparser._bbcodetagnode _tag,b4a.example.bctextengine._bctextrun _run,b4a.example.bbcodeparser._bbcodeparsedata _data) {
this.parent = parent;
this._tag = _tag;
this._run = _run;
this._data = _data;
}
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 392;BA.debugLine="Dim url As String = Tag.Extra.GetDefault(\"url\", \"";
_url = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("url"),(Object)("")));
 //BA.debugLineNum = 393;BA.debugLine="Dim dir As String = Tag.Extra.GetDefault(\"dir\", F";
_dir = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("dir"),(Object)(parent.__c.File.getDirAssets())));
 //BA.debugLineNum = 394;BA.debugLine="Dim filename As String = Tag.Extra.GetDefault(\"fi";
_filename = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("filename"),(Object)("")));
 //BA.debugLineNum = 395;BA.debugLine="Dim width As Int = GetDimensionFromTag(Tag, \"widt";
_width = parent._vvvvvvvvvvvvvvvvvv5(_tag,"width",_data);
 //BA.debugLineNum = 396;BA.debugLine="Dim height As Int = GetDimensionFromTag(Tag, \"hei";
_height = parent._vvvvvvvvvvvvvvvvvv5(_tag,"height",_data);
 //BA.debugLineNum = 397;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 398;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
 //BA.debugLineNum = 402;BA.debugLine="Dim xiv As B4XView = iv";
_xiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 //BA.debugLineNum = 403;BA.debugLine="run.View = xiv";
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xiv;
 //BA.debugLineNum = 404;BA.debugLine="Dim bmp As B4XBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 405;BA.debugLine="If url <> \"\" Then";
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
 //BA.debugLineNum = 406;BA.debugLine="xiv.SetLayoutAnimated(0, 0, 0, width, height)";
_xiv.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
 //BA.debugLineNum = 407;BA.debugLine="If data.ImageCache.ContainsKey(url) Then";
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
 //BA.debugLineNum = 408;BA.debugLine="xiv.SetBitmap(data.ImageCache.Get(url))";
_xiv.SetBitmap((android.graphics.Bitmap)(_data.ImageCache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_url))));
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 410;BA.debugLine="Dim j As HttpJob";
_j = new b4a.example.httpjob();
 //BA.debugLineNum = 411;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 412;BA.debugLine="j.Download(url)";
_j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ (_url);
 //BA.debugLineNum = 413;BA.debugLine="Wait For (j) JobDone (j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 27;
return;
case 27:
//C
this.state = 9;
_j = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 414;BA.debugLine="If j.Success Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*boolean*/ ) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 415;BA.debugLine="bmp = j.GetBitmap";
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ().getObject()));
 //BA.debugLineNum = 416;BA.debugLine="bmp = bmp.Resize(width, height, True)";
_bmp = _bmp.Resize(_width,_height,parent.__c.True);
 //BA.debugLineNum = 417;BA.debugLine="data.ImageCache.Put(url, bmp)";
_data.ImageCache /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_url),(Object)(_bmp.getObject()));
 //BA.debugLineNum = 418;BA.debugLine="xiv.SetBitmap(bmp)";
_xiv.SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
 if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 420;BA.debugLine="j.Release";
_j._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*String*/ ();
 if (true) break;

case 13:
//C
this.state = 26;
;
 if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 423;BA.debugLine="If width = -1 And height = -1 Then";
if (true) break;

case 16:
//if
this.state = 25;
if (_width==-1 && _height==-1) { 
this.state = 18;
}else if(_width>-1 && _height>-1) { 
this.state = 20;
}else if(_width>-1) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 18:
//C
this.state = 25;
 //BA.debugLineNum = 424;BA.debugLine="bmp = xui.LoadBitmap(dir, filename)";
_bmp = parent._vvvv5.LoadBitmap(_dir,_filename);
 if (true) break;

case 20:
//C
this.state = 25;
 //BA.debugLineNum = 426;BA.debugLine="bmp = xui.LoadBitmapResize(dir, filename, width";
_bmp = parent._vvvv5.LoadBitmapResize(_dir,_filename,_width,_height,parent.__c.False);
 if (true) break;

case 22:
//C
this.state = 25;
 //BA.debugLineNum = 428;BA.debugLine="bmp = xui.LoadBitmapResize(dir, filename, width";
_bmp = parent._vvvv5.LoadBitmapResize(_dir,_filename,_width,(int) (10000),parent.__c.True);
 if (true) break;

case 24:
//C
this.state = 25;
 //BA.debugLineNum = 430;BA.debugLine="bmp = xui.LoadBitmapResize(dir, filename, 10000";
_bmp = parent._vvvv5.LoadBitmapResize(_dir,_filename,(int) (10000),_height,parent.__c.True);
 if (true) break;

case 25:
//C
this.state = 26;
;
 //BA.debugLineNum = 432;BA.debugLine="xiv.SetBitmap(bmp)";
_xiv.SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 433;BA.debugLine="xiv.SetLayoutAnimated(0, 0, 0, bmp.Width, bmp.He";
_xiv.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_bmp.getWidth()),(int) (_bmp.getHeight()));
 if (true) break;

case 26:
//C
this.state = -1;
;
 //BA.debugLineNum = 435;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(b4a.example.httpjob _j) throws Exception{
}
public b4a.example.bbcodeparser._bbcodetagnode  _vvvvvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Private Sub StackPeek As BBCodeTagNode";
 //BA.debugLineNum = 150;BA.debugLine="Return Stack.Get(Stack.Size - 1)";
if (true) return (b4a.example.bbcodeparser._bbcodetagnode)(_vvvvvvvvvvvvvvvvvvvv2.Get((int) (_vvvvvvvvvvvvvvvvvvvv2.getSize()-1)));
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvvvvvv6() throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Private Sub StackPop";
 //BA.debugLineNum = 142;BA.debugLine="Stack.RemoveAt(Stack.Size - 1)";
_vvvvvvvvvvvvvvvvvvvv2.RemoveAt((int) (_vvvvvvvvvvvvvvvvvvvv2.getSize()-1));
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvv7(b4a.example.bbcodeparser._bbcodetagnode _tag) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Private Sub StackPush (Tag As BBCodeTagNode)";
 //BA.debugLineNum = 146;BA.debugLine="Stack.Add(Tag)";
_vvvvvvvvvvvvvvvvvvvv2.Add((Object)(_tag));
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvv0(b4a.example.bbcodeparser._bbcodetextnode _text,anywheresoftware.b4a.objects.collections.List _runslist,b4a.example.bbcodeparser._bbcodeparsedata _data) throws Exception{
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
 //BA.debugLineNum = 190;BA.debugLine="Private Sub TextToRun (Text As BBCodeTextNode, Run";
 //BA.debugLineNum = 191;BA.debugLine="Dim list As List = RunsList";
_list = new anywheresoftware.b4a.objects.collections.List();
_list = _runslist;
 //BA.debugLineNum = 192;BA.debugLine="Dim Run As BCTextRun = mTextEngine.CreateRun(Text";
_run = _vvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvv4 /*b4a.example.bctextengine._bctextrun*/ (_text.Text /*String*/ );
 //BA.debugLineNum = 193;BA.debugLine="Run.TextColor = Data.DefaultColor";
_run.TextColor /*int*/  = _data.DefaultColor /*int*/ ;
 //BA.debugLineNum = 194;BA.debugLine="Run.TextFont = Data.DefaultFont";
_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _data.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
 //BA.debugLineNum = 195;BA.debugLine="Dim customfont As Boolean";
_customfont = false;
 //BA.debugLineNum = 196;BA.debugLine="Dim FontSize As Int = Data.DefaultFont.Size";
_fontsize = (int) (_data.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getSize());
 //BA.debugLineNum = 197;BA.debugLine="Dim CurrentFont As B4XFont = Data.DefaultFont";
_currentfont = _data.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
 //BA.debugLineNum = 198;BA.debugLine="Dim IsListElement As Boolean";
_islistelement = false;
 //BA.debugLineNum = 199;BA.debugLine="For i = 0 To Text.Tags.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 200;BA.debugLine="Dim tag As BBCodeTagNode = Text.Tags.Get(i)";
_tag = (b4a.example.bbcodeparser._bbcodetagnode)(_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 //BA.debugLineNum = 201;BA.debugLine="Select tag.Tag";
switch (BA.switchObjectToInt(_tag.Tag /*String*/ ,"u","b","url","color","img","view","vertical","textsize","font","alignment","span","indent","list","*","e","direction","fontawesome","materialicons")) {
case 0: {
 //BA.debugLineNum = 203;BA.debugLine="Run.Underline = True";
_run.Underline /*boolean*/  = __c.True;
 //BA.debugLineNum = 204;BA.debugLine="If tag.Extra.IsInitialized Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
 //BA.debugLineNum = 205;BA.debugLine="Dim uu As BCStyledUnderline";
_uu = new b4a.example.bctextengine._bcstyledunderline();
 //BA.debugLineNum = 206;BA.debugLine="uu.Initialize";
_uu.Initialize();
 //BA.debugLineNum = 207;BA.debugLine="uu.Style = tag.Extra.GetDefault(\"style\", mTex";
_uu.Style /*String*/  = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("style"),(Object)(_vvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*b4a.example.bctextengine._bcstyledunderline*/ .Style /*String*/ )));
 //BA.debugLineNum = 208;BA.debugLine="uu.Style = uu.Style.ToLowerCase";
_uu.Style /*String*/  = _uu.Style /*String*/ .toLowerCase();
 //BA.debugLineNum = 209;BA.debugLine="If tag.Extra.ContainsKey(\"color\") Then uu.Clr";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("color"))) { 
_uu.Clr /*int*/  = _vvvvvvvvvvvvvvvvvvv2(BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("color"))));}
else {
_uu.Clr /*int*/  = (int) (0);};
 //BA.debugLineNum = 210;BA.debugLine="uu.Thickness = DipToCurrent(tag.Extra.GetDefa";
_uu.Thickness /*float*/  = (float) (__c.DipToCurrent((int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("thickness"),(Object)(1))))));
 //BA.debugLineNum = 211;BA.debugLine="If Run.Extra.IsInitialized = False Then Run.E";
if (_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
 //BA.debugLineNum = 212;BA.debugLine="Run.Extra.Put(mTextEngine.EXTRA_STYLEDUNDERLI";
_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_vvvvvvvvvvvvvvvvvvvv4._extra_styledunderline /*String*/ ),(Object)(_uu));
 };
 break; }
case 1: {
 //BA.debugLineNum = 215;BA.debugLine="customfont = True";
_customfont = __c.True;
 //BA.debugLineNum = 216;BA.debugLine="CurrentFont = Data.DefaultBoldFont";
_currentfont = _data.DefaultBoldFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
 break; }
case 2: {
 //BA.debugLineNum = 218;BA.debugLine="Dim url As String";
_url = "";
 //BA.debugLineNum = 219;BA.debugLine="If tag.Extra.IsInitialized Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
 //BA.debugLineNum = 220;BA.debugLine="url = tag.Extra.Get(\"url\")";
_url = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("url")));
 }else {
 //BA.debugLineNum = 222;BA.debugLine="url = Text.Text";
_url = _text.Text /*String*/ ;
 //BA.debugLineNum = 223;BA.debugLine="Run.TextDirection = mTextEngine.TextDirection";
_run.TextDirection /*int*/  = _vvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*int*/ ;
 };
 //BA.debugLineNum = 225;BA.debugLine="If Data.URLs.IsInitialized Then Data.URLs.Put(";
if (_data.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
_data.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_run),(Object)(_url));};
 //BA.debugLineNum = 226;BA.debugLine="Run.Underline = True";
_run.Underline /*boolean*/  = __c.True;
 //BA.debugLineNum = 227;BA.debugLine="Run.TextColor = UrlColor";
_run.TextColor /*int*/  = _vvvvvvvvvvvvvvvvvvvv5;
 break; }
case 3: {
 //BA.debugLineNum = 229;BA.debugLine="Dim clr As String = tag.Extra.Get(\"color\")";
_clr = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("color")));
 //BA.debugLineNum = 230;BA.debugLine="Run.TextColor = ParseColorString(clr)";
_run.TextColor /*int*/  = _vvvvvvvvvvvvvvvvvvv2(_clr);
 break; }
case 4: {
 //BA.debugLineNum = 232;BA.debugLine="SetImageView(tag, Run, Data)";
_vvvvvvvvvvvvvvvvvvv4(_tag,_run,_data);
 //BA.debugLineNum = 233;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("vertical"))) { 
 //BA.debugLineNum = 234;BA.debugLine="Run.VerticalOffset = GetDimensionFromTag(tag,";
_run.VerticalOffset /*int*/  = _vvvvvvvvvvvvvvvvvv5(_tag,"vertical",_data);
 };
 //BA.debugLineNum = 236;BA.debugLine="Data.ViewsPanel.AddView(Run.View, 0, 0, Run.Vi";
_data.ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 break; }
case 5: {
 //BA.debugLineNum = 238;BA.debugLine="Run.View = GetView(tag, Data)";
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _vvvvvvvvvvvvvvvvvv6(_tag,_data);
 //BA.debugLineNum = 239;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then Run.";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("vertical"))) { 
_run.VerticalOffset /*int*/  = _vvvvvvvvvvvvvvvvvv5(_tag,"vertical",_data);};
 //BA.debugLineNum = 240;BA.debugLine="If tag.Extra.ContainsKey(\"width\") Then Run.Vie";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("width"))) { 
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(_vvvvvvvvvvvvvvvvvv5(_tag,"width",_data));};
 //BA.debugLineNum = 241;BA.debugLine="If tag.Extra.ContainsKey(\"height\") Then Run.Vi";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("height"))) { 
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(_vvvvvvvvvvvvvvvvvv5(_tag,"height",_data));};
 //BA.debugLineNum = 242;BA.debugLine="Data.ViewsPanel.AddView(Run.View, 0, 0, Run.Vi";
_data.ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 break; }
case 6: {
 //BA.debugLineNum = 244;BA.debugLine="Run.VerticalOffset = GetDimensionFromTag(tag,";
_run.VerticalOffset /*int*/  = _vvvvvvvvvvvvvvvvvv5(_tag,"vertical",_data);
 break; }
case 7: {
 //BA.debugLineNum = 246;BA.debugLine="FontSize = tag.Extra.Get(\"textsize\")";
_fontsize = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("textsize"))));
 break; }
case 8: {
 //BA.debugLineNum = 248;BA.debugLine="customfont = True";
_customfont = __c.True;
 //BA.debugLineNum = 249;BA.debugLine="Dim name As String = tag.Extra.Get(tag.Tag)";
_name = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_tag.Tag /*String*/ )));
 //BA.debugLineNum = 250;BA.debugLine="If mTextEngine.CustomFonts.ContainsKey(name) =";
if (_vvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_name))==__c.False) { 
 //BA.debugLineNum = 251;BA.debugLine="Log(\"Font missing from TextEngine.CustomFonts";
__c.LogImpl("99437245","Font missing from TextEngine.CustomFonts: "+_name,0);
 }else {
 //BA.debugLineNum = 253;BA.debugLine="Dim NewFont As B4XFont =  mTextEngine.CustomF";
_newfont = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont)(_vvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_name)));
 //BA.debugLineNum = 254;BA.debugLine="CurrentFont = NewFont";
_currentfont = _newfont;
 //BA.debugLineNum = 255;BA.debugLine="If tag.Extra.ContainsKey(\"size\") Then FontSiz";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("size"))) { 
_fontsize = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("size"))));};
 };
 break; }
case 9: {
 //BA.debugLineNum = 258;BA.debugLine="Run.HorizontalAlignment = tag.Extra.Get(\"align";
_run.HorizontalAlignment /*String*/  = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("alignment")));
 break; }
case 10: {
 //BA.debugLineNum = 260;BA.debugLine="If tag.Extra.ContainsKey(\"run\") = False Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("run"))==__c.False) { 
 //BA.debugLineNum = 261;BA.debugLine="Dim parent As BCTextRun = mTextEngine.CreateC";
_parent = _vvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvv0 /*b4a.example.bctextengine._bctextrun*/ ();
 //BA.debugLineNum = 262;BA.debugLine="Dim cr As BCConnectedRuns = parent.Extra.Get(";
_cr = (b4a.example.bctextengine._bcconnectedruns)(_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_vvvvvvvvvvvvvvvvvvvv4._extra_connectedruns /*String*/ )));
 //BA.debugLineNum = 263;BA.debugLine="cr.ConnectedWidth = GetDimensionFromTag(tag,";
_cr.ConnectedWidth /*int*/  = _vvvvvvvvvvvvvvvvvv5(_tag,"minwidth",_data);
 //BA.debugLineNum = 264;BA.debugLine="cr.Alignment = tag.Extra.GetDefault(\"alignmen";
_cr.Alignment /*String*/  = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("alignment"),(Object)("left")));
 //BA.debugLineNum = 265;BA.debugLine="RunsList.Add(parent)";
_runslist.Add((Object)(_parent));
 //BA.debugLineNum = 266;BA.debugLine="tag.Extra.Put(\"run\", parent)";
_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("run"),(Object)(_parent));
 };
 //BA.debugLineNum = 268;BA.debugLine="Dim parent As BCTextRun = tag.Extra.Get(\"run\")";
_parent = (b4a.example.bctextengine._bctextrun)(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("run")));
 //BA.debugLineNum = 269;BA.debugLine="Dim cr As BCConnectedRuns = parent.Extra.Get(m";
_cr = (b4a.example.bctextengine._bcconnectedruns)(_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_vvvvvvvvvvvvvvvvvvvv4._extra_connectedruns /*String*/ )));
 //BA.debugLineNum = 270;BA.debugLine="list = cr.Runs";
_list = _cr.Runs /*anywheresoftware.b4a.objects.collections.List*/ ;
 break; }
case 11: {
 //BA.debugLineNum = 272;BA.debugLine="Run.IndentLevel = tag.Extra.Get(\"indent\")";
_run.IndentLevel /*int*/  = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("indent"))));
 break; }
case 12: {
 //BA.debugLineNum = 274;BA.debugLine="Run.IndentLevel = Run.IndentLevel + 1";
_run.IndentLevel /*int*/  = (int) (_run.IndentLevel /*int*/ +1);
 break; }
case 13: {
 //BA.debugLineNum = 276;BA.debugLine="IsListElement = True";
_islistelement = __c.True;
 break; }
case 14: {
 //BA.debugLineNum = 278;BA.debugLine="Run.TextChars = mTextEngine.CreateBCTextChars(";
_run.TextChars /*b4a.example.bctextengine._bctextchars*/  = _vvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvv6 /*b4a.example.bctextengine._bctextchars*/ (new String[]{BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_tag.Tag /*String*/ )))},(int) (0),(int) (1));
 //BA.debugLineNum = 279;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then Run.";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("vertical"))) { 
_run.VerticalOffset /*int*/  = _vvvvvvvvvvvvvvvvvv5(_tag,"vertical",_data);};
 break; }
case 15: {
 //BA.debugLineNum = 281;BA.debugLine="Dim dir As String = tag.Extra.Get(\"direction\")";
_dir = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("direction")));
 //BA.debugLineNum = 282;BA.debugLine="Select dir.ToLowerCase";
switch (BA.switchObjectToInt(_dir.toLowerCase(),"ltr","rtl","unknown")) {
case 0: {
 //BA.debugLineNum = 284;BA.debugLine="Run.TextDirection = mTextEngine.TextDirectio";
_run.TextDirection /*int*/  = _vvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*int*/ ;
 break; }
case 1: {
 //BA.debugLineNum = 286;BA.debugLine="Run.TextDirection = mTextEngine.TextDirectio";
_run.TextDirection /*int*/  = _vvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*int*/ ;
 break; }
case 2: {
 //BA.debugLineNum = 288;BA.debugLine="Run.TextDirection = mTextEngine.TextDirectio";
_run.TextDirection /*int*/  = _vvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*int*/ ;
 break; }
}
;
 break; }
case 16: 
case 17: {
 //BA.debugLineNum = 291;BA.debugLine="customfont = True";
_customfont = __c.True;
 //BA.debugLineNum = 292;BA.debugLine="If tag.Tag = \"fontawesome\" Then";
if ((_tag.Tag /*String*/ ).equals("fontawesome")) { 
 //BA.debugLineNum = 293;BA.debugLine="CurrentFont = xui.CreateFontAwesome(FontSize)";
_currentfont = _vvvv5.CreateFontAwesome((float) (_fontsize));
 }else {
 //BA.debugLineNum = 295;BA.debugLine="CurrentFont = xui.CreateMaterialIcons(FontSiz";
_currentfont = _vvvv5.CreateMaterialIcons((float) (_fontsize));
 };
 //BA.debugLineNum = 297;BA.debugLine="Run.TextChars = mTextEngine.CreateBCTextCharsF";
_run.TextChars /*b4a.example.bctextengine._bctextchars*/  = _vvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvv7 /*b4a.example.bctextengine._bctextchars*/ (BA.ObjectToString(__c.Chr(_vvvvvvvvvvvvvvvvvvv1(BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_tag.Tag /*String*/ )))))));
 //BA.debugLineNum = 298;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then Run.";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("vertical"))) { 
_run.VerticalOffset /*int*/  = _vvvvvvvvvvvvvvvvvv5(_tag,"vertical",_data);};
 //BA.debugLineNum = 299;BA.debugLine="If tag.Extra.ContainsKey(\"size\") Then FontSize";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("size"))) { 
_fontsize = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("size"))));};
 break; }
}
;
 }
};
 //BA.debugLineNum = 302;BA.debugLine="If IsListElement Then";
if (_islistelement) { 
 //BA.debugLineNum = 303;BA.debugLine="Run = HandleListElement(Text, Run)";
_run = _vvvvvvvvvvvvvvvvvv7(_text,_run);
 };
 //BA.debugLineNum = 305;BA.debugLine="If customfont Or FontSize <> Data.DefaultFont.Siz";
if (_customfont || _fontsize!=_data.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getSize()) { 
 //BA.debugLineNum = 318;BA.debugLine="Run.TextFont = xui.CreateFont2(CurrentFont, Font";
_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _vvvv5.CreateFont2(_currentfont,(float) (_fontsize));
 };
 //BA.debugLineNum = 321;BA.debugLine="list.Add(Run)";
_list.Add((Object)(_run));
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
