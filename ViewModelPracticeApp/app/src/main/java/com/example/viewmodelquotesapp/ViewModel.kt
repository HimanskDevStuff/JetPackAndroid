package com.example.viewmodelquotesapp

import androidx.lifecycle.ViewModel

class ViewModel(val qoutes : ArrayList<Quotes>) : ViewModel(){
    val qoute : ArrayList<Quotes> = qoutes
    var pos : Int = 0

    fun getQuote() : Quotes{
        return qoute[pos]
    }
    fun nextQuote() : Quotes?{
        pos++
        if(pos<qoute.size)
        return qoute[pos]
        return null
    }
    fun prevQuote() : Quotes?{
        pos--
        if(pos>=0)
        return qoute[pos]
        return null
    }
}