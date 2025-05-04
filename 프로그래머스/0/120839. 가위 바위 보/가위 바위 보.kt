class Solution {
    fun solution(rsp: String): String {
        // var answer: String = ""
        // for(x in rsp){
        //     if(x == '2') answer += "0"
        //     else if(x == '5') answer += "2"
        //     else answer += "5"
        // }
        // return answer
        return rsp.map{ 
            when(it){
                '0'-> '5'
                '2'-> '0'
                else -> '2'
            } }.joinToString("")
    }
}