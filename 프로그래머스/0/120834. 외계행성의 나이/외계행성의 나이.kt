class Solution {
    fun solution(age: Int): String {
        var answer: String = ""
        var age = age
        while(age / 10 != 0 ){
            answer += (age % 10 + 'a'.toInt()).toChar()
            age /= 10
        }
        answer += (age % 10 + 'a'.toInt()).toChar()
        return answer.reversed()
    }
}