class Solution {
    fun solution(str: String, pre: String): Int {
        var idx: Int = 0
        if(str.length >= pre.length){
            for(x in pre){
                if(x != str[idx]) return 0
                idx++
            }   
        }else return 0
    
        return 1
    }
}