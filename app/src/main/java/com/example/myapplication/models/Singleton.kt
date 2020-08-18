package com.example.myapplication.models

class Singleton private constructor() {

   var name:String?=null

    companion object {
        val instance: Singleton by lazy { Singleton() }
    }
}

