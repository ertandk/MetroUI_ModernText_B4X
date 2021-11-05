
#import "b4i_b4xbitset.h"
#import "b4i_main.h"
#import "b4i_b4xmainpage.h"
#import "b4i_metroui_moderntext.h"
#import "b4i_b4xpages.h"
#import "b4i_b4xbytesbuilder.h"
#import "b4i_b4xcollections.h"
#import "b4i_b4xorderedmap.h"
#import "b4i_b4xset.h"
#import "b4i_b4xpagesdelegator.h"
#import "b4i_b4xpagesmanager.h"


@implementation b4i_b4xbitset 


+ (B4I*)createBI {
    return [B4I alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xbitset) instance released.");
}
- (NSString*)  _class_globals{
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private data() As Byte";
self->__data = [[B4IArray alloc]initBytes:@[@((int) (0))]];
 //BA.debugLineNum = 7;BA.debugLine="Private mSize As Int";
self->__msize = 0;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _clear{
 //BA.debugLineNum = 53;BA.debugLine="Public Sub Clear";
 //BA.debugLineNum = 55;BA.debugLine="Dim data(4 * (Bit.ShiftRight(mSize, 5) + 1)) As B";
self->__data = [[B4IArray alloc]initBytes:@[@((int) (4*(((self->__msize) >> ((int) (5)))+1)))]];
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _get:(int) _index{
int _dindex = 0;
int _offset = 0;
int _blockvalue = 0;
 //BA.debugLineNum = 38;BA.debugLine="Public Sub Get(Index As Int) As Boolean";
 //BA.debugLineNum = 39;BA.debugLine="Dim dindex As Int = Bit.ShiftRight(Index, 5)";
_dindex = ((_index) >> ((int) (5)));
 //BA.debugLineNum = 40;BA.debugLine="Dim offset As Int = Bit.And(0x0000001f, Index)";
_offset = ((((int)0x0000001f)) & (_index));
 //BA.debugLineNum = 42;BA.debugLine="Dim BlockValue As Int = Bit.FastArrayGetInt(data,";
_blockvalue = (((int*)((self->__data)->internalBuffer))[_dindex]);
 //BA.debugLineNum = 46;BA.debugLine="Return Bit.And(BlockValue, Bit.ShiftLeft(1, offse";
if (true) return ((_blockvalue) & ((((int) (1)) << (_offset))))!=0;
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return false;
}
- (int)  _getsize{
 //BA.debugLineNum = 49;BA.debugLine="Public Sub getSize As Int";
 //BA.debugLineNum = 50;BA.debugLine="Return mSize";
if (true) return self->__msize;
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _initialize:(B4I*) _ba :(int) _size{
[self initializeClassModule];
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize (Size As Int)";
 //BA.debugLineNum = 11;BA.debugLine="mSize = Size";
self->__msize = _size;
 //BA.debugLineNum = 12;BA.debugLine="Clear";
[self _clear];
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _set:(int) _index :(BOOL) _value{
int _dindex = 0;
int _offset = 0;
int _blockvalue = 0;
int _newblockvalue = 0;
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Set(Index As Int, Value As Boolean)";
 //BA.debugLineNum = 17;BA.debugLine="Dim dindex As Int = Bit.ShiftRight(Index, 5)";
_dindex = ((_index) >> ((int) (5)));
 //BA.debugLineNum = 18;BA.debugLine="Dim offset As Int = Bit.And(0x0000001f, Index)";
_offset = ((((int)0x0000001f)) & (_index));
 //BA.debugLineNum = 20;BA.debugLine="Dim BlockValue As Int = Bit.FastArrayGetInt(data,";
_blockvalue = (((int*)((self->__data)->internalBuffer))[_dindex]);
 //BA.debugLineNum = 24;BA.debugLine="Dim NewBlockValue As Int";
_newblockvalue = 0;
 //BA.debugLineNum = 25;BA.debugLine="If Value Then";
if (_value) { 
 //BA.debugLineNum = 26;BA.debugLine="NewBlockValue = Bit.Or(BlockValue, Bit.ShiftLeft";
_newblockvalue = ((_blockvalue) | ((((int) (1)) << (_offset))));
 }else {
 //BA.debugLineNum = 28;BA.debugLine="NewBlockValue = Bit.And(BlockValue, Bit.Not(Bit.";
_newblockvalue = ((_blockvalue) & ((~((((int) (1)) << (_offset))))));
 };
 //BA.debugLineNum = 31;BA.debugLine="Bit.FastArraySetInt(data, dindex, NewBlockValue)";
((int*)((self->__data)->internalBuffer))[_dindex] = (_newblockvalue);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return @"";
}
@end
