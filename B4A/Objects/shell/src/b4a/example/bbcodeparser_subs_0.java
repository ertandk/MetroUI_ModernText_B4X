package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class bbcodeparser_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Type BBCodeTextNode (Text As String, Tags As List";
;
 //BA.debugLineNum = 3;BA.debugLine="Type BBCodeTagNode (Tag As String, Extra As Map,";
;
 //BA.debugLineNum = 4;BA.debugLine="Type BBCodeParseData (Text As String, URLs As Map";
;
 //BA.debugLineNum = 6;BA.debugLine="Private AllowedTags As B4XSet";
bbcodeparser._allowedtags = RemoteObject.createNew ("b4a.example.b4xset");__ref.setField("_allowedtags",bbcodeparser._allowedtags);
 //BA.debugLineNum = 7;BA.debugLine="Private Stack As List";
bbcodeparser._stack = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_stack",bbcodeparser._stack);
 //BA.debugLineNum = 8;BA.debugLine="Private Start As Int";
bbcodeparser._start = RemoteObject.createImmutable(0);__ref.setField("_start",bbcodeparser._start);
 //BA.debugLineNum = 9;BA.debugLine="Private mTextEngine As BCTextEngine";
bbcodeparser._mtextengine = RemoteObject.createNew ("b4a.example.bctextengine");__ref.setField("_mtextengine",bbcodeparser._mtextengine);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
bbcodeparser._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",bbcodeparser._xui);
 //BA.debugLineNum = 11;BA.debugLine="Public UrlColor As Int = 0xFF003FFF";
bbcodeparser._urlcolor = BA.numberCast(int.class, 0xff003fff);__ref.setField("_urlcolor",bbcodeparser._urlcolor);
 //BA.debugLineNum = 12;BA.debugLine="Public ColorsMap As Map";
bbcodeparser._colorsmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_colorsmap",bbcodeparser._colorsmap);
 //BA.debugLineNum = 13;BA.debugLine="Public ErrorString As StringBuilder";
bbcodeparser._errorstring = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");__ref.setField("_errorstring",bbcodeparser._errorstring);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createruns(RemoteObject __ref,RemoteObject _texts,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("CreateRuns (bbcodeparser) ","bbcodeparser",12,__ref.getField(false, "ba"),__ref,181);
if (RapidSub.canDelegate("createruns")) { return __ref.runUserSub(false, "bbcodeparser","createruns", __ref, _texts, _data);}
RemoteObject _runs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _textnode = RemoteObject.declareNull("b4a.example.bbcodeparser._bbcodetextnode");
Debug.locals.put("Texts", _texts);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 181;BA.debugLine="Public Sub CreateRuns (Texts As List, Data As BBCo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 182;BA.debugLine="Dim Runs As List";
Debug.JustUpdateDeviceLine();
_runs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Runs", _runs);
 BA.debugLineNum = 183;BA.debugLine="Runs.Initialize";
Debug.JustUpdateDeviceLine();
_runs.runVoidMethod ("Initialize");
 BA.debugLineNum = 184;BA.debugLine="For Each TextNode As BBCodeTextNode In Texts";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _texts;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_textnode = (group3.runMethod(false,"Get",index3));Debug.locals.put("TextNode", _textnode);
Debug.locals.put("TextNode", _textnode);
 BA.debugLineNum = 185;BA.debugLine="TextToRun(TextNode, Runs, Data)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bbcodeparser.class, "_texttorun" /*RemoteObject*/ ,(Object)(_textnode),(Object)(_runs),(Object)(_data));
 }
}Debug.locals.put("TextNode", _textnode);
;
 BA.debugLineNum = 187;BA.debugLine="Return Runs";
Debug.JustUpdateDeviceLine();
if (true) return _runs;
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtagnode(RemoteObject __ref,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("CreateTagNode (bbcodeparser) ","bbcodeparser",12,__ref.getField(false, "ba"),__ref,173);
if (RapidSub.canDelegate("createtagnode")) { return __ref.runUserSub(false, "bbcodeparser","createtagnode", __ref, _tag);}
RemoteObject _n = RemoteObject.declareNull("b4a.example.bbcodeparser._bbcodetagnode");
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 173;BA.debugLine="Private Sub CreateTagNode (Tag As String) As BBCod";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 174;BA.debugLine="Dim n As BBCodeTagNode";
Debug.JustUpdateDeviceLine();
_n = RemoteObject.createNew ("b4a.example.bbcodeparser._bbcodetagnode");Debug.locals.put("n", _n);
 BA.debugLineNum = 175;BA.debugLine="n.Initialize";
Debug.JustUpdateDeviceLine();
_n.runVoidMethod ("Initialize");
 BA.debugLineNum = 176;BA.debugLine="n.Tag = Tag";
Debug.JustUpdateDeviceLine();
_n.setField ("Tag" /*RemoteObject*/ ,_tag);
 BA.debugLineNum = 177;BA.debugLine="n.CanHaveNestedTags = True";
Debug.JustUpdateDeviceLine();
_n.setField ("CanHaveNestedTags" /*RemoteObject*/ ,bbcodeparser.__c.getField(true,"True"));
 BA.debugLineNum = 178;BA.debugLine="Return n";
Debug.JustUpdateDeviceLine();
if (true) return _n;
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtextnode(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("CreateTextNode (bbcodeparser) ","bbcodeparser",12,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("createtextnode")) { return __ref.runUserSub(false, "bbcodeparser","createtextnode", __ref, _text);}
RemoteObject _n = RemoteObject.declareNull("b4a.example.bbcodeparser._bbcodetextnode");
Debug.locals.put("Text", _text);
 BA.debugLineNum = 163;BA.debugLine="Private Sub CreateTextNode(Text As String) As BBCo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 164;BA.debugLine="Dim n As BBCodeTextNode";
Debug.JustUpdateDeviceLine();
_n = RemoteObject.createNew ("b4a.example.bbcodeparser._bbcodetextnode");Debug.locals.put("n", _n);
 BA.debugLineNum = 165;BA.debugLine="n.Initialize";
Debug.JustUpdateDeviceLine();
_n.runVoidMethod ("Initialize");
 BA.debugLineNum = 166;BA.debugLine="n.Text = Text";
Debug.JustUpdateDeviceLine();
_n.setField ("Text" /*RemoteObject*/ ,_text);
 BA.debugLineNum = 167;BA.debugLine="n.Tags.Initialize";
Debug.JustUpdateDeviceLine();
_n.getField(false,"Tags" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 168;BA.debugLine="n.Tags.AddAll(Stack)";
Debug.JustUpdateDeviceLine();
_n.getField(false,"Tags" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(__ref.getField(false,"_stack" /*RemoteObject*/ )));
 BA.debugLineNum = 169;BA.debugLine="Return n";
Debug.JustUpdateDeviceLine();
if (true) return _n;
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _error(RemoteObject __ref,RemoteObject _msg) throws Exception{
try {
		Debug.PushSubsStack("Error (bbcodeparser) ","bbcodeparser",12,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("error")) { return __ref.runUserSub(false, "bbcodeparser","error", __ref, _msg);}
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("msg", _msg);
 BA.debugLineNum = 153;BA.debugLine="Private Sub Error (msg As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 154;BA.debugLine="Dim s As String = $\"Error (position - ${Start}):";
Debug.JustUpdateDeviceLine();
_s = (RemoteObject.concat(RemoteObject.createImmutable("Error (position - "),bbcodeparser.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_start" /*RemoteObject*/ )))),RemoteObject.createImmutable("): "),bbcodeparser.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_msg))),RemoteObject.createImmutable("")));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 156;BA.debugLine="LogColor(s, Colors.Red)";
Debug.JustUpdateDeviceLine();
bbcodeparser.__c.runVoidMethod ("LogImpl","99175043",_s,bbcodeparser.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 160;BA.debugLine="ErrorString.Append(s).Append(CRLF)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_errorstring" /*RemoteObject*/ ).runMethod(false,"Append",(Object)(_s)).runVoidMethod ("Append",(Object)(bbcodeparser.__c.getField(true,"CRLF")));
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdimensionfromtag(RemoteObject __ref,RemoteObject _tag,RemoteObject _key,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("GetDimensionFromTag (bbcodeparser) ","bbcodeparser",12,__ref.getField(false, "ba"),__ref,370);
if (RapidSub.canDelegate("getdimensionfromtag")) { return __ref.runUserSub(false, "bbcodeparser","getdimensionfromtag", __ref, _tag, _key, _data);}
RemoteObject _s = RemoteObject.createImmutable("");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _v = RemoteObject.createImmutable(0f);
Debug.locals.put("Tag", _tag);
Debug.locals.put("Key", _key);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 370;BA.debugLine="Private Sub GetDimensionFromTag (Tag As BBCodeTagN";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 371;BA.debugLine="Dim s As String = Tag.Extra.GetDefault(Key, \"\")";
Debug.JustUpdateDeviceLine();
_s = BA.ObjectToString(_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((_key)),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 372;BA.debugLine="If s = \"\" Then Return -1";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_s,BA.ObjectToString(""))) { 
if (true) return BA.numberCast(int.class, -(double) (0 + 1));};
 BA.debugLineNum = 373;BA.debugLine="Dim i As Int = s.IndexOf(\"%\")";
Debug.JustUpdateDeviceLine();
_i = _s.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("%")));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 374;BA.debugLine="If i > -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 375;BA.debugLine="Dim v As Float = s.SubString2(0, i) / 100";
Debug.JustUpdateDeviceLine();
_v = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _s.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_i))),RemoteObject.createImmutable(100)}, "/",0, 0));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 376;BA.debugLine="If s.EndsWith(\"%x\") Then";
Debug.JustUpdateDeviceLine();
if (_s.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("%x"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 377;BA.debugLine="Data.NeedToReparseWhenResize = True";
Debug.JustUpdateDeviceLine();
_data.setField ("NeedToReparseWhenResize" /*RemoteObject*/ ,bbcodeparser.__c.getField(true,"True"));
 BA.debugLineNum = 378;BA.debugLine="Return v * Data.Width";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_v,_data.getField(true,"Width" /*RemoteObject*/ )}, "*",0, 0));
 };
 };
 BA.debugLineNum = 381;BA.debugLine="Return DipToCurrent(s)";
