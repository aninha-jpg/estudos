/*

utilizando o material do site free code camp


*/


const calculator = document.querySelector('.calculator')
const keys = calculator.querySelector('.calculator_keys')

keys.addEventListener('click', e => {
 if (e.target.matches('button')) {
    const key = e.target;
    const action = key.dataset.action;
    // se nao houver ação é um numero
    if (!action) {
    console.log('Tecla Numeral!')
    } else if(action === 'decimal') {
        console.log('decimal key')
    } else if(action === 'clear') {
        console.log("limpar");
    } else if(action === 'calculate') {
        console.log('igual!')
    } else if(['add', 'subtract', 'multiply', 'divide'].    includes(action)) {
        console.log('operador!')
    }
    }
})

// display

const display = document.querySelector('.calculator_display')

keys.addEventListener('click', e => {
    if(e.target.matches('button')) {
        const key = e.target;
        const action = key.dataset.action;
        const keyContent = key.textContent;
        const displayNum = display.textContent;
        // substituindo o numero do visor:
        if(!action) {
            if (displayNum === '0'){
                display.textContent = keyContent;
            } else {
                display.textContent = displayNum + keyContent;
        }
        // inserindo o . dos numeros decimais
        if(action === 'decimal') {
            display.textContent = displayNum + '.'
        }

        // se apertarem essas teclas elas ficam destacadas
        if(
            action === 'add' ||
            action === 'subtract' ||
            action === 'multiply' ||
            action === 'divide'
        ) {
            key.classList.add('is-depressed')
        }
    }
    }
})

