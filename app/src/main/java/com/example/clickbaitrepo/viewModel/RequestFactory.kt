package com.example.clickbaitrepo.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.clickbaitrepo.repostory.TitleRepository

/**
 * Created by Olije Favour on 11/4/2019.
 *Copyright (c) 2019    All rights reserved.
 */



class  RequestFactory(private val dBandNetwork: TitleRepository) : ViewModelProvider.Factory{


    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(RequestViewModel::class.java)){
               RequestViewModel(this.dBandNetwork) as T
        }else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
//        return super.create(modelClass)
    }
}