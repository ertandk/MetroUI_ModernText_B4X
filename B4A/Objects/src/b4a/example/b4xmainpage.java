package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.metroui_moderntext _name_text = null;
public b4a.example.metroui_moderntext _surname_text = null;
public b4a.example.metroui_moderntext _email_text = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 21;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 22;BA.debugLine="Root.LoadLayout(\"MainPage\")";
_root.LoadLayout("MainPage",ba);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
boolean _hatavar = false;
 //BA.debugLineNum = 27;BA.debugLine="Private Sub Button1_Click";
 //BA.debugLineNum = 28;BA.debugLine="Dim Hatavar As Boolean";
_hatavar = false;
 //BA.debugLineNum = 29;BA.debugLine="Hatavar=Text_Kontrol(Name_Text,\"Please fill in th";
_hatavar = _text_kontrol(_name_text,"Please fill in the Name !",_hatavar);
 //BA.debugLineNum = 30;BA.debugLine="Hatavar=Text_Kontrol(Surname_Text,\"Please fill in";
_hatavar = _text_kontrol(_surname_text,"Please fill in the Surname !",_hatavar);
 //BA.debugLineNum = 31;BA.debugLine="Hatavar=Text_Kontrol(Email_Text,\"Please fill in t";
_hatavar = _text_kontrol(_email_text,"Please fill in the E-Mail !",_hatavar);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 10;BA.debugLine="Private Name_Text As MetroUI_ModernText";
_name_text = new b4a.example.metroui_moderntext();
 //BA.debugLineNum = 11;BA.debugLine="Private Surname_Text As MetroUI_ModernText";
_surname_text = new b4a.example.metroui_moderntext();
 //BA.debugLineNum = 12;BA.debugLine="Private Email_Text As MetroUI_ModernText";
_email_text = new b4a.example.metroui_moderntext();
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public boolean  _text_kontrol(b4a.example.metroui_moderntext _textbox,String _hatamesajı,boolean _hatavar) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub Text_Kontrol (TextBox As MetroUI_ModernText,Ha";
 //BA.debugLineNum = 35;BA.debugLine="If TextBox.Text=\"\" Then";
if ((_textbox._gettext /*String*/ ()).equals("")) { 
 //BA.debugLineNum = 36;BA.debugLine="TextBox.ShowError(HataMesajı)";
_textbox._showerror /*String*/ (_hatamesajı);
 //BA.debugLineNum = 37;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 40;BA.debugLine="If HataMesajı <> \"\" Then";
if ((_hatamesajı).equals("") == false) { 
 //BA.debugLineNum = 41;BA.debugLine="If TextBox.Text = \"\" Then";
if ((_textbox._gettext /*String*/ ()).equals("")) { 
 //BA.debugLineNum = 42;BA.debugLine="TextBox.ShowError(HataMesajı)";
_textbox._showerror /*String*/ (_hatamesajı);
 //BA.debugLineNum = 43;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
 //BA.debugLineNum = 47;BA.debugLine="If HataVar = True Then ' Bunu Şunun İçin Yaptık B";
if (_hatavar==__c.True) { 
 //BA.debugLineNum = 48;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 50;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return false;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
