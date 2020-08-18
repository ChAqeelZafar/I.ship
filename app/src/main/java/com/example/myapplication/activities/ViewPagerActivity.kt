package com.example.myapplication.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.R
import com.example.myapplication.adapters.MyFragmentPagerAdapter
import com.example.myapplication.helpers.MyFramentManager


class ViewPagerActivity : AppCompatActivity() {

    private lateinit var viewpager: ViewPager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        viewpager = findViewById(R.id.viewpager)

        val adapter = MyFragmentPagerAdapter(
            getSupportFragmentManager()
        )

        var firstFragmet: MyFramentManager = MyFramentManager.newInstance("First Fragment")
        var secondFragmet: MyFramentManager = MyFramentManager.newInstance("Second Fragment")
        var thirdFragmet: MyFramentManager = MyFramentManager.newInstance("Third Fragment")

        adapter.addFragment(firstFragmet, "1")
        adapter.addFragment(secondFragmet, "2")
        adapter.addFragment(thirdFragmet, "3")

        viewpager!!.adapter = adapter
    }



}