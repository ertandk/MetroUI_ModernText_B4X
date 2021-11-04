package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bctextengine extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.bctextengine");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.bctextengine.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _bcfontmetrics{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.collections.Map Glyphs;
public b4a.example.bctextengine._bcfontmetrics DefaultColorMetrics;
public int xWidth;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont Fnt;
public int Clr;
public anywheresoftware.b4a.objects.collections.Map KerningTable;
public void Initialize() {
IsInitialized = true;
Glyphs = new anywheresoftware.b4a.objects.collections.Map();
DefaultColorMetrics = new b4a.example.bctextengine._bcfontmetrics();
xWidth = 0;
Fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
Clr = 0;
KerningTable = new anywheresoftware.b4a.objects.collections.Map();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bctextchars{
public boolean IsInitialized;
public String[] Buffer;
public int StartIndex;
public int Length;
public void Initialize() {
IsInitialized = true;
Buffer = new String[0];
java.util.Arrays.fill(Buffer,"");
StartIndex = 0;
Length = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcparagraphstyle{
public boolean IsInitialized;
public String HorizontalAlignment;
public float LineSpacingFactor;
public int MaxWidth;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect Padding;
public boolean WordWrap;
public boolean ResizeHeightAutomatically;
public boolean RTL;
public void Initialize() {
IsInitialized = true;
HorizontalAlignment = "";
LineSpacingFactor = 0f;
MaxWidth = 0;
Padding = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
WordWrap = false;
ResizeHeightAutomatically = false;
RTL = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bctextrun{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont TextFont;
public int TextColor;
public String Text;
public b4a.example.bctextengine._bctextchars TextChars;
public float CharacterSpacingFactor;
public int VerticalOffset;
public boolean Underline;
public int BackgroundColor;
public int IndentLevel;
public anywheresoftware.b4a.objects.B4XViewWrapper View;
public String HorizontalAlignment;
public Object Tag;
public anywheresoftware.b4a.objects.collections.Map Extra;
public int TextDirection;
public void Initialize() {
IsInitialized = true;
TextFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
TextColor = 0;
Text = "";
TextChars = new b4a.example.bctextengine._bctextchars();
CharacterSpacingFactor = 0f;
VerticalOffset = 0;
Underline = false;
BackgroundColor = 0;
IndentLevel = 0;
View = new anywheresoftware.b4a.objects.B4XViewWrapper();
HorizontalAlignment = "";
Tag = new Object();
Extra = new anywheresoftware.b4a.objects.collections.Map();
TextDirection = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcconnectedruns{
public boolean IsInitialized;
public int ConnectedWidth;
public anywheresoftware.b4a.objects.collections.List Runs;
public String Alignment;
public void Initialize() {
IsInitialized = true;
ConnectedWidth = 0;
Runs = new anywheresoftware.b4a.objects.collections.List();
Alignment = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcstyledunderline{
public boolean IsInitialized;
public int Clr;
public String Style;
public float Thickness;
public void Initialize() {
IsInitialized = true;
Clr = 0;
Style = "";
Thickness = 0f;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcparagraph{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.collections.List TextLines;
public b4a.example.bctextengine._bctextline CurrentLine;
public b4a.example.bctextengine._bcparagraphstyle Style;
public boolean TwoLayers;
public int Width;
public int Height;
public anywheresoftware.b4a.objects.collections.List Views;
public void Initialize() {
IsInitialized = true;
TextLines = new anywheresoftware.b4a.objects.collections.List();
CurrentLine = new b4a.example.bctextengine._bctextline();
Style = new b4a.example.bctextengine._bcparagraphstyle();
TwoLayers = false;
Width = 0;
Height = 0;
Views = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bctextline{
public boolean IsInitialized;
public int StartX;
public int BaselineY;
public int Height;
public anywheresoftware.b4a.objects.collections.List Unbreakables;
public int Width;
public boolean EndsWithSoftLineBreak;
public int MaxHeightAboveBaseLine;
public b4a.example.bctextengine._bcparagraph ParentParagraph;
public int MaxHeightBelowBaseLine;
public void Initialize() {
IsInitialized = true;
StartX = 0;
BaselineY = 0;
Height = 0;
Unbreakables = new anywheresoftware.b4a.objects.collections.List();
Width = 0;
EndsWithSoftLineBreak = false;
MaxHeightAboveBaseLine = 0;
ParentParagraph = new b4a.example.bctextengine._bcparagraph();
MaxHeightBelowBaseLine = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcunbreakabletext{
public boolean IsInitialized;
public int Width;
public int StartX;
public b4a.example.bctextengine._bctextchars NotFullTextChars;
public boolean IsMergable;
public anywheresoftware.b4a.objects.collections.List SingleStyleSections;
public b4a.example.bctextengine._bctextline ParentLine;
public boolean RTL;
public void Initialize() {
IsInitialized = true;
Width = 0;
StartX = 0;
NotFullTextChars = new b4a.example.bctextengine._bctextchars();
IsMergable = false;
SingleStyleSections = new anywheresoftware.b4a.objects.collections.List();
ParentLine = new b4a.example.bctextengine._bctextline();
RTL = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcsinglestylesection{
public boolean IsInitialized;
public int AbsoluteStartX;
public anywheresoftware.b4a.objects.collections.List GlyphsAndOffsets;
public b4a.example.bctextengine._bctextrun Run;
public int Width;
public int MaxHeightBelowBaseLine;
public int MaxHeightAboveBaseLine;
public b4a.example.bctextengine._bcunbreakabletext ParentUN;
public b4a.example.bctextengine._bcfontmetrics fm;
public void Initialize() {
IsInitialized = true;
AbsoluteStartX = 0;
GlyphsAndOffsets = new anywheresoftware.b4a.objects.collections.List();
Run = new b4a.example.bctextengine._bctextrun();
Width = 0;
MaxHeightBelowBaseLine = 0;
MaxHeightAboveBaseLine = 0;
ParentUN = new b4a.example.bctextengine._bcunbreakabletext();
fm = new b4a.example.bctextengine._bcfontmetrics();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcglyphandoffset{
public boolean IsInitialized;
public b4a.example.bctextengine._bcglyph Glyph;
public int SpaceBetweenThisAndNext;
public void Initialize() {
IsInitialized = true;
Glyph = new b4a.example.bctextengine._bcglyph();
SpaceBetweenThisAndNext = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcglyph{
public boolean IsInitialized;
public b4a.example.bitmapcreator._compressedbc cbc;
public int baseline;
public int Width;
public boolean Emoji;
public boolean Empty;
public void Initialize() {
IsInitialized = true;
cbc = new b4a.example.bitmapcreator._compressedbc();
baseline = 0;
Width = 0;
Emoji = false;
Empty = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public String _extra_connectedruns = "";
public String _extra_styledunderline = "";
public b4a.example.bitmapcreator _charbc = null;
public b4a.example.bitmapcreator._internalcompressedbccache _cbccache = null;
public b4a.example.bctextengine._bcstyledunderline _defaultunderlinestyle = null;
public float _mscale = 0f;
public float _mspacebetweencharacters = 0f;
public int _mspacebetweenlines = 0;
public anywheresoftware.b4a.objects.collections.Map _fontmetricscache = null;
public b4a.example.bitmapcreator _foregroundbc = null;
public b4a.example.bitmapcreator _backgroundbc = null;
public int _defaultcolor = 0;
public String _wordboundaries = "";
public String _wordboundariesthatcanconnecttoprevword = "";
public anywheresoftware.b4a.objects.collections.Map _brushes = null;
public b4a.example.bctextengine._bcparagraphstyle _defaultstyle = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _defaultfont = null;
public int _mingapbetweenlines = 0;
public anywheresoftware.b4a.objects.PanelWrapper _stubforcontext = null;
public int _tabwidthmeasuredinx = 0;
public b4a.example.bbcodeparser _tagparser = null;
public b4a.example.bctextengine._bctextchars _emptytextchars = null;
public b4a.example.b4xset _emojis = null;
public String _charset = "";
public boolean _lookforcomplexcharacters = false;
public anywheresoftware.b4a.objects.collections.Map _customfonts = null;
public boolean _kerningenabled = false;
public int _indentwidth = 0;
public b4a.example.b4xset _vowelscodepoints = null;
public b4a.example.b4xorderedmap _asyncbcs = null;
public b4a.example.bitmapcreator _asyncbc = null;
public anywheresoftware.b4a.objects.collections.List _asynctasks = null;
public boolean _asyncmode = false;
public b4a.example.b4xset _rtlchars = null;
public int _textdirectionltr = 0;
public int _textdirectionunknown = 0;
public int _textdirectionrtl = 0;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.bctextengine._bctextchars  _createbctextcharsfromstring(b4a.example.bctextengine __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createbctextcharsfromstring", true))
	 {return ((b4a.example.bctextengine._bctextchars) Debug.delegate(ba, "createbctextcharsfromstring", new Object[] {_s}));}
byte[] _b = null;
String[] _chars = null;
int _i = 0;
int _bi = 0;
boolean _shouldaddtoprevchar = false;
boolean _therearevowels = false;
int _cp = 0;
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Public Sub CreateBCTextCharsFromString (s As Strin";
RDebugUtils.currentLine=15532033;
 //BA.debugLineNum = 15532033;BA.debugLine="Dim b() As Byte = s.GetBytes(Charset)";
_b = _s.getBytes(__ref._charset /*String*/ );
RDebugUtils.currentLine=15532034;
 //BA.debugLineNum = 15532034;BA.debugLine="Dim chars(b.Length / 4) As String";
_chars = new String[(int) (_b.length/(double)4)];
java.util.Arrays.fill(_chars,"");
RDebugUtils.currentLine=15532035;
 //BA.debugLineNum = 15532035;BA.debugLine="Dim i, bi As Int = 0";
_i = 0;
_bi = (int) (0);
RDebugUtils.currentLine=15532036;
 //BA.debugLineNum = 15532036;BA.debugLine="Dim ShouldAddToPrevChar As Boolean";
_shouldaddtoprevchar = false;
RDebugUtils.currentLine=15532037;
 //BA.debugLineNum = 15532037;BA.debugLine="Dim ThereAreVowels As Boolean = VowelsCodePoints.";
_therearevowels = __ref._vowelscodepoints /*b4a.example.b4xset*/ ._getsize /*int*/ (null)>0;
RDebugUtils.currentLine=15532038;
 //BA.debugLineNum = 15532038;BA.debugLine="Do While bi <= chars.Length - 1";
while (_bi<=_chars.length-1) {
RDebugUtils.currentLine=15532039;
 //BA.debugLineNum = 15532039;BA.debugLine="chars(i) = BytesToString(b, bi * 4, 4, Charset)";
_chars[_i] = __c.BytesToString(_b,(int) (_bi*4),(int) (4),__ref._charset /*String*/ );
RDebugUtils.currentLine=15532040;
 //BA.debugLineNum = 15532040;BA.debugLine="If LookForComplexCharacters Then";
if (__ref._lookforcomplexcharacters /*boolean*/ ) { 
RDebugUtils.currentLine=15532041;
 //BA.debugLineNum = 15532041;BA.debugLine="Dim cp As Int = BytesToInt(b, bi * 4)";
_cp = __ref._bytestoint /*int*/ (null,_b,(int) (_bi*4));
RDebugUtils.currentLine=15532042;
 //BA.debugLineNum = 15532042;BA.debugLine="If i > 0 And (cp = 0x200d Or (cp >= 0xFE00 And";
if (_i>0 && (_cp==0x200d || (_cp>=0xfe00 && _cp<=0xfe0f))) { 
RDebugUtils.currentLine=15532043;
 //BA.debugLineNum = 15532043;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
RDebugUtils.currentLine=15532044;
 //BA.debugLineNum = 15532044;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=15532045;
 //BA.debugLineNum = 15532045;BA.debugLine="ShouldAddToPrevChar = True";
_shouldaddtoprevchar = __c.True;
 }else 
{RDebugUtils.currentLine=15532046;
 //BA.debugLineNum = 15532046;BA.debugLine="Else If i > 0 And (cp >= 0x1F3FB And cp <= 0x1F";
if (_i>0 && (_cp>=0x1f3fb && _cp<=0x1f3ff)) { 
RDebugUtils.currentLine=15532047;
 //BA.debugLineNum = 15532047;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
RDebugUtils.currentLine=15532048;
 //BA.debugLineNum = 15532048;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=15532049;
 //BA.debugLineNum = 15532049;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }else 
{RDebugUtils.currentLine=15532050;
 //BA.debugLineNum = 15532050;BA.debugLine="Else If i > 0 And (ThereAreVowels And VowelsCod";
if (_i>0 && (_therearevowels && __ref._vowelscodepoints /*b4a.example.b4xset*/ ._contains /*boolean*/ (null,(Object)(_cp)))) { 
RDebugUtils.currentLine=15532051;
 //BA.debugLineNum = 15532051;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
RDebugUtils.currentLine=15532052;
 //BA.debugLineNum = 15532052;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=15532053;
 //BA.debugLineNum = 15532053;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }else 
{RDebugUtils.currentLine=15532054;
 //BA.debugLineNum = 15532054;BA.debugLine="Else If i > 0 And ShouldAddToPrevChar Then";
if (_i>0 && _shouldaddtoprevchar) { 
RDebugUtils.currentLine=15532055;
 //BA.debugLineNum = 15532055;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
RDebugUtils.currentLine=15532056;
 //BA.debugLineNum = 15532056;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=15532057;
 //BA.debugLineNum = 15532057;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }else {
RDebugUtils.currentLine=15532059;
 //BA.debugLineNum = 15532059;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }}}}
;
 };
RDebugUtils.currentLine=15532062;
 //BA.debugLineNum = 15532062;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
RDebugUtils.currentLine=15532063;
 //BA.debugLineNum = 15532063;BA.debugLine="bi = bi + 1";
_bi = (int) (_bi+1);
 }
;
RDebugUtils.currentLine=15532065;
 //BA.debugLineNum = 15532065;BA.debugLine="Return CreateBCTextChars(chars, 0, i)";
if (true) return __ref._createbctextchars /*b4a.example.bctextengine._bctextchars*/ (null,_chars,(int) (0),_i);
RDebugUtils.currentLine=15532066;
 //BA.debugLineNum = 15532066;BA.debugLine="End Sub";
return null;
}
public b4a.example.bctextengine._bctextrun  _createconnectedparent(b4a.example.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createconnectedparent", true))
	 {return ((b4a.example.bctextengine._bctextrun) Debug.delegate(ba, "createconnectedparent", null));}
b4a.example.bctextengine._bcconnectedruns _connected = null;
b4a.example.bctextengine._bctextrun _parent = null;
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Public Sub CreateConnectedParent As BCTextRun";
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="Dim connected As BCConnectedRuns";
_connected = new b4a.example.bctextengine._bcconnectedruns();
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="connected.Initialize";
_connected.Initialize();
RDebugUtils.currentLine=12517379;
 //BA.debugLineNum = 12517379;BA.debugLine="connected.Runs.Initialize";
_connected.Runs /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=12517380;
 //BA.debugLineNum = 12517380;BA.debugLine="Dim parent As BCTextRun = CreateRun(\"\")";
_parent = __ref._createrun /*b4a.example.bctextengine._bctextrun*/ (null,"");
RDebugUtils.currentLine=12517381;
 //BA.debugLineNum = 12517381;BA.debugLine="parent.Extra.Initialize";
_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=12517382;
 //BA.debugLineNum = 12517382;BA.debugLine="parent.Extra.Put(EXTRA_CONNECTEDRUNS, connected)";
_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._extra_connectedruns /*String*/ ),(Object)(_connected));
RDebugUtils.currentLine=12517383;
 //BA.debugLineNum = 12517383;BA.debugLine="Return parent";
if (true) return _parent;
RDebugUtils.currentLine=12517384;
 //BA.debugLineNum = 12517384;BA.debugLine="End Sub";
return null;
}
public b4a.example.bctextengine._bcfontmetrics  _getfontmetrics(b4a.example.bctextengine __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getfontmetrics", true))
	 {return ((b4a.example.bctextengine._bcfontmetrics) Debug.delegate(ba, "getfontmetrics", new Object[] {_fnt,_clr}));}
String _key = "";
b4a.example.bctextengine._bcfontmetrics _fm = null;
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Public Sub GetFontMetrics(Fnt As B4XFont, clr As I";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="Dim key As String = FontToKey(Fnt, clr)";
_key = __ref._fonttokey /*String*/ (null,_fnt,_clr);
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="If FontMetricsCache.ContainsKey(key) Then Return";
if (__ref._fontmetricscache /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_key))) { 
if (true) return (b4a.example.bctextengine._bcfontmetrics)(__ref._fontmetricscache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key)));};
RDebugUtils.currentLine=14811139;
 //BA.debugLineNum = 14811139;BA.debugLine="Dim fm As BCFontMetrics";
_fm = new b4a.example.bctextengine._bcfontmetrics();
RDebugUtils.currentLine=14811140;
 //BA.debugLineNum = 14811140;BA.debugLine="fm.Initialize";
_fm.Initialize();
RDebugUtils.currentLine=14811141;
 //BA.debugLineNum = 14811141;BA.debugLine="fm.Glyphs.Initialize";
_fm.Glyphs /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=14811142;
 //BA.debugLineNum = 14811142;BA.debugLine="fm.Clr = clr";
_fm.Clr /*int*/  = _clr;
RDebugUtils.currentLine=14811143;
 //BA.debugLineNum = 14811143;BA.debugLine="fm.Fnt = Fnt";
_fm.Fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _fnt;
RDebugUtils.currentLine=14811144;
 //BA.debugLineNum = 14811144;BA.debugLine="If clr = DefaultColor Then";
if (_clr==__ref._defaultcolor /*int*/ ) { 
RDebugUtils.currentLine=14811145;
 //BA.debugLineNum = 14811145;BA.debugLine="fm.KerningTable.Initialize";
_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=14811146;
 //BA.debugLineNum = 14811146;BA.debugLine="fm.DefaultColorMetrics = fm";
_fm.DefaultColorMetrics /*b4a.example.bctextengine._bcfontmetrics*/  = _fm;
RDebugUtils.currentLine=14811147;
 //BA.debugLineNum = 14811147;BA.debugLine="fm.xWidth = CreateGlyph(\"x\", fm, False).Width";
_fm.xWidth /*int*/  = __ref._createglyph /*b4a.example.bctextengine._bcglyph*/ (null,"x",_fm,__c.False).Width /*int*/ ;
 }else {
RDebugUtils.currentLine=14811149;
 //BA.debugLineNum = 14811149;BA.debugLine="fm.DefaultColorMetrics = GetFontMetrics(Fnt, Def";
_fm.DefaultColorMetrics /*b4a.example.bctextengine._bcfontmetrics*/  = __ref._getfontmetrics /*b4a.example.bctextengine._bcfontmetrics*/ (null,_fnt,__ref._defaultcolor /*int*/ );
RDebugUtils.currentLine=14811150;
 //BA.debugLineNum = 14811150;BA.debugLine="fm.xWidth = fm.DefaultColorMetrics.xWidth";
_fm.xWidth /*int*/  = _fm.DefaultColorMetrics /*b4a.example.bctextengine._bcfontmetrics*/ .xWidth /*int*/ ;
RDebugUtils.currentLine=14811151;
 //BA.debugLineNum = 14811151;BA.debugLine="fm.KerningTable = fm.DefaultColorMetrics.Kerning";
_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/  = _fm.DefaultColorMetrics /*b4a.example.bctextengine._bcfontmetrics*/ .KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ ;
 };
RDebugUtils.currentLine=14811153;
 //BA.debugLineNum = 14811153;BA.debugLine="FontMetricsCache.Put(key, fm)";
__ref._fontmetricscache /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_fm));
RDebugUtils.currentLine=14811154;
 //BA.debugLineNum = 14811154;BA.debugLine="Return fm";
if (true) return _fm;
RDebugUtils.currentLine=14811155;
 //BA.debugLineNum = 14811155;BA.debugLine="End Sub";
return null;
}
public b4a.example.bctextengine._bctextrun  _createrun(b4a.example.bctextengine __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createrun", true))
	 {return ((b4a.example.bctextengine._bctextrun) Debug.delegate(ba, "createrun", new Object[] {_text}));}
b4a.example.bctextengine._bctextrun _r = null;
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Public Sub CreateRun (Text As String) As BCTextRun";
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="Dim r As BCTextRun";
_r = new b4a.example.bctextengine._bctextrun();
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="r.Initialize";
_r.Initialize();
RDebugUtils.currentLine=12451843;
 //BA.debugLineNum = 12451843;BA.debugLine="r.BackgroundColor = 0";
_r.BackgroundColor /*int*/  = (int) (0);
RDebugUtils.currentLine=12451844;
 //BA.debugLineNum = 12451844;BA.debugLine="r.CharacterSpacingFactor = 1";
_r.CharacterSpacingFactor /*float*/  = (float) (1);
RDebugUtils.currentLine=12451845;
 //BA.debugLineNum = 12451845;BA.debugLine="r.TextFont = DefaultFont";
_r.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._defaultfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=12451846;
 //BA.debugLineNum = 12451846;BA.debugLine="r.TextChars = CreateBCTextCharsFromString(Text)";
_r.TextChars /*b4a.example.bctextengine._bctextchars*/  = __ref._createbctextcharsfromstring /*b4a.example.bctextengine._bctextchars*/ (null,_text);
RDebugUtils.currentLine=12451847;
 //BA.debugLineNum = 12451847;BA.debugLine="r.Text = Text";
_r.Text /*String*/  = _text;
RDebugUtils.currentLine=12451848;
 //BA.debugLineNum = 12451848;BA.debugLine="r.TextColor = DefaultColor";
_r.TextColor /*int*/  = __ref._defaultcolor /*int*/ ;
RDebugUtils.currentLine=12451849;
 //BA.debugLineNum = 12451849;BA.debugLine="Return r";
if (true) return _r;
RDebugUtils.currentLine=12451850;
 //BA.debugLineNum = 12451850;BA.debugLine="End Sub";
return null;
}
public b4a.example.bctextengine._bctextchars  _createbctextchars(b4a.example.bctextengine __ref,String[] _buffer,int _startindex,int _length) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createbctextchars", true))
	 {return ((b4a.example.bctextengine._bctextchars) Debug.delegate(ba, "createbctextchars", new Object[] {_buffer,_startindex,_length}));}
b4a.example.bctextengine._bctextchars _t1 = null;
RDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Public Sub CreateBCTextChars (Buffer() As String,";
RDebugUtils.currentLine=15597569;
 //BA.debugLineNum = 15597569;BA.debugLine="Dim t1 As BCTextChars";
_t1 = new b4a.example.bctextengine._bctextchars();
RDebugUtils.currentLine=15597570;
 //BA.debugLineNum = 15597570;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=15597571;
 //BA.debugLineNum = 15597571;BA.debugLine="t1.Buffer = Buffer";
_t1.Buffer /*String[]*/  = _buffer;
RDebugUtils.currentLine=15597572;
 //BA.debugLineNum = 15597572;BA.debugLine="t1.StartIndex = StartIndex";
_t1.StartIndex /*int*/  = _startindex;
RDebugUtils.currentLine=15597573;
 //BA.debugLineNum = 15597573;BA.debugLine="t1.Length = Length";
_t1.Length /*int*/  = _length;
RDebugUtils.currentLine=15597574;
 //BA.debugLineNum = 15597574;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=15597575;
 //BA.debugLineNum = 15597575;BA.debugLine="End Sub";
return null;
}
public b4a.example.bctextengine._bcsinglestylesection  _findsinglestylesection(b4a.example.bctextengine __ref,b4a.example.bctextengine._bcparagraph _paragraph,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "findsinglestylesection", true))
	 {return ((b4a.example.bctextengine._bcsinglestylesection) Debug.delegate(ba, "findsinglestylesection", new Object[] {_paragraph,_x,_y}));}
b4a.example.bctextengine._bctextline _line = null;
b4a.example.bctextengine._bcunbreakabletext _un = null;
b4a.example.bctextengine._bcsinglestylesection _s = null;
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Public Sub FindSingleStyleSection (Paragraph As BC";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="x = x * mScale";
_x = (int) (_x*__ref._mscale /*float*/ );
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="y = y * mScale";
_y = (int) (_y*__ref._mscale /*float*/ );
RDebugUtils.currentLine=14614531;
 //BA.debugLineNum = 14614531;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group3 = _paragraph.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_line = (b4a.example.bctextengine._bctextline)(group3.Get(index3));
RDebugUtils.currentLine=14614533;
 //BA.debugLineNum = 14614533;BA.debugLine="If line.BaseLineY - line.MaxHeightAboveBaseLine";
if (_line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ <=_y && _line.BaselineY /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ >=_y) { 
RDebugUtils.currentLine=14614534;
 //BA.debugLineNum = 14614534;BA.debugLine="For Each un As BCUnbreakableText In line.Unbrea";
{
final anywheresoftware.b4a.BA.IterableList group5 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_un = (b4a.example.bctextengine._bcunbreakabletext)(group5.Get(index5));
RDebugUtils.currentLine=14614535;
 //BA.debugLineNum = 14614535;BA.debugLine="If (Paragraph.Style.RTL = False And line.Start";
if ((_paragraph.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/ ==__c.False && _line.StartX /*int*/ +_un.StartX /*int*/ <=_x && _line.StartX /*int*/ +_un.StartX /*int*/ +_un.Width /*int*/ >=_x) || (_paragraph.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/  && _line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ <=_y && _line.BaselineY /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ >=_y)) { 
RDebugUtils.currentLine=14614537;
 //BA.debugLineNum = 14614537;BA.debugLine="For Each s As BCSingleStyleSection In un.Sing";
{
final anywheresoftware.b4a.BA.IterableList group7 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_s = (b4a.example.bctextengine._bcsinglestylesection)(group7.Get(index7));
RDebugUtils.currentLine=14614538;
 //BA.debugLineNum = 14614538;BA.debugLine="If s.AbsoluteStartX <= x And s.AbsoluteStart";
if (_s.AbsoluteStartX /*int*/ <=_x && _s.AbsoluteStartX /*int*/ +_s.Width /*int*/ >=_x) { 
if (true) return _s;};
 }
};
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=14614544;
 //BA.debugLineNum = 14614544;BA.debugLine="Return Null";
if (true) return (b4a.example.bctextengine._bcsinglestylesection)(__c.Null);
RDebugUtils.currentLine=14614545;
 //BA.debugLineNum = 14614545;BA.debugLine="End Sub";
return null;
}
public String  _drawsingleline(b4a.example.bctextengine __ref,b4a.example.bctextengine._bctextline _line,anywheresoftware.b4a.objects.B4XViewWrapper _iv,b4a.example.bctextengine._bcparagraph _par) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawsingleline", true))
	 {return ((String) Debug.delegate(ba, "drawsingleline", new Object[] {_line,_iv,_par}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Public Sub DrawSingleLine (line As BCTextLine, iv";
RDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="Dim r As B4XRect = DrawSingleLineShared(line, iv,";
_r = __ref._drawsinglelineshared /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ (null,_line,_iv,_par);
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="If r.Width > 0 And r.Height > 0 Then";
if (_r.getWidth()>0 && _r.getHeight()>0) { 
RDebugUtils.currentLine=13959171;
 //BA.debugLineNum = 13959171;BA.debugLine="ForegroundBC.DrawRect2(r, GetBrush(xui.Color_Tra";
__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._drawrect2(_r,__ref._getbrush /*b4a.example.bcpath._bcbrush*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent),__c.True,(int) (0));
RDebugUtils.currentLine=13959172;
 //BA.debugLineNum = 13959172;BA.debugLine="DrawLine(line, line.MaxHeightAboveBaseLine)";
__ref._drawline /*String*/ (null,_line,_line.MaxHeightAboveBaseLine /*int*/ );
RDebugUtils.currentLine=13959173;
 //BA.debugLineNum = 13959173;BA.debugLine="ForegroundBC.SetBitmapToImageView(ForegroundBC.B";
__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._setbitmaptoimageview(__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._getbitmap().Crop((int) (0),(int) (0),(int) (_r.getWidth()),(int) (_r.getHeight())),_iv);
 };
RDebugUtils.currentLine=13959175;
 //BA.debugLineNum = 13959175;BA.debugLine="End Sub";
return "";
}
public b4a.example.bctextengine._bcparagraphstyle  _createstyle(b4a.example.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createstyle", true))
	 {return ((b4a.example.bctextengine._bcparagraphstyle) Debug.delegate(ba, "createstyle", null));}
b4a.example.bctextengine._bcparagraphstyle _s = null;
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Public Sub CreateStyle As BCParagraphStyle";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="Dim s As BCParagraphStyle";
_s = new b4a.example.bctextengine._bcparagraphstyle();
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="s.Initialize";
_s.Initialize();
RDebugUtils.currentLine=12386307;
 //BA.debugLineNum = 12386307;BA.debugLine="s.LineSpacingFactor = 1";
_s.LineSpacingFactor /*float*/  = (float) (1);
RDebugUtils.currentLine=12386308;
 //BA.debugLineNum = 12386308;BA.debugLine="s.HorizontalAlignment = \"Left\"";
_s.HorizontalAlignment /*String*/  = "Left";
RDebugUtils.currentLine=12386309;
 //BA.debugLineNum = 12386309;BA.debugLine="s.MaxWidth = 300dip";
_s.MaxWidth /*int*/  = __c.DipToCurrent((int) (300));
RDebugUtils.currentLine=12386310;
 //BA.debugLineNum = 12386310;BA.debugLine="s.Padding.Initialize(5dip, 5dip, 5dip, 5dip)";
_s.Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))));
RDebugUtils.currentLine=12386311;
 //BA.debugLineNum = 12386311;BA.debugLine="s.WordWrap = True";
_s.WordWrap /*boolean*/  = __c.True;
RDebugUtils.currentLine=12386312;
 //BA.debugLineNum = 12386312;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=12386313;
 //BA.debugLineNum = 12386313;BA.debugLine="End Sub";
return null;
}
public b4a.example.bctextengine._bcparagraph  _prepareforlazydrawing(b4a.example.bctextengine __ref,anywheresoftware.b4a.objects.collections.List _runs,b4a.example.bctextengine._bcparagraphstyle _style,anywheresoftware.b4a.objects.B4XViewWrapper _sv) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "prepareforlazydrawing", true))
	 {return ((b4a.example.bctextengine._bcparagraph) Debug.delegate(ba, "prepareforlazydrawing", new Object[] {_runs,_style,_sv}));}
b4a.example.bctextengine._bcparagraph _par = null;
int _maxheight = 0;
b4a.example.bctextengine._bctextline _line = null;
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Public Sub PrepareForLazyDrawing (Runs As List, St";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="Dim par As BCParagraph = Prepare(Runs, Style)";
_par = __ref._prepare /*b4a.example.bctextengine._bcparagraph*/ (null,_runs,_style);
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="sv.ScrollViewContentHeight = Max(sv.Height - 2dip";
_sv.setScrollViewContentHeight((int) (__c.Max(_sv.getHeight()-__c.DipToCurrent((int) (2)),_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getBottom()+_par.Height /*int*/ /(double)__ref._mscale /*float*/ )));
RDebugUtils.currentLine=12648451;
 //BA.debugLineNum = 12648451;BA.debugLine="Dim MaxHeight As Int";
_maxheight = 0;
RDebugUtils.currentLine=12648452;
 //BA.debugLineNum = 12648452;BA.debugLine="For Each line As BCTextLine In par.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group4 = _par.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_line = (b4a.example.bctextengine._bctextline)(group4.Get(index4));
RDebugUtils.currentLine=12648453;
 //BA.debugLineNum = 12648453;BA.debugLine="MaxHeight = Max(MaxHeight, line.MaxHeightAboveBa";
_maxheight = (int) (__c.Max(_maxheight,_line.MaxHeightAboveBaseLine /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ ));
 }
};
RDebugUtils.currentLine=12648455;
 //BA.debugLineNum = 12648455;BA.debugLine="ResizeLayers(par.Width / mScale, MaxHeight / mSca";
__ref._resizelayers /*String*/ (null,(int) (_par.Width /*int*/ /(double)__ref._mscale /*float*/ ),(int) (_maxheight/(double)__ref._mscale /*float*/ ));
RDebugUtils.currentLine=12648456;
 //BA.debugLineNum = 12648456;BA.debugLine="AddParagraphViews(par)";
__ref._addparagraphviews /*String*/ (null,_par);
RDebugUtils.currentLine=12648457;
 //BA.debugLineNum = 12648457;BA.debugLine="Return par";
if (true) return _par;
RDebugUtils.currentLine=12648458;
 //BA.debugLineNum = 12648458;BA.debugLine="End Sub";
return null;
}
public b4a.example.bctextengine._bcparagraph  _drawtext(b4a.example.bctextengine __ref,anywheresoftware.b4a.objects.collections.List _runs,b4a.example.bctextengine._bcparagraphstyle _style,anywheresoftware.b4a.objects.B4XViewWrapper _foregroundimageview,anywheresoftware.b4a.objects.B4XViewWrapper _sv) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawtext", true))
	 {return ((b4a.example.bctextengine._bcparagraph) Debug.delegate(ba, "drawtext", new Object[] {_runs,_style,_foregroundimageview,_sv}));}
b4a.example.bctextengine._bcparagraph _par = null;
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Public Sub DrawText (Runs As List, Style As BCPara";
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="Dim par As BCParagraph = Prepare(Runs, Style)";
_par = __ref._prepare /*b4a.example.bctextengine._bcparagraph*/ (null,_runs,_style);
RDebugUtils.currentLine=12713988;
 //BA.debugLineNum = 12713988;BA.debugLine="ResizeLayers(par.Width / mScale, par.Height / mSc";
__ref._resizelayers /*String*/ (null,(int) (_par.Width /*int*/ /(double)__ref._mscale /*float*/ ),(int) (_par.Height /*int*/ /(double)__ref._mscale /*float*/ ));
RDebugUtils.currentLine=12713989;
 //BA.debugLineNum = 12713989;BA.debugLine="DrawParagraph(par)";
__ref._drawparagraph /*String*/ (null,_par);
RDebugUtils.currentLine=12713990;
 //BA.debugLineNum = 12713990;BA.debugLine="If par.Width > 0 And par.Height > 0 Then";
if (_par.Width /*int*/ >0 && _par.Height /*int*/ >0) { 
RDebugUtils.currentLine=12713991;
 //BA.debugLineNum = 12713991;BA.debugLine="ResizeImageView(ForegroundBC, par, ForegroundIma";
__ref._resizeimageview /*String*/ (null,__ref._foregroundbc /*b4a.example.bitmapcreator*/ ,_par,_foregroundimageview,_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .ResizeHeightAutomatically /*boolean*/ );
 };
RDebugUtils.currentLine=12713993;
 //BA.debugLineNum = 12713993;BA.debugLine="If par.Style.ResizeHeightAutomatically And sv.IsI";
if (_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .ResizeHeightAutomatically /*boolean*/  && _sv.IsInitialized()) { 
RDebugUtils.currentLine=12713994;
 //BA.debugLineNum = 12713994;BA.debugLine="sv.ScrollViewContentHeight = Max(sv.Height - 2di";
_sv.setScrollViewContentHeight((int) (__c.Max(_sv.getHeight()-__c.DipToCurrent((int) (2)),_foregroundimageview.getHeight()+_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getBottom())));
 };
RDebugUtils.currentLine=12713996;
 //BA.debugLineNum = 12713996;BA.debugLine="AddParagraphViews(par)";
__ref._addparagraphviews /*String*/ (null,_par);
RDebugUtils.currentLine=12713997;
 //BA.debugLineNum = 12713997;BA.debugLine="Return par";
if (true) return _par;
RDebugUtils.currentLine=12713998;
 //BA.debugLineNum = 12713998;BA.debugLine="End Sub";
return null;
}
public String  _addltritems(b4a.example.bctextengine __ref,anywheresoftware.b4a.objects.collections.List _ltrlist,anywheresoftware.b4a.objects.collections.List _newlist) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "addltritems", true))
	 {return ((String) Debug.delegate(ba, "addltritems", new Object[] {_ltrlist,_newlist}));}
int _startindex = 0;
int _lastindex = 0;
b4a.example.bctextengine._bcunbreakabletext _lastun = null;
b4a.example.bctextengine._bcunbreakabletext _prev = null;
int _i = 0;
b4a.example.bctextengine._bcunbreakabletext _un = null;
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Private Sub AddLTRItems (LTRList As List, NewList";
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="If LTRList.Size = 0 Then Return";
if (_ltrlist.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="NewList.AddAll(LTRList)";
_newlist.AddAll(_ltrlist);
RDebugUtils.currentLine=13041667;
 //BA.debugLineNum = 13041667;BA.debugLine="If LTRList.Size > 1 Then";
if (_ltrlist.getSize()>1) { 
RDebugUtils.currentLine=13041668;
 //BA.debugLineNum = 13041668;BA.debugLine="Dim StartIndex As Int = 1";
_startindex = (int) (1);
RDebugUtils.currentLine=13041669;
 //BA.debugLineNum = 13041669;BA.debugLine="If IsUNSeparator(LTRList.Get(0)) Then";
if (__ref._isunseparator /*boolean*/ (null,(b4a.example.bctextengine._bcunbreakabletext)(_ltrlist.Get((int) (0))))) { 
RDebugUtils.currentLine=13041670;
 //BA.debugLineNum = 13041670;BA.debugLine="StartIndex = 2";
_startindex = (int) (2);
 };
RDebugUtils.currentLine=13041672;
 //BA.debugLineNum = 13041672;BA.debugLine="Dim LastIndex As Int = LTRList.Size - 1";
_lastindex = (int) (_ltrlist.getSize()-1);
RDebugUtils.currentLine=13041673;
 //BA.debugLineNum = 13041673;BA.debugLine="If LastIndex > StartIndex Then";
if (_lastindex>_startindex) { 
RDebugUtils.currentLine=13041674;
 //BA.debugLineNum = 13041674;BA.debugLine="If IsUNSeparator(LTRList.Get(LastIndex)) Then";
if (__ref._isunseparator /*boolean*/ (null,(b4a.example.bctextengine._bcunbreakabletext)(_ltrlist.Get(_lastindex)))) { 
RDebugUtils.currentLine=13041675;
 //BA.debugLineNum = 13041675;BA.debugLine="LastIndex = LastIndex - 1";
_lastindex = (int) (_lastindex-1);
 };
 };
RDebugUtils.currentLine=13041678;
 //BA.debugLineNum = 13041678;BA.debugLine="If LastIndex > StartIndex Then";
if (_lastindex>_startindex) { 
RDebugUtils.currentLine=13041679;
 //BA.debugLineNum = 13041679;BA.debugLine="Dim lastun As BCUnbreakableText = LTRList.Get(L";
_lastun = (b4a.example.bctextengine._bcunbreakabletext)(_ltrlist.Get(_lastindex));
RDebugUtils.currentLine=13041680;
 //BA.debugLineNum = 13041680;BA.debugLine="Dim prev As BCUnbreakableText = LTRList.Get(Sta";
_prev = (b4a.example.bctextengine._bcunbreakabletext)(_ltrlist.Get((int) (_startindex-1)));
RDebugUtils.currentLine=13041681;
 //BA.debugLineNum = 13041681;BA.debugLine="prev.StartX = lastun.StartX";
_prev.StartX /*int*/  = _lastun.StartX /*int*/ ;
RDebugUtils.currentLine=13041682;
 //BA.debugLineNum = 13041682;BA.debugLine="For i = StartIndex To LastIndex";
{
final int step18 = 1;
final int limit18 = _lastindex;
_i = _startindex ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=13041683;
 //BA.debugLineNum = 13041683;BA.debugLine="Dim un As BCUnbreakableText = LTRList.Get(i)";
_un = (b4a.example.bctextengine._bcunbreakabletext)(_ltrlist.Get(_i));
RDebugUtils.currentLine=13041684;
 //BA.debugLineNum = 13041684;BA.debugLine="un.StartX = prev.StartX + prev.Width + mSpaceB";
_un.StartX /*int*/  = (int) (_prev.StartX /*int*/ +_prev.Width /*int*/ +__ref._mspacebetweencharacters /*float*/ );
RDebugUtils.currentLine=13041685;
 //BA.debugLineNum = 13041685;BA.debugLine="prev = un";
_prev = _un;
 }
};
 };
 };
RDebugUtils.currentLine=13041689;
 //BA.debugLineNum = 13041689;BA.debugLine="LTRList.Clear";
_ltrlist.Clear();
RDebugUtils.currentLine=13041690;
 //BA.debugLineNum = 13041690;BA.debugLine="End Sub";
return "";
}
public boolean  _isunseparator(b4a.example.bctextengine __ref,b4a.example.bctextengine._bcunbreakabletext _un) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "isunseparator", true))
	 {return ((Boolean) Debug.delegate(ba, "isunseparator", new Object[] {_un}));}
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Private Sub IsUNSeparator (un As BCUnbreakableText";
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="If un.NotFullTextChars.Length = 0 Then Return Fal";
if (_un.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ .Length /*int*/ ==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="Return WordBoundaries.Contains(un.NotFullTextChar";
if (true) return __ref._wordboundaries /*String*/ .contains(_un.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ .Buffer /*String[]*/ [_un.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ .StartIndex /*int*/ ]);
RDebugUtils.currentLine=13107203;
 //BA.debugLineNum = 13107203;BA.debugLine="End Sub";
return false;
}
public String  _addparagraphviews(b4a.example.bctextengine __ref,b4a.example.bctextengine._bcparagraph _par) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "addparagraphviews", true))
	 {return ((String) Debug.delegate(ba, "addparagraphviews", new Object[] {_par}));}
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Public Sub AddParagraphViews (par As BCParagraph)";
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="If par.Views.IsInitialized Then";
if (_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="For Each v As B4XView In par.Views";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = _par.Views /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group2.Get(index2)));
RDebugUtils.currentLine=12779523;
 //BA.debugLineNum = 12779523;BA.debugLine="v.SetLayoutAnimated(0, par.Style.Padding.Left +";
_v.SetLayoutAnimated((int) (0),(int) (_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()+_v.getLeft()),(int) (_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+_v.getTop()),_v.getWidth(),_v.getHeight());
 }
};
 };
RDebugUtils.currentLine=12779526;
 //BA.debugLineNum = 12779526;BA.debugLine="End Sub";
return "";
}
public int  _bytestoint(b4a.example.bctextengine __ref,byte[] _bytes,int _startindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "bytestoint", true))
	 {return ((Integer) Debug.delegate(ba, "bytestoint", new Object[] {_bytes,_startindex}));}
int _cp = 0;
int _i = 0;
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Private Sub BytesToInt (Bytes() As Byte, StartInde";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="Dim cp As Int";
_cp = 0;
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="For i = 0 To 3";
{
final int step2 = 1;
final int limit2 = (int) (3);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=14942211;
 //BA.debugLineNum = 14942211;BA.debugLine="cp = Bit.Or(cp, Bit.ShiftLeft(Bit.And(0xff, Byte";
_cp = __c.Bit.Or(_cp,__c.Bit.ShiftLeft(__c.Bit.And((int) (0xff),(int) (_bytes[(int) (_i+_startindex)])),(int) (8*_i)));
 }
};
RDebugUtils.currentLine=14942213;
 //BA.debugLineNum = 14942213;BA.debugLine="Return cp";
if (true) return _cp;
RDebugUtils.currentLine=14942214;
 //BA.debugLineNum = 14942214;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4a.example.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="Public cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="Type BCFontMetrics (Glyphs As Map, DefaultColorMe";
;
RDebugUtils.currentLine=12189701;
 //BA.debugLineNum = 12189701;BA.debugLine="Type BCTextChars (Buffer() As String, StartIndex";
;
RDebugUtils.currentLine=12189703;
 //BA.debugLineNum = 12189703;BA.debugLine="Type BCParagraphStyle (HorizontalAlignment As Str";
;
RDebugUtils.currentLine=12189704;
 //BA.debugLineNum = 12189704;BA.debugLine="Type BCTextRun (TextFont As B4XFont, TextColor As";
;
RDebugUtils.currentLine=12189707;
 //BA.debugLineNum = 12189707;BA.debugLine="Type BCConnectedRuns (ConnectedWidth As Int, Runs";
;
RDebugUtils.currentLine=12189708;
 //BA.debugLineNum = 12189708;BA.debugLine="Type BCStyledUnderline (Clr As Int, Style As Stri";
;
RDebugUtils.currentLine=12189709;
 //BA.debugLineNum = 12189709;BA.debugLine="Public const EXTRA_CONNECTEDRUNS = \"ConnectedRuns";
_extra_connectedruns = "ConnectedRuns";
_extra_styledunderline = "StyledUnderline";
RDebugUtils.currentLine=12189712;
 //BA.debugLineNum = 12189712;BA.debugLine="Type BCParagraph (TextLines As List, CurrentLine";
;
RDebugUtils.currentLine=12189715;
 //BA.debugLineNum = 12189715;BA.debugLine="Type BCTextLine (StartX As Int, BaselineY As Int,";
;
RDebugUtils.currentLine=12189717;
 //BA.debugLineNum = 12189717;BA.debugLine="Type BCUnbreakableText (Width As Int, StartX As I";
;
RDebugUtils.currentLine=12189719;
 //BA.debugLineNum = 12189719;BA.debugLine="Type BCSingleStyleSection (AbsoluteStartX As Int,";
;
RDebugUtils.currentLine=12189721;
 //BA.debugLineNum = 12189721;BA.debugLine="Type BCGlyphAndOffset (Glyph As BCGlyph, SpaceBet";
;
RDebugUtils.currentLine=12189722;
 //BA.debugLineNum = 12189722;BA.debugLine="Type BCGlyph (cbc As CompressedBC, baseline As In";
;
RDebugUtils.currentLine=12189723;
 //BA.debugLineNum = 12189723;BA.debugLine="Private CharBC As BitmapCreator";
_charbc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=12189724;
 //BA.debugLineNum = 12189724;BA.debugLine="Private cbccache As InternalCompressedBCCache";
_cbccache = new b4a.example.bitmapcreator._internalcompressedbccache();
RDebugUtils.currentLine=12189725;
 //BA.debugLineNum = 12189725;BA.debugLine="Public DefaultUnderlineStyle As BCStyledUnderline";
_defaultunderlinestyle = new b4a.example.bctextengine._bcstyledunderline();
RDebugUtils.currentLine=12189726;
 //BA.debugLineNum = 12189726;BA.debugLine="Public mScale As Float = 1";
_mscale = (float) (1);
RDebugUtils.currentLine=12189727;
 //BA.debugLineNum = 12189727;BA.debugLine="Private mSpaceBetweenCharacters As Float";
_mspacebetweencharacters = 0f;
RDebugUtils.currentLine=12189728;
 //BA.debugLineNum = 12189728;BA.debugLine="Private mSpaceBetweenLines As Int";
_mspacebetweenlines = 0;
RDebugUtils.currentLine=12189729;
 //BA.debugLineNum = 12189729;BA.debugLine="Private FontMetricsCache As Map";
_fontmetricscache = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=12189730;
 //BA.debugLineNum = 12189730;BA.debugLine="Private ForegroundBC, BackgroundBC As BitmapCreat";
_foregroundbc = new b4a.example.bitmapcreator();
_backgroundbc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=12189731;
 //BA.debugLineNum = 12189731;BA.debugLine="Public DefaultColor As Int = xui.Color_Black";
_defaultcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=12189732;
 //BA.debugLineNum = 12189732;BA.debugLine="Public WordBoundaries As String = \"&*+-/.<>=\\' ,:";
_wordboundaries = "&*+-/.<>=\\' ,:{}"+__c.TAB+__c.CRLF+BA.ObjectToString(__c.Chr((int) (13)));
RDebugUtils.currentLine=12189733;
 //BA.debugLineNum = 12189733;BA.debugLine="Public WordBoundariesThatCanConnectToPrevWord As";
_wordboundariesthatcanconnecttoprevword = ".,:";
RDebugUtils.currentLine=12189734;
 //BA.debugLineNum = 12189734;BA.debugLine="Private Brushes As Map";
_brushes = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=12189735;
 //BA.debugLineNum = 12189735;BA.debugLine="Public DefaultStyle As BCParagraphStyle";
_defaultstyle = new b4a.example.bctextengine._bcparagraphstyle();
RDebugUtils.currentLine=12189736;
 //BA.debugLineNum = 12189736;BA.debugLine="Public DefaultFont As B4XFont";
_defaultfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=12189737;
 //BA.debugLineNum = 12189737;BA.debugLine="Private MinGapBetweenLines As Int = 5dip";
_mingapbetweenlines = __c.DipToCurrent((int) (5));
RDebugUtils.currentLine=12189739;
 //BA.debugLineNum = 12189739;BA.debugLine="Private stubForContext As Panel 'ignore";
_stubforcontext = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=12189744;
 //BA.debugLineNum = 12189744;BA.debugLine="Private const TabWidthMeasuredInX As Int = 4";
_tabwidthmeasuredinx = (int) (4);
RDebugUtils.currentLine=12189745;
 //BA.debugLineNum = 12189745;BA.debugLine="Public TagParser As BBCodeParser";
_tagparser = new b4a.example.bbcodeparser();
RDebugUtils.currentLine=12189746;
 //BA.debugLineNum = 12189746;BA.debugLine="Private EmptyTextChars As BCTextChars";
_emptytextchars = new b4a.example.bctextengine._bctextchars();
RDebugUtils.currentLine=12189747;
 //BA.debugLineNum = 12189747;BA.debugLine="Private Emojis As B4XSet";
_emojis = new b4a.example.b4xset();
RDebugUtils.currentLine=12189748;
 //BA.debugLineNum = 12189748;BA.debugLine="Public const Charset As String = \"UTF-32LE\"";
_charset = "UTF-32LE";
RDebugUtils.currentLine=12189749;
 //BA.debugLineNum = 12189749;BA.debugLine="Public LookForComplexCharacters As Boolean = True";
_lookforcomplexcharacters = __c.True;
RDebugUtils.currentLine=12189750;
 //BA.debugLineNum = 12189750;BA.debugLine="Public CustomFonts As Map";
_customfonts = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=12189751;
 //BA.debugLineNum = 12189751;BA.debugLine="Public KerningEnabled As Boolean = True";
_kerningenabled = __c.True;
RDebugUtils.currentLine=12189752;
 //BA.debugLineNum = 12189752;BA.debugLine="Private IndentWidth As Int";
_indentwidth = 0;
RDebugUtils.currentLine=12189753;
 //BA.debugLineNum = 12189753;BA.debugLine="Public VowelsCodePoints As B4XSet";
_vowelscodepoints = new b4a.example.b4xset();
RDebugUtils.currentLine=12189754;
 //BA.debugLineNum = 12189754;BA.debugLine="Private AsyncBCs As B4XOrderedMap";
_asyncbcs = new b4a.example.b4xorderedmap();
RDebugUtils.currentLine=12189755;
 //BA.debugLineNum = 12189755;BA.debugLine="Private AsyncBC As BitmapCreator";
_asyncbc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=12189756;
 //BA.debugLineNum = 12189756;BA.debugLine="Private AsyncTasks As List";
_asynctasks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12189757;
 //BA.debugLineNum = 12189757;BA.debugLine="Private AsyncMode As Boolean";
_asyncmode = false;
RDebugUtils.currentLine=12189758;
 //BA.debugLineNum = 12189758;BA.debugLine="Private RTLChars As B4XSet";
_rtlchars = new b4a.example.b4xset();
RDebugUtils.currentLine=12189759;
 //BA.debugLineNum = 12189759;BA.debugLine="Public Const TextDirectionLTR = 1, TextDirectionU";
_textdirectionltr = (int) (1);
_textdirectionunknown = (int) (0);
_textdirectionrtl = (int) (-1);
RDebugUtils.currentLine=12189760;
 //BA.debugLineNum = 12189760;BA.debugLine="End Sub";
return "";
}
public b4a.example.bctextengine._bcglyph  _createglyph(b4a.example.bctextengine __ref,String _c,b4a.example.bctextengine._bcfontmetrics _fontmetrics,boolean _justmeasure) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createglyph", true))
	 {return ((b4a.example.bctextengine._bcglyph) Debug.delegate(ba, "createglyph", new Object[] {_c,_fontmetrics,_justmeasure}));}
b4a.example.bctextengine._bcglyph _g = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
int _leftoffset = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r2 = null;
b4a.example.bitmapcreator._compressedbc _cbc = null;
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Private Sub CreateGlyph (c As String, FontMetrics";
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="Dim g As BCGlyph = FontMetrics.Glyphs.Get(c)";
_g = (b4a.example.bctextengine._bcglyph)(_fontmetrics.Glyphs /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_c)));
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="If g <> Null Then Return g";
if (_g!= null) { 
if (true) return _g;};
RDebugUtils.currentLine=14876675;
 //BA.debugLineNum = 14876675;BA.debugLine="If FontMetrics.clr <> DefaultColor Then";
if (_fontmetrics.Clr /*int*/ !=__ref._defaultcolor /*int*/ ) { 
RDebugUtils.currentLine=14876676;
 //BA.debugLineNum = 14876676;BA.debugLine="Return CreateGlyphFromDefaultColor(c, FontMetric";
if (true) return __ref._createglyphfromdefaultcolor /*b4a.example.bctextengine._bcglyph*/ (null,_c,_fontmetrics.DefaultColorMetrics /*b4a.example.bctextengine._bcfontmetrics*/ ,_fontmetrics.Clr /*int*/ );
 }else {
RDebugUtils.currentLine=14876678;
 //BA.debugLineNum = 14876678;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=14876679;
 //BA.debugLineNum = 14876679;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(c, FontMetric";
_r = __ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(_c,_fontmetrics.Fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=14876680;
 //BA.debugLineNum = 14876680;BA.debugLine="Dim BaseLine As Int = -r.Top + 5";
_baseline = (int) (-_r.getTop()+5);
RDebugUtils.currentLine=14876681;
 //BA.debugLineNum = 14876681;BA.debugLine="r.Left = r.Left * mScale";
_r.setLeft((float) (_r.getLeft()*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=14876682;
 //BA.debugLineNum = 14876682;BA.debugLine="r.Top = r.Top * mScale";
_r.setTop((float) (_r.getTop()*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=14876683;
 //BA.debugLineNum = 14876683;BA.debugLine="r.Right = r.Right * mScale";
_r.setRight((float) (_r.getRight()*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=14876684;
 //BA.debugLineNum = 14876684;BA.debugLine="r.Bottom = r.Bottom * mScale";
_r.setBottom((float) (_r.getBottom()*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=14876685;
 //BA.debugLineNum = 14876685;BA.debugLine="If CharBC.mWidth < r.Width + 20 * mScale Or Char";
if (__ref._charbc /*b4a.example.bitmapcreator*/ ._mwidth<_r.getWidth()+20*__ref._mscale /*float*/  || __ref._charbc /*b4a.example.bitmapcreator*/ ._mheight<_r.getHeight()+20*__ref._mscale /*float*/ ) { 
RDebugUtils.currentLine=14876686;
 //BA.debugLineNum = 14876686;BA.debugLine="ResizeCharBC(r.Width + 30 * mScale, r.Height +";
__ref._resizecharbc /*String*/ (null,(int) (_r.getWidth()+30*__ref._mscale /*float*/ ),(int) (_r.getHeight()+30*__ref._mscale /*float*/ ));
 };
RDebugUtils.currentLine=14876689;
 //BA.debugLineNum = 14876689;BA.debugLine="Dim leftOffset As Int = 5";
_leftoffset = (int) (5);
RDebugUtils.currentLine=14876690;
 //BA.debugLineNum = 14876690;BA.debugLine="cvs.DrawText(c, leftOffset, BaseLine, FontMetric";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(ba,_c,(float) (_leftoffset),(float) (_baseline),_fontmetrics.Fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_fontmetrics.Clr /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
RDebugUtils.currentLine=14876692;
 //BA.debugLineNum = 14876692;BA.debugLine="Dim bmp As B4XBitmap = cvs.CreateBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = __ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .CreateBitmap();
RDebugUtils.currentLine=14876703;
 //BA.debugLineNum = 14876703;BA.debugLine="CharBC.CopyPixelsFromBitmap(bmp)";
__ref._charbc /*b4a.example.bitmapcreator*/ ._copypixelsfrombitmap(_bmp);
RDebugUtils.currentLine=14876704;
 //BA.debugLineNum = 14876704;BA.debugLine="Dim r2 As B4XRect = FindMinRect(leftOffset + r.R";
_r2 = __ref._findminrect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ (null,(int) (_leftoffset+_r.getRight()+20*__ref._mscale /*float*/ ),(int) (_r.getHeight()+20*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=14876705;
 //BA.debugLineNum = 14876705;BA.debugLine="Dim g As BCGlyph";
_g = new b4a.example.bctextengine._bcglyph();
RDebugUtils.currentLine=14876706;
 //BA.debugLineNum = 14876706;BA.debugLine="g.Initialize";
_g.Initialize();
RDebugUtils.currentLine=14876707;
 //BA.debugLineNum = 14876707;BA.debugLine="g.baseline = BaseLine * mScale - r2.Top";
_g.baseline /*int*/  = (int) (_baseline*__ref._mscale /*float*/ -_r2.getTop());
RDebugUtils.currentLine=14876708;
 //BA.debugLineNum = 14876708;BA.debugLine="If r2.Width > 0 Then";
if (_r2.getWidth()>0) { 
RDebugUtils.currentLine=14876709;
 //BA.debugLineNum = 14876709;BA.debugLine="r2.Left = Floor(r2.Left)";
_r2.setLeft((float) (__c.Floor(_r2.getLeft())));
RDebugUtils.currentLine=14876710;
 //BA.debugLineNum = 14876710;BA.debugLine="r2.Right = Ceil(r2.Right)";
_r2.setRight((float) (__c.Ceil(_r2.getRight())));
RDebugUtils.currentLine=14876716;
 //BA.debugLineNum = 14876716;BA.debugLine="Dim cbc As CompressedBC = CharBC.ExtractCompres";
_cbc = __ref._charbc /*b4a.example.bitmapcreator*/ ._extractcompressedbc(_r2,__ref._cbccache /*b4a.example.bitmapcreator._internalcompressedbccache*/ );
RDebugUtils.currentLine=14876717;
 //BA.debugLineNum = 14876717;BA.debugLine="g.cbc = cbc";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/  = _cbc;
RDebugUtils.currentLine=14876718;
 //BA.debugLineNum = 14876718;BA.debugLine="g.width = cbc.mWidth";
_g.Width /*int*/  = _cbc.mWidth;
 }else {
RDebugUtils.currentLine=14876720;
 //BA.debugLineNum = 14876720;BA.debugLine="g.Empty = True";
_g.Empty /*boolean*/  = __c.True;
RDebugUtils.currentLine=14876721;
 //BA.debugLineNum = 14876721;BA.debugLine="If c = TAB Then";
if ((_c).equals(__c.TAB)) { 
RDebugUtils.currentLine=14876722;
 //BA.debugLineNum = 14876722;BA.debugLine="g.Width = FontMetrics.xWidth * TabWidthMeasure";
_g.Width /*int*/  = (int) (_fontmetrics.xWidth /*int*/ *__ref._tabwidthmeasuredinx /*int*/ );
 }else 
{RDebugUtils.currentLine=14876723;
 //BA.debugLineNum = 14876723;BA.debugLine="Else if c = \" \" Then";
if ((_c).equals(" ")) { 
RDebugUtils.currentLine=14876724;
 //BA.debugLineNum = 14876724;BA.debugLine="g.width = CreateGlyph(\"x x\", FontMetrics, True";
_g.Width /*int*/  = (int) (__ref._createglyph /*b4a.example.bctextengine._bcglyph*/ (null,"x x",_fontmetrics,__c.True).Width /*int*/ -_fontmetrics.xWidth /*int*/ *2);
 }else 
{RDebugUtils.currentLine=14876725;
 //BA.debugLineNum = 14876725;BA.debugLine="Else If c = \"x\" Then";
if ((_c).equals("x")) { 
RDebugUtils.currentLine=14876726;
 //BA.debugLineNum = 14876726;BA.debugLine="g = CreateGlyph(\"X\", FontMetrics, True)";
_g = __ref._createglyph /*b4a.example.bctextengine._bcglyph*/ (null,"X",_fontmetrics,__c.True);
 }else 
{RDebugUtils.currentLine=14876727;
 //BA.debugLineNum = 14876727;BA.debugLine="Else If c = \"x x\" Then";
if ((_c).equals("x x")) { 
RDebugUtils.currentLine=14876728;
 //BA.debugLineNum = 14876728;BA.debugLine="g = CreateGlyph(\"X X\", FontMetrics, True)";
_g = __ref._createglyph /*b4a.example.bctextengine._bcglyph*/ (null,"X X",_fontmetrics,__c.True);
 }else {
RDebugUtils.currentLine=14876730;
 //BA.debugLineNum = 14876730;BA.debugLine="g.Width = CreateGlyph(\" \", FontMetrics, False)";
_g.Width /*int*/  = __ref._createglyph /*b4a.example.bctextengine._bcglyph*/ (null," ",_fontmetrics,__c.False).Width /*int*/ ;
 }}}}
;
 };
RDebugUtils.currentLine=14876734;
 //BA.debugLineNum = 14876734;BA.debugLine="If xui.IsB4J = False And MightBeAnEmoji(c) Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()==__c.False && __ref._mightbeanemoji /*boolean*/ (null,_c)) { 
RDebugUtils.currentLine=14876735;
 //BA.debugLineNum = 14876735;BA.debugLine="If Emojis.IsInitialized = False Then LoadData(E";
if (__ref._emojis /*b4a.example.b4xset*/ .IsInitialized /*boolean*/ ()==__c.False) { 
__ref._loaddata /*String*/ (null,__ref._emojis /*b4a.example.b4xset*/ ,"emoji-data.txt");};
RDebugUtils.currentLine=14876736;
 //BA.debugLineNum = 14876736;BA.debugLine="g.Emoji = Emojis.Contains(BytesToInt(c.GetBytes";
_g.Emoji /*boolean*/  = __ref._emojis /*b4a.example.b4xset*/ ._contains /*boolean*/ (null,(Object)(__ref._bytestoint /*int*/ (null,_c.getBytes(__ref._charset /*String*/ ),(int) (0))));
 };
RDebugUtils.currentLine=14876738;
 //BA.debugLineNum = 14876738;BA.debugLine="If JustMeasure = False Then";
if (_justmeasure==__c.False) { 
RDebugUtils.currentLine=14876739;
 //BA.debugLineNum = 14876739;BA.debugLine="FontMetrics.Glyphs.Put(c, g)";
_fontmetrics.Glyphs /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_c),(Object)(_g));
 };
RDebugUtils.currentLine=14876741;
 //BA.debugLineNum = 14876741;BA.debugLine="Return g";
if (true) return _g;
 };
RDebugUtils.currentLine=14876743;
 //BA.debugLineNum = 14876743;BA.debugLine="End Sub";
return null;
}
public b4a.example.bctextengine._bcglyph  _createglyphfromdefaultcolor(b4a.example.bctextengine __ref,String _c,b4a.example.bctextengine._bcfontmetrics _defaultcolormetrics,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createglyphfromdefaultcolor", true))
	 {return ((b4a.example.bctextengine._bcglyph) Debug.delegate(ba, "createglyphfromdefaultcolor", new Object[] {_c,_defaultcolormetrics,_clr}));}
b4a.example.bctextengine._bcglyph _blackglyph = null;
b4a.example.bctextengine._bcglyph _g = null;
byte[] _buffer = null;
b4a.example.bitmapcreator._argbcolor _argb = null;
int _ai = 0;
int _ri = 0;
int _gi = 0;
int _bi = 0;
int _i = 0;
int _a = 0;
float _af = 0f;
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Private Sub CreateGlyphFromDefaultColor(c As Strin";
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="Dim BlackGlyph As BCGlyph = CreateGlyph(c, Defaul";
_blackglyph = __ref._createglyph /*b4a.example.bctextengine._bcglyph*/ (null,_c,_defaultcolormetrics,__c.False);
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="If BlackGlyph.cbc.IsInitialized = False Or BlackG";
if (_blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .IsInitialized==__c.False || _blackglyph.Emoji /*boolean*/ ) { 
if (true) return _blackglyph;};
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="Dim g As BCGlyph";
_g = new b4a.example.bctextengine._bcglyph();
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="g.Initialize";
_g.Initialize();
RDebugUtils.currentLine=15073285;
 //BA.debugLineNum = 15073285;BA.debugLine="g.baseline = BlackGlyph.baseline";
_g.baseline /*int*/  = _blackglyph.baseline /*int*/ ;
RDebugUtils.currentLine=15073286;
 //BA.debugLineNum = 15073286;BA.debugLine="g.width = BlackGlyph.width";
_g.Width /*int*/  = _blackglyph.Width /*int*/ ;
RDebugUtils.currentLine=15073287;
 //BA.debugLineNum = 15073287;BA.debugLine="g.cbc.Initialize";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .Initialize();
RDebugUtils.currentLine=15073288;
 //BA.debugLineNum = 15073288;BA.debugLine="g.cbc.Cache = BlackGlyph.cbc.Cache";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .Cache = _blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .Cache;
RDebugUtils.currentLine=15073289;
 //BA.debugLineNum = 15073289;BA.debugLine="g.cbc.mHeight = BlackGlyph.cbc.mHeight";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mHeight = _blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mHeight;
RDebugUtils.currentLine=15073290;
 //BA.debugLineNum = 15073290;BA.debugLine="g.cbc.mWidth = BlackGlyph.cbc.mWidth";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mWidth = _blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mWidth;
RDebugUtils.currentLine=15073291;
 //BA.debugLineNum = 15073291;BA.debugLine="g.cbc.Rows = BlackGlyph.cbc.Rows";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .Rows = _blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .Rows;
RDebugUtils.currentLine=15073292;
 //BA.debugLineNum = 15073292;BA.debugLine="g.cbc.TargetRect = BlackGlyph.cbc.TargetRect";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .TargetRect = _blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .TargetRect;
RDebugUtils.currentLine=15073293;
 //BA.debugLineNum = 15073293;BA.debugLine="Dim buffer(BlackGlyph.cbc.mBuffer.Length) As Byte";
_buffer = new byte[_blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mBuffer.length];
;
RDebugUtils.currentLine=15073294;
 //BA.debugLineNum = 15073294;BA.debugLine="Dim argb As ARGBColor";
_argb = new b4a.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=15073295;
 //BA.debugLineNum = 15073295;BA.debugLine="CharBC.ColorToARGB(clr, argb)";
__ref._charbc /*b4a.example.bitmapcreator*/ ._colortoargb(_clr,_argb);
RDebugUtils.currentLine=15073296;
 //BA.debugLineNum = 15073296;BA.debugLine="Dim ai, ri, gi, bi As Int";
_ai = 0;
_ri = 0;
_gi = 0;
_bi = 0;
RDebugUtils.currentLine=15073298;
 //BA.debugLineNum = 15073298;BA.debugLine="ai = 3";
_ai = (int) (3);
RDebugUtils.currentLine=15073299;
 //BA.debugLineNum = 15073299;BA.debugLine="ri = 0";
_ri = (int) (0);
RDebugUtils.currentLine=15073300;
 //BA.debugLineNum = 15073300;BA.debugLine="gi = 1";
_gi = (int) (1);
RDebugUtils.currentLine=15073301;
 //BA.debugLineNum = 15073301;BA.debugLine="bi = 2";
_bi = (int) (2);
RDebugUtils.currentLine=15073308;
 //BA.debugLineNum = 15073308;BA.debugLine="For i = 0 To buffer.Length - 1 Step 4";
{
final int step21 = 4;
final int limit21 = (int) (_buffer.length-1);
_i = (int) (0) ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=15073317;
 //BA.debugLineNum = 15073317;BA.debugLine="Dim a As Int = Bit.And(0xff, BlackGlyph.cbc.mBuf";
_a = __c.Bit.And((int) (0xff),(int) (_blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mBuffer[(int) (_i+_ai)]));
RDebugUtils.currentLine=15073318;
 //BA.debugLineNum = 15073318;BA.debugLine="Dim af As Float = a / 255";
_af = (float) (_a/(double)255);
RDebugUtils.currentLine=15073319;
 //BA.debugLineNum = 15073319;BA.debugLine="buffer(i + ai) = a";
_buffer[(int) (_i+_ai)] = (byte) (_a);
RDebugUtils.currentLine=15073320;
 //BA.debugLineNum = 15073320;BA.debugLine="buffer(i + ri) = argb.r * af";
_buffer[(int) (_i+_ri)] = (byte) (_argb.r*_af);
RDebugUtils.currentLine=15073321;
 //BA.debugLineNum = 15073321;BA.debugLine="buffer(i + gi) = argb.g * af";
_buffer[(int) (_i+_gi)] = (byte) (_argb.g*_af);
RDebugUtils.currentLine=15073322;
 //BA.debugLineNum = 15073322;BA.debugLine="buffer(i + bi) = argb.b * af";
_buffer[(int) (_i+_bi)] = (byte) (_argb.b*_af);
 }
};
RDebugUtils.currentLine=15073325;
 //BA.debugLineNum = 15073325;BA.debugLine="g.cbc.mBuffer = buffer";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mBuffer = _buffer;
RDebugUtils.currentLine=15073326;
 //BA.debugLineNum = 15073326;BA.debugLine="Return g";
if (true) return _g;
RDebugUtils.currentLine=15073327;
 //BA.debugLineNum = 15073327;BA.debugLine="End Sub";
return null;
}
public String  _resizecharbc(b4a.example.bctextengine __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "resizecharbc", true))
	 {return ((String) Debug.delegate(ba, "resizecharbc", new Object[] {_width,_height}));}
int _scaledwidth = 0;
int _scaledheight = 0;
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Private Sub ResizeCharBC(width As Int, height As I";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="Dim ScaledWidth As Int = (width + 5) / mScale";
_scaledwidth = (int) ((_width+5)/(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="Dim ScaledHeight As Int = (height + 5) / mScale";
_scaledheight = (int) ((_height+5)/(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=14548995;
 //BA.debugLineNum = 14548995;BA.debugLine="CharBC.Initialize(ScaledWidth * mScale, ScaledHei";
__ref._charbc /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (_scaledwidth*__ref._mscale /*float*/ ),(int) (_scaledheight*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=14548996;
 //BA.debugLineNum = 14548996;BA.debugLine="CharBC.MAX_SAME_COLOR_SIZE = 0";
__ref._charbc /*b4a.example.bitmapcreator*/ ._max_same_color_size = (int) (0);
RDebugUtils.currentLine=14548997;
 //BA.debugLineNum = 14548997;BA.debugLine="CharBC.AlphaThresholdForCBCExtraction = 0";
__ref._charbc /*b4a.example.bitmapcreator*/ ._alphathresholdforcbcextraction = (int) (0);
RDebugUtils.currentLine=14548998;
 //BA.debugLineNum = 14548998;BA.debugLine="cvs.Resize(ScaledWidth, ScaledHeight)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_scaledwidth),(float) (_scaledheight));
RDebugUtils.currentLine=14549012;
 //BA.debugLineNum = 14549012;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect  _findminrect(b4a.example.bctextengine __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "findminrect", true))
	 {return ((anywheresoftware.b4a.objects.B4XCanvas.B4XRect) Debug.delegate(ba, "findminrect", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Private Sub FindMinRect (width As Int, height As I";
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="r.Initialize(width / 2, -1, -1, 0)";
_r.Initialize((float) (_width/(double)2),(float) (-1),(float) (-1),(float) (0));
RDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="For y = 0 To height - 1";
{
final int step3 = 1;
final int limit3 = (int) (_height-1);
_y = (int) (0) ;
for (;_y <= limit3 ;_y = _y + step3 ) {
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="For x = 0 To width - 1";
{
final int step4 = 1;
final int limit4 = (int) (_width-1);
_x = (int) (0) ;
for (;_x <= limit4 ;_x = _x + step4 ) {
RDebugUtils.currentLine=15138821;
 //BA.debugLineNum = 15138821;BA.debugLine="If CharBC.IsTransparent(x, y) = False Then";
if (__ref._charbc /*b4a.example.bitmapcreator*/ ._istransparent(_x,_y)==__c.False) { 
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="r.Left = Min(r.Left, x)";
_r.setLeft((float) (__c.Min(_r.getLeft(),_x)));
RDebugUtils.currentLine=15138823;
 //BA.debugLineNum = 15138823;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=15138826;
 //BA.debugLineNum = 15138826;BA.debugLine="If x < width Then";
if (_x<_width) { 
RDebugUtils.currentLine=15138827;
 //BA.debugLineNum = 15138827;BA.debugLine="If r.Top = -1 Then";
if (_r.getTop()==-1) { 
RDebugUtils.currentLine=15138828;
 //BA.debugLineNum = 15138828;BA.debugLine="r.Top = y";
_r.setTop((float) (_y));
 }else {
RDebugUtils.currentLine=15138830;
 //BA.debugLineNum = 15138830;BA.debugLine="r.Bottom = y + 1";
_r.setBottom((float) (_y+1));
 };
RDebugUtils.currentLine=15138832;
 //BA.debugLineNum = 15138832;BA.debugLine="For x = width - 1 To 0 Step -1";
{
final int step16 = -1;
final int limit16 = (int) (0);
_x = (int) (_width-1) ;
for (;_x >= limit16 ;_x = _x + step16 ) {
RDebugUtils.currentLine=15138833;
 //BA.debugLineNum = 15138833;BA.debugLine="If CharBC.IsTransparent(x, y) = False Then";
if (__ref._charbc /*b4a.example.bitmapcreator*/ ._istransparent(_x,_y)==__c.False) { 
RDebugUtils.currentLine=15138834;
 //BA.debugLineNum = 15138834;BA.debugLine="r.Right = Max(r.Right, x + 1)";
_r.setRight((float) (__c.Max(_r.getRight(),_x+1)));
RDebugUtils.currentLine=15138835;
 //BA.debugLineNum = 15138835;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=15138840;
 //BA.debugLineNum = 15138840;BA.debugLine="r.Bottom = Max(r.Bottom, r.Top + 1)";
_r.setBottom((float) (__c.Max(_r.getBottom(),_r.getTop()+1)));
RDebugUtils.currentLine=15138841;
 //BA.debugLineNum = 15138841;BA.debugLine="Return r";
if (true) return _r;
RDebugUtils.currentLine=15138842;
 //BA.debugLineNum = 15138842;BA.debugLine="End Sub";
return null;
}
public boolean  _mightbeanemoji(b4a.example.bctextengine __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "mightbeanemoji", true))
	 {return ((Boolean) Debug.delegate(ba, "mightbeanemoji", new Object[] {_c}));}
int _cp = 0;
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Private Sub MightBeAnEmoji(c As String) As Boolean";
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="Dim cp As Int = Asc(c)";
_cp = __c.Asc(BA.ObjectToChar(_c));
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="Return cp >= 0x231A Or c.Length > 1";
if (true) return _cp>=0x231a || _c.length()>1;
RDebugUtils.currentLine=15007747;
 //BA.debugLineNum = 15007747;BA.debugLine="End Sub";
return false;
}
public String  _loaddata(b4a.example.bctextengine __ref,b4a.example.b4xset _set,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "loaddata", true))
	 {return ((String) Debug.delegate(ba, "loaddata", new Object[] {_set,_filename}));}
String _line = "";
int _i = 0;
int _a = 0;
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Private Sub LoadData(Set As B4XSet, FileName As St";
RDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="Set.Initialize";
_set._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="For Each line As String In File.ReadList(File.Dir";
{
final anywheresoftware.b4a.BA.IterableList group2 = __c.File.ReadList(__c.File.getDirAssets(),_filename);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_line = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=15859715;
 //BA.debugLineNum = 15859715;BA.debugLine="line = line.Trim";
_line = _line.trim();
RDebugUtils.currentLine=15859716;
 //BA.debugLineNum = 15859716;BA.debugLine="Dim i As Int = line.IndexOf(\".\")";
_i = _line.indexOf(".");
RDebugUtils.currentLine=15859717;
 //BA.debugLineNum = 15859717;BA.debugLine="If i = -1 Then";
if (_i==-1) { 
RDebugUtils.currentLine=15859718;
 //BA.debugLineNum = 15859718;BA.debugLine="Set.Add(Bit.ParseInt(line, 16))";
_set._add /*String*/ (null,(Object)(__c.Bit.ParseInt(_line,(int) (16))));
 }else {
RDebugUtils.currentLine=15859720;
 //BA.debugLineNum = 15859720;BA.debugLine="For a = Bit.ParseInt(line.SubString2(0, i), 16)";
{
final int step8 = 1;
final int limit8 = __c.Bit.ParseInt(_line.substring((int) (_i+2)),(int) (16));
_a = __c.Bit.ParseInt(_line.substring((int) (0),_i),(int) (16)) ;
for (;_a <= limit8 ;_a = _a + step8 ) {
RDebugUtils.currentLine=15859721;
 //BA.debugLineNum = 15859721;BA.debugLine="Set.Add(a)";
_set._add /*String*/ (null,(Object)(_a));
 }
};
 };
 }
};
RDebugUtils.currentLine=15859725;
 //BA.debugLineNum = 15859725;BA.debugLine="End Sub";
return "";
}
public String  _createline(b4a.example.bctextengine __ref,b4a.example.bctextengine._bcparagraph _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createline", true))
	 {return ((String) Debug.delegate(ba, "createline", new Object[] {_p}));}
b4a.example.bctextengine._bctextline _line = null;
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Private Sub CreateLine(p As BCParagraph)";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="Dim line As BCTextLine";
_line = new b4a.example.bctextengine._bctextline();
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="line.Initialize";
_line.Initialize();
RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="line.Unbreakables.Initialize";
_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=13303812;
 //BA.debugLineNum = 13303812;BA.debugLine="line.ParentParagraph = p";
_line.ParentParagraph /*b4a.example.bctextengine._bcparagraph*/  = _p;
RDebugUtils.currentLine=13303813;
 //BA.debugLineNum = 13303813;BA.debugLine="p.TextLines.Add(line)";
_p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_line));
RDebugUtils.currentLine=13303814;
 //BA.debugLineNum = 13303814;BA.debugLine="p.CurrentLine = line";
_p.CurrentLine /*b4a.example.bctextengine._bctextline*/  = _line;
RDebugUtils.currentLine=13303816;
 //BA.debugLineNum = 13303816;BA.debugLine="End Sub";
return "";
}
public b4a.example.bctextengine._bcsinglestylesection  _createsinglesection(b4a.example.bctextengine __ref,b4a.example.bctextengine._bctextrun _run,b4a.example.bctextengine._bctextchars _textchars,b4a.example.bctextengine._bcfontmetrics _fontmetrics) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createsinglesection", true))
	 {return ((b4a.example.bctextengine._bcsinglestylesection) Debug.delegate(ba, "createsinglesection", new Object[] {_run,_textchars,_fontmetrics}));}
b4a.example.bctextengine._bcsinglestylesection _single = null;
String _prevchar = "";
b4a.example.bctextengine._bcglyphandoffset _prevgo = null;
int _i = 0;
String _s = "";
b4a.example.bctextengine._bcglyphandoffset _go = null;
b4a.example.bctextengine._bcglyph _g = null;
b4a.example.bctextengine._bcstyledunderline _u = null;
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Private Sub CreateSingleSection (Run As BCTextRun,";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="Dim single As BCSingleStyleSection";
_single = new b4a.example.bctextengine._bcsinglestylesection();
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="single.Initialize";
_single.Initialize();
RDebugUtils.currentLine=13762563;
 //BA.debugLineNum = 13762563;BA.debugLine="single.GlyphsAndOffsets.Initialize";
_single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=13762564;
 //BA.debugLineNum = 13762564;BA.debugLine="single.Run = Run";
_single.Run /*b4a.example.bctextengine._bctextrun*/  = _run;
RDebugUtils.currentLine=13762565;
 //BA.debugLineNum = 13762565;BA.debugLine="single.fm = FontMetrics";
_single.fm /*b4a.example.bctextengine._bcfontmetrics*/  = _fontmetrics;
RDebugUtils.currentLine=13762566;
 //BA.debugLineNum = 13762566;BA.debugLine="Dim PrevChar As String";
_prevchar = "";
RDebugUtils.currentLine=13762567;
 //BA.debugLineNum = 13762567;BA.debugLine="Dim PrevGO As BCGlyphAndOffset";
_prevgo = new b4a.example.bctextengine._bcglyphandoffset();
RDebugUtils.currentLine=13762568;
 //BA.debugLineNum = 13762568;BA.debugLine="For i = 0 To TextChars.Length - 1";
{
final int step8 = 1;
final int limit8 = (int) (_textchars.Length /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=13762569;
 //BA.debugLineNum = 13762569;BA.debugLine="Dim s As String = TextChars.Buffer(i + TextChars";
_s = _textchars.Buffer /*String[]*/ [(int) (_i+_textchars.StartIndex /*int*/ )];
RDebugUtils.currentLine=13762570;
 //BA.debugLineNum = 13762570;BA.debugLine="Dim go As BCGlyphAndOffset";
_go = new b4a.example.bctextengine._bcglyphandoffset();
RDebugUtils.currentLine=13762571;
 //BA.debugLineNum = 13762571;BA.debugLine="Dim g As BCGlyph = CreateGlyph(s, FontMetrics, F";
_g = __ref._createglyph /*b4a.example.bctextengine._bcglyph*/ (null,_s,_fontmetrics,__c.False);
RDebugUtils.currentLine=13762572;
 //BA.debugLineNum = 13762572;BA.debugLine="If i > 0 Then";
if (_i>0) { 
RDebugUtils.currentLine=13762573;
 //BA.debugLineNum = 13762573;BA.debugLine="If KerningEnabled Then";
if (__ref._kerningenabled /*boolean*/ ) { 
RDebugUtils.currentLine=13762574;
 //BA.debugLineNum = 13762574;BA.debugLine="PrevGO.SpaceBetweenThisAndNext = GetKernSpaceB";
_prevgo.SpaceBetweenThisAndNext /*int*/  = __ref._getkernspacebetweenchars /*int*/ (null,_fontmetrics,_prevchar,_s,_prevgo.Glyph /*b4a.example.bctextengine._bcglyph*/ ,_g);
 }else {
RDebugUtils.currentLine=13762576;
 //BA.debugLineNum = 13762576;BA.debugLine="PrevGO.SpaceBetweenThisAndNext = mSpaceBetween";
_prevgo.SpaceBetweenThisAndNext /*int*/  = (int) (__ref._mspacebetweencharacters /*float*/ );
 };
 };
RDebugUtils.currentLine=13762579;
 //BA.debugLineNum = 13762579;BA.debugLine="go.Glyph = g";
_go.Glyph /*b4a.example.bctextengine._bcglyph*/  = _g;
RDebugUtils.currentLine=13762580;
 //BA.debugLineNum = 13762580;BA.debugLine="single.GlyphsAndOffsets.Add(go)";
_single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_go));
RDebugUtils.currentLine=13762581;
 //BA.debugLineNum = 13762581;BA.debugLine="If g.cbc.IsInitialized Then";
if (_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .IsInitialized) { 
RDebugUtils.currentLine=13762582;
 //BA.debugLineNum = 13762582;BA.debugLine="single.MaxHeightAboveBaseLine = Max(single.MaxH";
_single.MaxHeightAboveBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightAboveBaseLine /*int*/ ,_g.baseline /*int*/ -_run.VerticalOffset /*int*/ *__ref._mscale /*float*/ ));
RDebugUtils.currentLine=13762583;
 //BA.debugLineNum = 13762583;BA.debugLine="single.MaxHeightBelowBaseLine = Max(single.MaxH";
_single.MaxHeightBelowBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightBelowBaseLine /*int*/ ,_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mHeight-_g.baseline /*int*/ +_run.VerticalOffset /*int*/ *__ref._mscale /*float*/ ));
 };
RDebugUtils.currentLine=13762585;
 //BA.debugLineNum = 13762585;BA.debugLine="single.Width = single.Width + g.Width";
_single.Width /*int*/  = (int) (_single.Width /*int*/ +_g.Width /*int*/ );
RDebugUtils.currentLine=13762586;
 //BA.debugLineNum = 13762586;BA.debugLine="If i > 0 Then single.Width = single.Width + Prev";
if (_i>0) { 
_single.Width /*int*/  = (int) (_single.Width /*int*/ +_prevgo.SpaceBetweenThisAndNext /*int*/ *_run.CharacterSpacingFactor /*float*/ );};
RDebugUtils.currentLine=13762587;
 //BA.debugLineNum = 13762587;BA.debugLine="If Run.Underline Then";
if (_run.Underline /*boolean*/ ) { 
RDebugUtils.currentLine=13762588;
 //BA.debugLineNum = 13762588;BA.debugLine="Dim u As BCStyledUnderline = GetUnderlineStyle(";
_u = __ref._getunderlinestyle /*b4a.example.bctextengine._bcstyledunderline*/ (null,_run);
RDebugUtils.currentLine=13762589;
 //BA.debugLineNum = 13762589;BA.debugLine="single.MaxHeightBelowBaseLine = Max((u.Thicknes";
_single.MaxHeightBelowBaseLine /*int*/  = (int) (__c.Max((_u.Thickness /*float*/ +2)*__ref._mscale /*float*/ +_run.VerticalOffset /*int*/ *__ref._mscale /*float*/ ,_single.MaxHeightBelowBaseLine /*int*/ ));
 };
RDebugUtils.currentLine=13762591;
 //BA.debugLineNum = 13762591;BA.debugLine="PrevGO = go";
_prevgo = _go;
RDebugUtils.currentLine=13762592;
 //BA.debugLineNum = 13762592;BA.debugLine="PrevChar = s";
_prevchar = _s;
 }
};
RDebugUtils.currentLine=13762594;
 //BA.debugLineNum = 13762594;BA.debugLine="If i > 0 Then single.Width = single.Width + PrevG";
if (_i>0) { 
_single.Width /*int*/  = (int) (_single.Width /*int*/ +_prevgo.SpaceBetweenThisAndNext /*int*/ *_run.CharacterSpacingFactor /*float*/ );};
RDebugUtils.currentLine=13762595;
 //BA.debugLineNum = 13762595;BA.debugLine="If TextChars.Length = 0 And Run.View.IsInitialize";
if (_textchars.Length /*int*/ ==0 && _run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=13762596;
 //BA.debugLineNum = 13762596;BA.debugLine="Run.View.Left = 0";
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft((int) (0));
RDebugUtils.currentLine=13762597;
 //BA.debugLineNum = 13762597;BA.debugLine="Run.View.Top = 0";
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (0));
RDebugUtils.currentLine=13762598;
 //BA.debugLineNum = 13762598;BA.debugLine="single.Width = Run.View.Width * mScale + mSpaceB";
_single.Width /*int*/  = (int) (_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()*__ref._mscale /*float*/ +__ref._mspacebetweencharacters /*float*/ *2);
RDebugUtils.currentLine=13762599;
 //BA.debugLineNum = 13762599;BA.debugLine="single.MaxHeightAboveBaseLine = (Run.View.Height";
_single.MaxHeightAboveBaseLine /*int*/  = (int) ((_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_run.VerticalOffset /*int*/ )*__ref._mscale /*float*/ );
RDebugUtils.currentLine=13762600;
 //BA.debugLineNum = 13762600;BA.debugLine="single.MaxHeightBelowBaseLine = Run.View.Height";
_single.MaxHeightBelowBaseLine /*int*/  = (int) (_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*__ref._mscale /*float*/ -_single.MaxHeightAboveBaseLine /*int*/ );
 };
RDebugUtils.currentLine=13762603;
 //BA.debugLineNum = 13762603;BA.debugLine="Return single";
if (true) return _single;
RDebugUtils.currentLine=13762604;
 //BA.debugLineNum = 13762604;BA.debugLine="End Sub";
return null;
}
public int  _getkernspacebetweenchars(b4a.example.bctextengine __ref,b4a.example.bctextengine._bcfontmetrics _fm,String _prevchar,String _thischar,b4a.example.bctextengine._bcglyph _prevglyph,b4a.example.bctextengine._bcglyph _thisglyph) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getkernspacebetweenchars", true))
	 {return ((Integer) Debug.delegate(ba, "getkernspacebetweenchars", new Object[] {_fm,_prevchar,_thischar,_prevglyph,_thisglyph}));}
String _together = "";
int _space = 0;
int _res = 0;
int _w = 0;
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Private Sub GetKernSpaceBetweenChars (fm As BCFont";
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="Dim together As String = PrevChar & ThisChar";
_together = _prevchar+_thischar;
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="Dim Space As Int = fm.KerningTable.GetDefault(tog";
_space = (int)(BA.ObjectToNumber(_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_together),(Object)(-1000))));
RDebugUtils.currentLine=13828099;
 //BA.debugLineNum = 13828099;BA.debugLine="If Space > -1000 Then Return Space";
if (_space>-1000) { 
if (true) return _space;};
RDebugUtils.currentLine=13828100;
 //BA.debugLineNum = 13828100;BA.debugLine="Dim res As Int";
_res = 0;
RDebugUtils.currentLine=13828101;
 //BA.debugLineNum = 13828101;BA.debugLine="If ThisGlyph.Empty Or PrevGlyph.Empty Then";
if (_thisglyph.Empty /*boolean*/  || _prevglyph.Empty /*boolean*/ ) { 
RDebugUtils.currentLine=13828102;
 //BA.debugLineNum = 13828102;BA.debugLine="res = mSpaceBetweenCharacters";
_res = (int) (__ref._mspacebetweencharacters /*float*/ );
 }else {
RDebugUtils.currentLine=13828104;
 //BA.debugLineNum = 13828104;BA.debugLine="Dim w As Int = CreateGlyph(together, fm, True).W";
_w = __ref._createglyph /*b4a.example.bctextengine._bcglyph*/ (null,_together,_fm,__c.True).Width /*int*/ ;
RDebugUtils.currentLine=13828105;
 //BA.debugLineNum = 13828105;BA.debugLine="res = w - PrevGlyph.Width - ThisGlyph.Width";
_res = (int) (_w-_prevglyph.Width /*int*/ -_thisglyph.Width /*int*/ );
 };
RDebugUtils.currentLine=13828107;
 //BA.debugLineNum = 13828107;BA.debugLine="fm.KerningTable.Put(together, res)";
_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_together),(Object)(_res));
RDebugUtils.currentLine=13828108;
 //BA.debugLineNum = 13828108;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=13828109;
 //BA.debugLineNum = 13828109;BA.debugLine="End Sub";
return 0;
}
public b4a.example.bctextengine._bcstyledunderline  _getunderlinestyle(b4a.example.bctextengine __ref,b4a.example.bctextengine._bctextrun _run) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getunderlinestyle", true))
	 {return ((b4a.example.bctextengine._bcstyledunderline) Debug.delegate(ba, "getunderlinestyle", new Object[] {_run}));}
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Private Sub GetUnderlineStyle(run As BCTextRun) As";
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="If run.Extra.IsInitialized = False Then Return De";
if (_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return __ref._defaultunderlinestyle /*b4a.example.bctextengine._bcstyledunderline*/ ;};
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="Return run.Extra.GetDefault(EXTRA_STYLEDUNDERLINE";
if (true) return (b4a.example.bctextengine._bcstyledunderline)(_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(__ref._extra_styledunderline /*String*/ ),(Object)(__ref._defaultunderlinestyle /*b4a.example.bctextengine._bcstyledunderline*/ )));
RDebugUtils.currentLine=14483459;
 //BA.debugLineNum = 14483459;BA.debugLine="End Sub";
return null;
}
public b4a.example.bctextengine._bcunbreakabletext  _createunbreakable(b4a.example.bctextengine __ref,b4a.example.bctextengine._bctextrun _run,b4a.example.bctextengine._bctextchars _textchars,b4a.example.bctextengine._bcfontmetrics _fontmetrics,boolean _isseparator,b4a.example.bctextengine._bcparagraphstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createunbreakable", true))
	 {return ((b4a.example.bctextengine._bcunbreakabletext) Debug.delegate(ba, "createunbreakable", new Object[] {_run,_textchars,_fontmetrics,_isseparator,_style}));}
b4a.example.bctextengine._bcunbreakabletext _unbreakable = null;
b4a.example.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Private Sub CreateUnbreakable (Run As BCTextRun, T";
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="Dim unbreakable As BCUnbreakableText";
_unbreakable = new b4a.example.bctextengine._bcunbreakabletext();
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="unbreakable.Initialize";
_unbreakable.Initialize();
RDebugUtils.currentLine=13500419;
 //BA.debugLineNum = 13500419;BA.debugLine="unbreakable.SingleStyleSections.Initialize";
_unbreakable.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=13500420;
 //BA.debugLineNum = 13500420;BA.debugLine="unbreakable.IsMergable = Not(IsSeparator) And Not";
_unbreakable.IsMergable /*boolean*/  = __c.Not(_isseparator) && __c.Not(_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized());
RDebugUtils.currentLine=13500421;
 //BA.debugLineNum = 13500421;BA.debugLine="Dim single As BCSingleStyleSection = CreateSingle";
_single = __ref._createsinglesection /*b4a.example.bctextengine._bcsinglestylesection*/ (null,_run,_textchars,_fontmetrics);
RDebugUtils.currentLine=13500422;
 //BA.debugLineNum = 13500422;BA.debugLine="single.ParentUN = unbreakable";
_single.ParentUN /*b4a.example.bctextengine._bcunbreakabletext*/  = _unbreakable;
RDebugUtils.currentLine=13500423;
 //BA.debugLineNum = 13500423;BA.debugLine="unbreakable.SingleStyleSections.Add(single)";
_unbreakable.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_single));
RDebugUtils.currentLine=13500424;
 //BA.debugLineNum = 13500424;BA.debugLine="unbreakable.Width = single.Width";
_unbreakable.Width /*int*/  = _single.Width /*int*/ ;
RDebugUtils.currentLine=13500425;
 //BA.debugLineNum = 13500425;BA.debugLine="unbreakable.NotFullTextChars = TextChars";
_unbreakable.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/  = _textchars;
RDebugUtils.currentLine=13500426;
 //BA.debugLineNum = 13500426;BA.debugLine="If style.RTL Then";
if (_style.RTL /*boolean*/ ) { 
RDebugUtils.currentLine=13500427;
 //BA.debugLineNum = 13500427;BA.debugLine="unbreakable.RTL = Run.TextDirection = TextDirect";
_unbreakable.RTL /*boolean*/  = _run.TextDirection /*int*/ ==__ref._textdirectionrtl /*int*/  || (_run.TextDirection /*int*/ ==__ref._textdirectionunknown /*int*/  && __ref._detectrtl /*boolean*/ (null,_unbreakable)==__c.True);
 };
RDebugUtils.currentLine=13500429;
 //BA.debugLineNum = 13500429;BA.debugLine="Return unbreakable";
if (true) return _unbreakable;
RDebugUtils.currentLine=13500430;
 //BA.debugLineNum = 13500430;BA.debugLine="End Sub";
return null;
}
public boolean  _detectrtl(b4a.example.bctextengine __ref,b4a.example.bctextengine._bcunbreakabletext _un) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "detectrtl", true))
	 {return ((Boolean) Debug.delegate(ba, "detectrtl", new Object[] {_un}));}
String _firstchar = "";
int _cp = 0;
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Private Sub DetectRTL (un As BCUnbreakableText) As";
RDebugUtils.currentLine=13565953;
 //BA.debugLineNum = 13565953;BA.debugLine="If un.NotFullTextChars.Length = 0 Then";
if (_un.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ .Length /*int*/ ==0) { 
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=13565956;
 //BA.debugLineNum = 13565956;BA.debugLine="If RTLChars.IsInitialized = False Then";
if (__ref._rtlchars /*b4a.example.b4xset*/ .IsInitialized /*boolean*/ ()==__c.False) { 
RDebugUtils.currentLine=13565957;
 //BA.debugLineNum = 13565957;BA.debugLine="LoadData(RTLChars, \"rtl-data.txt\")";
__ref._loaddata /*String*/ (null,__ref._rtlchars /*b4a.example.b4xset*/ ,"rtl-data.txt");
 };
RDebugUtils.currentLine=13565959;
 //BA.debugLineNum = 13565959;BA.debugLine="Dim firstChar As String = un.NotFullTextChars.Buf";
_firstchar = _un.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ .Buffer /*String[]*/ [_un.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ .StartIndex /*int*/ ];
RDebugUtils.currentLine=13565960;
 //BA.debugLineNum = 13565960;BA.debugLine="Dim cp As Int = BytesToInt(firstChar.GetBytes(Cha";
_cp = __ref._bytestoint /*int*/ (null,_firstchar.getBytes(__ref._charset /*String*/ ),(int) (0));
RDebugUtils.currentLine=13565961;
 //BA.debugLineNum = 13565961;BA.debugLine="Return RTLChars.Contains(cp)";
if (true) return __ref._rtlchars /*b4a.example.b4xset*/ ._contains /*boolean*/ (null,(Object)(_cp));
RDebugUtils.currentLine=13565962;
 //BA.debugLineNum = 13565962;BA.debugLine="End Sub";
return false;
}
public String  _drawline(b4a.example.bctextengine __ref,b4a.example.bctextengine._bctextline _line,int _offsety) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawline", true))
	 {return ((String) Debug.delegate(ba, "drawline", new Object[] {_line,_offsety}));}
b4a.example.bctextengine._bcunbreakabletext _un = null;
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Private Sub DrawLine(line As BCTextLine, OffsetY A";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreaka";
{
final anywheresoftware.b4a.BA.IterableList group1 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_un = (b4a.example.bctextengine._bcunbreakabletext)(group1.Get(index1));
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="DrawUnbreakable(un, OffsetY)";
__ref._drawunbreakable /*String*/ (null,_un,_offsety);
 }
};
RDebugUtils.currentLine=14286852;
 //BA.debugLineNum = 14286852;BA.debugLine="End Sub";
return "";
}
public String  _drawunbreakable(b4a.example.bctextengine __ref,b4a.example.bctextengine._bcunbreakabletext _un,int _offsety) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawunbreakable", true))
	 {return ((String) Debug.delegate(ba, "drawunbreakable", new Object[] {_un,_offsety}));}
b4a.example.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Private Sub DrawUnbreakable (un As BCUnbreakableTe";
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="For Each single As BCSingleStyleSection In un.Sin";
{
final anywheresoftware.b4a.BA.IterableList group1 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_single = (b4a.example.bctextengine._bcsinglestylesection)(group1.Get(index1));
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="DrawSingleStyleSection(single, OffsetY)";
__ref._drawsinglestylesection /*String*/ (null,_single,_offsety);
 }
};
RDebugUtils.currentLine=14352388;
 //BA.debugLineNum = 14352388;BA.debugLine="End Sub";
return "";
}
public String  _drawparagraph(b4a.example.bctextengine __ref,b4a.example.bctextengine._bcparagraph _paragraph) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawparagraph", true))
	 {return ((String) Debug.delegate(ba, "drawparagraph", new Object[] {_paragraph}));}
b4a.example.bctextengine._bctextline _line = null;
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Private Sub DrawParagraph (Paragraph As BCParagrap";
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group1 = _paragraph.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (b4a.example.bctextengine._bctextline)(group1.Get(index1));
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="DrawLine(line, line.BaselineY)";
__ref._drawline /*String*/ (null,_line,_line.BaselineY /*int*/ );
 }
};
RDebugUtils.currentLine=13893636;
 //BA.debugLineNum = 13893636;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect  _drawsinglelineshared(b4a.example.bctextengine __ref,b4a.example.bctextengine._bctextline _line,anywheresoftware.b4a.objects.B4XViewWrapper _iv,b4a.example.bctextengine._bcparagraph _par) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawsinglelineshared", true))
	 {return ((anywheresoftware.b4a.objects.B4XCanvas.B4XRect) Debug.delegate(ba, "drawsinglelineshared", new Object[] {_line,_iv,_par}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Private Sub DrawSingleLineShared (line As BCTextLi";
RDebugUtils.currentLine=14024705;
 //BA.debugLineNum = 14024705;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="r.Initialize(0, 0, ForegroundBC.mWidth, line.MaxH";
_r.Initialize((float) (0),(float) (0),(float) (__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._mwidth),(float) (_line.MaxHeightAboveBaseLine /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ ));
RDebugUtils.currentLine=14024707;
 //BA.debugLineNum = 14024707;BA.debugLine="iv.SetLayoutAnimated(0,  par.Style.Padding.Left,";
_iv.SetLayoutAnimated((int) (0),(int) (_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()),(int) (_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+(_line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ )/(double)__ref._mscale /*float*/ ),(int) (_r.getWidth()/(double)__ref._mscale /*float*/ ),(int) (_r.getHeight()/(double)__ref._mscale /*float*/ ));
RDebugUtils.currentLine=14024709;
 //BA.debugLineNum = 14024709;BA.debugLine="Return r";
if (true) return _r;
RDebugUtils.currentLine=14024710;
 //BA.debugLineNum = 14024710;BA.debugLine="End Sub";
return null;
}
public b4a.example.bcpath._bcbrush  _getbrush(b4a.example.bctextengine __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getbrush", true))
	 {return ((b4a.example.bcpath._bcbrush) Debug.delegate(ba, "getbrush", new Object[] {_clr}));}
b4a.example.bcpath._bcbrush _b = null;
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Private Sub GetBrush(clr As Int) As BCBrush";
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="If Brushes.ContainsKey(clr) Then Return Brushes.G";
if (__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_clr))) { 
if (true) return (b4a.example.bcpath._bcbrush)(__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_clr)));};
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="Dim b As BCBrush = ForegroundBC.CreateBrushFromCo";
_b = __ref._foregroundbc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(_clr);
RDebugUtils.currentLine=14745603;
 //BA.debugLineNum = 14745603;BA.debugLine="Brushes.Put(clr, b)";
__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_clr),(Object)(_b));
RDebugUtils.currentLine=14745604;
 //BA.debugLineNum = 14745604;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=14745605;
 //BA.debugLineNum = 14745605;BA.debugLine="End Sub";
return null;
}
public b4a.example.bitmapcreator  _drawsinglelineasync(b4a.example.bctextengine __ref,b4a.example.bctextengine._bctextline _line,anywheresoftware.b4a.objects.B4XViewWrapper _iv,b4a.example.bctextengine._bcparagraph _par,Object _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawsinglelineasync", true))
	 {return ((b4a.example.bitmapcreator) Debug.delegate(ba, "drawsinglelineasync", new Object[] {_line,_iv,_par,_target}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Public Sub DrawSingleLineAsync (line As BCTextLine";
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="Dim r As B4XRect = DrawSingleLineShared(line, iv,";
_r = __ref._drawsinglelineshared /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ (null,_line,_iv,_par);
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="If r.Width > 0 And r.Height > 0 Then";
if (_r.getWidth()>0 && _r.getHeight()>0) { 
RDebugUtils.currentLine=14090243;
 //BA.debugLineNum = 14090243;BA.debugLine="AsyncMode = True";
__ref._asyncmode /*boolean*/  = __c.True;
RDebugUtils.currentLine=14090244;
 //BA.debugLineNum = 14090244;BA.debugLine="If AsyncBCs.IsInitialized = False Then AsyncBCs.";
if (__ref._asyncbcs /*b4a.example.b4xorderedmap*/ .IsInitialized /*boolean*/ ()==__c.False) { 
__ref._asyncbcs /*b4a.example.b4xorderedmap*/ ._initialize /*String*/ (null,ba);};
RDebugUtils.currentLine=14090245;
 //BA.debugLineNum = 14090245;BA.debugLine="Dim AsyncTasks As List";
_asynctasks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14090246;
 //BA.debugLineNum = 14090246;BA.debugLine="AsyncTasks.Initialize";
__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=14090247;
 //BA.debugLineNum = 14090247;BA.debugLine="AsyncBC = FindAsyncBC (r.Width, r.Height)";
__ref._asyncbc /*b4a.example.bitmapcreator*/  = __ref._findasyncbc /*b4a.example.bitmapcreator*/ (null,(int) (_r.getWidth()),(int) (_r.getHeight()));
RDebugUtils.currentLine=14090248;
 //BA.debugLineNum = 14090248;BA.debugLine="AsyncTasks.Add(AsyncBC.AsyncDrawRect(r, GetBrush";
__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._asyncbc /*b4a.example.bitmapcreator*/ ._asyncdrawrect(_r,__ref._getbrush /*b4a.example.bcpath._bcbrush*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent),__c.True,(int) (0))));
RDebugUtils.currentLine=14090249;
 //BA.debugLineNum = 14090249;BA.debugLine="DrawLine(line, line.MaxHeightAboveBaseLine)";
__ref._drawline /*String*/ (null,_line,_line.MaxHeightAboveBaseLine /*int*/ );
RDebugUtils.currentLine=14090250;
 //BA.debugLineNum = 14090250;BA.debugLine="AsyncBC.DrawBitmapCreatorsAsync(Target, \"BC\", As";
__ref._asyncbc /*b4a.example.bitmapcreator*/ ._drawbitmapcreatorsasync(_target,"BC",__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=14090251;
 //BA.debugLineNum = 14090251;BA.debugLine="AsyncMode = False";
__ref._asyncmode /*boolean*/  = __c.False;
RDebugUtils.currentLine=14090252;
 //BA.debugLineNum = 14090252;BA.debugLine="Return AsyncBC";
if (true) return __ref._asyncbc /*b4a.example.bitmapcreator*/ ;
 };
RDebugUtils.currentLine=14090254;
 //BA.debugLineNum = 14090254;BA.debugLine="Return Null";
if (true) return (b4a.example.bitmapcreator)(__c.Null);
RDebugUtils.currentLine=14090255;
 //BA.debugLineNum = 14090255;BA.debugLine="End Sub";
return null;
}
public b4a.example.bitmapcreator  _findasyncbc(b4a.example.bctextengine __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "findasyncbc", true))
	 {return ((b4a.example.bitmapcreator) Debug.delegate(ba, "findasyncbc", new Object[] {_width,_height}));}
b4a.example.bitmapcreator _bc = null;
boolean _used = false;
int _i = 0;
boolean _b = false;
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Private Sub FindAsyncBC (Width As Int, Height As I";
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="For Each bc As BitmapCreator In AsyncBCs.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._asyncbcs /*b4a.example.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_bc = (b4a.example.bitmapcreator)(group1.Get(index1));
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="If bc.mWidth = Width And bc.mHeight = Height The";
if (_bc._mwidth==_width && _bc._mheight==_height) { 
RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="Dim Used As Boolean = AsyncBCs.Get(bc)";
_used = BA.ObjectToBoolean(__ref._asyncbcs /*b4a.example.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_bc)));
RDebugUtils.currentLine=14155780;
 //BA.debugLineNum = 14155780;BA.debugLine="If Used = False Then";
if (_used==__c.False) { 
RDebugUtils.currentLine=14155781;
 //BA.debugLineNum = 14155781;BA.debugLine="AsyncBCs.Put(bc, True)";
__ref._asyncbcs /*b4a.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_bc),(Object)(__c.True));
RDebugUtils.currentLine=14155782;
 //BA.debugLineNum = 14155782;BA.debugLine="Return bc";
if (true) return _bc;
 };
 };
 }
};
RDebugUtils.currentLine=14155786;
 //BA.debugLineNum = 14155786;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=14155787;
 //BA.debugLineNum = 14155787;BA.debugLine="bc.Initialize(Width, Height)";
_bc._initialize(ba,_width,_height);
RDebugUtils.currentLine=14155788;
 //BA.debugLineNum = 14155788;BA.debugLine="AsyncBCs.Put(bc, True)";
__ref._asyncbcs /*b4a.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_bc),(Object)(__c.True));
RDebugUtils.currentLine=14155789;
 //BA.debugLineNum = 14155789;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=14155790;
 //BA.debugLineNum = 14155790;BA.debugLine="For Each b As Boolean In AsyncBCs.Values";
{
final anywheresoftware.b4a.BA.IterableList group14 = __ref._asyncbcs /*b4a.example.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_b = BA.ObjectToBoolean(group14.Get(index14));
RDebugUtils.currentLine=14155791;
 //BA.debugLineNum = 14155791;BA.debugLine="If b Then i = i + 1";
if (_b) { 
_i = (int) (_i+1);};
 }
};
RDebugUtils.currentLine=14155793;
 //BA.debugLineNum = 14155793;BA.debugLine="Return bc";
if (true) return _bc;
RDebugUtils.currentLine=14155794;
 //BA.debugLineNum = 14155794;BA.debugLine="End Sub";
return null;
}
public String  _drawsinglestylesection(b4a.example.bctextengine __ref,b4a.example.bctextengine._bcsinglestylesection _single,int _offsety) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawsinglestylesection", true))
	 {return ((String) Debug.delegate(ba, "drawsinglestylesection", new Object[] {_single,_offsety}));}
int _offsetx = 0;
boolean _rtl = false;
b4a.example.bctextengine._bcglyphandoffset _go = null;
b4a.example.bctextengine._bcglyph _g = null;
int _x = 0;
b4a.example.bitmapcreator._drawtask _dt = null;
b4a.example.bctextengine._bcstyledunderline _u = null;
int _clr = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Private Sub DrawSingleStyleSection (single As BCSi";
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="Dim OffsetX As Int = single.AbsoluteStartX";
_offsetx = _single.AbsoluteStartX /*int*/ ;
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="Dim rtl As Boolean = single.ParentUN.RTL";
_rtl = _single.ParentUN /*b4a.example.bctextengine._bcunbreakabletext*/ .RTL /*boolean*/ ;
RDebugUtils.currentLine=14417923;
 //BA.debugLineNum = 14417923;BA.debugLine="If rtl Then OffsetX = single.AbsoluteStartX + sin";
if (_rtl) { 
_offsetx = (int) (_single.AbsoluteStartX /*int*/ +_single.Width /*int*/ );};
RDebugUtils.currentLine=14417924;
 //BA.debugLineNum = 14417924;BA.debugLine="For Each go As BCGlyphAndOffset In single.GlyphsA";
{
final anywheresoftware.b4a.BA.IterableList group4 = _single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_go = (b4a.example.bctextengine._bcglyphandoffset)(group4.Get(index4));
RDebugUtils.currentLine=14417925;
 //BA.debugLineNum = 14417925;BA.debugLine="Dim g As BCGlyph = go.Glyph";
_g = _go.Glyph /*b4a.example.bctextengine._bcglyph*/ ;
RDebugUtils.currentLine=14417927;
 //BA.debugLineNum = 14417927;BA.debugLine="If g = Null Then Continue";
if (_g== null) { 
if (true) continue;};
RDebugUtils.currentLine=14417929;
 //BA.debugLineNum = 14417929;BA.debugLine="Dim x As Int = OffsetX";
_x = _offsetx;
RDebugUtils.currentLine=14417930;
 //BA.debugLineNum = 14417930;BA.debugLine="If rtl Then x = x - g.cbc.mWidth";
if (_rtl) { 
_x = (int) (_x-_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mWidth);};
RDebugUtils.currentLine=14417931;
 //BA.debugLineNum = 14417931;BA.debugLine="If g.cbc.IsInitialized Then";
if (_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .IsInitialized) { 
RDebugUtils.currentLine=14417932;
 //BA.debugLineNum = 14417932;BA.debugLine="If AsyncMode Then";
if (__ref._asyncmode /*boolean*/ ) { 
RDebugUtils.currentLine=14417933;
 //BA.debugLineNum = 14417933;BA.debugLine="Dim dt As DrawTask = AsyncBC.CreateDrawTask(g.";
_dt = __ref._asyncbc /*b4a.example.bitmapcreator*/ ._createdrawtask((Object)(_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ ),_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .TargetRect,_x,(int) (_offsety-_g.baseline /*int*/ +_single.Run /*b4a.example.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *__ref._mscale /*float*/ ),__c.True);
RDebugUtils.currentLine=14417934;
 //BA.debugLineNum = 14417934;BA.debugLine="dt.IsCompressedSource = True";
_dt.IsCompressedSource = __c.True;
RDebugUtils.currentLine=14417935;
 //BA.debugLineNum = 14417935;BA.debugLine="AsyncTasks.Add(dt)";
__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_dt));
 }else {
RDebugUtils.currentLine=14417937;
 //BA.debugLineNum = 14417937;BA.debugLine="ForegroundBC.DrawCompressedBitmap(g.cbc, g.cbc";
__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._drawcompressedbitmap(_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ ,_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .TargetRect,_x,(int) (_offsety-_g.baseline /*int*/ +_single.Run /*b4a.example.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *__ref._mscale /*float*/ ));
 };
 };
RDebugUtils.currentLine=14417940;
 //BA.debugLineNum = 14417940;BA.debugLine="If single.Run.Underline Then";
if (_single.Run /*b4a.example.bctextengine._bctextrun*/ .Underline /*boolean*/ ) { 
RDebugUtils.currentLine=14417941;
 //BA.debugLineNum = 14417941;BA.debugLine="Dim u As BCStyledUnderline = GetUnderlineStyle(";
_u = __ref._getunderlinestyle /*b4a.example.bctextengine._bcstyledunderline*/ (null,_single.Run /*b4a.example.bctextengine._bctextrun*/ );
RDebugUtils.currentLine=14417942;
 //BA.debugLineNum = 14417942;BA.debugLine="Dim clr As Int = u.Clr";
_clr = _u.Clr /*int*/ ;
RDebugUtils.currentLine=14417943;
 //BA.debugLineNum = 14417943;BA.debugLine="If clr = 0 Then clr = single.Run.TextColor";
if (_clr==0) { 
_clr = _single.Run /*b4a.example.bctextengine._bctextrun*/ .TextColor /*int*/ ;};
RDebugUtils.currentLine=14417944;
 //BA.debugLineNum = 14417944;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=14417945;
 //BA.debugLineNum = 14417945;BA.debugLine="r.Initialize(x, single.Run.VerticalOffset * mSc";
_r.Initialize((float) (_x),(float) (_single.Run /*b4a.example.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *__ref._mscale /*float*/ +_offsety+__ref._mscale /*float*/ ),(float) (_x+_g.Width /*int*/ +__ref._mspacebetweencharacters /*float*/ +_go.SpaceBetweenThisAndNext /*int*/ *_single.Run /*b4a.example.bctextengine._bctextrun*/ .CharacterSpacingFactor /*float*/ ),(float) (_offsety+__ref._mscale /*float*/ +_u.Thickness /*float*/ *__ref._mscale /*float*/ +_single.Run /*b4a.example.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *__ref._mscale /*float*/ ));
RDebugUtils.currentLine=14417947;
 //BA.debugLineNum = 14417947;BA.debugLine="If AsyncMode Then";
if (__ref._asyncmode /*boolean*/ ) { 
RDebugUtils.currentLine=14417948;
 //BA.debugLineNum = 14417948;BA.debugLine="AsyncTasks.Add(AsyncBC.AsyncDrawRect(r, GetBru";
__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._asyncbc /*b4a.example.bitmapcreator*/ ._asyncdrawrect(_r,__ref._getbrush /*b4a.example.bcpath._bcbrush*/ (null,_clr),__c.True,(int) (0))));
 }else {
RDebugUtils.currentLine=14417950;
 //BA.debugLineNum = 14417950;BA.debugLine="ForegroundBC.DrawRect2(r, GetBrush(clr), True,";
__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._drawrect2(_r,__ref._getbrush /*b4a.example.bcpath._bcbrush*/ (null,_clr),__c.True,(int) (0));
 };
 };
RDebugUtils.currentLine=14417953;
 //BA.debugLineNum = 14417953;BA.debugLine="If rtl Then";
if (_rtl) { 
RDebugUtils.currentLine=14417954;
 //BA.debugLineNum = 14417954;BA.debugLine="OffsetX = OffsetX - g.Width - go.SpaceBetweenTh";
_offsetx = (int) (_offsetx-_g.Width /*int*/ -_go.SpaceBetweenThisAndNext /*int*/ *_single.Run /*b4a.example.bctextengine._bctextrun*/ .CharacterSpacingFactor /*float*/ );
 }else {
RDebugUtils.currentLine=14417956;
 //BA.debugLineNum = 14417956;BA.debugLine="OffsetX = OffsetX + g.Width + go.SpaceBetweenTh";
_offsetx = (int) (_offsetx+_g.Width /*int*/ +_go.SpaceBetweenThisAndNext /*int*/ *_single.Run /*b4a.example.bctextengine._bctextrun*/ .CharacterSpacingFactor /*float*/ );
 };
 }
};
RDebugUtils.currentLine=14417959;
 //BA.debugLineNum = 14417959;BA.debugLine="End Sub";
return "";
}
public b4a.example.bctextengine._bcparagraph  _prepare(b4a.example.bctextengine __ref,anywheresoftware.b4a.objects.collections.List _runs,b4a.example.bctextengine._bcparagraphstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "prepare", true))
	 {return ((b4a.example.bctextengine._bcparagraph) Debug.delegate(ba, "prepare", new Object[] {_runs,_style}));}
b4a.example.bctextengine._bcparagraph _par = null;
anywheresoftware.b4a.objects.collections.List _unbreakeables = null;
b4a.example.bctextengine._bctextrun _run = null;
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Private Sub Prepare (Runs As List, Style As BCPara";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="Dim par As BCParagraph";
_par = new b4a.example.bctextengine._bcparagraph();
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="par.Initialize";
_par.Initialize();
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="par.TextLines.Initialize";
_par.TextLines /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=12582916;
 //BA.debugLineNum = 12582916;BA.debugLine="par.Style = Style";
_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/  = _style;
RDebugUtils.currentLine=12582917;
 //BA.debugLineNum = 12582917;BA.debugLine="IndentWidth = GetFontMetrics(DefaultFont, Default";
__ref._indentwidth /*int*/  = (int) (__ref._getfontmetrics /*b4a.example.bctextengine._bcfontmetrics*/ (null,__ref._defaultfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._defaultcolor /*int*/ ).xWidth /*int*/ *__ref._tabwidthmeasuredinx /*int*/ );
RDebugUtils.currentLine=12582918;
 //BA.debugLineNum = 12582918;BA.debugLine="Dim unbreakeables As List";
_unbreakeables = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12582919;
 //BA.debugLineNum = 12582919;BA.debugLine="unbreakeables.Initialize";
_unbreakeables.Initialize();
RDebugUtils.currentLine=12582920;
 //BA.debugLineNum = 12582920;BA.debugLine="For Each run As BCTextRun In Runs";
{
final anywheresoftware.b4a.BA.IterableList group8 = _runs;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_run = (b4a.example.bctextengine._bctextrun)(group8.Get(index8));
RDebugUtils.currentLine=12582921;
 //BA.debugLineNum = 12582921;BA.debugLine="If run.Extra.IsInitialized And run.Extra.Contain";
if (_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && _run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(__ref._extra_connectedruns /*String*/ ))) { 
RDebugUtils.currentLine=12582922;
 //BA.debugLineNum = 12582922;BA.debugLine="HandleConnectedTextRuns(run, unbreakeables, Sty";
__ref._handleconnectedtextruns /*String*/ (null,_run,_unbreakeables,_style);
 }else {
RDebugUtils.currentLine=12582924;
 //BA.debugLineNum = 12582924;BA.debugLine="HandleTextRun(run, unbreakeables, Style)";
__ref._handletextrun /*String*/ (null,_run,_unbreakeables,_style);
 };
 }
};
RDebugUtils.currentLine=12582927;
 //BA.debugLineNum = 12582927;BA.debugLine="CreateLine(par)";
__ref._createline /*String*/ (null,_par);
RDebugUtils.currentLine=12582928;
 //BA.debugLineNum = 12582928;BA.debugLine="OrganizeUnbreakables(par, unbreakeables)";
__ref._organizeunbreakables /*String*/ (null,_par,_unbreakeables);
RDebugUtils.currentLine=12582929;
 //BA.debugLineNum = 12582929;BA.debugLine="OrganizeLines(par)";
__ref._organizelines /*String*/ (null,_par);
RDebugUtils.currentLine=12582930;
 //BA.debugLineNum = 12582930;BA.debugLine="OrganizeSingleStyles(par)";
__ref._organizesinglestyles /*String*/ (null,_par);
RDebugUtils.currentLine=12582931;
 //BA.debugLineNum = 12582931;BA.debugLine="If par.Style.RTL Then OrganizeRTLParagraph(par)";
if (_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/ ) { 
__ref._organizertlparagraph /*String*/ (null,_par);};
RDebugUtils.currentLine=12582932;
 //BA.debugLineNum = 12582932;BA.debugLine="Return par";
if (true) return _par;
RDebugUtils.currentLine=12582933;
 //BA.debugLineNum = 12582933;BA.debugLine="End Sub";
return null;
}
public String  _resizelayers(b4a.example.bctextengine __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "resizelayers", true))
	 {return ((String) Debug.delegate(ba, "resizelayers", new Object[] {_width,_height}));}
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Private Sub ResizeLayers (Width As Int, Height As";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="Width = Max(Width, 2) * mScale";
_width = (int) (__c.Max(_width,2)*__ref._mscale /*float*/ );
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="Height = Max(Height, 2) * mScale";
_height = (int) (__c.Max(_height,2)*__ref._mscale /*float*/ );
RDebugUtils.currentLine=12320771;
 //BA.debugLineNum = 12320771;BA.debugLine="If ForegroundBC.IsInitialized = False Or Width >";
if (__ref._foregroundbc /*b4a.example.bitmapcreator*/ .IsInitialized()==__c.False || _width>__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._mwidth || _height>__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._mheight) { 
RDebugUtils.currentLine=12320772;
 //BA.debugLineNum = 12320772;BA.debugLine="If ForegroundBC.IsInitialized Then";
if (__ref._foregroundbc /*b4a.example.bitmapcreator*/ .IsInitialized()) { 
RDebugUtils.currentLine=12320773;
 //BA.debugLineNum = 12320773;BA.debugLine="Width = Max(Width, ForegroundBC.mWidth)";
_width = (int) (__c.Max(_width,__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._mwidth));
RDebugUtils.currentLine=12320774;
 //BA.debugLineNum = 12320774;BA.debugLine="Height = Max(Height, ForegroundBC.mHeight)";
_height = (int) (__c.Max(_height,__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._mheight));
 };
RDebugUtils.currentLine=12320779;
 //BA.debugLineNum = 12320779;BA.debugLine="Brushes.Clear";
__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=12320780;
 //BA.debugLineNum = 12320780;BA.debugLine="ForegroundBC.Initialize(Width, Height)";
__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._initialize(ba,_width,_height);
 }else {
RDebugUtils.currentLine=12320782;
 //BA.debugLineNum = 12320782;BA.debugLine="ForegroundBC.DrawRect2(ForegroundBC.TargetRect,";
__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._drawrect2(__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._getbrush /*b4a.example.bcpath._bcbrush*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent),__c.True,(int) (0));
 };
RDebugUtils.currentLine=12320784;
 //BA.debugLineNum = 12320784;BA.debugLine="End Sub";
return "";
}
public String  _resizeimageview(b4a.example.bctextengine __ref,b4a.example.bitmapcreator _bc,b4a.example.bctextengine._bcparagraph _par,anywheresoftware.b4a.objects.B4XViewWrapper _iv,boolean _resizeheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "resizeimageview", true))
	 {return ((String) Debug.delegate(ba, "resizeimageview", new Object[] {_bc,_par,_iv,_resizeheight}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
int _ivheight = 0;
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Private Sub ResizeImageView (bc As BitmapCreator,";
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="Dim bmp As B4XBitmap = bc.Bitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _bc._getbitmap();
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="Dim ivHeight As Int = par.Height / mScale";
_ivheight = (int) (_par.Height /*int*/ /(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=12845059;
 //BA.debugLineNum = 12845059;BA.debugLine="If ResizeHeight = False Then ivHeight = Min(ivHei";
if (_resizeheight==__c.False) { 
_ivheight = (int) (__c.Min(_ivheight,_iv.getParent().getHeight()-_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()-_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getBottom()));};
RDebugUtils.currentLine=12845060;
 //BA.debugLineNum = 12845060;BA.debugLine="iv.SetLayoutAnimated(0, par.Style.Padding.Left, p";
_iv.SetLayoutAnimated((int) (0),(int) (_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()),(int) (_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()),(int) (_par.Width /*int*/ /(double)__ref._mscale /*float*/ ),_ivheight);
RDebugUtils.currentLine=12845061;
 //BA.debugLineNum = 12845061;BA.debugLine="bc.SetBitmapToImageView(bmp.Crop(0, 0, iv.Width *";
_bc._setbitmaptoimageview(_bmp.Crop((int) (0),(int) (0),(int) (_iv.getWidth()*__ref._mscale /*float*/ ),(int) (_iv.getHeight()*__ref._mscale /*float*/ )),_iv);
RDebugUtils.currentLine=12845062;
 //BA.debugLineNum = 12845062;BA.debugLine="End Sub";
return "";
}
public String  _fonttokey(b4a.example.bctextengine __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "fonttokey", true))
	 {return ((String) Debug.delegate(ba, "fonttokey", new Object[] {_fnt,_clr}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Private Sub FontToKey (fnt As B4XFont, Clr As Int)";
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="Dim jo As JavaObject = fnt.ToNativeFont";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_fnt.ToNativeFont().getObject()));
RDebugUtils.currentLine=15204355;
 //BA.debugLineNum = 15204355;BA.debugLine="Return Clr + jo.RunMethod(\"hashCode\", Null) + fnt";
if (true) return BA.NumberToString(_clr+(double)(BA.ObjectToNumber(_jo.RunMethod("hashCode",(Object[])(__c.Null))))+_fnt.getSize());
RDebugUtils.currentLine=15204361;
 //BA.debugLineNum = 15204361;BA.debugLine="End Sub";
return "";
}
public b4a.example.bctextengine._bcsinglestylesection  _getfirstsinglestyle(b4a.example.bctextengine __ref,b4a.example.bctextengine._bctextline _line) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getfirstsinglestyle", true))
	 {return ((b4a.example.bctextengine._bcsinglestylesection) Debug.delegate(ba, "getfirstsinglestyle", new Object[] {_line}));}
b4a.example.bctextengine._bcunbreakabletext _firstun = null;
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Private Sub GetFirstSingleStyle (Line As BCTextLin";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Dim FirstUN As BCUnbreakableText = Line.Unbreakab";
_firstun = (b4a.example.bctextengine._bcunbreakabletext)(_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="Return FirstUN.SingleStyleSections.Get(0)";
if (true) return (b4a.example.bctextengine._bcsinglestylesection)(_firstun.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="End Sub";
return null;
}
public float  _getspacebetweencharacters(b4a.example.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getspacebetweencharacters", true))
	 {return ((Float) Debug.delegate(ba, "getspacebetweencharacters", null));}
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Public Sub getSpaceBetweenCharacters As Float";
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="Return mSpaceBetweenCharacters / mScale";
if (true) return (float) (__ref._mspacebetweencharacters /*float*/ /(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="End Sub";
return 0f;
}
public float  _getspacebetweenlines(b4a.example.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getspacebetweenlines", true))
	 {return ((Float) Debug.delegate(ba, "getspacebetweenlines", null));}
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Public Sub getSpaceBetweenLines As Float";
RDebugUtils.currentLine=15400961;
 //BA.debugLineNum = 15400961;BA.debugLine="Return mSpaceBetweenLines / mScale";
if (true) return (float) (__ref._mspacebetweenlines /*int*/ /(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="End Sub";
return 0f;
}
public String  _handleconnectedtextruns(b4a.example.bctextengine __ref,b4a.example.bctextengine._bctextrun _run,anywheresoftware.b4a.objects.collections.List _unbreakables,b4a.example.bctextengine._bcparagraphstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "handleconnectedtextruns", true))
	 {return ((String) Debug.delegate(ba, "handleconnectedtextruns", new Object[] {_run,_unbreakables,_style}));}
anywheresoftware.b4a.objects.collections.List _children = null;
b4a.example.bctextengine._bcconnectedruns _cr = null;
b4a.example.bctextengine._bctextrun _r = null;
int _width = 0;
b4a.example.bctextengine._bcunbreakabletext _un = null;
b4a.example.bctextengine._bcfontmetrics _fm = null;
int _connectedwidth = 0;
b4a.example.bctextengine._bcunbreakabletext _u = null;
int _i = 0;
int _leftoffset = 0;
b4a.example.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Private Sub HandleConnectedTextRuns (Run As BCText";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="Dim children As List";
_children = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="children.Initialize";
_children.Initialize();
RDebugUtils.currentLine=13369347;
 //BA.debugLineNum = 13369347;BA.debugLine="Dim cr As BCConnectedRuns = Run.EXTRA.Get(EXTRA_C";
_cr = (b4a.example.bctextengine._bcconnectedruns)(_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._extra_connectedruns /*String*/ )));
RDebugUtils.currentLine=13369348;
 //BA.debugLineNum = 13369348;BA.debugLine="For Each r As BCTextRun In cr.Runs";
{
final anywheresoftware.b4a.BA.IterableList group4 = _cr.Runs /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_r = (b4a.example.bctextengine._bctextrun)(group4.Get(index4));
RDebugUtils.currentLine=13369349;
 //BA.debugLineNum = 13369349;BA.debugLine="HandleTextRun(r, children, Style)";
__ref._handletextrun /*String*/ (null,_r,_children,_style);
 }
};
RDebugUtils.currentLine=13369351;
 //BA.debugLineNum = 13369351;BA.debugLine="Dim width As Int";
_width = 0;
RDebugUtils.currentLine=13369352;
 //BA.debugLineNum = 13369352;BA.debugLine="For Each un As BCUnbreakableText In children";
{
final anywheresoftware.b4a.BA.IterableList group8 = _children;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_un = (b4a.example.bctextengine._bcunbreakabletext)(group8.Get(index8));
RDebugUtils.currentLine=13369353;
 //BA.debugLineNum = 13369353;BA.debugLine="un.IsMergable = True";
_un.IsMergable /*boolean*/  = __c.True;
RDebugUtils.currentLine=13369354;
 //BA.debugLineNum = 13369354;BA.debugLine="width = width + un.Width";
_width = (int) (_width+_un.Width /*int*/ );
 }
};
RDebugUtils.currentLine=13369356;
 //BA.debugLineNum = 13369356;BA.debugLine="Dim fm As BCFontMetrics = GetFontMetrics(Run.Text";
_fm = __ref._getfontmetrics /*b4a.example.bctextengine._bcfontmetrics*/ (null,_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_run.TextColor /*int*/ );
RDebugUtils.currentLine=13369357;
 //BA.debugLineNum = 13369357;BA.debugLine="Dim ConnectedWidth As Int = cr.ConnectedWidth * m";
_connectedwidth = (int) (_cr.ConnectedWidth /*int*/ *__ref._mscale /*float*/ );
RDebugUtils.currentLine=13369359;
 //BA.debugLineNum = 13369359;BA.debugLine="Dim u As BCUnbreakableText = children.Get(0)";
_u = (b4a.example.bctextengine._bcunbreakabletext)(_children.Get((int) (0)));
RDebugUtils.currentLine=13369360;
 //BA.debugLineNum = 13369360;BA.debugLine="For i = 1 To children.Size - 1";
{
final int step15 = 1;
final int limit15 = (int) (_children.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=13369361;
 //BA.debugLineNum = 13369361;BA.debugLine="MergeUnbreakables(u, children.Get(i))";
__ref._mergeunbreakables /*String*/ (null,_u,(b4a.example.bctextengine._bcunbreakabletext)(_children.Get(_i)));
 }
};
RDebugUtils.currentLine=13369363;
 //BA.debugLineNum = 13369363;BA.debugLine="If width < ConnectedWidth Then";
if (_width<_connectedwidth) { 
RDebugUtils.currentLine=13369364;
 //BA.debugLineNum = 13369364;BA.debugLine="Dim leftOffset As Int";
_leftoffset = 0;
RDebugUtils.currentLine=13369365;
 //BA.debugLineNum = 13369365;BA.debugLine="Select cr.Alignment.ToLowerCase";
switch (BA.switchObjectToInt(_cr.Alignment /*String*/ .toLowerCase(),"center","right")) {
case 0: {
RDebugUtils.currentLine=13369367;
 //BA.debugLineNum = 13369367;BA.debugLine="leftOffset = (ConnectedWidth - u.Width) / 2";
_leftoffset = (int) ((_connectedwidth-_u.Width /*int*/ )/(double)2);
 break; }
case 1: {
RDebugUtils.currentLine=13369369;
 //BA.debugLineNum = 13369369;BA.debugLine="leftOffset = ConnectedWidth - u.Width - mSpace";
_leftoffset = (int) (_connectedwidth-_u.Width /*int*/ -__ref._mspacebetweencharacters /*float*/ );
 break; }
}
;
RDebugUtils.currentLine=13369371;
 //BA.debugLineNum = 13369371;BA.debugLine="u.Width = ConnectedWidth";
_u.Width /*int*/  = _connectedwidth;
RDebugUtils.currentLine=13369372;
 //BA.debugLineNum = 13369372;BA.debugLine="If leftOffset > 0 Then";
if (_leftoffset>0) { 
RDebugUtils.currentLine=13369373;
 //BA.debugLineNum = 13369373;BA.debugLine="Dim single As BCSingleStyleSection = CreateSing";
_single = __ref._createsinglesection /*b4a.example.bctextengine._bcsinglestylesection*/ (null,_run,__ref._emptytextchars /*b4a.example.bctextengine._bctextchars*/ ,_fm);
RDebugUtils.currentLine=13369374;
 //BA.debugLineNum = 13369374;BA.debugLine="single.Width = leftOffset";
_single.Width /*int*/  = _leftoffset;
RDebugUtils.currentLine=13369375;
 //BA.debugLineNum = 13369375;BA.debugLine="u.SingleStyleSections.InsertAt(0, single)";
_u.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt((int) (0),(Object)(_single));
 };
 };
RDebugUtils.currentLine=13369378;
 //BA.debugLineNum = 13369378;BA.debugLine="u.IsMergable = False";
_u.IsMergable /*boolean*/  = __c.False;
RDebugUtils.currentLine=13369379;
 //BA.debugLineNum = 13369379;BA.debugLine="Unbreakables.Add(u)";
_unbreakables.Add((Object)(_u));
RDebugUtils.currentLine=13369380;
 //BA.debugLineNum = 13369380;BA.debugLine="End Sub";
return "";
}
public String  _handletextrun(b4a.example.bctextengine __ref,b4a.example.bctextengine._bctextrun _run,anywheresoftware.b4a.objects.collections.List _unbreakables,b4a.example.bctextengine._bcparagraphstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "handletextrun", true))
	 {return ((String) Debug.delegate(ba, "handletextrun", new Object[] {_run,_unbreakables,_style}));}
b4a.example.bctextengine._bcfontmetrics _fm = null;
int _i1 = 0;
int _i = 0;
String _c = "";
boolean _separatorgoestogetherwithtext = false;
int _offset = 0;
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Private Sub HandleTextRun (Run As BCTextRun, Unbre";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="Dim fm As BCFontMetrics = GetFontMetrics(Run.Text";
_fm = __ref._getfontmetrics /*b4a.example.bctextengine._bcfontmetrics*/ (null,_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_run.TextColor /*int*/ );
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="Dim i1 As Int";
_i1 = 0;
RDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="For i = 0 To Run.TextChars.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_run.TextChars /*b4a.example.bctextengine._bctextchars*/ .Length /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=13434884;
 //BA.debugLineNum = 13434884;BA.debugLine="Dim c As String = Run.TextChars.Buffer(Run.TextC";
_c = _run.TextChars /*b4a.example.bctextengine._bctextchars*/ .Buffer /*String[]*/ [(int) (_run.TextChars /*b4a.example.bctextengine._bctextchars*/ .StartIndex /*int*/ +_i)];
RDebugUtils.currentLine=13434885;
 //BA.debugLineNum = 13434885;BA.debugLine="If WordBoundaries.Contains(c) Then";
if (__ref._wordboundaries /*String*/ .contains(_c)) { 
RDebugUtils.currentLine=13434886;
 //BA.debugLineNum = 13434886;BA.debugLine="Dim SeparatorGoesTogetherWithText As Boolean";
_separatorgoestogetherwithtext = false;
RDebugUtils.currentLine=13434887;
 //BA.debugLineNum = 13434887;BA.debugLine="If i >= i1 + 1 Then";
if (_i>=_i1+1) { 
RDebugUtils.currentLine=13434888;
 //BA.debugLineNum = 13434888;BA.debugLine="Dim offset As Int";
_offset = 0;
RDebugUtils.currentLine=13434889;
 //BA.debugLineNum = 13434889;BA.debugLine="If WordBoundariesThatCanConnectToPrevWord.Inde";
if (__ref._wordboundariesthatcanconnecttoprevword /*String*/ .indexOf(_c)>-1) { 
RDebugUtils.currentLine=13434890;
 //BA.debugLineNum = 13434890;BA.debugLine="offset = 1";
_offset = (int) (1);
RDebugUtils.currentLine=13434891;
 //BA.debugLineNum = 13434891;BA.debugLine="SeparatorGoesTogetherWithText = True";
_separatorgoestogetherwithtext = __c.True;
 };
RDebugUtils.currentLine=13434893;
 //BA.debugLineNum = 13434893;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, TextCh";
_unbreakables.Add((Object)(__ref._createunbreakable /*b4a.example.bctextengine._bcunbreakabletext*/ (null,_run,__ref._textcharssubstring /*b4a.example.bctextengine._bctextchars*/ (null,_run.TextChars /*b4a.example.bctextengine._bctextchars*/ ,_i1,(int) (_i+_offset)),_fm,__c.True,_style)));
 };
RDebugUtils.currentLine=13434895;
 //BA.debugLineNum = 13434895;BA.debugLine="If SeparatorGoesTogetherWithText = False Then";
if (_separatorgoestogetherwithtext==__c.False) { 
RDebugUtils.currentLine=13434896;
 //BA.debugLineNum = 13434896;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, TextCh";
_unbreakables.Add((Object)(__ref._createunbreakable /*b4a.example.bctextengine._bcunbreakabletext*/ (null,_run,__ref._textcharssubstring /*b4a.example.bctextengine._bctextchars*/ (null,_run.TextChars /*b4a.example.bctextengine._bctextchars*/ ,_i,(int) (_i+1)),_fm,__c.True,_style)));
 }else {
RDebugUtils.currentLine=13434898;
 //BA.debugLineNum = 13434898;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, EmptyT";
_unbreakables.Add((Object)(__ref._createunbreakable /*b4a.example.bctextengine._bcunbreakabletext*/ (null,_run,__ref._emptytextchars /*b4a.example.bctextengine._bctextchars*/ ,_fm,__c.True,_style)));
 };
RDebugUtils.currentLine=13434900;
 //BA.debugLineNum = 13434900;BA.debugLine="i1 = i + 1";
_i1 = (int) (_i+1);
 }else 
{RDebugUtils.currentLine=13434901;
 //BA.debugLineNum = 13434901;BA.debugLine="Else If c = Chr(13) Then";
if ((_c).equals(BA.ObjectToString(__c.Chr((int) (13))))) { 
RDebugUtils.currentLine=13434902;
 //BA.debugLineNum = 13434902;BA.debugLine="Continue";
if (true) continue;
 }}
;
 }
};
RDebugUtils.currentLine=13434905;
 //BA.debugLineNum = 13434905;BA.debugLine="If i1 < Run.TextChars.Length Then Unbreakables.Ad";
if (_i1<_run.TextChars /*b4a.example.bctextengine._bctextchars*/ .Length /*int*/ ) { 
_unbreakables.Add((Object)(__ref._createunbreakable /*b4a.example.bctextengine._bcunbreakabletext*/ (null,_run,__ref._textcharssubstring /*b4a.example.bctextengine._bctextchars*/ (null,_run.TextChars /*b4a.example.bctextengine._bctextchars*/ ,_i1,_run.TextChars /*b4a.example.bctextengine._bctextchars*/ .Length /*int*/ ),_fm,__c.False,_style)));};
RDebugUtils.currentLine=13434906;
 //BA.debugLineNum = 13434906;BA.debugLine="If Run.View.IsInitialized Then";
if (_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=13434907;
 //BA.debugLineNum = 13434907;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, EmptyTex";
_unbreakables.Add((Object)(__ref._createunbreakable /*b4a.example.bctextengine._bcunbreakabletext*/ (null,_run,__ref._emptytextchars /*b4a.example.bctextengine._bctextchars*/ ,_fm,__c.False,_style)));
 };
RDebugUtils.currentLine=13434909;
 //BA.debugLineNum = 13434909;BA.debugLine="End Sub";
return "";
}
public String  _mergeunbreakables(b4a.example.bctextengine __ref,b4a.example.bctextengine._bcunbreakabletext _un1,b4a.example.bctextengine._bcunbreakabletext _un2) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "mergeunbreakables", true))
	 {return ((String) Debug.delegate(ba, "mergeunbreakables", new Object[] {_un1,_un2}));}
