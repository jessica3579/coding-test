class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        for(x in arr){
            for(i in 1..x){
                answer.add(x)
            }
        }
        return answer.toIntArray()
    }
}