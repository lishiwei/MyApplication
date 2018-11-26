package com.example.myapplication

import android.content.Context
import android.util.Log

fun Context.logd( tag:String, message:String)
{
    Log.d(tag,message)
}fun Context.loge( tag:String, message:String)
{
    Log.e(tag,message)
}