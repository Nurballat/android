/**
 * Task: Valid Palindrome (LeetCode, Easy)
 * I remove all characters that are not letters or digits, then I make
 * everything lowercase. Then I check if the string is the same forwards
 * and backwards.
 */
class Solution {
    fun isPalindrome(s: String): Boolean {
        val cleaned = s.filter { it.isLetterOrDigit() }.lowercase()
        return cleaned == cleaned.reversed()
    }
}
