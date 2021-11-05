package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xmainpage");
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
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
public String  _b4xpage_created(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="End Sub";
return "";
}
public String  _button1_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {return ((String) Debug.delegate(ba, "button1_click", null));}
boolean _hatavar = false;
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub Button1_Click";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Dim Hatavar As Boolean";
_hatavar = false;
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="Hatavar=Text_Kontrol(Name_Text,\"Please fill in th";
_hatavar = __ref._text_kontrol /*boolean*/ (null,__ref._name_text /*b4a.example.metroui_moderntext*/ ,"Please fill in the Name !",_hatavar);
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Hatavar=Text_Kontrol(Surname_Text,\"Please fill in";
_hatavar = __ref._text_kontrol /*boolean*/ (null,__ref._surname_text /*b4a.example.metroui_moderntext*/ ,"Please fill in the Surname !",_hatavar);
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="Hatavar=Text_Kontrol(Email_Text,\"Please fill in t";
_hatavar = __ref._text_kontrol /*boolean*/ (null,__ref._email_text /*b4a.example.metroui_moderntext*/ ,"Please fill in the E-Mail !",_hatavar);
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="End Sub";
return "";
}
public boolean  _text_kontrol(b4a.example.b4xmainpage __ref,b4a.example.metroui_moderntext _textbox,String _hatamesajı,boolean _hatavar) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "text_kontrol", false))
	 {return ((Boolean) Debug.delegate(ba, "text_kontrol", new Object[] {_textbox,_hatamesajı,_hatavar}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub Text_Kontrol (TextBox As MetroUI_ModernText,Ha";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="If TextBox.Text=\"\" Then";
if ((_textbox._gettext /*String*/ (null)).equals("")) { 
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="TextBox.ShowError(HataMesajı)";
_textbox._showerror /*String*/ (null,_hatamesajı);
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="If HataMesajı <> \"\" Then";
if ((_hatamesajı).equals("") == false) { 
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="If TextBox.Text = \"\" Then";
if ((_textbox._gettext /*String*/ (null)).equals("")) { 
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="TextBox.ShowError(HataMesajı)";
_textbox._showerror /*String*/ (null,_hatamesajı);
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="If HataVar = True Then ' Bunu Şunun İçin Yaptık B";
if (_hatavar==__c.True) { 
RDebugUtils.currentLine=851982;
 //BA.debugLineNum = 851982;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=851984;
 //BA.debugLineNum = 851984;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=851985;
 //BA.debugLineNum = 851985;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Private Name_Text As MetroUI_ModernText";
_name_text = new b4a.example.metroui_moderntext();
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Private Surname_Text As MetroUI_ModernText";
_surname_text = new b4a.example.metroui_moderntext();
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Private Email_Text As MetroUI_ModernText";
_email_text = new b4a.example.metroui_moderntext();
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
}