class Solution {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var answer = arr
        for(i in query.indices){
            if(i % 2 == 0) answer = answer.copyOfRange(0, query[i]+1)
            else answer = answer.copyOfRange(query[i], answer.size)
        }
        return answer
    }
}