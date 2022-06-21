const replaceIfOdd = (value) => {
    if (!(value % 2)) return 0;
    return value;
}

const replaceOdds = (array) => {
    if (!array.length) return -1;
    return array.map(value => replaceIfOdd(value));
}

const replaceOdds2 = (array) => {
    if (!array) return -1;
    for (let i = 0; i < array.length; i++) {
        array[i] = replaceIfOdd(array[i]);
    }
    return array;
}

// -1
console.log(replaceOdds([]));
// [1, 3, 0, 0, 0, 33, 23, 0]
console.log(replaceOdds([1, 3, 4, 6, 80, 33, 23, 90]));
console.log(replaceOdds2([1, 3, 4, 6, 80, 33, 23, 90]));
