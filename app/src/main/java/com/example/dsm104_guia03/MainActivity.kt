package com.example.dsm104_guia03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycle.addObserver(MyLifeCycleObserver())
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        viewModel.currentNumber.observe(this, Observer {
            counter.text = it.toString()
        })


    }

    public fun countNum(view: View){
        val txt = counter.text.toString()
        var num:Int = txt.toInt()

        if(num == 9){
            num = 0
        }
        else{
            num = num + 1
        }

        viewModel.currentNumber.value = num

        counter.text = num.toString()
    }
}