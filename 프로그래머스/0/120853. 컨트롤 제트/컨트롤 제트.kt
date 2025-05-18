class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var list = s.split(" ")
        var tmp = 0
        for(x in list){
            if(x == "Z") answer -= tmp
            else {
                answer += x.toInt()
                tmp = x.toInt()
                println(answer)
            }
        }
        return answer
    }
}