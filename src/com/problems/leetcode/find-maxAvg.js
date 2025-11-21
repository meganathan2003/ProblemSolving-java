/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findMaxAverage = function (nums, k) {

    if (!nums.length || k < 0) {
        return 0;
    }

    let windowSum = 0;

    for (var i = 0; i < k; i++) {

        // add the first four element and divide by k
        windowSum += nums[i];
    }


    // this is previous sum
    let maxSum = windowSum;

    for (let i = k; i < nums.length; i++) {

        // here window slide logic
        windowSum = windowSum - nums[i - k] + nums[i];
        maxSum = Math.max(maxSum, windowSum);

    }

    return maxSum / k;

};

const arr = [1, 2, 3, 4]; // 6 - 4  = 2
const k = 3;
console.log(findMaxAverage(arr, k));
