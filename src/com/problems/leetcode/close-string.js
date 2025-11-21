const closeStrings = (word1, word2) => {
    // Step 1: Check if lengths are equal
    if (word1.length !== word2.length) return false;

    const countFrequency = (word) => {
        const freq = new Array(26).fill(0);
        const uniqueChars = new Set();

        for (let char of word) {
            const index = char.charCodeAt(0) - 'a'.charCodeAt(0);
            freq[index]++;
            uniqueChars.add(char);
        }

        return { freq, uniqueChars };
    };

    const { freq: freq1, uniqueChars: set1 } = countFrequency(word1);
    const { freq: freq2, uniqueChars: set2 } = countFrequency(word2);

    if (set1.size !== set2.size) return false;
    for (let char of set1) {
        if (!set2.has(char)) return false;
    }

    freq1.sort((a, b) => a - b);
    freq2.sort((a, b) => a - b);

    return freq1.join('') === freq2.join('');
};

console.log(closeStrings("abc", "bca")); 
console.log(closeStrings("a", "aa")); 
console.log(closeStrings("cabbba", "abbccc")); 
