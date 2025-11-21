/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function (nums) {


    if (nums.length == 0) {
        return "";
    }

    var index = 0;

    for (var i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {

            // check if both index and i are not same
            if (index != i) {
                var temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
            index++;
        }
    }

    console.log(nums);
};


const arr = [0, 1, 0, 3, 12];
moveZeroes(arr);
