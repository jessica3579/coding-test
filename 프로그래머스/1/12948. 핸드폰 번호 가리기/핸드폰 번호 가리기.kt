class Solution {
    fun solution(str: String): String {
        var answer = ""
        for(i in 1 .. str.length - 4){
            answer += "*"
        }
        return answer + str.slice(str.length-4 .. str.length-1)
    }
}