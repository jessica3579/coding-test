class Solution {
    fun solution(number: String): Int {
        var sum: Int = 0
        for(x in number){
            sum += x.digitToInt()
        }
        return sum % 9
    }
}