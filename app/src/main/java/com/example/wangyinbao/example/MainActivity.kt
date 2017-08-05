package com.example.wangyinbao.example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Window
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

import java.sql.Time
import java.util.Calendar
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.TimeUnit


class MainActivity : AppCompatActivity() {

    private val mWebView: WebView? = null
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val b = window.requestFeature(Window.FEATURE_PROGRESS)
        setContentView(R.layout.activity_main)


        val service = Executors.newScheduledThreadPool(10)

        val initialDelay: Long = 1
        val period: Long = 1

        //        service.scheduleAtFixedRate(new scheduledExecutor("job"), initialDelay, period, TimeUnit.SECONDS);

        val initalDelay2: Long = 2
        val delay2: Long = 1

        service.scheduleAtFixedRate(scheduledExecutor("job2"), initalDelay2, delay2, TimeUnit.SECONDS)


        //        ScheduledExceutorTest2 scheduledExceutorTest2 =  new ScheduledExceutorTest2("jjhh");
        //        scheduledExceutorTest2.getEarliesDate()
        startScheduledExceutor()

    }


    private fun startScheduledExceutor() {
        val test = ScheduledExceutorTest2("job1")

        val currentDate = Calendar.getInstance()
        val currentDateLong = currentDate.time.time
        Log.i(TAG, "current Date" + currentDate.time.toString())
        val earliestDate = test.getEarliesDate(currentDate, 1, 10, 30, 10)
        val earliesDateLong = earliestDate.time.time
        val delay = earliesDateLong - currentDateLong

        val period = (7 * 24 * 60 * 60 * 1000).toLong()
        val service = Executors.newScheduledThreadPool(10)
        service.scheduleAtFixedRate(test, delay, period, TimeUnit.MILLISECONDS)

    }
}
