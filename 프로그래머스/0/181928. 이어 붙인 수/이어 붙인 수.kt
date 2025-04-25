class Solution {
    fun solution(num_list: IntArray): Int {
        var odd = ""
        var even = ""
        for(x in num_list){
            if(x % 2 == 0) even += "$x"
            else odd += "$x"
        }
        return odd.toInt() + even.toInt()
    }
}