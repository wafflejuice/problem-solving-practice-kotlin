package leetcode

import leetcode.dataStructure.Node

fun postorder(root: Node?): List<Int> {
    if (root == null) return emptyList()
    return root.children.flatMap { postorder(it) } + root.`val`
}