b4a.example.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Private Sub MergeUnbreakables (un1 As BCUnbreakabl";
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="un1.Width = un1.Width + un2.Width + mSpaceBetween";
_un1.Width /*int*/  = (int) (_un1.Width /*int*/ +_un2.Width /*int*/ +__ref._mspacebetweencharacters /*float*/ );
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="For Each single As BCSingleStyleSection In un2.Si";
{
final anywheresoftware.b4a.BA.IterableList group2 = _un2.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_single = (b4a.example.bctextengine._bcsinglestylesection)(group2.Get(index2));
RDebugUtils.currentLine=13697027;
 //BA.debugLineNum = 13697027;BA.debugLine="single.ParentUN = un1";
_single.ParentUN /*b4a.example.bctextengine._bcunbreakabletext*/  = _un1;
 }
};
RDebugUtils.currentLine=13697029;
 //BA.debugLineNum = 13697029;BA.debugLine="un1.SingleStyleSections.AddAll(un2.SingleStyleSec";
_un1.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(_un2.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=13697030;
 //BA.debugLineNum = 13697030;BA.debugLine="If un1.NotFullTextChars.Length = 0 Then un1.NotFu";
if (_un1.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ .Length /*int*/ ==0) { 
_un1.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/  = _un2.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ ;};
RDebugUtils.currentLine=13697031;
 //BA.debugLineNum = 13697031;BA.debugLine="End Sub";
return "";
}
public b4a.example.bctextengine._bctextchars  _textcharssubstring(b4a.example.bctextengine __ref,b4a.example.bctextengine._bctextchars _tc,int _startindex,int _endindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "textcharssubstring", true))
	 {return ((b4a.example.bctextengine._bctextchars) Debug.delegate(ba, "textcharssubstring", new Object[] {_tc,_startindex,_endindex}));}
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Private Sub TextCharsSubstring(TC As BCTextChars,";
RDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="Return CreateBCTextChars(TC.Buffer, StartIndex +";
if (true) return __ref._createbctextchars /*b4a.example.bctextengine._bctextchars*/ (null,_tc.Buffer /*String[]*/ ,(int) (_startindex+_tc.StartIndex /*int*/ ),(int) (_endindex-_startindex));
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.bctextengine __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
byte[] _b = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="CustomFonts.Initialize";
__ref._customfonts /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="VowelsCodePoints.Initialize";
__ref._vowelscodepoints /*b4a.example.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=12255235;
 //BA.debugLineNum = 12255235;BA.debugLine="EmptyTextChars = CreateBCTextCharsFromString(\"\")";
__ref._emptytextchars /*b4a.example.bctextengine._bctextchars*/  = __ref._createbctextcharsfromstring /*b4a.example.bctextengine._bctextchars*/ (null,"");
RDebugUtils.currentLine=12255236;
 //BA.debugLineNum = 12255236;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=12255237;
 //BA.debugLineNum = 12255237;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 2dip, 2dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=12255250;
 //BA.debugLineNum = 12255250;BA.debugLine="setSpaceBetweenCharacters(100dip / 100)";
__ref._setspacebetweencharacters /*String*/ (null,(float) (__c.DipToCurrent((int) (100))/(double)100));
RDebugUtils.currentLine=12255251;
 //BA.debugLineNum = 12255251;BA.debugLine="setSpaceBetweenLines(20dip)";
__ref._setspacebetweenlines /*String*/ (null,(float) (__c.DipToCurrent((int) (20))));
RDebugUtils.currentLine=12255252;
 //BA.debugLineNum = 12255252;BA.debugLine="cvs.Initialize(p)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(_p);
RDebugUtils.currentLine=12255253;
 //BA.debugLineNum = 12255253;BA.debugLine="ResizeCharBC(50dip * mScale, 50dip * mScale)";
__ref._resizecharbc /*String*/ (null,(int) (__c.DipToCurrent((int) (50))*__ref._mscale /*float*/ ),(int) (__c.DipToCurrent((int) (50))*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=12255254;
 //BA.debugLineNum = 12255254;BA.debugLine="Brushes.Initialize";
__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=12255255;
 //BA.debugLineNum = 12255255;BA.debugLine="ResizeLayers(200dip, 100dip)";
__ref._resizelayers /*String*/ (null,__c.DipToCurrent((int) (200)),__c.DipToCurrent((int) (100)));
RDebugUtils.currentLine=12255256;
 //BA.debugLineNum = 12255256;BA.debugLine="cbccache.Initialize";
__ref._cbccache /*b4a.example.bitmapcreator._internalcompressedbccache*/ .Initialize();
RDebugUtils.currentLine=12255257;
 //BA.debugLineNum = 12255257;BA.debugLine="cbccache.ColorsMap.Initialize";
__ref._cbccache /*b4a.example.bitmapcreator._internalcompressedbccache*/ .ColorsMap.Initialize();
RDebugUtils.currentLine=12255258;
 //BA.debugLineNum = 12255258;BA.debugLine="FontMetricsCache.Initialize";
__ref._fontmetricscache /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=12255259;
 //BA.debugLineNum = 12255259;BA.debugLine="Dim b(CharBC.SAME_COLOR_LENGTH_FOR_CACHE * 4 * Ch";
_b = new byte[(int) (__ref._charbc /*b4a.example.bitmapcreator*/ ._same_color_length_for_cache*4*__ref._charbc /*b4a.example.bitmapcreator*/ ._max_same_color_size+4)];
;
RDebugUtils.currentLine=12255260;
 //BA.debugLineNum = 12255260;BA.debugLine="cbccache.mBuffer = b";
__ref._cbccache /*b4a.example.bitmapcreator._internalcompressedbccache*/ .mBuffer = _b;
RDebugUtils.currentLine=12255261;
 //BA.debugLineNum = 12255261;BA.debugLine="DefaultFont = xui.CreateDefaultFont(16)";
__ref._defaultfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (16));
RDebugUtils.currentLine=12255262;
 //BA.debugLineNum = 12255262;BA.debugLine="DefaultStyle = CreateStyle";
__ref._defaultstyle /*b4a.example.bctextengine._bcparagraphstyle*/  = __ref._createstyle /*b4a.example.bctextengine._bcparagraphstyle*/ (null);
RDebugUtils.currentLine=12255263;
 //BA.debugLineNum = 12255263;BA.debugLine="TagParser.Initialize (Me)";
__ref._tagparser /*b4a.example.bbcodeparser*/ ._initialize /*String*/ (null,ba,(b4a.example.bctextengine)(this));
RDebugUtils.currentLine=12255264;
 //BA.debugLineNum = 12255264;BA.debugLine="DefaultUnderlineStyle.Initialize";
__ref._defaultunderlinestyle /*b4a.example.bctextengine._bcstyledunderline*/ .Initialize();
RDebugUtils.currentLine=12255265;
 //BA.debugLineNum = 12255265;BA.debugLine="DefaultUnderlineStyle.Clr = 0";
__ref._defaultunderlinestyle /*b4a.example.bctextengine._bcstyledunderline*/ .Clr /*int*/  = (int) (0);
RDebugUtils.currentLine=12255266;
 //BA.debugLineNum = 12255266;BA.debugLine="DefaultUnderlineStyle.Style = \"line\"";
__ref._defaultunderlinestyle /*b4a.example.bctextengine._bcstyledunderline*/ .Style /*String*/  = "line";
RDebugUtils.currentLine=12255267;
 //BA.debugLineNum = 12255267;BA.debugLine="DefaultUnderlineStyle.Thickness = 1dip";
__ref._defaultunderlinestyle /*b4a.example.bctextengine._bcstyledunderline*/ .Thickness /*float*/  = (float) (__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=12255268;
 //BA.debugLineNum = 12255268;BA.debugLine="For Each v As B4XView In Parent.GetAllViewsRecurs";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group24 = _parent.GetAllViewsRecursive();
final int groupLen24 = group24.getSize()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group24.Get(index24)));
RDebugUtils.currentLine=12255269;
 //BA.debugLineNum = 12255269;BA.debugLine="If v.Tag Is BBCodeView Or v.Tag Is BBLabel Then";
if (_v.getTag() instanceof b4a.example.bbcodeview || _v.getTag() instanceof b4a.example.bblabel) { 
RDebugUtils.currentLine=12255270;
 //BA.debugLineNum = 12255270;BA.debugLine="CallSub2(v.Tag, \"setTextEngine\", Me)";
__c.CallSubDebug2(ba,_v.getTag(),"setTextEngine",this);
 };
 }
};
RDebugUtils.currentLine=12255274;
 //BA.debugLineNum = 12255274;BA.debugLine="End Sub";
