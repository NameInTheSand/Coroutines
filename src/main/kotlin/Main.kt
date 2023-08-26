import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() {
    val coroutinesRepository = CoroutinesRepository()
    runBlocking {
        launch {
            when (val remoteData = coroutinesRepository.getRemoteData()) {
                is Result.Success -> coroutinesRepository.saveData(data = remoteData.result)
                is Result.Error -> println(remoteData.explanation)
            }
        }
    }

    val repository = Repository()
    val thread = Thread {
        repository.getRemoteData { remoteData:Result ->
            when (remoteData) {
                is Result.Success -> {
                    repository.saveData(data = remoteData.result) { result:String ->
                        println(result)
                    }
                }

                is Result.Error -> println(remoteData.explanation)
            }
        }
    }
    thread.start()
}





