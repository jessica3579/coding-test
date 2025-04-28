class Solution {
    fun solution(myString: String) = myString.map{
        it -> if(it.toInt() < 'l'.toInt()) 'l' else it
    }.joinToString("")
}