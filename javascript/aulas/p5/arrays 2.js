let valores = [1, 9, 4, 6, 5, 8]
//
console.log(valores)
//

for(let pos=0; pos < valores.length; pos++) {
    console.log(`A posição ${pos} tem o valor ${valores[pos]}`)
}
// 

pos = 0
while (pos < valores.length) {
    console.log(`são ${valores[pos]}`)
    pos++
}
//

for(let pos in valores) {
    console.log(`A posição ${pos} tem o valor ${valores[pos]}`)
}
//
