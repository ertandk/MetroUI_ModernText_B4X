package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bctextengine extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.bctextengine");
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvv5 = null;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public String _extra_connectedruns = "";
public String _extra_styledunderline = "";
public b4a.example.bitmapcreator _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public b4a.example.bitmapcreator._internalcompressedbccache _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public b4a.example.bctextengine._bcstyledunderline _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public float _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0f;
public float _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0f;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
public b4a.example.bitmapcreator _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public b4a.example.bitmapcreator _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public b4a.example.bctextengine._bcparagraphstyle _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public b4a.example.bbcodeparser _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public b4a.example.bctextengine._bctextchars _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
public b4a.example.b4xset _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public b4a.example.b4xset _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public b4a.example.b4xorderedmap _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
public b4a.example.bitmapcreator _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
public b4a.example.b4xset _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public b4a.example.main _vvvv6 = null;
public b4a.example.starter _vvvv7 = null;
public b4a.example.b4xpages _vvvv0 = null;
public b4a.example.b4xcollections _vvvvv1 = null;
public b4a.example.httputils2service _vvvvv2 = null;
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
public String  _vvvvvvvvvvvvvvvvvvvvvvvvv3(anywheresoftware.b4a.objects.collections.List _ltrlist,anywheresoftware.b4a.objects.collections.List _newlist) throws Exception{
int _startindex = 0;
int _lastindex = 0;
b4a.example.bctextengine._bcunbreakabletext _lastun = null;
b4a.example.bctextengine._bcunbreakabletext _prev = null;
int _i = 0;
b4a.example.bctextengine._bcunbreakabletext _un = null;
 //BA.debugLineNum = 335;BA.debugLine="Private Sub AddLTRItems (LTRList As List, NewList";
 //BA.debugLineNum = 336;BA.debugLine="If LTRList.Size = 0 Then Return";
if (_ltrlist.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 337;BA.debugLine="NewList.AddAll(LTRList)";
_newlist.AddAll(_ltrlist);
 //BA.debugLineNum = 338;BA.debugLine="If LTRList.Size > 1 Then";
if (_ltrlist.getSize()>1) { 
 //BA.debugLineNum = 339;BA.debugLine="Dim StartIndex As Int = 1";
_startindex = (int) (1);
 //BA.debugLineNum = 340;BA.debugLine="If IsUNSeparator(LTRList.Get(0)) Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvv7((b4a.example.bctextengine._bcunbreakabletext)(_ltrlist.Get((int) (0))))) { 
 //BA.debugLineNum = 341;BA.debugLine="StartIndex = 2";
_startindex = (int) (2);
 };
 //BA.debugLineNum = 343;BA.debugLine="Dim LastIndex As Int = LTRList.Size - 1";
_lastindex = (int) (_ltrlist.getSize()-1);
 //BA.debugLineNum = 344;BA.debugLine="If LastIndex > StartIndex Then";
if (_lastindex>_startindex) { 
 //BA.debugLineNum = 345;BA.debugLine="If IsUNSeparator(LTRList.Get(LastIndex)) Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvv7((b4a.example.bctextengine._bcunbreakabletext)(_ltrlist.Get(_lastindex)))) { 
 //BA.debugLineNum = 346;BA.debugLine="LastIndex = LastIndex - 1";
_lastindex = (int) (_lastindex-1);
 };
 };
 //BA.debugLineNum = 349;BA.debugLine="If LastIndex > StartIndex Then";
if (_lastindex>_startindex) { 
 //BA.debugLineNum = 350;BA.debugLine="Dim lastun As BCUnbreakableText = LTRList.Get(L";
_lastun = (b4a.example.bctextengine._bcunbreakabletext)(_ltrlist.Get(_lastindex));
 //BA.debugLineNum = 351;BA.debugLine="Dim prev As BCUnbreakableText = LTRList.Get(Sta";
_prev = (b4a.example.bctextengine._bcunbreakabletext)(_ltrlist.Get((int) (_startindex-1)));
 //BA.debugLineNum = 352;BA.debugLine="prev.StartX = lastun.StartX";
_prev.StartX /*int*/  = _lastun.StartX /*int*/ ;
 //BA.debugLineNum = 353;BA.debugLine="For i = StartIndex To LastIndex";
{
final int step18 = 1;
final int limit18 = _lastindex;
_i = _startindex ;
for (;_i <= limit18 ;_i = _i + step18 ) {
 //BA.debugLineNum = 354;BA.debugLine="Dim un As BCUnbreakableText = LTRList.Get(i)";
_un = (b4a.example.bctextengine._bcunbreakabletext)(_ltrlist.Get(_i));
 //BA.debugLineNum = 355;BA.debugLine="un.StartX = prev.StartX + prev.Width + mSpaceB";
_un.StartX /*int*/  = (int) (_prev.StartX /*int*/ +_prev.Width /*int*/ +_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1);
 //BA.debugLineNum = 356;BA.debugLine="prev = un";
_prev = _un;
 }
};
 };
 };
 //BA.debugLineNum = 360;BA.debugLine="LTRList.Clear";
_ltrlist.Clear();
 //BA.debugLineNum = 361;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvv4(b4a.example.bctextengine._bcparagraph _par) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
 //BA.debugLineNum = 214;BA.debugLine="Public Sub AddParagraphViews (par As BCParagraph)";
 //BA.debugLineNum = 215;BA.debugLine="If par.Views.IsInitialized Then";
if (_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
 //BA.debugLineNum = 216;BA.debugLine="For Each v As B4XView In par.Views";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = _par.Views /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group2.Get(index2)));
 //BA.debugLineNum = 217;BA.debugLine="v.SetLayoutAnimated(0, par.Style.Padding.Left +";
_v.SetLayoutAnimated((int) (0),(int) (_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()+_v.getLeft()),(int) (_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+_v.getTop()),_v.getWidth(),_v.getHeight());
 }
};
 };
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return "";
}
public int  _vvvvvvvvvvvvvvvvvvvvvvvvv5(byte[] _bytes,int _startindex) throws Exception{
int _cp = 0;
int _i = 0;
 //BA.debugLineNum = 883;BA.debugLine="Private Sub BytesToInt (Bytes() As Byte, StartInde";
 //BA.debugLineNum = 884;BA.debugLine="Dim cp As Int";
_cp = 0;
 //BA.debugLineNum = 885;BA.debugLine="For i = 0 To 3";
{
final int step2 = 1;
final int limit2 = (int) (3);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 886;BA.debugLine="cp = Bit.Or(cp, Bit.ShiftLeft(Bit.And(0xff, Byte";
_cp = __c.Bit.Or(_cp,__c.Bit.ShiftLeft(__c.Bit.And((int) (0xff),(int) (_bytes[(int) (_i+_startindex)])),(int) (8*_i)));
 }
};
 //BA.debugLineNum = 888;BA.debugLine="Return cp";
if (true) return _cp;
 //BA.debugLineNum = 889;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private xui As XUI";
_vvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 3;BA.debugLine="Public cvs As B4XCanvas";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 4;BA.debugLine="Type BCFontMetrics (Glyphs As Map, DefaultColorMe";
;
 //BA.debugLineNum = 6;BA.debugLine="Type BCTextChars (Buffer() As String, StartIndex";
;
 //BA.debugLineNum = 8;BA.debugLine="Type BCParagraphStyle (HorizontalAlignment As Str";
;
 //BA.debugLineNum = 9;BA.debugLine="Type BCTextRun (TextFont As B4XFont, TextColor As";
;
 //BA.debugLineNum = 12;BA.debugLine="Type BCConnectedRuns (ConnectedWidth As Int, Runs";
;
 //BA.debugLineNum = 13;BA.debugLine="Type BCStyledUnderline (Clr As Int, Style As Stri";
;
 //BA.debugLineNum = 14;BA.debugLine="Public const EXTRA_CONNECTEDRUNS = \"ConnectedRuns";
_extra_connectedruns = "ConnectedRuns";
_extra_styledunderline = "StyledUnderline";
 //BA.debugLineNum = 17;BA.debugLine="Type BCParagraph (TextLines As List, CurrentLine";
;
 //BA.debugLineNum = 20;BA.debugLine="Type BCTextLine (StartX As Int, BaselineY As Int,";
;
 //BA.debugLineNum = 22;BA.debugLine="Type BCUnbreakableText (Width As Int, StartX As I";
;
 //BA.debugLineNum = 24;BA.debugLine="Type BCSingleStyleSection (AbsoluteStartX As Int,";
;
 //BA.debugLineNum = 26;BA.debugLine="Type BCGlyphAndOffset (Glyph As BCGlyph, SpaceBet";
;
 //BA.debugLineNum = 27;BA.debugLine="Type BCGlyph (cbc As CompressedBC, baseline As In";
;
 //BA.debugLineNum = 28;BA.debugLine="Private CharBC As BitmapCreator";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 29;BA.debugLine="Private cbccache As InternalCompressedBCCache";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new b4a.example.bitmapcreator._internalcompressedbccache();
 //BA.debugLineNum = 30;BA.debugLine="Public DefaultUnderlineStyle As BCStyledUnderline";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new b4a.example.bctextengine._bcstyledunderline();
 //BA.debugLineNum = 31;BA.debugLine="Public mScale As Float = 1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (float) (1);
 //BA.debugLineNum = 32;BA.debugLine="Private mSpaceBetweenCharacters As Float";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0f;
 //BA.debugLineNum = 33;BA.debugLine="Private mSpaceBetweenLines As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
 //BA.debugLineNum = 34;BA.debugLine="Private FontMetricsCache As Map";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 35;BA.debugLine="Private ForegroundBC, BackgroundBC As BitmapCreat";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new b4a.example.bitmapcreator();
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 36;BA.debugLine="Public DefaultColor As Int = xui.Color_Black";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvv5.Color_Black;
 //BA.debugLineNum = 37;BA.debugLine="Public WordBoundaries As String = \"&*+-/.<>=\\' ,:";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "&*+-/.<>=\\' ,:{}"+__c.TAB+__c.CRLF+BA.ObjectToString(__c.Chr((int) (13)));
 //BA.debugLineNum = 38;BA.debugLine="Public WordBoundariesThatCanConnectToPrevWord As";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = ".,:";
 //BA.debugLineNum = 39;BA.debugLine="Private Brushes As Map";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 40;BA.debugLine="Public DefaultStyle As BCParagraphStyle";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new b4a.example.bctextengine._bcparagraphstyle();
 //BA.debugLineNum = 41;BA.debugLine="Public DefaultFont As B4XFont";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 42;BA.debugLine="Private MinGapBetweenLines As Int = 5dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = __c.DipToCurrent((int) (5));
 //BA.debugLineNum = 44;BA.debugLine="Private stubForContext As Panel 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Private const TabWidthMeasuredInX As Int = 4";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = (int) (4);
 //BA.debugLineNum = 50;BA.debugLine="Public TagParser As BBCodeParser";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new b4a.example.bbcodeparser();
 //BA.debugLineNum = 51;BA.debugLine="Private EmptyTextChars As BCTextChars";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new b4a.example.bctextengine._bctextchars();
 //BA.debugLineNum = 52;BA.debugLine="Private Emojis As B4XSet";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new b4a.example.b4xset();
 //BA.debugLineNum = 53;BA.debugLine="Public const Charset As String = \"UTF-32LE\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "UTF-32LE";
 //BA.debugLineNum = 54;BA.debugLine="Public LookForComplexCharacters As Boolean = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = __c.True;
 //BA.debugLineNum = 55;BA.debugLine="Public CustomFonts As Map";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 56;BA.debugLine="Public KerningEnabled As Boolean = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = __c.True;
 //BA.debugLineNum = 57;BA.debugLine="Private IndentWidth As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
 //BA.debugLineNum = 58;BA.debugLine="Public VowelsCodePoints As B4XSet";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new b4a.example.b4xset();
 //BA.debugLineNum = 59;BA.debugLine="Private AsyncBCs As B4XOrderedMap";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new b4a.example.b4xorderedmap();
 //BA.debugLineNum = 60;BA.debugLine="Private AsyncBC As BitmapCreator";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 61;BA.debugLine="Private AsyncTasks As List";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 62;BA.debugLine="Private AsyncMode As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
 //BA.debugLineNum = 63;BA.debugLine="Private RTLChars As B4XSet";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new b4a.example.b4xset();
 //BA.debugLineNum = 64;BA.debugLine="Public Const TextDirectionLTR = 1, TextDirectionU";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) (1);
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = (int) (0);
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = (int) (-1);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public b4a.example.bctextengine._bctextchars  _vvvvvvvvvvvvvvvvvvvvvvvvv6(String[] _buffer,int _startindex,int _length) throws Exception{
b4a.example.bctextengine._bctextchars _t1 = null;
 //BA.debugLineNum = 1038;BA.debugLine="Public Sub CreateBCTextChars (Buffer() As String,";
 //BA.debugLineNum = 1039;BA.debugLine="Dim t1 As BCTextChars";
_t1 = new b4a.example.bctextengine._bctextchars();
 //BA.debugLineNum = 1040;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 1041;BA.debugLine="t1.Buffer = Buffer";
_t1.Buffer /*String[]*/  = _buffer;
 //BA.debugLineNum = 1042;BA.debugLine="t1.StartIndex = StartIndex";
_t1.StartIndex /*int*/  = _startindex;
 //BA.debugLineNum = 1043;BA.debugLine="t1.Length = Length";
_t1.Length /*int*/  = _length;
 //BA.debugLineNum = 1044;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 1045;BA.debugLine="End Sub";
return null;
}
public b4a.example.bctextengine._bctextchars  _vvvvvvvvvvvvvvvvvvvvvvvvv7(String _s) throws Exception{
byte[] _b = null;
String[] _chars = null;
int _i = 0;
int _bi = 0;
boolean _shouldaddtoprevchar = false;
boolean _therearevowels = false;
int _cp = 0;
 //BA.debugLineNum = 1002;BA.debugLine="Public Sub CreateBCTextCharsFromString (s As Strin";
 //BA.debugLineNum = 1003;BA.debugLine="Dim b() As Byte = s.GetBytes(Charset)";
_b = _s.getBytes(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
 //BA.debugLineNum = 1004;BA.debugLine="Dim chars(b.Length / 4) As String";
_chars = new String[(int) (_b.length/(double)4)];
java.util.Arrays.fill(_chars,"");
 //BA.debugLineNum = 1005;BA.debugLine="Dim i, bi As Int = 0";
_i = 0;
_bi = (int) (0);
 //BA.debugLineNum = 1006;BA.debugLine="Dim ShouldAddToPrevChar As Boolean";
_shouldaddtoprevchar = false;
 //BA.debugLineNum = 1007;BA.debugLine="Dim ThereAreVowels As Boolean = VowelsCodePoints.";
_therearevowels = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._getvvvvvvvvv7 /*int*/ ()>0;
 //BA.debugLineNum = 1008;BA.debugLine="Do While bi <= chars.Length - 1";
while (_bi<=_chars.length-1) {
 //BA.debugLineNum = 1009;BA.debugLine="chars(i) = BytesToString(b, bi * 4, 4, Charset)";
_chars[_i] = __c.BytesToString(_b,(int) (_bi*4),(int) (4),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
 //BA.debugLineNum = 1010;BA.debugLine="If LookForComplexCharacters Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) { 
 //BA.debugLineNum = 1011;BA.debugLine="Dim cp As Int = BytesToInt(b, bi * 4)";
_cp = _vvvvvvvvvvvvvvvvvvvvvvvvv5(_b,(int) (_bi*4));
 //BA.debugLineNum = 1012;BA.debugLine="If i > 0 And (cp = 0x200d Or (cp >= 0xFE00 And";
if (_i>0 && (_cp==0x200d || (_cp>=0xfe00 && _cp<=0xfe0f))) { 
 //BA.debugLineNum = 1013;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
 //BA.debugLineNum = 1014;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
 //BA.debugLineNum = 1015;BA.debugLine="ShouldAddToPrevChar = True";
_shouldaddtoprevchar = __c.True;
 }else if(_i>0 && (_cp>=0x1f3fb && _cp<=0x1f3ff)) { 
 //BA.debugLineNum = 1017;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
 //BA.debugLineNum = 1018;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
 //BA.debugLineNum = 1019;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }else if(_i>0 && (_therearevowels && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvv7 /*boolean*/ ((Object)(_cp)))) { 
 //BA.debugLineNum = 1021;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
 //BA.debugLineNum = 1022;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
 //BA.debugLineNum = 1023;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }else if(_i>0 && _shouldaddtoprevchar) { 
 //BA.debugLineNum = 1025;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
 //BA.debugLineNum = 1026;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
 //BA.debugLineNum = 1027;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }else {
 //BA.debugLineNum = 1029;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 };
 };
 //BA.debugLineNum = 1032;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 //BA.debugLineNum = 1033;BA.debugLine="bi = bi + 1";
_bi = (int) (_bi+1);
 }
;
 //BA.debugLineNum = 1035;BA.debugLine="Return CreateBCTextChars(chars, 0, i)";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvv6(_chars,(int) (0),_i);
 //BA.debugLineNum = 1036;BA.debugLine="End Sub";
return null;
}
public b4a.example.bctextengine._bctextrun  _vvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
b4a.example.bctextengine._bcconnectedruns _connected = null;
b4a.example.bctextengine._bctextrun _parent = null;
 //BA.debugLineNum = 153;BA.debugLine="Public Sub CreateConnectedParent As BCTextRun";
 //BA.debugLineNum = 154;BA.debugLine="Dim connected As BCConnectedRuns";
_connected = new b4a.example.bctextengine._bcconnectedruns();
 //BA.debugLineNum = 155;BA.debugLine="connected.Initialize";
_connected.Initialize();
 //BA.debugLineNum = 156;BA.debugLine="connected.Runs.Initialize";
_connected.Runs /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 157;BA.debugLine="Dim parent As BCTextRun = CreateRun(\"\")";
_parent = _vvvvvvvvvvvvvvvvvvvvvvvvvv4("");
 //BA.debugLineNum = 158;BA.debugLine="parent.Extra.Initialize";
_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 159;BA.debugLine="parent.Extra.Put(EXTRA_CONNECTEDRUNS, connected)";
_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_extra_connectedruns),(Object)(_connected));
 //BA.debugLineNum = 160;BA.debugLine="Return parent";
