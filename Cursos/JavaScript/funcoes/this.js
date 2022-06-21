function calculaIdade(anos) {
	return `Daqui a ${anos} anos, ${this.nome} terá ${
		this.idade + anos
	} anos de idade.`;
}

const person = {
	nome: 'João',
	idade: 18,
};
console.log(calculaIdade.call(person, 20)); // Daqui a 20 anos, João terá 38 anos de idade.
console.log(calculaIdade.apply(person, [20])); // Daqui a 20 anos, João terá 38 anos de idade.
