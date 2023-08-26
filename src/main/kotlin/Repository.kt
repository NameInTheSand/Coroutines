import java.util.concurrent.TimeUnit

class Repository {

    fun getRemoteData(callback: (result: Result) -> Unit) {
        callback.invoke(resultsList.random())
    }

    fun saveData(data: String, callback: (result: String) -> Unit) {
        TimeUnit.SECONDS.sleep(3)
        callback.invoke(data)
    }

}