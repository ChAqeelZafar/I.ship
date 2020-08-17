package com.example.myapplication.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.myapplication.R
import com.example.myapplication.fragments.Fragment1
import com.example.myapplication.fragments.Fragment2

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

       addFragmentToActivity(
            getSupportFragmentManager(), Fragment1(),
           R.id.frameLayout_1
       );

        addFragmentToActivity(
            getSupportFragmentManager(), Fragment2(),
            R.id.frameLayout_2
        );
    }

    fun addFragmentToActivity(
        manager: FragmentManager,
        fragment: Fragment?,
        frameId: Int
    ) {
        val transaction: FragmentTransaction = manager.beginTransaction()
        if (fragment != null) {
            transaction.add(frameId, fragment)
        }
        transaction.commit()
    }
}