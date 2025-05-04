class Solution {
    fun solution(numbers: IntArray) 
    // = numbers.sorted().let{it[it.lastIndex] * it[it.lastIndex-1]}
    = numbers.sorted().takeLast(2).fold(1){ acc, i -> acc * i}
}