
#import "b4i_b4xbytesbuilder.h"
#import "b4i_main.h"
#import "b4i_b4xmainpage.h"
#import "b4i_metroui_moderntext.h"
#import "b4i_b4xpages.h"
#import "b4i_b4xbitset.h"
#import "b4i_b4xcollections.h"
#import "b4i_b4xorderedmap.h"
#import "b4i_b4xset.h"
#import "b4i_b4xpagesdelegator.h"
#import "b4i_b4xpagesmanager.h"


@implementation b4i_b4xbytesbuilder 


+ (B4I*)createBI {
    return [B4I alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xbytesbuilder) instance released.");
}
- (b4i_b4xbytesbuilder*)  _append:(B4IArray*) _data{
int _oldlength = 0;
 //BA.debugLineNum = 24;BA.debugLine="Public Sub Append(Data() As Byte) As B4XBytesBuild";
 //BA.debugLineNum = 25;BA.debugLine="Dim OldLength As Int = ChangeLength(mLength + Dat";
_oldlength = [self _changelength:(int) (self->__mlength+_data.Length)];
 //BA.debugLineNum = 26;BA.debugLine="Bit.ArrayCopy(Data, 0, mBuffer, OldLength, Data.L";
B4I_MEMCPY((_data)->internalBuffer + ((int) (0)), (self->__mbuffer)->internalBuffer + (_oldlength),_data.Length);
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4i_b4xbytesbuilder*)(self);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return nil;
}
- (b4i_b4xbytesbuilder*)  _append2:(B4IArray*) _data :(int) _startindex :(int) _length{
int _oldlength = 0;
 //BA.debugLineNum = 33;BA.debugLine="Public Sub Append2(Data() As Byte, StartIndex As I";
 //BA.debugLineNum = 34;BA.debugLine="Dim OldLength As Int = ChangeLength(mLength + Len";
_oldlength = [self _changelength:(int) (self->__mlength+_length)];
 //BA.debugLineNum = 35;BA.debugLine="Bit.ArrayCopy(Data, StartIndex, mBuffer, OldLengt";
B4I_MEMCPY((_data)->internalBuffer + (_startindex), (self->__mbuffer)->internalBuffer + (_oldlength),_length);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4i_b4xbytesbuilder*)(self);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return nil;
}
- (int)  _changelength:(int) _newlength{
int _oldlength = 0;
B4IArray* _b = nil;
 //BA.debugLineNum = 12;BA.debugLine="Private Sub ChangeLength (NewLength As Int) As Int";
 //BA.debugLineNum = 13;BA.debugLine="Dim OldLength As Int = mLength";
_oldlength = self->__mlength;
 //BA.debugLineNum = 14;BA.debugLine="mLength = NewLength";
self->__mlength = _newlength;
 //BA.debugLineNum = 15;BA.debugLine="If mBuffer.Length < mLength Then";
if (self->__mbuffer.Length<self->__mlength) { 
 //BA.debugLineNum = 16;BA.debugLine="Dim b(Max(mBuffer.Length * 2, NewLength)) As Byt";
_b = [[B4IArray alloc]initBytes:@[@((int) (fmax(self->__mbuffer.Length*2,_newlength)))]];
 //BA.debugLineNum = 17;BA.debugLine="Bit.ArrayCopy(mBuffer, 0, b, 0, mBuffer.Length)";
B4I_MEMCPY((self->__mbuffer)->internalBuffer + ((int) (0)), (_b)->internalBuffer + ((int) (0)),self->__mbuffer.Length);
 //BA.debugLineNum = 18;BA.debugLine="mBuffer = b";
self->__mbuffer = _b;
 };
 //BA.debugLineNum = 20;BA.debugLine="Return OldLength";
if (true) return _oldlength;
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _class_globals{
self->__main=[b4i_main new];
self->__b4xpages=[b4i_b4xpages new];
self->__b4xcollections=[b4i_b4xcollections new];
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private mBuffer() As Byte";
self->__mbuffer = [[B4IArray alloc]initBytes:@[@((int) (0))]];
 //BA.debugLineNum = 3;BA.debugLine="Private mLength As Int";
self->__mlength = 0;
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _clear{
 //BA.debugLineNum = 39;BA.debugLine="Public Sub Clear";
 //BA.debugLineNum = 40;BA.debugLine="ChangeLength(0)";
[self _changelength:(int) (0)];
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return @"";
}
- (B4IArray*)  _getinternalbuffer{
 //BA.debugLineNum = 104;BA.debugLine="Public Sub getInternalBuffer As Byte()";
 //BA.debugLineNum = 105;BA.debugLine="Return mBuffer";
if (true) return self->__mbuffer;
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return nil;
}
- (int)  _getlength{
 //BA.debugLineNum = 94;BA.debugLine="Public Sub getLength As Int";
 //BA.debugLineNum = 95;BA.debugLine="Return mLength";
if (true) return self->__mlength;
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return 0;
}
- (int)  _indexof:(B4IArray*) _searchfor{
 //BA.debugLineNum = 109;BA.debugLine="Public Sub IndexOf(SearchFor() As Byte) As Int";
 //BA.debugLineNum = 110;BA.debugLine="Return IndexOf2(SearchFor, 0)";
if (true) return [self _indexof2:_searchfor :(int) (0)];
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return 0;
}
- (int)  _indexof2:(B4IArray*) _searchfor :(int) _index{
int _i1 = 0;
int _i2 = 0;
 //BA.debugLineNum = 114;BA.debugLine="Public Sub IndexOf2(SearchFor() As Byte, Index As";
 //BA.debugLineNum = 115;BA.debugLine="For i1 = Index To mLength - SearchFor.Length";
{
const int step1 = 1;
const int limit1 = (int) (self->__mlength-_searchfor.Length);
_i1 = _index ;
for (;_i1 <= limit1 ;_i1 = _i1 + step1 ) {
 //BA.debugLineNum = 116;BA.debugLine="For i2 = 0 To SearchFor.Length - 1";
{
const int step2 = 1;
const int limit2 = (int) (_searchfor.Length-1);
_i2 = (int) (0) ;
for (;_i2 <= limit2 ;_i2 = _i2 + step2 ) {
 //BA.debugLineNum = 117;BA.debugLine="If SearchFor(i2) <> mBuffer(i1 + i2) Then";
if ([_searchfor getByteFast:_i2]!=[self->__mbuffer getByteFast:(int) (_i1+_i2)]) { 
 //BA.debugLineNum = 118;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 121;BA.debugLine="If i2 = SearchFor.Length Then";
if (_i2==_searchfor.Length) { 
 //BA.debugLineNum = 122;BA.debugLine="Return i1";
if (true) return _i1;
 };
 }
};
 //BA.debugLineNum = 125;BA.debugLine="Return -1";
if (true) return (int) (-1);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _initialize:(B4I*) _ba{
[self initializeClassModule];
 //BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 7;BA.debugLine="Dim mBuffer(100) As Byte";
self->__mbuffer = [[B4IArray alloc]initBytes:@[@((int) (100))]];
 //BA.debugLineNum = 8;BA.debugLine="mLength = 0";
self->__mlength = (int) (0);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _insert:(int) _index :(B4IArray*) _data{
B4IArray* _afterindex = nil;
 //BA.debugLineNum = 45;BA.debugLine="Public Sub Insert(Index As Int, Data() As Byte)";
 //BA.debugLineNum = 46;BA.debugLine="If Index >= mLength Then";
if (_index>=self->__mlength) { 
 //BA.debugLineNum = 47;BA.debugLine="If Index > mLength Then Log(\"Index too large\")";
if (_index>self->__mlength) { 
[self->___c LogImpl:@"93407874" :@"Index too large" :0];};
 //BA.debugLineNum = 48;BA.debugLine="Append(Data)";
[self _append:_data];
 }else {
 //BA.debugLineNum = 50;BA.debugLine="Dim AfterIndex() As Byte = SubArray(Index)";
_afterindex = [self _subarray:_index];
 //BA.debugLineNum = 51;BA.debugLine="ChangeLength(mLength + Data.Length)";
[self _changelength:(int) (self->__mlength+_data.Length)];
 //BA.debugLineNum = 52;BA.debugLine="Bit.ArrayCopy(Data, 0, mBuffer, Index, Data.Leng";
B4I_MEMCPY((_data)->internalBuffer + ((int) (0)), (self->__mbuffer)->internalBuffer + (_index),_data.Length);
 //BA.debugLineNum = 53;BA.debugLine="Bit.ArrayCopy(AfterIndex, 0, mBuffer, Index + Da";
B4I_MEMCPY((_afterindex)->internalBuffer + ((int) (0)), (self->__mbuffer)->internalBuffer + ((int) (_index+_data.Length)),_afterindex.Length);
 };
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return @"";
}
- (B4IArray*)  _remove:(int) _beginindex :(int) _endindex{
B4IArray* _res = nil;
B4IArray* _afterendindex = nil;
 //BA.debugLineNum = 71;BA.debugLine="Public Sub Remove(BeginIndex As Int, EndIndex As I";
 //BA.debugLineNum = 72;BA.debugLine="Dim res() As Byte = SubArray2(BeginIndex, EndInde";
_res = [self _subarray2:_beginindex :_endindex];
 //BA.debugLineNum = 73;BA.debugLine="If EndIndex <= mLength Then";
if (_endindex<=self->__mlength) { 
 //BA.debugLineNum = 74;BA.debugLine="Dim AfterEndIndex() As Byte = SubArray(EndIndex)";
_afterendindex = [self _subarray:_endindex];
 //BA.debugLineNum = 75;BA.debugLine="Bit.ArrayCopy(AfterEndIndex, 0, mBuffer, BeginIn";
B4I_MEMCPY((_afterendindex)->internalBuffer + ((int) (0)), (self->__mbuffer)->internalBuffer + (_beginindex),_afterendindex.Length);
 };
 //BA.debugLineNum = 77;BA.debugLine="ChangeLength(mLength - (EndIndex - BeginIndex))";
[self _changelength:(int) (self->__mlength-(_endindex-_beginindex))];
 //BA.debugLineNum = 78;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _set:(int) _index :(B4IArray*) _data{
 //BA.debugLineNum = 58;BA.debugLine="Public Sub Set(Index As Int, Data() As Byte)";
 //BA.debugLineNum = 59;BA.debugLine="If Index >= mLength Then";
if (_index>=self->__mlength) { 
 //BA.debugLineNum = 60;BA.debugLine="If Index > mLength Then Log(\"Index too large\")";
if (_index>self->__mlength) { 
[self->___c LogImpl:@"93473410" :@"Index too large" :0];};
 //BA.debugLineNum = 61;BA.debugLine="Append(Data)";
[self _append:_data];
 }else {
 //BA.debugLineNum = 63;BA.debugLine="If Data.Length + Index > mLength Then";
if (_data.Length+_index>self->__mlength) { 
 //BA.debugLineNum = 64;BA.debugLine="ChangeLength(Data.Length + Index)";
[self _changelength:(int) (_data.Length+_index)];
 };
 //BA.debugLineNum = 66;BA.debugLine="Bit.ArrayCopy(Data, 0, mBuffer, Index, Data.Leng";
B4I_MEMCPY((_data)->internalBuffer + ((int) (0)), (self->__mbuffer)->internalBuffer + (_index),_data.Length);
 };
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return @"";
}
- (B4IArray*)  _subarray:(int) _beginindex{
 //BA.debugLineNum = 82;BA.debugLine="Public Sub SubArray(BeginIndex As Int) As Byte()";
 //BA.debugLineNum = 83;BA.debugLine="Return SubArray2(BeginIndex, mLength)";
if (true) return [self _subarray2:_beginindex :self->__mlength];
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return nil;
}
- (B4IArray*)  _subarray2:(int) _beginindex :(int) _endindex{
B4IArray* _b = nil;
 //BA.debugLineNum = 88;BA.debugLine="Public Sub SubArray2(BeginIndex As Int, EndIndex A";
 //BA.debugLineNum = 89;BA.debugLine="Dim b(EndIndex - BeginIndex) As Byte";
_b = [[B4IArray alloc]initBytes:@[@((int) (_endindex-_beginindex))]];
 //BA.debugLineNum = 90;BA.debugLine="Bit.ArrayCopy(mBuffer, BeginIndex, b, 0, b.Length";
B4I_MEMCPY((self->__mbuffer)->internalBuffer + (_beginindex), (_b)->internalBuffer + ((int) (0)),_b.Length);
 //BA.debugLineNum = 91;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return nil;
}
- (B4IArray*)  _toarray{
 //BA.debugLineNum = 99;BA.debugLine="Public Sub ToArray() As Byte()";
 //BA.debugLineNum = 100;BA.debugLine="Return SubArray(0)";
if (true) return [self _subarray:(int) (0)];
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return nil;
}
@end