if (true) return _parent;
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4a.example.bctextengine._bcglyph  _vvvvvvvvvvvvvvvvvvvvvvvvvv1(String _c,b4a.example.bctextengine._bcfontmetrics _fontmetrics,boolean _justmeasure) throws Exception{
b4a.example.bctextengine._bcglyph _g = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
int _leftoffset = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r2 = null;
b4a.example.bitmapcreator._compressedbc _cbc = null;
 //BA.debugLineNum = 810;BA.debugLine="Private Sub CreateGlyph (c As String, FontMetrics";
 //BA.debugLineNum = 811;BA.debugLine="Dim g As BCGlyph = FontMetrics.Glyphs.Get(c)";
_g = (b4a.example.bctextengine._bcglyph)(_fontmetrics.Glyphs /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_c)));
 //BA.debugLineNum = 812;BA.debugLine="If g <> Null Then Return g";
if (_g!= null) { 
if (true) return _g;};
 //BA.debugLineNum = 813;BA.debugLine="If FontMetrics.clr <> DefaultColor Then";
if (_fontmetrics.Clr /*int*/ !=_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6) { 
 //BA.debugLineNum = 814;BA.debugLine="Return CreateGlyphFromDefaultColor(c, FontMetric";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvv2(_c,_fontmetrics.DefaultColorMetrics /*b4a.example.bctextengine._bcfontmetrics*/ ,_fontmetrics.Clr /*int*/ );
 }else {
 //BA.debugLineNum = 816;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.ClearRect(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getTargetRect());
 //BA.debugLineNum = 817;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(c, FontMetric";
_r = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.MeasureText(_c,_fontmetrics.Fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 818;BA.debugLine="Dim BaseLine As Int = -r.Top + 5";
_baseline = (int) (-_r.getTop()+5);
 //BA.debugLineNum = 819;BA.debugLine="r.Left = r.Left * mScale";
_r.setLeft((float) (_r.getLeft()*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
 //BA.debugLineNum = 820;BA.debugLine="r.Top = r.Top * mScale";
_r.setTop((float) (_r.getTop()*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
 //BA.debugLineNum = 821;BA.debugLine="r.Right = r.Right * mScale";
_r.setRight((float) (_r.getRight()*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
 //BA.debugLineNum = 822;BA.debugLine="r.Bottom = r.Bottom * mScale";
_r.setBottom((float) (_r.getBottom()*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
 //BA.debugLineNum = 823;BA.debugLine="If CharBC.mWidth < r.Width + 20 * mScale Or Char";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._mwidth<_r.getWidth()+20*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 || _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._mheight<_r.getHeight()+20*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
 //BA.debugLineNum = 824;BA.debugLine="ResizeCharBC(r.Width + 30 * mScale, r.Height +";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3((int) (_r.getWidth()+30*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),(int) (_r.getHeight()+30*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
 };
 //BA.debugLineNum = 827;BA.debugLine="Dim leftOffset As Int = 5";
_leftoffset = (int) (5);
 //BA.debugLineNum = 828;BA.debugLine="cvs.DrawText(c, leftOffset, BaseLine, FontMetric";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.DrawText(ba,_c,(float) (_leftoffset),(float) (_baseline),_fontmetrics.Fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_fontmetrics.Clr /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 830;BA.debugLine="Dim bmp As B4XBitmap = cvs.CreateBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.CreateBitmap();
 //BA.debugLineNum = 841;BA.debugLine="CharBC.CopyPixelsFromBitmap(bmp)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._copypixelsfrombitmap(_bmp);
 //BA.debugLineNum = 842;BA.debugLine="Dim r2 As B4XRect = FindMinRect(leftOffset + r.R";
_r2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvv2((int) (_leftoffset+_r.getRight()+20*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),(int) (_r.getHeight()+20*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
 //BA.debugLineNum = 843;BA.debugLine="Dim g As BCGlyph";
_g = new b4a.example.bctextengine._bcglyph();
 //BA.debugLineNum = 844;BA.debugLine="g.Initialize";
_g.Initialize();
 //BA.debugLineNum = 845;BA.debugLine="g.baseline = BaseLine * mScale - r2.Top";
_g.baseline /*int*/  = (int) (_baseline*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0-_r2.getTop());
 //BA.debugLineNum = 846;BA.debugLine="If r2.Width > 0 Then";
if (_r2.getWidth()>0) { 
 //BA.debugLineNum = 847;BA.debugLine="r2.Left = Floor(r2.Left)";
_r2.setLeft((float) (__c.Floor(_r2.getLeft())));
 //BA.debugLineNum = 848;BA.debugLine="r2.Right = Ceil(r2.Right)";
_r2.setRight((float) (__c.Ceil(_r2.getRight())));
 //BA.debugLineNum = 854;BA.debugLine="Dim cbc As CompressedBC = CharBC.ExtractCompres";
_cbc = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._extractcompressedbc(_r2,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
 //BA.debugLineNum = 855;BA.debugLine="g.cbc = cbc";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/  = _cbc;
 //BA.debugLineNum = 856;BA.debugLine="g.width = cbc.mWidth";
_g.Width /*int*/  = _cbc.mWidth;
 }else {
 //BA.debugLineNum = 858;BA.debugLine="g.Empty = True";
_g.Empty /*boolean*/  = __c.True;
 //BA.debugLineNum = 859;BA.debugLine="If c = TAB Then";
if ((_c).equals(__c.TAB)) { 
 //BA.debugLineNum = 860;BA.debugLine="g.Width = FontMetrics.xWidth * TabWidthMeasure";
_g.Width /*int*/  = (int) (_fontmetrics.xWidth /*int*/ *_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
 }else if((_c).equals(" ")) { 
 //BA.debugLineNum = 862;BA.debugLine="g.width = CreateGlyph(\"x x\", FontMetrics, True";
_g.Width /*int*/  = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvv1("x x",_fontmetrics,__c.True).Width /*int*/ -_fontmetrics.xWidth /*int*/ *2);
 }else if((_c).equals("x")) { 
 //BA.debugLineNum = 864;BA.debugLine="g = CreateGlyph(\"X\", FontMetrics, True)";
_g = _vvvvvvvvvvvvvvvvvvvvvvvvvv1("X",_fontmetrics,__c.True);
 }else if((_c).equals("x x")) { 
 //BA.debugLineNum = 866;BA.debugLine="g = CreateGlyph(\"X X\", FontMetrics, True)";
_g = _vvvvvvvvvvvvvvvvvvvvvvvvvv1("X X",_fontmetrics,__c.True);
 }else {
 //BA.debugLineNum = 868;BA.debugLine="g.Width = CreateGlyph(\" \", FontMetrics, False)";
_g.Width /*int*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvv1(" ",_fontmetrics,__c.False).Width /*int*/ ;
 };
 };
 //BA.debugLineNum = 872;BA.debugLine="If xui.IsB4J = False And MightBeAnEmoji(c) Then";
if (_vvvv5.getIsB4J()==__c.False && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_c)) { 
 //BA.debugLineNum = 873;BA.debugLine="If Emojis.IsInitialized = False Then LoadData(E";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.IsInitialized /*boolean*/ ()==__c.False) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1,"emoji-data.txt");};
 //BA.debugLineNum = 874;BA.debugLine="g.Emoji = Emojis.Contains(BytesToInt(c.GetBytes";
_g.Emoji /*boolean*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvvv7 /*boolean*/ ((Object)(_vvvvvvvvvvvvvvvvvvvvvvvvv5(_c.getBytes(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2),(int) (0))));
 };
 //BA.debugLineNum = 876;BA.debugLine="If JustMeasure = False Then";
if (_justmeasure==__c.False) { 
 //BA.debugLineNum = 877;BA.debugLine="FontMetrics.Glyphs.Put(c, g)";
_fontmetrics.Glyphs /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_c),(Object)(_g));
 };
 //BA.debugLineNum = 879;BA.debugLine="Return g";
if (true) return _g;
 };
 //BA.debugLineNum = 881;BA.debugLine="End Sub";
return null;
}
public b4a.example.bctextengine._bcglyph  _vvvvvvvvvvvvvvvvvvvvvvvvvv2(String _c,b4a.example.bctextengine._bcfontmetrics _defaultcolormetrics,int _clr) throws Exception{
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
 //BA.debugLineNum = 897;BA.debugLine="Private Sub CreateGlyphFromDefaultColor(c As Strin";
 //BA.debugLineNum = 898;BA.debugLine="Dim BlackGlyph As BCGlyph = CreateGlyph(c, Defaul";
_blackglyph = _vvvvvvvvvvvvvvvvvvvvvvvvvv1(_c,_defaultcolormetrics,__c.False);
 //BA.debugLineNum = 899;BA.debugLine="If BlackGlyph.cbc.IsInitialized = False Or BlackG";
if (_blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .IsInitialized==__c.False || _blackglyph.Emoji /*boolean*/ ) { 
if (true) return _blackglyph;};
 //BA.debugLineNum = 900;BA.debugLine="Dim g As BCGlyph";
_g = new b4a.example.bctextengine._bcglyph();
 //BA.debugLineNum = 901;BA.debugLine="g.Initialize";
_g.Initialize();
 //BA.debugLineNum = 902;BA.debugLine="g.baseline = BlackGlyph.baseline";
_g.baseline /*int*/  = _blackglyph.baseline /*int*/ ;
 //BA.debugLineNum = 903;BA.debugLine="g.width = BlackGlyph.width";
_g.Width /*int*/  = _blackglyph.Width /*int*/ ;
 //BA.debugLineNum = 904;BA.debugLine="g.cbc.Initialize";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .Initialize();
 //BA.debugLineNum = 905;BA.debugLine="g.cbc.Cache = BlackGlyph.cbc.Cache";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .Cache = _blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .Cache;
 //BA.debugLineNum = 906;BA.debugLine="g.cbc.mHeight = BlackGlyph.cbc.mHeight";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mHeight = _blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mHeight;
 //BA.debugLineNum = 907;BA.debugLine="g.cbc.mWidth = BlackGlyph.cbc.mWidth";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mWidth = _blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mWidth;
 //BA.debugLineNum = 908;BA.debugLine="g.cbc.Rows = BlackGlyph.cbc.Rows";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .Rows = _blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .Rows;
 //BA.debugLineNum = 909;BA.debugLine="g.cbc.TargetRect = BlackGlyph.cbc.TargetRect";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .TargetRect = _blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .TargetRect;
 //BA.debugLineNum = 910;BA.debugLine="Dim buffer(BlackGlyph.cbc.mBuffer.Length) As Byte";
_buffer = new byte[_blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mBuffer.length];
;
 //BA.debugLineNum = 911;BA.debugLine="Dim argb As ARGBColor";
_argb = new b4a.example.bitmapcreator._argbcolor();
 //BA.debugLineNum = 912;BA.debugLine="CharBC.ColorToARGB(clr, argb)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._colortoargb(_clr,_argb);
 //BA.debugLineNum = 913;BA.debugLine="Dim ai, ri, gi, bi As Int";
_ai = 0;
_ri = 0;
_gi = 0;
_bi = 0;
 //BA.debugLineNum = 915;BA.debugLine="ai = 3";
_ai = (int) (3);
 //BA.debugLineNum = 916;BA.debugLine="ri = 0";
_ri = (int) (0);
 //BA.debugLineNum = 917;BA.debugLine="gi = 1";
_gi = (int) (1);
 //BA.debugLineNum = 918;BA.debugLine="bi = 2";
_bi = (int) (2);
 //BA.debugLineNum = 925;BA.debugLine="For i = 0 To buffer.Length - 1 Step 4";
{
final int step21 = 4;
final int limit21 = (int) (_buffer.length-1);
_i = (int) (0) ;
for (;_i <= limit21 ;_i = _i + step21 ) {
 //BA.debugLineNum = 934;BA.debugLine="Dim a As Int = Bit.And(0xff, BlackGlyph.cbc.mBuf";
_a = __c.Bit.And((int) (0xff),(int) (_blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mBuffer[(int) (_i+_ai)]));
 //BA.debugLineNum = 935;BA.debugLine="Dim af As Float = a / 255";
_af = (float) (_a/(double)255);
 //BA.debugLineNum = 936;BA.debugLine="buffer(i + ai) = a";
_buffer[(int) (_i+_ai)] = (byte) (_a);
 //BA.debugLineNum = 937;BA.debugLine="buffer(i + ri) = argb.r * af";
_buffer[(int) (_i+_ri)] = (byte) (_argb.r*_af);
 //BA.debugLineNum = 938;BA.debugLine="buffer(i + gi) = argb.g * af";
_buffer[(int) (_i+_gi)] = (byte) (_argb.g*_af);
 //BA.debugLineNum = 939;BA.debugLine="buffer(i + bi) = argb.b * af";
_buffer[(int) (_i+_bi)] = (byte) (_argb.b*_af);
 }
};
 //BA.debugLineNum = 942;BA.debugLine="g.cbc.mBuffer = buffer";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mBuffer = _buffer;
 //BA.debugLineNum = 943;BA.debugLine="Return g";
if (true) return _g;
 //BA.debugLineNum = 944;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvv3(b4a.example.bctextengine._bcparagraph _p) throws Exception{
b4a.example.bctextengine._bctextline _line = null;
 //BA.debugLineNum = 393;BA.debugLine="Private Sub CreateLine(p As BCParagraph)";
 //BA.debugLineNum = 394;BA.debugLine="Dim line As BCTextLine";
_line = new b4a.example.bctextengine._bctextline();
 //BA.debugLineNum = 395;BA.debugLine="line.Initialize";
_line.Initialize();
 //BA.debugLineNum = 396;BA.debugLine="line.Unbreakables.Initialize";
_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 397;BA.debugLine="line.ParentParagraph = p";
_line.ParentParagraph /*b4a.example.bctextengine._bcparagraph*/  = _p;
 //BA.debugLineNum = 398;BA.debugLine="p.TextLines.Add(line)";
_p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_line));
 //BA.debugLineNum = 399;BA.debugLine="p.CurrentLine = line";
_p.CurrentLine /*b4a.example.bctextengine._bctextline*/  = _line;
 //BA.debugLineNum = 401;BA.debugLine="End Sub";
return "";
}
public b4a.example.bctextengine._bctextrun  _vvvvvvvvvvvvvvvvvvvvvvvvvv4(String _text) throws Exception{
b4a.example.bctextengine._bctextrun _r = null;
 //BA.debugLineNum = 141;BA.debugLine="Public Sub CreateRun (Text As String) As BCTextRun";
 //BA.debugLineNum = 142;BA.debugLine="Dim r As BCTextRun";
_r = new b4a.example.bctextengine._bctextrun();
 //BA.debugLineNum = 143;BA.debugLine="r.Initialize";
_r.Initialize();
 //BA.debugLineNum = 144;BA.debugLine="r.BackgroundColor = 0";
_r.BackgroundColor /*int*/  = (int) (0);
 //BA.debugLineNum = 145;BA.debugLine="r.CharacterSpacingFactor = 1";
_r.CharacterSpacingFactor /*float*/  = (float) (1);
 //BA.debugLineNum = 146;BA.debugLine="r.TextFont = DefaultFont";
_r.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
 //BA.debugLineNum = 147;BA.debugLine="r.TextChars = CreateBCTextCharsFromString(Text)";
_r.TextChars /*b4a.example.bctextengine._bctextchars*/  = _vvvvvvvvvvvvvvvvvvvvvvvvv7(_text);
 //BA.debugLineNum = 148;BA.debugLine="r.Text = Text";
_r.Text /*String*/  = _text;
 //BA.debugLineNum = 149;BA.debugLine="r.TextColor = DefaultColor";
_r.TextColor /*int*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;
 //BA.debugLineNum = 150;BA.debugLine="Return r";
if (true) return _r;
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4a.example.bctextengine._bcsinglestylesection  _vvvvvvvvvvvvvvvvvvvvvvvvvv5(b4a.example.bctextengine._bctextrun _run,b4a.example.bctextengine._bctextchars _textchars,b4a.example.bctextengine._bcfontmetrics _fontmetrics) throws Exception{
b4a.example.bctextengine._bcsinglestylesection _single = null;
String _prevchar = "";
b4a.example.bctextengine._bcglyphandoffset _prevgo = null;
int _i = 0;
String _s = "";
b4a.example.bctextengine._bcglyphandoffset _go = null;
b4a.example.bctextengine._bcglyph _g = null;
b4a.example.bctextengine._bcstyledunderline _u = null;
 //BA.debugLineNum = 551;BA.debugLine="Private Sub CreateSingleSection (Run As BCTextRun,";
 //BA.debugLineNum = 552;BA.debugLine="Dim single As BCSingleStyleSection";
_single = new b4a.example.bctextengine._bcsinglestylesection();
 //BA.debugLineNum = 553;BA.debugLine="single.Initialize";
_single.Initialize();
 //BA.debugLineNum = 554;BA.debugLine="single.GlyphsAndOffsets.Initialize";
_single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 555;BA.debugLine="single.Run = Run";
_single.Run /*b4a.example.bctextengine._bctextrun*/  = _run;
 //BA.debugLineNum = 556;BA.debugLine="single.fm = FontMetrics";
_single.fm /*b4a.example.bctextengine._bcfontmetrics*/  = _fontmetrics;
 //BA.debugLineNum = 557;BA.debugLine="Dim PrevChar As String";
_prevchar = "";
 //BA.debugLineNum = 558;BA.debugLine="Dim PrevGO As BCGlyphAndOffset";
_prevgo = new b4a.example.bctextengine._bcglyphandoffset();
 //BA.debugLineNum = 559;BA.debugLine="For i = 0 To TextChars.Length - 1";
{
final int step8 = 1;
final int limit8 = (int) (_textchars.Length /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 560;BA.debugLine="Dim s As String = TextChars.Buffer(i + TextChars";
_s = _textchars.Buffer /*String[]*/ [(int) (_i+_textchars.StartIndex /*int*/ )];
 //BA.debugLineNum = 561;BA.debugLine="Dim go As BCGlyphAndOffset";
_go = new b4a.example.bctextengine._bcglyphandoffset();
 //BA.debugLineNum = 562;BA.debugLine="Dim g As BCGlyph = CreateGlyph(s, FontMetrics, F";
_g = _vvvvvvvvvvvvvvvvvvvvvvvvvv1(_s,_fontmetrics,__c.False);
 //BA.debugLineNum = 563;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 564;BA.debugLine="If KerningEnabled Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) { 
 //BA.debugLineNum = 565;BA.debugLine="PrevGO.SpaceBetweenThisAndNext = GetKernSpaceB";
_prevgo.SpaceBetweenThisAndNext /*int*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvvvv0(_fontmetrics,_prevchar,_s,_prevgo.Glyph /*b4a.example.bctextengine._bcglyph*/ ,_g);
 }else {
 //BA.debugLineNum = 567;BA.debugLine="PrevGO.SpaceBetweenThisAndNext = mSpaceBetween";
_prevgo.SpaceBetweenThisAndNext /*int*/  = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1);
 };
 };
 //BA.debugLineNum = 570;BA.debugLine="go.Glyph = g";
_go.Glyph /*b4a.example.bctextengine._bcglyph*/  = _g;
 //BA.debugLineNum = 571;BA.debugLine="single.GlyphsAndOffsets.Add(go)";
_single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_go));
 //BA.debugLineNum = 572;BA.debugLine="If g.cbc.IsInitialized Then";
if (_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .IsInitialized) { 
 //BA.debugLineNum = 573;BA.debugLine="single.MaxHeightAboveBaseLine = Max(single.MaxH";
_single.MaxHeightAboveBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightAboveBaseLine /*int*/ ,_g.baseline /*int*/ -_run.VerticalOffset /*int*/ *_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
 //BA.debugLineNum = 574;BA.debugLine="single.MaxHeightBelowBaseLine = Max(single.MaxH";
_single.MaxHeightBelowBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightBelowBaseLine /*int*/ ,_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mHeight-_g.baseline /*int*/ +_run.VerticalOffset /*int*/ *_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
 };
 //BA.debugLineNum = 576;BA.debugLine="single.Width = single.Width + g.Width";
_single.Width /*int*/  = (int) (_single.Width /*int*/ +_g.Width /*int*/ );
 //BA.debugLineNum = 577;BA.debugLine="If i > 0 Then single.Width = single.Width + Prev";
if (_i>0) { 
_single.Width /*int*/  = (int) (_single.Width /*int*/ +_prevgo.SpaceBetweenThisAndNext /*int*/ *_run.CharacterSpacingFactor /*float*/ );};
 //BA.debugLineNum = 578;BA.debugLine="If Run.Underline Then";
if (_run.Underline /*boolean*/ ) { 
 //BA.debugLineNum = 579;BA.debugLine="Dim u As BCStyledUnderline = GetUnderlineStyle(";
_u = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(_run);
 //BA.debugLineNum = 580;BA.debugLine="single.MaxHeightBelowBaseLine = Max((u.Thicknes";
_single.MaxHeightBelowBaseLine /*int*/  = (int) (__c.Max((_u.Thickness /*float*/ +2)*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0+_run.VerticalOffset /*int*/ *_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,_single.MaxHeightBelowBaseLine /*int*/ ));
 };
 //BA.debugLineNum = 582;BA.debugLine="PrevGO = go";
_prevgo = _go;
 //BA.debugLineNum = 583;BA.debugLine="PrevChar = s";
_prevchar = _s;
 }
};
 //BA.debugLineNum = 585;BA.debugLine="If i > 0 Then single.Width = single.Width + PrevG";
