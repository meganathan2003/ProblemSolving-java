/**
 * @param {number[]} asteroids
 * @return {number[]}
 */
var asteroidCollision = function (asteroids) {

    let stack = [];

    for (var asteroid of asteroids) {
        let isDestroyed = false;

        while (stack.length > 0 && stack[stack.length - 1] > 0 && asteroid < 0) {

            let top = stack[stack.length - 1];

            if (Math.abs(top) < Math.abs(asteroid)) { // 2 < -2

                stack.pop(); // destory the top asteriod
            }

            else if (Math.abs(top) === Math.abs(asteroid)) {
                stack.pop();
                isDestroyed = true;
                break;
            }
            else {
                isDestroyed = true;
                break;
            }
        }

        if (!isDestroyed) {
            stack.push(asteroid);
        }
    }

    return stack;

};

let asteroids = [-2, -1, 1, 2];
console.log(asteroidCollision(asteroids));
