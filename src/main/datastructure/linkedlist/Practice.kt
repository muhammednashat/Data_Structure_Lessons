package linkedlist

fun main() {

    val linkedList = LinkedList2<Int>()
    linkedList.push(1).push(2).push(4).push(6).push(8).push(10)
    linkedList.getFirst()?.let { println(it.value) }
    linkedList.getLast()?.let { println(it.value) }
//    linkedList1.append(1).append(2).append(3).append(4).append(5)
//    println(linkedList)

//    println("Before inserting: $linkedList")

//    var middleNode = linkedList.nodeAt(3)!!
//    linkedList.insertAfter(9, middleNode)
//    middleNode = linkedList.nodeAt(2)!!
//    linkedList.insertAfter(7, middleNode)
//    middleNode = linkedList.nodeAt(4)!!
//    linkedList.insertAfter(5, middleNode)
//    middleNode = linkedList.nodeAt(6)!!
//    linkedList.insertAfter(3, middleNode)
//    println("After inserting: $linkedList")

//
//    linkedList.insertBefore(12,middleNode)
//    println("After inserting: $linkedList")

}


data class NodePr<T>(val value: T, val next: NodePr<T>? = null) {

    override fun toString(): String {

        return if (next != null) {
            " $value ~~~~~ ${next.toString()} "
        } else {
            "$value"
        }
    }
}


class LinkedList2<T>() {
    private var head: NodePr<T>? = null
    private var tail: NodePr<T>? = null
    private var size = 0
    fun getFirst() = head
    fun getLast() = tail
    fun push(value: T): LinkedList2<T> {

        head = NodePr(value, head)

        if (tail == null) {
        } else {
            head = NodePr(value)
        }
        size++
        return this
    }
}