import java.util.*
class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        var queue: LinkedList<A> = LinkedList()
        for(i in priorities.indices) queue.offer(A(i, priorities[i]))
        while(queue.isNotEmpty()){
            val tmp = queue.poll()
            if (queue.any { it.priority > tmp.priority }) {
                queue.offer(tmp)
            } else {
                answer++
                if (tmp.id == location) return answer
            }
        }
        return answer
    }
}
class A(val id: Int, val priority: Int)