return "";
}
public String  _setspacebetweencharacters(b4a.example.bctextengine __ref,float _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "setspacebetweencharacters", true))
	 {return ((String) Debug.delegate(ba, "setspacebetweencharacters", new Object[] {_f}));}
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Public Sub setSpaceBetweenCharacters(f As Float)";
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="mSpaceBetweenCharacters = f * mScale";
__ref._mspacebetweencharacters /*float*/  = (float) (_f*__ref._mscale /*float*/ );
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="End Sub";
return "";
}
public String  _setspacebetweenlines(b4a.example.bctextengine __ref,float _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "setspacebetweenlines", true))
	 {return ((String) Debug.delegate(ba, "setspacebetweenlines", new Object[] {_f}));}
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Public Sub setSpaceBetweenLines(f As Float)";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="mSpaceBetweenLines = f * mScale";
__ref._mspacebetweenlines /*int*/  = (int) (_f*__ref._mscale /*float*/ );
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="End Sub";
return "";
}
public boolean  _isspace(b4a.example.bctextengine __ref,b4a.example.bctextengine._bctextchars _tc) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "isspace", true))
	 {return ((Boolean) Debug.delegate(ba, "isspace", new Object[] {_tc}));}
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Private Sub IsSpace(TC As BCTextChars) As Boolean";
RDebugUtils.currentLine=14680065;
 //BA.debugLineNum = 14680065;BA.debugLine="Return TextCharEquals(TC, \" \")";
