class Solution {
    fun solution(arr: IntArray): IntArray {
        val first = arr.indexOfFirst { it == 2 }
        val last = arr.indexOfLast { it == 2 }
        return if (first != -1 && last != -1 ) {
            if(arr.slice(first..last).isEmpty()){
                intArrayOf(-1)
            }else {
                arr.slice(first..last).toIntArray()
            }
        }else {
            intArrayOf(-1)
        }
    }
}