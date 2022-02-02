package cz.nechudav.confirmowebview

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView: WebView = findViewById(R.id.webview)
        val ws: WebSettings = myWebView.settings
        ws.javaScriptEnabled = true
        ws.domStorageEnabled = true
        myWebView.loadUrl("https://www.pilulka.cz/pay/confirmo?method=PAY_CONFIRMO&uid=1_5de90c6c7874c2.03288097&platform=mobile&wasCreatedFromFastCheckout=0")
    }
}