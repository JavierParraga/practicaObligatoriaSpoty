package com.example.ejemplostextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web_view.*

class webView : AppCompatActivity() {
    private val BASE_URL = "https://www.spotify.com/es/"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        val settings = web.settings
        settings.javaScriptEnabled = true

        web.webChromeClient =object :WebChromeClient(){
        }
        web.webViewClient = object : WebViewClient(){
        }
        web.loadUrl(BASE_URL)
    }
    override fun onBackPressed(){
        if(web.canGoBack()){
            web.goBack()
        }else{
            super.onBackPressed()
        }
    }
}