if (true) return __ref._textcharequals /*boolean*/ (null,_tc," ");
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="End Sub";
return false;
}
public boolean  _textcharequals(b4a.example.bctextengine __ref,b4a.example.bctextengine._bctextchars _tc,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "textcharequals", true))
	 {return ((Boolean) Debug.delegate(ba, "textcharequals", new Object[] {_tc,_s}));}
int _i = 0;
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Private Sub TextCharEquals (TC As BCTextChars, s A";
RDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="If TC.Length <> s.Length Then Return False";
if (_tc.Length /*int*/ !=_s.length()) { 
if (true) return __c.False;};
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="For i = 0 To TC.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (_tc.Length /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=15728643;
 //BA.debugLineNum = 15728643;BA.debugLine="If TC.Buffer(i + TC.StartIndex) <> s.CharAt(i) T";
if ((_tc.Buffer /*String[]*/ [(int) (_i+_tc.StartIndex /*int*/ )]).equals(BA.ObjectToString(_s.charAt(_i))) == false) { 
if (true) return __c.False;};
 }
};
RDebugUtils.currentLine=15728645;
 //BA.debugLineNum = 15728645;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=15728646;
 //BA.debugLineNum = 15728646;BA.debugLine="End Sub";
return false;
}
public String  _organizelines(b4a.example.bctextengine __ref,b4a.example.bctextengine._bcparagraph _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "organizelines", true))
	 {return ((String) Debug.delegate(ba, "organizelines", new Object[] {_p}));}
