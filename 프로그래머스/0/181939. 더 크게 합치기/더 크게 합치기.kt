class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        val str1: String = a.toString() + b.toString()
        val str2: String = b.toString() + a.toString()
        if(str1.toInt() > str2.toInt()) answer = str1.toInt()
        else answer = str2.toInt()
        
        return answer
    }
}