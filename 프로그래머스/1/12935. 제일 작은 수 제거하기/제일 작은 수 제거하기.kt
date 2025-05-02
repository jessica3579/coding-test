class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        var min = arr[0]
        if(arr.size == 1){
            answer.add(-1)
            return answer.toIntArray()
        }
        
        for(x in arr){
            if(x < min) min = x
        }
        for(x in arr){
            if(x != min) answer.add(x)
        }
        return answer.toIntArray() 
    }
}