
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class metroui_moderntext {
    public static RemoteObject myClass;
	public metroui_moderntext() {
	}
    public static PCBA staticBA = new PCBA(null, metroui_moderntext.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _color = RemoteObject.createImmutable("");
public static RemoteObject _mypanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mytextbox = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _photopanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _labelb4x = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _label = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _canvas1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"canvas1",_ref.getField(false, "_canvas1"),"Color",_ref.getField(false, "_color"),"img",_ref.getField(false, "_img"),"Label",_ref.getField(false, "_label"),"Labelb4x",_ref.getField(false, "_labelb4x"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"MyPanel",_ref.getField(false, "_mypanel"),"MyTextbox",_ref.getField(false, "_mytextbox"),"PhotoPanel",_ref.getField(false, "_photopanel"),"Tag",_ref.getField(false, "_tag"),"xui",_ref.getField(false, "_xui")};
}
}