/**
 * @param {number[][]} grid
 * @return {number}
 */
var equalPairs = function (grid) {
    const n = grid.length;
    const rowMap = new Map();

    for (const row of grid) {
        const rowKey = row.join(",");
        rowMap.set(rowKey, (rowMap.get(rowKey) || 0) + 1);
    }

    let count = 0;

    for (let col = 0; col < n; col++) {
        const colKey = [];
        for (let row = 0; row < n; row++) {
            colKey.push(grid[row][col]);
        }
        const colString = colKey.join(",");
        count += rowMap.get(colString) || 0;
    }

    return count;
}

const grid = [
    [3, 2, 1],
    [1, 7, 6],
    [2, 7, 7]
];
console.log(equalPairs(grid)); 
