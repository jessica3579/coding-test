class Solution {
    fun solution(s: String): Boolean {
        // var answer = true
        // if(s.length != 4 && s.length != 6) return false
        // for(i in s.indices){
        //     if(!s[i].isDigit()) return false
        // }
        // return answer
        return (s.length == 4 || s.length == 6) && s.toIntOrNull() != null
    }
}