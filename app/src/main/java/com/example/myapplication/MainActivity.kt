package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.unity3d.player.UnityPlayerActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun myClick(view: View) {
        Toast.makeText(this, "lol", Toast.LENGTH_SHORT).show()
        val i = Intent(this, UnityPlayerActivity::class.java)
        startActivity(i)
        finish()
    }
}