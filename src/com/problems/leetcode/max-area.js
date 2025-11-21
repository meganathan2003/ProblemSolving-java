/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function (height) {

    if (height.length < 2) return 0;

    var left = 0;
    var right = height.length - 1;

    var maxWaterCanStore = 0;

    while (left < right) {

        // here you have to find the area formula
        let min = Math.min(height[left], height[right]);

        console.log("min", min);


        // area formula  a = height x width
        let area = min * (right - left);

        console.log('area', area);


        if (area > maxWaterCanStore) {

            maxWaterCanStore = area;
        }
        if (height[left] < height[right]) left++;
        else right--;

    }
    return maxWaterCanStore;
};

const arr = [8, 7, 2, 1];
console.log(maxArea(arr));
