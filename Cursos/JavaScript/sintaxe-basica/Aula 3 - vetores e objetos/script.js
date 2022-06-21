// arrays ou vetores
// declaração entre colchetes
// armazenamento heterogêneo
let array = ['string', 1, true, ['array1'], ['array2']];
console.log(array);
// acessando índice
console.log(array[0]);

// manipulando
// forEach - passa cada item como argumento para a função informada
array.forEach(function (item, index) {
    console.log('ForEach está no elemento ' + item + ', indice ' + index);
});
// push - add item no final
array.push('novo item');
console.log('array com push de novo item', array);
// pop - remove item no final
array.pop();
console.log('array com pop', array);
// shift - remove item no começo
array.shift();
console.log('array com shift', array);
// unshift - add item no começo
array.unshift('novo item');
console.log('array com unshift de novo item', array);
// indexOf - retorna índice de determinado item
console.log('indexOf true', array.indexOf(true));
// splice - remove ou substitui item por índice
array.splice(0, 3);
console.log('array com splice 0, 3', array);
// slice - retorna parte de array
console.log('array com slice 0, 3', array.slice(0, 3));

// objetos
// declaração entre chaves
// armazenamento heterogêneo análogo ao dos arrays
const object = {
    string: 'string',
    number: 1,
    boolean: true,
    array: ['array'],
    objectInterno: {
        objetoInterno: 'objeto interno'
    }
}
console.log('Object ', object);
// acessando propriedades com ponto
console.log('Objeto interno de object ', object.objectInterno);

// manipulando
// desestruturando...
/* const string = object.string;
const number = object.number;
const boolean = object.boolean; */
// ...com chaves
const { string, number, boolean } = object;
console.log(string, number, boolean);
