package com.example.myapplication.di

import com.example.myapplication.Human
import com.example.myapplication.Man
import com.example.myapplication.User
import com.example.myapplication.Women
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey
import javax.inject.Singleton

@Module
public  class AppModule {

    @Named("user1")
    @Provides

     fun  providerUser1() = User("lishiwei1", "男")
    @Named("user2")
    @Provides
     fun  providerUser2() = User("lishiwei2", "男")


    @Provides
    fun provideMan() = Man("wanghe", "男")



    @Named("women1")
    @Provides
    fun provideWomen() = Women("yangtingting", "nv")
    @Named("women2")
    @Provides
    fun provideNamedWomen() = Women("yangting", "nv")


    @Provides
    @IntoMap
    @StringKey("man")
    fun provideManMap() = Man("wanghongtao", "nan")
    @Provides
    @IntoMap
    @StringKey("women")
    fun provideWoMenMap() = Women("wanghongtao", "nan")




}