Debug.JustUpdateDeviceLine();
if (true) return bbcodeparser.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _s)));
 BA.debugLineNum = 382;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getview(RemoteObject __ref,RemoteObject _tag,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("GetView (bbcodeparser) ","bbcodeparser",12,__ref.getField(false, "ba"),__ref,437);
if (RapidSub.canDelegate("getview")) { return __ref.runUserSub(false, "bbcodeparser","getview", __ref, _tag, _data);}
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Tag", _tag);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 437;BA.debugLine="Private Sub GetView (Tag As BBCodeTagNode, Data As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 438;BA.debugLine="Dim id As String = Tag.Extra.Get(\"view\")";
Debug.JustUpdateDeviceLine();
_id = BA.ObjectToString(_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("view")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 439;BA.debugLine="If Data.Views.ContainsKey(id) = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_data.getField(false,"Views" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_id))),bbcodeparser.__c.getField(true,"False"))) { 
 BA.debugLineNum = 440;BA.debugLine="Error(\"Missing view: \" & id)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bbcodeparser.class, "_error" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Missing view: "),_id)));
 };
 BA.debugLineNum = 442;BA.debugLine="Dim v As B4XView = Data.Views.Get(id)";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _data.getField(false,"Views" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_id))));Debug.locals.put("v", _v);
 BA.debugLineNum = 443;BA.debugLine="Return v";
Debug.JustUpdateDeviceLine();
if (true) return _v;
 BA.debugLineNum = 444;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handlelistelement(RemoteObject __ref,RemoteObject _text,RemoteObject _run) throws Exception{
try {
		Debug.PushSubsStack("HandleListElement (bbcodeparser) ","bbcodeparser",12,__ref.getField(false, "ba"),__ref,343);
if (RapidSub.canDelegate("handlelistelement")) { return __ref.runUserSub(false, "bbcodeparser","handlelistelement", __ref, _text, _run);}
int _i = 0;
RemoteObject _tag = RemoteObject.declareNull("b4a.example.bbcodeparser._bbcodetagnode");
RemoteObject _liststyle = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _parent = RemoteObject.declareNull("b4a.example.bctextengine._bctextrun");
RemoteObject _cr = RemoteObject.declareNull("b4a.example.bctextengine._bcconnectedruns");
Debug.locals.put("Text", _text);
Debug.locals.put("Run", _run);
 BA.debugLineNum = 343;BA.debugLine="Private Sub HandleListElement (Text As BBCodeTextN";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 344;BA.debugLine="For i = Text.Tags.Size - 1 To 0 Step -1";
Debug.JustUpdateDeviceLine();
{
final int step1 = -1;
final int limit1 = 0;
_i = RemoteObject.solve(new RemoteObject[] {_text.getField(false,"Tags" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 345;BA.debugLine="Dim tag As BBCodeTagNode = Text.Tags.Get(i)";
Debug.JustUpdateDeviceLine();
_tag = (_text.getField(false,"Tags" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("tag", _tag);Debug.locals.put("tag", _tag);
 BA.debugLineNum = 346;BA.debugLine="If tag.Tag = \"list\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_tag.getField(true,"Tag" /*RemoteObject*/ ),BA.ObjectToString("list"))) { 
 BA.debugLineNum = 347;BA.debugLine="Dim liststyle As String";
Debug.JustUpdateDeviceLine();
_liststyle = RemoteObject.createImmutable("");Debug.locals.put("liststyle", _liststyle);
 BA.debugLineNum = 348;BA.debugLine="If tag.extra.IsInitialized Then liststyle = tag";
Debug.JustUpdateDeviceLine();
if (_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_liststyle = BA.ObjectToString(_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("style"))),(Object)((RemoteObject.createImmutable("unordered")))));Debug.locals.put("liststyle", _liststyle);};
 BA.debugLineNum = 349;BA.debugLine="If liststyle = \"\" Or liststyle.ToLowerCase = \"u";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_liststyle,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_liststyle.runMethod(true,"toLowerCase"),BA.ObjectToString("unordered"))) { 
 BA.debugLineNum = 350;BA.debugLine="Run.TextChars =  mTextEngine.CreateBCTextChars";
Debug.JustUpdateDeviceLine();
_run.setField ("TextChars" /*RemoteObject*/ ,__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).runClassMethod (b4a.example.bctextengine.class, "_createbctextcharsfromstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(bbcodeparser.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0x2022))),RemoteObject.createImmutable(" ")))));
 }else {
 BA.debugLineNum = 352;BA.debugLine="Dim count As Int = tag.Extra.GetDefault(\"count";
Debug.JustUpdateDeviceLine();
_count = BA.numberCast(int.class, _tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("count"))),(Object)(RemoteObject.createImmutable((1)))));Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 353;BA.debugLine="Dim parent As BCTextRun = mTextEngine.CreateCo";
Debug.JustUpdateDeviceLine();
_parent = __ref.getField(false,"_mtextengine" /*RemoteObject*/ ).runClassMethod (b4a.example.bctextengine.class, "_createconnectedparent" /*RemoteObject*/ );Debug.locals.put("parent", _parent);Debug.locals.put("parent", _parent);
 BA.debugLineNum = 354;BA.debugLine="Run.TextChars = mTextEngine.CreateBCTextCharsF";
Debug.JustUpdateDeviceLine();
_run.setField ("TextChars" /*RemoteObject*/ ,__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).runClassMethod (b4a.example.bctextengine.class, "_createbctextcharsfromstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat((_count),RemoteObject.createImmutable(". ")))));
 BA.debugLineNum = 355;BA.debugLine="Dim cr As BCConnectedRuns = parent.Extra.Get(m";
Debug.JustUpdateDeviceLine();
_cr = (_parent.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).getField(true,"_extra_connectedruns" /*RemoteObject*/ )))));Debug.locals.put("cr", _cr);Debug.locals.put("cr", _cr);
 BA.debugLineNum = 356;BA.debugLine="cr.Runs.Add(Run)";
Debug.JustUpdateDeviceLine();
_cr.getField(false,"Runs" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_run)));
 BA.debugLineNum = 357;BA.debugLine="cr.Alignment = \"right\"";
Debug.JustUpdateDeviceLine();
_cr.setField ("Alignment" /*RemoteObject*/ ,BA.ObjectToString("right"));
 BA.debugLineNum = 358;BA.debugLine="cr.ConnectedWidth = mTextEngine.GetFontMetrics";
Debug.JustUpdateDeviceLine();
_cr.setField ("ConnectedWidth" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).runClassMethod (b4a.example.bctextengine.class, "_getfontmetrics" /*RemoteObject*/ ,(Object)(_run.getField(false,"TextFont" /*RemoteObject*/ )),(Object)(_run.getField(true,"TextColor" /*RemoteObject*/ ))).getField(true,"xWidth" /*RemoteObject*/ ),RemoteObject.createImmutable(3),__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).getField(true,"_mscale" /*RemoteObject*/ )}, "*/",0, 0)));
 BA.debugLineNum = 359;BA.debugLine="parent.IndentLevel = Run.IndentLevel";
Debug.JustUpdateDeviceLine();
_parent.setField ("IndentLevel" /*RemoteObject*/ ,_run.getField(true,"IndentLevel" /*RemoteObject*/ ));
 BA.debugLineNum = 360;BA.debugLine="Run = parent";
Debug.JustUpdateDeviceLine();
_run = _parent;Debug.locals.put("Run", _run);
 BA.debugLineNum = 361;BA.debugLine="count = count + 1";
Debug.JustUpdateDeviceLine();
_count = RemoteObject.solve(new RemoteObject[] {_count,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("count", _count);
 BA.debugLineNum = 362;BA.debugLine="tag.Extra.Put(\"count\", count)";
Debug.JustUpdateDeviceLine();
_tag.getField(false,"Extra" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("count"))),(Object)((_count)));
 };
 BA.debugLineNum = 364;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 367;BA.debugLine="Return Run";
Debug.JustUpdateDeviceLine();
if (true) return _run;
 BA.debugLineNum = 368;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _textengine) throws Exception{
try {
		Debug.PushSubsStack("Initialize (bbcodeparser) ","bbcodeparser",12,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "bbcodeparser","initialize", __ref, _ba, _textengine);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("TextEngine", _textengine);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize (TextEngine As BCTextEngine)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 18;BA.debugLine="AllowedTags = B4XCollections.CreateSet2(Array(\"b\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_allowedtags" /*RemoteObject*/ ,bbcodeparser._b4xcollections.runMethod(false,"_createset2" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(bbcodeparser.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {19},new Object[] {RemoteObject.createImmutable(("b")),RemoteObject.createImmutable(("u")),RemoteObject.createImmutable(("url")),RemoteObject.createImmutable(("plain")),RemoteObject.createImmutable(("color")),RemoteObject.createImmutable(("img")),RemoteObject.createImmutable(("view")),RemoteObject.createImmutable(("vertical")),RemoteObject.createImmutable(("textsize")),RemoteObject.createImmutable(("alignment")),RemoteObject.createImmutable(("span")),RemoteObject.createImmutable(("indent")),RemoteObject.createImmutable(("list")),RemoteObject.createImmutable(("*")),RemoteObject.createImmutable(("fontawesome")),RemoteObject.createImmutable(("materialicons")),RemoteObject.createImmutable(("e")),RemoteObject.createImmutable(("font")),(RemoteObject.createImmutable("direction"))}))))));
 BA.debugLineNum = 20;BA.debugLine="ColorsMap = CreateMap(\"black\": xui.Color_Black, _";
