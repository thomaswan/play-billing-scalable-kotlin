/**
 * Copyright (C) 2018 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.playbilling.trivialdrive.kotlin


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.trivialdrive.R

/**
 * This Fragment is simply a wrapper for the inventory (i.e. items for sale). It contains two
 * [lists][RecyclerView], one for subscriptions and one for in-app products. Here again there is
 * no complicated billing logic. All the billing logic reside inside the [BillingRepository].
 * The [BillingRepository] provides a [AugmentedSkuDetails] object that shows what
 * is for sale and whether the user is allowed to buy the item at this moment. E.g. if the user
 * already has a full tank of gas, then they cannot buy gas at this moment.
 */
class MakePurchaseFragment : Fragment() {

    val LOG_TAG = "MakePurchaseFragment"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_make_purchase, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(LOG_TAG, "onViewCreated")
    }

}
