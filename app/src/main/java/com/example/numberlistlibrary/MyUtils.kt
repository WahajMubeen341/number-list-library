package com.example.numberlistlibrary


import android.content.Context
import android.content.Intent

object MyUtils {
    fun showNumbers(context: Context, numbers: List<Int>) {
        val intent = NumberListActivity.createIntent(context, numbers)
        if (context !is android.app.Activity) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        context.startActivity(intent)
    }
}
