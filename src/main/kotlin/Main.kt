import task.maximumWealth

fun main() {

    val input = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(5, 2, 3),
        intArrayOf(1, 2, 4),
    )

    maximumWealth(input).apply {
        println(this)
    }

}