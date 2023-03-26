class Solution(object):
    def reversePrefix(self, word, ch):
        """
        :type word: str
        :type ch: str
        :rtype: str
        """
        if ch not in word:
            return word
        ind = list(word).index(ch)
        l = (word[:ind+1][::-1])
        word = list(word)
        word[:ind+1] = l
        return ''.join(word)
