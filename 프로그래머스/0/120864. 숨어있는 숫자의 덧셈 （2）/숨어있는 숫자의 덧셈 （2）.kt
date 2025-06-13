class Solution {
    fun solution(my_string: String) = my_string.map { if(it.isDigit()) it else ' ' }.joinToString("").split(' ').filter{ it.isNotEmpty() }.map{ it.toInt() }.sum()
}