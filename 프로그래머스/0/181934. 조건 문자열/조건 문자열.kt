class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        var answer: Int = 0
        val op = ineq + eq
        when(op){
            ">=" -> answer = if(n>=m) 1 else 0
            "<=" -> answer = if(n<=m) 1 else 0
            ">!" -> answer = if(n>m) 1 else 0
            "<!" -> answer = if(n<m) 1 else 0
        }
        return answer
    }
}