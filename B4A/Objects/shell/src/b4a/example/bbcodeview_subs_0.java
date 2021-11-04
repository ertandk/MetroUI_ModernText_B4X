package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class bbcodeview_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (bbcodeview) ","bbcodeview",13,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "bbcodeview","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 105;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 106;BA.debugLine="sv.SetLayoutAnimated(0, 0, 0, Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sv" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _width)),(Object)(BA.numberCast(int.class, _height)));
 BA.debugLineNum = 107;BA.debugLine="sv.ScrollViewContentWidth = Width";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setScrollViewContentWidth",BA.numberCast(int.class, _width));
 BA.debugLineNum = 108;BA.debugLine="If DisableAutomaticDrawingsInLazyMode Then Return";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_disableautomaticdrawingsinlazymode" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 109;BA.debugLine="If Runs.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_runs" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 110;BA.debugLine="If ParseData.NeedToReparseWhenResize Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_parsedata" /*RemoteObject*/ ).getField(true,"NeedToReparseWhenResize" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 111;BA.debugLine="ParseAndDraw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bbcodeview.class, "_parseanddraw" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 113;BA.debugLine="Redraw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bbcodeview.class, "_redraw" /*RemoteObject*/ );
 };
 };
 BA.debugLineNum = 116;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private mEventName As String 'ignore";
bbcodeview._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",bbcodeview._meventname);
 //BA.debugLineNum = 6;BA.debugLine="Private mCallBack As Object 'ignore";
bbcodeview._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",bbcodeview._mcallback);
 //BA.debugLineNum = 7;BA.debugLine="Public mBase As B4XView 'ignore";
bbcodeview._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",bbcodeview._mbase);
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI 'ignore";
bbcodeview._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",bbcodeview._xui);
 //BA.debugLineNum = 9;BA.debugLine="Private Runs As List";
bbcodeview._runs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_runs",bbcodeview._runs);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
bbcodeview._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",bbcodeview._xui);
 //BA.debugLineNum = 11;BA.debugLine="Public Style As BCParagraphStyle";
bbcodeview._style = RemoteObject.createNew ("b4a.example.bctextengine._bcparagraphstyle");__ref.setField("_style",bbcodeview._style);
 //BA.debugLineNum = 12;BA.debugLine="Private mTextEngine As BCTextEngine";
bbcodeview._mtextengine = RemoteObject.createNew ("b4a.example.bctextengine");__ref.setField("_mtextengine",bbcodeview._mtextengine);
 //BA.debugLineNum = 13;BA.debugLine="Private mText As String";
bbcodeview._mtext = RemoteObject.createImmutable("");__ref.setField("_mtext",bbcodeview._mtext);
 //BA.debugLineNum = 14;BA.debugLine="Public ForegroundImageView As B4XView";
bbcodeview._foregroundimageview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_foregroundimageview",bbcodeview._foregroundimageview);
 //BA.debugLineNum = 15;BA.debugLine="Public BackgroundImageView As B4XView";
bbcodeview._backgroundimageview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_backgroundimageview",bbcodeview._backgroundimageview);
 //BA.debugLineNum = 16;BA.debugLine="Public Paragraph As BCParagraph";
bbcodeview._paragraph = RemoteObject.createNew ("b4a.example.bctextengine._bcparagraph");__ref.setField("_paragraph",bbcodeview._paragraph);
 //BA.debugLineNum = 17;BA.debugLine="Private TouchPanel As B4XView";
bbcodeview._touchpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_touchpanel",bbcodeview._touchpanel);
 //BA.debugLineNum = 18;BA.debugLine="Public sv As B4XView";
bbcodeview._sv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_sv",bbcodeview._sv);
 //BA.debugLineNum = 19;BA.debugLine="Public Padding As B4XRect";
bbcodeview._padding = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");__ref.setField("_padding",bbcodeview._padding);
 //BA.debugLineNum = 20;BA.debugLine="Public ParseData As BBCodeParseData";
bbcodeview._parsedata = RemoteObject.createNew ("b4a.example.bbcodeparser._bbcodeparsedata");__ref.setField("_parsedata",bbcodeview._parsedata);
 //BA.debugLineNum = 21;BA.debugLine="Public Tag As Object";
bbcodeview._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",bbcodeview._tag);
 //BA.debugLineNum = 22;BA.debugLine="Public LazyLoading As Boolean";
bbcodeview._lazyloading = RemoteObject.createImmutable(false);__ref.setField("_lazyloading",bbcodeview._lazyloading);
 //BA.debugLineNum = 23;BA.debugLine="Private ImageViewsCache As List";
bbcodeview._imageviewscache = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_imageviewscache",bbcodeview._imageviewscache);
 //BA.debugLineNum = 24;BA.debugLine="Private UsedImageViews As B4XOrderedMap";
bbcodeview._usedimageviews = RemoteObject.createNew ("b4a.example.b4xorderedmap");__ref.setField("_usedimageviews",bbcodeview._usedimageviews);
 //BA.debugLineNum = 25;BA.debugLine="Public ExternalRuns As List";
bbcodeview._externalruns = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_externalruns",bbcodeview._externalruns);
 //BA.debugLineNum = 26;BA.debugLine="Public DisableAutomaticDrawingsInLazyMode As Bool";
bbcodeview._disableautomaticdrawingsinlazymode = RemoteObject.createImmutable(false);__ref.setField("_disableautomaticdrawingsinlazymode",bbcodeview._disableautomaticdrawingsinlazymode);
 //BA.debugLineNum = 27;BA.debugLine="Type InternalBBViewURL (Lines As List)";
;
 //BA.debugLineNum = 28;BA.debugLine="Public RTL As Boolean";
bbcodeview._rtl = RemoteObject.createImmutable(false);__ref.setField("_rtl",bbcodeview._rtl);
 //BA.debugLineNum = 29;BA.debugLine="Private URLToLines As Map";
