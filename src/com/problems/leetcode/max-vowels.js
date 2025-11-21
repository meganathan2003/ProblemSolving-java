/**
 * @param {string} s
 * @param {number} k
 * @return {number}
 */
var maxVowels = function (s, k) {

    if (!s.length || k <= 0) {
        return 0;
    }

    // Helper function to check vowel

    const isVowel = (char) => 'aeiou'.includes(char);

    var windowSum = 0;

    // here the loop for first add the k element 
    for (let i = 0; i < k; i++) {

        if (isVowel(s.charAt(i))) {
            windowSum++;
        }
    }
    var maxCount = windowSum;
    console.log('maxcount', maxCount);

    // "aeciiidef"
    for (let i = k; i < s.length; i++) {

        // check if perv char is vowel
        if (isVowel(s[i - k])) {
            windowSum--;
        }

        if (isVowel(s[i])) {
            windowSum++;
        }

        maxCount = Math.max(maxCount, windowSum);

    }

    return maxCount;
};


const s = "abciiidef";
const k = 3;
console.log(maxVowels(s, k));
