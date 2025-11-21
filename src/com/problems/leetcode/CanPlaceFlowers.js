
/**
 * @param {number[]} flowerbed
 * @param {number} n
 * @return {boolean}
 */
var canPlaceFlowers = function (flowerbed, n) {

    if (!flowerbed) {
        return false;
    }

    for (var i = 0; i < flowerbed.length; i++) {
        if (n !== 0) {
            if (flowerbed[i] === 0) {

                // check the previous and next
                let prev = i === 0 || flowerbed[i - 1] === 0; // false
                let next = i === flowerbed.length - 1 || flowerbed[i + 1] === 0; // true

                if (prev && next) {
                    // plant the flower
                    flowerbed[i] = 1;
                    n--;
                    if (n === 0) return true;
                }
            }
        }
    }

    return n === 0;

};

var flowerbed = [1, 0, 0, 0, 1, 0, 0], n = 2;

console.log(canPlaceFlowers(flowerbed, n));
