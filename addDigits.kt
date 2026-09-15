/**
 * Task: Add Digits (LeetCode, Easy)
 * I add the digits of the number together. If the answer has more than
 * one digit, I do it again. I stop when the answer is only one digit.
 */
class Solution {
    fun addDigits(num: Int): Int {
        return generateSequence(num) { current ->
            if (current < 10) null else current.toString().sumOf { it.digitToInt() }
        }.last()
    }
}
