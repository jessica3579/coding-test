class Solution {
    fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String> {
        var answer = mutableListOf<String>()
        for(i in todo_list.indices){
            if(finished[i] == false) answer.add(todo_list[i])
        }
        return answer.toTypedArray()
    }
}