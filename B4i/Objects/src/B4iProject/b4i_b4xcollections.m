
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
        shared.bi = [[B4I alloc] init:shared];
        shared.__c = [B4ICommon new];
    }
    return shared;
}

- (b4i_b4xbitset*)  _createbitset:(int) _size{
b4i_b4xbitset* _s = nil;
 //BA.debugLineNum = 52;BA.debugLine="Public Sub CreateBitSet (Size As Int) As B4XBitSet";
 //BA.debugLineNum = 53;BA.debugLine="Dim s As B4XBitSet";
_s = [b4i_b4xbitset new];
 //BA.debugLineNum = 54;BA.debugLine="s.Initialize(Size)";
[_s _initialize /*NSString**/ :self.bi :_size];
 //BA.debugLineNum = 55;BA.debugLine="Return s";
if (true) return _s;
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return nil;
}
- (b4i_b4xorderedmap*)  _createorderedmap{
 //BA.debugLineNum = 30;BA.debugLine="Public Sub CreateOrderedMap As B4XOrderedMap";
 //BA.debugLineNum = 31;BA.debugLine="Return CreateOrderedMap2(Null, Null)";
if (true) return [self _createorderedmap2:(B4IList*) [B4IObjectWrapper createWrapper:[B4IList new] object:(NSArray*)(nil)] :(B4IList*) [B4IObjectWrapper createWrapper:[B4IList new] object:(NSArray*)(nil)]];
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return nil;
}
- (b4i_b4xorderedmap*)  _createorderedmap2:(B4IList*) _keys :(B4IList*) _values{
b4i_b4xorderedmap* _m = nil;
int _i = 0;
 //BA.debugLineNum = 38;BA.debugLine="Public Sub CreateOrderedMap2 (Keys As List, Values";
 //BA.debugLineNum = 39;BA.debugLine="Dim m As B4XOrderedMap";
_m = [b4i_b4xorderedmap new];
 //BA.debugLineNum = 40;BA.debugLine="m.Initialize";
[_m _initialize /*NSString**/ :self.bi];
 //BA.debugLineNum = 41;BA.debugLine="If Keys <> Null And Values <> Null And Keys.IsIni";
if (_keys!= nil && _values!= nil && [_keys IsInitialized] && [_values IsInitialized]) { 
 //BA.debugLineNum = 42;BA.debugLine="For i = 0 To Keys.Size - 1";
{
const int step4 = 1;
const int limit4 = (int) ([_keys Size]-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 43;BA.debugLine="m.Put(Keys.Get(i), Values.Get(i))";
[_m _put /*NSString**/ :[_keys Get:_i] :[_values Get:_i]];
 }
};
 };
 //BA.debugLineNum = 46;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return nil;
}
- (b4i_b4xset*)  _createset{
 //BA.debugLineNum = 9;BA.debugLine="Public Sub CreateSet As B4XSet";
 //BA.debugLineNum = 10;BA.debugLine="Return CreateSet2(Null)";
if (true) return [self _createset2:(B4IList*) [B4IObjectWrapper createWrapper:[B4IList new] object:(NSArray*)(nil)]];
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return nil;
}
- (b4i_b4xset*)  _createset2:(B4IList*) _values{
b4i_b4xset* _s = nil;
NSObject* _v = nil;
 //BA.debugLineNum = 16;BA.debugLine="Public Sub CreateSet2 (Values As List) As B4XSet";
 //BA.debugLineNum = 17;BA.debugLine="Dim s As B4XSet";
_s = [b4i_b4xset new];
 //BA.debugLineNum = 18;BA.debugLine="s.Initialize";
[_s _initialize /*NSString**/ :self.bi];
 //BA.debugLineNum = 19;BA.debugLine="If Values <> Null And Values.IsInitialized Then";
if (_values!= nil && [_values IsInitialized]) { 
 //BA.debugLineNum = 20;BA.debugLine="For Each v As Object In Values";
{
const id<B4IIterable> group4 = _values;
const int groupLen4 = group4.Size
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v = [group4 Get:index4];
 //BA.debugLineNum = 21;BA.debugLine="s.Add(v)";
[_s _add /*NSString**/ :_v];
 }
};
 };
 //BA.debugLineNum = 24;BA.debugLine="Return s";
if (true) return _s;
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _process_globals{
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return @"";
}
@end
