
const h1 = document.getElementById('page-title');
const button = document.getElementById('mode-selector');
const footer = document.getElementsByTagName('footer')[0];
const body = document.getElementsByTagName('body')[0];

const DARK_MODE_CLASS = 'dark-mode';
const TEXTS = {
    LIGHT: 'Light Mode',
    DARK: 'Dark Mode',
}

// logic
const toggleModeFor = (element) => {
    element.classList.toggle(DARK_MODE_CLASS);
}

function checkForClass(element, classText) {
    return element.classList.contains(classText);
}

function setTextOf(element, text) {
    element.innerText = text;
}

const swapTexts = () => {
    if (checkForClass(body, DARK_MODE_CLASS)) {
        setTextOf(button, TEXTS.LIGHT);
        setTextOf(h1, `${TEXTS.DARK} ON`);
        return;
    }
    setTextOf(button, TEXTS.DARK);
    setTextOf(h1, `${TEXTS.LIGHT} ON`);
}

function toggleMode(event) {
    toggleModeFor(h1);
    toggleModeFor(button);
    toggleModeFor(footer);
    toggleModeFor(body);
    swapTexts();
}

button.addEventListener('click', toggleMode);
