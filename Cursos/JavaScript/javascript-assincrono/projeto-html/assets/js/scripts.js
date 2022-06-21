const form = document.getElementById('form-cats');
const catImage = document.getElementById('cat-img');
const buttonChange = form.children[0];

// logic
const loadCat = async () => {
    try {
        const data = await fetch('https://api.thecatapi.com/v1/images/search');
        const json = await data.json();
        return json[0].url;
    } catch (error) {
        console.log(error);
    }
}

const changeCat = async () => {
    catImage.setAttribute('src', 'https://upload.wikimedia.org/wikipedia/commons/a/a3/Lightness_rotate_36f_cw.gif');
    catImage.setAttribute('width', '30%');
    const newSrc = await loadCat();
    catImage.setAttribute('src', newSrc);
    catImage.setAttribute('width', '100%');
}

// add listeners
buttonChange.addEventListener('click', changeCat);
changeCat();
