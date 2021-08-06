package com.vizhuo.sxxj

import android.app.Application
import com.blankj.utilcode.util.Utils
import com.tencent.smtt.sdk.QbSdk


/**
 * @author chenxw
 * @date 2020-03-18
 * @des
 * @version V1.0
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Utils.init(this)

        QbSdk.initX5Environment(this,null)
    }




}