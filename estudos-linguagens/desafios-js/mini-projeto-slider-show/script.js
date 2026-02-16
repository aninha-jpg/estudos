const btnNext = document.getElementById('nextSlide');
const btnPrev = document.getElementById('prevSlide');
const slider = document.querySelector('.slider');
const conteudo = document.querySelector('.content');

const { width: sliderWidth } = window.getComputedStyle(slider);
const { width: contentWidth } = window.getComputedStyle(conteudo);

let slideAtual = 0;

const propSlider = {
    width: parseInt(sliderWidth),
    scroll: 0,
}

function setSlideAtual(){
    const dots = document.querySelectorAll('.dot')
    for(let dot of dots){
        dot.classList.remove('current')
    }
    dots[slideAtual].classList.add('current')
}

function controlSlide({target: { id }}) {
    const tamConteudo = conteudo.children.length;
    switch(id){
        case "nextSlide": {
            if(slideAtual < tamConteudo - 1){
                slideAtual += 1;
                setSlideAtual();
            }
            if(propSlider.scroll + propSlider.width < parseInt(contentWidth)){
            propSlider.scroll += propSlider.width;
            return slider.scrollLeft = propSlider.scroll;
            }
        }
            break;
        case "prevSlide":{
            if(slideAtual > 0){
            slideAtual -= 1;
            setSlideAtual();
            }
            propSlider.scroll = propSlider.scroll - propSlider.width < 0 ? 0 : propSlider.scroll - propSlider.width;
            return slider.scrollLeft = propSlider.scroll;
        }
            break;
        default:
            break;
    }
}

btnNext.addEventListener("click", controlSlide)
btnPrev.addEventListener("click", controlSlide)


window.onload = () => {
    const tamConteudo = conteudo.children.length;
    for (let i = 0; i < tamConteudo -1; i += 1){
        const newDot = slider.parentElement.querySelector('.dot').cloneNode()
        slider.parentElement.querySelector('.tamDot').appendChild(newDot);
    }
    setSlideAtual();
}