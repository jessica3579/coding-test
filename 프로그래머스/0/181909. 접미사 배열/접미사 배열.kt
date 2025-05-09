class Solution {
    fun solution(my_string: String): Array<String> {
        var answer = mutableListOf<String>()
        for(x in 1..my_string.length){
            answer.add(my_string.takeLast(x))
        }
        return answer.sorted().toTypedArray()
    }
}