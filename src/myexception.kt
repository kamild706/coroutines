import kotlinx.coroutines.*
import java.io.File

fun f3() {
    throw FileAlreadyExistsException(File(""))
}

suspend fun f2() = withContext(Dispatchers.IO) {
    try {
        f3();
        return@withContext true
    } catch (e: Exception) {
        return@withContext false
    }
}

suspend fun f1(): Boolean {
    return f2()
}

fun main() {
    runBlocking {
        GlobalScope.launch {
            val result = f1()
            println("The result is $result")
        }
        delay(200L)
    }

}