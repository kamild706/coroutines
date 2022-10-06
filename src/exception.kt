import kotlinx.coroutines.*
import java.io.File

fun main() {
    runBlocking {

        GlobalScope.launch {
            println("hello")
            withContext(Dispatchers.IO) {
//                throw FileAlreadyExistsException(File(""))
                action()
            }
        }
        delay(200)
        println("end")
    }
}

private suspend fun action() {
    try {
        throw FileAlreadyExistsException(File(""))
    } catch (e: Exception) {
        println("caught")
    }
}
