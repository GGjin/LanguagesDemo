package com.example.languagesdemo

import android.app.Application
import android.content.Context
import com.hjq.language.MultiLanguages
import java.util.Locale

/**
 * Filename: NewApp
 * Author: GG
 * Date: 2024/6/25
 * Description:
 */
class NewApp : Application() {


    override fun attachBaseContext(base: Context) {
        MultiLanguages.setDefaultLanguage(Locale.ENGLISH)
        super.attachBaseContext(MultiLanguages.attach(base));
    }


    override fun onCreate() {
        super.onCreate()
        MultiLanguages.init(this)
    }
}