class Solution {
    fun solution(strArr: Array<String>) = strArr.mapIndexed{
        i, v -> if(i % 2 == 0) v.lowercase() else v.uppercase()
    }
}