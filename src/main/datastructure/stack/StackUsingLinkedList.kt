package stack



data class Node<T>(var value: T, var next: Node<T>? = null) {

    override fun toString(): String {

        return if (next != null) {

            "$value -> ${next.toString()}"
        }

        else {

            "$value"
        }
    }
}


class StackUsingLinkedList <T>{

     var head: Node<T>? = null

     var size = 0

     val isEmpty
        get() = size == 0

    fun push(item : T){
        if (head == null){
            head = Node(item)
        }else{
            val newNode= Node(item , head)
            head = newNode
        }
       size++
    }

    fun pop():T?{
     return  if (isEmpty){
         println("Stack is Empty")
         null
     }else{
         val item = head?.value
            size--
         head = head?.next
         return item
     }
    }

    fun peek():T?{
        return  if (isEmpty){
            println("Stack is Empty")
            null
        }else{
            return head?.value
            null
        }
    }

}

fun main() {
    val stack = StackUsingLinkedList<String>()
    stack.push("Ahmed")
    stack.push("Mohammed")
    stack.push("Mostafa")
    stack.push("Islam")
//    println(stack.head.toString())
//    println(stack.isEmpty)
//    println(stack.size)
//    println(stack.pop())
//    println(stack.peek())
//    println(stack.pop())
//    println(stack.pop())
//    println(stack.pop())
//    println(stack.pop())
//    println(stack.head.toString())
//    println(stack.pop())
//    println(stack.head.toString())





}
