class Solution {
    fun solution(array: IntArray, n: Int) = array.minWithOrNull(compareBy({ kotlin.math.abs(it-n)}, {it} )) ?: -1
}