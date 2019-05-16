package com.wisekiddo.base.component

import android.app.Application
import com.wisekiddo.base.ProjectApplication
import com.wisekiddo.base.module.ApplicationModule
import com.wisekiddo.base.module.ContextModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(modules = ([ContextModule::class, AndroidSupportInjectionModule::class, ApplicationModule::class]))
interface ApplicationComponent: AndroidInjector<DaggerApplication> {

    fun inject(application: ProjectApplication)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder
        fun build(): ApplicationComponent
    }
}