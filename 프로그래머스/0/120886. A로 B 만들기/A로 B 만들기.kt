class Solution {
    fun solution(before: String, after: String) = if(before.map{ it }.sorted().equals(after.map{ it }.sorted())) 1 else 0
}