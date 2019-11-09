package com.example.clickbaitrepo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.example.clickbaitrepo.db.getDatabase
import com.example.clickbaitrepo.repostory.TitleRepository
import com.example.clickbaitrepo.utils.MainNetworkImpl
import com.example.clickbaitrepo.viewModel.RequestFactory
import com.example.clickbaitrepo.viewModel.RequestViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get MainViewModel by passing a database to the factory
        val database = getDatabase(this)
        val repository = TitleRepository(MainNetworkImpl, database.titleDao)


        ViewModelProviders.of(this, RequestFactory(repository)).get(RequestViewModel::class.java)

    }
}
