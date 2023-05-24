package com.sealteam.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.nio.file.Files.move

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nextbtn=findViewById<Button>(R.id.next)
        nextbtn.setOnClickListener {
            val x=Intent(this,customized::class.java)
            startActivity(x)
        }
    }
}