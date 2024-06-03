function parimp(n) {
    if (n%2 == 0) {
        return 'PAR!'
    } else {
        return 'IMPAR!'
    }
}
console.log(parimp(7))
console.log('-')

//

function soma(n1=0, n2=0) {
    return n1 + n2
}
console.log(soma(2, 10))
console.log('-')
//

let v = function(x) {
    return x*2
}
console.log(v(10))
console.log('-')
//

let m = function(x, y) {
    return (x + y) / 2
}
console.log(m(5, 25))