
package hds.modernuixxx;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4i_b4xmainpage {
    public static RemoteObject myClass;
	public b4i_b4xmainpage() {
	}
    public static PCBA staticBA = new PCBA(null, b4i_b4xmainpage.class);

public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _root = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("B4IXUI");
public static RemoteObject _name_text = RemoteObject.declareNull("b4i_metroui_moderntext");
public static RemoteObject _surname_text = RemoteObject.declareNull("b4i_metroui_moderntext");
public static RemoteObject _email_text = RemoteObject.declareNull("b4i_metroui_moderntext");
public static b4i_main _main = null;
public static b4i_b4xpages _b4xpages = null;
public static b4i_b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Email_Text",_ref.getField(false, "_email_text"),"Name_Text",_ref.getField(false, "_name_text"),"Root",_ref.getField(false, "_root"),"Surname_Text",_ref.getField(false, "_surname_text"),"xui",_ref.getField(false, "_xui")};
}
}