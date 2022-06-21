// estruturas condicionais
// de decisão
// if else
var jogador1 = 0;
var jogador2 = 1;
var placar;

// if ternário
jogador1 != -1 && jogador2 != -1 ? console.log('os jogadores são válidos') : console.log('os jogadores são inválidos');

if (jogador1 > 0 && jogador2 == 0) {
    console.log('jogador 1 marcou ponto');
    placar = jogador1 > jogador2;
} // else if
else if (jogador2 > 0 && jogador1 == 0) {
    console.log('jogador 2 marcou ponto');
    placar = jogador2 > jogador1;
} // else
else {
    console.log('ninguém marcou ponto');
}

// switch case
switch (placar) {
    case placar = jogador1 > jogador2:
        console.log('jogador1 ganhou');
        break;

    case placar = jogador2 > jogador1:
        console.log('jogador2 ganhou');
        break;

    default:
        console.log('ninguém marcou ponto');
        break;
}

// de repetição
let array = ['valor1', 'valor2', 'valor3', 'valor4', 'valor5'];
let object = {
    prop1: '12',
    prop2: 'valor2',
    prop3: 'valor3',
};
// for - executa até condição ser false
for (let i = 0; i < array.length; i++) {
    console.log('for i < 5 ', i);
}
// for in - repetição a partir de props
for (const i in array) {
    console.log('for i in array', i);
}
// com object
for (const i in object) {
    console.log('for i in object', i);
}
// for of - repetição a partir de valor
for (const i of array) {
    console.log('for i of array', i);
}
// com object não funciona, pois object não é iterável
for (const i of object.prop1) {
    console.log('for i of object.prop1', i);
}
// while - executa enquanto a condição for verdadeira
var a = 0;
while (a < 10) {
    a++;
    console.log('while a < 10', a);
}
// do - executa até que seja falsa
do {
    a++;
    console.log('do while a < 10', a);
} while (a < 10);
