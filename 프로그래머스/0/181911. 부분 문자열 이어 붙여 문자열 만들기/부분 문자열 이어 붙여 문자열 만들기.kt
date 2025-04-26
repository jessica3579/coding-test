class Solution {
    fun solution(strArr: Array<String>, parts: Array<IntArray>): String {
        var answer: String = ""
        for(i in strArr.indices){
            answer += strArr[i].slice(parts[i][0]..parts[i][1])
        }
        return answer
    }
}