class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        // var box: Int = 0
        // var rest = 0
        // for(i in k downTo 1){
        //     if(box < score.size / m){
        //         box = (score.count{it == i} + rest) / m
        //         rest = (score.count{it == i}  + rest)% m
        //         answer += box * m * i
        //     } else return answer
        // }
        // return answer
        var num = 0
        score.sortDescending()
        score.forEach{
            num++
            if(num % m == 0) answer += it * m
        }
        return answer
    }
}