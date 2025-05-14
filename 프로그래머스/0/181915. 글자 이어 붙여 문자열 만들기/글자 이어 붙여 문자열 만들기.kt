class Solution {
    fun solution(my_string: String, index_list: IntArray): String {
        var answer: String = ""
        for(x in index_list){
            answer += my_string[x]
        }
        return answer
    }
}