class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        var answer = mutableListOf<Int>()
        for(i in arr.indices){
            if(flag[i]){
                for(j in 1..arr[i]*2){
                    answer.add(arr[i])
                    
                }
            }else{
                repeat(arr[i]){
                    answer.removeAt(answer.lastIndex)
                }
            }
        }
        
        return answer.toIntArray()
    }
}