package com.example.myapplication.mvvm_kotlin

import com.example.myapplication.models.Singleton
import com.example.myapplication.mvvm_java.AsyncResponse

class RepositoryK private constructor(){


    companion object {
        val instance: RepositoryK by lazy { RepositoryK() }
    }

    var data : String = "this is the data"


    fun getData(deligate : AsyncResponseK){

    }

    fun setData(deligate: AsyncResponseK){
        //Get data from API
        //OR
        //Get data from database

        data = "new updated data"

        deligate.processFinish(data)
    }

}