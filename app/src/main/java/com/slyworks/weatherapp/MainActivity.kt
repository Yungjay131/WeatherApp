package com.slyworks.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Created by Joshua Sylvanus, 11:21 AM, 24-Dec-20.
 */
class MainActivity : AppCompatActivity() {
    //region Vars
    //endregion
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataInit()

        initViews()
    }

    private fun initViews() {

    }

    private fun dataInit() {

    }
}