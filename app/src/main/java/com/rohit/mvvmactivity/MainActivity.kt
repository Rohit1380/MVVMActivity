package com.rohit.mvvmactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.rohit.mvvmactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var activityVIewModel: ActivityVIewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        activityVIewModel=ViewModelProvider(this).get(ActivityVIewModel::class.java)

        binding.btnRed.setOnClickListener {
            activityVIewModel.text.setValue("Hello Red Is Pressed")
        }
        activityVIewModel.text.observe(this){
        }

    }
}