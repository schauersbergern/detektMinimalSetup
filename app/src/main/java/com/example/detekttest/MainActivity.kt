package com.example.detekttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        foo(strings = *arrayOf("a", "b", "c"))
    }

    fun foo(vararg strings: String) {  }

    fun a() {

    }

    fun sdfasgsdkfgnsdfgdsfgsdfgsdfgsdfgdfgasdfgsfgsdfg(){

    }
}
