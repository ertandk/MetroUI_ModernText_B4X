
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class bbcodeview {
    public static RemoteObject myClass;
	public bbcodeview() {
	}
    public static PCBA staticBA = new PCBA(null, bbcodeview.class);

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
public static RemoteObject _backgroundimageview = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _paragraph = RemoteObject.declareNull("b4a.example.bctextengine._bcparagraph");
public static RemoteObject _touchpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _sv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _padding = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
public static RemoteObject _parsedata = RemoteObject.declareNull("b4a.example.bbcodeparser._bbcodeparsedata");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _lazyloading = RemoteObject.createImmutable(false);
public static RemoteObject _imageviewscache = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _usedimageviews = RemoteObject.declareNull("b4a.example.b4xorderedmap");
public static RemoteObject _externalruns = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _disableautomaticdrawingsinlazymode = RemoteObject.createImmutable(false);
public static RemoteObject _rtl = RemoteObject.createImmutable(false);
public static RemoteObject _urltolines = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _autounderlineurls = RemoteObject.createImmutable(false);
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"AutoUnderlineURLs",_ref.getField(false, "_autounderlineurls"),"BackgroundImageView",_ref.getField(false, "_backgroundimageview"),"DisableAutomaticDrawingsInLazyMode",_ref.getField(false, "_disableautomaticdrawingsinlazymode"),"ExternalRuns",_ref.getField(false, "_externalruns"),"ForegroundImageView",_ref.getField(false, "_foregroundimageview"),"ImageViewsCache",_ref.getField(false, "_imageviewscache"),"LazyLoading",_ref.getField(false, "_lazyloading"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"mText",_ref.getField(false, "_mtext"),"mTextEngine",_ref.getField(false, "_mtextengine"),"Padding",_ref.getField(false, "_padding"),"Paragraph",_ref.getField(false, "_paragraph"),"ParseData",_ref.getField(false, "_parsedata"),"RTL",_ref.getField(false, "_rtl"),"Runs",_ref.getField(false, "_runs"),"Style",_ref.getField(false, "_style"),"sv",_ref.getField(false, "_sv"),"Tag",_ref.getField(false, "_tag"),"TouchPanel",_ref.getField(false, "_touchpanel"),"URLToLines",_ref.getField(false, "_urltolines"),"UsedImageViews",_ref.getField(false, "_usedimageviews"),"xui",_ref.getField(false, "_xui")};
}
}