class Solution {
    fun solution(i: Int, j: Int, k: Int): Int {
        var answer: Int = 0
        for(x in i..j){
            for(y in x.toString()){
                //println(y)
                if(y.digitToInt() == k) answer++
            }
        }
        return answer
    }
}