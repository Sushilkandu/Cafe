package com.example.multiscreen

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class Pizza : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza)
        val webViewVariable = findViewById<WebView>(R.id.Pizza)
        webViewSetUp(webViewVariable)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(webView: WebView) {
        webView.webViewClient = WebViewClient()
        webView.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://pizzaonline.dominos.co.in/?src=google_sem_nonbrandgeneric&utm_source=google&utm_medium=cpc&utm_campaign=HM_Generic-SKW-Sept-19-Bangalore&gclid=Cj0KCQjw_r6hBhDdARIsAMIDhV_rKSIU8ltD90XeWGYkipU8K2vUOZhVcqm9QZJLu2BZQfO5kScvnsIaAq7BEALw_wcB")

        }
    }
}