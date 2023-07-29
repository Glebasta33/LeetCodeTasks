package task

class FizzBuzz412 {
    fun fizzBuzz(n: Int): List<String> {
        val result = mutableListOf<String>()

        repeat(n) {
            val i = it + 1
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz")
                return@repeat
            }
            if (i % 3 == 0) {
                result.add("Fizz")
                return@repeat
            }
            if (i % 5 == 0) {
                result.add("Buzz")
                return@repeat
            }
            result.add(i.toString())
        }

        return result
    }
}