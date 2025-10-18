class Solution {
    fun solution(answers: IntArray): IntArray {
        val userAnswers = arrayOf(
         intArrayOf(1, 2, 3, 4, 5),
         intArrayOf(2, 1, 2, 3, 2, 4, 2, 5),
         intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        )
        val correctCnt = IntArray(3)
        val res = mutableListOf<Int>()
        
        userAnswers.forEachIndexed { i, arr ->
    correctCnt[i] = answers.filterIndexed { j, answer -> answer == arr[j % arr.size] }.count()
}
        
        correctCnt.forEachIndexed { index, i -> if (correctCnt.maxOrNull() == i) res.add(index + 1) }
return res.toIntArray()
    }
}