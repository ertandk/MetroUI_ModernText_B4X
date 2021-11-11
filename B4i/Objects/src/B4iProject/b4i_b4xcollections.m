
#import "b4i_b4xcollections.h"
#import "b4i_main.h"
#import "b4i_b4xmainpage.h"
#import "b4i_metroui_moderntext.h"
#import "b4i_b4xpages.h"
#import "b4i_b4xbitset.h"
#import "b4i_b4xbytesbuilder.h"
#import "b4i_b4xorderedmap.h"
#import "b4i_b4xset.h"
#import "b4i_b4xpagesdelegator.h"
#import "b4i_b4xpagesmanager.h"


@implementation b4i_b4xcollections 


+ (instancetype)new {
    static b4i_b4xcollections* shared = nil;
    if (shared == nil) {
        shared = [self alloc];
        shared.bi = [[B4IShellBI alloc] init:shared];
        shared.__c = [B4ICommon new];
    }
    return shared;
}
- (int)debugAppId {
    return 14;
}


- (b4i_b4xbitset*)  _createbitset:(int) _size{
B4IRDebugUtils.currentModule=@"b4xcollections";
if ([B4IDebug shouldDelegate: @"createbitset"])
	 {return ((b4i_b4xbitset*) [B4IDebug delegate:self.bi :@"createbitset:" :@[@(_size)]]);}
b4i_b4xbitset* _s = nil;
B4IRDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub CreateBitSet (Size As Int) As B4XBitSet";
B4IRDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Dim s As B4XBitSet";
_s = [b4i_b4xbitset new];
B4IRDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="s.Initialize(Size)";
[_s _initialize /*NSString**/ :nil :self.bi :_size];
B4IRDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="Return s";
if (true) return _s;
B4IRDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="End Sub";
return nil;
}
- (b4i_b4xorderedmap*)  _createorderedmap{
B4IRDebugUtils.currentModule=@"b4xcollections";
if ([B4IDebug shouldDelegate: @"createorderedmap"])
	 {return ((b4i_b4xorderedmap*) [B4IDebug delegate:self.bi :@"createorderedmap" :nil]);}
B4IRDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub CreateOrderedMap As B4XOrderedMap";
B4IRDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Return CreateOrderedMap2(Null, Null)";
if (true) return [self _createorderedmap2:(B4IList*) [B4IObjectWrapper createWrapper:[B4IList new] object:(NSArray*)(nil)] :(B4IList*) [B4IObjectWrapper createWrapper:[B4IList new] object:(NSArray*)(nil)]];
B4IRDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="End Sub";
return nil;
}
- (b4i_b4xorderedmap*)  _createorderedmap2:(B4IList*) _keys :(B4IList*) _values{
B4IRDebugUtils.currentModule=@"b4xcollections";
if ([B4IDebug shouldDelegate: @"createorderedmap2"])
	 {return ((b4i_b4xorderedmap*) [B4IDebug delegate:self.bi :@"createorderedmap2::" :@[[B4I nilToNSNull:_keys],[B4I nilToNSNull:_values]]]);}
b4i_b4xorderedmap* _m = nil;
int _i = 0;
B4IRDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub CreateOrderedMap2 (Keys As List, Values";
B4IRDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Dim m As B4XOrderedMap";
_m = [b4i_b4xorderedmap new];
B4IRDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="m.Initialize";
[_m _initialize /*NSString**/ :nil :self.bi];
B4IRDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="If Keys <> Null And Values <> Null And Keys.IsIni";
if (_keys!= nil && _values!= nil && [_keys IsInitialized] && [_values IsInitialized]) { 
B4IRDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="For i = 0 To Keys.Size - 1";
{
const int step4 = 1;
const int limit4 = (int) ([_keys Size]-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
B4IRDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="m.Put(Keys.Get(i), Values.Get(i))";
[_m _put /*NSString**/ :nil :[_keys Get:_i] :[_values Get:_i]];
 }
};
 };
B4IRDebugUtils.currentLine=4325384;
 //BA.debugLineNum = 4325384;BA.debugLine="Return m";
if (true) return _m;
B4IRDebugUtils.currentLine=4325385;
 //BA.debugLineNum = 4325385;BA.debugLine="End Sub";
return nil;
}
- (b4i_b4xset*)  _createset{
B4IRDebugUtils.currentModule=@"b4xcollections";
if ([B4IDebug shouldDelegate: @"createset"])
	 {return ((b4i_b4xset*) [B4IDebug delegate:self.bi :@"createset" :nil]);}
B4IRDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub CreateSet As B4XSet";
B4IRDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Return CreateSet2(Null)";
if (true) return [self _createset2:(B4IList*) [B4IObjectWrapper createWrapper:[B4IList new] object:(NSArray*)(nil)]];
B4IRDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="End Sub";
return nil;
}
- (b4i_b4xset*)  _createset2:(B4IList*) _values{
B4IRDebugUtils.currentModule=@"b4xcollections";
if ([B4IDebug shouldDelegate: @"createset2"])
	 {return ((b4i_b4xset*) [B4IDebug delegate:self.bi :@"createset2:" :@[[B4I nilToNSNull:_values]]]);}
b4i_b4xset* _s = nil;
NSObject* _v = nil;
B4IRDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub CreateSet2 (Values As List) As B4XSet";
B4IRDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Dim s As B4XSet";
_s = [b4i_b4xset new];
B4IRDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="s.Initialize";
[_s _initialize /*NSString**/ :nil :self.bi];
B4IRDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="If Values <> Null And Values.IsInitialized Then";
if (_values!= nil && [_values IsInitialized]) { 
B4IRDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="For Each v As Object In Values";
{
const id<B4IIterable> group4 = _values;
const int groupLen4 = group4.Size
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v = [group4 Get:index4];
B4IRDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="s.Add(v)";
[_s _add /*NSString**/ :nil :_v];
 }
};
 };
B4IRDebugUtils.currentLine=4194312;
 //BA.debugLineNum = 4194312;BA.debugLine="Return s";
if (true) return _s;
B4IRDebugUtils.currentLine=4194313;
 //BA.debugLineNum = 4194313;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _process_globals{
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
B4IRDebugUtils.currentModule=@"b4xcollections";
if ([B4IDebug shouldDelegate: @"process_globals"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);}
B4IRDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub Process_Globals";
B4IRDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="End Sub";
return @"";
}
@end