bbcodeview._urltolines = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_urltolines",bbcodeview._urltolines);
 //BA.debugLineNum = 30;BA.debugLine="Public AutoUnderlineURLs As Boolean";
bbcodeview._autounderlineurls = RemoteObject.createImmutable(false);__ref.setField("_autounderlineurls",bbcodeview._autounderlineurls);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _cleanexistingimageviews(RemoteObject __ref,RemoteObject _invisibleonly,RemoteObject _existing,RemoteObject _offset,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CleanExistingImageViews (bbcodeview) ","bbcodeview",13,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("cleanexistingimageviews")) { return __ref.runUserSub(false, "bbcodeview","cleanexistingimageviews", __ref, _invisibleonly, _existing, _offset, _height);}
RemoteObject _line = RemoteObject.declareNull("b4a.example.bctextengine._bctextline");
RemoteObject _xiv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("InvisibleOnly", _invisibleonly);
Debug.locals.put("Existing", _existing);
Debug.locals.put("Offset", _offset);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 182;BA.debugLine="Private Sub CleanExistingImageViews (InvisibleOnly";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 183;BA.debugLine="For Each Line As BCTextLine In Existing";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _existing;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (group1.runMethod(false,"Get",index1));Debug.locals.put("Line", _line);
Debug.locals.put("Line", _line);
 BA.debugLineNum = 184;BA.debugLine="If InvisibleOnly = False Or LineIsVisible(Line,";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_invisibleonly,bbcodeview.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.runClassMethod (b4a.example.bbcodeview.class, "_lineisvisible" /*RemoteObject*/ ,(Object)(_line),(Object)(_offset),(Object)(_height)),bbcodeview.__c.getField(true,"False"))) { 
 BA.debugLineNum = 185;BA.debugLine="Dim xiv As B4XView = UsedImageViews.Get(Line)";
Debug.JustUpdateDeviceLine();
_xiv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xiv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_usedimageviews" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)((_line))));Debug.locals.put("xiv", _xiv);
 BA.debugLineNum = 186;BA.debugLine="xiv.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
_xiv.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 187;BA.debugLine="xiv.SetBitmap(Null)";
Debug.JustUpdateDeviceLine();
_xiv.runVoidMethod ("SetBitmap",(Object)((bbcodeview.__c.getField(false,"Null"))));
 BA.debugLineNum = 188;BA.debugLine="ImageViewsCache.Add(xiv)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_imageviewscache" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_xiv.getObject())));
 BA.debugLineNum = 189;BA.debugLine="If InvisibleOnly = True Then UsedImageViews.Rem";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_invisibleonly,bbcodeview.__c.getField(true,"True"))) { 
__ref.getField(false,"_usedimageviews" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_remove" /*RemoteObject*/ ,(Object)((_line)));};
 };
 }
}Debug.locals.put("Line", _line);
;
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _collecturls(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CollectURLs (bbcodeview) ","bbcodeview",13,__ref.getField(false, "ba"),__ref,307);
if (RapidSub.canDelegate("collecturls")) { return __ref.runUserSub(false, "bbcodeview","collecturls", __ref);}
RemoteObject _line = RemoteObject.declareNull("b4a.example.bctextengine._bctextline");
RemoteObject _un = RemoteObject.declareNull("b4a.example.bctextengine._bcunbreakabletext");
RemoteObject _st = RemoteObject.declareNull("b4a.example.bctextengine._bcsinglestylesection");
RemoteObject _extra = RemoteObject.declareNull("b4a.example.bbcodeview._internalbbviewurl");
 BA.debugLineNum = 307;BA.debugLine="Private Sub CollectURLs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 308;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = __ref.getField(false,"_paragraph" /*RemoteObject*/ ).getField(false,"TextLines" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (group1.runMethod(false,"Get",index1));Debug.locals.put("line", _line);
Debug.locals.put("line", _line);
 BA.debugLineNum = 309;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _line.getField(false,"Unbreakables" /*RemoteObject*/ );
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_un = (group2.runMethod(false,"Get",index2));Debug.locals.put("un", _un);
Debug.locals.put("un", _un);
 BA.debugLineNum = 310;BA.debugLine="For Each st As BCSingleStyleSection In un.Singl";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _un.getField(false,"SingleStyleSections" /*RemoteObject*/ );
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_st = (group3.runMethod(false,"Get",index3));Debug.locals.put("st", _st);
Debug.locals.put("st", _st);
 BA.debugLineNum = 311;BA.debugLine="If ParseData.URLs.ContainsKey(st.Run) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_parsedata" /*RemoteObject*/ ).getField(false,"URLs" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_st.getField(false,"Run" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 312;BA.debugLine="Dim extra As InternalBBViewURL";
Debug.JustUpdateDeviceLine();
_extra = RemoteObject.createNew ("b4a.example.bbcodeview._internalbbviewurl");Debug.locals.put("extra", _extra);
 BA.debugLineNum = 313;BA.debugLine="If URLToLines.ContainsKey(st.Run) = False The";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_urltolines" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_st.getField(false,"Run" /*RemoteObject*/ )))),bbcodeview.__c.getField(true,"False"))) { 
 BA.debugLineNum = 314;BA.debugLine="extra = CreateBCURLExtraData";
Debug.JustUpdateDeviceLine();
_extra = __ref.runClassMethod (b4a.example.bbcodeview.class, "_createbcurlextradata" /*RemoteObject*/ );Debug.locals.put("extra", _extra);
 BA.debugLineNum = 315;BA.debugLine="URLToLines.Put(st.Run, extra)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_urltolines" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_st.getField(false,"Run" /*RemoteObject*/ ))),(Object)((_extra)));
 }else {
 BA.debugLineNum = 317;BA.debugLine="extra = URLToLines.Get(st.Run)";
Debug.JustUpdateDeviceLine();
_extra = (__ref.getField(false,"_urltolines" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_st.getField(false,"Run" /*RemoteObject*/ )))));Debug.locals.put("extra", _extra);
 };
 BA.debugLineNum = 319;BA.debugLine="If extra.Lines.IndexOf(line) = -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_extra.getField(false,"Lines" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_line))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 320;BA.debugLine="extra.Lines.Add(line)";
