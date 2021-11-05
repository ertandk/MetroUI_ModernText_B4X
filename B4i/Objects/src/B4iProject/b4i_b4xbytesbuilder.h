#import "iCore.h"
#import "iSVG.h"
#import "iXUI.h"
@class b4i_main;
@class b4i_b4xpages;
@class b4i_b4xcollections;
@class b4i_b4xmainpage;
@class b4i_metroui_moderntext;
@class b4i_b4xbitset;
@class b4i_b4xorderedmap;
@class b4i_b4xset;
@class b4i_b4xpagesdelegator;
@class _b4xpageparent;
@class _b4xpageinfo;
@class b4i_b4xpagesmanager;
@interface b4i_b4xbytesbuilder : B4IClass
{
@public B4IArray* __mbuffer;
@public int __mlength;
@public b4i_main* __main;
@public b4i_b4xpages* __b4xpages;
@public b4i_b4xcollections* __b4xcollections;

}- (b4i_b4xbytesbuilder*)  _append:(B4IArray*) _data;
- (b4i_b4xbytesbuilder*)  _append2:(B4IArray*) _data :(int) _startindex :(int) _length;
- (int)  _changelength:(int) _newlength;
- (NSString*)  _class_globals;
@property (nonatomic)B4IArray* _mbuffer;
@property (nonatomic)int _mlength;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_b4xpages* _b4xpages;
@property (nonatomic)b4i_b4xcollections* _b4xcollections;
- (NSString*)  _clear;
- (B4IArray*)  _getinternalbuffer;
- (int)  _getlength;
- (int)  _indexof:(B4IArray*) _searchfor;
- (int)  _indexof2:(B4IArray*) _searchfor :(int) _index;
- (NSString*)  _initialize:(B4I*) _ba;
- (NSString*)  _insert:(int) _index :(B4IArray*) _data;
- (B4IArray*)  _remove:(int) _beginindex :(int) _endindex;
- (NSString*)  _set:(int) _index :(B4IArray*) _data;
- (B4IArray*)  _subarray:(int) _beginindex;
- (B4IArray*)  _subarray2:(int) _beginindex :(int) _endindex;
- (B4IArray*)  _toarray;
@end
