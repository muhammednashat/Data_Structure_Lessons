//package linkedlist
//
//fun main() {
//
//    val node1 = Node(value = 1)
//    val node2 = Node(value = 2)
//    val node3 = Node(value = 3)
//    val node4 = Node(value = 4)
//    val node5 = Node(value = 5)
//
//    node1.next = node2
//    node2.next = node3
//    node3.next = node4
//    node4.next = node5
//
//    println(node1)
//
//}
//data class Node<T>(var value: T, var next: Node<T>? = null) {
//
//    override fun toString(): String {
//
//        return if (next != null) {
//
//            "$value -> ${next.toString()}"
//        }
//
//        else {
//
//            "$value"
//        }
//    }
//}