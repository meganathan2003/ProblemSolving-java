/**
 * @param {string} s
 * @return {string}
 */
var removeStars = function (s) {

    let stack = [];

    for (var i = 0; i < s.length; i++) {
        if (s.charAt(i) === '*') {
            stack.pop(i - 1);
        }
        else {
            stack.push(s.charAt(i));
        }
    }

    let str = "";

    stack.forEach((ele) => {
        str += ele;
    });

    return str;

};

let s = "erase*****";
console.log(removeStars(s));
