package com.example.multiscreen

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class Mutton : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mutton)
        val webViewVariable = findViewById<WebView>(R.id.Mutton)
        webViewSetUp(webViewVariable)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(webView: WebView) {
        webView.webViewClient = WebViewClient()
        webView.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.licious.in%2Fblog%2Frecipe%2Fmutton-curry-recipe&psig=AOvVaw2T7pvCqVewhZGaC90DNUpq&ust=1680967403342000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOjT9dqJmP4CFQAAAAAdAAAAABAE")

        }
    }
}
