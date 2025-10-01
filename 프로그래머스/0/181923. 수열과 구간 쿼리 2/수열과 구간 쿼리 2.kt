class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        val answer = IntArray(queries.size) { -1 }
        
        for (idx in queries.indices) {
            val (s,e,k) = queries[idx]
            
            
            for (i in s..e) {
                if (arr[i] > k) {
                    answer[idx] = if (answer[idx] == -1) arr[i] else minOf(answer[idx],arr[i])
                }
            }
        }
        return answer
    }
}