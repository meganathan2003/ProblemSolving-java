/**
 * @param {number[]} nums
 * @return {number}
 */
var longestSubarray = function (nums) {


    var left = 0;
    var zeroCount = 0;
    var maxLength = 0;

    // [0,1,1,1,0,1,0,0]
    for (var right = 0; right < nums.length; right++) {

        if (nums[right] === 0) {
            zeroCount++;
        }

        while (zeroCount > 1) {

            if (nums[left] === 0) {
                zeroCount--;
            }
            left++;
        }

        maxLength = Math.max(maxLength, right - left); //  r - L denote the current window size

    }

    return maxLength;

};

const arr = [1, 1, 0, 1];
console.log(longestSubarray(arr));


