class Solution {
    fun solution(num_list: IntArray): IntArray{
        // num_list.sort()
        // return num_list.sliceArray(0..4)
        return num_list.sortedArray().take(5).toIntArray()
    }
}