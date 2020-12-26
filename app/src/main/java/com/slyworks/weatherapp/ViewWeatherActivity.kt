package com.slyworks.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Created by Joshua Sylvanus, 11:48 AM, 24-Dec-20.
 */
class ViewWeatherActivity : AppCompatActivity() {
    //region Vars
    //endregion
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_weather)

        dataInit()

        initViews()
    }

    private fun dataInit() {

    }

    private fun initViews() {

    }
}