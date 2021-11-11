
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
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xset) instance released.");
}

- (NSString*)  _initialize:(b4i_b4xset*) __ref :(B4I*) _ba{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xset";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:" :@[[B4I nilToNSNull:_ba]]]);}
B4IRDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub Initialize";
B4IRDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="map.Initialize";
[__ref->__map /*b4i_b4xorderedmap**/  _initialize /*NSString**/ :nil :self.bi];
B4IRDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _add:(b4i_b4xset*) __ref :(NSObject*) _value{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xset";
if ([B4IDebug shouldDelegate: @"add"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"add:" :@[[B4I nilToNSNull:_value]]]);}
B4IRDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Public Sub Add(Value As Object)";
B4IRDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="map.Put(Value, \"\")";
[__ref->__map /*b4i_b4xorderedmap**/  _put /*NSString**/ :nil :_value :(NSObject*)(@"")];
B4IRDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="End Sub";
return @"";
}
- (B4IList*)  _aslist:(b4i_b4xset*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xset";
if ([B4IDebug shouldDelegate: @"aslist"])
	 {return ((B4IList*) [B4IDebug delegate:self.bi :@"aslist" :nil]);}
B4IRDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Public Sub AsList As List";
B4IRDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="Return map.Keys";
if (true) return [__ref->__map /*b4i_b4xorderedmap**/  _getkeys /*B4IList**/ :nil];
B4IRDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _class_globals:(b4i_b4xset*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
B4IRDebugUtils.currentModule=@"b4xset";
B4IRDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Private map As B4XOrderedMap";
self->__map = [b4i_b4xorderedmap new];
B4IRDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _clear:(b4i_b4xset*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xset";
if ([B4IDebug shouldDelegate: @"clear"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"clear" :nil]);}
B4IRDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Public Sub Clear";
B4IRDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="map.Clear";
[__ref->__map /*b4i_b4xorderedmap**/  _clear /*NSString**/ :nil];
B4IRDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _contains:(b4i_b4xset*) __ref :(NSObject*) _value{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xset";
if ([B4IDebug shouldDelegate: @"contains"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"contains:" :@[[B4I nilToNSNull:_value]]]).boolValue;}
B4IRDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Public Sub Contains (Value As Object) As Boolean";
B4IRDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Return map.ContainsKey(Value)";
if (true) return [__ref->__map /*b4i_b4xorderedmap**/  _containskey /*BOOL*/ :nil :_value];
B4IRDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="End Sub";
return false;
}
- (int)  _getsize:(b4i_b4xset*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xset";
if ([B4IDebug shouldDelegate: @"getsize"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getsize" :nil]).intValue;}
B4IRDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Public Sub getSize As Int";
B4IRDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="Return map.Size";
if (true) return [__ref->__map /*b4i_b4xorderedmap**/  _getsize /*int*/ :nil];
B4IRDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _remove:(b4i_b4xset*) __ref :(NSObject*) _value{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xset";
if ([B4IDebug shouldDelegate: @"remove"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"remove:" :@[[B4I nilToNSNull:_value]]]);}
B4IRDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Public Sub Remove(Value As Object)";
B4IRDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="map.Remove(Value)";
[__ref->__map /*b4i_b4xorderedmap**/  _remove /*NSString**/ :nil :_value];
B4IRDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="End Sub";
return @"";
}
@end