String _paralignment = "";
int _count = 0;
int _prevlinebelowbaselineheight = 0;
b4a.example.bctextengine._bctextline _line = null;
b4a.example.bctextengine._bcunbreakabletext _un = null;
b4a.example.bctextengine._bcsinglestylesection _single = null;
int _maxwidth = 0;
String _alignment = "";
b4a.example.bctextengine._bcsinglestylesection _linestyle = null;
b4a.example.bctextengine._bcunbreakabletext _last = null;
int _numberofgaps = 0;
float _delta = 0f;
float _accumalated = 0f;
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Private Sub OrganizeLines (p As BCParagraph)";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="Dim ParAlignment As String = p.Style.HorizontalAl";
_paralignment = _p.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .HorizontalAlignment /*String*/ .toLowerCase();
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="Dim count As Int";
_count = 0;
RDebugUtils.currentLine=12910595;
 //BA.debugLineNum = 12910595;BA.debugLine="Dim PrevLineBelowBaselineHeight As Int";
_prevlinebelowbaselineheight = 0;
RDebugUtils.currentLine=12910596;
 //BA.debugLineNum = 12910596;BA.debugLine="For Each line As BCTextLine In p.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group4 = _p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_line = (b4a.example.bctextengine._bctextline)(group4.Get(index4));