Debug.JustUpdateDeviceLine();
__ref.setField ("_colorsmap" /*RemoteObject*/ ,bbcodeparser.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("black")),(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black")),RemoteObject.createImmutable(("darkgray")),(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_DarkGray")),RemoteObject.createImmutable(("gray")),(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Gray")),RemoteObject.createImmutable(("lightgray")),(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_LightGray")),RemoteObject.createImmutable(("white")),(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White")),RemoteObject.createImmutable(("red")),(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red")),RemoteObject.createImmutable(("green")),(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Green")),RemoteObject.createImmutable(("blue")),(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue")),RemoteObject.createImmutable(("yellow")),(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Yellow")),RemoteObject.createImmutable(("cyan")),(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Cyan")),RemoteObject.createImmutable(("magenta")),(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Magenta")),RemoteObject.createImmutable(("transparent")),(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"))})));
 BA.debugLineNum = 32;BA.debugLine="mTextEngine = TextEngine";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtextengine" /*RemoteObject*/ ,_textengine);
 BA.debugLineNum = 33;BA.debugLine="ErrorString.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_errorstring" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parse(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("Parse (bbcodeparser) ","bbcodeparser",12,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("parse")) { return __ref.runUserSub(false, "bbcodeparser","parse", __ref, _data);}
RemoteObject _parsedelements = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _matcher = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
RemoteObject _lastmatchend = RemoteObject.createImmutable(0);
RemoteObject _skipuntilendtag = RemoteObject.createImmutable(false);
RemoteObject _tag = RemoteObject.createImmutable("");
RemoteObject _closedtag = RemoteObject.createImmutable(false);
RemoteObject _t = RemoteObject.declareNull("b4a.example.bbcodeparser._bbcodetagnode");
RemoteObject _n = RemoteObject.declareNull("b4a.example.bbcodeparser._bbcodetagnode");
Debug.locals.put("Data", _data);
 BA.debugLineNum = 36;BA.debugLine="Public Sub Parse (Data As BBCodeParseData) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 37;BA.debugLine="ErrorString.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_errorstring" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 38;BA.debugLine="Dim ParsedElements As List";
Debug.JustUpdateDeviceLine();
_parsedelements = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ParsedElements", _parsedelements);
 BA.debugLineNum = 39;BA.debugLine="ParsedElements.Initialize";
Debug.JustUpdateDeviceLine();
_parsedelements.runVoidMethod ("Initialize");
 BA.debugLineNum = 40;BA.debugLine="Stack.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_stack" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 41;BA.debugLine="Stack.Add(CreateTagNode(\"noop\"))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_stack" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4a.example.bbcodeparser.class, "_createtagnode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("noop"))))));
 BA.debugLineNum = 42;BA.debugLine="Dim matcher As Matcher = Regex.Matcher(\"(?<!\\[)\\[";
Debug.JustUpdateDeviceLine();
_matcher = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_matcher = bbcodeparser.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("(?<!\\[)\\[[^\\[\\]]+\\]")),(Object)(_data.getField(true,"Text" /*RemoteObject*/ )));Debug.locals.put("matcher", _matcher);Debug.locals.put("matcher", _matcher);
 BA.debugLineNum = 43;BA.debugLine="Dim LastMatchEnd As Int = 0";
Debug.JustUpdateDeviceLine();
_lastmatchend = BA.numberCast(int.class, 0);Debug.locals.put("LastMatchEnd", _lastmatchend);Debug.locals.put("LastMatchEnd", _lastmatchend);
 BA.debugLineNum = 44;BA.debugLine="Dim skipUntilEndTag As Boolean = False";
Debug.JustUpdateDeviceLine();
_skipuntilendtag = bbcodeparser.__c.getField(true,"False");Debug.locals.put("skipUntilEndTag", _skipuntilendtag);Debug.locals.put("skipUntilEndTag", _skipuntilendtag);
 BA.debugLineNum = 45;BA.debugLine="Do While matcher.Find";
Debug.JustUpdateDeviceLine();
while (_matcher.runMethod(true,"Find").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 46;BA.debugLine="Start = matcher.GetStart(0)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_start" /*RemoteObject*/ ,_matcher.runMethod(true,"GetStart",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 47;BA.debugLine="If Start > LastMatchEnd And skipUntilEndTag = Fa";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_start" /*RemoteObject*/ ),BA.numberCast(double.class, _lastmatchend)) && RemoteObject.solveBoolean("=",_skipuntilendtag,bbcodeparser.__c.getField(true,"False"))) { 
 BA.debugLineNum = 48;BA.debugLine="ParsedElements.Add(CreateTextNode(Data.Text.Sub";
Debug.JustUpdateDeviceLine();
_parsedelements.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4a.example.bbcodeparser.class, "_createtextnode" /*RemoteObject*/ ,(Object)(_data.getField(true,"Text" /*RemoteObject*/ ).runMethod(true,"substring",(Object)(_lastmatchend),(Object)(__ref.getField(true,"_start" /*RemoteObject*/ ))))))));
 };
 BA.debugLineNum = 50;BA.debugLine="Dim tag As String = matcher.Match.SubString2(1,";
Debug.JustUpdateDeviceLine();
_tag = _matcher.runMethod(true,"getMatch").runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_matcher.runMethod(true,"getMatch").runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)));Debug.locals.put("tag", _tag);Debug.locals.put("tag", _tag);
 BA.debugLineNum = 51;BA.debugLine="If tag.StartsWith(\"/\") Then";
Debug.JustUpdateDeviceLine();
if (_tag.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("/"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 52;BA.debugLine="tag = tag.SubString(1).ToLowerCase";
Debug.JustUpdateDeviceLine();
_tag = _tag.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"toLowerCase");Debug.locals.put("tag", _tag);
 BA.debugLineNum = 53;BA.debugLine="If StackPeek.Tag <> tag Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.runClassMethod (b4a.example.bbcodeparser.class, "_stackpeek" /*RemoteObject*/ ).getField(true,"Tag" /*RemoteObject*/ ),_tag)) { 
 BA.debugLineNum = 54;BA.debugLine="If StackPeek.CanHaveNestedTags = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4a.example.bbcodeparser.class, "_stackpeek" /*RemoteObject*/ ).getField(true,"CanHaveNestedTags" /*RemoteObject*/ ),bbcodeparser.__c.getField(true,"False"))) { 
 BA.debugLineNum = 55;BA.debugLine="Continue";
Debug.JustUpdateDeviceLine();
if (true) continue;
 };
 BA.debugLineNum = 57;BA.debugLine="Error(\"Closing tag does not match: \" & tag)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bbcodeparser.class, "_error" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Closing tag does not match: "),_tag)));
 BA.debugLineNum = 58;BA.debugLine="Return Null";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), bbcodeparser.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 60;BA.debugLine="If skipUntilEndTag Then";
Debug.JustUpdateDeviceLine();
if (_skipuntilendtag.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 61;BA.debugLine="If Start > LastMatchEnd Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_start" /*RemoteObject*/ ),BA.numberCast(double.class, _lastmatchend))) { 
 BA.debugLineNum = 62;BA.debugLine="ParsedElements.Add(CreateTextNode(Data.Text.S";
Debug.JustUpdateDeviceLine();
_parsedelements.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4a.example.bbcodeparser.class, "_createtextnode" /*RemoteObject*/ ,(Object)(_data.getField(true,"Text" /*RemoteObject*/ ).runMethod(true,"substring",(Object)(_lastmatchend),(Object)(__ref.getField(true,"_start" /*RemoteObject*/ ))))))));
 };
 };
 BA.debugLineNum = 65;BA.debugLine="StackPop";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bbcodeparser.class, "_stackpop" /*RemoteObject*/ );
 BA.debugLineNum = 66;BA.debugLine="skipUntilEndTag = False";
Debug.JustUpdateDeviceLine();
_skipuntilendtag = bbcodeparser.__c.getField(true,"False");Debug.locals.put("skipUntilEndTag", _skipuntilendtag);
 }else {
 BA.debugLineNum = 68;BA.debugLine="If StackPeek.CanHaveNestedTags = False Then Con";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4a.example.bbcodeparser.class, "_stackpeek" /*RemoteObject*/ ).getField(true,"CanHaveNestedTags" /*RemoteObject*/ ),bbcodeparser.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 69;BA.debugLine="Dim ClosedTag As Boolean";
Debug.JustUpdateDeviceLine();
_closedtag = RemoteObject.createImmutable(false);Debug.locals.put("ClosedTag", _closedtag);
 BA.debugLineNum = 70;BA.debugLine="If tag.EndsWith(\"/\") Then";
Debug.JustUpdateDeviceLine();
if (_tag.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("/"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 71;BA.debugLine="ClosedTag = True";
Debug.JustUpdateDeviceLine();
_closedtag = bbcodeparser.__c.getField(true,"True");Debug.locals.put("ClosedTag", _closedtag);
 BA.debugLineNum = 72;BA.debugLine="tag = tag.SubString2(0, tag.Length - 1)";
Debug.JustUpdateDeviceLine();
_tag = _tag.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_tag.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)));Debug.locals.put("tag", _tag);
 }else 
{ BA.debugLineNum = 73;BA.debugLine="Else If tag = \"*\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_tag,BA.ObjectToString("*"))) { 
 BA.debugLineNum = 74;BA.debugLine="ClosedTag = True";
Debug.JustUpdateDeviceLine();
_closedtag = bbcodeparser.__c.getField(true,"True");Debug.locals.put("ClosedTag", _closedtag);
 }}
;
 BA.debugLineNum = 76;BA.debugLine="tag = tag.Trim";
Debug.JustUpdateDeviceLine();
_tag = _tag.runMethod(true,"trim");Debug.locals.put("tag", _tag);
 BA.debugLineNum = 77;BA.debugLine="Dim t As BBCodeTagNode = ParseTag(tag)";
