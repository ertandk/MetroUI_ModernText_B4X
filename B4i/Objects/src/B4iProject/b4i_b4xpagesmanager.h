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
@class b4i_b4xset;
@class b4i_b4xpagesdelegator;
@class _b4xpageparent;
@class _b4xpageinfo;
@interface b4i_b4xpagesmanager : B4IClass
{
@public b4i_b4xorderedmap* __idtob4xpage;
@public b4i_b4xorderedmap* __rootb4xtopage;
@public b4i_b4xset* __mstackofpageids;
@public B4IXUI* __xui;
@public B4INavigationControllerWrapper* __mmainform;
@public BOOL __isforeground;
@public int __transitionanimationduration;
@public b4i_b4xmainpage* __mainpage;
@public NSString* __stackstring;
@public BOOL __logevents;
@public b4i_main* __main;
@public b4i_b4xpages* __b4xpages;
@public b4i_b4xcollections* __b4xcollections;

}- (NSString*)  _activity_pause;
- (NSString*)  _activity_resume;
- (NSString*)  _addpage:(NSString*) _id :(NSObject*) _b4xpage;
- (NSString*)  _addpageandcreate:(NSString*) _id :(NSObject*) _b4xpage;
- (NSString*)  _b4ipage_appear;
- (NSString*)  _b4ipage_barbuttonclick:(NSString*) _tag;
- (NSString*)  _b4ipage_disappear;
- (NSString*)  _b4ipage_keyboardstatechanged:(float) _height;
- (NSString*)  _b4ipage_resize:(float) _width :(float) _height;
- (NSString*)  _backgroundstatechanged:(BOOL) _newstate;
- (NSString*)  _class_globals;
@property (nonatomic)b4i_b4xorderedmap* _idtob4xpage;
@property (nonatomic)b4i_b4xorderedmap* _rootb4xtopage;
@property (nonatomic)b4i_b4xset* _mstackofpageids;
@property (nonatomic)B4IXUI* _xui;
@property (nonatomic)B4INavigationControllerWrapper* _mmainform;
@property (nonatomic)BOOL _isforeground;
@property (nonatomic)int _transitionanimationduration;
@property (nonatomic)b4i_b4xmainpage* _mainpage;
@property (nonatomic)NSString* _stackstring;
@property (nonatomic)BOOL _logevents;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_b4xpages* _b4xpages;
@property (nonatomic)b4i_b4xcollections* _b4xcollections;
- (NSString*)  _closepage:(NSObject*) _b4xpage;
- (NSString*)  _closepageimpl:(_b4xpageinfo*) _pi;
- (_b4xpageinfo*)  _createb4xpageinfo:(NSObject*) _b4xpage :(NSString*) _id :(BOOL) _created :(NSObject*) _title;
- (_b4xpageparent*)  _createb4xpageparent:(B4IPage*) _nativetype;
- (NSString*)  _createpageifneeded:(_b4xpageinfo*) _pi;
- (NSString*)  _createpageimpl:(_b4xpageinfo*) _pi;
- (_b4xpageinfo*)  _findpifromb4xpage:(NSObject*) _page;
- (NSObject*)  _getpage:(NSString*) _id;
- (_b4xpageinfo*)  _getpagefromid:(NSString*) _id;
- (_b4xpageinfo*)  _getpageinfofromroot:(B4XViewWrapper*) _root;
- (_b4xpageinfo*)  _gettoppage;
- (NSString*)  _initialize:(B4I*) _ba :(B4INavigationControllerWrapper*) _navcontrol;
- (NSString*)  _logevent:(_b4xpageinfo*) _pi :(NSString*) _ev;
- (NSString*)  _mainform_resize:(double) _width :(double) _height;
- (NSString*)  _raiseevent:(_b4xpageinfo*) _targetpage :(NSString*) _subname :(B4IArray*) _params;
- (NSObject*)  _raiseeventwithresult:(_b4xpageinfo*) _targetpage :(NSString*) _subname :(B4IArray*) _params;
- (NSString*)  _settitle:(NSObject*) _b4xpage :(NSObject*) _title;
- (NSString*)  _showpage:(NSString*) _id;
- (NSString*)  _showpageandremovepreviouspages:(NSString*) _id;
- (NSString*)  _showpageimpl:(_b4xpageinfo*) _pi;
- (NSString*)  _toppageappear;
- (NSString*)  _toppagedisappear;
- (NSString*)  _updatestackstring;
@end
@interface _b4xpageparent:NSObject
{
@public BOOL _IsInitialized;
@public B4IPage* _NativeType;

}
@property (nonatomic)BOOL IsInitialized;
@property (nonatomic)B4IPage* NativeType;
-(void)Initialize;
@end
@interface _b4xpageinfo:NSObject
{
@public BOOL _IsInitialized;
@public NSObject* _B4XPage;
@public NSString* _Id;
@public BOOL _Created;
@public NSObject* _Title;
@public B4XViewWrapper* _Root;
@public BOOL _IsFirst;
@public _b4xpageparent* _Parent;

}
@property (nonatomic)BOOL IsInitialized;
@property (nonatomic)NSObject* B4XPage;
@property (nonatomic)NSString* Id;
@property (nonatomic)BOOL Created;
@property (nonatomic)NSObject* Title;
@property (nonatomic)B4XViewWrapper* Root;
@property (nonatomic)BOOL IsFirst;
@property (nonatomic)_b4xpageparent* Parent;
-(void)Initialize;
@end
