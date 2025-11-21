/**
 * @param {number[]} gain
 * @return {number}
 */
var largestAltitude = function (gain) {


    let max = 0;
    let prevValue = 0;


    for (var i = 0; i < gain.length; i++) {

        if (gain[i] + prevValue > max) {
            max = gain[i] + prevValue;
        }

        // update the prevalue
        prevValue += gain[i];
    }

    return max;
};

const arr = [-4, -3, -2, -1, 4, 3, 2];
console.log(largestAltitude(arr));
