#import "iCore.h"
#import "iSVG.h"
#import "iRandomAccessFile.h"
#import "iXUI.h"
#import "iDebug2.h"
@class b4i_main;
@class b4i_b4xpages;
@class b4i_b4xcollections;
@class b4i_b4xmainpage;
@class b4i_b4xbitset;
@class b4i_b4xbytesbuilder;
@class b4i_b4xorderedmap;
@class b4i_b4xset;
@class b4i_b4xpagesdelegator;
@class _b4xpageparent;
@class _b4xpageinfo;
@class b4i_b4xpagesmanager;
@interface b4i_metroui_moderntext : B4IClass
{
@public NSString* __meventname;
@public NSObject* __mcallback;
@public B4XViewWrapper* __mbase;
@public B4IXUI* __xui;
@public NSObject* __tag;
@public B4IImageViewWrapper* __img;
@public B4IPanelWrapper* __mypanel;
@public B4XViewWrapper* __mytextboxb4x;
@public B4XViewWrapper* __iconcircleb4x;
@public B4ILabelWrapper* __iconcircle;
@public B4XViewWrapper* __myhintlabel;
@public B4ILabelWrapper* __myhlabel;
@public B4XViewWrapper* __myerrorlabelb4x;
@public B4ILabelWrapper* __myerrorlabel;
@public BOOL __ilkacilis;
@public double __normalhintarkaplanuzunlugu;
@public B4ITextFieldWrapper* __mytextbox;
@public iSVG* __svg;
@public int __mypanelradiusproperty;
@public NSString* __mypanelbackgroundcolorproperty;
@public int __circlecolorproperty;
@public int __iconcirclesizeproperty;
@public NSString* __iconcirclecolorproperty;
@public NSString* __hintnameproperty;
@public b4i_main* __main;
@public b4i_b4xpages* __b4xpages;
@public b4i_b4xcollections* __b4xcollections;

}- (NSString*)  _base_resize:(b4i_metroui_moderntext*) __ref :(double) _width :(double) _height;
- (NSString*)  _class_globals:(b4i_metroui_moderntext*) __ref;
@property (nonatomic)NSString* _meventname;
@property (nonatomic)NSObject* _mcallback;
@property (nonatomic)B4XViewWrapper* _mbase;
@property (nonatomic)B4IXUI* _xui;
@property (nonatomic)NSObject* _tag;
@property (nonatomic)B4IImageViewWrapper* _img;
@property (nonatomic)B4IPanelWrapper* _mypanel;
@property (nonatomic)B4XViewWrapper* _mytextboxb4x;
@property (nonatomic)B4XViewWrapper* _iconcircleb4x;
@property (nonatomic)B4ILabelWrapper* _iconcircle;
@property (nonatomic)B4XViewWrapper* _myhintlabel;
@property (nonatomic)B4ILabelWrapper* _myhlabel;
@property (nonatomic)B4XViewWrapper* _myerrorlabelb4x;
@property (nonatomic)B4ILabelWrapper* _myerrorlabel;
@property (nonatomic)BOOL _ilkacilis;
@property (nonatomic)double _normalhintarkaplanuzunlugu;
@property (nonatomic)B4ITextFieldWrapper* _mytextbox;
@property (nonatomic)iSVG* _svg;
@property (nonatomic)int _mypanelradiusproperty;
@property (nonatomic)NSString* _mypanelbackgroundcolorproperty;
@property (nonatomic)int _circlecolorproperty;
@property (nonatomic)int _iconcirclesizeproperty;
@property (nonatomic)NSString* _iconcirclecolorproperty;
@property (nonatomic)NSString* _hintnameproperty;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_b4xpages* _b4xpages;
@property (nonatomic)b4i_b4xcollections* _b4xcollections;
- (NSString*)  _clearerror:(b4i_metroui_moderntext*) __ref;
- (NSString*)  _designercreateview:(b4i_metroui_moderntext*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props;
- (NSString*)  _gettext:(b4i_metroui_moderntext*) __ref;
- (B4XFont*)  _gettextfont:(b4i_metroui_moderntext*) __ref;
- (NSString*)  _initialize:(b4i_metroui_moderntext*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname;
- (NSString*)  _mytextbox_action:(b4i_metroui_moderntext*) __ref;
- (NSString*)  _mytextbox_beginedit:(b4i_metroui_moderntext*) __ref;
- (NSString*)  _mytextbox_endedit:(b4i_metroui_moderntext*) __ref;
- (NSString*)  _mytextbox_enterpressed:(b4i_metroui_moderntext*) __ref;
- (NSString*)  _mytextbox_focuschanged:(b4i_metroui_moderntext*) __ref :(BOOL) _hasfocus;
- (NSString*)  _mytextbox_textchanged:(b4i_metroui_moderntext*) __ref :(NSString*) _old :(NSString*) _new;
- (NSString*)  _settext:(b4i_metroui_moderntext*) __ref :(NSString*) _text;
- (NSString*)  _settextfont:(b4i_metroui_moderntext*) __ref :(B4XFont*) _fnt;
- (NSString*)  _showerror:(b4i_metroui_moderntext*) __ref :(NSString*) _errortext;
- (iSVG*)  _svgfromstring:(b4i_metroui_moderntext*) __ref :(NSString*) _s;
- (double)  _uzunlukhesapla:(b4i_metroui_moderntext*) __ref :(NSString*) _nametext;
@end
