class Solution {
    fun solution(picture: Array<String>, k: Int): Array<String> {
        var answer = mutableListOf<String>()
        for(x in picture){
            var tmp = ""
            for(y in x){
                repeat(k){ tmp += y }
            }
            repeat(k){ answer.add(tmp) }
        }
        return answer.toTypedArray<String>()
    }
}