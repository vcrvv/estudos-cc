function Comp4(){

    const numeros = [1,2,3,4,5]
  
    let loop = numeros.map((valor, indice)=>(
        <li key={indice}>{`O valor é ${valor}`}</li>
    ))
  
    return(
        <div>
            <ul>{loop}</ul>
        </div>
    )
  }
export default Comp4