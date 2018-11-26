package com.example.myapplication.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.Human
import com.example.myapplication.Man
import com.example.myapplication.Women
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

@Module
public abstract class BindModule {

//    @Binds
//    @IntoMap
//    @StringKey("women")
//    abstract  fun provideWomenMap(women: Women): Human

    @Binds
    abstract fun provideHumen(women: Women): Human


}