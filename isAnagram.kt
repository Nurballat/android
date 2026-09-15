/**
 * Task: Valid Anagram (LeetCode, Easy)
 * I count how many times each letter appears in both words.
 * If the two letter-counts are the same, the words are anagrams.
 */
class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        return s.groupingBy { it }.eachCount() == t.groupingBy { it }.eachCount()
    }
}
