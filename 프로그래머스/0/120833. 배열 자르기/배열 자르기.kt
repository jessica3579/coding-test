class Solution {
    fun solution(numbers: IntArray, num1: Int, num2: Int) = numbers.filterIndexed{ idx, _ -> idx >= num1 && idx <= num2 }
}