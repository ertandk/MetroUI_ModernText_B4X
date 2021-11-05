
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
    return [B4I alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xorderedmap) instance released.");
}
- (NSString*)  _class_globals{
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private map As Map";
self->__map = [B4IMap new];
 //BA.debugLineNum = 3;BA.debugLine="Private list As List";
self->__list = [B4IList new];
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _clear{
 //BA.debugLineNum = 26;BA.debugLine="Public Sub Clear";
 //BA.debugLineNum = 27;BA.debugLine="list.Clear";
[self->__list Clear];
 //BA.debugLineNum = 28;BA.debugLine="map.Clear";
[self->__map Clear];
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _containskey:(NSObject*) _key{
 //BA.debugLineNum = 46;BA.debugLine="Public Sub ContainsKey (Key As Object) As Boolean";
 //BA.debugLineNum = 47;BA.debugLine="Return map.ContainsKey(Key)";
if (true) return [self->__map ContainsKey:_key];
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return false;
}
- (NSObject*)  _get:(NSObject*) _key{
 //BA.debugLineNum = 37;BA.debugLine="Public Sub Get (Key As Object) As Object";
 //BA.debugLineNum = 38;BA.debugLine="Return map.Get(Key)";
if (true) return [self->__map Get:_key];
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return nil;
}
- (NSObject*)  _getdataforserializator{
 //BA.debugLineNum = 65;BA.debugLine="Public Sub GetDataForSerializator As Object";
 //BA.debugLineNum = 66;BA.debugLine="Return Array(map, list)";
if (true) return (NSObject*)([[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(self->__map)],[B4I nilToNSNull:(NSObject*)((self->__list).object)]]]);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return nil;
}
- (NSObject*)  _getdefault:(NSObject*) _key :(NSObject*) _defaultvalue{
 //BA.debugLineNum = 42;BA.debugLine="Public Sub GetDefault (Key As Object, DefaultValue";
 //BA.debugLineNum = 43;BA.debugLine="Return map.GetDefault(Key, DefaultValue)";
if (true) return [self->__map GetDefault:_key :_defaultvalue];
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return nil;
}
- (B4IList*)  _getkeys{
 //BA.debugLineNum = 32;BA.debugLine="Public Sub getKeys As List";
 //BA.debugLineNum = 33;BA.debugLine="Return list";
if (true) return self->__list;
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return nil;
}
- (int)  _getsize{
 //BA.debugLineNum = 50;BA.debugLine="Public Sub getSize As Int";
 //BA.debugLineNum = 51;BA.debugLine="Return map.Size";
if (true) return [self->__map Size];
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return 0;
}
- (B4IList*)  _getvalues{
B4IList* _res = nil;
NSObject* _key = nil;
 //BA.debugLineNum = 55;BA.debugLine="Public Sub getValues As List";
 //BA.debugLineNum = 56;BA.debugLine="Dim res As List";
_res = [B4IList new];
 //BA.debugLineNum = 57;BA.debugLine="res.Initialize";
[_res Initialize];
 //BA.debugLineNum = 58;BA.debugLine="For Each key As Object In list";
{
const id<B4IIterable> group3 = self->__list;
const int groupLen3 = group3.Size
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = [group3 Get:index3];
 //BA.debugLineNum = 59;BA.debugLine="res.Add(map.Get(key))";
[_res Add:[self->__map Get:_key]];
 }
};
 //BA.debugLineNum = 61;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _initialize:(B4I*) _ba{
[self initializeClassModule];
 //BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 7;BA.debugLine="map.Initialize";
[self->__map Initialize];
 //BA.debugLineNum = 8;BA.debugLine="list.Initialize";
[self->__list Initialize];
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _put:(NSObject*) _key :(NSObject*) _value{
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Put (Key As Object, Value As Object)";
 //BA.debugLineNum = 13;BA.debugLine="If map.ContainsKey(Key) = False Then";
if ([self->__map ContainsKey:_key]==false) { 
 //BA.debugLineNum = 14;BA.debugLine="list.Add(Key)";
[self->__list Add:_key];
 };
 //BA.debugLineNum = 16;BA.debugLine="map.Put(Key, Value)";
[self->__map Put:_key :_value];
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _remove:(NSObject*) _key{
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Remove (Key As Object)";
 //BA.debugLineNum = 21;BA.debugLine="If map.ContainsKey(Key) = False Then Return";
if ([self->__map ContainsKey:_key]==false) { 
if (true) return @"";};
 //BA.debugLineNum = 22;BA.debugLine="list.RemoveAt(list.IndexOf(Key))";
[self->__list RemoveAt:[self->__list IndexOf:_key]];
 //BA.debugLineNum = 23;BA.debugLine="map.Remove(Key)";
[self->__map Remove:_key];
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setdatafromserializator:(NSObject*) _data{
B4IArray* _o = nil;
 //BA.debugLineNum = 70;BA.debugLine="Public Sub SetDataFromSerializator (Data As Object";
 //BA.debugLineNum = 71;BA.debugLine="Dim o() As Object = Data";
_o = (B4IArray*)(_data);
 //BA.debugLineNum = 72;BA.debugLine="map = o(0)";
self->__map = (B4IMap*)(((NSObject*)[_o getObjectFast:(int) (0)]));
 //BA.debugLineNum = 73;BA.debugLine="list = o(1)";
self->__list = (B4IList*) [B4IObjectWrapper createWrapper:[B4IList new] object:(NSArray*)(((NSObject*)[_o getObjectFast:(int) (1)]))];
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return @"";
}
@end
