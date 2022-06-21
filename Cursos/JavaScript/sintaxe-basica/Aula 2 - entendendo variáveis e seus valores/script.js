// tipos primitivos
// boolean
var boolean = false;
console.log(`A variável ${boolean} tem o tipo ${typeof(boolean)}`);
// number
var numero = 1;
console.log(`A variável ${numero} tem o tipo ${typeof(numero)}`);
// string
var nome = 'David';
console.log(`A variável ${nome} tem o tipo ${typeof(nome)}`);
// function
var funcao = function () {};
console.log(`A variável ${funcao} tem o tipo ${typeof(funcao)}`);

// como declarar
// escopo global ou local, inicia nula - var
// usar let em escopo local ao invés de var, por convenção
var aluno = 'David';
var aluno = 'david';

function nomeDaFuncao() {
    var nota = '10';
    console.log(nota);
}

console.log(aluno);
nomeDaFuncao();
// escopo local de bloco, inicia nula - let
// escopo local de bloco, inicialização obrigatória - const
// valor inalterável
const constante = 'constante';

// atribuição
var atribuicao = 'valor';
// comparação
var comparacao = "0" == 0;
console.log(comparacao);
// comparação idêntica
var comparacaoIdentica = "0" === 0;
console.log(comparacaoIdentica);

// operadores aritméticos
// adição
var adicao = 1 + 1;
console.log('O valor de 1 + 1 é igual a', adicao);
// subtração
var subtracao = 2 - 1;
console.log('O valor de 2 - 1 é igual a', subtracao);
// multiplicação
var multiplicacao = 2 * 3;
console.log('O valor de 2 * 3 é igual a', multiplicacao);
// divisão real
var divisaoReal = 6 / 2;
console.log('O valor de 6 / 2 é igual a', divisaoReal);
// divisão inteira
var divisaoInteira = 5 % 2;
console.log('O valor de 5 % 2 é igual a', divisaoInteira);
// potenciação
var potenciacao = 2**10;
console.log('O valor de 2**10 é igual a', potenciacao);

// operadores relacionais
// maior que
var maiorQue = 5 > 2;
console.log('É 5 > 2?', maiorQue);
// menor que
var menorQue = 5 < 2;
console.log('É 5 < 2?', menorQue);
// maior ou igual a
var maiorOuIgualA = 5 >= 2;
console.log('É 5 >= 2?', maiorOuIgualA);
// menor ou igual a
var menorOuIgualA = 5 <= 2;
console.log('É 5 <= 2?', menorOuIgualA);

// operadores lógicos
// true, se ambos os operandos forem true
var e = true && true;
console.log('É true && true?', e);
// true, se pelo menos um operando for true
var ou = true || false;
console.log('É true || false?', ou);
// inverte o valor
var nao = !true;
console.log('É !true?', nao);
