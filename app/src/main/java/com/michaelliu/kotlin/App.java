package com.michaelliu.kotlin;

import android.content.Context;
import android.support.multidex.MultiDex;
import com.mdroid.lib.core.base.BaseApp;
import com.michaelliu.kotlin.utils.ImageLoader;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

/**
 * Description:
 *
 * Created by liuguoquan on 2017/11/3 17:23.
 */

public class App extends BaseApp {

  private static App mInstance;

  @Override protected void attachBaseContext(Context base) {
    super.attachBaseContext(base);
    MultiDex.install(base);
  }

  public static App getInstance() {
    return mInstance;
  }

  @Override public void onCreate() {
    super.onCreate();
    mInstance = this;
    ImageLoader.init(this);
    FormatStrategy strategy = PrettyFormatStrategy.newBuilder().
        tag("lgq").build();
    Logger.addLogAdapter(new AndroidLogAdapter(strategy) {
      @Override public boolean isLoggable(int priority, String tag) {
        return BuildConfig.DEBUG;
      }
    });
  }

  @Override public boolean isDebug() {
    return BuildConfig.DEBUG;
  }
}
