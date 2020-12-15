package com.example.ejemplostextview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class botones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_botones)
    }
    fun goToReproductor(view:View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun goToGrid(view:View){
        val intent = Intent(this, Album::class.java)
        startActivity(intent)
    }
    fun goToRecycled(view:View){
        val intent = Intent(this, main_recycled::class.java)
        startActivity(intent)
    }
    fun goToVideo(view:View){
        val intent = Intent(this, videoView::class.java)
        startActivity(intent)
    }
    fun goToWeb(view:View){
        val intent = Intent(this, webView::class.java)
        startActivity(intent)
    }
}