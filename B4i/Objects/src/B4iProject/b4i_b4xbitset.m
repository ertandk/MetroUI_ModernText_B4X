
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
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xbitset) instance released.");
}

- (NSString*)  _class_globals:(b4i_b4xbitset*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
B4IRDebugUtils.currentModule=@"b4xbitset";
B4IRDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Private data() As Byte";
self->__data = [[B4IArray alloc]initBytes:@[@((int) (0))]];
B4IRDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="Private mSize As Int";
self->__msize = 0;
B4IRDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _clear:(b4i_b4xbitset*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbitset";
if ([B4IDebug shouldDelegate: @"clear"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"clear" :nil]);}
B4IRDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub Clear";
B4IRDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="Dim data(4 * (Bit.ShiftRight(mSize, 5) + 1)) As B";
self->__data = [[B4IArray alloc]initBytes:@[@((int) (4*(((__ref->__msize /*int*/ ) >> ((int) (5)))+1)))]];
B4IRDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _get:(b4i_b4xbitset*) __ref :(int) _index{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbitset";
if ([B4IDebug shouldDelegate: @"get"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"get:" :@[@(_index)]]).boolValue;}
int _dindex = 0;
int _offset = 0;
int _blockvalue = 0;
B4IRDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub Get(Index As Int) As Boolean";
B4IRDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Dim dindex As Int = Bit.ShiftRight(Index, 5)";
_dindex = ((_index) >> ((int) (5)));
B4IRDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Dim offset As Int = Bit.And(0x0000001f, Index)";
_offset = ((((int)0x0000001f)) & (_index));
B4IRDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="Dim BlockValue As Int = Bit.FastArrayGetInt(data,";
_blockvalue = (((int*)((__ref->__data /*B4IArray**/ )->internalBuffer))[_dindex]);
B4IRDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="Return Bit.And(BlockValue, Bit.ShiftLeft(1, offse";
if (true) return ((_blockvalue) & ((((int) (1)) << (_offset))))!=0;
B4IRDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="End Sub";
return false;
}
- (int)  _getsize:(b4i_b4xbitset*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbitset";
if ([B4IDebug shouldDelegate: @"getsize"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getsize" :nil]).intValue;}
B4IRDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub getSize As Int";
B4IRDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Return mSize";
if (true) return __ref->__msize /*int*/ ;
B4IRDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _initialize:(b4i_b4xbitset*) __ref :(B4I*) _ba :(int) _size{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xbitset";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize::" :@[[B4I nilToNSNull:_ba],@(_size)]]);}
B4IRDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub Initialize (Size As Int)";
B4IRDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="mSize = Size";
__ref->__msize /*int*/  = _size;
B4IRDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Clear";
[__ref _clear /*NSString**/ :nil];
B4IRDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _set:(b4i_b4xbitset*) __ref :(int) _index :(BOOL) _value{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbitset";
if ([B4IDebug shouldDelegate: @"set"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"set::" :@[@(_index),@(_value)]]);}
int _dindex = 0;
int _offset = 0;
int _blockvalue = 0;
int _newblockvalue = 0;
B4IRDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub Set(Index As Int, Value As Boolean)";
B4IRDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Dim dindex As Int = Bit.ShiftRight(Index, 5)";
_dindex = ((_index) >> ((int) (5)));
B4IRDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Dim offset As Int = Bit.And(0x0000001f, Index)";
_offset = ((((int)0x0000001f)) & (_index));
B4IRDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="Dim BlockValue As Int = Bit.FastArrayGetInt(data,";
_blockvalue = (((int*)((__ref->__data /*B4IArray**/ )->internalBuffer))[_dindex]);
B4IRDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="Dim NewBlockValue As Int";
_newblockvalue = 0;
B4IRDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="If Value Then";
if (_value) { 
B4IRDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="NewBlockValue = Bit.Or(BlockValue, Bit.ShiftLeft";
_newblockvalue = ((_blockvalue) | ((((int) (1)) << (_offset))));
 }else {
B4IRDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="NewBlockValue = Bit.And(BlockValue, Bit.Not(Bit.";
_newblockvalue = ((_blockvalue) & ((~((((int) (1)) << (_offset))))));
 };
B4IRDebugUtils.currentLine=2752527;
 //BA.debugLineNum = 2752527;BA.debugLine="Bit.FastArraySetInt(data, dindex, NewBlockValue)";
((int*)((__ref->__data /*B4IArray**/ )->internalBuffer))[_dindex] = (_newblockvalue);
B4IRDebugUtils.currentLine=2752531;
 //BA.debugLineNum = 2752531;BA.debugLine="End Sub";
return @"";
}
@end