if (_i>0) { 
_single.Width /*int*/  = (int) (_single.Width /*int*/ +_prevgo.SpaceBetweenThisAndNext /*int*/ *_run.CharacterSpacingFactor /*float*/ );};
 //BA.debugLineNum = 586;BA.debugLine="If TextChars.Length = 0 And Run.View.IsInitialize";
if (_textchars.Length /*int*/ ==0 && _run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
 //BA.debugLineNum = 587;BA.debugLine="Run.View.Left = 0";
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft((int) (0));
 //BA.debugLineNum = 588;BA.debugLine="Run.View.Top = 0";
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (0));
 //BA.debugLineNum = 589;BA.debugLine="single.Width = Run.View.Width * mScale + mSpaceB";
_single.Width /*int*/  = (int) (_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1*2);
 //BA.debugLineNum = 590;BA.debugLine="single.MaxHeightAboveBaseLine = (Run.View.Height";
_single.MaxHeightAboveBaseLine /*int*/  = (int) ((_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_run.VerticalOffset /*int*/ )*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 591;BA.debugLine="single.MaxHeightBelowBaseLine = Run.View.Height";
_single.MaxHeightBelowBaseLine /*int*/  = (int) (_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0-_single.MaxHeightAboveBaseLine /*int*/ );
 };
 //BA.debugLineNum = 594;BA.debugLine="Return single";
if (true) return _single;
 //BA.debugLineNum = 595;BA.debugLine="End Sub";
return null;
}
public b4a.example.bctextengine._bcparagraphstyle  _vvvvvvvvvvvvvvvvvvvvvvvvvv6() throws Exception{
b4a.example.bctextengine._bcparagraphstyle _s = null;
 //BA.debugLineNum = 130;BA.debugLine="Public Sub CreateStyle As BCParagraphStyle";
 //BA.debugLineNum = 131;BA.debugLine="Dim s As BCParagraphStyle";
_s = new b4a.example.bctextengine._bcparagraphstyle();
 //BA.debugLineNum = 132;BA.debugLine="s.Initialize";
_s.Initialize();
 //BA.debugLineNum = 133;BA.debugLine="s.LineSpacingFactor = 1";
_s.LineSpacingFactor /*float*/  = (float) (1);
 //BA.debugLineNum = 134;BA.debugLine="s.HorizontalAlignment = \"Left\"";
_s.HorizontalAlignment /*String*/  = "Left";
 //BA.debugLineNum = 135;BA.debugLine="s.MaxWidth = 300dip";
_s.MaxWidth /*int*/  = __c.DipToCurrent((int) (300));
 //BA.debugLineNum = 136;BA.debugLine="s.Padding.Initialize(5dip, 5dip, 5dip, 5dip)";
_s.Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))));
 //BA.debugLineNum = 137;BA.debugLine="s.WordWrap = True";
_s.WordWrap /*boolean*/  = __c.True;
 //BA.debugLineNum = 138;BA.debugLine="Return s";
if (true) return _s;
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4a.example.bctextengine._bcunbreakabletext  _vvvvvvvvvvvvvvvvvvvvvvvvvv7(b4a.example.bctextengine._bctextrun _run,b4a.example.bctextengine._bctextchars _textchars,b4a.example.bctextengine._bcfontmetrics _fontmetrics,boolean _isseparator,b4a.example.bctextengine._bcparagraphstyle _style) throws Exception{
b4a.example.bctextengine._bcunbreakabletext _unbreakable = null;
b4a.example.bctextengine._bcsinglestylesection _single = null;
 //BA.debugLineNum = 472;BA.debugLine="Private Sub CreateUnbreakable (Run As BCTextRun, T";
 //BA.debugLineNum = 473;BA.debugLine="Dim unbreakable As BCUnbreakableText";
_unbreakable = new b4a.example.bctextengine._bcunbreakabletext();
 //BA.debugLineNum = 474;BA.debugLine="unbreakable.Initialize";
_unbreakable.Initialize();
 //BA.debugLineNum = 475;BA.debugLine="unbreakable.SingleStyleSections.Initialize";
_unbreakable.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 476;BA.debugLine="unbreakable.IsMergable = Not(IsSeparator) And Not";
_unbreakable.IsMergable /*boolean*/  = __c.Not(_isseparator) && __c.Not(_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized());
 //BA.debugLineNum = 477;BA.debugLine="Dim single As BCSingleStyleSection = CreateSingle";
_single = _vvvvvvvvvvvvvvvvvvvvvvvvvv5(_run,_textchars,_fontmetrics);
 //BA.debugLineNum = 478;BA.debugLine="single.ParentUN = unbreakable";
_single.ParentUN /*b4a.example.bctextengine._bcunbreakabletext*/  = _unbreakable;
 //BA.debugLineNum = 479;BA.debugLine="unbreakable.SingleStyleSections.Add(single)";
_unbreakable.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_single));
 //BA.debugLineNum = 480;BA.debugLine="unbreakable.Width = single.Width";
_unbreakable.Width /*int*/  = _single.Width /*int*/ ;
 //BA.debugLineNum = 481;BA.debugLine="unbreakable.NotFullTextChars = TextChars";
_unbreakable.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/  = _textchars;
 //BA.debugLineNum = 482;BA.debugLine="If style.RTL Then";
if (_style.RTL /*boolean*/ ) { 
 //BA.debugLineNum = 483;BA.debugLine="unbreakable.RTL = Run.TextDirection = TextDirect";
_unbreakable.RTL /*boolean*/  = _run.TextDirection /*int*/ ==_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 || (_run.TextDirection /*int*/ ==_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 && _vvvvvvvvvvvvvvvvvvvvvvvvvv0(_unbreakable)==__c.True);
 };
 //BA.debugLineNum = 485;BA.debugLine="Return unbreakable";
if (true) return _unbreakable;
 //BA.debugLineNum = 486;BA.debugLine="End Sub";
return null;
}
public boolean  _vvvvvvvvvvvvvvvvvvvvvvvvvv0(b4a.example.bctextengine._bcunbreakabletext _un) throws Exception{
String _firstchar = "";
int _cp = 0;
 //BA.debugLineNum = 488;BA.debugLine="Private Sub DetectRTL (un As BCUnbreakableText) As";
 //BA.debugLineNum = 489;BA.debugLine="If un.NotFullTextChars.Length = 0 Then";
if (_un.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ .Length /*int*/ ==0) { 
 //BA.debugLineNum = 490;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 492;BA.debugLine="If RTLChars.IsInitialized = False Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.IsInitialized /*boolean*/ ()==__c.False) { 
 //BA.debugLineNum = 493;BA.debugLine="LoadData(RTLChars, \"rtl-data.txt\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,"rtl-data.txt");
 };
 //BA.debugLineNum = 495;BA.debugLine="Dim firstChar As String = un.NotFullTextChars.Buf";
_firstchar = _un.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ .Buffer /*String[]*/ [_un.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ .StartIndex /*int*/ ];
 //BA.debugLineNum = 496;BA.debugLine="Dim cp As Int = BytesToInt(firstChar.GetBytes(Cha";
_cp = _vvvvvvvvvvvvvvvvvvvvvvvvv5(_firstchar.getBytes(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2),(int) (0));
 //BA.debugLineNum = 497;BA.debugLine="Return RTLChars.Contains(cp)";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvv7 /*boolean*/ ((Object)(_cp));
 //BA.debugLineNum = 498;BA.debugLine="End Sub";
return false;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvv1(b4a.example.bctextengine._bctextline _line,int _offsety) throws Exception{
b4a.example.bctextengine._bcunbreakabletext _un = null;
 //BA.debugLineNum = 678;BA.debugLine="Private Sub DrawLine(line As BCTextLine, OffsetY A";
 //BA.debugLineNum = 679;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreaka";
{
final anywheresoftware.b4a.BA.IterableList group1 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_un = (b4a.example.bctextengine._bcunbreakabletext)(group1.Get(index1));
 //BA.debugLineNum = 680;BA.debugLine="DrawUnbreakable(un, OffsetY)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv0(_un,_offsety);
 }
};
 //BA.debugLineNum = 682;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvv2(b4a.example.bctextengine._bcparagraph _paragraph) throws Exception{
b4a.example.bctextengine._bctextline _line = null;
 //BA.debugLineNum = 612;BA.debugLine="Private Sub DrawParagraph (Paragraph As BCParagrap";
 //BA.debugLineNum = 613;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group1 = _paragraph.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (b4a.example.bctextengine._bctextline)(group1.Get(index1));
 //BA.debugLineNum = 614;BA.debugLine="DrawLine(line, line.BaselineY)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv1(_line,_line.BaselineY /*int*/ );
 }
};
 //BA.debugLineNum = 616;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvv3(b4a.example.bctextengine._bctextline _line,anywheresoftware.b4a.objects.B4XViewWrapper _iv,b4a.example.bctextengine._bcparagraph _par) throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
 //BA.debugLineNum = 618;BA.debugLine="Public Sub DrawSingleLine (line As BCTextLine, iv";
 //BA.debugLineNum = 619;BA.debugLine="Dim r As B4XRect = DrawSingleLineShared(line, iv,";
_r = _vvvvvvvvvvvvvvvvvvvvvvvvvvv5(_line,_iv,_par);
 //BA.debugLineNum = 620;BA.debugLine="If r.Width > 0 And r.Height > 0 Then";
if (_r.getWidth()>0 && _r.getHeight()>0) { 
 //BA.debugLineNum = 621;BA.debugLine="ForegroundBC.DrawRect2(r, GetBrush(xui.Color_Tra";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._drawrect2(_r,_vvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_vvvv5.Color_Transparent),__c.True,(int) (0));
 //BA.debugLineNum = 622;BA.debugLine="DrawLine(line, line.MaxHeightAboveBaseLine)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv1(_line,_line.MaxHeightAboveBaseLine /*int*/ );
 //BA.debugLineNum = 623;BA.debugLine="ForegroundBC.SetBitmapToImageView(ForegroundBC.B";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._setbitmaptoimageview(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._getbitmap().Crop((int) (0),(int) (0),(int) (_r.getWidth()),(int) (_r.getHeight())),_iv);
 };
 //BA.debugLineNum = 625;BA.debugLine="End Sub";