Debug.JustUpdateDeviceLine();
_t = __ref.runClassMethod (b4a.example.bbcodeparser.class, "_parsetag" /*RemoteObject*/ ,(Object)(_tag));Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 78;BA.debugLine="If AllowedTags.Contains(t.Tag) = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_allowedtags" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_contains" /*RemoteObject*/ ,(Object)((_t.getField(true,"Tag" /*RemoteObject*/ )))),bbcodeparser.__c.getField(true,"False"))) { 
 BA.debugLineNum = 79;BA.debugLine="Error(\"Invalid tag: \" & tag)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bbcodeparser.class, "_error" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Invalid tag: "),_tag)));
 BA.debugLineNum = 80;BA.debugLine="Return Null";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), bbcodeparser.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 82;BA.debugLine="StackPush(t)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bbcodeparser.class, "_stackpush" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 83;BA.debugLine="If t.Tag = \"plain\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_t.getField(true,"Tag" /*RemoteObject*/ ),BA.ObjectToString("plain"))) { 
 BA.debugLineNum = 84;BA.debugLine="Dim n As BBCodeTagNode = StackPeek";
Debug.JustUpdateDeviceLine();
_n = __ref.runClassMethod (b4a.example.bbcodeparser.class, "_stackpeek" /*RemoteObject*/ );Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 85;BA.debugLine="n.CanHaveNestedTags = False";
Debug.JustUpdateDeviceLine();
_n.setField ("CanHaveNestedTags" /*RemoteObject*/ ,bbcodeparser.__c.getField(true,"False"));
 BA.debugLineNum = 86;BA.debugLine="skipUntilEndTag = True";
Debug.JustUpdateDeviceLine();
_skipuntilendtag = bbcodeparser.__c.getField(true,"True");Debug.locals.put("skipUntilEndTag", _skipuntilendtag);
 };
 BA.debugLineNum = 88;BA.debugLine="If ClosedTag Then";
Debug.JustUpdateDeviceLine();
if (_closedtag.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 89;BA.debugLine="ParsedElements.Add(CreateTextNode(\"\"))";
Debug.JustUpdateDeviceLine();
_parsedelements.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4a.example.bbcodeparser.class, "_createtextnode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 90;BA.debugLine="StackPop";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bbcodeparser.class, "_stackpop" /*RemoteObject*/ );
 };
 };
 BA.debugLineNum = 93;BA.debugLine="LastMatchEnd = matcher.GetEnd(0)";
Debug.JustUpdateDeviceLine();
_lastmatchend = _matcher.runMethod(true,"GetEnd",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("LastMatchEnd", _lastmatchend);
 }
;
 BA.debugLineNum = 95;BA.debugLine="If Data.Text.Length > LastMatchEnd Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_data.getField(true,"Text" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, _lastmatchend))) { 
 BA.debugLineNum = 96;BA.debugLine="ParsedElements.Add(CreateTextNode(Data.Text.SubS";
Debug.JustUpdateDeviceLine();
_parsedelements.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4a.example.bbcodeparser.class, "_createtextnode" /*RemoteObject*/ ,(Object)(_data.getField(true,"Text" /*RemoteObject*/ ).runMethod(true,"substring",(Object)(_lastmatchend),(Object)(_data.getField(true,"Text" /*RemoteObject*/ ).runMethod(true,"length"))))))));
 };
 BA.debugLineNum = 98;BA.debugLine="Return ParsedElements";
Debug.JustUpdateDeviceLine();
if (true) return _parsedelements;
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parsecodepoint(RemoteObject __ref,RemoteObject _raw) throws Exception{
try {
		Debug.PushSubsStack("ParseCodepoint (bbcodeparser) ","bbcodeparser",12,__ref.getField(false, "ba"),__ref,324);
if (RapidSub.canDelegate("parsecodepoint")) { return __ref.runUserSub(false, "bbcodeparser","parsecodepoint", __ref, _raw);}
Debug.locals.put("raw", _raw);
 BA.debugLineNum = 324;BA.debugLine="Private Sub ParseCodepoint (raw As String) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 325;BA.debugLine="If raw.StartsWith(\"0x\") Then raw = raw.SubString(";
Debug.JustUpdateDeviceLine();
if (_raw.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0x"))).<Boolean>get().booleanValue()) { 
_raw = _raw.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("raw", _raw);};
 BA.debugLineNum = 326;BA.debugLine="Return Bit.ParseInt(raw, 16)";
Debug.JustUpdateDeviceLine();
if (true) return bbcodeparser.__c.getField(false,"Bit").runMethod(true,"ParseInt",(Object)(_raw),(Object)(BA.numberCast(int.class, 16)));
 BA.debugLineNum = 327;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parsecolorstring(RemoteObject __ref,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("ParseColorString (bbcodeparser) ","bbcodeparser",12,__ref.getField(false, "ba"),__ref,329);
if (RapidSub.canDelegate("parsecolorstring")) { return __ref.runUserSub(false, "bbcodeparser","parsecolorstring", __ref, _clr);}
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 329;BA.debugLine="Private Sub ParseColorString(clr As String) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 330;BA.debugLine="clr = clr.ToLowerCase";
Debug.JustUpdateDeviceLine();
_clr = _clr.runMethod(true,"toLowerCase");Debug.locals.put("clr", _clr);
 BA.debugLineNum = 331;BA.debugLine="If clr.StartsWith(\"#\") Then";
Debug.JustUpdateDeviceLine();
if (_clr.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("#"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 332;BA.debugLine="Return Bit.Or(0xff000000, Bit.ParseInt(clr.SubSt";
Debug.JustUpdateDeviceLine();
if (true) return bbcodeparser.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(BA.numberCast(int.class, 0xff000000)),(Object)(bbcodeparser.__c.getField(false,"Bit").runMethod(true,"ParseInt",(Object)(_clr.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)))),(Object)(BA.numberCast(int.class, 16)))));
 }else 
{ BA.debugLineNum = 333;BA.debugLine="Else If clr.StartsWith(\"0x\") Then";
Debug.JustUpdateDeviceLine();
if (_clr.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0x"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 334;BA.debugLine="Return Bit.Or(0xff000000, Bit.ParseInt(clr.SubSt";
Debug.JustUpdateDeviceLine();
if (true) return bbcodeparser.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(BA.numberCast(int.class, 0xff000000)),(Object)(bbcodeparser.__c.getField(false,"Bit").runMethod(true,"ParseInt",(Object)(_clr.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 4)))),(Object)(BA.numberCast(int.class, 16)))));
 }else 
{ BA.debugLineNum = 335;BA.debugLine="Else If ColorsMap.ContainsKey(clr) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_colorsmap" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_clr))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 336;BA.debugLine="Return ColorsMap.Get(clr)";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, __ref.getField(false,"_colorsmap" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_clr))));
 }else {
 BA.debugLineNum = 338;BA.debugLine="Error(\"Invalid color value: \" & clr)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bbcodeparser.class, "_error" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Invalid color value: "),_clr)));
 BA.debugLineNum = 339;BA.debugLine="Return xui.Color_Black";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black");
 }}}
;
 BA.debugLineNum = 341;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parsetag(RemoteObject __ref,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("ParseTag (bbcodeparser) ","bbcodeparser",12,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("parsetag")) { return __ref.runUserSub(false, "bbcodeparser","parsetag", __ref, _tag);}
RemoteObject _res = RemoteObject.declareNull("b4a.example.bbcodeparser._bbcodetagnode");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _last = RemoteObject.createImmutable(0);
RemoteObject _c = RemoteObject.createImmutable("");
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _i2 = RemoteObject.createImmutable(0);
Debug.locals.put("tag", _tag);
 BA.debugLineNum = 101;BA.debugLine="Private Sub ParseTag (tag As String) As BBCodeTagN";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 105;BA.debugLine="If tag.Contains(\"=\") = False Then Return CreateTa";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_tag.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("="))),bbcodeparser.__c.getField(true,"False"))) { 
if (true) return __ref.runClassMethod (b4a.example.bbcodeparser.class, "_createtagnode" /*RemoteObject*/ ,(Object)(_tag.runMethod(true,"toLowerCase")));};
 BA.debugLineNum = 106;BA.debugLine="Dim res As BBCodeTagNode = CreateTagNode(\"\")";
Debug.JustUpdateDeviceLine();
_res = __ref.runClassMethod (b4a.example.bbcodeparser.class, "_createtagnode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 107;BA.debugLine="res.Extra.Initialize";
Debug.JustUpdateDeviceLine();
_res.getField(false,"Extra" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 108;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 109;BA.debugLine="Dim last As Int = -1";
Debug.JustUpdateDeviceLine();
_last = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("last", _last);Debug.locals.put("last", _last);
 BA.debugLineNum = 110;BA.debugLine="Do While i < tag.Length";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean("<",_i,BA.numberCast(double.class, _tag.runMethod(true,"length")))) {
 BA.debugLineNum = 111;BA.debugLine="Dim c As String = tag.CharAt(i)";
Debug.JustUpdateDeviceLine();
_c = BA.ObjectToString(_tag.runMethod(true,"charAt",(Object)(_i)));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 112;BA.debugLine="If c = \"=\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_c,BA.ObjectToString("="))) { 
 BA.debugLineNum = 113;BA.debugLine="Dim key As String = tag.SubString2(last + 1, i)";
Debug.JustUpdateDeviceLine();
_key = _tag.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_last,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_i)).runMethod(true,"toLowerCase");Debug.locals.put("key", _key);Debug.locals.put("key", _key);
 BA.debugLineNum = 114;BA.debugLine="If res.tag = \"\" Then 'option #2";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_res.getField(true,"Tag" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 115;BA.debugLine="res.Tag = key";
Debug.JustUpdateDeviceLine();
_res.setField ("Tag" /*RemoteObject*/ ,_key);
 };
 BA.debugLineNum = 117;BA.debugLine="Dim i2 As Int";
Debug.JustUpdateDeviceLine();
_i2 = RemoteObject.createImmutable(0);Debug.locals.put("i2", _i2);
 BA.debugLineNum = 118;BA.debugLine="If tag.CharAt(i + 1) = QUOTE Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_tag.runMethod(true,"charAt",(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1))),BA.ObjectToChar(bbcodeparser.__c.getField(true,"QUOTE")))) { 
 BA.debugLineNum = 119;BA.debugLine="i2 = tag.IndexOf2(QUOTE, i + 2)";
