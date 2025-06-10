class Solution {
    fun solution(my_string: String): Int {
        val list = my_string.split(" ")
        var answer = list[0].toInt()
        for(i in 0..list.lastIndex){
            if(i % 2 == 1){
                if(list[i].equals("+")){
                    answer += list[i+1].toInt()
                }else {
                    answer -= list[i+1].toInt() 
                }
            }
        }
        return answer
    }
}