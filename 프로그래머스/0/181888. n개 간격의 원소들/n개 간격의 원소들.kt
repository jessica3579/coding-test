class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        var answer = mutableListOf<Int>()
        for(i in arr.indices step n){
            answer.add(arr[i])
        }
        return answer.toIntArray()
    }
}