package com.example.myapplication.di

import com.example.myapplication.Man
import com.example.myapplication.MyApplication
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class,BindModule::class])
 interface AppComponent{
 fun inject( myApplication: MyApplication)
 fun manMap(): Map<String, Man>
}