Debug.JustUpdateDeviceLine();
_i2 = _tag.runMethod(true,"indexOf",(Object)(bbcodeparser.__c.getField(true,"QUOTE")),(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(2)}, "+",1, 1)));Debug.locals.put("i2", _i2);
 BA.debugLineNum = 120;BA.debugLine="res.Extra.Put(key, tag.SubString2(i + 2, i2))";
Debug.JustUpdateDeviceLine();
_res.getField(false,"Extra" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)((_tag.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(2)}, "+",1, 1)),(Object)(_i2)))));
 }else {
 BA.debugLineNum = 122;BA.debugLine="i2 = tag.IndexOf2(\" \", i + 2)";
Debug.JustUpdateDeviceLine();
_i2 = _tag.runMethod(true,"indexOf",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(2)}, "+",1, 1)));Debug.locals.put("i2", _i2);
 BA.debugLineNum = 123;BA.debugLine="If i2 = -1 Then i2 = tag.Length";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_i2,BA.numberCast(double.class, -(double) (0 + 1)))) { 
_i2 = _tag.runMethod(true,"length");Debug.locals.put("i2", _i2);};
 BA.debugLineNum = 124;BA.debugLine="res.Extra.Put(key, tag.SubString2(i + 1, i2))";
Debug.JustUpdateDeviceLine();
_res.getField(false,"Extra" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)((_tag.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_i2)))));
 };
 BA.debugLineNum = 126;BA.debugLine="i = i2";
Debug.JustUpdateDeviceLine();
_i = _i2;Debug.locals.put("i", _i);
 BA.debugLineNum = 127;BA.debugLine="last = i";
Debug.JustUpdateDeviceLine();
_last = _i;Debug.locals.put("last", _last);
 };
 BA.debugLineNum = 129;BA.debugLine="If c = \" \" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_c,BA.ObjectToString(" "))) { 
 BA.debugLineNum = 130;BA.debugLine="If res.Extra.Size = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_res.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 131;BA.debugLine="Dim key As String = tag.SubString2(0, i).ToLow";
Debug.JustUpdateDeviceLine();
_key = _tag.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_i)).runMethod(true,"toLowerCase");Debug.locals.put("key", _key);Debug.locals.put("key", _key);
 BA.debugLineNum = 132;BA.debugLine="res.Tag = key";
Debug.JustUpdateDeviceLine();
_res.setField ("Tag" /*RemoteObject*/ ,_key);
 };
 BA.debugLineNum = 134;BA.debugLine="last = i";
Debug.JustUpdateDeviceLine();
_last = _i;Debug.locals.put("last", _last);
 };
 BA.debugLineNum = 136;BA.debugLine="i = i + 1";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
;
 BA.debugLineNum = 138;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _setimageview(RemoteObject __ref,RemoteObject _tag,RemoteObject _run,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("SetImageView (bbcodeparser) ","bbcodeparser",12,__ref.getField(false, "ba"),__ref,391);
if (RapidSub.canDelegate("setimageview")) { __ref.runUserSub(false, "bbcodeparser","setimageview", __ref, _tag, _run, _data); return;}
ResumableSub_SetImageView rsub = new ResumableSub_SetImageView(null,__ref,_tag,_run,_data);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SetImageView extends BA.ResumableSub {
public ResumableSub_SetImageView(b4a.example.bbcodeparser parent,RemoteObject __ref,RemoteObject _tag,RemoteObject _run,RemoteObject _data) {
this.parent = parent;
this.__ref = __ref;
this._tag = _tag;
this._run = _run;
this._data = _data;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.bbcodeparser parent;
RemoteObject _tag;
RemoteObject _run;
RemoteObject _data;
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _dir = RemoteObject.createImmutable("");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _width = RemoteObject.createImmutable(0);
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _xiv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _j = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SetImageView (bbcodeparser) ","bbcodeparser",12,__ref.getField(false, "ba"),__ref,391);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Tag", _tag);
Debug.locals.put("run", _run);
Debug.locals.put("data", _data);
 BA.debugLineNum = 392;BA.debugLine="Dim url As String = Tag.Extra.GetDefault(\"url\", \"";
Debug.JustUpdateDeviceLine();
_url = BA.ObjectToString(_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("url"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 393;BA.debugLine="Dim dir As String = Tag.Extra.GetDefault(\"dir\", F";
Debug.JustUpdateDeviceLine();
_dir = BA.ObjectToString(_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("dir"))),(Object)((parent.__c.getField(false,"File").runMethod(true,"getDirAssets")))));Debug.locals.put("dir", _dir);Debug.locals.put("dir", _dir);
 BA.debugLineNum = 394;BA.debugLine="Dim filename As String = Tag.Extra.GetDefault(\"fi";
Debug.JustUpdateDeviceLine();
_filename = BA.ObjectToString(_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("filename"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 395;BA.debugLine="Dim width As Int = GetDimensionFromTag(Tag, \"widt";
Debug.JustUpdateDeviceLine();
_width = __ref.runClassMethod (b4a.example.bbcodeparser.class, "_getdimensionfromtag" /*RemoteObject*/ ,(Object)(_tag),(Object)(BA.ObjectToString("width")),(Object)(_data));Debug.locals.put("width", _width);Debug.locals.put("width", _width);
 BA.debugLineNum = 396;BA.debugLine="Dim height As Int = GetDimensionFromTag(Tag, \"hei";
Debug.JustUpdateDeviceLine();
_height = __ref.runClassMethod (b4a.example.bbcodeparser.class, "_getdimensionfromtag" /*RemoteObject*/ ,(Object)(_tag),(Object)(BA.ObjectToString("height")),(Object)(_data));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 397;BA.debugLine="Dim iv As ImageView";
Debug.JustUpdateDeviceLine();
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 398;BA.debugLine="iv.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_iv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 402;BA.debugLine="Dim xiv As B4XView = iv";
Debug.JustUpdateDeviceLine();
_xiv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xiv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _iv.getObject());Debug.locals.put("xiv", _xiv);
 BA.debugLineNum = 403;BA.debugLine="run.View = xiv";
Debug.JustUpdateDeviceLine();
_run.setField ("View" /*RemoteObject*/ ,_xiv);
 BA.debugLineNum = 404;BA.debugLine="Dim bmp As B4XBitmap";
Debug.JustUpdateDeviceLine();
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 405;BA.debugLine="If url <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 26;
if (RemoteObject.solveBoolean("!",_url,BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 406;BA.debugLine="xiv.SetLayoutAnimated(0, 0, 0, width, height)";
Debug.JustUpdateDeviceLine();
_xiv.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 407;BA.debugLine="If data.ImageCache.ContainsKey(url) Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 13;
if (_data.getField(false,"ImageCache" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_url))).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 13;
 BA.debugLineNum = 408;BA.debugLine="xiv.SetBitmap(data.ImageCache.Get(url))";
Debug.JustUpdateDeviceLine();
_xiv.runVoidMethod ("SetBitmap",(Object)((_data.getField(false,"ImageCache" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_url))))));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 410;BA.debugLine="Dim j As HttpJob";
Debug.JustUpdateDeviceLine();
_j = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 411;BA.debugLine="j.Initialize(\"\", Me)";
Debug.JustUpdateDeviceLine();
_j.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 412;BA.debugLine="j.Download(url)";
Debug.JustUpdateDeviceLine();
_j.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 413;BA.debugLine="Wait For (j) JobDone (j As HttpJob)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "bbcodeparser", "setimageview"), (_j));
this.state = 27;
return;
case 27:
//C
this.state = 9;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 414;BA.debugLine="If j.Success Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 9:
//if
this.state = 12;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 415;BA.debugLine="bmp = j.GetBitmap";
Debug.JustUpdateDeviceLine();
_bmp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _j.runClassMethod (b4a.example.httpjob.class, "_getbitmap" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 416;BA.debugLine="bmp = bmp.Resize(width, height, True)";
Debug.JustUpdateDeviceLine();
_bmp = _bmp.runMethod(false,"Resize",(Object)(_width),(Object)(_height),(Object)(parent.__c.getField(true,"True")));Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 417;BA.debugLine="data.ImageCache.Put(url, bmp)";
Debug.JustUpdateDeviceLine();
_data.getField(false,"ImageCache" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_url)),(Object)((_bmp.getObject())));
 BA.debugLineNum = 418;BA.debugLine="xiv.SetBitmap(bmp)";
Debug.JustUpdateDeviceLine();
_xiv.runVoidMethod ("SetBitmap",(Object)((_bmp.getObject())));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 420;BA.debugLine="j.Release";
Debug.JustUpdateDeviceLine();
_j.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 13:
//C
this.state = 26;
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 423;BA.debugLine="If width = -1 And height = -1 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 16:
//if
this.state = 25;
if (RemoteObject.solveBoolean("=",_width,BA.numberCast(double.class, -(double) (0 + 1))) && RemoteObject.solveBoolean("=",_height,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 18;
}else 
{ BA.debugLineNum = 425;BA.debugLine="Else if width > -1 And height > -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_width,BA.numberCast(double.class, -(double) (0 + 1))) && RemoteObject.solveBoolean(">",_height,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 20;
}else 
{ BA.debugLineNum = 427;BA.debugLine="Else if width > -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_width,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 22;
}else {
this.state = 24;
}}}
if (true) break;

case 18:
//C
this.state = 25;
 BA.debugLineNum = 424;BA.debugLine="bmp = xui.LoadBitmap(dir, filename)";
Debug.JustUpdateDeviceLine();
_bmp = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmap",(Object)(_dir),(Object)(_filename));Debug.locals.put("bmp", _bmp);
 if (true) break;

case 20:
//C
this.state = 25;
 BA.debugLineNum = 426;BA.debugLine="bmp = xui.LoadBitmapResize(dir, filename, width";
