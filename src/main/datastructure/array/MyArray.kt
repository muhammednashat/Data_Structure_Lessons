package array

import kotlin.Array

class MyArray(val size: Int) {

    var length = 0
    private val elements = Array(size) { 0 }

    fun add(element: Int) {
        if (length == size) {
            throw ArrayIndexOutOfBoundsException("Index $length out of bounds for length $length ")
        }
        elements[length++] = element
    }

    fun isEmpty() = length == 0

    fun search(element: Int): Boolean {

        if (isEmpty()) return false
        else {
            elements.forEach {
                if (element == it) return true
            }
            return false
        }
    }

    fun getAtIndex(index: Int): Int {
        return if (isEmpty()) -1
        else elements[index]
    }

}

fun main() {
    val arr = MyArray(4)
    arr.add(1)
    arr.add(2)
    arr.add(2)
    arr.add(2)
    arr.add(2)
    arr.add(2)
    arr.add(2)
    System.out.println(arr.search(1))
}