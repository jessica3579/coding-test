class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
        val s = setOf(a, b, c).size
        if(s == 3) return a + b + c
        else if(s == 2) return (a+b+c)*(a*a+b*b+c*c)
        else return (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c)
    }
}