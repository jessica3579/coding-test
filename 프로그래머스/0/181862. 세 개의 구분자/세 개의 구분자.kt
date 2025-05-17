class Solution {
    fun solution(myStr: String): Array<String> {
        val result = myStr.split('a', 'b', 'c').filter { it.isNotEmpty() }
        
        return if(result.isEmpty()) arrayOf("EMPTY") else result.toTypedArray()
    }
}