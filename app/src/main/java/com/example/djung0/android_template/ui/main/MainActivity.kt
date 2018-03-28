package com.example.djung0.android_template.ui.main

import android.os.Bundle
import com.example.djung0.android_template.AppActivity
import com.example.djung0.android_template.R

class MainActivity : AppActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val mainFragmentInstance = MainFragment.newInstance()
        fragmentTransaction.add(R.id.layout_container, mainFragmentInstance)
        fragmentTransaction.commit()
    }
}
