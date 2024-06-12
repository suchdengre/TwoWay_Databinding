package com.example.twowaybinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    val userName = MutableLiveData<String>()

    init {
        userName.value = "Hi tech project"
    }
}