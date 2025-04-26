class Solution {
    fun solution(arr: IntArray): Int {
        var sum1 = 0
        var sum2 = 0
        for(i in arr.indices){
            if(i % 2 == 0) sum1 += arr[i]
            else sum2 += arr[i]
        }
        return maxOf(sum1, sum2)
    }
}