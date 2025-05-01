class Solution {
    fun solution(numbers: IntArray): Double {
        var sum = 0
        for(x in numbers) sum += x
        return sum / numbers.size.toDouble()
    } 
    //numbers.average()
}