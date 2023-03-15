package com.candra.muzaixproj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        textView = findViewById(R.id.backbutton)
        textView.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.backbutton ->{
                val intentBiasa = Intent(this@LoginActivity, MainActivity::class.java)
                startActivity(intentBiasa)
            }
        }
    }
}