Debug.JustUpdateDeviceLine();
_extra.getField(false,"Lines" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_line)));
 };
 };
 }
}Debug.locals.put("st", _st);
;
 }
}Debug.locals.put("un", _un);
;
 }
}Debug.locals.put("line", _line);
;
 BA.debugLineNum = 326;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createbcurlextradata(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateBCURLExtraData (bbcodeview) ","bbcodeview",13,__ref.getField(false, "ba"),__ref,328);
if (RapidSub.canDelegate("createbcurlextradata")) { return __ref.runUserSub(false, "bbcodeview","createbcurlextradata", __ref);}
RemoteObject _t1 = RemoteObject.declareNull("b4a.example.bbcodeview._internalbbviewurl");
 BA.debugLineNum = 328;BA.debugLine="Private Sub CreateBCURLExtraData  As InternalBBVie";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 329;BA.debugLine="Dim t1 As InternalBBViewURL";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4a.example.bbcodeview._internalbbviewurl");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 330;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 331;BA.debugLine="t1.Lines.Initialize";
Debug.JustUpdateDeviceLine();
_t1.getField(false,"Lines" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 332;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 333;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (bbcodeview) ","bbcodeview",13,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "bbcodeview","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _sp = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 59;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 60;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 61;BA.debugLine="Tag = mBase.Tag";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 62;BA.debugLine="mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 68;BA.debugLine="Dim sp As ScrollView";
Debug.JustUpdateDeviceLine();
_sp = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");Debug.locals.put("sp", _sp);
 BA.debugLineNum = 69;BA.debugLine="sp.Initialize2(50dip, \"sv\")";
Debug.JustUpdateDeviceLine();
_sp.runVoidMethod ("Initialize2",__ref.getField(false, "ba"),(Object)(bbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(RemoteObject.createImmutable("sv")));
 BA.debugLineNum = 75;BA.debugLine="LazyLoading = Props.GetDefault(\"LazyLoading\", Tru";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lazyloading" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("LazyLoading"))),(Object)((bbcodeview.__c.getField(true,"True"))))));
 BA.debugLineNum = 76;BA.debugLine="AutoUnderlineURLs = Props.GetDefault(\"AutoUnderli";
Debug.JustUpdateDeviceLine();
__ref.setField ("_autounderlineurls" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("AutoUnderline"))),(Object)((bbcodeview.__c.getField(true,"True"))))));
 BA.debugLineNum = 77;BA.debugLine="If LazyLoading Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_lazyloading" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 78;BA.debugLine="ImageViewsCache.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_imageviewscache" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 79;BA.debugLine="UsedImageViews = B4XCollections.CreateOrderedMap";
Debug.JustUpdateDeviceLine();
__ref.setField ("_usedimageviews" /*RemoteObject*/ ,bbcodeview._b4xcollections.runMethod(false,"_createorderedmap" /*RemoteObject*/ ,__ref.getField(false, "ba")));
 };
 BA.debugLineNum = 81;BA.debugLine="sv = sp";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sv" /*RemoteObject*/ ).setObject (_sp.getObject());
 BA.debugLineNum = 82;BA.debugLine="sv.Color = mBase.Color";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getColor"));
 BA.debugLineNum = 83;BA.debugLine="sv.ScrollViewInnerPanel.Color = mBase.Color";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getColor"));
 BA.debugLineNum = 84;BA.debugLine="mBase.AddView(sv, 0, 0, mBase.Width, mBase.Height";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_sv" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 85;BA.debugLine="Dim xlbl As B4XView = Lbl";
