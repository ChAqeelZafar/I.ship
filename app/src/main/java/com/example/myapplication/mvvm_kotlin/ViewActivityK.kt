package com.example.myapplication.mvvm_kotlin

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.myapplication.R
import com.example.myapplication.activities.ResultSender

class ViewActivityK : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) : View? {
        val view = inflater.inflate(R.layout.one_fragment, container, false)!!

        var vmd : ViewModelVmK = ViewModelProviders.of(this).get(ViewModelVmK::class.java)

        vmd.getData().observe(viewLifecycleOwner, Observer {
            println("Data is $it")
        })
        return view

    }
}