/**
 * Task: Sort Array By Parity (LeetCode, Easy)
 * I split the array into two lists: even numbers and odd numbers.
 * Then I put the even numbers first, and the odd numbers after them.
 */
class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        val (evens, odds) = nums.partition { it % 2 == 0 }
        return (evens + odds).toIntArray()
    }
}
