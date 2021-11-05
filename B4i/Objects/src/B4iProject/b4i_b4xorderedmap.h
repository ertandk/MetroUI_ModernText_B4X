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
@class b4i_b4xset;
@class b4i_b4xpagesdelegator;
@class _b4xpageparent;
@class _b4xpageinfo;
@class b4i_b4xpagesmanager;
@interface b4i_b4xorderedmap : B4IClass
{
@public B4IMap* __map;
@public B4IList* __list;
@public b4i_main* __main;
@public b4i_b4xpages* __b4xpages;
@public b4i_b4xcollections* __b4xcollections;

}- (NSString*)  _class_globals;
@property (nonatomic)B4IMap* _map;
@property (nonatomic)B4IList* _list;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_b4xpages* _b4xpages;
@property (nonatomic)b4i_b4xcollections* _b4xcollections;
- (NSString*)  _clear;
- (BOOL)  _containskey:(NSObject*) _key;
- (NSObject*)  _get:(NSObject*) _key;
- (NSObject*)  _getdataforserializator;
- (NSObject*)  _getdefault:(NSObject*) _key :(NSObject*) _defaultvalue;
- (B4IList*)  _getkeys;
- (int)  _getsize;
- (B4IList*)  _getvalues;
- (NSString*)  _initialize:(B4I*) _ba;
- (NSString*)  _put:(NSObject*) _key :(NSObject*) _value;
- (NSString*)  _remove:(NSObject*) _key;
- (NSString*)  _setdatafromserializator:(NSObject*) _data;
@end
