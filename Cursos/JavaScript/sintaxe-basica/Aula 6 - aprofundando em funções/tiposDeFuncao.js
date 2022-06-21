// tipos de funcao
// funcao declarativa - deve ser nomeada
function nomeDaFuncao() {
    alert('Sou uma função declarativa!');
}
// chamando-a
nomeDaFuncao();

// expressão de função - nomeação opcional
// nomeada
var funcao = function funcao() {
    alert('Sou uma expressão de função nomeada!');
}
// sem nome
var funcao = function () {
    alert('Sou uma expressão de função não nomeada!');
}

// arrow function - função de expressão de sintaxe curta, anônima
var funcao = () => {
    alert('Sou uma função anônima!');
}
funcao();
