import java.util.Stack

class Solution {
    fun solution(arr: IntArray): IntArray {
        val stk = Stack<Int>()

        for (element in arr) {
            if (stk.isNotEmpty() && stk.peek() == element) {
                stk.pop()
            } else {
                stk.push(element)
            }
        }

        return if (stk.isEmpty()) {
            intArrayOf(-1)
        } else {
            stk.toIntArray()
        }
    }
}