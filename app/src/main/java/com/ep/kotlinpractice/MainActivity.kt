package com.ep.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0:View?){
                // to do..
            }
        })

        // 코틀린 람다 사용 방식
        // 1. Kotlin interface가 아닌 자바 인터페이스여야 한다.
        // 2. 하나의 메서드만을 가진 함수형 인터페이스여야 한다.
        // setOnClickListener는 1개의 메서드를 가진 Java 인터페이스

        button.setOnClickListener{

        }


    }
}