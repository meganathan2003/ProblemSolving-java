/**
 * @param {number[]} nums
 * @return {number}
 */
var pivotIndex = function (nums) {


    // calculate the total sum first
    let totalSum = nums.reduce((sum, num) => sum + num, 0);

    console.log('total-sum',totalSum);
    

    // [1,7,3,6,5,6]

    let leftSum = 0;

    for (var i = 0; i < nums.length; i++) {

        let rightSum = totalSum - leftSum - nums[i]; // 0 - 0 - 1 

        console.log("rigthsum", rightSum);


        if (leftSum === rightSum) return i;
        leftSum += nums[i];
    }

    return -1;



};

const nums = [1, 7, 3, 6, 5, 6];
console.log(pivotIndex(nums));
