package com.example.wangyinbao.example

import android.util.Log

import java.util.Calendar
import java.util.Date
import java.util.TimerTask

/**
 * Created by wangyinbao on 2017/8/5.
 */

class ScheduledExceutorTest2(jobName: String) : TimerTask() {

    private var jobName = ""
    private val TAG = "ScheduledExceutorTest2"


    init {
        this.jobName = jobName

    }

    override fun run() {
        Log.e(TAG, "in ScheduleExcetuorTest2" + jobName + ",Date =" + Date())

    }


    /**
     * @param currentDate 当前日期
     * *
     * @param dayOfWeek
     * *
     * @param hourOfDay
     * *
     * @param minuteOfHour
     * *
     * @param secondOfMinite
     * *
     * @return
     */
    fun getEarliesDate(currentDate: Calendar, dayOfWeek: Int, hourOfDay: Int, minuteOfHour: Int, secondOfMinite: Int): Calendar {

        val currentWeebOfYear = currentDate.get(Calendar.WEEK_OF_YEAR)
        val currentDayOfWeek = currentDate.get(Calendar.DAY_OF_WEEK)
        val currentHour = currentDate.get(Calendar.HOUR_OF_DAY)
        val currentMinunt = currentDate.get(Calendar.MINUTE)
        val currentSecond = currentDate.get(Calendar.SECOND)

        var weekLater = false

        if (dayOfWeek < currentDayOfWeek) {
            weekLater = true
        } else if (dayOfWeek == currentDayOfWeek) {

            if (minuteOfHour < currentMinunt) {
                weekLater = true
            } else if (minuteOfHour == currentHour) {
                if (secondOfMinite < currentSecond) {
                    weekLater = true
                }
            }
        }

        if (weekLater) {
            currentDate.set(Calendar.WEEK_OF_YEAR, currentWeebOfYear + 1)

        }
        currentDate.set(Calendar.DAY_OF_WEEK, dayOfWeek)
        currentDate.set(Calendar.HOUR_OF_DAY, hourOfDay)
        currentDate.set(Calendar.MINUTE, minuteOfHour)
        currentDate.set(Calendar.SECOND, secondOfMinite)

        return currentDate
    }

}
