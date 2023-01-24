package com.example.coroutines.coroutinecontext

import android.util.Log
import com.example.coroutines.MainActivity
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

object TestWithContext {
    fun testMyFirstWithContextFunc() {
        newSingleThreadContext("Thread 1").use { context1 ->
            Log.d(
                MainActivity::class.java.simpleName,
                "Context 1 - Thread : ${Thread.currentThread().name}"
            )
            newSingleThreadContext("Thread 2").use { context2 ->
                Log.d(
                    MainActivity::class.java.simpleName,
                    "Context 2 - Thread : ${Thread.currentThread().name}"
                )
                runBlocking(context1) {
                  Log.d(MainActivity::class.java.simpleName, "Working in Context 1 - Thread : ${Thread.currentThread().name}"
                  )
                    withContext(context2){
                        Log.d(MainActivity::class.java.simpleName,"Working in Context 1 - Thread : ${java.lang.Thread.currentThread().name}"
                        )
                    }
                    Log.d(MainActivity::class.java.simpleName,"Back to Context 1 - Thread : ${java.lang.Thread.currentThread().name}"
                    )
                }
            }
        }
    }
}
