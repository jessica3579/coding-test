class Solution {
    private val primes = BooleanArray(2998)

    init {
        for (i in 2..55) {
            if (primes[i]) continue
            for (j in i + i..2997 step i) {
                primes[j] = true
            }
        }
    }

    fun solution(nums: IntArray): Int {
        var count = 0
        for (i in 0 until nums.size - 2) {
            for (j in i + 1 until nums.size - 1) {
                for (k in j + 1 until nums.size) {
                    if (!primes[nums[i] + nums[j] + nums[k]]) count++
                }
            }
        }
        return count
    }
}