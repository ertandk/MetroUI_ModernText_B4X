#import "iCore.h"
#import "iSVG.h"
#import "iXUI.h"
@class b4i_main;
@class b4i_b4xpages;
@class b4i_b4xcollections;
@class b4i_b4xmainpage;
@class b4i_metroui_moderntext;
@class b4i_b4xbytesbuilder;
@class b4i_b4xorderedmap;
@class b4i_b4xset;
@class b4i_b4xpagesdelegator;
@class _b4xpageparent;
@class _b4xpageinfo;
@class b4i_b4xpagesmanager;
@interface b4i_b4xbitset : B4IClass
{
@public B4IArray* __data;
@public int __msize;
@public b4i_main* __main;
@public b4i_b4xpages* __b4xpages;
@public b4i_b4xcollections* __b4xcollections;

}- (NSString*)  _class_globals;
@property (nonatomic)B4IArray* _data;
@property (nonatomic)int _msize;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_b4xpages* _b4xpages;
@property (nonatomic)b4i_b4xcollections* _b4xcollections;
- (NSString*)  _clear;
- (BOOL)  _get:(int) _index;
- (int)  _getsize;
- (NSString*)  _initialize:(B4I*) _ba :(int) _size;
- (NSString*)  _set:(int) _index :(BOOL) _value;
@end
