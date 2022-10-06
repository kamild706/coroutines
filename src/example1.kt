import kotlinx.coroutines.*

fun main() = runBlocking {
    println(Thread.currentThread().name)
    /*val job = GlobalScope.*/launch {
        println(Thread.currentThread().name)
        repeat(1000) { i ->
            println("I'm sleeping $i ...")
            delay(500L)
        }
    }
//    delay(600)
    println("Hello")
//    job.cancel()
//    println("Canceled")
//    job.join()
//    delay(1300L)
}
