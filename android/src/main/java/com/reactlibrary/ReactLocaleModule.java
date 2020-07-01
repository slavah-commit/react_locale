package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import java.util.Locale;

public class ReactLocaleModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public ReactLocaleModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "ReactLocale";
    }

    @ReactMethod
    public void isMetric(Callback callback) {
        boolean isNumeric = false;
        String countryCode = Locale.getDefault().getCountry().toUpperCase();
        switch (countryCode) {
            case "US":
            case "LR":
            case "MM":
                isNumeric = false;
            default:
                isNumeric = true;
        }

        callback.invoke(isNumeric);
    }
}
