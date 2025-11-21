/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function (nums) {

    if (!nums.length) {
        return [];
    }

    var n = nums.length;

    let answer = new Array(n).fill(n);



    // perfix product
    let prefix = 1;

    for (var i = 0; i < n; i++) {
        answer[i] = prefix;
        prefix *= nums[i];
    }

    let suffix = 1;

    for (var i = n - 1; i >= 0; i--) {
        answer[i] *= suffix;
        suffix *= nums[i];
    }
    return answer;
};

const nums = [1, 2, 3, 4];
console.log(productExceptSelf(nums));