Debug.JustUpdateDeviceLine();
_bmp = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(_dir),(Object)(_filename),(Object)(_width),(Object)(_height),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("bmp", _bmp);
 if (true) break;

case 22:
//C
this.state = 25;
 BA.debugLineNum = 428;BA.debugLine="bmp = xui.LoadBitmapResize(dir, filename, width";
Debug.JustUpdateDeviceLine();
_bmp = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(_dir),(Object)(_filename),(Object)(_width),(Object)(BA.numberCast(int.class, 10000)),(Object)(parent.__c.getField(true,"True")));Debug.locals.put("bmp", _bmp);
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 430;BA.debugLine="bmp = xui.LoadBitmapResize(dir, filename, 10000";
Debug.JustUpdateDeviceLine();
_bmp = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(_dir),(Object)(_filename),(Object)(BA.numberCast(int.class, 10000)),(Object)(_height),(Object)(parent.__c.getField(true,"True")));Debug.locals.put("bmp", _bmp);
 if (true) break;

case 25:
//C
this.state = 26;
;
 BA.debugLineNum = 432;BA.debugLine="xiv.SetBitmap(bmp)";
Debug.JustUpdateDeviceLine();
_xiv.runVoidMethod ("SetBitmap",(Object)((_bmp.getObject())));
 BA.debugLineNum = 433;BA.debugLine="xiv.SetLayoutAnimated(0, 0, 0, bmp.Width, bmp.He";
Debug.JustUpdateDeviceLine();
_xiv.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _bmp.runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, _bmp.runMethod(true,"getHeight"))));
 if (true) break;

case 26:
//C
this.state = -1;
;
 BA.debugLineNum = 435;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static RemoteObject  _stackpeek(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StackPeek (bbcodeparser) ","bbcodeparser",12,__ref.getField(false, "ba"),__ref,149);
if (RapidSub.canDelegate("stackpeek")) { return __ref.runUserSub(false, "bbcodeparser","stackpeek", __ref);}
 BA.debugLineNum = 149;BA.debugLine="Private Sub StackPeek As BBCodeTagNode";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 150;BA.debugLine="Return Stack.Get(Stack.Size - 1)";
Debug.JustUpdateDeviceLine();
if (true) return (__ref.getField(false,"_stack" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_stack" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stackpop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StackPop (bbcodeparser) ","bbcodeparser",12,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("stackpop")) { return __ref.runUserSub(false, "bbcodeparser","stackpop", __ref);}
 BA.debugLineNum = 141;BA.debugLine="Private Sub StackPop";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 142;BA.debugLine="Stack.RemoveAt(Stack.Size - 1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_stack" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_stack" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stackpush(RemoteObject __ref,RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("StackPush (bbcodeparser) ","bbcodeparser",12,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("stackpush")) { return __ref.runUserSub(false, "bbcodeparser","stackpush", __ref, _tag);}
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 145;BA.debugLine="Private Sub StackPush (Tag As BBCodeTagNode)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 146;BA.debugLine="Stack.Add(Tag)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_stack" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_tag)));
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _texttorun(RemoteObject __ref,RemoteObject _text,RemoteObject _runslist,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("TextToRun (bbcodeparser) ","bbcodeparser",12,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("texttorun")) { return __ref.runUserSub(false, "bbcodeparser","texttorun", __ref, _text, _runslist, _data);}
RemoteObject _list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _run = RemoteObject.declareNull("b4a.example.bctextengine._bctextrun");
RemoteObject _customfont = RemoteObject.createImmutable(false);
RemoteObject _fontsize = RemoteObject.createImmutable(0);
RemoteObject _currentfont = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _islistelement = RemoteObject.createImmutable(false);
int _i = 0;
RemoteObject _tag = RemoteObject.declareNull("b4a.example.bbcodeparser._bbcodetagnode");
RemoteObject _uu = RemoteObject.declareNull("b4a.example.bctextengine._bcstyledunderline");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _clr = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _newfont = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _parent = RemoteObject.declareNull("b4a.example.bctextengine._bctextrun");
RemoteObject _cr = RemoteObject.declareNull("b4a.example.bctextengine._bcconnectedruns");
RemoteObject _dir = RemoteObject.createImmutable("");
Debug.locals.put("Text", _text);
Debug.locals.put("RunsList", _runslist);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 190;BA.debugLine="Private Sub TextToRun (Text As BBCodeTextNode, Run";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 191;BA.debugLine="Dim list As List = RunsList";
Debug.JustUpdateDeviceLine();
_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_list = _runslist;Debug.locals.put("list", _list);Debug.locals.put("list", _list);
 BA.debugLineNum = 192;BA.debugLine="Dim Run As BCTextRun = mTextEngine.CreateRun(Text";
Debug.JustUpdateDeviceLine();
_run = __ref.getField(false,"_mtextengine" /*RemoteObject*/ ).runClassMethod (b4a.example.bctextengine.class, "_createrun" /*RemoteObject*/ ,(Object)(_text.getField(true,"Text" /*RemoteObject*/ )));Debug.locals.put("Run", _run);Debug.locals.put("Run", _run);
 BA.debugLineNum = 193;BA.debugLine="Run.TextColor = Data.DefaultColor";
Debug.JustUpdateDeviceLine();
_run.setField ("TextColor" /*RemoteObject*/ ,_data.getField(true,"DefaultColor" /*RemoteObject*/ ));
 BA.debugLineNum = 194;BA.debugLine="Run.TextFont = Data.DefaultFont";
Debug.JustUpdateDeviceLine();
_run.setField ("TextFont" /*RemoteObject*/ ,_data.getField(false,"DefaultFont" /*RemoteObject*/ ));
 BA.debugLineNum = 195;BA.debugLine="Dim customfont As Boolean";
Debug.JustUpdateDeviceLine();
_customfont = RemoteObject.createImmutable(false);Debug.locals.put("customfont", _customfont);
 BA.debugLineNum = 196;BA.debugLine="Dim FontSize As Int = Data.DefaultFont.Size";
Debug.JustUpdateDeviceLine();
_fontsize = BA.numberCast(int.class, _data.getField(false,"DefaultFont" /*RemoteObject*/ ).runMethod(true,"getSize"));Debug.locals.put("FontSize", _fontsize);Debug.locals.put("FontSize", _fontsize);
 BA.debugLineNum = 197;BA.debugLine="Dim CurrentFont As B4XFont = Data.DefaultFont";
Debug.JustUpdateDeviceLine();
_currentfont = _data.getField(false,"DefaultFont" /*RemoteObject*/ );Debug.locals.put("CurrentFont", _currentfont);Debug.locals.put("CurrentFont", _currentfont);
 BA.debugLineNum = 198;BA.debugLine="Dim IsListElement As Boolean";
Debug.JustUpdateDeviceLine();
_islistelement = RemoteObject.createImmutable(false);Debug.locals.put("IsListElement", _islistelement);
 BA.debugLineNum = 199;BA.debugLine="For i = 0 To Text.Tags.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_text.getField(false,"Tags" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 200;BA.debugLine="Dim tag As BBCodeTagNode = Text.Tags.Get(i)";
Debug.JustUpdateDeviceLine();
_tag = (_text.getField(false,"Tags" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("tag", _tag);Debug.locals.put("tag", _tag);
 BA.debugLineNum = 201;BA.debugLine="Select tag.Tag";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_tag.getField(true,"Tag" /*RemoteObject*/ ),BA.ObjectToString("u"),BA.ObjectToString("b"),BA.ObjectToString("url"),BA.ObjectToString("color"),BA.ObjectToString("img"),BA.ObjectToString("view"),BA.ObjectToString("vertical"),BA.ObjectToString("textsize"),BA.ObjectToString("font"),BA.ObjectToString("alignment"),BA.ObjectToString("span"),BA.ObjectToString("indent"),BA.ObjectToString("list"),BA.ObjectToString("*"),BA.ObjectToString("e"),BA.ObjectToString("direction"),BA.ObjectToString("fontawesome"),BA.ObjectToString("materialicons"))) {
case 0: {
 BA.debugLineNum = 203;BA.debugLine="Run.Underline = True";
Debug.JustUpdateDeviceLine();
_run.setField ("Underline" /*RemoteObject*/ ,bbcodeparser.__c.getField(true,"True"));
 BA.debugLineNum = 204;BA.debugLine="If tag.Extra.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 205;BA.debugLine="Dim uu As BCStyledUnderline";
Debug.JustUpdateDeviceLine();
_uu = RemoteObject.createNew ("b4a.example.bctextengine._bcstyledunderline");Debug.locals.put("uu", _uu);
 BA.debugLineNum = 206;BA.debugLine="uu.Initialize";
Debug.JustUpdateDeviceLine();
_uu.runVoidMethod ("Initialize");
 BA.debugLineNum = 207;BA.debugLine="uu.Style = tag.Extra.GetDefault(\"style\", mTex";
Debug.JustUpdateDeviceLine();
_uu.setField ("Style" /*RemoteObject*/ ,BA.ObjectToString(_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("style"))),(Object)((__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).getField(false,"_defaultunderlinestyle" /*RemoteObject*/ ).getField(true,"Style" /*RemoteObject*/ ))))));
 BA.debugLineNum = 208;BA.debugLine="uu.Style = uu.Style.ToLowerCase";
Debug.JustUpdateDeviceLine();
_uu.setField ("Style" /*RemoteObject*/ ,_uu.getField(true,"Style" /*RemoteObject*/ ).runMethod(true,"toLowerCase"));
 BA.debugLineNum = 209;BA.debugLine="If tag.Extra.ContainsKey(\"color\") Then uu.Clr";
Debug.JustUpdateDeviceLine();
if (_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("color")))).<Boolean>get().booleanValue()) { 
_uu.setField ("Clr" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.bbcodeparser.class, "_parsecolorstring" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("color"))))))));}
else {
_uu.setField ("Clr" /*RemoteObject*/ ,BA.numberCast(int.class, 0));};
 BA.debugLineNum = 210;BA.debugLine="uu.Thickness = DipToCurrent(tag.Extra.GetDefa";
