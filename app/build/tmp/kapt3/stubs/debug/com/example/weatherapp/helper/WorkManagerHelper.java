package com.example.weatherapp.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/weatherapp/helper/WorkManagerHelper;", "", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "uuid", "Ljava/util/UUID;", "workManager", "Landroidx/work/WorkManager;", "cancelWorkManager", "", "enqueueWorkRequest", "getWorkInfoByIdLiveData", "Landroidx/lifecycle/LiveData;", "Landroidx/work/WorkInfo;", "app_debug"})
@javax.inject.Singleton()
public final class WorkManagerHelper {
    private final android.content.Context applicationContext = null;
    private androidx.work.WorkManager workManager;
    private java.util.UUID uuid;
    
    @javax.inject.Inject()
    public WorkManagerHelper(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context applicationContext) {
        super();
    }
    
    public final void enqueueWorkRequest() {
    }
    
    public final void cancelWorkManager() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<androidx.work.WorkInfo> getWorkInfoByIdLiveData() {
        return null;
    }
}