return "";
}
public b4a.example.bitmapcreator  _vvvvvvvvvvvvvvvvvvvvvvvvvvv4(b4a.example.bctextengine._bctextline _line,anywheresoftware.b4a.objects.B4XViewWrapper _iv,b4a.example.bctextengine._bcparagraph _par,Object _target) throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
 //BA.debugLineNum = 635;BA.debugLine="Public Sub DrawSingleLineAsync (line As BCTextLine";
 //BA.debugLineNum = 636;BA.debugLine="Dim r As B4XRect = DrawSingleLineShared(line, iv,";
_r = _vvvvvvvvvvvvvvvvvvvvvvvvvvv5(_line,_iv,_par);
 //BA.debugLineNum = 637;BA.debugLine="If r.Width > 0 And r.Height > 0 Then";
if (_r.getWidth()>0 && _r.getHeight()>0) { 
 //BA.debugLineNum = 638;BA.debugLine="AsyncMode = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = __c.True;
 //BA.debugLineNum = 639;BA.debugLine="If AsyncBCs.IsInitialized = False Then AsyncBCs.";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.IsInitialized /*boolean*/ ()==__c.False) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0._initialize /*String*/ (ba);};
 //BA.debugLineNum = 640;BA.debugLine="Dim AsyncTasks As List";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 641;BA.debugLine="AsyncTasks.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Initialize();
 //BA.debugLineNum = 642;BA.debugLine="AsyncBC = FindAsyncBC (r.Width, r.Height)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvv1((int) (_r.getWidth()),(int) (_r.getHeight()));
 //BA.debugLineNum = 643;BA.debugLine="AsyncTasks.Add(AsyncBC.AsyncDrawRect(r, GetBrush";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Add((Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1._asyncdrawrect(_r,_vvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_vvvv5.Color_Transparent),__c.True,(int) (0))));
 //BA.debugLineNum = 644;BA.debugLine="DrawLine(line, line.MaxHeightAboveBaseLine)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv1(_line,_line.MaxHeightAboveBaseLine /*int*/ );
 //BA.debugLineNum = 645;BA.debugLine="AsyncBC.DrawBitmapCreatorsAsync(Target, \"BC\", As";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1._drawbitmapcreatorsasync(_target,"BC",_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
 //BA.debugLineNum = 646;BA.debugLine="AsyncMode = False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = __c.False;
 //BA.debugLineNum = 647;BA.debugLine="Return AsyncBC";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
 };
 //BA.debugLineNum = 649;BA.debugLine="Return Null";
if (true) return (b4a.example.bitmapcreator)(__c.Null);
 //BA.debugLineNum = 650;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect  _vvvvvvvvvvvvvvvvvvvvvvvvvvv5(b4a.example.bctextengine._bctextline _line,anywheresoftware.b4a.objects.B4XViewWrapper _iv,b4a.example.bctextengine._bcparagraph _par) throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
 //BA.debugLineNum = 627;BA.debugLine="Private Sub DrawSingleLineShared (line As BCTextLi";
 //BA.debugLineNum = 628;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 629;BA.debugLine="r.Initialize(0, 0, ForegroundBC.mWidth, line.MaxH";
_r.Initialize((float) (0),(float) (0),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._mwidth),(float) (_line.MaxHeightAboveBaseLine /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ ));
 //BA.debugLineNum = 630;BA.debugLine="iv.SetLayoutAnimated(0,  par.Style.Padding.Left,";
