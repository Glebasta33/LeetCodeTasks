package task

fun maximumWealth(accounts: Array<IntArray>): Int {
    var max = 0
    accounts.forEach { customer ->
        val sum = customer.sum()

        if (sum > max) {
            max = sum
        }
    }

    return max
}