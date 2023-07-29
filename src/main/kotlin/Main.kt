import task.RansomNoteSolution333

fun main() {
    listOf(
//        "ab" to "aa",
//        "bb" to "bba",
        "bb" to "bbab",
//        "ccd" to "c"
    ).forEach {
        RansomNoteSolution333().canConstruct(it.first, it.second).also { result ->
            println("${it.first} - ${it.second} = $result")
        }
    }

}