Debug.JustUpdateDeviceLine();
_xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 86;BA.debugLine="mText = xlbl.Text";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtext" /*RemoteObject*/ ,_xlbl.runMethod(true,"getText"));
 BA.debugLineNum = 87;BA.debugLine="ParseData.DefaultColor = xlbl.TextColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).setField ("DefaultColor" /*RemoteObject*/ ,_xlbl.runMethod(true,"getTextColor"));
 BA.debugLineNum = 88;BA.debugLine="ParseData.DefaultFont = xlbl.Font";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).setField ("DefaultFont" /*RemoteObject*/ ,_xlbl.runMethod(false,"getFont"));
 BA.debugLineNum = 89;BA.debugLine="ParseData.ViewsPanel = sv.ScrollViewInnerPanel";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).setField ("ViewsPanel" /*RemoteObject*/ ,__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getScrollViewInnerPanel"));
 BA.debugLineNum = 90;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_linkcl";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_linkclicked"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 91;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_touchpanel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("TouchPanel"))));
 };
 BA.debugLineNum = 98;BA.debugLine="ParseData.DefaultBoldFont = xui.CreateFont(Typefa";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).setField ("DefaultBoldFont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateFont",(Object)(bbcodeview.__c.getField(false,"Typeface").runMethod(false,"CreateNew",(Object)(_lbl.runMethod(false,"getTypeface")),(Object)(bbcodeview.__c.getField(false,"Typeface").getField(true,"STYLE_BOLD")))),(Object)(_xlbl.runMethod(true,"getTextSize"))));
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawvisibleregion(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawVisibleRegion (bbcodeview) ","bbcodeview",13,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("drawvisibleregion")) { return __ref.runUserSub(false, "bbcodeview","drawvisibleregion", __ref);}
 BA.debugLineNum = 141;BA.debugLine="Private Sub DrawVisibleRegion";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 142;BA.debugLine="If DisableAutomaticDrawingsInLazyMode Then Return";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_disableautomaticdrawingsinlazymode" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 143;BA.debugLine="UpdateVisibleRegion(sv.ScrollViewOffsetY * mTextE";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bbcodeview.class, "_updatevisibleregion" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewOffsetY"),__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).getField(true,"_mscale" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).getField(true,"_mscale" /*RemoteObject*/ )}, "*",0, 0))));
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findtouchedrun(RemoteObject __ref,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("FindTouchedRun (bbcodeview) ","bbcodeview",13,__ref.getField(false, "ba"),__ref,272);
if (RapidSub.canDelegate("findtouchedrun")) { return __ref.runUserSub(false, "bbcodeview","findtouchedrun", __ref, _x, _y);}
RemoteObject _offsetx = RemoteObject.createImmutable(0);
RemoteObject _offsety = RemoteObject.createImmutable(0);
RemoteObject _single = RemoteObject.declareNull("b4a.example.bctextengine._bcsinglestylesection");
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 272;BA.debugLine="Private Sub FindTouchedRun(x As Float, y As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 273;BA.debugLine="For Each offsetx As Int In Array(0, -5dip, 5dip)";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable((0)),RemoteObject.createImmutable((-(double) (0 + bbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))).<Integer>get().intValue()))),(bbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))});
final int groupLen1 = group1.getField(true,"length").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_offsetx = BA.numberCast(int.class, group1.getArrayElement(false,RemoteObject.createImmutable(index1)));Debug.locals.put("offsetx", _offsetx);
Debug.locals.put("offsetx", _offsetx);
 BA.debugLineNum = 274;BA.debugLine="For Each offsety As Int In Array(0, -3dip, 3dip)";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable((0)),RemoteObject.createImmutable((-(double) (0 + bbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))).<Integer>get().intValue()))),(bbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))))});
final int groupLen2 = group2.getField(true,"length").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_offsety = BA.numberCast(int.class, group2.getArrayElement(false,RemoteObject.createImmutable(index2)));Debug.locals.put("offsety", _offsety);
Debug.locals.put("offsety", _offsety);
 BA.debugLineNum = 275;BA.debugLine="Dim single As BCSingleStyleSection = mTextEngin";
Debug.JustUpdateDeviceLine();
_single = __ref.getField(false,"_mtextengine" /*RemoteObject*/ ).runClassMethod (b4a.example.bctextengine.class, "_findsinglestylesection" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_paragraph" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_x,_offsetx}, "+",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_y,_offsety}, "+",1, 0))));Debug.locals.put("single", _single);Debug.locals.put("single", _single);
 BA.debugLineNum = 276;BA.debugLine="If single <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_single)) { 
 BA.debugLineNum = 277;BA.debugLine="Return single.Run";
Debug.JustUpdateDeviceLine();
if (true) return _single.getField(false,"Run" /*RemoteObject*/ );
 };
 }
}Debug.locals.put("offsety", _offsety);
;
 }
}Debug.locals.put("offsetx", _offsetx);
;
 BA.debugLineNum = 281;BA.debugLine="Return Null";
Debug.JustUpdateDeviceLine();
if (true) return (bbcodeview.__c.getField(false,"Null"));
 BA.debugLineNum = 282;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getText (bbcodeview) ","bbcodeview",13,__ref.getField(false, "ba"),__ref,137);
if (RapidSub.canDelegate("gettext")) { return __ref.runUserSub(false, "bbcodeview","gettext", __ref);}
 BA.debugLineNum = 137;BA.debugLine="Public Sub getText As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 138;BA.debugLine="Return mText";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mtext" /*RemoteObject*/ );
 BA.debugLineNum = 139;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("getTextEngine (bbcodeview) ","bbcodeview",13,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("gettextengine")) { return __ref.runUserSub(false, "bbcodeview","gettextengine", __ref);}
 BA.debugLineNum = 128;BA.debugLine="Public Sub getTextEngine As BCTextEngine";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 129;BA.debugLine="Return mTextEngine";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mtextengine" /*RemoteObject*/ );
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getviews(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getViews (bbcodeview) ","bbcodeview",13,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("getviews")) { return __ref.runUserSub(false, "bbcodeview","getviews", __ref);}
 BA.debugLineNum = 51;BA.debugLine="Public Sub getViews As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="Return ParseData.Views";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_parsedata" /*RemoteObject*/ ).getField(false,"Views" /*RemoteObject*/ );
 BA.debugLineNum = 53;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (bbcodeview) ","bbcodeview",13,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "bbcodeview","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 33;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 35;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 36;BA.debugLine="Dim iv As ImageView";
