package com.example.myapplication.activities

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R


class ResultSender : AppCompatActivity() {
    lateinit var btn : Button
    lateinit var editText : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_sender)

        btn = findViewById(R.id.sender_btn)
        editText = findViewById(R.id.sender_msg)

        btn.setOnClickListener {

            val returnIntent = Intent()
            returnIntent.putExtra("result", editText.text.toString())

            setResult(Activity.RESULT_OK, returnIntent)
            finish()
        }


    }
}