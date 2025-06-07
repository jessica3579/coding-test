class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var str = my_string
        for(range in queries){
            if(range[0] == 0){
                str = str.substring(range[0], range[1]+1).reversed() + str.substring(range[1]+1)
            }else if(range[1] == str.length-1){
                str = str.substring(0, range[0]) + str.substring(range[0]).reversed()
            }else {
                str = str.substring(0, range[0]) + str.substring(range[0], range[1]+1).reversed() + str.substring(range[1]+1)
            }
        }
        return str
    }
}