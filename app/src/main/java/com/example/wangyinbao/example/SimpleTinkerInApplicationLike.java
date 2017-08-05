//package com.example.wangyinbao.example;
//
//import android.app.Application;
//import android.content.Intent;
//
//import com.tencent.tinker.anno.DefaultLifeCycle;
//import com.tencent.tinker.loader.app.ApplicationLike;
//import com.tencent.tinker.loader.shareutil.ShareConstants;
//
///**
// * Created by wangyinbao on 2017/8/5.
// */
//
//public class SimpleTinkerInApplicationLike extends ApplicationLike {
//    @DefaultLifeCycle( application = ".SimpleTinkerInApplication",
//            flags = ShareConstants.TINKER_ENABLE_ALL,
//            loadVerifyFlag = false)
//
//    public SimpleTinkerInApplicationLike(Application application, int tinkerFlags, boolean tinkerLoadVerifyFlag, long applicationStartElapsedTime, long applicationStartMillisTime, Intent tinkerResultIntent) {
//        super(application, tinkerFlags, tinkerLoadVerifyFlag, applicationStartElapsedTime, applicationStartMillisTime, tinkerResultIntent);
//    }
//}
