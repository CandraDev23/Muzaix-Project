package com.candra.muzaixproj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.login_button)
        button.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.login_button ->{
                val intentBiasa = Intent(this@MainActivity, LoginActivity::class.java)
                startActivity(intentBiasa)
            }
        }
    }
}