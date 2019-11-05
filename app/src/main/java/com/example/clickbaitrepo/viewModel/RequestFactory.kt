package com.example.clickbaitrepo.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * Created by Olije Favour on 11/4/2019.
 *Copyright (c) 2019    All rights reserved.
 */

// *Copyright (c) 2019  Itex Integrated Services  All rights reserved.


class  RequestFactory(private val dBandNetwork: DBandNetwork) : ViewModelProvider.Factory{


    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(RequestViewModel::class.java)){
               RequestViewModel(this.dBandNetwork) as T
        }else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
//        return super.create(modelClass)
    }
}