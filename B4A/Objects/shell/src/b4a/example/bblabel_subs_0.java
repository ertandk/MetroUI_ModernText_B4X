package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class bblabel_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (bblabel) ","bblabel",14,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "bblabel","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 51;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="If DisableResizeEvent Then Return";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_disableresizeevent" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 53;BA.debugLine="If Runs.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_runs" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 54;BA.debugLine="If ParseData.NeedToReparseWhenResize Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_parsedata" /*RemoteObject*/ ).getField(true,"NeedToReparseWhenResize" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 55;BA.debugLine="ParseAndDraw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bblabel.class, "_parseanddraw" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 57;BA.debugLine="Redraw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bblabel.class, "_redraw" /*RemoteObject*/ );
 };
 };
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private mEventName As String 'ignore";
bblabel._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",bblabel._meventname);
 //BA.debugLineNum = 3;BA.debugLine="Private mCallBack As Object 'ignore";
bblabel._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",bblabel._mcallback);
 //BA.debugLineNum = 4;BA.debugLine="Public mBase As B4XView 'ignore";
bblabel._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",bblabel._mbase);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI 'ignore";
bblabel._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",bblabel._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private Runs As List";
bblabel._runs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_runs",bblabel._runs);
 //BA.debugLineNum = 7;BA.debugLine="Public Style As BCParagraphStyle";
bblabel._style = RemoteObject.createNew ("b4a.example.bctextengine._bcparagraphstyle");__ref.setField("_style",bblabel._style);
 //BA.debugLineNum = 8;BA.debugLine="Private mTextEngine As BCTextEngine";
bblabel._mtextengine = RemoteObject.createNew ("b4a.example.bctextengine");__ref.setField("_mtextengine",bblabel._mtextengine);
 //BA.debugLineNum = 9;BA.debugLine="Private mText As String";
bblabel._mtext = RemoteObject.createImmutable("");__ref.setField("_mtext",bblabel._mtext);
 //BA.debugLineNum = 10;BA.debugLine="Public ForegroundImageView As B4XView";
bblabel._foregroundimageview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_foregroundimageview",bblabel._foregroundimageview);
 //BA.debugLineNum = 11;BA.debugLine="Public Paragraph As BCParagraph";
bblabel._paragraph = RemoteObject.createNew ("b4a.example.bctextengine._bcparagraph");__ref.setField("_paragraph",bblabel._paragraph);
 //BA.debugLineNum = 12;BA.debugLine="Public Padding As B4XRect";
bblabel._padding = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");__ref.setField("_padding",bblabel._padding);
 //BA.debugLineNum = 13;BA.debugLine="Public ParseData As BBCodeParseData";
bblabel._parsedata = RemoteObject.createNew ("b4a.example.bbcodeparser._bbcodeparsedata");__ref.setField("_parsedata",bblabel._parsedata);
 //BA.debugLineNum = 14;BA.debugLine="Public Tag As Object";
bblabel._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",bblabel._tag);
 //BA.debugLineNum = 15;BA.debugLine="Public DisableResizeEvent As Boolean";
bblabel._disableresizeevent = RemoteObject.createImmutable(false);__ref.setField("_disableresizeevent",bblabel._disableresizeevent);
 //BA.debugLineNum = 16;BA.debugLine="Public WordWrap As Boolean = True";
bblabel._wordwrap = bblabel.__c.getField(true,"True");__ref.setField("_wordwrap",bblabel._wordwrap);
 //BA.debugLineNum = 17;BA.debugLine="Public RTL As Boolean";
