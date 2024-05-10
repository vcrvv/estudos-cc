//condição simples
var vel = 78         
console.log(`A velocidade do seu carro é de ${vel}Km/h`)
if (vel > 60) { 
    console.log('Voce foi MULTADO')
}
console.log('Dirija sempre com segurança!')


//condição composta
var num = '9'     
if (num > 10){ 
    console.log(`${num} é maior que 10`)
} else {
    console.log(`${num} nao é maior que 10`)
}


//condição aninhada
var idade = 20    
console.log(`voce tem ${idade} anos.`)
if (idade < 16) {
    console.log('nao vota')
} else if (idade < 18 || idade > 65) {
        console.log('voto opcional')  
} else {
    console.log('voto obrigatorio')
} 


//condição multipla
var agora = new Date() 
var diasem = agora.getDay()
switch(diasem) {
    case 0:
        console.log('Domingo')
        break;
    case 1: 
        console.log('Segunda')
        break;   
    case 2: 
        console.log('Terça')
        break;
    case 3: 
        console.log('Quarta')
        break;
    case 4: 
        console.log('Quinta')
        break;
    case 5: 
        console.log('Sexta')
        break;
    case 6: 
        console.log('Sabado')
        break; 
    default:
        console.log('Data Invalida')
        break;
}


   
