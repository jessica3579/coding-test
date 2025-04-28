class Solution {
    fun solution(num_str: String): Int {
        // var answer: Int = 0
        // for(x in num_str){
        //     answer += x.digitToInt()
        // }
        // return answer
        return num_str.map{ it.digitToInt() }.sum()
    }
}