package com.example.fraregment_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1=findViewById<Button>(R.id.btn1)
        val btn2=findViewById<Button>(R.id.btn2)

        btn1.setOnClickListener {
            changeFragment(Fragment_1())

        }
        btn2.setOnClickListener {
            changeFragment(Fragment_2())
        }
    }
    fun changeFragment(fragment: Fragment) {

        supportFragmentManager.beginTransaction().replace(R.id.change_frament,fragment).commit()
    }
}