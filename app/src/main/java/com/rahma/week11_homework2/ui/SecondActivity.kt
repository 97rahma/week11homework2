package com.rahma.week11_homework2.ui

import android.view.LayoutInflater
import com.rahma.week11_homework2.data.Constant
import com.rahma.week11_homework2.databinding.ActivityMainBinding

class SecondActivity : BaseActivity<ActivityMainBinding>(){
    override val LOG_TAG: String="SECOND_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate

    override fun setup() {
       intent.getStringExtra(Constant.extraName)
    }

    override fun addCallBack() {
    }
}