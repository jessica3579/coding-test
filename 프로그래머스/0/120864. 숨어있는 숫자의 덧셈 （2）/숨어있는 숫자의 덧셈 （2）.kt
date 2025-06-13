// class Solution {
//     fun solution(my_string: String) = my_string.map { if(it.isDigit()) it else ' ' }.joinToString("").split(' ').filter{ it.isNotEmpty() }.map{ it.toInt() }.sum()
// }

class Solution {
    fun solution(my_string: String): Int  = 
    my_string.split("[A-z]+".toRegex())
        .filter(String::isNotEmpty)
        .sumOf(String::toInt)
}