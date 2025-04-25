class Solution {
    fun solution(code: String): String {
        var answer: String = ""
        var mode = 0
        for(i in code.indices){
            if(code[i] == '1') mode = if(mode==0) 1 else 0
            else {
                if(mode==0 && i%2==0) answer += code[i]
                else if(mode==1 && i%2==1) answer += code[i]
            }
        }
        if(answer.isEmpty()) return "EMPTY"
        return answer
    }
}