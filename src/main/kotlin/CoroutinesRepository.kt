import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class CoroutinesRepository {

    suspend fun getRemoteData(): Result {
        return withContext(Dispatchers.IO) { resultsList.random() }
    }

    suspend fun saveData(data: String) {
        delay(3000)
        println(data)
    }

}