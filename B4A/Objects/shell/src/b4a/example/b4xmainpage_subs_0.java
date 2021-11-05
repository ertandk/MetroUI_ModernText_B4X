package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Root = Root1";
Debug.ShouldStop(1048576);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 22;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
RemoteObject _hatavar = RemoteObject.createImmutable(false);
 BA.debugLineNum = 27;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="Dim Hatavar As Boolean";
Debug.ShouldStop(134217728);
_hatavar = RemoteObject.createImmutable(false);Debug.locals.put("Hatavar", _hatavar);
 BA.debugLineNum = 29;BA.debugLine="Hatavar=Text_Kontrol(Name_Text,\"Please fill in th";
Debug.ShouldStop(268435456);
_hatavar = __ref.runClassMethod (b4a.example.b4xmainpage.class, "_text_kontrol" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_name_text" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Please fill in the Name !")),(Object)(_hatavar));Debug.locals.put("Hatavar", _hatavar);
 BA.debugLineNum = 30;BA.debugLine="Hatavar=Text_Kontrol(Surname_Text,\"Please fill in";
Debug.ShouldStop(536870912);
_hatavar = __ref.runClassMethod (b4a.example.b4xmainpage.class, "_text_kontrol" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_surname_text" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Please fill in the Surname !")),(Object)(_hatavar));Debug.locals.put("Hatavar", _hatavar);
 BA.debugLineNum = 31;BA.debugLine="Hatavar=Text_Kontrol(Email_Text,\"Please fill in t";
Debug.ShouldStop(1073741824);
_hatavar = __ref.runClassMethod (b4a.example.b4xmainpage.class, "_text_kontrol" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_email_text" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Please fill in the E-Mail !")),(Object)(_hatavar));Debug.locals.put("Hatavar", _hatavar);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 10;BA.debugLine="Private Name_Text As MetroUI_ModernText";
b4xmainpage._name_text = RemoteObject.createNew ("b4a.example.metroui_moderntext");__ref.setField("_name_text",b4xmainpage._name_text);
 //BA.debugLineNum = 11;BA.debugLine="Private Surname_Text As MetroUI_ModernText";
b4xmainpage._surname_text = RemoteObject.createNew ("b4a.example.metroui_moderntext");__ref.setField("_surname_text",b4xmainpage._surname_text);
 //BA.debugLineNum = 12;BA.debugLine="Private Email_Text As MetroUI_ModernText";
b4xmainpage._email_text = RemoteObject.createNew ("b4a.example.metroui_moderntext");__ref.setField("_email_text",b4xmainpage._email_text);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16384);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _text_kontrol(RemoteObject __ref,RemoteObject _textbox,RemoteObject _hatamesajı,RemoteObject _hatavar) throws Exception{
try {
		Debug.PushSubsStack("Text_Kontrol (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("text_kontrol")) { return __ref.runUserSub(false, "b4xmainpage","text_kontrol", __ref, _textbox, _hatamesajı, _hatavar);}
Debug.locals.put("TextBox", _textbox);
Debug.locals.put("HataMesajı", _hatamesajı);
Debug.locals.put("HataVar", _hatavar);
 BA.debugLineNum = 34;BA.debugLine="Sub Text_Kontrol (TextBox As MetroUI_ModernText,Ha";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="If TextBox.Text=\"\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_textbox.runClassMethod (b4a.example.metroui_moderntext.class, "_gettext" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 36;BA.debugLine="TextBox.ShowError(HataMesajı)";
Debug.ShouldStop(8);
_textbox.runClassMethod (b4a.example.metroui_moderntext.class, "_showerror" /*RemoteObject*/ ,(Object)(_hatamesajı));
 BA.debugLineNum = 37;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) return b4xmainpage.__c.getField(true,"True");
 };
 BA.debugLineNum = 40;BA.debugLine="If HataMesajı <> \"\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("!",_hatamesajı,BA.ObjectToString(""))) { 
 BA.debugLineNum = 41;BA.debugLine="If TextBox.Text = \"\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_textbox.runClassMethod (b4a.example.metroui_moderntext.class, "_gettext" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 42;BA.debugLine="TextBox.ShowError(HataMesajı)";
Debug.ShouldStop(512);
_textbox.runClassMethod (b4a.example.metroui_moderntext.class, "_showerror" /*RemoteObject*/ ,(Object)(_hatamesajı));
 BA.debugLineNum = 43;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) return b4xmainpage.__c.getField(true,"True");
 };
 };
 BA.debugLineNum = 47;BA.debugLine="If HataVar = True Then ' Bunu Şunun İçin Yaptık B";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_hatavar,b4xmainpage.__c.getField(true,"True"))) { 
 BA.debugLineNum = 48;BA.debugLine="Return True";
Debug.ShouldStop(32768);
if (true) return b4xmainpage.__c.getField(true,"True");
 };
 BA.debugLineNum = 50;BA.debugLine="Return False";
Debug.ShouldStop(131072);
if (true) return b4xmainpage.__c.getField(true,"False");
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}