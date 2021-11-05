
#import "iCore.h"
@interface LS_mainpage:NSObject
@end

@implementation LS_mainpage

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[MainPage/General script]
[B4ILayoutBuilder scaleAll:views :width :height];

}
@end