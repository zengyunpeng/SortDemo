package com.example.administrator.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.flutter.facade.Flutter
import io.flutter.view.FlutterMain

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FlutterMain.startInitialization(this)
        val createView = Flutter.createView(this, lifecycle, "test")
        setContentView(createView)

    }


}
