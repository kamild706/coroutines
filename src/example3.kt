import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main() = runBlocking {
    repeat(100_000) { // launch a lot of coroutines
        launch {
            delay(1000L)
            print(".")
        }
    }
}

/*
fun main() = runBlocking {
    repeat(100_000) { // launch a lot of coroutines
        thread {
            Thread.sleep(1000L)
            print(".")
        }
    }
}*/
