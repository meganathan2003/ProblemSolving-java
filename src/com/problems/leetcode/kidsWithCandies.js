/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function (candies, extraCandies) {

    if (candies.length == 0 || extraCandies == 0) {
        return false;
    }
    var booleanList = [];

    for (let i = 0; i < candies.length; i++) {
        var currentCandies = candies[i] + extraCandies;
        flag = false;

        for (let j = 0; j < candies.length; j++) {
            if (candies[j] <= currentCandies) {
                flag = true;
            }
            else {
                flag = false;
                break;
            } 
        }
        if (flag) booleanList.push(true);
        else booleanList.push(false);
    }


    return booleanList;

};

const candies = [2, 3, 5, 1, 3];
const extraCandies = 3;
console.log(kidsWithCandies(candies, extraCandies));
