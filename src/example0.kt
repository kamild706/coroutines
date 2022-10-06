import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

/*fun main() {
    println(Thread.currentThread().name)
    GlobalScope.launch {
        println(Thread.currentThread().name)
//        delay(1000)
        println("World")
    }
    println("Hello,")
    Thread.sleep(4)
}*/

fun main() {
    println(Thread.currentThread().name)
    thread {
        println(Thread.currentThread().name)
        Thread.sleep(1000)
        println("World")
    }
    println("Hello,")
    Thread.sleep(4)
}