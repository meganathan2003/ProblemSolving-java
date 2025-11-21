/**
 * @param {string} str1
 * @param {string} str2
 * @return {string}
 * 
 * @author Meganthan
 * Find the GCD among in strings
 */


var gcdOfStrings = function (str1, str2) {
    if (str1 + str2 != str2 + str1) return "";

    const a = str1.length;
    const b = str2.length;

    const gcd = (x, y) => {
        if (!y) return x;
        return gcd(y, x % y);
    }

    const remainder = gcd(a, b);
    return (str1.slice(0, remainder));
}
let str1 = "ABABAB";
let str2 = "ABAB";
console.log(gcdOfStrings(str1, str2));
