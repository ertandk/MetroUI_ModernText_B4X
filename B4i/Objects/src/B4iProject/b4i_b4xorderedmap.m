
#import "b4i_b4xorderedmap.h"
#import "b4i_main.h"
#import "b4i_b4xmainpage.h"
#import "b4i_metroui_moderntext.h"
#import "b4i_b4xpages.h"
#import "b4i_b4xbitset.h"
#import "b4i_b4xbytesbuilder.h"
#import "b4i_b4xcollections.h"
#import "b4i_b4xset.h"
#import "b4i_b4xpagesdelegator.h"
#import "b4i_b4xpagesmanager.h"


@implementation b4i_b4xorderedmap 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xorderedmap) instance released.");
}

- (NSString*)  _initialize:(b4i_b4xorderedmap*) __ref :(B4I*) _ba{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:" :@[[B4I nilToNSNull:_ba]]]);}
B4IRDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub Initialize";
B4IRDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="map.Initialize";
[__ref->__map /*B4IMap**/  Initialize];
B4IRDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="list.Initialize";
[__ref->__list /*B4IList**/  Initialize];
B4IRDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _put:(b4i_b4xorderedmap*) __ref :(NSObject*) _key :(NSObject*) _value{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"put"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"put::" :@[[B4I nilToNSNull:_key],[B4I nilToNSNull:_value]]]);}
B4IRDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub Put (Key As Object, Value As Object)";
B4IRDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="If map.ContainsKey(Key) = False Then";
if ([__ref->__map /*B4IMap**/  ContainsKey:_key]==false) { 
B4IRDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="list.Add(Key)";
[__ref->__list /*B4IList**/  Add:_key];
 };
B4IRDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="map.Put(Key, Value)";
[__ref->__map /*B4IMap**/  Put:_key :_value];
B4IRDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_b4xorderedmap*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
B4IRDebugUtils.currentModule=@"b4xorderedmap";
B4IRDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Private map As Map";
self->__map = [B4IMap new];
B4IRDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="Private list As List";
self->__list = [B4IList new];
B4IRDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _clear:(b4i_b4xorderedmap*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"clear"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"clear" :nil]);}
B4IRDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub Clear";
B4IRDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="list.Clear";
[__ref->__list /*B4IList**/  Clear];
B4IRDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="map.Clear";
[__ref->__map /*B4IMap**/  Clear];
B4IRDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _containskey:(b4i_b4xorderedmap*) __ref :(NSObject*) _key{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"containskey"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"containskey:" :@[[B4I nilToNSNull:_key]]]).boolValue;}
B4IRDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub ContainsKey (Key As Object) As Boolean";
B4IRDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Return map.ContainsKey(Key)";
if (true) return [__ref->__map /*B4IMap**/  ContainsKey:_key];
B4IRDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="End Sub";
return false;
}
- (NSObject*)  _get:(b4i_b4xorderedmap*) __ref :(NSObject*) _key{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"get"])
	 {return ((NSObject*) [B4IDebug delegate:self.bi :@"get:" :@[[B4I nilToNSNull:_key]]]);}
B4IRDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub Get (Key As Object) As Object";
B4IRDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Return map.Get(Key)";
if (true) return [__ref->__map /*B4IMap**/  Get:_key];
B4IRDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="End Sub";
return nil;
}
- (NSObject*)  _getdataforserializator:(b4i_b4xorderedmap*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"getdataforserializator"])
	 {return ((NSObject*) [B4IDebug delegate:self.bi :@"getdataforserializator" :nil]);}
B4IRDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub GetDataForSerializator As Object";
B4IRDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="Return Array(map, list)";
if (true) return (NSObject*)([[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(__ref->__map /*B4IMap**/ )],[B4I nilToNSNull:(NSObject*)((__ref->__list /*B4IList**/ ).object)]]]);
B4IRDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="End Sub";
return nil;
}
- (NSObject*)  _getdefault:(b4i_b4xorderedmap*) __ref :(NSObject*) _key :(NSObject*) _defaultvalue{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"getdefault"])
	 {return ((NSObject*) [B4IDebug delegate:self.bi :@"getdefault::" :@[[B4I nilToNSNull:_key],[B4I nilToNSNull:_defaultvalue]]]);}
B4IRDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub GetDefault (Key As Object, DefaultValue";
B4IRDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Return map.GetDefault(Key, DefaultValue)";
if (true) return [__ref->__map /*B4IMap**/  GetDefault:_key :_defaultvalue];
B4IRDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="End Sub";
return nil;
}
- (B4IList*)  _getkeys:(b4i_b4xorderedmap*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"getkeys"])
	 {return ((B4IList*) [B4IDebug delegate:self.bi :@"getkeys" :nil]);}
B4IRDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub getKeys As List";
B4IRDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Return list";
if (true) return __ref->__list /*B4IList**/ ;
B4IRDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="End Sub";
return nil;
}
- (int)  _getsize:(b4i_b4xorderedmap*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"getsize"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getsize" :nil]).intValue;}
B4IRDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub getSize As Int";
B4IRDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Return map.Size";
if (true) return [__ref->__map /*B4IMap**/  Size];
B4IRDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="End Sub";
return 0;
}
- (B4IList*)  _getvalues:(b4i_b4xorderedmap*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"getvalues"])
	 {return ((B4IList*) [B4IDebug delegate:self.bi :@"getvalues" :nil]);}
B4IList* _res = nil;
NSObject* _key = nil;
B4IRDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub getValues As List";
B4IRDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Dim res As List";
_res = [B4IList new];
B4IRDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="res.Initialize";
[_res Initialize];
B4IRDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="For Each key As Object In list";
{
const id<B4IIterable> group3 = __ref->__list /*B4IList**/ ;
const int groupLen3 = group3.Size
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = [group3 Get:index3];
B4IRDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="res.Add(map.Get(key))";
[_res Add:[__ref->__map /*B4IMap**/  Get:_key]];
 }
};
B4IRDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="Return res";
if (true) return _res;
B4IRDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _remove:(b4i_b4xorderedmap*) __ref :(NSObject*) _key{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"remove"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"remove:" :@[[B4I nilToNSNull:_key]]]);}
B4IRDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub Remove (Key As Object)";
B4IRDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="If map.ContainsKey(Key) = False Then Return";
if ([__ref->__map /*B4IMap**/  ContainsKey:_key]==false) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="list.RemoveAt(list.IndexOf(Key))";
[__ref->__list /*B4IList**/  RemoveAt:[__ref->__list /*B4IList**/  IndexOf:_key]];
B4IRDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="map.Remove(Key)";
[__ref->__map /*B4IMap**/  Remove:_key];
B4IRDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setdatafromserializator:(b4i_b4xorderedmap*) __ref :(NSObject*) _data{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xorderedmap";
if ([B4IDebug shouldDelegate: @"setdatafromserializator"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setdatafromserializator:" :@[[B4I nilToNSNull:_data]]]);}
B4IArray* _o = nil;
B4IRDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Public Sub SetDataFromSerializator (Data As Object";
B4IRDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Dim o() As Object = Data";
_o = (B4IArray*)(_data);
B4IRDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="map = o(0)";
__ref->__map /*B4IMap**/  = (B4IMap*)(((NSObject*)[_o getObjectFast:(int) (0)]));
B4IRDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="list = o(1)";
__ref->__list /*B4IList**/  = (B4IList*) [B4IObjectWrapper createWrapper:[B4IList new] object:(NSArray*)(((NSObject*)[_o getObjectFast:(int) (1)]))];
B4IRDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="End Sub";
return @"";
}
@end