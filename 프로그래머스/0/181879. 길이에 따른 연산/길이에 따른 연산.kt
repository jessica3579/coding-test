class Solution {
    fun solution(num_list: IntArray): Int {
        if(num_list.size >= 11){
            var s1: Int = 0
            for(x in num_list) s1 += x
            return s1
        }else{
            var s2: Int = 1
            for(x in num_list) s2 *= x
            return s2
        }
    }
}