package leetcode

fun mostWordsFound(sentences: Array<String>): Int {
    return sentences.map { it.split(" ").size }.max()!!
}
