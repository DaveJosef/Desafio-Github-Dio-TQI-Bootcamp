function calculator() {
    const operation = Number(prompt('Escolha uma operação:\n 1 - soma\n 2 - subtração\n 3 - multiplicação\n 4 - divisão real\n 5 - divisão inteira\n 6 - potenciação'));

    if (!operation || operation > 6) {
        alert('Erro: operação inválida');
        calculator();
    } else {
        const n1 = Number(prompt('Insira o primeiro valor:'));
        const n2 = Number(prompt('Insira o segundo valor:'));

        if (!n1 || !n2) {
            alert('Erro: parâmetros inválidos');
            calculator();
        } else {

            function sum() {
                const resultado = n1 + n2;
                alert(`${n1} + ${n2} = ${resultado}`);
                askForNewOperation();
            }
        
            function sub() {
                const resultado = n1 - n2;
                alert(`${n1} - ${n2} = ${resultado}`);
                askForNewOperation();
            }
        
            function mult() {
                const resultado = n1 * n2;
                alert(`${n1} * ${n2} = ${resultado}`);
                askForNewOperation();
            }
        
            function divReal() {
                const resultado = n1 / n2;
                alert(`${n1} / ${n2} = ${resultado}`);
                askForNewOperation();
            }
        
            function divInt() {
                const resultado = n1 % n2;
                alert(`${n1} % ${n2} = ${resultado}`);
                askForNewOperation();
            }
        
            function exp() {
                const resultado = n1 ** n2;
                alert(`${n1} ** ${n2} = ${resultado}`);
                askForNewOperation();
            }

            function askForNewOperation() {
                const option = prompt('Deseja fazer outra operação?\n 1 - Sim\n 2 - Não');

                if (option == 1) {
                    calculator();
                } else if (option == 2) {
                    alert('Até mais!');
                } else {
                    alert('Digite uma opção válida!');
                    askForNewOperation();
                }
            }
        }
    }

    switch (operation) {
        case 1:
            sum();
            break;

        case 2:
            sub();
            break;

        case 3:
            mult();
            break;

        case 4:
            divReal();
            break;

        case 5:
            divInt();
            break;

        case 6:
            exp();
            break;
            
        default:
            sum();
            break;
    }
}

calculator();
