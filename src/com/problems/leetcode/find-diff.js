/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[][]}
 */
var findDifference = function (nums1, nums2) {

    let ans1 = new Set(nums1);


    nums2.forEach(value => { ans1.delete(value) });
    console.log('ans1', ans1);

    let ans2 = new Set(nums2);    

    nums1.forEach(value => { ans2.delete(value) });

    return [[...ans1], [...ans2]];
};

const nums1 = [1, 2, 3];
const nums2 = [2, 4, 6];

console.log(findDifference(nums1, nums2));
