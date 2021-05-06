package com.example.testapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.*
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.Observer
import com.example.testapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.time.hours

class MainActivity : AppCompatActivity() {
    lateinit var viewModel : ViewModelMainActivity
    lateinit var bind : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind=DataBindingUtil.setContentView(this,R.layout.activity_main)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this,ViewModelFactory(10)).get(ViewModelMainActivity::class.java)
        number.text = viewModel.count.toString()
        viewModel.count.observe(this , Observer {
            number.text = it.toString()
        })
        click.setOnClickListener{
            viewModel.increment()
        }

    }

}