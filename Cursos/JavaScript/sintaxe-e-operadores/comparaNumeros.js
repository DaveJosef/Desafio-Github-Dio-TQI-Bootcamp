function checkLessThan(num, valor) {
    if (num === valor) {
        return 'o mesmo';
    }
    if (num < valor) return 'menor';
    return 'maior';
}

function checkLessThan10(num) {
    return checkLessThan(num, 10);
}

function checkLessThan20(num) {
    return checkLessThan(num, 20);
}

function checkEquality(num1, num2) {
    if (num1 === num2) return 'são iguais';
    return 'não são iguais';
}

function compare(num1, num2) {
    const sum = num1 + num2;
    const saoIguais = checkEquality(num1, num2);
    const menorMaior20 = checkLessThan20(sum);
    const menorMaior10 = checkLessThan10(sum);
    return `Os números ${num1} e ${num2} ${saoIguais}. Sua soma é ${sum}, que é ${menorMaior10} que 10 e ${menorMaior20} que 20.`;
    //return `Os números 1 e 2 não são iguais. Sua soma é 3, que é menor que 10 e menor que 20.`;
}

console.log(compare(1, 2));
