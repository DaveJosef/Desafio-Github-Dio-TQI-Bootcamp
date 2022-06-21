class MyReferenceError extends ReferenceError {
    constructor() {
        super();
        this.name = 'Undefined Parameters Error';
        this.message = 'Please define parameters.';
    }
}

class MyTypeError extends TypeError {
    constructor(parameterName, expectedType) {
        super();
        this.name = 'Unexpected Type Error';
        this.message = `The ${parameterName} parameter must be of type ${expectedType}.`;
    }
}

class MyRangeError extends RangeError {
    constructor() {
        super();
        this.name = 'Incompatible Range Error';
        this.message = 'The range must be the same as array length.';
    }
}

const validateArray = (array, number) => {
    if (!array && !number) throw new MyReferenceError();
    if (typeof array !== 'object') throw new MyTypeError('array', 'object');
    if (typeof number !== 'number') throw new MyTypeError('number', 'number');
    if (array.length !== number) throw new MyRangeError();
    return array;
}

const handleValidateArray = () => {
    try {
        validateArray([], 0); // []
        validateArray([1, 2, 3], 3); // [1, 2, 3]
        //validateArray([]); // error with number type
        //validateArray('array'); // error with array type
        validateArray([1, 2, 3], 0); // error with range of array
    } catch (error) {
        if (error instanceof ReferenceError) {
            console.log('There was an error with undefined parameters.');
            console.log(error.name);
            console.log(error.message);
        }
        if (error instanceof TypeError) {
            console.log('There was an error with parameter type.');
            console.log(error.name);
            console.log(error.message);
        }
        if (error instanceof RangeError) {
            console.log('The length of the array was not equal the number informed.');
            console.log(error.name);
            console.log(error.message);
        }
    }
}

handleValidateArray();
