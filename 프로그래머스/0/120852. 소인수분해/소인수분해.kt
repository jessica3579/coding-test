class Solution {
    fun solution(n: Int): IntArray {
        var num = n
        var answer = mutableListOf<Int>()
        var i = 2
        
        while(i * i <= num){
            if(num % i == 0){
                answer.add(i)
                while(num % i == 0){
                    num /= i
                }
            }
            i++
        }
        
        if(num > 1){
            answer.add(num)
        }
        
        return answer.toIntArray()
    }
}