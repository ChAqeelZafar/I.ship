package com.example.myapplication.mvvm_kotlin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelVmK : ViewModel() , AsyncResponseK{

    var mldd = MutableLiveData<String>()
    lateinit var repositoryK : RepositoryK


    init {
        repositoryK = RepositoryK.instance
        repositoryK.getData(this)
    }
    override fun processFinish(data: String) {
        mldd.value = data
    }

    fun getData() : LiveData<String> {
        return mldd
    }
}

