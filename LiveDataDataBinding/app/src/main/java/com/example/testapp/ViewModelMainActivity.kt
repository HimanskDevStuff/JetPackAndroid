package com.example.testapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelMainActivity(val c : Int) : ViewModel(){
    var count = MutableLiveData<Int>(c)
    fun increment(){
        count.value=count.value!!.toInt()+ 1
    }
}
