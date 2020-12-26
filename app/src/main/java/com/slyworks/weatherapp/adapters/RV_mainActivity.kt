package com.slyworks.weatherapp.adapters

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.slyworks.weatherapp.models.Weather


/**
 *Created by Joshua Sylvanus, 11:38 AM, 24-Dec-20.
 */

class RV_mainActivity(): RecyclerView.Adapter<RV_mainActivity.ViewHolder>(){
    //region Vars
    private var mList: ArrayList<Weather>? = null
    //endregion
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

    }

    override fun getItemCount(): Int {
        return mList!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    fun setDataSet(list: ArrayList<Weather>){

    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //region Vars
        val view = itemView
        //endregion
        fun onBind(){

        }
    }
}