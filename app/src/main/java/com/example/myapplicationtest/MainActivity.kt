package com.example.myapplicationtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceFragment(PlanFragment())

        tvshop.setOnClickListener {
            replaceFragment(ShopFragment())
        }
        tvpantry.setOnClickListener {
            replaceFragment(PantryFragment())
        }
        tvplan.setOnClickListener {
           replaceFragment(PlanFragment())
        }

    }


    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.rlrelate, fragment)
        fragmentTransaction.commit()
    }
}