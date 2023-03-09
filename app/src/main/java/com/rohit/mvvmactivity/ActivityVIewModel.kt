package com.rohit.mvvmactivity

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ActivityVIewModel:ViewModel() {

    var text:MutableLiveData<String> = MutableLiveData("abc")
  //  var NUM:MutableLiveData<Int> = MutableLiveData(0)
}