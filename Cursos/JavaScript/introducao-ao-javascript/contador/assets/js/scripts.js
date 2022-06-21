const form = document.getElementById('form-contador');
const buttonDecrement = form.children[0];
const numberPanel = form.children[1];
const buttonIncrement = form.children[2];

// logic
function changeValue(value) {
    numberPanel.innerText = value;
}

function changeColor(value) {
    numberPanel.classList.remove('negative-value');
    if (value < 0) {
        numberPanel.classList.add('negative-value');
    }
}

function disableButtons(value) {
    buttonDecrement.disabled = false;
    buttonIncrement.disabled = false;
    if (value <= 0) {
        buttonDecrement.disabled = true;
    }
    if (value >= 10) {
        buttonIncrement.disabled = true;
    }
}

function increment() {
    let value = parseInt(numberPanel.innerText);
    value++;
    changeValue(value);
    changeColor(value);
    //disableButtons(value);
}

function decrement() {
    let value = parseInt(numberPanel.innerText);
    value--;
    changeValue(value);
    changeColor(value);
    //disableButtons(value);
}

// add listeners
buttonDecrement.addEventListener('click', decrement);
buttonIncrement.addEventListener('click', increment);

numberPanel.value = 0;