bblabel._rtl = RemoteObject.createImmutable(false);__ref.setField("_rtl",bblabel._rtl);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (bblabel) ","bblabel",14,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "bblabel","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 30;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 31;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 32;BA.debugLine="Tag = mBase.Tag";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 33;BA.debugLine="mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 34;BA.debugLine="mBase.AddView(ForegroundImageView, 0, 0, mBase.Wi";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_foregroundimageview" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 35;BA.debugLine="Dim xlbl As B4XView = Lbl";
Debug.JustUpdateDeviceLine();
_xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 36;BA.debugLine="ParseData.DefaultColor = xlbl.TextColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).setField ("DefaultColor" /*RemoteObject*/ ,_xlbl.runMethod(true,"getTextColor"));
 BA.debugLineNum = 37;BA.debugLine="ParseData.DefaultFont = xlbl.Font";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).setField ("DefaultFont" /*RemoteObject*/ ,_xlbl.runMethod(false,"getFont"));
 BA.debugLineNum = 38;BA.debugLine="ParseData.ViewsPanel = mBase";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).setField ("ViewsPanel" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ));
 BA.debugLineNum = 39;BA.debugLine="mText = xlbl.Text";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtext" /*RemoteObject*/ ,_xlbl.runMethod(true,"getText"));
 BA.debugLineNum = 44;BA.debugLine="ParseData.DefaultBoldFont = xui.CreateFont(Typefa";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).setField ("DefaultBoldFont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateFont",(Object)(bblabel.__c.getField(false,"Typeface").runMethod(false,"CreateNew",(Object)(_lbl.runMethod(false,"getTypeface")),(Object)(bblabel.__c.getField(false,"Typeface").getField(true,"STYLE_BOLD")))),(Object)(_xlbl.runMethod(true,"getTextSize"))));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getText (bblabel) ","bblabel",14,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("gettext")) { return __ref.runUserSub(false, "bblabel","gettext", __ref);}
 BA.debugLineNum = 81;BA.debugLine="Public Sub getText As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="Return mText";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mtext" /*RemoteObject*/ );
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettextengine(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTextEngine (bblabel) ","bblabel",14,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("gettextengine")) { return __ref.runUserSub(false, "bblabel","gettextengine", __ref);}
 BA.debugLineNum = 72;BA.debugLine="Public Sub getTextEngine As BCTextEngine";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 73;BA.debugLine="Return mTextEngine";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mtextengine" /*RemoteObject*/ );
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (bblabel) ","bblabel",14,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "bblabel","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 21;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 22;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 23;BA.debugLine="Dim iv As ImageView";
Debug.JustUpdateDeviceLine();
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 24;BA.debugLine="iv.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_iv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 25;BA.debugLine="ForegroundImageView = iv";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_foregroundimageview" /*RemoteObject*/ ).setObject (_iv.getObject());
 BA.debugLineNum = 26;BA.debugLine="ParseData.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 27;BA.debugLine="Padding.Initialize(2dip, 2dip, 2dip, 2dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_padding" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, bblabel.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, bblabel.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, bblabel.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, bblabel.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parseanddraw(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ParseAndDraw (bblabel) ","bblabel",14,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("parseanddraw")) { return __ref.runUserSub(false, "bblabel","parseanddraw", __ref);}
