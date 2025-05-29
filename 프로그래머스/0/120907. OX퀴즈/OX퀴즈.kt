class Solution {
    fun solution(quiz: Array<String>): Array<String> {
        var answer = mutableListOf<String>()
        for(q in quiz){
            val list = q.split(" ").filterNot{ it == " " }
            val a = list[0].toInt()
            val b = list[2].toInt()
            var result: Int? = null
            
            if(list[1] == "+") result = a + b
            else result = a - b
            
            answer.add(if(result == list[4].toInt()) "O" else "X")
            
        }
        return answer.toTypedArray<String>()
    }
}