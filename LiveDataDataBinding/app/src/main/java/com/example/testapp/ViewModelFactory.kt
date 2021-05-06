package com.example.testapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory(val value : Int) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        return ViewModelMainActivity(value) as T
    }

}