_iv.SetLayoutAnimated((int) (0),(int) (_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()),(int) (_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+(_line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ )/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),(int) (_r.getWidth()/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),(int) (_r.getHeight()/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
 //BA.debugLineNum = 632;BA.debugLine="Return r";
if (true) return _r;
 //BA.debugLineNum = 633;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvv6(b4a.example.bctextengine._bcsinglestylesection _single,int _offsety) throws Exception{
int _offsetx = 0;
boolean _rtl = false;
b4a.example.bctextengine._bcglyphandoffset _go = null;
b4a.example.bctextengine._bcglyph _g = null;
int _x = 0;
b4a.example.bitmapcreator._drawtask _dt = null;
b4a.example.bctextengine._bcstyledunderline _u = null;
int _clr = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
 //BA.debugLineNum = 690;BA.debugLine="Private Sub DrawSingleStyleSection (single As BCSi";
 //BA.debugLineNum = 691;BA.debugLine="Dim OffsetX As Int = single.AbsoluteStartX";
_offsetx = _single.AbsoluteStartX /*int*/ ;
 //BA.debugLineNum = 692;BA.debugLine="Dim rtl As Boolean = single.ParentUN.RTL";
_rtl = _single.ParentUN /*b4a.example.bctextengine._bcunbreakabletext*/ .RTL /*boolean*/ ;
 //BA.debugLineNum = 693;BA.debugLine="If rtl Then OffsetX = single.AbsoluteStartX + sin";
if (_rtl) { 
_offsetx = (int) (_single.AbsoluteStartX /*int*/ +_single.Width /*int*/ );};
 //BA.debugLineNum = 694;BA.debugLine="For Each go As BCGlyphAndOffset In single.GlyphsA";
{
final anywheresoftware.b4a.BA.IterableList group4 = _single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_go = (b4a.example.bctextengine._bcglyphandoffset)(group4.Get(index4));
 //BA.debugLineNum = 695;BA.debugLine="Dim g As BCGlyph = go.Glyph";
_g = _go.Glyph /*b4a.example.bctextengine._bcglyph*/ ;
 //BA.debugLineNum = 699;BA.debugLine="Dim x As Int = OffsetX";
_x = _offsetx;
 //BA.debugLineNum = 700;BA.debugLine="If rtl Then x = x - g.cbc.mWidth";
if (_rtl) { 
_x = (int) (_x-_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mWidth);};
 //BA.debugLineNum = 701;BA.debugLine="If g.cbc.IsInitialized Then";
if (_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .IsInitialized) { 
 //BA.debugLineNum = 702;BA.debugLine="If AsyncMode Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) { 
 //BA.debugLineNum = 703;BA.debugLine="Dim dt As DrawTask = AsyncBC.CreateDrawTask(g.";
_dt = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1._createdrawtask((Object)(_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ ),_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .TargetRect,_x,(int) (_offsety-_g.baseline /*int*/ +_single.Run /*b4a.example.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),__c.True);
 //BA.debugLineNum = 704;BA.debugLine="dt.IsCompressedSource = True";
_dt.IsCompressedSource = __c.True;
 //BA.debugLineNum = 705;BA.debugLine="AsyncTasks.Add(dt)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Add((Object)(_dt));
 }else {
 //BA.debugLineNum = 707;BA.debugLine="ForegroundBC.DrawCompressedBitmap(g.cbc, g.cbc";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._drawcompressedbitmap(_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ ,_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .TargetRect,_x,(int) (_offsety-_g.baseline /*int*/ +_single.Run /*b4a.example.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
 };
 };
 //BA.debugLineNum = 710;BA.debugLine="If single.Run.Underline Then";
if (_single.Run /*b4a.example.bctextengine._bctextrun*/ .Underline /*boolean*/ ) { 
 //BA.debugLineNum = 711;BA.debugLine="Dim u As BCStyledUnderline = GetUnderlineStyle(";
_u = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(_single.Run /*b4a.example.bctextengine._bctextrun*/ );
 //BA.debugLineNum = 712;BA.debugLine="Dim clr As Int = u.Clr";
_clr = _u.Clr /*int*/ ;
 //BA.debugLineNum = 713;BA.debugLine="If clr = 0 Then clr = single.Run.TextColor";
if (_clr==0) { 
_clr = _single.Run /*b4a.example.bctextengine._bctextrun*/ .TextColor /*int*/ ;};
 //BA.debugLineNum = 714;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 715;BA.debugLine="r.Initialize(x, single.Run.VerticalOffset * mSc";
_r.Initialize((float) (_x),(float) (_single.Run /*b4a.example.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0+_offsety+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),(float) (_x+_g.Width /*int*/ +_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1+_go.SpaceBetweenThisAndNext /*int*/ *_single.Run /*b4a.example.bctextengine._bctextrun*/ .CharacterSpacingFactor /*float*/ ),(float) (_offsety+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0+_u.Thickness /*float*/ *_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0+_single.Run /*b4a.example.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
 //BA.debugLineNum = 717;BA.debugLine="If AsyncMode Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) { 
 //BA.debugLineNum = 718;BA.debugLine="AsyncTasks.Add(AsyncBC.AsyncDrawRect(r, GetBru";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Add((Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1._asyncdrawrect(_r,_vvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_clr),__c.True,(int) (0))));
 }else {
 //BA.debugLineNum = 720;BA.debugLine="ForegroundBC.DrawRect2(r, GetBrush(clr), True,";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._drawrect2(_r,_vvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_clr),__c.True,(int) (0));
 };
 };
 //BA.debugLineNum = 723;BA.debugLine="If rtl Then";
if (_rtl) { 
 //BA.debugLineNum = 724;BA.debugLine="OffsetX = OffsetX - g.Width - go.SpaceBetweenTh";
_offsetx = (int) (_offsetx-_g.Width /*int*/ -_go.SpaceBetweenThisAndNext /*int*/ *_single.Run /*b4a.example.bctextengine._bctextrun*/ .CharacterSpacingFactor /*float*/ );
 }else {
 //BA.debugLineNum = 726;BA.debugLine="OffsetX = OffsetX + g.Width + go.SpaceBetweenTh";
_offsetx = (int) (_offsetx+_g.Width /*int*/ +_go.SpaceBetweenThisAndNext /*int*/ *_single.Run /*b4a.example.bctextengine._bctextrun*/ .CharacterSpacingFactor /*float*/ );
 };
 }
};
 //BA.debugLineNum = 729;BA.debugLine="End Sub";
return "";
}
public b4a.example.bctextengine._bcparagraph  _vvvvvvvvvvvvvvvvvvvvvvvvvvv7(anywheresoftware.b4a.objects.collections.List _runs,b4a.example.bctextengine._bcparagraphstyle _style,anywheresoftware.b4a.objects.B4XViewWrapper _foregroundimageview,anywheresoftware.b4a.objects.B4XViewWrapper _sv) throws Exception{
b4a.example.bctextengine._bcparagraph _par = null;
 //BA.debugLineNum = 198;BA.debugLine="Public Sub DrawText (Runs As List, Style As BCPara";
 //BA.debugLineNum = 200;BA.debugLine="Dim par As BCParagraph = Prepare(Runs, Style)";
_par = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(_runs,_style);
 //BA.debugLineNum = 202;BA.debugLine="ResizeLayers(par.Width / mScale, par.Height / mSc";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5((int) (_par.Width /*int*/ /(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),(int) (_par.Height /*int*/ /(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
 //BA.debugLineNum = 203;BA.debugLine="DrawParagraph(par)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv2(_par);
 //BA.debugLineNum = 204;BA.debugLine="If par.Width > 0 And par.Height > 0 Then";
if (_par.Width /*int*/ >0 && _par.Height /*int*/ >0) { 
 //BA.debugLineNum = 205;BA.debugLine="ResizeImageView(ForegroundBC, par, ForegroundIma";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_par,_foregroundimageview,_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .ResizeHeightAutomatically /*boolean*/ );
 };
 //BA.debugLineNum = 207;BA.debugLine="If par.Style.ResizeHeightAutomatically And sv.IsI";
if (_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .ResizeHeightAutomatically /*boolean*/  && _sv.IsInitialized()) { 
 //BA.debugLineNum = 208;BA.debugLine="sv.ScrollViewContentHeight = Max(sv.Height - 2di";
_sv.setScrollViewContentHeight((int) (__c.Max(_sv.getHeight()-__c.DipToCurrent((int) (2)),_foregroundimageview.getHeight()+_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getBottom())));
 };
 //BA.debugLineNum = 210;BA.debugLine="AddParagraphViews(par)";
_vvvvvvvvvvvvvvvvvvvvvvvvv4(_par);
 //BA.debugLineNum = 211;BA.debugLine="Return par";
if (true) return _par;
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvv0(b4a.example.bctextengine._bcunbreakabletext _un,int _offsety) throws Exception{
b4a.example.bctextengine._bcsinglestylesection _single = null;
 //BA.debugLineNum = 684;BA.debugLine="Private Sub DrawUnbreakable (un As BCUnbreakableTe";
 //BA.debugLineNum = 685;BA.debugLine="For Each single As BCSingleStyleSection In un.Sin";
{
final anywheresoftware.b4a.BA.IterableList group1 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_single = (b4a.example.bctextengine._bcsinglestylesection)(group1.Get(index1));
 //BA.debugLineNum = 686;BA.debugLine="DrawSingleStyleSection(single, OffsetY)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv6(_single,_offsety);
 }
};
 //BA.debugLineNum = 688;BA.debugLine="End Sub";
return "";
}
public b4a.example.bitmapcreator  _vvvvvvvvvvvvvvvvvvvvvvvvvvvv1(int _width,int _height) throws Exception{
b4a.example.bitmapcreator _bc = null;
boolean _used = false;
int _i = 0;
boolean _b = false;
 //BA.debugLineNum = 652;BA.debugLine="Private Sub FindAsyncBC (Width As Int, Height As I";
 //BA.debugLineNum = 653;BA.debugLine="For Each bc As BitmapCreator In AsyncBCs.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0._getvvvvvvvvvvvvv1 /*anywheresoftware.b4a.objects.collections.List*/ ();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_bc = (b4a.example.bitmapcreator)(group1.Get(index1));
 //BA.debugLineNum = 654;BA.debugLine="If bc.mWidth = Width And bc.mHeight = Height The";
if (_bc._mwidth==_width && _bc._mheight==_height) { 
 //BA.debugLineNum = 655;BA.debugLine="Dim Used As Boolean = AsyncBCs.Get(bc)";
_used = BA.ObjectToBoolean(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0._vvvvvvvvv4 /*Object*/ ((Object)(_bc)));
 //BA.debugLineNum = 656;BA.debugLine="If Used = False Then";
if (_used==__c.False) { 
 //BA.debugLineNum = 657;BA.debugLine="AsyncBCs.Put(bc, True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0._vvvvvvvvvvvv7 /*String*/ ((Object)(_bc),(Object)(__c.True));
 //BA.debugLineNum = 658;BA.debugLine="Return bc";
if (true) return _bc;
 };
 };
 }
};
 //BA.debugLineNum = 662;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 663;BA.debugLine="bc.Initialize(Width, Height)";
_bc._initialize(ba,_width,_height);
 //BA.debugLineNum = 664;BA.debugLine="AsyncBCs.Put(bc, True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0._vvvvvvvvvvvv7 /*String*/ ((Object)(_bc),(Object)(__c.True));
 //BA.debugLineNum = 665;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 666;BA.debugLine="For Each b As Boolean In AsyncBCs.Values";
{
final anywheresoftware.b4a.BA.IterableList group14 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0._getvvvvvvvvvvvvv2 /*anywheresoftware.b4a.objects.collections.List*/ ();
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_b = BA.ObjectToBoolean(group14.Get(index14));
 //BA.debugLineNum = 667;BA.debugLine="If b Then i = i + 1";
if (_b) { 
_i = (int) (_i+1);};
 }
};
 //BA.debugLineNum = 669;BA.debugLine="Return bc";
if (true) return _bc;
 //BA.debugLineNum = 670;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect  _vvvvvvvvvvvvvvvvvvvvvvvvvvvv2(int _width,int _height) throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _y = 0;
int _x = 0;
 //BA.debugLineNum = 947;BA.debugLine="Private Sub FindMinRect (width As Int, height As I";
 //BA.debugLineNum = 948;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 949;BA.debugLine="r.Initialize(width / 2, -1, -1, 0)";
_r.Initialize((float) (_width/(double)2),(float) (-1),(float) (-1),(float) (0));
 //BA.debugLineNum = 950;BA.debugLine="For y = 0 To height - 1";
{
final int step3 = 1;
final int limit3 = (int) (_height-1);
_y = (int) (0) ;
for (;_y <= limit3 ;_y = _y + step3 ) {
 //BA.debugLineNum = 951;BA.debugLine="For x = 0 To width - 1";
{
final int step4 = 1;
final int limit4 = (int) (_width-1);
_x = (int) (0) ;
for (;_x <= limit4 ;_x = _x + step4 ) {
 //BA.debugLineNum = 952;BA.debugLine="If CharBC.IsTransparent(x, y) = False Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._istransparent(_x,_y)==__c.False) { 
 //BA.debugLineNum = 953;BA.debugLine="r.Left = Min(r.Left, x)";
_r.setLeft((float) (__c.Min(_r.getLeft(),_x)));
 //BA.debugLineNum = 954;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 957;BA.debugLine="If x < width Then";
if (_x<_width) { 
 //BA.debugLineNum = 958;BA.debugLine="If r.Top = -1 Then";
if (_r.getTop()==-1) { 
 //BA.debugLineNum = 959;BA.debugLine="r.Top = y";
_r.setTop((float) (_y));
 }else {
 //BA.debugLineNum = 961;BA.debugLine="r.Bottom = y + 1";
_r.setBottom((float) (_y+1));
 };
 //BA.debugLineNum = 963;BA.debugLine="For x = width - 1 To 0 Step -1";
{
final int step16 = -1;
final int limit16 = (int) (0);
_x = (int) (_width-1) ;
for (;_x >= limit16 ;_x = _x + step16 ) {
 //BA.debugLineNum = 964;BA.debugLine="If CharBC.IsTransparent(x, y) = False Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._istransparent(_x,_y)==__c.False) { 
 //BA.debugLineNum = 965;BA.debugLine="r.Right = Max(r.Right, x + 1)";
_r.setRight((float) (__c.Max(_r.getRight(),_x+1)));
 //BA.debugLineNum = 966;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 }
};
 //BA.debugLineNum = 971;BA.debugLine="r.Bottom = Max(r.Bottom, r.Top + 1)";
_r.setBottom((float) (__c.Max(_r.getBottom(),_r.getTop()+1)));
 //BA.debugLineNum = 972;BA.debugLine="Return r";
if (true) return _r;
 //BA.debugLineNum = 973;BA.debugLine="End Sub";
return null;
}
public b4a.example.bctextengine._bcsinglestylesection  _vvvvvvvvvvvvvvvvvvvvvvvvvvvv3(b4a.example.bctextengine._bcparagraph _paragraph,int _x,int _y) throws Exception{
b4a.example.bctextengine._bctextline _line = null;
b4a.example.bctextengine._bcunbreakabletext _un = null;
b4a.example.bctextengine._bcsinglestylesection _s = null;
 //BA.debugLineNum = 758;BA.debugLine="Public Sub FindSingleStyleSection (Paragraph As BC";
 //BA.debugLineNum = 759;BA.debugLine="x = x * mScale";
_x = (int) (_x*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 760;BA.debugLine="y = y * mScale";
_y = (int) (_y*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 761;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group3 = _paragraph.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_line = (b4a.example.bctextengine._bctextline)(group3.Get(index3));
 //BA.debugLineNum = 763;BA.debugLine="If line.BaseLineY - line.MaxHeightAboveBaseLine";
if (_line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ <=_y && _line.BaselineY /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ >=_y) { 
 //BA.debugLineNum = 764;BA.debugLine="For Each un As BCUnbreakableText In line.Unbrea";
{
final anywheresoftware.b4a.BA.IterableList group5 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_un = (b4a.example.bctextengine._bcunbreakabletext)(group5.Get(index5));
 //BA.debugLineNum = 765;BA.debugLine="If (Paragraph.Style.RTL = False And line.Start";
if ((_paragraph.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/ ==__c.False && _line.StartX /*int*/ +_un.StartX /*int*/ <=_x && _line.StartX /*int*/ +_un.StartX /*int*/ +_un.Width /*int*/ >=_x) || (_paragraph.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/  && _line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ <=_y && _line.BaselineY /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ >=_y)) { 
 //BA.debugLineNum = 767;BA.debugLine="For Each s As BCSingleStyleSection In un.Sing";
{
final anywheresoftware.b4a.BA.IterableList group7 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_s = (b4a.example.bctextengine._bcsinglestylesection)(group7.Get(index7));
 //BA.debugLineNum = 768;BA.debugLine="If s.AbsoluteStartX <= x And s.AbsoluteStart";
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
 //BA.debugLineNum = 774;BA.debugLine="Return Null";
if (true) return (b4a.example.bctextengine._bcsinglestylesection)(__c.Null);
 //BA.debugLineNum = 775;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvv4(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,int _clr) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 975;BA.debugLine="Private Sub FontToKey (fnt As B4XFont, Clr As Int)";
 //BA.debugLineNum = 977;BA.debugLine="Dim jo As JavaObject = fnt.ToNativeFont";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_fnt.ToNativeFont().getObject()));
 //BA.debugLineNum = 978;BA.debugLine="Return Clr + jo.RunMethod(\"hashCode\", Null) + fnt";
if (true) return BA.NumberToString(_clr+(double)(BA.ObjectToNumber(_jo.RunMethod("hashCode",(Object[])(__c.Null))))+_fnt.getSize());
 //BA.debugLineNum = 984;BA.debugLine="End Sub";
return "";
}
public b4a.example.bcpath._bcbrush  _vvvvvvvvvvvvvvvvvvvvvvvvvvvv5(int _clr) throws Exception{
b4a.example.bcpath._bcbrush _b = null;
 //BA.debugLineNum = 781;BA.debugLine="Private Sub GetBrush(clr As Int) As BCBrush";
 //BA.debugLineNum = 782;BA.debugLine="If Brushes.ContainsKey(clr) Then Return Brushes.G";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ContainsKey((Object)(_clr))) { 
if (true) return (b4a.example.bcpath._bcbrush)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Get((Object)(_clr)));};
 //BA.debugLineNum = 783;BA.debugLine="Dim b As BCBrush = ForegroundBC.CreateBrushFromCo";
_b = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._createbrushfromcolor(_clr);
 //BA.debugLineNum = 784;BA.debugLine="Brushes.Put(clr, b)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Put((Object)(_clr),(Object)(_b));
 //BA.debugLineNum = 785;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 786;BA.debugLine="End Sub";
return null;
}
public b4a.example.bctextengine._bcsinglestylesection  _vvvvvvvvvvvvvvvvvvvvvvvvvvvv6(b4a.example.bctextengine._bctextline _line) throws Exception{
b4a.example.bctextengine._bcunbreakabletext _firstun = null;
 //BA.debugLineNum = 388;BA.debugLine="Private Sub GetFirstSingleStyle (Line As BCTextLin";
 //BA.debugLineNum = 389;BA.debugLine="Dim FirstUN As BCUnbreakableText = Line.Unbreakab";
_firstun = (b4a.example.bctextengine._bcunbreakabletext)(_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
 //BA.debugLineNum = 390;BA.debugLine="Return FirstUN.SingleStyleSections.Get(0)";
if (true) return (b4a.example.bctextengine._bcsinglestylesection)(_firstun.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
 //BA.debugLineNum = 391;BA.debugLine="End Sub";
return null;
}
public b4a.example.bctextengine._bcfontmetrics  _vvvvvvvvvvvvvvvvvvvvvvvvvvvv7(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,int _clr) throws Exception{
String _key = "";
b4a.example.bctextengine._bcfontmetrics _fm = null;
 //BA.debugLineNum = 789;BA.debugLine="Public Sub GetFontMetrics(Fnt As B4XFont, clr As I";
 //BA.debugLineNum = 790;BA.debugLine="Dim key As String = FontToKey(Fnt, clr)";
_key = _vvvvvvvvvvvvvvvvvvvvvvvvvvvv4(_fnt,_clr);
 //BA.debugLineNum = 791;BA.debugLine="If FontMetricsCache.ContainsKey(key) Then Return";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.ContainsKey((Object)(_key))) { 
if (true) return (b4a.example.bctextengine._bcfontmetrics)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Get((Object)(_key)));};
 //BA.debugLineNum = 792;BA.debugLine="Dim fm As BCFontMetrics";
_fm = new b4a.example.bctextengine._bcfontmetrics();
 //BA.debugLineNum = 793;BA.debugLine="fm.Initialize";
_fm.Initialize();
 //BA.debugLineNum = 794;BA.debugLine="fm.Glyphs.Initialize";
_fm.Glyphs /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 795;BA.debugLine="fm.Clr = clr";
_fm.Clr /*int*/  = _clr;
 //BA.debugLineNum = 796;BA.debugLine="fm.Fnt = Fnt";
_fm.Fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _fnt;
 //BA.debugLineNum = 797;BA.debugLine="If clr = DefaultColor Then";
if (_clr==_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6) { 
 //BA.debugLineNum = 798;BA.debugLine="fm.KerningTable.Initialize";
_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 799;BA.debugLine="fm.DefaultColorMetrics = fm";
_fm.DefaultColorMetrics /*b4a.example.bctextengine._bcfontmetrics*/  = _fm;
 //BA.debugLineNum = 800;BA.debugLine="fm.xWidth = CreateGlyph(\"x\", fm, False).Width";
_fm.xWidth /*int*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvv1("x",_fm,__c.False).Width /*int*/ ;
 }else {
 //BA.debugLineNum = 802;BA.debugLine="fm.DefaultColorMetrics = GetFontMetrics(Fnt, Def";
_fm.DefaultColorMetrics /*b4a.example.bctextengine._bcfontmetrics*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvvvv7(_fnt,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
 //BA.debugLineNum = 803;BA.debugLine="fm.xWidth = fm.DefaultColorMetrics.xWidth";
_fm.xWidth /*int*/  = _fm.DefaultColorMetrics /*b4a.example.bctextengine._bcfontmetrics*/ .xWidth /*int*/ ;
 //BA.debugLineNum = 804;BA.debugLine="fm.KerningTable = fm.DefaultColorMetrics.Kerning";
_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/  = _fm.DefaultColorMetrics /*b4a.example.bctextengine._bcfontmetrics*/ .KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ ;
 };
 //BA.debugLineNum = 806;BA.debugLine="FontMetricsCache.Put(key, fm)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Put((Object)(_key),(Object)(_fm));
 //BA.debugLineNum = 807;BA.debugLine="Return fm";
if (true) return _fm;
 //BA.debugLineNum = 808;BA.debugLine="End Sub";
return null;
}
public int  _vvvvvvvvvvvvvvvvvvvvvvvvvvvv0(b4a.example.bctextengine._bcfontmetrics _fm,String _prevchar,String _thischar,b4a.example.bctextengine._bcglyph _prevglyph,b4a.example.bctextengine._bcglyph _thisglyph) throws Exception{
String _together = "";
int _space = 0;
int _res = 0;
int _w = 0;
 //BA.debugLineNum = 597;BA.debugLine="Private Sub GetKernSpaceBetweenChars (fm As BCFont";
 //BA.debugLineNum = 598;BA.debugLine="Dim together As String = PrevChar & ThisChar";
_together = _prevchar+_thischar;
 //BA.debugLineNum = 599;BA.debugLine="Dim Space As Int = fm.KerningTable.GetDefault(tog";
_space = (int)(BA.ObjectToNumber(_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_together),(Object)(-1000))));
 //BA.debugLineNum = 600;BA.debugLine="If Space > -1000 Then Return Space";
if (_space>-1000) { 
if (true) return _space;};
 //BA.debugLineNum = 601;BA.debugLine="Dim res As Int";
_res = 0;
 //BA.debugLineNum = 602;BA.debugLine="If ThisGlyph.Empty Or PrevGlyph.Empty Then";
if (_thisglyph.Empty /*boolean*/  || _prevglyph.Empty /*boolean*/ ) { 
 //BA.debugLineNum = 603;BA.debugLine="res = mSpaceBetweenCharacters";
_res = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1);
 }else {
 //BA.debugLineNum = 605;BA.debugLine="Dim w As Int = CreateGlyph(together, fm, True).W";
_w = _vvvvvvvvvvvvvvvvvvvvvvvvvv1(_together,_fm,__c.True).Width /*int*/ ;
 //BA.debugLineNum = 606;BA.debugLine="res = w - PrevGlyph.Width - ThisGlyph.Width";
_res = (int) (_w-_prevglyph.Width /*int*/ -_thisglyph.Width /*int*/ );
 };
 //BA.debugLineNum = 608;BA.debugLine="fm.KerningTable.Put(together, res)";
_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_together),(Object)(_res));
 //BA.debugLineNum = 609;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 610;BA.debugLine="End Sub";
return 0;
}
public float  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
 //BA.debugLineNum = 986;BA.debugLine="Public Sub getSpaceBetweenCharacters As Float";
 //BA.debugLineNum = 987;BA.debugLine="Return mSpaceBetweenCharacters / mScale";
if (true) return (float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 988;BA.debugLine="End Sub";
return 0f;
}
public float  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 994;BA.debugLine="Public Sub getSpaceBetweenLines As Float";
 //BA.debugLineNum = 995;BA.debugLine="Return mSpaceBetweenLines / mScale";
if (true) return (float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 996;BA.debugLine="End Sub";
return 0f;
}
public b4a.example.bctextengine._bcstyledunderline  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(b4a.example.bctextengine._bctextrun _run) throws Exception{
 //BA.debugLineNum = 731;BA.debugLine="Private Sub GetUnderlineStyle(run As BCTextRun) As";
 //BA.debugLineNum = 732;BA.debugLine="If run.Extra.IsInitialized = False Then Return De";
if (_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;};
 //BA.debugLineNum = 733;BA.debugLine="Return run.Extra.GetDefault(EXTRA_STYLEDUNDERLINE";
if (true) return (b4a.example.bctextengine._bcstyledunderline)(_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_extra_styledunderline),(Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7)));
 //BA.debugLineNum = 734;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(b4a.example.bctextengine._bctextrun _run,anywheresoftware.b4a.objects.collections.List _unbreakables,b4a.example.bctextengine._bcparagraphstyle _style) throws Exception{
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
 //BA.debugLineNum = 403;BA.debugLine="Private Sub HandleConnectedTextRuns (Run As BCText";
 //BA.debugLineNum = 404;BA.debugLine="Dim children As List";
_children = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 405;BA.debugLine="children.Initialize";
_children.Initialize();
 //BA.debugLineNum = 406;BA.debugLine="Dim cr As BCConnectedRuns = Run.EXTRA.Get(EXTRA_C";
_cr = (b4a.example.bctextengine._bcconnectedruns)(_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_extra_connectedruns)));
 //BA.debugLineNum = 407;BA.debugLine="For Each r As BCTextRun In cr.Runs";
{
final anywheresoftware.b4a.BA.IterableList group4 = _cr.Runs /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_r = (b4a.example.bctextengine._bctextrun)(group4.Get(index4));
 //BA.debugLineNum = 408;BA.debugLine="HandleTextRun(r, children, Style)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_r,_children,_style);
 }
};
 //BA.debugLineNum = 410;BA.debugLine="Dim width As Int";
_width = 0;
 //BA.debugLineNum = 411;BA.debugLine="For Each un As BCUnbreakableText In children";
{
final anywheresoftware.b4a.BA.IterableList group8 = _children;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_un = (b4a.example.bctextengine._bcunbreakabletext)(group8.Get(index8));
 //BA.debugLineNum = 412;BA.debugLine="un.IsMergable = True";
_un.IsMergable /*boolean*/  = __c.True;
 //BA.debugLineNum = 413;BA.debugLine="width = width + un.Width";
_width = (int) (_width+_un.Width /*int*/ );
 }
};
 //BA.debugLineNum = 415;BA.debugLine="Dim fm As BCFontMetrics = GetFontMetrics(Run.Text";
_fm = _vvvvvvvvvvvvvvvvvvvvvvvvvvvv7(_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_run.TextColor /*int*/ );
 //BA.debugLineNum = 416;BA.debugLine="Dim ConnectedWidth As Int = cr.ConnectedWidth * m";
