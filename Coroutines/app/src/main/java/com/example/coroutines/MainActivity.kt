package com.example.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coroutines.coroutinecontext.TestDispatchers
import com.example.coroutines.coroutinecontext.TestWithContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestWithContext.testMyFirstWithContextFunc()
    }
}