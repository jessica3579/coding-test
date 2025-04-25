class Solution {
    fun solution(num_list: IntArray): Int {
        var multi = 1
        var sum = 0
        for(x in num_list){
            multi *= x
            sum += x
        }
        return if(multi < sum*sum) 1 else 0
    }
}