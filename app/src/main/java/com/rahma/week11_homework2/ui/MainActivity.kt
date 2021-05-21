package com.rahma.week11_homework2.ui

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import com.rahma.week11_homework2.data.Constant
import com.rahma.week11_homework2.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val LOG_TAG: String="MAIN_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate

    override fun setup() {}

    override fun addCallBack() {
        //هنا اخلي مال اون كلك لسنار مال بوتون
        binding?.apply {
            button.setOnClickListener {
                val intent= Intent(Intent.ACTION_VIEW)
                intent.data= Uri.parse("C:\\Users\\dell\\AndroidStudioProjects\\Week11_HomeWork22\\app\\src\\main\\res\\layout\\SecondActivity")
                intent.putExtra(Constant.extraName,"hi everyone")
                startActivity(intent)
            }
        }
    }

}