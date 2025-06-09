class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var numer = numer1 * denom2 + numer2 * denom1
        var denom = denom1 * denom2 
        // 분모의 인자로 분수를 나눌 수 있으면 나누기
        for(x in 2..denom/2){
            if(numer % x == 0 && denom % x == 0){
                while(numer % x == 0 && denom % x == 0){
                    numer /= x
                    denom /= x
                }
            }
        }
        return intArrayOf(numer, denom)
    }
}