RDebugUtils.currentLine=12910597;
 //BA.debugLineNum = 12910597;BA.debugLine="p.Width = Max(p.Width, line.Width)";
_p.Width /*int*/  = (int) (__c.Max(_p.Width /*int*/ ,_line.Width /*int*/ ));
RDebugUtils.currentLine=12910598;
 //BA.debugLineNum = 12910598;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group6 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_un = (b4a.example.bctextengine._bcunbreakabletext)(group6.Get(index6));
RDebugUtils.currentLine=12910599;
 //BA.debugLineNum = 12910599;BA.debugLine="For Each single As BCSingleStyleSection In un.S";
{
final anywheresoftware.b4a.BA.IterableList group7 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_single = (b4a.example.bctextengine._bcsinglestylesection)(group7.Get(index7));
RDebugUtils.currentLine=12910600;
 //BA.debugLineNum = 12910600;BA.debugLine="line.MaxHeightAboveBaseLine = Max(single.MaxHe";
_line.MaxHeightAboveBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightAboveBaseLine /*int*/ ,_line.MaxHeightAboveBaseLine /*int*/ ));
RDebugUtils.currentLine=12910601;
 //BA.debugLineNum = 12910601;BA.debugLine="line.MaxHeightBelowBaseLine = Max(single.MaxHe";
