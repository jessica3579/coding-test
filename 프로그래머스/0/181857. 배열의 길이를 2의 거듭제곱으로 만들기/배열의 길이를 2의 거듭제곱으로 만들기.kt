class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = arr.toMutableList()
        var t = 1
        while(t < arr.size){
            t *= 2
        }
        repeat(t - arr.size){
            answer.add(0)
        }
        return answer.toIntArray()
    }
}