Debug.JustUpdateDeviceLine();
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 37;BA.debugLine="iv.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_iv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 38;BA.debugLine="ForegroundImageView = iv";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_foregroundimageview" /*RemoteObject*/ ).setObject (_iv.getObject());
 BA.debugLineNum = 39;BA.debugLine="ParseData.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 40;BA.debugLine="ParseData.Views.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).getField(false,"Views" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 41;BA.debugLine="ParseData.URLs.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).getField(false,"URLs" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 42;BA.debugLine="If xui.IsB4J Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4J").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 43;BA.debugLine="Padding.Initialize(5dip, 5dip, 20dip, 5dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_padding" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, bbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(BA.numberCast(float.class, bbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(BA.numberCast(float.class, bbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20))))),(Object)(BA.numberCast(float.class, bbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))));
 }else {
 BA.debugLineNum = 45;BA.debugLine="Padding.Initialize(5dip, 5dip, 5dip, 5dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_padding" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, bbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(BA.numberCast(float.class, bbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(BA.numberCast(float.class, bbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(BA.numberCast(float.class, bbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))));
 };
 BA.debugLineNum = 47;BA.debugLine="ParseData.ImageCache.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).getField(false,"ImageCache" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 48;BA.debugLine="URLToLines.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_urltolines" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lineisvisible(RemoteObject __ref,RemoteObject _line,RemoteObject _offset,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("LineIsVisible (bbcodeview) ","bbcodeview",13,__ref.getField(false, "ba"),__ref,178);
if (RapidSub.canDelegate("lineisvisible")) { return __ref.runUserSub(false, "bbcodeview","lineisvisible", __ref, _line, _offset, _height);}
Debug.locals.put("line", _line);
Debug.locals.put("offset", _offset);
Debug.locals.put("height", _height);
 BA.debugLineNum = 178;BA.debugLine="Private Sub LineIsVisible(line As BCTextLine, offs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 179;BA.debugLine="Return line.BaselineY + line.MaxHeightBelowBaseLi";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("g",RemoteObject.solve(new RemoteObject[] {_line.getField(true,"BaselineY" /*RemoteObject*/ ),_line.getField(true,"MaxHeightBelowBaseLine" /*RemoteObject*/ )}, "+",1, 1),BA.numberCast(double.class, _offset)) && RemoteObject.solveBoolean("k",RemoteObject.solve(new RemoteObject[] {_line.getField(true,"BaselineY" /*RemoteObject*/ ),_line.getField(true,"MaxHeightAboveBaseLine" /*RemoteObject*/ )}, "-",1, 1),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_offset,_height}, "+",1, 1))));
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _markurl(RemoteObject __ref,RemoteObject _run) throws Exception{
try {
		Debug.PushSubsStack("MarkURL (bbcodeview) ","bbcodeview",13,__ref.getField(false, "ba"),__ref,284);
if (RapidSub.canDelegate("markurl")) { return __ref.runUserSub(false, "bbcodeview","markurl", __ref, _run);}
RemoteObject _r = RemoteObject.declareNull("b4a.example.bctextengine._bctextrun");
RemoteObject _extra = RemoteObject.declareNull("b4a.example.bbcodeview._internalbbviewurl");
RemoteObject _line = RemoteObject.declareNull("b4a.example.bctextengine._bctextline");
Debug.locals.put("Run", _run);
 BA.debugLineNum = 284;BA.debugLine="Private Sub MarkURL (Run As BCTextRun)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 294;BA.debugLine="For Each r As BCTextRun In URLToLines.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = __ref.getField(false,"_urltolines" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_r = (group1.runMethod(false,"Get",index1));Debug.locals.put("r", _r);
Debug.locals.put("r", _r);
 BA.debugLineNum = 295;BA.debugLine="If r.Underline <> (r = Run) Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_r.getField(true,"Underline" /*RemoteObject*/ ),BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_r,_run))))) { 
 BA.debugLineNum = 296;BA.debugLine="r.Underline = r = Run";
Debug.JustUpdateDeviceLine();
_r.setField ("Underline" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_r,_run)));
 BA.debugLineNum = 297;BA.debugLine="Dim extra As InternalBBViewURL = URLToLines.Get";
Debug.JustUpdateDeviceLine();
_extra = (__ref.getField(false,"_urltolines" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_r))));Debug.locals.put("extra", _extra);Debug.locals.put("extra", _extra);
 BA.debugLineNum = 298;BA.debugLine="For Each line As BCTextLine In extra.Lines";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group5 = _extra.getField(false,"Lines" /*RemoteObject*/ );
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_line = (group5.runMethod(false,"Get",index5));Debug.locals.put("line", _line);
Debug.locals.put("line", _line);
 BA.debugLineNum = 299;BA.debugLine="If UsedImageViews.ContainsKey(line) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_usedimageviews" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_containskey" /*RemoteObject*/ ,(Object)((_line))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 300;BA.debugLine="mTextEngine.DrawSingleLine(line, UsedImageVie";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).runClassMethod (b4a.example.bctextengine.class, "_drawsingleline" /*RemoteObject*/ ,(Object)(_line),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_usedimageviews" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)((_line)))),(Object)(__ref.getField(false,"_paragraph" /*RemoteObject*/ )));
 };
 }
}Debug.locals.put("line", _line);
;
 };
 }
}Debug.locals.put("r", _r);
;
 BA.debugLineNum = 305;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ParseAndDraw (bbcodeview) ","bbcodeview",13,__ref.getField(false, "ba"),__ref,195);
if (RapidSub.canDelegate("parseanddraw")) { return __ref.runUserSub(false, "bbcodeview","parseanddraw", __ref);}
RemoteObject _pe = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 195;BA.debugLine="Public Sub ParseAndDraw";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 196;BA.debugLine="ParseData.NeedToReparseWhenResize = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).setField ("NeedToReparseWhenResize" /*RemoteObject*/ ,bbcodeview.__c.getField(true,"False"));
 BA.debugLineNum = 197;BA.debugLine="ParseData.Text = mText";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).setField ("Text" /*RemoteObject*/ ,__ref.getField(true,"_mtext" /*RemoteObject*/ ));
 BA.debugLineNum = 198;BA.debugLine="ParseData.URLs.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).getField(false,"URLs" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 199;BA.debugLine="ParseData.Width = (mBase.Width - Padding.Left - P";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).setField ("Width" /*RemoteObject*/ ,BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_padding" /*RemoteObject*/ ).runMethod(true,"getLeft"),__ref.getField(false,"_padding" /*RemoteObject*/ ).runMethod(true,"getRight")}, "--",2, 0))));
 BA.debugLineNum = 201;BA.debugLine="Dim pe As List = mTextEngine.TagParser.Parse(Pars";
