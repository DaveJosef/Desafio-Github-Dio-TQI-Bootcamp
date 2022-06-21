class ErroSaldoNegativo extends RangeError {
    constructor() {
        super();
        this.name = 'Erro de Saldo Negativo';
        this.message = 'Saldo da conta não pode ser negativo.';
    }
}

class ErroSaqueAlto extends RangeError {
    constructor() {
        super();
        this.name = 'Erro de Saque Alto';
        this.message = 'Valor informado para saque é alto demais.';
    }
}

class ContaBancaria {
    constructor(agencia, numero, tipo, saldo = 0.0) {
        if (saldo < 0) throw new ErroSaldoNegativo();
        this.agencia = agencia;
        this.numero = numero;
        this.tipo = tipo;
        this._saldo = saldo;
    }

    get saldo() {
        return this._saldo;
    }

    set saldo(saldo) {
        this._saldo = saldo;
    }

    sacar(valor) {
        if (this._saldo - valor < 0) throw new ErroSaqueAlto();
        this._saldo -= valor;
        return this._saldo;
    }

    depositar(valor) {
        this._saldo += valor;
        return this._saldo;
    }
}

class ContaCorrente extends ContaBancaria {
    constructor(cartaoCredito, agencia, numero, tipo = 'conta corrente', saldo) {
        super(agencia, numero, tipo, saldo);
        this._cartaoCredito = cartaoCredito;
    }

    get cartaoCredito() {
        return this._cartaoCredito;
    }

    set cartaoCredito(cartaoCredito) {
        this._cartaoCredito = cartaoCredito;
    }
}

class ContaPoupanca extends ContaBancaria {
    constructor(agencia, numero, tipo = 'conta poupanca', saldo) {
        super(agencia, numero, tipo, saldo);
    }
}

class ContaUniversitaria extends ContaBancaria {
    constructor(agencia, numero, tipo = 'conta universitaria', saldo) {
        super(agencia, numero, tipo, saldo);
    }

    sacar(valor) {
        if (valor >= 500) throw new ErroSaqueAlto();
        return super.sacar(valor);
    }
}

const conta = new ContaBancaria(101, 1);
const contaCorrente = new ContaCorrente(true, 12, 2);
const contaPoupanca = new ContaPoupanca(12, 3);
const contaUniversitaria = new ContaUniversitaria(12, 4);

console.log(conta);
console.log(conta.sacar(0));
console.log(conta);
console.log(conta.depositar(100));
console.log(conta);

console.log(contaCorrente);
console.log(contaCorrente.sacar(0));
console.log(contaCorrente);
console.log(contaCorrente.depositar(100));
console.log(contaCorrente);

console.log(contaPoupanca);
console.log(contaPoupanca.sacar(0));
console.log(contaPoupanca);
console.log(contaPoupanca.depositar(600));
console.log(contaPoupanca);
console.log(contaPoupanca.sacar(500));
console.log(contaPoupanca);

console.log(contaUniversitaria);
console.log(contaUniversitaria.sacar(0));
console.log(contaUniversitaria);
console.log(contaUniversitaria.depositar(600));
console.log(contaUniversitaria);
console.log(contaUniversitaria.sacar(500)); // Erro de saque alto demais
console.log(contaUniversitaria);
