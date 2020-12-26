package com.slyworks.weatherapp.data


/**
 *Created by Joshua Sylvanus, 11:30 AM, 24-Dec-20.
 */

class Repository() {
    //region Vars

    //endregion
    companion object{
        private var instance : Repository? = null

        fun getInstance(): Repository{
            if(instance == null){
                instance = Repository()
            }
            return instance!!
        }
    }


    //region for caching
    fun writeToCache(){

    }
    fun readFromCache(){

    }
    //endregion
}