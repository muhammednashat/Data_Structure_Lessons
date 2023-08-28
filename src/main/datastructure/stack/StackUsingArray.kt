package stack


class StackUsingArray(private val sizeOfStack: Int) {

    private var array = Array(sizeOfStack) { 0 }
    var size = 0
    private fun isEmpty() = size == 0
    private var top = -1

    fun printStack() {
        if (isEmpty()) {
            print(" stack is empty")
        } else {
            for (index in top downTo 0 step 1) {
                print("${array[index]} -> ")
            }
        }
        println()
    }

    fun push(value: Int) {
        if (top == sizeOfStack.minus(1)) {
            println("stack is full")
        } else {
            array[++top] = value
            size++
        }
    }

    fun pop(): Int? {
        return if (!isEmpty()) {
            val item = array[top--]
            size--
            item

        } else null

    }

    fun peek(): Int? {
        return if (!isEmpty()) {
            array[top]
        } else null
    }

}

fun main() {

    var stack = StackUsingArray(5)
    stack.push(11)
    stack.push(22)
    stack.push(33)
    stack.push(44)
    stack.push(55)
    println(stack.printStack())
    println(stack.pop())
    println(stack.printStack())
    println(stack.size)
    println(stack.peek())
}