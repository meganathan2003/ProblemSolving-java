
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var maxOperations = function (nums, k) {

    if (!nums.length || k < 0) {
        return [];
    }

    let left = 0;
    let right = nums.length - 1

    let maxOp = 0;
    while (left < right) {

        let currentSum = nums[left] + nums[right];

        if (currentSum === k) {
            maxOp++;

        }

        left++;
        right--;
    }

    return maxOp;

};

var nums = [4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4]; //  5 < 5
console.log(maxOperations(nums, 5));
