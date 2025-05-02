class Solution {
    fun solution(n: Int): Int {
        // var answer = 0
        // for(x in n.toString()){
        //     answer += x.digitToInt()
        // }
        var input = n
        var answer = 0
        while(input != 0){
            answer += input % 10
            input /= 10
        }
        return answer
    }
}