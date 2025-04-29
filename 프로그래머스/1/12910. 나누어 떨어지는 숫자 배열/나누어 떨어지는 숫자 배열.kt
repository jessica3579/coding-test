class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = mutableListOf<Int>()
        for(x in arr){
            if(x % divisor == 0) answer.add(x)
        }
        if(answer.isEmpty()) answer.add(-1)
        return answer.sorted().toIntArray()
    }
}