class Solution {
    fun solution(arr: IntArray, n: Int) =  arr.sliceArray(n..arr.lastIndex) + arr.sliceArray(0..n-1)
}