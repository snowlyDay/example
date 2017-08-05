package com.example.wangyinbao.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class MainActivity extends AppCompatActivity {

    private WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        boolean b = getWindow().requestFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.activity_main);

//        mWebView.setWebChromeClient(new WebChromeClient(){
//
//        });
//
//        mWebView.setWebViewClient(new WebViewClient(){
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url){
//                view.loadUrl(url);
//                return  true;
//            }
//
//        });

        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);

        long initialDelay = 1;
        long period = 1;

        service.scheduleAtFixedRate(new scheduledExecutor("job"), initialDelay, period, TimeUnit.SECONDS);

        long initalDelay2 = 2;
        long delay2 = 1;

        service.scheduleAtFixedRate(new scheduledExecutor("job2"), initalDelay2, delay2, TimeUnit.SECONDS);


    }
}
