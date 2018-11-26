package com.example.myapplication

import android.app.Application
import com.example.myapplication.di.AppComponent
import com.example.myapplication.di.AppModule
import com.example.myapplication.di.DaggerAppComponent
import com.example.myapplication.di.Named
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

public class MyApplication : Application() {

   @Inject @field:Named("user1") lateinit var user: User
   @Inject @field:Named("user1") lateinit var userProovider: Provider<User>

    @Inject lateinit var humen: Human
    @Inject lateinit var man: Man

    @Inject lateinit var man222: Man

    @Inject @field:Named("women1") lateinit var women: Women
    @Inject @field:Named("women2") lateinit var women2: Women


    lateinit var manMap: Map<String, Provider<Man>>
        @Inject set


    @Inject lateinit var woManMap: Map<String,Women>
//    set
    val TAG: String = MyApplication::class.java.simpleName
    lateinit var appComponent: AppComponent;
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()
        appComponent.inject(this)
        logd(TAG, user.toString())
        logd(TAG, manMap.get("man").toString())
        logd(TAG, appComponent.manMap().get("man").toString())
        logd(TAG,woManMap.get("women").toString())
        logd(TAG, man.toString())
        logd(TAG, women2.toString())
        logd(TAG, women.toString())
        logd(TAG, humen.toString())
        logd(TAG, userProovider.get().toString())
        logd(TAG, userProovider.get().toString())
    }
}