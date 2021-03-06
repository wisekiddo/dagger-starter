/*
 * Copyright 2019 Wisekiddo by Ronald Garcia Bernardo. All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.wisekiddo.base.component

import android.app.Application
import com.wisekiddo.base.ProjectApplication
import com.wisekiddo.base.module.ApplicationModule
import com.wisekiddo.base.module.BindingModule
import com.wisekiddo.base.module.ContextModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(modules = (
        [
            ContextModule::class,
            AndroidSupportInjectionModule::class,
            ApplicationModule::class,
            BindingModule::class
        ]))

interface ApplicationComponent : AndroidInjector<DaggerApplication> {

    fun inject(application: ProjectApplication)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }
}