_connectedwidth = (int) (_cr.ConnectedWidth /*int*/ *_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 418;BA.debugLine="Dim u As BCUnbreakableText = children.Get(0)";
_u = (b4a.example.bctextengine._bcunbreakabletext)(_children.Get((int) (0)));
 //BA.debugLineNum = 419;BA.debugLine="For i = 1 To children.Size - 1";
{
final int step15 = 1;
final int limit15 = (int) (_children.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
 //BA.debugLineNum = 420;BA.debugLine="MergeUnbreakables(u, children.Get(i))";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(_u,(b4a.example.bctextengine._bcunbreakabletext)(_children.Get(_i)));
 }
};
 //BA.debugLineNum = 422;BA.debugLine="If width < ConnectedWidth Then";
if (_width<_connectedwidth) { 
 //BA.debugLineNum = 423;BA.debugLine="Dim leftOffset As Int";
_leftoffset = 0;
 //BA.debugLineNum = 424;BA.debugLine="Select cr.Alignment.ToLowerCase";
switch (BA.switchObjectToInt(_cr.Alignment /*String*/ .toLowerCase(),"center","right")) {
case 0: {
 //BA.debugLineNum = 426;BA.debugLine="leftOffset = (ConnectedWidth - u.Width) / 2";
_leftoffset = (int) ((_connectedwidth-_u.Width /*int*/ )/(double)2);
 break; }
case 1: {
 //BA.debugLineNum = 428;BA.debugLine="leftOffset = ConnectedWidth - u.Width - mSpace";
_leftoffset = (int) (_connectedwidth-_u.Width /*int*/ -_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1);
 break; }
}
;
 //BA.debugLineNum = 430;BA.debugLine="u.Width = ConnectedWidth";
_u.Width /*int*/  = _connectedwidth;
 //BA.debugLineNum = 431;BA.debugLine="If leftOffset > 0 Then";
if (_leftoffset>0) { 
 //BA.debugLineNum = 432;BA.debugLine="Dim single As BCSingleStyleSection = CreateSing";
_single = _vvvvvvvvvvvvvvvvvvvvvvvvvv5(_run,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,_fm);
 //BA.debugLineNum = 433;BA.debugLine="single.Width = leftOffset";
_single.Width /*int*/  = _leftoffset;
 //BA.debugLineNum = 434;BA.debugLine="u.SingleStyleSections.InsertAt(0, single)";
_u.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt((int) (0),(Object)(_single));
 };
 };
 //BA.debugLineNum = 437;BA.debugLine="u.IsMergable = False";
_u.IsMergable /*boolean*/  = __c.False;
 //BA.debugLineNum = 438;BA.debugLine="Unbreakables.Add(u)";
_unbreakables.Add((Object)(_u));
 //BA.debugLineNum = 439;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(b4a.example.bctextengine._bctextrun _run,anywheresoftware.b4a.objects.collections.List _unbreakables,b4a.example.bctextengine._bcparagraphstyle _style) throws Exception{
b4a.example.bctextengine._bcfontmetrics _fm = null;
int _i1 = 0;
int _i = 0;
String _c = "";
boolean _separatorgoestogetherwithtext = false;
int _offset = 0;
 //BA.debugLineNum = 441;BA.debugLine="Private Sub HandleTextRun (Run As BCTextRun, Unbre";
 //BA.debugLineNum = 442;BA.debugLine="Dim fm As BCFontMetrics = GetFontMetrics(Run.Text";
_fm = _vvvvvvvvvvvvvvvvvvvvvvvvvvvv7(_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_run.TextColor /*int*/ );
 //BA.debugLineNum = 443;BA.debugLine="Dim i1 As Int";
_i1 = 0;
 //BA.debugLineNum = 444;BA.debugLine="For i = 0 To Run.TextChars.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_run.TextChars /*b4a.example.bctextengine._bctextchars*/ .Length /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 445;BA.debugLine="Dim c As String = Run.TextChars.Buffer(Run.TextC";
_c = _run.TextChars /*b4a.example.bctextengine._bctextchars*/ .Buffer /*String[]*/ [(int) (_run.TextChars /*b4a.example.bctextengine._bctextchars*/ .StartIndex /*int*/ +_i)];
 //BA.debugLineNum = 446;BA.debugLine="If WordBoundaries.Contains(c) Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.contains(_c)) { 
 //BA.debugLineNum = 447;BA.debugLine="Dim SeparatorGoesTogetherWithText As Boolean";
_separatorgoestogetherwithtext = false;
 //BA.debugLineNum = 448;BA.debugLine="If i >= i1 + 1 Then";
if (_i>=_i1+1) { 
 //BA.debugLineNum = 449;BA.debugLine="Dim offset As Int";
_offset = 0;
 //BA.debugLineNum = 450;BA.debugLine="If WordBoundariesThatCanConnectToPrevWord.Inde";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.indexOf(_c)>-1) { 
 //BA.debugLineNum = 451;BA.debugLine="offset = 1";
_offset = (int) (1);
 //BA.debugLineNum = 452;BA.debugLine="SeparatorGoesTogetherWithText = True";
_separatorgoestogetherwithtext = __c.True;
 };
 //BA.debugLineNum = 454;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, TextCh";
_unbreakables.Add((Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvv7(_run,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(_run.TextChars /*b4a.example.bctextengine._bctextchars*/ ,_i1,(int) (_i+_offset)),_fm,__c.True,_style)));
 };
 //BA.debugLineNum = 456;BA.debugLine="If SeparatorGoesTogetherWithText = False Then";
if (_separatorgoestogetherwithtext==__c.False) { 
 //BA.debugLineNum = 457;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, TextCh";
_unbreakables.Add((Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvv7(_run,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(_run.TextChars /*b4a.example.bctextengine._bctextchars*/ ,_i,(int) (_i+1)),_fm,__c.True,_style)));
 }else {
 //BA.debugLineNum = 459;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, EmptyT";
_unbreakables.Add((Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvv7(_run,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,_fm,__c.True,_style)));
 };
 //BA.debugLineNum = 461;BA.debugLine="i1 = i + 1";
_i1 = (int) (_i+1);
 }else if((_c).equals(BA.ObjectToString(__c.Chr((int) (13))))) { 
 //BA.debugLineNum = 463;BA.debugLine="Continue";
if (true) continue;
 };
 }
};
 //BA.debugLineNum = 466;BA.debugLine="If i1 < Run.TextChars.Length Then Unbreakables.Ad";
if (_i1<_run.TextChars /*b4a.example.bctextengine._bctextchars*/ .Length /*int*/ ) { 
_unbreakables.Add((Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvv7(_run,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(_run.TextChars /*b4a.example.bctextengine._bctextchars*/ ,_i1,_run.TextChars /*b4a.example.bctextengine._bctextchars*/ .Length /*int*/ ),_fm,__c.False,_style)));};
 //BA.debugLineNum = 467;BA.debugLine="If Run.View.IsInitialized Then";
if (_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
 //BA.debugLineNum = 468;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, EmptyTex";
_unbreakables.Add((Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvv7(_run,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,_fm,__c.False,_style)));
 };
 //BA.debugLineNum = 470;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
byte[] _b = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
 //BA.debugLineNum = 68;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
 //BA.debugLineNum = 69;BA.debugLine="CustomFonts.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize();
 //BA.debugLineNum = 70;BA.debugLine="VowelsCodePoints.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._initialize /*String*/ (ba);
 //BA.debugLineNum = 71;BA.debugLine="EmptyTextChars = CreateBCTextCharsFromString(\"\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _vvvvvvvvvvvvvvvvvvvvvvvvv7("");
 //BA.debugLineNum = 72;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _vvvv5.CreatePanel(ba,"");
 //BA.debugLineNum = 73;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 2dip, 2dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 86;BA.debugLine="setSpaceBetweenCharacters(100dip / 100)";
_setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2((float) (__c.DipToCurrent((int) (100))/(double)100));
 //BA.debugLineNum = 87;BA.debugLine="setSpaceBetweenLines(20dip)";
_setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3((float) (__c.DipToCurrent((int) (20))));
 //BA.debugLineNum = 88;BA.debugLine="cvs.Initialize(p)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize(_p);
 //BA.debugLineNum = 89;BA.debugLine="ResizeCharBC(50dip * mScale, 50dip * mScale)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3((int) (__c.DipToCurrent((int) (50))*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),(int) (__c.DipToCurrent((int) (50))*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
 //BA.debugLineNum = 90;BA.debugLine="Brushes.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Initialize();
 //BA.debugLineNum = 91;BA.debugLine="ResizeLayers(200dip, 100dip)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(__c.DipToCurrent((int) (200)),__c.DipToCurrent((int) (100)));
 //BA.debugLineNum = 92;BA.debugLine="cbccache.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Initialize();
 //BA.debugLineNum = 93;BA.debugLine="cbccache.ColorsMap.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.ColorsMap.Initialize();
 //BA.debugLineNum = 94;BA.debugLine="FontMetricsCache.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Initialize();
 //BA.debugLineNum = 95;BA.debugLine="Dim b(CharBC.SAME_COLOR_LENGTH_FOR_CACHE * 4 * Ch";
_b = new byte[(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._same_color_length_for_cache*4*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._max_same_color_size+4)];
;
 //BA.debugLineNum = 96;BA.debugLine="cbccache.mBuffer = b";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.mBuffer = _b;
 //BA.debugLineNum = 97;BA.debugLine="DefaultFont = xui.CreateDefaultFont(16)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvv5.CreateDefaultFont((float) (16));
 //BA.debugLineNum = 98;BA.debugLine="DefaultStyle = CreateStyle";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = _vvvvvvvvvvvvvvvvvvvvvvvvvv6();
 //BA.debugLineNum = 99;BA.debugLine="TagParser.Initialize (Me)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._initialize /*String*/ (ba,(b4a.example.bctextengine)(this));
 //BA.debugLineNum = 100;BA.debugLine="DefaultUnderlineStyle.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Initialize();
 //BA.debugLineNum = 101;BA.debugLine="DefaultUnderlineStyle.Clr = 0";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Clr /*int*/  = (int) (0);
 //BA.debugLineNum = 102;BA.debugLine="DefaultUnderlineStyle.Style = \"line\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Style /*String*/  = "line";
 //BA.debugLineNum = 103;BA.debugLine="DefaultUnderlineStyle.Thickness = 1dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Thickness /*float*/  = (float) (__c.DipToCurrent((int) (1)));
 //BA.debugLineNum = 104;BA.debugLine="For Each v As B4XView In Parent.GetAllViewsRecurs";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group24 = _parent.GetAllViewsRecursive();
final int groupLen24 = group24.getSize()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group24.Get(index24)));
 //BA.debugLineNum = 105;BA.debugLine="If v.Tag Is BBCodeView Or v.Tag Is BBLabel Then";
if (_v.getTag() instanceof b4a.example.bbcodeview || _v.getTag() instanceof b4a.example.bblabel) { 
 //BA.debugLineNum = 106;BA.debugLine="CallSub2(v.Tag, \"setTextEngine\", Me)";
__c.CallSubNew2(ba,_v.getTag(),"setTextEngine",this);
 };
 }
};
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public boolean  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(b4a.example.bctextengine._bctextchars _tc) throws Exception{
 //BA.debugLineNum = 777;BA.debugLine="Private Sub IsSpace(TC As BCTextChars) As Boolean";
 //BA.debugLineNum = 778;BA.debugLine="Return TextCharEquals(TC, \" \")";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(_tc," ");
 //BA.debugLineNum = 779;BA.debugLine="End Sub";
return false;
}
public boolean  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(b4a.example.bctextengine._bcunbreakabletext _un) throws Exception{
 //BA.debugLineNum = 363;BA.debugLine="Private Sub IsUNSeparator (un As BCUnbreakableText";
 //BA.debugLineNum = 364;BA.debugLine="If un.NotFullTextChars.Length = 0 Then Return Fal";
if (_un.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ .Length /*int*/ ==0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 365;BA.debugLine="Return WordBoundaries.Contains(un.NotFullTextChar";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.contains(_un.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ .Buffer /*String[]*/ [_un.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ .StartIndex /*int*/ ]);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return false;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(b4a.example.b4xset _set,String _filename) throws Exception{
String _line = "";
int _i = 0;
int _a = 0;
 //BA.debugLineNum = 1069;BA.debugLine="Private Sub LoadData(Set As B4XSet, FileName As St";
 //BA.debugLineNum = 1070;BA.debugLine="Set.Initialize";
_set._initialize /*String*/ (ba);
 //BA.debugLineNum = 1071;BA.debugLine="For Each line As String In File.ReadList(File.Dir";
{
final anywheresoftware.b4a.BA.IterableList group2 = __c.File.ReadList(__c.File.getDirAssets(),_filename);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_line = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1072;BA.debugLine="line = line.Trim";
_line = _line.trim();
 //BA.debugLineNum = 1073;BA.debugLine="Dim i As Int = line.IndexOf(\".\")";
_i = _line.indexOf(".");
 //BA.debugLineNum = 1074;BA.debugLine="If i = -1 Then";
if (_i==-1) { 
 //BA.debugLineNum = 1075;BA.debugLine="Set.Add(Bit.ParseInt(line, 16))";
_set._vvvvvvvvvvvvv5 /*String*/ ((Object)(__c.Bit.ParseInt(_line,(int) (16))));
 }else {
 //BA.debugLineNum = 1077;BA.debugLine="For a = Bit.ParseInt(line.SubString2(0, i), 16)";
{
final int step8 = 1;
final int limit8 = __c.Bit.ParseInt(_line.substring((int) (_i+2)),(int) (16));
_a = __c.Bit.ParseInt(_line.substring((int) (0),_i),(int) (16)) ;
for (;_a <= limit8 ;_a = _a + step8 ) {
 //BA.debugLineNum = 1078;BA.debugLine="Set.Add(a)";
_set._vvvvvvvvvvvvv5 /*String*/ ((Object)(_a));
 }
};
 };
 }
};
 //BA.debugLineNum = 1082;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(b4a.example.bctextengine._bcunbreakabletext _un1,b4a.example.bctextengine._bcunbreakabletext _un2) throws Exception{
b4a.example.bctextengine._bcsinglestylesection _single = null;
 //BA.debugLineNum = 540;BA.debugLine="Private Sub MergeUnbreakables (un1 As BCUnbreakabl";
 //BA.debugLineNum = 541;BA.debugLine="un1.Width = un1.Width + un2.Width + mSpaceBetween";
_un1.Width /*int*/  = (int) (_un1.Width /*int*/ +_un2.Width /*int*/ +_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1);
 //BA.debugLineNum = 542;BA.debugLine="For Each single As BCSingleStyleSection In un2.Si";
{
final anywheresoftware.b4a.BA.IterableList group2 = _un2.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_single = (b4a.example.bctextengine._bcsinglestylesection)(group2.Get(index2));
 //BA.debugLineNum = 543;BA.debugLine="single.ParentUN = un1";
_single.ParentUN /*b4a.example.bctextengine._bcunbreakabletext*/  = _un1;
 }
};
 //BA.debugLineNum = 545;BA.debugLine="un1.SingleStyleSections.AddAll(un2.SingleStyleSec";
_un1.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(_un2.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 546;BA.debugLine="If un1.NotFullTextChars.Length = 0 Then un1.NotFu";
if (_un1.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ .Length /*int*/ ==0) { 
_un1.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/  = _un2.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ ;};
 //BA.debugLineNum = 547;BA.debugLine="End Sub";
return "";
}
public boolean  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(String _c) throws Exception{
int _cp = 0;
 //BA.debugLineNum = 891;BA.debugLine="Private Sub MightBeAnEmoji(c As String) As Boolean";
 //BA.debugLineNum = 892;BA.debugLine="Dim cp As Int = Asc(c)";
_cp = __c.Asc(BA.ObjectToChar(_c));
 //BA.debugLineNum = 893;BA.debugLine="Return cp >= 0x231A Or c.Length > 1";
if (true) return _cp>=0x231a || _c.length()>1;
 //BA.debugLineNum = 894;BA.debugLine="End Sub";
return false;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(b4a.example.bctextengine._bcparagraph _p) throws Exception{
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
 //BA.debugLineNum = 231;BA.debugLine="Private Sub OrganizeLines (p As BCParagraph)";
 //BA.debugLineNum = 232;BA.debugLine="Dim ParAlignment As String = p.Style.HorizontalAl";
_paralignment = _p.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .HorizontalAlignment /*String*/ .toLowerCase();
 //BA.debugLineNum = 233;BA.debugLine="Dim count As Int";
_count = 0;
 //BA.debugLineNum = 234;BA.debugLine="Dim PrevLineBelowBaselineHeight As Int";
_prevlinebelowbaselineheight = 0;
 //BA.debugLineNum = 235;BA.debugLine="For Each line As BCTextLine In p.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group4 = _p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_line = (b4a.example.bctextengine._bctextline)(group4.Get(index4));
 //BA.debugLineNum = 236;BA.debugLine="p.Width = Max(p.Width, line.Width)";
_p.Width /*int*/  = (int) (__c.Max(_p.Width /*int*/ ,_line.Width /*int*/ ));
 //BA.debugLineNum = 237;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group6 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_un = (b4a.example.bctextengine._bcunbreakabletext)(group6.Get(index6));
 //BA.debugLineNum = 238;BA.debugLine="For Each single As BCSingleStyleSection In un.S";
{
final anywheresoftware.b4a.BA.IterableList group7 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_single = (b4a.example.bctextengine._bcsinglestylesection)(group7.Get(index7));
 //BA.debugLineNum = 239;BA.debugLine="line.MaxHeightAboveBaseLine = Max(single.MaxHe";
_line.MaxHeightAboveBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightAboveBaseLine /*int*/ ,_line.MaxHeightAboveBaseLine /*int*/ ));
 //BA.debugLineNum = 240;BA.debugLine="line.MaxHeightBelowBaseLine = Max(single.MaxHe";
_line.MaxHeightBelowBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightBelowBaseLine /*int*/ ,_line.MaxHeightBelowBaseLine /*int*/ ));
 }
};
 }
};
 //BA.debugLineNum = 243;BA.debugLine="If count = 0 Then";
