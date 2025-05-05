class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        for(x in my_string){
            if(x.isDigit()) answer += x.digitToInt()
        }
        return answer
    }
}