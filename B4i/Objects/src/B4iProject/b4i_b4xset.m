
#import "b4i_b4xset.h"
#import "b4i_main.h"
#import "b4i_b4xmainpage.h"
#import "b4i_metroui_moderntext.h"
#import "b4i_b4xpages.h"
#import "b4i_b4xbitset.h"
#import "b4i_b4xbytesbuilder.h"
#import "b4i_b4xcollections.h"
#import "b4i_b4xorderedmap.h"
#import "b4i_b4xpagesdelegator.h"
#import "b4i_b4xpagesmanager.h"


@implementation b4i_b4xset 


+ (B4I*)createBI {
    return [B4I alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xset) instance released.");
}
- (NSString*)  _add:(NSObject*) _value{
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Add(Value As Object)";
 //BA.debugLineNum = 10;BA.debugLine="map.Put(Value, \"\")";
[self->__map _put /*NSString**/ :_value :(NSObject*)(@"")];
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return @"";
}
- (B4IList*)  _aslist{
 //BA.debugLineNum = 29;BA.debugLine="Public Sub AsList As List";
 //BA.debugLineNum = 30;BA.debugLine="Return map.Keys";
if (true) return [self->__map _getkeys /*B4IList**/ ];
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _class_globals{
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private map As B4XOrderedMap";
self->__map = [b4i_b4xorderedmap new];
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _clear{
 //BA.debugLineNum = 25;BA.debugLine="Public Sub Clear";
 //BA.debugLineNum = 26;BA.debugLine="map.Clear";
[self->__map _clear /*NSString**/ ];
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _contains:(NSObject*) _value{
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Contains (Value As Object) As Boolean";
 //BA.debugLineNum = 18;BA.debugLine="Return map.ContainsKey(Value)";
if (true) return [self->__map _containskey /*BOOL*/ :_value];
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return false;
}
- (int)  _getsize{
 //BA.debugLineNum = 21;BA.debugLine="Public Sub getSize As Int";
 //BA.debugLineNum = 22;BA.debugLine="Return map.Size";
if (true) return [self->__map _getsize /*int*/ ];
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _initialize:(B4I*) _ba{
[self initializeClassModule];
 //BA.debugLineNum = 5;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 6;BA.debugLine="map.Initialize";
[self->__map _initialize /*NSString**/ :self.bi];
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _remove:(NSObject*) _value{
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Remove(Value As Object)";
 //BA.debugLineNum = 14;BA.debugLine="map.Remove(Value)";
[self->__map _remove /*NSString**/ :_value];
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return @"";
}
@end
