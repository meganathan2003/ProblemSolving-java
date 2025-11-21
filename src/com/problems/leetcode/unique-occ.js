/**
 * @param {number[]} arr
 * @return {boolean}
 */
var uniqueOccurrences = function (arr) {

    arr.sort((a, b) => a - b);
    let val = [];

    for (var i = 0; i < arr.length; i++) {
        let count = 1;

        while (i + 1 < arr.length && arr[i] === arr[i + 1]) {
            count++;
            i++;
        }
        val.push(count);
    }

    // again sort for reduce the loop time
    val.sort((a, b) => a - b);

    for (var i = 1; i < val.length; i++) {
        if (val[i] === val[i - 1]) {
            return false;
        }
    }
    return true;

};

const arr = [1, 2];
console.log(uniqueOccurrences(arr));
