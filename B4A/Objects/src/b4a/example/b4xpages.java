package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xpages {
private static b4xpages mostCurrent = new b4xpages();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static Object _mpm = null;
public static b4a.example.b4xpagesdelegator _delegate = null;
public static Object _globalcontext = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public static b4a.example.b4xpagesmanager._b4amenuitem  _addmenuitem(anywheresoftware.b4a.BA _ba,Object _b4xpage,Object _title) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "addmenuitem", true))
	 {return ((b4a.example.b4xpagesmanager._b4amenuitem) Debug.delegate(null, "addmenuitem", new Object[] {_ba,_b4xpage,_title}));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub AddMenuItem(B4XPage As Object, Title As";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Return GetManager.AddMenuItem(B4XPage, Title)";
if (true) return _getmanager(_ba)._addmenuitem /*b4a.example.b4xpagesmanager._b4amenuitem*/ (null,_b4xpage,_title);
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="End Sub";
return null;
}
public static b4a.example.b4xpagesmanager  _getmanager(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "getmanager", true))
	 {return ((b4a.example.b4xpagesmanager) Debug.delegate(null, "getmanager", new Object[] {_ba}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub GetManager As B4XPagesManager";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Return mPM";
if (true) return (b4a.example.b4xpagesmanager)(_mpm);
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return null;
}
public static String  _addpage(anywheresoftware.b4a.BA _ba,String _id,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "addpage", true))
	 {return ((String) Debug.delegate(null, "addpage", new Object[] {_ba,_id,_b4xpage}));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="GetManager.AddPage(Id, B4XPage)";
_getmanager(_ba)._addpage /*String*/ (null,_id,_b4xpage);
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="End Sub";
return "";
}
public static String  _addpageandcreate(anywheresoftware.b4a.BA _ba,String _id,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "addpageandcreate", true))
	 {return ((String) Debug.delegate(null, "addpageandcreate", new Object[] {_ba,_id,_b4xpage}));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="GetManager.AddPageAndCreate(Id, B4XPage)";
_getmanager(_ba)._addpageandcreate /*String*/ (null,_id,_b4xpage);
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public static String  _closepage(anywheresoftware.b4a.BA _ba,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "closepage", true))
	 {return ((String) Debug.delegate(null, "closepage", new Object[] {_ba,_b4xpage}));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="GetManager.ClosePage (B4XPage)";
_getmanager(_ba)._closepage /*String*/ (null,_b4xpage);
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.ActivityWrapper  _getnativeparent(anywheresoftware.b4a.BA _ba,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "getnativeparent", true))
	 {return ((anywheresoftware.b4a.objects.ActivityWrapper) Debug.delegate(null, "getnativeparent", new Object[] {_ba,_b4xpage}));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Public Sub GetNativeParent (B4XPage As Object) As";
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="Return GetManager.FindPIFromB4XPage(B4XPage).Pare";
if (true) return _getmanager(_ba)._findpifromb4xpage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage).Parent /*b4a.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4a.objects.ActivityWrapper*/ ;
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="End Sub";
return null;
}
public static Object  _getpage(anywheresoftware.b4a.BA _ba,String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "getpage", true))
	 {return ((Object) Debug.delegate(null, "getpage", new Object[] {_ba,_id}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub GetPage (Id As String) As Object";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Return GetManager.GetPage(Id)";
if (true) return _getmanager(_ba)._getpage /*Object*/ (null,_id);
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return null;
}
public static String  _getpageid(anywheresoftware.b4a.BA _ba,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "getpageid", true))
	 {return ((String) Debug.delegate(null, "getpageid", new Object[] {_ba,_b4xpage}));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub GetPageId (B4XPage As Object) As String";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Return GetManager.FindPIFromB4XPage(B4XPage).Id";
if (true) return _getmanager(_ba)._findpifromb4xpage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage).Id /*String*/ ;
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="End Sub";
return "";
}
public static String  _internalsetpagesmanager(anywheresoftware.b4a.BA _ba,Object _pm) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "internalsetpagesmanager", true))
	 {return ((String) Debug.delegate(null, "internalsetpagesmanager", new Object[] {_ba,_pm}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub InternalSetPagesManager(PM As Object)";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Delegate.Initialize";
_delegate._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="mPM = PM";
_mpm = _pm;
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="End Sub";
return "";
}
public static boolean  _isinitialized(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "isinitialized", true))
	 {return ((Boolean) Debug.delegate(null, "isinitialized", new Object[] {_ba}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub IsInitialized As Boolean";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Return mPM Is B4XPagesManager";
if (true) return _mpm instanceof b4a.example.b4xpagesmanager;
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return false;
}
public static b4a.example.b4xmainpage  _mainpage(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "mainpage", true))
	 {return ((b4a.example.b4xmainpage) Debug.delegate(null, "mainpage", new Object[] {_ba}));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub MainPage As B4XMainPage";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Return GetManager.MainPage";
if (true) return _getmanager(_ba)._mainpage /*b4a.example.b4xmainpage*/ ;
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return null;
}
public static String  _settitle(anywheresoftware.b4a.BA _ba,Object _b4xpage,Object _title) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "settitle", true))
	 {return ((String) Debug.delegate(null, "settitle", new Object[] {_ba,_b4xpage,_title}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="GetManager.SetTitle(B4XPage, Title)";
_getmanager(_ba)._settitle /*String*/ (null,_b4xpage,_title);
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public static String  _showpage(anywheresoftware.b4a.BA _ba,String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "showpage", true))
	 {return ((String) Debug.delegate(null, "showpage", new Object[] {_ba,_id}));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Public Sub ShowPage (Id As String)";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="GetManager.ShowPage(Id)";
_getmanager(_ba)._showpage /*String*/ (null,_id);
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return "";
}
public static String  _showpageandremovepreviouspages(anywheresoftware.b4a.BA _ba,String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "showpageandremovepreviouspages", true))
	 {return ((String) Debug.delegate(null, "showpageandremovepreviouspages", new Object[] {_ba,_id}));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="GetManager.ShowPageAndRemovePreviousPages (Id)";
_getmanager(_ba)._showpageandremovepreviouspages /*String*/ (null,_id);
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
}