if (_count==0) { 
 //BA.debugLineNum = 244;BA.debugLine="line.Height = line.MaxHeightAboveBaseLine";
_line.Height /*int*/  = _line.MaxHeightAboveBaseLine /*int*/ ;
 }else {
 //BA.debugLineNum = 246;BA.debugLine="line.Height =  Max(line.MaxHeightAboveBaseLine";
_line.Height /*int*/  = (int) (__c.Max(_line.MaxHeightAboveBaseLine /*int*/ +_prevlinebelowbaselineheight+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2*_p.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .LineSpacingFactor /*float*/ ));
 };
 //BA.debugLineNum = 248;BA.debugLine="p.Height = p.Height + line.Height";
_p.Height /*int*/  = (int) (_p.Height /*int*/ +_line.Height /*int*/ );
 //BA.debugLineNum = 249;BA.debugLine="line.BaselineY = p.Height";
_line.BaselineY /*int*/  = _p.Height /*int*/ ;
 //BA.debugLineNum = 250;BA.debugLine="PrevLineBelowBaselineHeight = line.MaxHeightBelo";
_prevlinebelowbaselineheight = _line.MaxHeightBelowBaseLine /*int*/ ;
 //BA.debugLineNum = 251;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
 }
};
 //BA.debugLineNum = 253;BA.debugLine="Dim MaxWidth As Int = (p.Style.MaxWidth - p.Style";
_maxwidth = (int) ((_p.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .MaxWidth /*int*/ -_p.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()-_p.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getRight())*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 254;BA.debugLine="p.Width = Min(MaxWidth, p.Width)";
_p.Width /*int*/  = (int) (__c.Min(_maxwidth,_p.Width /*int*/ ));
 //BA.debugLineNum = 255;BA.debugLine="p.Height = p.Height + line.MaxHeightBelowBaseLine";
_p.Height /*int*/  = (int) (_p.Height /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ );
 //BA.debugLineNum = 256;BA.debugLine="Dim alignment As String";
_alignment = "";
 //BA.debugLineNum = 257;BA.debugLine="For Each line As BCTextLine In p.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group26 = _p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen26 = group26.getSize()
;int index26 = 0;
;
for (; index26 < groupLen26;index26++){
_line = (b4a.example.bctextengine._bctextline)(group26.Get(index26));
 //BA.debugLineNum = 258;BA.debugLine="If line.Unbreakables.Size = 0 Then Continue";
if (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) continue;};
 //BA.debugLineNum = 259;BA.debugLine="Dim linestyle As BCSingleStyleSection = GetFirst";
_linestyle = _vvvvvvvvvvvvvvvvvvvvvvvvvvvv6(_line);
 //BA.debugLineNum = 260;BA.debugLine="If linestyle.Run.HorizontalAlignment = \"\" Then a";
if ((_linestyle.Run /*b4a.example.bctextengine._bctextrun*/ .HorizontalAlignment /*String*/ ).equals("")) { 
_alignment = _paralignment;}
else {
_alignment = _linestyle.Run /*b4a.example.bctextengine._bctextrun*/ .HorizontalAlignment /*String*/ .toLowerCase();};
 //BA.debugLineNum = 261;BA.debugLine="If alignment = \"left\" Then";
if ((_alignment).equals("left")) { 
 //BA.debugLineNum = 262;BA.debugLine="If linestyle.Run.IndentLevel > 0 Then";
if (_linestyle.Run /*b4a.example.bctextengine._bctextrun*/ .IndentLevel /*int*/ >0) { 
 //BA.debugLineNum = 263;BA.debugLine="line.StartX = IndentWidth * linestyle.Run.Inde";
_line.StartX /*int*/  = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6*_linestyle.Run /*b4a.example.bctextengine._bctextrun*/ .IndentLevel /*int*/ );
 //BA.debugLineNum = 264;BA.debugLine="p.Width = Max(p.Width, Min(MaxWidth, line.Widt";
_p.Width /*int*/  = (int) (__c.Max(_p.Width /*int*/ ,__c.Min(_maxwidth,_line.Width /*int*/ +_line.StartX /*int*/ )));
 };
 }else {
 //BA.debugLineNum = 267;BA.debugLine="p.Width = MaxWidth";
_p.Width /*int*/  = _maxwidth;
 };
 //BA.debugLineNum = 269;BA.debugLine="Select alignment";
switch (BA.switchObjectToInt(_alignment,"center","right","justify")) {
case 0: {
 //BA.debugLineNum = 271;BA.debugLine="line.StartX = p.Width / 2 - line.Width / 2";
_line.StartX /*int*/  = (int) (_p.Width /*int*/ /(double)2-_line.Width /*int*/ /(double)2);
 break; }
case 1: {
 //BA.debugLineNum = 273;BA.debugLine="line.StartX = p.Width - line.Width";
_line.StartX /*int*/  = (int) (_p.Width /*int*/ -_line.Width /*int*/ );
 break; }
case 2: {
 //BA.debugLineNum = 275;BA.debugLine="If line.EndsWithSoftLineBreak Then";
if (_line.EndsWithSoftLineBreak /*boolean*/ ) { 
 //BA.debugLineNum = 276;BA.debugLine="Dim last As BCUnbreakableText = line.Unbreaka";
_last = (b4a.example.bctextengine._bcunbreakabletext)(_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
 //BA.debugLineNum = 277;BA.debugLine="If IsSpace(last.NotFullTextChars) Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(_last.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ )) { 
 //BA.debugLineNum = 278;BA.debugLine="line.Unbreakables.RemoveAt(line.Unbreakables";
_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 //BA.debugLineNum = 279;BA.debugLine="line.Width = line.Width - last.Width";
_line.Width /*int*/  = (int) (_line.Width /*int*/ -_last.Width /*int*/ );
 };
 //BA.debugLineNum = 281;BA.debugLine="Dim NumberOfGaps As Int = line.Unbreakables.S";
_numberofgaps = (int) (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
 //BA.debugLineNum = 282;BA.debugLine="If NumberOfGaps > 0 Then";
if (_numberofgaps>0) { 
 //BA.debugLineNum = 283;BA.debugLine="Dim delta As Float = (p.Width - line.Width)";
_delta = (float) ((_p.Width /*int*/ -_line.Width /*int*/ )/(double)_numberofgaps);
 //BA.debugLineNum = 284;BA.debugLine="Dim accumalated As Float = 0";
_accumalated = (float) (0);
 //BA.debugLineNum = 285;BA.debugLine="For Each un As BCUnbreakableText In line.Unb";
{
final anywheresoftware.b4a.BA.IterableList group54 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen54 = group54.getSize()
;int index54 = 0;
;
for (; index54 < groupLen54;index54++){
_un = (b4a.example.bctextengine._bcunbreakabletext)(group54.Get(index54));
 //BA.debugLineNum = 286;BA.debugLine="un.StartX = un.StartX + accumalated";
_un.StartX /*int*/  = (int) (_un.StartX /*int*/ +_accumalated);
 //BA.debugLineNum = 287;BA.debugLine="accumalated = accumalated + delta";
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
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(b4a.example.bctextengine._bcparagraph _par) throws Exception{
anywheresoftware.b4a.objects.collections.List _ltrlist = null;
b4a.example.bctextengine._bctextline _line = null;
anywheresoftware.b4a.objects.collections.List _newlist = null;
b4a.example.bctextengine._bcunbreakabletext _un = null;
int _x = 0;
b4a.example.bctextengine._bcsinglestylesection _single = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
 //BA.debugLineNum = 295;BA.debugLine="Private Sub OrganizeRTLParagraph (par As BCParagra";
 //BA.debugLineNum = 296;BA.debugLine="Dim LTRList As List";
_ltrlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 297;BA.debugLine="LTRList.Initialize";
_ltrlist.Initialize();
 //BA.debugLineNum = 299;BA.debugLine="For Each line As BCTextLine In par.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group3 = _par.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_line = (b4a.example.bctextengine._bctextline)(group3.Get(index3));
 //BA.debugLineNum = 300;BA.debugLine="Dim NewList As List";
_newlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 301;BA.debugLine="NewList.Initialize";
_newlist.Initialize();
 //BA.debugLineNum = 305;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group6 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_un = (b4a.example.bctextengine._bcunbreakabletext)(group6.Get(index6));
 //BA.debugLineNum = 306;BA.debugLine="If un.RTL Then";
if (_un.RTL /*boolean*/ ) { 
 //BA.debugLineNum = 307;BA.debugLine="AddLTRItems(LTRList, NewList)";
_vvvvvvvvvvvvvvvvvvvvvvvvv3(_ltrlist,_newlist);
 //BA.debugLineNum = 308;BA.debugLine="NewList.Add(un)";
_newlist.Add((Object)(_un));
 }else {
 //BA.debugLineNum = 310;BA.debugLine="LTRList.InsertAt(0, un)";
_ltrlist.InsertAt((int) (0),(Object)(_un));
 };
 }
};
 //BA.debugLineNum = 313;BA.debugLine="AddLTRItems(LTRList, NewList)";
_vvvvvvvvvvvvvvvvvvvvvvvvv3(_ltrlist,_newlist);
 //BA.debugLineNum = 314;BA.debugLine="line.Unbreakables = NewList";
_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/  = _newlist;
 //BA.debugLineNum = 319;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group16 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_un = (b4a.example.bctextengine._bcunbreakabletext)(group16.Get(index16));
 //BA.debugLineNum = 320;BA.debugLine="un.StartX = line.Width - un.StartX";
_un.StartX /*int*/  = (int) (_line.Width /*int*/ -_un.StartX /*int*/ );
 //BA.debugLineNum = 321;BA.debugLine="Dim x As Int = line.StartX + un.StartX";
_x = (int) (_line.StartX /*int*/ +_un.StartX /*int*/ );
 //BA.debugLineNum = 322;BA.debugLine="For Each single As BCSingleStyleSection In un.S";
{
final anywheresoftware.b4a.BA.IterableList group19 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_single = (b4a.example.bctextengine._bcsinglestylesection)(group19.Get(index19));
 //BA.debugLineNum = 323;BA.debugLine="x = x - single.Width";
_x = (int) (_x-_single.Width /*int*/ );
 //BA.debugLineNum = 324;BA.debugLine="single.AbsoluteStartX = x";
_single.AbsoluteStartX /*int*/  = _x;
 //BA.debugLineNum = 325;BA.debugLine="x = x - mSpaceBetweenCharacters";
_x = (int) (_x-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1);
 //BA.debugLineNum = 326;BA.debugLine="If single.Run.View.IsInitialized Then";
if (_single.Run /*b4a.example.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
 //BA.debugLineNum = 327;BA.debugLine="Dim v As B4XView = single.Run.View";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = _single.Run /*b4a.example.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
 //BA.debugLineNum = 328;BA.debugLine="v.Left = (x + mSpaceBetweenCharacters) / mSca";
_v.setLeft((int) ((_x+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1)/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
 };
 }
};
 }
};
 }
};
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(b4a.example.bctextengine._bcparagraph _p) throws Exception{
b4a.example.bctextengine._bctextline _line = null;
b4a.example.bctextengine._bcunbreakabletext _un = null;
int _x = 0;
b4a.example.bctextengine._bcsinglestylesection _single = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
b4a.example.bctextengine._bcparagraph _par = null;
 //BA.debugLineNum = 368;BA.debugLine="Private Sub OrganizeSingleStyles (p As BCParagraph";
 //BA.debugLineNum = 369;BA.debugLine="For Each line As BCTextLine In p.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group1 = _p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (b4a.example.bctextengine._bctextline)(group1.Get(index1));
 //BA.debugLineNum = 370;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group2 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_un = (b4a.example.bctextengine._bcunbreakabletext)(group2.Get(index2));
 //BA.debugLineNum = 371;BA.debugLine="Dim x As Int = line.StartX + un.StartX";
_x = (int) (_line.StartX /*int*/ +_un.StartX /*int*/ );
 //BA.debugLineNum = 372;BA.debugLine="For Each single As BCSingleStyleSection In un.S";
{
final anywheresoftware.b4a.BA.IterableList group4 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_single = (b4a.example.bctextengine._bcsinglestylesection)(group4.Get(index4));
 //BA.debugLineNum = 373;BA.debugLine="single.AbsoluteStartX = x";
_single.AbsoluteStartX /*int*/  = _x;
 //BA.debugLineNum = 374;BA.debugLine="If single.GlyphsAndOffsets.Size = 0 And single";
if (_single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0 && _single.Run /*b4a.example.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
 //BA.debugLineNum = 375;BA.debugLine="Dim v As B4XView = single.Run.View";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = _single.Run /*b4a.example.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
 //BA.debugLineNum = 376;BA.debugLine="Dim par As BCParagraph = single.ParentUN.Pare";
_par = _single.ParentUN /*b4a.example.bctextengine._bcunbreakabletext*/ .ParentLine /*b4a.example.bctextengine._bctextline*/ .ParentParagraph /*b4a.example.bctextengine._bcparagraph*/ ;
 //BA.debugLineNum = 377;BA.debugLine="If par.Views.IsInitialized = False Then par.V";
if (_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
 //BA.debugLineNum = 378;BA.debugLine="v.Left = (x + mSpaceBetweenCharacters) / mSca";
_v.setLeft((int) ((_x+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1)/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
 //BA.debugLineNum = 379;BA.debugLine="v.Top = line.BaselineY / mScale - v.Height +";
_v.setTop((int) (_line.BaselineY /*int*/ /(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0-_v.getHeight()+_single.Run /*b4a.example.bctextengine._bctextrun*/ .VerticalOffset /*int*/ ));
 //BA.debugLineNum = 380;BA.debugLine="par.Views.Add(v)";
_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_v.getObject()));
 };
 //BA.debugLineNum = 382;BA.debugLine="x = x + single.Width + mSpaceBetweenCharacters";
_x = (int) (_x+_single.Width /*int*/ +_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1);
 }
};
 }
};
 }
};
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(b4a.example.bctextengine._bcparagraph _p,anywheresoftware.b4a.objects.collections.List _unbreakables) throws Exception{
b4a.example.bctextengine._bcunbreakabletext _un = null;
int _i = 0;
b4a.example.bctextengine._bcunbreakabletext _nextun = null;
b4a.example.bctextengine._bcsinglestylesection _singlestyle = null;
int _indent = 0;
 //BA.debugLineNum = 500;BA.debugLine="Private Sub OrganizeUnbreakables (p As BCParagraph";
 //BA.debugLineNum = 501;BA.debugLine="If unbreakables.Size = 0 Then Return";
if (_unbreakables.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 502;BA.debugLine="Dim un As BCUnbreakableText = unbreakables.Get(0)";
_un = (b4a.example.bctextengine._bcunbreakabletext)(_unbreakables.Get((int) (0)));
 //BA.debugLineNum = 503;BA.debugLine="Dim i As Int = 1";
_i = (int) (1);
 //BA.debugLineNum = 504;BA.debugLine="Do While i < unbreakables.Size";
while (_i<_unbreakables.getSize()) {
 //BA.debugLineNum = 505;BA.debugLine="Dim NextUn As BCUnbreakableText = unbreakables.G";
_nextun = (b4a.example.bctextengine._bcunbreakabletext)(_unbreakables.Get(_i));
 //BA.debugLineNum = 506;BA.debugLine="If un.IsMergable = True And NextUn.IsMergable =";
if (_un.IsMergable /*boolean*/ ==__c.True && _nextun.IsMergable /*boolean*/ ==__c.True && _un.RTL /*boolean*/ ==_nextun.RTL /*boolean*/ ) { 
 //BA.debugLineNum = 507;BA.debugLine="MergeUnbreakables(un, NextUn)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(_un,_nextun);
 //BA.debugLineNum = 508;BA.debugLine="unbreakables.RemoveAt(i)";
_unbreakables.RemoveAt(_i);
 //BA.debugLineNum = 509;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
 }else {
 //BA.debugLineNum = 511;BA.debugLine="un = NextUn";
_un = _nextun;
 };
 //BA.debugLineNum = 513;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
 //BA.debugLineNum = 515;BA.debugLine="For Each un As BCUnbreakableText In unbreakables";
{
final anywheresoftware.b4a.BA.IterableList group15 = _unbreakables;
final int groupLen15 = group15.getSize()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_un = (b4a.example.bctextengine._bcunbreakabletext)(group15.Get(index15));
 //BA.debugLineNum = 516;BA.debugLine="If TextCharEquals(un.NotFullTextChars, Chr(13))";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(_un.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ ,BA.ObjectToString(__c.Chr((int) (13))))) { 
if (true) continue;};
 //BA.debugLineNum = 517;BA.debugLine="If TextCharEquals(un.NotFullTextChars, Chr(10))";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(_un.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ ,BA.ObjectToString(__c.Chr((int) (10))))) { 
 //BA.debugLineNum = 518;BA.debugLine="CreateLine(p)";
_vvvvvvvvvvvvvvvvvvvvvvvvvv3(_p);
 //BA.debugLineNum = 519;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 521;BA.debugLine="If p.CurrentLine.Unbreakables.Size > 0 And p.Sty";
if (_p.CurrentLine /*b4a.example.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0 && _p.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .WordWrap /*boolean*/ ) { 
 //BA.debugLineNum = 522;BA.debugLine="Dim SingleStyle As BCSingleStyleSection = un.Si";
_singlestyle = (b4a.example.bctextengine._bcsinglestylesection)(_un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
 //BA.debugLineNum = 523;BA.debugLine="Dim indent As Int = IndentWidth * SingleStyle.R";
_indent = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6*_singlestyle.Run /*b4a.example.bctextengine._bctextrun*/ .IndentLevel /*int*/ );
 //BA.debugLineNum = 524;BA.debugLine="If p.CurrentLine.Width + mSpaceBetweenCharacter";
if (_p.CurrentLine /*b4a.example.bctextengine._bctextline*/ .Width /*int*/ +_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1+_un.Width /*int*/ +_indent>(_p.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .MaxWidth /*int*/ -_p.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()-_p.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getRight())*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
 //BA.debugLineNum = 525;BA.debugLine="p.CurrentLine.EndsWithSoftLineBreak = True";
_p.CurrentLine /*b4a.example.bctextengine._bctextline*/ .EndsWithSoftLineBreak /*boolean*/  = __c.True;
 //BA.debugLineNum = 526;BA.debugLine="CreateLine(p)";
_vvvvvvvvvvvvvvvvvvvvvvvvvv3(_p);
 };
 };
 //BA.debugLineNum = 529;BA.debugLine="p.CurrentLine.Unbreakables.Add(un)";
_p.CurrentLine /*b4a.example.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_un));
 //BA.debugLineNum = 530;BA.debugLine="un.ParentLine = p.CurrentLine";
_un.ParentLine /*b4a.example.bctextengine._bctextline*/  = _p.CurrentLine /*b4a.example.bctextengine._bctextline*/ ;
 //BA.debugLineNum = 531;BA.debugLine="If IsSpace(un.NotFullTextChars) And p.CurrentLin";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(_un.NotFullTextChars /*b4a.example.bctextengine._bctextchars*/ ) && _p.CurrentLine /*b4a.example.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==1) { 
 //BA.debugLineNum = 532;BA.debugLine="un.Width = 0";
_un.Width /*int*/  = (int) (0);
 };
 //BA.debugLineNum = 534;BA.debugLine="If p.CurrentLine.Unbreakables.Size > 0 Then p.Cu";
if (_p.CurrentLine /*b4a.example.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
_p.CurrentLine /*b4a.example.bctextengine._bctextline*/ .Width /*int*/  = (int) (_p.CurrentLine /*b4a.example.bctextengine._bctextline*/ .Width /*int*/ +_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1);};
 //BA.debugLineNum = 535;BA.debugLine="un.StartX = p.CurrentLine.Width";
_un.StartX /*int*/  = _p.CurrentLine /*b4a.example.bctextengine._bctextline*/ .Width /*int*/ ;
 //BA.debugLineNum = 536;BA.debugLine="p.CurrentLine.Width = p.CurrentLine.Width + un.W";
_p.CurrentLine /*b4a.example.bctextengine._bctextline*/ .Width /*int*/  = (int) (_p.CurrentLine /*b4a.example.bctextengine._bctextline*/ .Width /*int*/ +_un.Width /*int*/ );
 }
};
 //BA.debugLineNum = 538;BA.debugLine="End Sub";
return "";
}
public b4a.example.bctextengine._bcparagraph  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(anywheresoftware.b4a.objects.collections.List _runs,b4a.example.bctextengine._bcparagraphstyle _style) throws Exception{
b4a.example.bctextengine._bcparagraph _par = null;
anywheresoftware.b4a.objects.collections.List _unbreakeables = null;
b4a.example.bctextengine._bctextrun _run = null;
 //BA.debugLineNum = 163;BA.debugLine="Private Sub Prepare (Runs As List, Style As BCPara";
 //BA.debugLineNum = 164;BA.debugLine="Dim par As BCParagraph";
_par = new b4a.example.bctextengine._bcparagraph();
 //BA.debugLineNum = 165;BA.debugLine="par.Initialize";
_par.Initialize();
 //BA.debugLineNum = 166;BA.debugLine="par.TextLines.Initialize";
_par.TextLines /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 167;BA.debugLine="par.Style = Style";
_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/  = _style;
 //BA.debugLineNum = 168;BA.debugLine="IndentWidth = GetFontMetrics(DefaultFont, Default";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvv7(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6).xWidth /*int*/ *_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
 //BA.debugLineNum = 169;BA.debugLine="Dim unbreakeables As List";
_unbreakeables = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 170;BA.debugLine="unbreakeables.Initialize";
_unbreakeables.Initialize();
 //BA.debugLineNum = 171;BA.debugLine="For Each run As BCTextRun In Runs";
{
final anywheresoftware.b4a.BA.IterableList group8 = _runs;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_run = (b4a.example.bctextengine._bctextrun)(group8.Get(index8));
 //BA.debugLineNum = 172;BA.debugLine="If run.Extra.IsInitialized And run.Extra.Contain";
if (_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && _run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_extra_connectedruns))) { 
 //BA.debugLineNum = 173;BA.debugLine="HandleConnectedTextRuns(run, unbreakeables, Sty";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(_run,_unbreakeables,_style);
 }else {
 //BA.debugLineNum = 175;BA.debugLine="HandleTextRun(run, unbreakeables, Style)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_run,_unbreakeables,_style);
 };
 }
};
 //BA.debugLineNum = 178;BA.debugLine="CreateLine(par)";
_vvvvvvvvvvvvvvvvvvvvvvvvvv3(_par);
 //BA.debugLineNum = 179;BA.debugLine="OrganizeUnbreakables(par, unbreakeables)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(_par,_unbreakeables);
 //BA.debugLineNum = 180;BA.debugLine="OrganizeLines(par)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(_par);
 //BA.debugLineNum = 181;BA.debugLine="OrganizeSingleStyles(par)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_par);
 //BA.debugLineNum = 182;BA.debugLine="If par.Style.RTL Then OrganizeRTLParagraph(par)";
if (_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/ ) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(_par);};
 //BA.debugLineNum = 183;BA.debugLine="Return par";
