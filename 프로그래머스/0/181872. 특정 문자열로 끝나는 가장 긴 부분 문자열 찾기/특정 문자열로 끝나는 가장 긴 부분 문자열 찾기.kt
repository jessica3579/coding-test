class Solution {
    fun solution(myString: String, pat: String): String {
        var lastIdx = 0
        for(i in 0..myString.length - pat.length){
            if(myString.substring(i, i + pat.length) == pat) lastIdx = i
        }
        return myString.substring(0, lastIdx + pat.length)
    }
}