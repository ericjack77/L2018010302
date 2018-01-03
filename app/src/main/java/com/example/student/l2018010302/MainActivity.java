package com.example.student.l2018010302;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv=findViewById(R.id.webview);
        wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        //wv.loadUrl("https://www.youtube.com/?gl=TW&hl=zh-tw");
        //wv.loadUrl("https://tw.yahoo.com");
        wv.loadData("<iframe width=\"200\" height=\"200\" src=\"https://www.youtube.com/embed/VvC4SQGax50\" frameborder=\"0\" gesture=\"media\" allow=\"encrypted-media\" allowfullscreen></iframe>","text/html; charset=utf-8",null);
    }
}
