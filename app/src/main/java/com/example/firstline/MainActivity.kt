package com.example.firstline

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * apply 函数应用在启动Activity的时候
     */
    fun actionStart(context: Context) {
        val intent = Intent(context, MainActivity::class.java).apply {
            putExtra("param1", "data1")
            putExtra("param2", "data2")
        }
        context.startActivity(intent)
    }
}
