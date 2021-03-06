package com.dhorowitz.store.di

import android.app.Activity
import com.dhorowitz.store.Navigator
import com.dhorowitz.store.NavigatorImpl
import dagger.Module
import dagger.Provides

@Module
abstract class ActivityModule {

    @Module
    companion object {
        @Provides
        @JvmStatic
        internal fun provideNavigator(activity: Activity): Navigator = NavigatorImpl(activity)
    }
}