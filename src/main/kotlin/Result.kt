sealed class Result {
    data class Success(val result: String) : Result()
    data class Error(val explanation: String) : Result()
}

internal val resultsList = listOf(
    Result.Success("Completed"), Result.Success("Ended"), Result.Success("Finished"),
    Result.Error("Internet Unavailable"), Result.Error("Incorrect URl"),
    Result.Error("Server not responding")
)
