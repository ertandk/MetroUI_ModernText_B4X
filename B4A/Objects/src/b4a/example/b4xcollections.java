package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xcollections {
private static b4xcollections mostCurrent = new b4xcollections();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.httputils2service _httputils2service = null;
public static b4a.example.b4xbitset  _createbitset(anywheresoftware.b4a.BA _ba,int _size) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createbitset", true))
	 {return ((b4a.example.b4xbitset) Debug.delegate(null, "createbitset", new Object[] {_ba,_size}));}
b4a.example.b4xbitset _s = null;
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub CreateBitSet (Size As Int) As B4XBitSet";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Dim s As B4XBitSet";
_s = new b4a.example.b4xbitset();
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="s.Initialize(Size)";
_s._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),_size);
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="End Sub";
return null;
}
public static b4a.example.b4xorderedmap  _createorderedmap(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createorderedmap", true))
	 {return ((b4a.example.b4xorderedmap) Debug.delegate(null, "createorderedmap", new Object[] {_ba}));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub CreateOrderedMap As B4XOrderedMap";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Return CreateOrderedMap2(Null, Null)";
if (true) return _createorderedmap2(_ba,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="End Sub";
return null;
}
public static b4a.example.b4xorderedmap  _createorderedmap2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _keys,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createorderedmap2", true))
	 {return ((b4a.example.b4xorderedmap) Debug.delegate(null, "createorderedmap2", new Object[] {_ba,_keys,_values}));}
b4a.example.b4xorderedmap _m = null;
int _i = 0;
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub CreateOrderedMap2 (Keys As List, Values";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Dim m As B4XOrderedMap";
_m = new b4a.example.b4xorderedmap();
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="m.Initialize";
_m._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="If Keys <> Null And Values <> Null And Keys.IsIni";
if (_keys!= null && _values!= null && _keys.IsInitialized() && _values.IsInitialized()) { 
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="For i = 0 To Keys.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_keys.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="m.Put(Keys.Get(i), Values.Get(i))";
_m._put /*String*/ (null,_keys.Get(_i),_values.Get(_i));
 }
};
 };
RDebugUtils.currentLine=4194312;
 //BA.debugLineNum = 4194312;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=4194313;
 //BA.debugLineNum = 4194313;BA.debugLine="End Sub";
return null;
}
public static b4a.example.b4xset  _createset(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createset", true))
	 {return ((b4a.example.b4xset) Debug.delegate(null, "createset", new Object[] {_ba}));}
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Public Sub CreateSet As B4XSet";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Return CreateSet2(Null)";
if (true) return _createset2(_ba,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="End Sub";
return null;
}
public static b4a.example.b4xset  _createset2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(null, "createset2", true))
	 {return ((b4a.example.b4xset) Debug.delegate(null, "createset2", new Object[] {_ba,_values}));}
b4a.example.b4xset _s = null;
Object _v = null;
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub CreateSet2 (Values As List) As B4XSet";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Dim s As B4XSet";
_s = new b4a.example.b4xset();
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="s.Initialize";
_s._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="If Values <> Null And Values.IsInitialized Then";
if (_values!= null && _values.IsInitialized()) { 
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="For Each v As Object In Values";
{
final anywheresoftware.b4a.BA.IterableList group4 = _values;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v = group4.Get(index4);
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="s.Add(v)";
_s._add /*String*/ (null,_v);
 }
};
 };
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="End Sub";
return null;
}
}