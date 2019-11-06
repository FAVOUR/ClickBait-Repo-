package com.example.clickbaitrepo.utils

import com.example.android.kotlincoroutines.util.FAKE_RESULTS
import com.example.android.kotlincoroutines.util.FakeNetworkCall
import com.example.android.kotlincoroutines.util.fakeNetworkLibrary

/**
 * Created by Olije Favour on 11/6/2019.
 *Copyright (c) 2019    All rights reserved.
 */
/**
 * Main network interface which will fetch a new welcome title for us
 */
interface MainNetwork {
    fun fetchNewWelcome(): FakeNetworkCall<String>
}

/**
 * Default implementation of MainNetwork.
 */
object MainNetworkImpl : MainNetwork {
    override fun fetchNewWelcome() = fakeNetworkLibrary(FAKE_RESULTS)
}

