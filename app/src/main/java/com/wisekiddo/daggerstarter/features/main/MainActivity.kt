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

package com.wisekiddo.daggerstarter.features.main

import androidx.navigation.NavController
import android.os.Bundle
import androidx.navigation.NavDestination
import com.crashlytics.android.Crashlytics
import com.wisekiddo.base.BaseActivity
import com.wisekiddo.daggerstarter.R
import io.fabric.sdk.android.Fabric
import java.util.ArrayList


class MainActivity : BaseActivity(), NavController.OnDestinationChangedListener {

    lateinit var navController: NavController
    private val callbacks = ArrayList<MainCallback>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Fabric.with(this, Crashlytics())
    }

    override fun onDestinationChanged(controller: NavController, destination: NavDestination, arguments: Bundle?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun layoutRes(): Int {
        return R.layout.activity_main
    }

    interface MainCallback {
        fun onNavigatorReselected()
    }

}
