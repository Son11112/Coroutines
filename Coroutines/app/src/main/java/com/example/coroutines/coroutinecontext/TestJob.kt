package com.example.coroutines.coroutinecontext

import kotlinx.coroutines.*


//fun main(){
//    val job: Job= GlobalScope.launch {
//        delay(2000)
//        println("Hello Kitty")
//    }
//    val job2:Job= GlobalScope.launch {
//        job.join()
//        delay(1000)
//        println("i'm coroutines")
//    }
//
//    Thread.sleep(4000)
//}

fun main(){
    runBlocking {
       val job =  launch(Dispatchers.Default) {
           repeat(1000){
               delay(500)
               println("i'm sleeping $it...")

           }
       }
        delay(1500)
        job.cancel()
        println("cancelled coroutines")
    }
}