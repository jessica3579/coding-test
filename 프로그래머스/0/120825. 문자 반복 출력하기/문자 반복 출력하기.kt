class Solution {
    fun solution(str: String, n: Int): String {
        // var answer: String = ""
        // for(x in str){
        //     for(y in 1..n){
        //         answer += x
        //     }
        // }
        // return answer
        return str.map { it.toString().repeat(n) }.joinToString("")
    }
}