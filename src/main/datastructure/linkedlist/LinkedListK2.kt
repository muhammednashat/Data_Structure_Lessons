package linkedlist

fun main() {

    val linkedList = LinkedList<Int>()
    linkedList.push(1).push(2).push(4).push(6).push(8).push(10)
//    println(linkedList)
//    linkedList.getFirst()?.let { println(it.value) }
//    linkedList.getLast()?.let { println(it.value) }
    linkedList.append(22)

//    println(linkedList)

//    println("Before inserting: $linkedList")

    var middleNode = linkedList.nodeAt(3)!!
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

class LinkedList<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    fun isEmpty() = size == 0
    fun getFirst() = head
    fun getLast() = tail

    override fun toString(): String {

        return if (isEmpty()) {
            "List Is Empty "
        } else {
            head.toString()
        }
    }
    // add a value at the first of the list
    fun push(value: T): LinkedList<T> {
        head = Node(value = value, next = head)
        if (tail == null) {
            tail = head
        }
        size++
        return this
    }
    // add a value at the end of the list
    fun append(value: T): LinkedList<T> {
        return if (isEmpty()) {
            push(value)
        } else {
            tail?.next = Node(value = value)
            System.out.println(" " + tail?.value + " " + tail?.next)
            tail = Node(value = value)
            System.out.println(" " + tail?.value + " " + tail?.next)
            size++
            this
        }
    }
    // return s node at index
    fun nodeAt(index: Int): Node<T>? {
        var currentNode = head
        var currentIndex = 0
        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next
            currentIndex++
        }
        return currentNode
    }
    fun insertAfter(value: T, afterNode: Node<T>): Node<T> {
        return if (tail == afterNode) {
            append(value)
            tail!!
        } else {
            val newNode = Node(value = value, next = afterNode.next)
            afterNode.next = newNode
            size++
            newNode
        }
    }

}



