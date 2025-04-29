class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        for(x in minOf(a, b)..maxOf(a, b)) answer += x
        
        return answer
    }
}