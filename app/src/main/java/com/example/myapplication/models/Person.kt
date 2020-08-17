package com.example.myapplication.models

class Person(firstName: String, lastName: String, yearOfBirth: Int) {
    val fullName = "$firstName $lastName"
    var age: Int

    init {
        age = 2020 - yearOfBirth
    }
}