package com.aghertzal.mybrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BrowserApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser_app);
        WebView webView= (WebView)findViewById(R.id.webview);
        webView.setWebViewClient (new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setVerticalScrollBarEnabled (false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.loadUrl("https://www.google.pl");

    }
}
