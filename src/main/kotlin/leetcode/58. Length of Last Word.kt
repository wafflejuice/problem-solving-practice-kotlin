package leetcode

fun lengthOfLastWord(s: String): Int {
    return s.split(' ').last { it.isNotEmpty() }.length
}