Debug.JustUpdateDeviceLine();
_pe = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_pe = __ref.getField(false,"_mtextengine" /*RemoteObject*/ ).getField(false,"_tagparser" /*RemoteObject*/ ).runClassMethod (b4a.example.bbcodeparser.class, "_parse" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_parsedata" /*RemoteObject*/ )));Debug.locals.put("pe", _pe);Debug.locals.put("pe", _pe);
 BA.debugLineNum = 202;BA.debugLine="sv.ScrollViewInnerPanel.RemoveAllViews";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getScrollViewInnerPanel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 203;BA.debugLine="If TouchPanel.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_touchpanel" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 204;BA.debugLine="sv.ScrollViewInnerPanel.AddView(TouchPanel, 0, 0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getScrollViewInnerPanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_touchpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 206;BA.debugLine="sv.ScrollViewInnerPanel.AddView(ForegroundImageVi";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getScrollViewInnerPanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_foregroundimageview" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(bbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(bbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 207;BA.debugLine="If ExternalRuns.IsInitialized And ExternalRuns.Si";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_externalruns" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",__ref.getField(false,"_externalruns" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 208;BA.debugLine="Runs = ExternalRuns";
Debug.JustUpdateDeviceLine();
__ref.setField ("_runs" /*RemoteObject*/ ,__ref.getField(false,"_externalruns" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 210;BA.debugLine="Runs = mTextEngine.TagParser.CreateRuns(pe, Pars";
Debug.JustUpdateDeviceLine();
__ref.setField ("_runs" /*RemoteObject*/ ,__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).getField(false,"_tagparser" /*RemoteObject*/ ).runClassMethod (b4a.example.bbcodeparser.class, "_createruns" /*RemoteObject*/ ,(Object)(_pe),(Object)(__ref.getField(false,"_parsedata" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 213;BA.debugLine="Redraw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bbcodeview.class, "_redraw" /*RemoteObject*/ );
 BA.debugLineNum = 214;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Redraw (bbcodeview) ","bbcodeview",13,__ref.getField(false, "ba"),__ref,216);
if (RapidSub.canDelegate("redraw")) { return __ref.runUserSub(false, "bbcodeview","redraw", __ref);}
RemoteObject _r = RemoteObject.declareNull("b4a.example.bctextengine._bctextrun");
 BA.debugLineNum = 216;BA.debugLine="Public Sub Redraw";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 217;BA.debugLine="Dim Style As BCParagraphStyle = mTextEngine.Creat";
Debug.JustUpdateDeviceLine();
bbcodeview._style = __ref.getField(false,"_mtextengine" /*RemoteObject*/ ).runClassMethod (b4a.example.bctextengine.class, "_createstyle" /*RemoteObject*/ );__ref.setField("_style",bbcodeview._style);
 BA.debugLineNum = 218;BA.debugLine="Style.Padding = Padding";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("Padding" /*RemoteObject*/ ,__ref.getField(false,"_padding" /*RemoteObject*/ ));
 BA.debugLineNum = 219;BA.debugLine="Style.MaxWidth = mBase.Width";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("MaxWidth" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 220;BA.debugLine="Style.ResizeHeightAutomatically = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("ResizeHeightAutomatically" /*RemoteObject*/ ,bbcodeview.__c.getField(true,"True"));
 BA.debugLineNum = 221;BA.debugLine="Style.RTL = RTL";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("RTL" /*RemoteObject*/ ,__ref.getField(true,"_rtl" /*RemoteObject*/ ));
 BA.debugLineNum = 222;BA.debugLine="URLToLines.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_urltolines" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 223;BA.debugLine="If LazyLoading Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_lazyloading" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 224;BA.debugLine="CleanExistingImageViews(False, UsedImageViews.Ke";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bbcodeview.class, "_cleanexistingimageviews" /*RemoteObject*/ ,(Object)(bbcodeview.__c.getField(true,"False")),(Object)(__ref.getField(false,"_usedimageviews" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 225;BA.debugLine="UsedImageViews.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_usedimageviews" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 226;BA.debugLine="Paragraph = mTextEngine.PrepareForLazyDrawing(Ru";
Debug.JustUpdateDeviceLine();
__ref.setField ("_paragraph" /*RemoteObject*/ ,__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).runClassMethod (b4a.example.bctextengine.class, "_prepareforlazydrawing" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_runs" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_style" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_sv" /*RemoteObject*/ ))));
 BA.debugLineNum = 227;BA.debugLine="ForegroundImageView.SetLayoutAnimated(0, Style.P";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_foregroundimageview" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, __ref.getField(false,"_style" /*RemoteObject*/ ).getField(false,"Padding" /*RemoteObject*/ ).runMethod(true,"getLeft"))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_style" /*RemoteObject*/ ).getField(false,"Padding" /*RemoteObject*/ ).runMethod(true,"getTop"))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewContentWidth"),__ref.getField(false,"_style" /*RemoteObject*/ ).getField(false,"Padding" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getScrollViewContentHeight"),__ref.getField(false,"_style" /*RemoteObject*/ ).getField(false,"Padding" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-",1, 0))));
 BA.debugLineNum = 228;BA.debugLine="If AutoUnderlineURLs And ParseData.URLs.Size > 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(true,"_autounderlineurls" /*RemoteObject*/ )) && RemoteObject.solveBoolean(">",__ref.getField(false,"_parsedata" /*RemoteObject*/ ).getField(false,"URLs" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 229;BA.debugLine="CollectURLs";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bbcodeview.class, "_collecturls" /*RemoteObject*/ );
 BA.debugLineNum = 230;BA.debugLine="For Each r As BCTextRun In URLToLines.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group14 = __ref.getField(false,"_urltolines" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen14 = group14.runMethod(true,"getSize").<Integer>get()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_r = (group14.runMethod(false,"Get",index14));Debug.locals.put("r", _r);
Debug.locals.put("r", _r);
 BA.debugLineNum = 231;BA.debugLine="r.Underline = False";
Debug.JustUpdateDeviceLine();
_r.setField ("Underline" /*RemoteObject*/ ,bbcodeview.__c.getField(true,"False"));
 }
}Debug.locals.put("r", _r);
;
 };
 BA.debugLineNum = 234;BA.debugLine="DrawVisibleRegion";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bbcodeview.class, "_drawvisibleregion" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 236;BA.debugLine="Paragraph = mTextEngine.DrawText(Runs, Style, Fo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_paragraph" /*RemoteObject*/ ,__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).runClassMethod (b4a.example.bctextengine.class, "_drawtext" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_runs" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_style" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_foregroundimageview" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_sv" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 238;BA.debugLine="If TouchPanel.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_touchpanel" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 239;BA.debugLine="TouchPanel.SetLayoutAnimated(0, ForegroundImageV";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_touchpanel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_foregroundimageview" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_foregroundimageview" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(__ref.getField(false,"_foregroundimageview" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_foregroundimageview" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 };
 BA.debugLineNum = 241;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setText (bbcodeview) ","bbcodeview",13,__ref.getField(false, "ba"),__ref,132);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "bbcodeview","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 132;BA.debugLine="Public Sub setText(t As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 133;BA.debugLine="mText = t";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtext" /*RemoteObject*/ ,_t);
 BA.debugLineNum = 134;BA.debugLine="ParseAndDraw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bbcodeview.class, "_parseanddraw" /*RemoteObject*/ );
 BA.debugLineNum = 135;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setTextEngine (bbcodeview) ","bbcodeview",13,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("settextengine")) { return __ref.runUserSub(false, "bbcodeview","settextengine", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 118;BA.debugLine="Public Sub setTextEngine (b As BCTextEngine)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 119;BA.debugLine="mTextEngine = b";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtextengine" /*RemoteObject*/ ,_b);
 BA.debugLineNum = 123;BA.debugLine="If mText <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mtext" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 124;BA.debugLine="setText(mText)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bbcodeview.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mtext" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setviews(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("setViews (bbcodeview) ","bbcodeview",13,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("setviews")) { return __ref.runUserSub(false, "bbcodeview","setviews", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 55;BA.debugLine="Public Sub setViews (m As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 56;BA.debugLine="ParseData.Views = m";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).setField ("Views" /*RemoteObject*/ ,_m);
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sv_scrollchanged(RemoteObject __ref,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("sv_ScrollChanged (bbcodeview) ","bbcodeview",13,__ref.getField(false, "ba"),__ref,342);
if (RapidSub.canDelegate("sv_scrollchanged")) { return __ref.runUserSub(false, "bbcodeview","sv_scrollchanged", __ref, _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 342;BA.debugLine="Private Sub sv_ScrollChanged(Position As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 343;BA.debugLine="If LazyLoading Then DrawVisibleRegion";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_lazyloading" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4a.example.bbcodeview.class, "_drawvisibleregion" /*RemoteObject*/ );};
 BA.debugLineNum = 344;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _touchpanel_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("TouchPanel_Touch (bbcodeview) ","bbcodeview",13,__ref.getField(false, "ba"),__ref,243);
if (RapidSub.canDelegate("touchpanel_touch")) { return __ref.runUserSub(false, "bbcodeview","touchpanel_touch", __ref, _action, _x, _y);}
RemoteObject _run = RemoteObject.declareNull("b4a.example.bctextengine._bctextrun");
RemoteObject _url = RemoteObject.createImmutable("");
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 243;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 244;BA.debugLine="Dim run As BCTextRun = Null";
Debug.JustUpdateDeviceLine();
_run = (bbcodeview.__c.getField(false,"Null"));Debug.locals.put("run", _run);Debug.locals.put("run", _run);
 BA.debugLineNum = 245;BA.debugLine="If URLToLines.Size > 0 Or Action = TouchPanel.TOU";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_urltolines" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_touchpanel" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_UP")))) { 
 BA.debugLineNum = 246;BA.debugLine="run = FindTouchedRun(X, Y)";
Debug.JustUpdateDeviceLine();
_run = __ref.runClassMethod (b4a.example.bbcodeview.class, "_findtouchedrun" /*RemoteObject*/ ,(Object)(_x),(Object)(_y));Debug.locals.put("run", _run);
 };
 BA.debugLineNum = 248;BA.debugLine="If run <> Null And ParseData.URLs.ContainsKey(run";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_run) && RemoteObject.solveBoolean(".",__ref.getField(false,"_parsedata" /*RemoteObject*/ ).getField(false,"URLs" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_run))))) { 
 BA.debugLineNum = 249;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_UP Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_touchpanel" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_UP")))) { 
 BA.debugLineNum = 250;BA.debugLine="Dim url As String = ParseData.Urls.Get(run)";
Debug.JustUpdateDeviceLine();
_url = BA.ObjectToString(__ref.getField(false,"_parsedata" /*RemoteObject*/ ).getField(false,"URLs" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_run))));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 251;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_LinkC";
Debug.JustUpdateDeviceLine();
bbcodeview.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_LinkClicked"))),(Object)((_url)));
 BA.debugLineNum = 252;BA.debugLine="MarkURL(Null)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bbcodeview.class, "_markurl" /*RemoteObject*/ ,(Object)((bbcodeview.__c.getField(false,"Null"))));
 }else 
{ BA.debugLineNum = 253;BA.debugLine="Else If (xui.IsB4i And Action = 4) Or (xui.IsB4A";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4i")) && RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, 4))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4A")) && RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, 3)))))) { 
 BA.debugLineNum = 254;BA.debugLine="MarkURL(Null)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bbcodeview.class, "_markurl" /*RemoteObject*/ ,(Object)((bbcodeview.__c.getField(false,"Null"))));
 }else {
 BA.debugLineNum = 257;BA.debugLine="MarkURL(run)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bbcodeview.class, "_markurl" /*RemoteObject*/ ,(Object)(_run));
 }}
