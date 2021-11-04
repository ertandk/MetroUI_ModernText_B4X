
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class bblabel {
    public static RemoteObject myClass;
	public bblabel() {
	}
    public static PCBA staticBA = new PCBA(null, bblabel.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _runs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _style = RemoteObject.declareNull("b4a.example.bctextengine._bcparagraphstyle");
public static RemoteObject _mtextengine = RemoteObject.declareNull("b4a.example.bctextengine");
public static RemoteObject _mtext = RemoteObject.createImmutable("");
public static RemoteObject _foregroundimageview = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _paragraph = RemoteObject.declareNull("b4a.example.bctextengine._bcparagraph");
public static RemoteObject _padding = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
public static RemoteObject _parsedata = RemoteObject.declareNull("b4a.example.bbcodeparser._bbcodeparsedata");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _disableresizeevent = RemoteObject.createImmutable(false);
public static RemoteObject _wordwrap = RemoteObject.createImmutable(false);
public static RemoteObject _rtl = RemoteObject.createImmutable(false);
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DisableResizeEvent",_ref.getField(false, "_disableresizeevent"),"ForegroundImageView",_ref.getField(false, "_foregroundimageview"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"mText",_ref.getField(false, "_mtext"),"mTextEngine",_ref.getField(false, "_mtextengine"),"Padding",_ref.getField(false, "_padding"),"Paragraph",_ref.getField(false, "_paragraph"),"ParseData",_ref.getField(false, "_parsedata"),"RTL",_ref.getField(false, "_rtl"),"Runs",_ref.getField(false, "_runs"),"Style",_ref.getField(false, "_style"),"Tag",_ref.getField(false, "_tag"),"WordWrap",_ref.getField(false, "_wordwrap"),"xui",_ref.getField(false, "_xui")};
}
}