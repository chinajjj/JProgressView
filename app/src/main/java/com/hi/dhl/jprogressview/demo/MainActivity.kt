package com.hi.dhl.jprogressview.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart.setOnClickListener {
            progresssView
                    .setProgress(90f) // 当前进度
                    .setMaxProgress(300) // 进度条的最大值
                    .setReverse(false) // 进度条回放
                    .startAnimal() // 开启动画
            progresssView3.setProgress(80f).setReverse(false).startAnimal()
            progresssView4.setProgress(70F).setReverse(false).startAnimal()
            progresssView5.setProgress(50f).setReverse(false).startAnimal()
            progresssView6.setProgress(90F).setReverse(false).startAnimal()
            progresssView1.setProgress(60F).setReverse(false).startAnimal()
            progresssView2.setProgress(60F).setReverse(false).startAnimal()
        }
//
        btnResver.setOnClickListener {
            progresssView.setProgress(90f).setReverse(true).startAnimal()
            progresssView3.setProgress(80f).setReverse(true).startAnimal()
            progresssView2.setProgress(60F).setReverse(true).startAnimal()
            progresssView4.setProgress(70F).setReverse(true).startAnimal()
            progresssView5.setProgress(50f).setReverse(true).startAnimal()
            progresssView6.setProgress(90F).setReverse(true).startAnimal()
            progresssView1.setProgress(60F).setReverse(true).startAnimal()
        }
    }
}
