/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var longestOnes = function (nums, k) {

    var start = 0; // you access the index value
    var maxLength = 0;
    var zeroCount = 0;

    for (let end = 0; end < nums.length; end++) {

        if (nums[end] === 0) {
            zeroCount++;
        }


        while (zeroCount > k) { //  2 > 2
            if (nums[start] === 0) {
                zeroCount--;
            }
            start++;
        }


        maxLength = Math.max(maxLength, end - start + 1); // 
    }

    return maxLength;



};

const nums = [1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0];
const k = 2;
console.log(longestOnes(nums, k));