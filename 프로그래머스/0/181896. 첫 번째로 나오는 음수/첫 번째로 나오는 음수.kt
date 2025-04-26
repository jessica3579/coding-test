class Solution {
    fun solution(arr: IntArray): Int {
        for(i in arr.indices){
            if(arr[i] < 0) return i
        }
        return -1
    }
}