;
 BA.debugLineNum = 259;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 261;BA.debugLine="MarkURL(Null)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bbcodeview.class, "_markurl" /*RemoteObject*/ ,(Object)((bbcodeview.__c.getField(false,"Null"))));
 BA.debugLineNum = 262;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatevisibleregion(RemoteObject __ref,RemoteObject _offsety,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("UpdateVisibleRegion (bbcodeview) ","bbcodeview",13,__ref.getField(false, "ba"),__ref,147);
if (RapidSub.canDelegate("updatevisibleregion")) { return __ref.runUserSub(false, "bbcodeview","updatevisibleregion", __ref, _offsety, _height);}
RemoteObject _foundfirst = RemoteObject.createImmutable(false);
RemoteObject _existing = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _line = RemoteObject.declareNull("b4a.example.bctextengine._bctextline");
RemoteObject _xiv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
Debug.locals.put("OffsetY", _offsety);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 147;BA.debugLine="Public Sub UpdateVisibleRegion (OffsetY As Int, He";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 148;BA.debugLine="Dim foundFirst As Boolean";
Debug.JustUpdateDeviceLine();
_foundfirst = RemoteObject.createImmutable(false);Debug.locals.put("foundFirst", _foundfirst);
 BA.debugLineNum = 149;BA.debugLine="Dim Existing As List";
Debug.JustUpdateDeviceLine();
_existing = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Existing", _existing);
 BA.debugLineNum = 150;BA.debugLine="Existing.Initialize";
Debug.JustUpdateDeviceLine();
_existing.runVoidMethod ("Initialize");
 BA.debugLineNum = 151;BA.debugLine="Existing.AddAll(UsedImageViews.Keys)";
Debug.JustUpdateDeviceLine();
_existing.runVoidMethod ("AddAll",(Object)(__ref.getField(false,"_usedimageviews" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ )));
 BA.debugLineNum = 152;BA.debugLine="CleanExistingImageViews(True, Existing, OffsetY,";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.bbcodeview.class, "_cleanexistingimageviews" /*RemoteObject*/ ,(Object)(bbcodeview.__c.getField(true,"True")),(Object)(_existing),(Object)(_offsety),(Object)(_height));
 BA.debugLineNum = 153;BA.debugLine="For Each Line As BCTextLine In Paragraph.TextLine";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group6 = __ref.getField(false,"_paragraph" /*RemoteObject*/ ).getField(false,"TextLines" /*RemoteObject*/ );
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_line = (group6.runMethod(false,"Get",index6));Debug.locals.put("Line", _line);
Debug.locals.put("Line", _line);
 BA.debugLineNum = 154;BA.debugLine="If LineIsVisible (Line, OffsetY, Height) Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (b4a.example.bbcodeview.class, "_lineisvisible" /*RemoteObject*/ ,(Object)(_line),(Object)(_offsety),(Object)(_height)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 155;BA.debugLine="foundFirst = True";
