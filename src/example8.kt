import kotlinx.coroutines.*
import kotlin.system.*

fun main() = runBlocking {
    val time = measureTimeMillis {
        val one = async {
            log("one")
            val result = doSomethingUsefulOne()
            log("one finished")
            result
        }
        val two = async {
            log("two")
            val result = doSomethingUsefulTwo()
            log("two finished")
            result
        }
        println("here")
        println("The answer is ${one.await() + two.await()}")
    }
    println("Completed in $time ms")
}