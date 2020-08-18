package com.example.myapplication.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.activities.ResultSender

class Fragment2 : Fragment() {

    lateinit var txt : TextView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) : View? {
        val view = inflater.inflate(R.layout.two_fragment, container, false)!!

        val btn = view!!.findViewById<Button>(R.id.fragment2_btn)
        txt = view!!.findViewById(R.id.fragment2_text)
        btn.setOnClickListener {
            val i = Intent(activity, ResultSender::class.java)
            startActivityForResult(i, 2)
        }

        return view

    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        activity
        if (requestCode == 2 && resultCode == Activity.RESULT_OK) {
            txt.text = data!!.getStringExtra("result")
        }
    }
}