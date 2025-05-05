class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 1
        var idx = 1
        var paint = section[0] + (m-1)
        while(idx < section.size){
            if(section[idx] > paint){
                answer++
                paint = section[idx] + (m-1)
            }
            idx++
        }
        return answer
    }
}