class Solution {
    fun solution(todo_list: Array<String>, finished: BooleanArray) = todo_list.filterIndexed{
        i, _ -> !finished[i]
    }
}

        // var answer = mutableListOf<String>()
        // for(i in todo_list.indices){
        //     if(finished[i] == false) answer.add(todo_list[i])
        // }
        // return answer.toTypedArray()