_line.MaxHeightBelowBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightBelowBaseLine /*int*/ ,_line.MaxHeightBelowBaseLine /*int*/ ));
 }
};
 }
};
RDebugUtils.currentLine=12910604;
 //BA.debugLineNum = 12910604;BA.debugLine="If count = 0 Then";
if (_count==0) { 
RDebugUtils.currentLine=12910605;
 //BA.debugLineNum = 12910605;BA.debugLine="line.Height = line.MaxHeightAboveBaseLine";
_line.Height /*int*/  = _line.MaxHeightAboveBaseLine /*int*/ ;
 }else {
RDebugUtils.currentLine=12910607;
 //BA.debugLineNum = 12910607;BA.debugLine="line.Height =  Max(line.MaxHeightAboveBaseLine";
_line.Height /*int*/  = (int) (__c.Max(_line.MaxHeightAboveBaseLine /*int*/ +_prevlinebelowbaselineheight+__ref._mingapbetweenlines /*int*/ *__ref._mscale /*float*/ ,__ref._mspacebetweenlines /*int*/ *_p.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .LineSpacingFactor /*float*/ ));
 };
RDebugUtils.currentLine=12910609;
 //BA.debugLineNum = 12910609;BA.debugLine="p.Height = p.Height + line.Height";
_p.Height /*int*/  = (int) (_p.Height /*int*/ +_line.Height /*int*/ );
RDebugUtils.currentLine=12910610;
 //BA.debugLineNum = 12910610;BA.debugLine="line.BaselineY = p.Height";
_line.BaselineY /*int*/  = _p.Height /*int*/ ;
RDebugUtils.currentLine=12910611;
 //BA.debugLineNum = 12910611;BA.debugLine="PrevLineBelowBaselineHeight = line.MaxHeightBelo";
_prevlinebelowbaselineheight = _line.MaxHeightBelowBaseLine /*int*/ ;
RDebugUtils.currentLine=12910612;
 //BA.debugLineNum = 12910612;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
 }
};
RDebugUtils.currentLine=12910614;
 //BA.debugLineNum = 12910614;BA.debugLine="Dim MaxWidth As Int = (p.Style.MaxWidth - p.Style";
_maxwidth = (int) ((_p.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .MaxWidth /*int*/ -_p.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()-_p.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getRight())*__ref._mscale /*float*/ );
RDebugUtils.currentLine=12910615;
 //BA.debugLineNum = 12910615;BA.debugLine="p.Width = Min(MaxWidth, p.Width)";
_p.Width /*int*/  = (int) (__c.Min(_maxwidth,_p.Width /*int*/ ));
RDebugUtils.currentLine=12910616;
 //BA.debugLineNum = 12910616;BA.debugLine="p.Height = p.Height + line.MaxHeightBelowBaseLine";
_p.Height /*int*/  = (int) (_p.Height /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ );
RDebugUtils.currentLine=12910617;
 //BA.debugLineNum = 12910617;BA.debugLine="Dim alignment As String";
_alignment = "";
RDebugUtils.currentLine=12910618;
 //BA.debugLineNum = 12910618;BA.debugLine="For Each line As BCTextLine In p.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group26 = _p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen26 = group26.getSize()
;int index26 = 0;
;
for (; index26 < groupLen26;index26++){
_line = (b4a.example.bctextengine._bctextline)(group26.Get(index26));
RDebugUtils.currentLine=12910619;
 //BA.debugLineNum = 12910619;BA.debugLine="If line.Unbreakables.Size = 0 Then Continue";
if (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) continue;};
RDebugUtils.currentLine=12910620;
 //BA.debugLineNum = 12910620;BA.debugLine="Dim linestyle As BCSingleStyleSection = GetFirst";
_linestyle = __ref._getfirstsinglestyle /*b4a.example.bctextengine._bcsinglestylesection*/ (null,_line);
RDebugUtils.currentLine=12910621;
 //BA.debugLineNum = 12910621;BA.debugLine="If linestyle.Run.HorizontalAlignment = \"\" Then a";
if ((_linestyle.Run /*b4a.example.bctextengine._bctextrun*/ .HorizontalAlignment /*String*/ ).equals("")) { 
_alignment = _paralignment;}
else {
_alignment = _linestyle.Run /*b4a.example.bctextengine._bctextrun*/ .HorizontalAlignment /*String*/ .toLowerCase();};
RDebugUtils.currentLine=12910622;
 //BA.debugLineNum = 12910622;BA.debugLine="If alignment = \"left\" Then";
if ((_alignment).equals("left")) { 
RDebugUtils.currentLine=12910623;
 //BA.debugLineNum = 12910623;BA.debugLine="If linestyle.Run.IndentLevel > 0 Then";
if (_linestyle.Run /*b4a.example.bctextengine._bctextrun*/ .IndentLevel /*int*/ >0) { 
RDebugUtils.currentLine=12910624;
 //BA.debugLineNum = 12910624;BA.debugLine="line.StartX = IndentWidth * linestyle.Run.Inde";
_line.StartX /*int*/  = (int) (__ref._indentwidth /*int*/ *_linestyle.Run /*b4a.example.bctextengine._bctextrun*/ .IndentLevel /*int*/ );
RDebugUtils.currentLine=12910625;
 //BA.debugLineNum = 12910625;BA.debugLine="p.Width = Max(p.Width, Min(MaxWidth, line.Widt";
_p.Width /*int*/  = (int) (__c.Max(_p.Width /*int*/ ,__c.Min(_maxwidth,_line.Width /*int*/ +_line.StartX /*int*/ )));
 };
 }else {
RDebugUtils.currentLine=12910628;
 //BA.debugLineNum = 12910628;BA.debugLine="p.Width = MaxWidth";
_p.Width /*int*/  = _maxwidth;
 };
