class Solution {
    fun solution(my_string: String) = my_string.filterNot{ it=='a' || it=='e' || it=='i' || it=='o' || it=='u'}
}