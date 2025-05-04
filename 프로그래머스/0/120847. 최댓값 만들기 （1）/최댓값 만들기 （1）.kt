class Solution {
    fun solution(numbers: IntArray) = numbers.sorted().let{it[it.lastIndex] * it[it.lastIndex-1]}
}