Debug.JustUpdateDeviceLine();
_uu.setField ("Thickness" /*RemoteObject*/ ,BA.numberCast(float.class, bbcodeparser.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("thickness"))),(Object)(RemoteObject.createImmutable((1)))))))));
 BA.debugLineNum = 211;BA.debugLine="If Run.Extra.IsInitialized = False Then Run.E";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_run.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),bbcodeparser.__c.getField(true,"False"))) { 
_run.getField(false,"Extra" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 212;BA.debugLine="Run.Extra.Put(mTextEngine.EXTRA_STYLEDUNDERLI";
Debug.JustUpdateDeviceLine();
_run.getField(false,"Extra" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).getField(true,"_extra_styledunderline" /*RemoteObject*/ ))),(Object)((_uu)));
 };
 break; }
case 1: {
 BA.debugLineNum = 215;BA.debugLine="customfont = True";
Debug.JustUpdateDeviceLine();
_customfont = bbcodeparser.__c.getField(true,"True");Debug.locals.put("customfont", _customfont);
 BA.debugLineNum = 216;BA.debugLine="CurrentFont = Data.DefaultBoldFont";
Debug.JustUpdateDeviceLine();
_currentfont = _data.getField(false,"DefaultBoldFont" /*RemoteObject*/ );Debug.locals.put("CurrentFont", _currentfont);
 break; }
case 2: {
 BA.debugLineNum = 218;BA.debugLine="Dim url As String";
Debug.JustUpdateDeviceLine();
_url = RemoteObject.createImmutable("");Debug.locals.put("url", _url);
 BA.debugLineNum = 219;BA.debugLine="If tag.Extra.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 220;BA.debugLine="url = tag.Extra.Get(\"url\")";
Debug.JustUpdateDeviceLine();
_url = BA.ObjectToString(_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("url")))));Debug.locals.put("url", _url);
 }else {
 BA.debugLineNum = 222;BA.debugLine="url = Text.Text";
Debug.JustUpdateDeviceLine();
_url = _text.getField(true,"Text" /*RemoteObject*/ );Debug.locals.put("url", _url);
 BA.debugLineNum = 223;BA.debugLine="Run.TextDirection = mTextEngine.TextDirection";
Debug.JustUpdateDeviceLine();
_run.setField ("TextDirection" /*RemoteObject*/ ,__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).getField(true,"_textdirectionltr" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 225;BA.debugLine="If Data.URLs.IsInitialized Then Data.URLs.Put(";
Debug.JustUpdateDeviceLine();
if (_data.getField(false,"URLs" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_data.getField(false,"URLs" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_run)),(Object)((_url)));};
 BA.debugLineNum = 226;BA.debugLine="Run.Underline = True";
Debug.JustUpdateDeviceLine();
_run.setField ("Underline" /*RemoteObject*/ ,bbcodeparser.__c.getField(true,"True"));
 BA.debugLineNum = 227;BA.debugLine="Run.TextColor = UrlColor";
Debug.JustUpdateDeviceLine();
_run.setField ("TextColor" /*RemoteObject*/ ,__ref.getField(true,"_urlcolor" /*RemoteObject*/ ));
 break; }
case 3: {
 BA.debugLineNum = 229;BA.debugLine="Dim clr As String = tag.Extra.Get(\"color\")";
Debug.JustUpdateDeviceLine();
_clr = BA.ObjectToString(_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("color")))));Debug.locals.put("clr", _clr);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 230;BA.debugLine="Run.TextColor = ParseColorString(clr)";
Debug.JustUpdateDeviceLine();
_run.setField ("TextColor" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.bbcodeparser.class, "_parsecolorstring" /*RemoteObject*/ ,(Object)(_clr)));
 break; }
case 4: {
 BA.debugLineNum = 232;BA.debugLine="SetImageView(tag, Run, Data)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bbcodeparser.class, "_setimageview" /*void*/ ,(Object)(_tag),(Object)(_run),(Object)(_data));
 BA.debugLineNum = 233;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then";
Debug.JustUpdateDeviceLine();
if (_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("vertical")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 234;BA.debugLine="Run.VerticalOffset = GetDimensionFromTag(tag,";
Debug.JustUpdateDeviceLine();
_run.setField ("VerticalOffset" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.bbcodeparser.class, "_getdimensionfromtag" /*RemoteObject*/ ,(Object)(_tag),(Object)(BA.ObjectToString("vertical")),(Object)(_data)));
 };
 BA.debugLineNum = 236;BA.debugLine="Data.ViewsPanel.AddView(Run.View, 0, 0, Run.Vi";
Debug.JustUpdateDeviceLine();
_data.getField(false,"ViewsPanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_run.getField(false,"View" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_run.getField(false,"View" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_run.getField(false,"View" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 break; }
case 5: {
 BA.debugLineNum = 238;BA.debugLine="Run.View = GetView(tag, Data)";
Debug.JustUpdateDeviceLine();
_run.setField ("View" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.bbcodeparser.class, "_getview" /*RemoteObject*/ ,(Object)(_tag),(Object)(_data)));
 BA.debugLineNum = 239;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then Run.";
Debug.JustUpdateDeviceLine();
if (_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("vertical")))).<Boolean>get().booleanValue()) { 
_run.setField ("VerticalOffset" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.bbcodeparser.class, "_getdimensionfromtag" /*RemoteObject*/ ,(Object)(_tag),(Object)(BA.ObjectToString("vertical")),(Object)(_data)));};
 BA.debugLineNum = 240;BA.debugLine="If tag.Extra.ContainsKey(\"width\") Then Run.Vie";
Debug.JustUpdateDeviceLine();
if (_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("width")))).<Boolean>get().booleanValue()) { 
_run.getField(false,"View" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.runClassMethod (b4a.example.bbcodeparser.class, "_getdimensionfromtag" /*RemoteObject*/ ,(Object)(_tag),(Object)(BA.ObjectToString("width")),(Object)(_data)));};
 BA.debugLineNum = 241;BA.debugLine="If tag.Extra.ContainsKey(\"height\") Then Run.Vi";
Debug.JustUpdateDeviceLine();
if (_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("height")))).<Boolean>get().booleanValue()) { 
_run.getField(false,"View" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.runClassMethod (b4a.example.bbcodeparser.class, "_getdimensionfromtag" /*RemoteObject*/ ,(Object)(_tag),(Object)(BA.ObjectToString("height")),(Object)(_data)));};
 BA.debugLineNum = 242;BA.debugLine="Data.ViewsPanel.AddView(Run.View, 0, 0, Run.Vi";
Debug.JustUpdateDeviceLine();
_data.getField(false,"ViewsPanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_run.getField(false,"View" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_run.getField(false,"View" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_run.getField(false,"View" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 break; }
case 6: {
 BA.debugLineNum = 244;BA.debugLine="Run.VerticalOffset = GetDimensionFromTag(tag,";
Debug.JustUpdateDeviceLine();
_run.setField ("VerticalOffset" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.bbcodeparser.class, "_getdimensionfromtag" /*RemoteObject*/ ,(Object)(_tag),(Object)(BA.ObjectToString("vertical")),(Object)(_data)));
 break; }
case 7: {
 BA.debugLineNum = 246;BA.debugLine="FontSize = tag.Extra.Get(\"textsize\")";
Debug.JustUpdateDeviceLine();
_fontsize = BA.numberCast(int.class, _tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("textsize")))));Debug.locals.put("FontSize", _fontsize);
 break; }
case 8: {
 BA.debugLineNum = 248;BA.debugLine="customfont = True";
Debug.JustUpdateDeviceLine();
_customfont = bbcodeparser.__c.getField(true,"True");Debug.locals.put("customfont", _customfont);
 BA.debugLineNum = 249;BA.debugLine="Dim name As String = tag.Extra.Get(tag.Tag)";
Debug.JustUpdateDeviceLine();
_name = BA.ObjectToString(_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_tag.getField(true,"Tag" /*RemoteObject*/ )))));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 250;BA.debugLine="If mTextEngine.CustomFonts.ContainsKey(name) =";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).getField(false,"_customfonts" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_name))),bbcodeparser.__c.getField(true,"False"))) { 
 BA.debugLineNum = 251;BA.debugLine="Log(\"Font missing from TextEngine.CustomFonts";
Debug.JustUpdateDeviceLine();
bbcodeparser.__c.runVoidMethod ("LogImpl","99437245",RemoteObject.concat(RemoteObject.createImmutable("Font missing from TextEngine.CustomFonts: "),_name),0);
 }else {
 BA.debugLineNum = 253;BA.debugLine="Dim NewFont As B4XFont =  mTextEngine.CustomF";
Debug.JustUpdateDeviceLine();
_newfont = (__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).getField(false,"_customfonts" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_name))));Debug.locals.put("NewFont", _newfont);Debug.locals.put("NewFont", _newfont);
 BA.debugLineNum = 254;BA.debugLine="CurrentFont = NewFont";
Debug.JustUpdateDeviceLine();
_currentfont = _newfont;Debug.locals.put("CurrentFont", _currentfont);
 BA.debugLineNum = 255;BA.debugLine="If tag.Extra.ContainsKey(\"size\") Then FontSiz";
Debug.JustUpdateDeviceLine();
if (_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("size")))).<Boolean>get().booleanValue()) { 
_fontsize = BA.numberCast(int.class, _tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("size")))));Debug.locals.put("FontSize", _fontsize);};
 };
 break; }
case 9: {
 BA.debugLineNum = 258;BA.debugLine="Run.HorizontalAlignment = tag.Extra.Get(\"align";
Debug.JustUpdateDeviceLine();
_run.setField ("HorizontalAlignment" /*RemoteObject*/ ,BA.ObjectToString(_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("alignment"))))));
 break; }
