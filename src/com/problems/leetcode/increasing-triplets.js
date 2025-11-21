/**
 * @param {number[]} nums
 * @return {boolean}
 */
var increasingTriplet = function (nums) {
    let first = Infinity, second = Infinity;

    console.log(1 <= Infinity); 

    for (let num of nums) {
        if (num <= first) {
            first = num;
        } else if (num <= second) {
            second = num;
        } else {
            return true;
        }
    }

    return false;
};


const arr = [1, 2, 3, 4, 5];
console.log(increasingTriplet(arr));

