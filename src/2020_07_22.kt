
// 2020 July 22 - Dung Nguyen

//Problem #480 [Medium]

//This problem was asked by Microsoft.
//
//Given a dictionary of words and a string made up of those words (no spaces), return the original sentence in a list.
// If there is more than one possible reconstruction, return any of them. If there is no possible reconstruction, then return null.
//
//For example, given the set of words 'quick', 'brown', 'the', 'fox', and the string "thequickbrownfox",
// you should return ['the', 'quick', 'brown', 'fox'].
//
//Given the set of words 'bed', 'bath', 'bedbath', 'and', 'beyond', and the string "bedbathandbeyond",
// return either ['bed', 'bath', 'and', 'beyond] or ['bedbath', 'and', 'beyond'].


fun main() {

    val dict1 = listOf<String>("quick", "brown", "the", "fox")
    val sentence1 = "thequickbrownfox"

    val dict2 = listOf<String>("bed", "bath", "bedbath", "and", "beyond")
    val sentence2 = "bedbathandbeyond"

}

fun bruteForceReturnSentenceArray(sentence: String, dict: List<String>): List<String>? {
    return null
}

fun returnSentenceArray(sentence: String, dict: List<String>): List<String>? {
    return null
}