case 10: {
 BA.debugLineNum = 260;BA.debugLine="If tag.Extra.ContainsKey(\"run\") = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("run")))),bbcodeparser.__c.getField(true,"False"))) { 
 BA.debugLineNum = 261;BA.debugLine="Dim parent As BCTextRun = mTextEngine.CreateC";
Debug.JustUpdateDeviceLine();
_parent = __ref.getField(false,"_mtextengine" /*RemoteObject*/ ).runClassMethod (b4a.example.bctextengine.class, "_createconnectedparent" /*RemoteObject*/ );Debug.locals.put("parent", _parent);Debug.locals.put("parent", _parent);
 BA.debugLineNum = 262;BA.debugLine="Dim cr As BCConnectedRuns = parent.Extra.Get(";
Debug.JustUpdateDeviceLine();
_cr = (_parent.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).getField(true,"_extra_connectedruns" /*RemoteObject*/ )))));Debug.locals.put("cr", _cr);Debug.locals.put("cr", _cr);
 BA.debugLineNum = 263;BA.debugLine="cr.ConnectedWidth = GetDimensionFromTag(tag,";
Debug.JustUpdateDeviceLine();
_cr.setField ("ConnectedWidth" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.bbcodeparser.class, "_getdimensionfromtag" /*RemoteObject*/ ,(Object)(_tag),(Object)(BA.ObjectToString("minwidth")),(Object)(_data)));
 BA.debugLineNum = 264;BA.debugLine="cr.Alignment = tag.Extra.GetDefault(\"alignmen";
Debug.JustUpdateDeviceLine();
_cr.setField ("Alignment" /*RemoteObject*/ ,BA.ObjectToString(_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("alignment"))),(Object)((RemoteObject.createImmutable("left"))))));
 BA.debugLineNum = 265;BA.debugLine="RunsList.Add(parent)";
Debug.JustUpdateDeviceLine();
_runslist.runVoidMethod ("Add",(Object)((_parent)));
 BA.debugLineNum = 266;BA.debugLine="tag.Extra.Put(\"run\", parent)";
Debug.JustUpdateDeviceLine();
_tag.getField(false,"Extra" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("run"))),(Object)((_parent)));
 };
 BA.debugLineNum = 268;BA.debugLine="Dim parent As BCTextRun = tag.Extra.Get(\"run\")";
Debug.JustUpdateDeviceLine();
_parent = (_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("run")))));Debug.locals.put("parent", _parent);Debug.locals.put("parent", _parent);
 BA.debugLineNum = 269;BA.debugLine="Dim cr As BCConnectedRuns = parent.Extra.Get(m";
Debug.JustUpdateDeviceLine();
_cr = (_parent.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).getField(true,"_extra_connectedruns" /*RemoteObject*/ )))));Debug.locals.put("cr", _cr);Debug.locals.put("cr", _cr);
 BA.debugLineNum = 270;BA.debugLine="list = cr.Runs";
Debug.JustUpdateDeviceLine();
_list = _cr.getField(false,"Runs" /*RemoteObject*/ );Debug.locals.put("list", _list);
 break; }
case 11: {
 BA.debugLineNum = 272;BA.debugLine="Run.IndentLevel = tag.Extra.Get(\"indent\")";
Debug.JustUpdateDeviceLine();
_run.setField ("IndentLevel" /*RemoteObject*/ ,BA.numberCast(int.class, _tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("indent"))))));
 break; }
case 12: {
 BA.debugLineNum = 274;BA.debugLine="Run.IndentLevel = Run.IndentLevel + 1";
Debug.JustUpdateDeviceLine();
_run.setField ("IndentLevel" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_run.getField(true,"IndentLevel" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 break; }
case 13: {
 BA.debugLineNum = 276;BA.debugLine="IsListElement = True";
Debug.JustUpdateDeviceLine();
_islistelement = bbcodeparser.__c.getField(true,"True");Debug.locals.put("IsListElement", _islistelement);
 break; }
case 14: {
 BA.debugLineNum = 278;BA.debugLine="Run.TextChars = mTextEngine.CreateBCTextChars(";
Debug.JustUpdateDeviceLine();
_run.setField ("TextChars" /*RemoteObject*/ ,__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).runClassMethod (b4a.example.bctextengine.class, "_createbctextchars" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.ObjectToString(_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_tag.getField(true,"Tag" /*RemoteObject*/ )))))})),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 279;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then Run.";
Debug.JustUpdateDeviceLine();
if (_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("vertical")))).<Boolean>get().booleanValue()) { 
_run.setField ("VerticalOffset" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.bbcodeparser.class, "_getdimensionfromtag" /*RemoteObject*/ ,(Object)(_tag),(Object)(BA.ObjectToString("vertical")),(Object)(_data)));};
 break; }
case 15: {
 BA.debugLineNum = 281;BA.debugLine="Dim dir As String = tag.Extra.Get(\"direction\")";
Debug.JustUpdateDeviceLine();
_dir = BA.ObjectToString(_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("direction")))));Debug.locals.put("dir", _dir);Debug.locals.put("dir", _dir);
 BA.debugLineNum = 282;BA.debugLine="Select dir.ToLowerCase";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_dir.runMethod(true,"toLowerCase"),BA.ObjectToString("ltr"),BA.ObjectToString("rtl"),BA.ObjectToString("unknown"))) {
case 0: {
 BA.debugLineNum = 284;BA.debugLine="Run.TextDirection = mTextEngine.TextDirectio";
Debug.JustUpdateDeviceLine();
_run.setField ("TextDirection" /*RemoteObject*/ ,__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).getField(true,"_textdirectionltr" /*RemoteObject*/ ));
 break; }
case 1: {
 BA.debugLineNum = 286;BA.debugLine="Run.TextDirection = mTextEngine.TextDirectio";
Debug.JustUpdateDeviceLine();
_run.setField ("TextDirection" /*RemoteObject*/ ,__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).getField(true,"_textdirectionrtl" /*RemoteObject*/ ));
 break; }
case 2: {
 BA.debugLineNum = 288;BA.debugLine="Run.TextDirection = mTextEngine.TextDirectio";
Debug.JustUpdateDeviceLine();
_run.setField ("TextDirection" /*RemoteObject*/ ,__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).getField(true,"_textdirectionunknown" /*RemoteObject*/ ));
 break; }
}
;
 break; }
case 16: 
case 17: {
 BA.debugLineNum = 291;BA.debugLine="customfont = True";
Debug.JustUpdateDeviceLine();
_customfont = bbcodeparser.__c.getField(true,"True");Debug.locals.put("customfont", _customfont);
 BA.debugLineNum = 292;BA.debugLine="If tag.Tag = \"fontawesome\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_tag.getField(true,"Tag" /*RemoteObject*/ ),BA.ObjectToString("fontawesome"))) { 
 BA.debugLineNum = 293;BA.debugLine="CurrentFont = xui.CreateFontAwesome(FontSize)";
Debug.JustUpdateDeviceLine();
_currentfont = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateFontAwesome",(Object)(BA.numberCast(float.class, _fontsize)));Debug.locals.put("CurrentFont", _currentfont);
 }else {
 BA.debugLineNum = 295;BA.debugLine="CurrentFont = xui.CreateMaterialIcons(FontSiz";
Debug.JustUpdateDeviceLine();
_currentfont = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateMaterialIcons",(Object)(BA.numberCast(float.class, _fontsize)));Debug.locals.put("CurrentFont", _currentfont);
 };
 BA.debugLineNum = 297;BA.debugLine="Run.TextChars = mTextEngine.CreateBCTextCharsF";
Debug.JustUpdateDeviceLine();
_run.setField ("TextChars" /*RemoteObject*/ ,__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).runClassMethod (b4a.example.bctextengine.class, "_createbctextcharsfromstring" /*RemoteObject*/ ,(Object)(BA.ObjectToString(bbcodeparser.__c.runMethod(true,"Chr",(Object)(__ref.runClassMethod (b4a.example.bbcodeparser.class, "_parsecodepoint" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_tag.getField(true,"Tag" /*RemoteObject*/ )))))))))))));
 BA.debugLineNum = 298;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then Run.";
Debug.JustUpdateDeviceLine();
if (_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("vertical")))).<Boolean>get().booleanValue()) { 
_run.setField ("VerticalOffset" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.bbcodeparser.class, "_getdimensionfromtag" /*RemoteObject*/ ,(Object)(_tag),(Object)(BA.ObjectToString("vertical")),(Object)(_data)));};
 BA.debugLineNum = 299;BA.debugLine="If tag.Extra.ContainsKey(\"size\") Then FontSize";
Debug.JustUpdateDeviceLine();
if (_tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("size")))).<Boolean>get().booleanValue()) { 
_fontsize = BA.numberCast(int.class, _tag.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("size")))));Debug.locals.put("FontSize", _fontsize);};
 break; }
}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 302;BA.debugLine="If IsListElement Then";
Debug.JustUpdateDeviceLine();
if (_islistelement.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 303;BA.debugLine="Run = HandleListElement(Text, Run)";
Debug.JustUpdateDeviceLine();
_run = __ref.runClassMethod (b4a.example.bbcodeparser.class, "_handlelistelement" /*RemoteObject*/ ,(Object)(_text),(Object)(_run));Debug.locals.put("Run", _run);
 };
 BA.debugLineNum = 305;BA.debugLine="If customfont Or FontSize <> Data.DefaultFont.Siz";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_customfont) || RemoteObject.solveBoolean("!",_fontsize,BA.numberCast(double.class, _data.getField(false,"DefaultFont" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
 BA.debugLineNum = 318;BA.debugLine="Run.TextFont = xui.CreateFont2(CurrentFont, Font";
Debug.JustUpdateDeviceLine();
_run.setField ("TextFont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateFont2",(Object)(_currentfont),(Object)(BA.numberCast(float.class, _fontsize))));
 };
 BA.debugLineNum = 321;BA.debugLine="list.Add(Run)";
Debug.JustUpdateDeviceLine();
_list.runVoidMethod ("Add",(Object)((_run)));
 BA.debugLineNum = 322;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}