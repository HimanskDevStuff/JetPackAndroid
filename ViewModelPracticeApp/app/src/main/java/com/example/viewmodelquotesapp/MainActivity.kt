package com.example.viewmodelquotesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var quoteList : ArrayList<Quotes>
    lateinit var viewmodel : ViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        quoteList = arrayListOf()
        viewmodel = ViewModelProvider(this,ViewModelFactory(quoteList)).get(ViewModel::class.java)
        GenerateQuotes()
        setText(viewmodel.getQuote())
        next.setOnClickListener{

            val currQuote = viewmodel.nextQuote()
            setText(currQuote)

        }
        prev.setOnClickListener{

            val currQuote = viewmodel.prevQuote()
            setText(currQuote)

        }


    }

    private fun setText(currQuote : Quotes?){
        thequote.text = currQuote?.quoates
    }
    private fun GenerateQuotes() {
        for ( i in 0..10){
            quoteList.add(Quotes("This is $i quote"))
        }
    }

}