int _i = 0;
RemoteObject _pe = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 85;BA.debugLine="Public Sub ParseAndDraw";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="For i = mBase.NumberOfViews - 1 To 1 Step -1";
Debug.JustUpdateDeviceLine();
{
final int step1 = -1;
final int limit1 = 1;
_i = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 87;BA.debugLine="mBase.GetView(i).RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).runVoidMethod ("RemoveViewFromParent");
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 89;BA.debugLine="ParseData.NeedToReparseWhenResize = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).setField ("NeedToReparseWhenResize" /*RemoteObject*/ ,bblabel.__c.getField(true,"False"));
 BA.debugLineNum = 90;BA.debugLine="ParseData.Text = mText";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).setField ("Text" /*RemoteObject*/ ,__ref.getField(true,"_mtext" /*RemoteObject*/ ));
 BA.debugLineNum = 91;BA.debugLine="ParseData.Width = (mBase.Width - Padding.Left - P";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).setField ("Width" /*RemoteObject*/ ,BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_padding" /*RemoteObject*/ ).runMethod(true,"getLeft"),__ref.getField(false,"_padding" /*RemoteObject*/ ).runMethod(true,"getRight")}, "--",2, 0))));
 BA.debugLineNum = 92;BA.debugLine="Dim pe As List = mTextEngine.TagParser.Parse(Pars";
Debug.JustUpdateDeviceLine();
_pe = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_pe = __ref.getField(false,"_mtextengine" /*RemoteObject*/ ).getField(false,"_tagparser" /*RemoteObject*/ ).runClassMethod (b4a.example.bbcodeparser.class, "_parse" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_parsedata" /*RemoteObject*/ )));Debug.locals.put("pe", _pe);Debug.locals.put("pe", _pe);
 BA.debugLineNum = 93;BA.debugLine="Runs = mTextEngine.TagParser.CreateRuns(pe, Parse";
Debug.JustUpdateDeviceLine();
__ref.setField ("_runs" /*RemoteObject*/ ,__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).getField(false,"_tagparser" /*RemoteObject*/ ).runClassMethod (b4a.example.bbcodeparser.class, "_createruns" /*RemoteObject*/ ,(Object)(_pe),(Object)(__ref.getField(false,"_parsedata" /*RemoteObject*/ ))));
 BA.debugLineNum = 94;BA.debugLine="Redraw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bblabel.class, "_redraw" /*RemoteObject*/ );
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _redraw(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Redraw (bblabel) ","bblabel",14,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("redraw")) { return __ref.runUserSub(false, "bblabel","redraw", __ref);}
RemoteObject _dx = RemoteObject.createImmutable(0);
RemoteObject _dy = RemoteObject.createImmutable(0);
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 97;BA.debugLine="Public Sub Redraw";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 98;BA.debugLine="Dim Style As BCParagraphStyle = mTextEngine.Creat";
Debug.JustUpdateDeviceLine();
bblabel._style = __ref.getField(false,"_mtextengine" /*RemoteObject*/ ).runClassMethod (b4a.example.bctextengine.class, "_createstyle" /*RemoteObject*/ );__ref.setField("_style",bblabel._style);
 BA.debugLineNum = 99;BA.debugLine="Style.Padding = Padding";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("Padding" /*RemoteObject*/ ,__ref.getField(false,"_padding" /*RemoteObject*/ ));
 BA.debugLineNum = 100;BA.debugLine="Style.MaxWidth = mBase.Width";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("MaxWidth" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 101;BA.debugLine="Style.HorizontalAlignment = \"left\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("HorizontalAlignment" /*RemoteObject*/ ,BA.ObjectToString("left"));
 BA.debugLineNum = 102;BA.debugLine="Style.WordWrap = WordWrap";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("WordWrap" /*RemoteObject*/ ,__ref.getField(true,"_wordwrap" /*RemoteObject*/ ));
 BA.debugLineNum = 103;BA.debugLine="Style.RTL = RTL";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("RTL" /*RemoteObject*/ ,__ref.getField(true,"_rtl" /*RemoteObject*/ ));
 BA.debugLineNum = 104;BA.debugLine="Paragraph = mTextEngine.DrawText(Runs, Style, For";
Debug.JustUpdateDeviceLine();
__ref.setField ("_paragraph" /*RemoteObject*/ ,__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).runClassMethod (b4a.example.bctextengine.class, "_drawtext" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_runs" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_style" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_foregroundimageview" /*RemoteObject*/ )),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), bblabel.__c.getField(false,"Null"))));
 BA.debugLineNum = 105;BA.debugLine="Dim dx As Int = mBase.Width / 2 - ForegroundImage";
Debug.JustUpdateDeviceLine();
_dx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(false,"_foregroundimageview" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(false,"_foregroundimageview" /*RemoteObject*/ ).runMethod(true,"getLeft")}, "/-/-",2, 0));Debug.locals.put("dx", _dx);Debug.locals.put("dx", _dx);
 BA.debugLineNum = 106;BA.debugLine="Dim dy As Int = mBase.Height / 2 - ForegroundImag";
Debug.JustUpdateDeviceLine();
_dy = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(false,"_foregroundimageview" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(false,"_foregroundimageview" /*RemoteObject*/ ).runMethod(true,"getTop")}, "/-/-",2, 0));Debug.locals.put("dy", _dy);Debug.locals.put("dy", _dy);
 BA.debugLineNum = 107;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group10 = __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"GetAllViewsRecursive");
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group10.runMethod(false,"Get",index10));
Debug.locals.put("v", _v);
 BA.debugLineNum = 108;BA.debugLine="v.Left = v.Left + dx";
Debug.JustUpdateDeviceLine();
_v.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_v.runMethod(true,"getLeft"),_dx}, "+",1, 1));
 BA.debugLineNum = 109;BA.debugLine="v.Top = v.Top + dy";
Debug.JustUpdateDeviceLine();
_v.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {_v.runMethod(true,"getTop"),_dy}, "+",1, 1));
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 111;BA.debugLine="ForegroundImageView.Visible = Paragraph.Height >";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_foregroundimageview" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(false,"_paragraph" /*RemoteObject*/ ).getField(true,"Height" /*RemoteObject*/ ),BA.numberCast(double.class, 0))));
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("setText (bblabel) ","bblabel",14,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "bblabel","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 76;BA.debugLine="Public Sub setText(t As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 77;BA.debugLine="mText = t";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtext" /*RemoteObject*/ ,_t);
 BA.debugLineNum = 78;BA.debugLine="ParseAndDraw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bblabel.class, "_parseanddraw" /*RemoteObject*/ );
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextengine(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setTextEngine (bblabel) ","bblabel",14,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("settextengine")) { return __ref.runUserSub(false, "bblabel","settextengine", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 62;BA.debugLine="Public Sub setTextEngine (b As BCTextEngine)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="mTextEngine = b";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtextengine" /*RemoteObject*/ ,_b);
 BA.debugLineNum = 67;BA.debugLine="If mText <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mtext" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 68;BA.debugLine="setText(mText)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bblabel.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mtext" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 70;BA.debugLine="End Sub";
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