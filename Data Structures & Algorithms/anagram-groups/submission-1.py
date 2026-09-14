class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = dict()
        for word in strs:
            count = [0] * 26  
            for char in word:
                count[ord(char) - ord('a')] += 1
            key = tuple(count)
            hashmap.setdefault(key, []).append(word)
        return list(hashmap.values())





        