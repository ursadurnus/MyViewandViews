package com.example.myviewandviews

import android.app.ActionBar
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1);

        if(supportActionBar != null){
            (supportActionBar as ActionBar).title = "Google Pixel"
        }
    }
}