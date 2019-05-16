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

package com.wisekiddo.base.module

import com.wisekiddo.daggerstarter.features.settings.SettingsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class MainBindingModule {

    @ContributesAndroidInjector
    internal abstract fun provideSettingsFragmentFactory(): SettingsFragment

    //@ContributesAndroidInjector
    //internal abstract fun provideTargeAFragmentFactory(): TargetAFragment

    //@ContributesAndroidInjector
    //internal abstract fun provideTargeBFragmentFactory(): TargetBFragment



}