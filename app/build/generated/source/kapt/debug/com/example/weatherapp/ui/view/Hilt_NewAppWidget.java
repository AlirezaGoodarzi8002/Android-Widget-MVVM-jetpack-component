package com.example.weatherapp.ui.view;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.CallSuper;
import dagger.hilt.android.internal.managers.BroadcastReceiverComponentManager;
import dagger.hilt.internal.UnsafeCasts;
import java.lang.Object;
import java.lang.Override;
import javax.annotation.processing.Generated;

/**
 * A generated base class to be extended by the @dagger.hilt.android.AndroidEntryPoint annotated class. If using the Gradle plugin, this is swapped as the base class via bytecode transformation.
 */
@Generated("dagger.hilt.android.processor.internal.androidentrypoint.BroadcastReceiverGenerator")
public abstract class Hilt_NewAppWidget extends AppWidgetProvider {
  private volatile boolean injected = false;

  private final Object injectedLock = new Object();

  @Override
  @CallSuper
  public void onReceive(Context context, Intent intent) {
    inject(context);
    super.onReceive(context, intent);
  }

  protected void inject(Context context) {
    if (!injected) {
      synchronized (injectedLock) {
        if (!injected) {
          ((NewAppWidget_GeneratedInjector) BroadcastReceiverComponentManager.generatedComponent(context)).injectNewAppWidget(UnsafeCasts.<NewAppWidget>unsafeCast(this));
          injected = true;
        }
      }
    }
  }
}
