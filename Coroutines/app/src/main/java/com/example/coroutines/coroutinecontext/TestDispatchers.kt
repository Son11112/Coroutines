package com.example.coroutines.coroutinecontext

import android.util.Log
import com.example.coroutines.MainActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext

object TestDispatchers {
    fun runMyFirstCourotines(){
        GlobalScope.launch (Dispatchers.Default){
            Log.d(MainActivity::class.java.simpleName,"Dispatcher Default run on ${Thread.currentThread().name}")
        }
        GlobalScope.launch (Dispatchers.IO){
            Log.d(MainActivity::class.java.simpleName,"Dispatcher IO run on ${Thread.currentThread().name}")
        }
        GlobalScope.launch (Dispatchers.Main){
            Log.d(MainActivity::class.java.simpleName,"Dispatcher Main run on ${Thread.currentThread().name}")
        }
        GlobalScope.launch (Dispatchers.Unconfined){
            Log.d(MainActivity::class.java.simpleName,"Dispatcher Unconfined run on ${Thread.currentThread().name}")
        }
        GlobalScope.launch (newSingleThreadContext("My Thread")){
            Log.d(MainActivity::class.java.simpleName,"run on ${Thread.currentThread().name}")
        }
    }
}