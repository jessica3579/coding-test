class Solution {
    fun solution(my_string: String): String {
        // var answer = mutableSetOf<Char>()
        // for(x in my_string) answer.add(x)
        // return answer.joinToString("")
        return my_string.toList().distinct().joinToString("")
    }
}