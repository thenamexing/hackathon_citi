package com.intern.xing.hackathon_citi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SpendingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spending)
        supportActionBar!!.title = "Your Spending"

    }
}
