
// 2020 July 21 - Dung Nguyen

//Problem #479 [Easy]

//This problem was asked by Microsoft.
//
//Given a number in the form of a list of digits, return all possible permutations.
//
//For example, given [1,2,3], return [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]].


fun main() {
    val inputs: ArrayList<ArrayList<Int>> = arrayListOf(
        arrayListOf(1, 2, 3),
        arrayListOf(2, 3, 4, 5),
        arrayListOf(10, 12, 14, 16, 20),
        arrayListOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
    )

    inputs.forEach { input ->
        val result = getMutationsByRecursive(input)
        println("size ${result.size}, $result")
    }
}

fun getMutationsByRecursive(input: ArrayList<Int>): List<List<Int>> {
    val result = ArrayList<ArrayList<Int>>()
    helper(0, input, result)
    return result
}

fun helper(start: Int, input: ArrayList<Int>, result: ArrayList<ArrayList<Int>>) {
    if (start == input.size - 1) {
        val list = ArrayList<Int>()
        input.forEach { num ->
            list.add(num)
        }
        result.add(list)
    }

    (start until input.size).forEach { i ->
        swap(input, i, start)
        helper(start + 1, input, result)
        swap(input, i, start)
    }
}

fun swap(input: ArrayList<Int>, a: Int, b: Int) {
    val temp = input[a]
    input[a] = input[b]
    input[b] = temp
}
