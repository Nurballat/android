/**
 * Task: Contains Duplicate (LeetCode, Easy)
 * I put all the numbers into a Set. A Set can only keep unique values.
 * If the Set is smaller than the array, there is a duplicate number.
 */
class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.size != nums.toSet().size
    }
}
