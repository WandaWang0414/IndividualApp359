package com.wandawwang.individualapp

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // navigates to the mainActivity
         val ContinueButton = findViewById<Button>(R.id.Continue)
        ContinueButton.setOnClickListener {
            val intent = Intent (this,
                MainActivity::class.java)

            startActivity(intent)
        }
    }
}