class Solution {
    fun solution(names: Array<String>): Array<String> {
        var answer = mutableListOf<String>()
        for(i in names.indices){
            if(i % 5 == 0) answer.add(names[i])
        }
        return answer.toTypedArray()
    }
}