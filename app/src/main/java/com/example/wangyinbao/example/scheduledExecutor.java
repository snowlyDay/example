package com.example.wangyinbao.example;

import android.util.Log;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Created by wangyinbao on 2017/8/5.
 */

public class scheduledExecutor implements Runnable {

    private String TAG = "schduledExecutor";
    private String jobName = "";
    public scheduledExecutor (String jobName){
        super();
        this.jobName = jobName;
    }
    @Override
    public void run() {
        Log.e(TAG, "is running ....."+jobName);
    }

    public void start(){

    }
}
