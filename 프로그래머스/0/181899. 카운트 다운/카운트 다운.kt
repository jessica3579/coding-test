class Solution {
    fun solution(s: Int, e: Int): IntArray {
        var answer = mutableListOf<Int>()
        for(x in s downTo e) answer.add(x)
        return answer.toIntArray()
    }
}