class Solution {
    fun solution(arr: IntArray, idx: Int): Int {
        var idx: Int = idx
        while(idx < arr.size){
            if(arr[idx] == 1) return idx
            idx++
        }
        return -1
    }
}