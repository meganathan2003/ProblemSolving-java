

/**
 * Merges two strings alternately.
 * @param {string} word1 - The first string.
 * @param {string} word2 - The second string.
 * @returns {string} - The merged string.
 * 
 * @author Meganathan
 */

var mergeAlternately = function (word1, word2) {

    if (!word1 || !word2) {
        return "";
    }

    var merged = "";
    let i = 0;

    while (i < word1.length || i < word2.length) {
        if (i < word1.length) {
            merged += word1[i];
        }
        if (i < word2.length) {
            merged += word2[i];
        }
        i++;
    }
    return merged;
};


let word1 = "abc";
let word2 = "pqr";
console.log(mergeAlternately(word1, word2));