if (true) return _par;
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public b4a.example.bctextengine._bcparagraph  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(anywheresoftware.b4a.objects.collections.List _runs,b4a.example.bctextengine._bcparagraphstyle _style,anywheresoftware.b4a.objects.B4XViewWrapper _sv) throws Exception{
b4a.example.bctextengine._bcparagraph _par = null;
int _maxheight = 0;
b4a.example.bctextengine._bctextline _line = null;
 //BA.debugLineNum = 186;BA.debugLine="Public Sub PrepareForLazyDrawing (Runs As List, St";
 //BA.debugLineNum = 187;BA.debugLine="Dim par As BCParagraph = Prepare(Runs, Style)";
_par = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(_runs,_style);
 //BA.debugLineNum = 188;BA.debugLine="sv.ScrollViewContentHeight = Max(sv.Height - 2dip";
_sv.setScrollViewContentHeight((int) (__c.Max(_sv.getHeight()-__c.DipToCurrent((int) (2)),_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getBottom()+_par.Height /*int*/ /(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)));
 //BA.debugLineNum = 189;BA.debugLine="Dim MaxHeight As Int";
_maxheight = 0;
 //BA.debugLineNum = 190;BA.debugLine="For Each line As BCTextLine In par.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group4 = _par.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_line = (b4a.example.bctextengine._bctextline)(group4.Get(index4));
 //BA.debugLineNum = 191;BA.debugLine="MaxHeight = Max(MaxHeight, line.MaxHeightAboveBa";
_maxheight = (int) (__c.Max(_maxheight,_line.MaxHeightAboveBaseLine /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ ));
 }
};
 //BA.debugLineNum = 193;BA.debugLine="ResizeLayers(par.Width / mScale, MaxHeight / mSca";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5((int) (_par.Width /*int*/ /(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),(int) (_maxheight/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
 //BA.debugLineNum = 194;BA.debugLine="AddParagraphViews(par)";
_vvvvvvvvvvvvvvvvvvvvvvvvv4(_par);
 //BA.debugLineNum = 195;BA.debugLine="Return par";
if (true) return _par;
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(b4a.example.bctextengine._bctextchars _tc) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
 //BA.debugLineNum = 1060;BA.debugLine="Public Sub PrintTextChars(TC As BCTextChars)";
 //BA.debugLineNum = 1061;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1062;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1063;BA.debugLine="For i = TC.StartIndex To TC.StartIndex + TC.Lengt";
{
final int step3 = 1;
final int limit3 = (int) (_tc.StartIndex /*int*/ +_tc.Length /*int*/ -1);
_i = _tc.StartIndex /*int*/  ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 1064;BA.debugLine="sb.Append(TC.Buffer(i))";
_sb.Append(_tc.Buffer /*String[]*/ [_i]);
 }
};
 //BA.debugLineNum = 1066;BA.debugLine="Log(sb.ToString)";
__c.LogImpl("915597574",_sb.ToString(),0);
 //BA.debugLineNum = 1067;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(b4a.example.bitmapcreator _bc) throws Exception{
 //BA.debugLineNum = 672;BA.debugLine="Public Sub ReleaseAsyncBC(bc As BitmapCreator)";
 //BA.debugLineNum = 673;BA.debugLine="AsyncBCs.Put(bc, False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0._vvvvvvvvvvvv7 /*String*/ ((Object)(_bc),(Object)(__c.False));
 //BA.debugLineNum = 674;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(int _width,int _height) throws Exception{
int _scaledwidth = 0;
int _scaledheight = 0;
 //BA.debugLineNum = 736;BA.debugLine="Private Sub ResizeCharBC(width As Int, height As I";
 //BA.debugLineNum = 737;BA.debugLine="Dim ScaledWidth As Int = (width + 5) / mScale";
_scaledwidth = (int) ((_width+5)/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 738;BA.debugLine="Dim ScaledHeight As Int = (height + 5) / mScale";
_scaledheight = (int) ((_height+5)/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 739;BA.debugLine="CharBC.Initialize(ScaledWidth * mScale, ScaledHei";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._initialize(ba,(int) (_scaledwidth*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),(int) (_scaledheight*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
 //BA.debugLineNum = 740;BA.debugLine="CharBC.MAX_SAME_COLOR_SIZE = 0";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._max_same_color_size = (int) (0);
 //BA.debugLineNum = 741;BA.debugLine="CharBC.AlphaThresholdForCBCExtraction = 0";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._alphathresholdforcbcextraction = (int) (0);
 //BA.debugLineNum = 742;BA.debugLine="cvs.Resize(ScaledWidth, ScaledHeight)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Resize((float) (_scaledwidth),(float) (_scaledheight));
 //BA.debugLineNum = 756;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(b4a.example.bitmapcreator _bc,b4a.example.bctextengine._bcparagraph _par,anywheresoftware.b4a.objects.B4XViewWrapper _iv,boolean _resizeheight) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
int _ivheight = 0;
 //BA.debugLineNum = 222;BA.debugLine="Private Sub ResizeImageView (bc As BitmapCreator,";
 //BA.debugLineNum = 223;BA.debugLine="Dim bmp As B4XBitmap = bc.Bitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _bc._getbitmap();
 //BA.debugLineNum = 224;BA.debugLine="Dim ivHeight As Int = par.Height / mScale";
_ivheight = (int) (_par.Height /*int*/ /(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 225;BA.debugLine="If ResizeHeight = False Then ivHeight = Min(ivHei";
if (_resizeheight==__c.False) { 
_ivheight = (int) (__c.Min(_ivheight,_iv.getParent().getHeight()-_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()-_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getBottom()));};
 //BA.debugLineNum = 226;BA.debugLine="iv.SetLayoutAnimated(0, par.Style.Padding.Left, p";
_iv.SetLayoutAnimated((int) (0),(int) (_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()),(int) (_par.Style /*b4a.example.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()),(int) (_par.Width /*int*/ /(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),_ivheight);
 //BA.debugLineNum = 227;BA.debugLine="bc.SetBitmapToImageView(bmp.Crop(0, 0, iv.Width *";
_bc._setbitmaptoimageview(_bmp.Crop((int) (0),(int) (0),(int) (_iv.getWidth()*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),(int) (_iv.getHeight()*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)),_iv);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(int _width,int _height) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Private Sub ResizeLayers (Width As Int, Height As";
 //BA.debugLineNum = 113;BA.debugLine="Width = Max(Width, 2) * mScale";
_width = (int) (__c.Max(_width,2)*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 114;BA.debugLine="Height = Max(Height, 2) * mScale";
_height = (int) (__c.Max(_height,2)*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 115;BA.debugLine="If ForegroundBC.IsInitialized = False Or Width >";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.IsInitialized()==__c.False || _width>_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._mwidth || _height>_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._mheight) { 
 //BA.debugLineNum = 116;BA.debugLine="If ForegroundBC.IsInitialized Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.IsInitialized()) { 
 //BA.debugLineNum = 117;BA.debugLine="Width = Max(Width, ForegroundBC.mWidth)";
_width = (int) (__c.Max(_width,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._mwidth));
 //BA.debugLineNum = 118;BA.debugLine="Height = Max(Height, ForegroundBC.mHeight)";
_height = (int) (__c.Max(_height,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._mheight));
 };
 //BA.debugLineNum = 123;BA.debugLine="Brushes.Clear";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Clear();
 //BA.debugLineNum = 124;BA.debugLine="ForegroundBC.Initialize(Width, Height)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._initialize(ba,_width,_height);
 }else {
 //BA.debugLineNum = 126;BA.debugLine="ForegroundBC.DrawRect2(ForegroundBC.TargetRect,";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._drawrect2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._targetrect,_vvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_vvvv5.Color_Transparent),__c.True,(int) (0));
 };
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(float _f) throws Exception{
 //BA.debugLineNum = 990;BA.debugLine="Public Sub setSpaceBetweenCharacters(f As Float)";
 //BA.debugLineNum = 991;BA.debugLine="mSpaceBetweenCharacters = f * mScale";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = (float) (_f*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 992;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(float _f) throws Exception{
 //BA.debugLineNum = 998;BA.debugLine="Public Sub setSpaceBetweenLines(f As Float)";
 //BA.debugLineNum = 999;BA.debugLine="mSpaceBetweenLines = f * mScale";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = (int) (_f*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 1000;BA.debugLine="End Sub";
return "";
}
public boolean  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(b4a.example.bctextengine._bctextchars _tc,String _s) throws Exception{
int _i = 0;
 //BA.debugLineNum = 1051;BA.debugLine="Private Sub TextCharEquals (TC As BCTextChars, s A";
 //BA.debugLineNum = 1052;BA.debugLine="If TC.Length <> s.Length Then Return False";
if (_tc.Length /*int*/ !=_s.length()) { 
if (true) return __c.False;};
 //BA.debugLineNum = 1053;BA.debugLine="For i = 0 To TC.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (_tc.Length /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 1054;BA.debugLine="If TC.Buffer(i + TC.StartIndex) <> s.CharAt(i) T";
if ((_tc.Buffer /*String[]*/ [(int) (_i+_tc.StartIndex /*int*/ )]).equals(BA.ObjectToString(_s.charAt(_i))) == false) { 
if (true) return __c.False;};
 }
};
 //BA.debugLineNum = 1056;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 1057;BA.debugLine="End Sub";
return false;
}
public b4a.example.bctextengine._bctextchars  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(b4a.example.bctextengine._bctextchars _tc,int _startindex,int _endindex) throws Exception{
 //BA.debugLineNum = 1047;BA.debugLine="Private Sub TextCharsSubstring(TC As BCTextChars,";
 //BA.debugLineNum = 1048;BA.debugLine="Return CreateBCTextChars(TC.Buffer, StartIndex +";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvv6(_tc.Buffer /*String[]*/ ,(int) (_startindex+_tc.StartIndex /*int*/ ),(int) (_endindex-_startindex));
 //BA.debugLineNum = 1049;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