Debug.JustUpdateDeviceLine();
_foundfirst = bbcodeview.__c.getField(true,"True");Debug.locals.put("foundFirst", _foundfirst);
 BA.debugLineNum = 156;BA.debugLine="If UsedImageViews.ContainsKey(Line) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_usedimageviews" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_containskey" /*RemoteObject*/ ,(Object)((_line))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 157;BA.debugLine="Continue";
Debug.JustUpdateDeviceLine();
if (true) continue;
 };
 BA.debugLineNum = 159;BA.debugLine="Dim xiv As B4XView";
Debug.JustUpdateDeviceLine();
_xiv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("xiv", _xiv);
 BA.debugLineNum = 160;BA.debugLine="If ImageViewsCache.Size = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_imageviewscache" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 161;BA.debugLine="Dim iv As ImageView";
Debug.JustUpdateDeviceLine();
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 162;BA.debugLine="iv.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_iv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 163;BA.debugLine="xiv = iv";
Debug.JustUpdateDeviceLine();
_xiv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _iv.getObject());
 }else {
 BA.debugLineNum = 165;BA.debugLine="xiv = ImageViewsCache.Get(ImageViewsCache.Size";
Debug.JustUpdateDeviceLine();
_xiv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imageviewscache" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_imageviewscache" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));
 BA.debugLineNum = 166;BA.debugLine="ImageViewsCache.RemoveAt(ImageViewsCache.Size";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_imageviewscache" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_imageviewscache" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 };
 BA.debugLineNum = 168;BA.debugLine="sv.ScrollViewInnerPanel.AddView(xiv, 0, 0, 0, 0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getScrollViewInnerPanel").runVoidMethod ("AddView",(Object)((_xiv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 169;BA.debugLine="xiv.SendToBack";
Debug.JustUpdateDeviceLine();
_xiv.runVoidMethod ("SendToBack");
 BA.debugLineNum = 170;BA.debugLine="mTextEngine.DrawSingleLine(Line, xiv, Paragraph";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).runClassMethod (b4a.example.bctextengine.class, "_drawsingleline" /*RemoteObject*/ ,(Object)(_line),(Object)(_xiv),(Object)(__ref.getField(false,"_paragraph" /*RemoteObject*/ )));
 BA.debugLineNum = 171;BA.debugLine="UsedImageViews.Put(Line, xiv)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_usedimageviews" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_line)),(Object)((_xiv.getObject())));
 }else {
 BA.debugLineNum = 173;BA.debugLine="If foundFirst Then Exit";
Debug.JustUpdateDeviceLine();
if (_foundfirst.<Boolean>get().booleanValue()) { 
if (true) break;};
 };
 }
}Debug.locals.put("Line", _line);
;
 BA.debugLineNum = 176;BA.debugLine="End Sub";
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