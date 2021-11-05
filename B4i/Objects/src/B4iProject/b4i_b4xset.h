#import "iCore.h"
#import "iSVG.h"
#import "iXUI.h"
@class b4i_main;
@class b4i_b4xpages;
@class b4i_b4xcollections;
@class b4i_b4xmainpage;
@class b4i_metroui_moderntext;
@class b4i_b4xbitset;
@class b4i_b4xbytesbuilder;
@class b4i_b4xorderedmap;
@class b4i_b4xpagesdelegator;
@class _b4xpageparent;
@class _b4xpageinfo;
@class b4i_b4xpagesmanager;
@interface b4i_b4xset : B4IClass
{
@public b4i_b4xorderedmap* __map;
@public b4i_main* __main;
@public b4i_b4xpages* __b4xpages;
@public b4i_b4xcollections* __b4xcollections;

}- (NSString*)  _add:(NSObject*) _value;
- (B4IList*)  _aslist;
- (NSString*)  _class_globals;
@property (nonatomic)b4i_b4xorderedmap* _map;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_b4xpages* _b4xpages;
@property (nonatomic)b4i_b4xcollections* _b4xcollections;
- (NSString*)  _clear;
- (BOOL)  _contains:(NSObject*) _value;
- (int)  _getsize;
- (NSString*)  _initialize:(B4I*) _ba;
- (NSString*)  _remove:(NSObject*) _value;
@end
