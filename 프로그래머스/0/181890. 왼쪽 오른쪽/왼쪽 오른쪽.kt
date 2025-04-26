class Solution {
    fun solution(arr: Array<String>): Array<String> {
        for(i in arr.indices){
            if(arr[i] == "l") return arr.sliceArray(0..i-1)
            if(arr[i] == "r") return arr.sliceArray(i+1..arr.lastIndex)
        }
        return arrayOf<String>()
    }
}