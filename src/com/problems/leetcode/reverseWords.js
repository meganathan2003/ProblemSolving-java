/**
 * @param {string} s
 * @return {string}
 */

var reverseWords = function (s) {

    const words = s.trim().split(' ');
    console.log('words',words);
    
    const newWords = words.filter(x => x !== "").reverse().join(" ");
    return newWords;

}

console.log(reverseWords("a good   example"));
