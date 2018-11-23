package com.example.nirou.a2018_moviles_proyecto02botones.feature

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_web_view.*

class WebView : AppCompatActivity() {


    var mywebview: WebView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        mywebview = findViewById<WebView>(R.id.webView)

        mywebview!!.webViewClient= object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        mywebview!!.loadUrl("https://www.google.com.ec/")
    }


}
