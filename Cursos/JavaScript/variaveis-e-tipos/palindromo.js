class MyError extends RangeError {
    constructor() {
        super();
        this.name = 'Empty String Error';
        this.message = 'Empty String Detected!';
    }
}

const verifyPalindrome = (string) => {
    if (!string) throw new MyError();
    for (let i = 0; i < string.length / 2; i++) {
        if (string[i] !== string[string.length - 1 - i]) {
            return false;
        }
    }
    return true;
}

const verifyPalindrome2 = (string) => {
    if (!string) throw new MyError();
    return string === string.split('').reverse().join('');
}

console.log(verifyPalindrome('ama'));
console.log(verifyPalindrome2('ama'));
/* console.log(verifyPalindrome(''));
console.log(verifyPalindrome2(''));
 */