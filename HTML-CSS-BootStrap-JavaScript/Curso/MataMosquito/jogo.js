var altura = 0;
var largura = 0;

function ajustarTamanhoPalcoJogo() {

	altura = window.innerHeight;
	largura = window.innerWidth;
	console.log(altura, largura)

}

ajustarTamanhoPalcoJogo();

var posicaoX  = Math.floor(Math.random() * altura);
var posicaoY = Math.floor(Math.random() * largura);

console.log(posicaoX, posicaoY);