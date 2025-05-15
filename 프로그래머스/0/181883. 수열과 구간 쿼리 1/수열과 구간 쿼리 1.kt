class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        for(query in queries){
            val (s, e) = query
            for(i in s..e){
                arr[i] += 1
            }
        }
        
        return arr
    }
}