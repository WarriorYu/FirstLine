package com.example.firstline.kotlin04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstline.R

class SecondActivity : AppCompatActivity() {

    // private var adapter:MsgAdapter? = null
    /**
     * lateinit 关键字  对于不可为空的全局变量，这样就不用在一开始的时候将它赋值为null
     *
     * 注意：一定要确保在初始化后再使用adapte,否则会报 UninitializedPropertyAccessException
     */
    private lateinit var adapter: MsgAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // "::adapter.isInitialized" 判断lateinit 修饰的属性是否已经赋值
        if (!::adapter.isInitialized) {
            adapter = MsgAdapter()
        }
    }
}
