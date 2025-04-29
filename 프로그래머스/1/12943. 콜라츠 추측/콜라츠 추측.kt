class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var n= num.toLong()
        while(n != 1L && answer <= 500){
            if(n % 2L == 0L) n = n / 2L
            else n = n*3L + 1L
            answer++
        }
        return if(n == 1L) answer else -1
    }
}