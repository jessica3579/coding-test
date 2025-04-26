class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        var answer = mutableListOf<Int>()
        for(i in n-1..arr.size-1) answer.add(arr[i])
        return answer.toIntArray()
    }
}