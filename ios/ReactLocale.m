#import "ReactLocale.h"

@implementation ReactLocale

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(isMetricWithCallback:(RCTResponseSenderBlock)callback)
{
    NSLocale *locale = [NSLocale currentLocale];
    BOOL isMetric = [[locale objectForKey:NSLocaleUsesMetricSystem] boolValue];
    callback(@[[NSNumber numberWithBool:isMetric]]);
}

@end