RDebugUtils.currentLine=12910630;
 //BA.debugLineNum = 12910630;BA.debugLine="Select alignment";
switch (BA.switchObjectToInt(_alignment,"center","right","justify")) {
case 0: {
RDebugUtils.currentLine=12910632;
 //BA.debugLineNum = 12910632;BA.debugLine="line.StartX = p.Width / 2 - line.Width / 2";
_line.StartX /*int*/  = (int) (_p.Width /*int*/ /(double)2-_line.Width /*int*/ /(double)2);
 break; }
case 1: {
RDebugUtils.currentLine=12910634;
 //BA.debugLineNum = 12910634;BA.debugLine="line.StartX = p.Width - line.Width";
_line.StartX /*int*/  = (int) (_p.Width /*int*/ -_line.Width /*int*/ );
 break; }
case 2: {
RDebugUtils.currentLine=12910636;
 //BA.debugLineNum = 12910636;BA.debugLine="If line.EndsWithSoftLineBreak Then";
if (_line.EndsWithSoftLineBreak /*boolean*/ ) { 
RDebugUtils.currentLine=12910637;
 //BA.debugLineNum = 12910637;BA.debugLine="Dim last As BCUnbreakableText = line.Unbreaka";
_last = (b4a.example.bctextengine._bcunbreakabletext)(_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=12910638;
 //BA.debugLineNum = 12910638;BA.debugLine="If IsSpace(last.NotFullTextChars) Then";
if (__ref._isspace /*boolean*/ (null,_last.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ )) { 
RDebugUtils.currentLine=12910639;
 //BA.debugLineNum = 12910639;BA.debugLine="line.Unbreakables.RemoveAt(line.Unbreakables";
_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=12910640;
 //BA.debugLineNum = 12910640;BA.debugLine="line.Width = line.Width - last.Width";
_line.Width /*int*/  = (int) (_line.Width /*int*/ -_last.Width /*int*/ );
 };
RDebugUtils.currentLine=12910642;
 //BA.debugLineNum = 12910642;BA.debugLine="Dim NumberOfGaps As Int = line.Unbreakables.S";
_numberofgaps = (int) (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
RDebugUtils.currentLine=12910643;
 //BA.debugLineNum = 12910643;BA.debugLine="If NumberOfGaps > 0 Then";
if (_numberofgaps>0) { 
RDebugUtils.currentLine=12910644;
 //BA.debugLineNum = 12910644;BA.debugLine="Dim delta As Float = (p.Width - line.Width)";
_delta = (float) ((_p.Width /*int*/ -_line.Width /*int*/ )/(double)_numberofgaps);
RDebugUtils.currentLine=12910645;
 //BA.debugLineNum = 12910645;BA.debugLine="Dim accumalated As Float = 0";
_accumalated = (float) (0);
RDebugUtils.currentLine=12910646;
 //BA.debugLineNum = 12910646;BA.debugLine="For Each un As BCUnbreakableText In line.Unb";
{
final anywheresoftware.b4a.BA.IterableList group54 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen54 = group54.getSize()
;int index54 = 0;
;
for (; index54 < groupLen54;index54++){
_un = (b4a.example.bctextengine._bcunbreakabletext)(group54.Get(index54));
RDebugUtils.currentLine=12910647;
 //BA.debugLineNum = 12910647;BA.debugLine="un.StartX = un.StartX + accumalated";
_un.StartX /*int*/  = (int) (_un.StartX /*int*/ +_accumalated);
RDebugUtils.currentLine=12910648;
 //BA.debugLineNum = 12910648;BA.debugLine="accumalated = accumalated + delta";
_accumalated = (float) (_accumalated+_delta);
 }
};
 };
 };
 break; }
}
;
 }
};
RDebugUtils.currentLine=12910654;
 //BA.debugLineNum = 12910654;BA.debugLine="End Sub";
return "";
}
public String  _organizertlparagraph(b4a.example.bctextengine __ref,b4a.example.bctextengine._bcparagraph _par) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "organizertlparagraph", true))
	 {return ((String) Debug.delegate(ba, "organizertlparagraph", new Object[] {_par}));}
anywheresoftware.b4a.objects.collections.List _ltrlist = null;
b4a.example.bctextengine._bctextline _line = null;
anywheresoftware.b4a.objects.collections.List _newlist = null;
b4a.example.bctextengine._bcunbreakabletext _un = null;
int _x = 0;
b4a.example.bctextengine._bcsinglestylesection _single = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Private Sub OrganizeRTLParagraph (par As BCParagra";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="Dim LTRList As List";
_ltrlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="LTRList.Initialize";
_ltrlist.Initialize();
RDebugUtils.currentLine=12976132;
 //BA.debugLineNum = 12976132;BA.debugLine="For Each line As BCTextLine In par.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group3 = _par.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_line = (b4a.example.bctextengine._bctextline)(group3.Get(index3));
RDebugUtils.currentLine=12976133;
 //BA.debugLineNum = 12976133;BA.debugLine="Dim NewList As List";
_newlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12976134;
 //BA.debugLineNum = 12976134;BA.debugLine="NewList.Initialize";
_newlist.Initialize();
RDebugUtils.currentLine=12976138;
 //BA.debugLineNum = 12976138;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group6 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_un = (b4a.example.bctextengine._bcunbreakabletext)(group6.Get(index6));
RDebugUtils.currentLine=12976139;
 //BA.debugLineNum = 12976139;BA.debugLine="If un.RTL Then";
if (_un.RTL /*boolean*/ ) { 
RDebugUtils.currentLine=12976140;
 //BA.debugLineNum = 12976140;BA.debugLine="AddLTRItems(LTRList, NewList)";
__ref._addltritems /*String*/ (null,_ltrlist,_newlist);
RDebugUtils.currentLine=12976141;
 //BA.debugLineNum = 12976141;BA.debugLine="NewList.Add(un)";
_newlist.Add((Object)(_un));
 }else {
RDebugUtils.currentLine=12976143;
 //BA.debugLineNum = 12976143;BA.debugLine="LTRList.InsertAt(0, un)";
_ltrlist.InsertAt((int) (0),(Object)(_un));
 };
 }
};
RDebugUtils.currentLine=12976146;
 //BA.debugLineNum = 12976146;BA.debugLine="AddLTRItems(LTRList, NewList)";
__ref._addltritems /*String*/ (null,_ltrlist,_newlist);
RDebugUtils.currentLine=12976147;
 //BA.debugLineNum = 12976147;BA.debugLine="line.Unbreakables = NewList";
_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/  = _newlist;
RDebugUtils.currentLine=12976152;
 //BA.debugLineNum = 12976152;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group16 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_un = (b4a.example.bctextengine._bcunbreakabletext)(group16.Get(index16));
RDebugUtils.currentLine=12976153;
 //BA.debugLineNum = 12976153;BA.debugLine="un.StartX = line.Width - un.StartX";
_un.StartX /*int*/  = (int) (_line.Width /*int*/ -_un.StartX /*int*/ );
RDebugUtils.currentLine=12976154;
 //BA.debugLineNum = 12976154;BA.debugLine="Dim x As Int = line.StartX + un.StartX";
_x = (int) (_line.StartX /*int*/ +_un.StartX /*int*/ );
RDebugUtils.currentLine=12976155;
 //BA.debugLineNum = 12976155;BA.debugLine="For Each single As BCSingleStyleSection In un.S";
{
final anywheresoftware.b4a.BA.IterableList group19 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_single = (b4a.example.bctextengine._bcsinglestylesection)(group19.Get(index19));
RDebugUtils.currentLine=12976156;
 //BA.debugLineNum = 12976156;BA.debugLine="x = x - single.Width";
_x = (int) (_x-_single.Width /*int*/ );
RDebugUtils.currentLine=12976157;
 //BA.debugLineNum = 12976157;BA.debugLine="single.AbsoluteStartX = x";
_single.AbsoluteStartX /*int*/  = _x;
RDebugUtils.currentLine=12976158;
 //BA.debugLineNum = 12976158;BA.debugLine="x = x - mSpaceBetweenCharacters";
_x = (int) (_x-__ref._mspacebetweencharacters /*float*/ );
RDebugUtils.currentLine=12976159;
 //BA.debugLineNum = 12976159;BA.debugLine="If single.Run.View.IsInitialized Then";
if (_single.Run /*b4a.example.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=12976160;
 //BA.debugLineNum = 12976160;BA.debugLine="Dim v As B4XView = single.Run.View";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = _single.Run /*b4a.example.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=12976161;
 //BA.debugLineNum = 12976161;BA.debugLine="v.Left = (x + mSpaceBetweenCharacters) / mSca";
_v.setLeft((int) ((_x+__ref._mspacebetweencharacters /*float*/ )/(double)__ref._mscale /*float*/ ));
 };
 }
};
 }
};
 }
};
RDebugUtils.currentLine=12976166;
 //BA.debugLineNum = 12976166;BA.debugLine="End Sub";
return "";
}
public String  _organizesinglestyles(b4a.example.bctextengine __ref,b4a.example.bctextengine._bcparagraph _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "organizesinglestyles", true))
	 {return ((String) Debug.delegate(ba, "organizesinglestyles", new Object[] {_p}));}
b4a.example.bctextengine._bctextline _line = null;
b4a.example.bctextengine._bcunbreakabletext _un = null;
int _x = 0;
b4a.example.bctextengine._bcsinglestylesection _single = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
b4a.example.bctextengine._bcparagraph _par = null;
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Private Sub OrganizeSingleStyles (p As BCParagraph";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="For Each line As BCTextLine In p.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group1 = _p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (b4a.example.bctextengine._bctextline)(group1.Get(index1));
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group2 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_un = (b4a.example.bctextengine._bcunbreakabletext)(group2.Get(index2));
RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="Dim x As Int = line.StartX + un.StartX";
_x = (int) (_line.StartX /*int*/ +_un.StartX /*int*/ );
RDebugUtils.currentLine=13172740;
 //BA.debugLineNum = 13172740;BA.debugLine="For Each single As BCSingleStyleSection In un.S";
{
final anywheresoftware.b4a.BA.IterableList group4 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_single = (b4a.example.bctextengine._bcsinglestylesection)(group4.Get(index4));
RDebugUtils.currentLine=13172741;
 //BA.debugLineNum = 13172741;BA.debugLine="single.AbsoluteStartX = x";
_single.AbsoluteStartX /*int*/  = _x;
RDebugUtils.currentLine=13172742;
 //BA.debugLineNum = 13172742;BA.debugLine="If single.GlyphsAndOffsets.Size = 0 And single";
if (_single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0 && _single.Run /*b4a.example.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=13172743;
 //BA.debugLineNum = 13172743;BA.debugLine="Dim v As B4XView = single.Run.View";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = _single.Run /*b4a.example.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=13172744;
 //BA.debugLineNum = 13172744;BA.debugLine="Dim par As BCParagraph = single.ParentUN.Pare";
_par = _single.ParentUN /*b4a.example.bctextengine._bcunbreakabletext*/ .ParentLine /*b4a.example.bctextengine._bctextline*/ .ParentParagraph /*b4a.example.bctextengine._bcparagraph*/ ;
RDebugUtils.currentLine=13172745;
 //BA.debugLineNum = 13172745;BA.debugLine="If par.Views.IsInitialized = False Then par.V";
if (_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=13172746;
 //BA.debugLineNum = 13172746;BA.debugLine="v.Left = (x + mSpaceBetweenCharacters) / mSca";
_v.setLeft((int) ((_x+__ref._mspacebetweencharacters /*float*/ )/(double)__ref._mscale /*float*/ ));
RDebugUtils.currentLine=13172747;
 //BA.debugLineNum = 13172747;BA.debugLine="v.Top = line.BaselineY / mScale - v.Height +";
_v.setTop((int) (_line.BaselineY /*int*/ /(double)__ref._mscale /*float*/ -_v.getHeight()+_single.Run /*b4a.example.bctextengine._bctextrun*/ .VerticalOffset /*int*/ ));
RDebugUtils.currentLine=13172748;
 //BA.debugLineNum = 13172748;BA.debugLine="par.Views.Add(v)";
_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_v.getObject()));
 };
RDebugUtils.currentLine=13172750;
 //BA.debugLineNum = 13172750;BA.debugLine="x = x + single.Width + mSpaceBetweenCharacters";
_x = (int) (_x+_single.Width /*int*/ +__ref._mspacebetweencharacters /*float*/ );
 }
};
 }
};
 }
};
RDebugUtils.currentLine=13172754;
 //BA.debugLineNum = 13172754;BA.debugLine="End Sub";
return "";
}
public String  _organizeunbreakables(b4a.example.bctextengine __ref,b4a.example.bctextengine._bcparagraph _p,anywheresoftware.b4a.objects.collections.List _unbreakables) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "organizeunbreakables", true))
	 {return ((String) Debug.delegate(ba, "organizeunbreakables", new Object[] {_p,_unbreakables}));}
b4a.example.bctextengine._bcunbreakabletext _un = null;
int _i = 0;
b4a.example.bctextengine._bcunbreakabletext _nextun = null;
b4a.example.bctextengine._bcsinglestylesection _singlestyle = null;
int _indent = 0;
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Private Sub OrganizeUnbreakables (p As BCParagraph";
RDebugUtils.currentLine=13631489;
 //BA.debugLineNum = 13631489;BA.debugLine="If unbreakables.Size = 0 Then Return";
if (_unbreakables.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="Dim un As BCUnbreakableText = unbreakables.Get(0)";
_un = (b4a.example.bctextengine._bcunbreakabletext)(_unbreakables.Get((int) (0)));
RDebugUtils.currentLine=13631491;
 //BA.debugLineNum = 13631491;BA.debugLine="Dim i As Int = 1";
_i = (int) (1);
RDebugUtils.currentLine=13631492;
 //BA.debugLineNum = 13631492;BA.debugLine="Do While i < unbreakables.Size";
while (_i<_unbreakables.getSize()) {
RDebugUtils.currentLine=13631493;
 //BA.debugLineNum = 13631493;BA.debugLine="Dim NextUn As BCUnbreakableText = unbreakables.G";
_nextun = (b4a.example.bctextengine._bcunbreakabletext)(_unbreakables.Get(_i));
RDebugUtils.currentLine=13631494;
 //BA.debugLineNum = 13631494;BA.debugLine="If un.IsMergable = True And NextUn.IsMergable =";
if (_un.IsMergable /*boolean*/ ==__c.True && _nextun.IsMergable /*boolean*/ ==__c.True && _un.RTL /*boolean*/ ==_nextun.RTL /*boolean*/ ) { 
RDebugUtils.currentLine=13631495;
 //BA.debugLineNum = 13631495;BA.debugLine="MergeUnbreakables(un, NextUn)";
__ref._mergeunbreakables /*String*/ (null,_un,_nextun);
RDebugUtils.currentLine=13631496;
 //BA.debugLineNum = 13631496;BA.debugLine="unbreakables.RemoveAt(i)";
_unbreakables.RemoveAt(_i);
RDebugUtils.currentLine=13631497;
 //BA.debugLineNum = 13631497;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
 }else {
RDebugUtils.currentLine=13631499;
 //BA.debugLineNum = 13631499;BA.debugLine="un = NextUn";
_un = _nextun;
 };
RDebugUtils.currentLine=13631501;
 //BA.debugLineNum = 13631501;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
RDebugUtils.currentLine=13631503;
 //BA.debugLineNum = 13631503;BA.debugLine="For Each un As BCUnbreakableText In unbreakables";
{
final anywheresoftware.b4a.BA.IterableList group15 = _unbreakables;
final int groupLen15 = group15.getSize()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_un = (b4a.example.bctextengine._bcunbreakabletext)(group15.Get(index15));
RDebugUtils.currentLine=13631504;
 //BA.debugLineNum = 13631504;BA.debugLine="If TextCharEquals(un.NotFullTextChars, Chr(13))";
if (__ref._textcharequals /*boolean*/ (null,_un.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ ,BA.ObjectToString(__c.Chr((int) (13))))) { 
if (true) continue;};
RDebugUtils.currentLine=13631505;
 //BA.debugLineNum = 13631505;BA.debugLine="If TextCharEquals(un.NotFullTextChars, Chr(10))";
if (__ref._textcharequals /*boolean*/ (null,_un.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ ,BA.ObjectToString(__c.Chr((int) (10))))) { 
RDebugUtils.currentLine=13631506;
 //BA.debugLineNum = 13631506;BA.debugLine="CreateLine(p)";
__ref._createline /*String*/ (null,_p);
RDebugUtils.currentLine=13631507;
 //BA.debugLineNum = 13631507;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=13631509;
 //BA.debugLineNum = 13631509;BA.debugLine="If p.CurrentLine.Unbreakables.Size > 0 And p.Sty";
if (_p.CurrentLine /*b4a.example.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0 && _p.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .WordWrap /*boolean*/ ) { 
RDebugUtils.currentLine=13631510;
 //BA.debugLineNum = 13631510;BA.debugLine="Dim SingleStyle As BCSingleStyleSection = un.Si";
_singlestyle = (b4a.example.bctextengine._bcsinglestylesection)(_un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=13631511;
 //BA.debugLineNum = 13631511;BA.debugLine="Dim indent As Int = IndentWidth * SingleStyle.R";
_indent = (int) (__ref._indentwidth /*int*/ *_singlestyle.Run /*b4a.example.bctextengine._bctextrun*/ .IndentLevel /*int*/ );
RDebugUtils.currentLine=13631512;
 //BA.debugLineNum = 13631512;BA.debugLine="If p.CurrentLine.Width + mSpaceBetweenCharacter";
if (_p.CurrentLine /*b4a.example.bctextengine._bctextline*/ .Width /*int*/ +__ref._mspacebetweencharacters /*float*/ +_un.Width /*int*/ +_indent>(_p.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .MaxWidth /*int*/ -_p.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()-_p.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getRight())*__ref._mscale /*float*/ ) { 
RDebugUtils.currentLine=13631513;
 //BA.debugLineNum = 13631513;BA.debugLine="p.CurrentLine.EndsWithSoftLineBreak = True";
_p.CurrentLine /*b4a.example.bctextengine._bctextline*/ .EndsWithSoftLineBreak /*boolean*/  = __c.True;
RDebugUtils.currentLine=13631514;
 //BA.debugLineNum = 13631514;BA.debugLine="CreateLine(p)";
__ref._createline /*String*/ (null,_p);
 };
 };
RDebugUtils.currentLine=13631517;
 //BA.debugLineNum = 13631517;BA.debugLine="p.CurrentLine.Unbreakables.Add(un)";
_p.CurrentLine /*b4a.example.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_un));
RDebugUtils.currentLine=13631518;
 //BA.debugLineNum = 13631518;BA.debugLine="un.ParentLine = p.CurrentLine";
_un.ParentLine /*b4a.example.bctextengine._bctextline*/  = _p.CurrentLine /*b4a.example.bctextengine._bctextline*/ ;
RDebugUtils.currentLine=13631519;
 //BA.debugLineNum = 13631519;BA.debugLine="If IsSpace(un.NotFullTextChars) And p.CurrentLin";
if (__ref._isspace /*boolean*/ (null,_un.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ ) && _p.CurrentLine /*b4a.example.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==1) { 
RDebugUtils.currentLine=13631520;
 //BA.debugLineNum = 13631520;BA.debugLine="un.Width = 0";
_un.Width /*int*/  = (int) (0);
 };
RDebugUtils.currentLine=13631522;
 //BA.debugLineNum = 13631522;BA.debugLine="If p.CurrentLine.Unbreakables.Size > 0 Then p.Cu";
if (_p.CurrentLine /*b4a.example.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
_p.CurrentLine /*b4a.example.bctextengine._bctextline*/ .Width /*int*/  = (int) (_p.CurrentLine /*b4a.example.bctextengine._bctextline*/ .Width /*int*/ +__ref._mspacebetweencharacters /*float*/ );};
RDebugUtils.currentLine=13631523;
 //BA.debugLineNum = 13631523;BA.debugLine="un.StartX = p.CurrentLine.Width";
_un.StartX /*int*/  = _p.CurrentLine /*b4a.example.bctextengine._bctextline*/ .Width /*int*/ ;
RDebugUtils.currentLine=13631524;
 //BA.debugLineNum = 13631524;BA.debugLine="p.CurrentLine.Width = p.CurrentLine.Width + un.W";
_p.CurrentLine /*b4a.example.bctextengine._bctextline*/ .Width /*int*/  = (int) (_p.CurrentLine /*b4a.example.bctextengine._bctextline*/ .Width /*int*/ +_un.Width /*int*/ );
 }
};
RDebugUtils.currentLine=13631526;
 //BA.debugLineNum = 13631526;BA.debugLine="End Sub";
return "";
}
public String  _printtextchars(b4a.example.bctextengine __ref,b4a.example.bctextengine._bctextchars _tc) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "printtextchars", true))
	 {return ((String) Debug.delegate(ba, "printtextchars", new Object[] {_tc}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Public Sub PrintTextChars(TC As BCTextChars)";
RDebugUtils.currentLine=15794177;
 //BA.debugLineNum = 15794177;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=15794179;
 //BA.debugLineNum = 15794179;BA.debugLine="For i = TC.StartIndex To TC.StartIndex + TC.Lengt";
{
final int step3 = 1;
final int limit3 = (int) (_tc.StartIndex /*int*/ +_tc.Length /*int*/ -1);
_i = _tc.StartIndex /*int*/  ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=15794180;
 //BA.debugLineNum = 15794180;BA.debugLine="sb.Append(TC.Buffer(i))";
_sb.Append(_tc.Buffer /*String[]*/ [_i]);
 }
};
RDebugUtils.currentLine=15794182;
 //BA.debugLineNum = 15794182;BA.debugLine="Log(sb.ToString)";
__c.LogImpl("915794182",_sb.ToString(),0);
RDebugUtils.currentLine=15794183;
 //BA.debugLineNum = 15794183;BA.debugLine="End Sub";
return "";
}
public String  _releaseasyncbc(b4a.example.bctextengine __ref,b4a.example.bitmapcreator _bc) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "releaseasyncbc", true))
	 {return ((String) Debug.delegate(ba, "releaseasyncbc", new Object[] {_bc}));}
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Public Sub ReleaseAsyncBC(bc As BitmapCreator)";
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="AsyncBCs.Put(bc, False)";
__ref._asyncbcs /*b4a.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_bc),(Object)(__c.False));
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="End Sub";
return "";
}
}