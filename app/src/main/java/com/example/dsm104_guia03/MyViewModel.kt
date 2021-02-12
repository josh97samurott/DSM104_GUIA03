package com.example.dsm104_guia03

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {

    val currentNumber: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

}