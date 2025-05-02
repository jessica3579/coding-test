class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        for(x in n.toString()){
            answer += x.digitToInt()
        }

        return answer
    }
}