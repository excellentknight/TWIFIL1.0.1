package com.faresimtiez.algotech.twifil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(WebView)findViewById(R.id.web);
        a.getSettings().setJavaScriptEnabled(true);
        a.loadUrl("https://twifil.com/");
        a.setWebViewClient(new WebViewClient());
    }
}
