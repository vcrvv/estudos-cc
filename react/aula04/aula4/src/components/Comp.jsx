import { useEffect, useState } from "react";


export default function Comp(){
    const [valor, setValor] = useState(0)
    const [valor2, setValor2] = useState(0)

    useEffect(()=>{
        console.log("Sempre que chamar eu vou!!")
    })

    useEffect(()=>{
        console.log("Somente quando o valor é alterado")
    },[valor])

    useEffect(()=>{
        console.log("Somente quando o componente é criado")
    },[])

    useEffect(()=>{
        return ()=> console.log("Opa, me removeram")
    })


    return(
        <>
            <h2>Componente</h2>
            <p>o valor é {valor}</p>
            <p>o valor 2 é {valor2}</p>
            <button onClick={()=> setValor(valor + 1)}>Aumentar</button>
            <button onClick={()=> setValor2(valor2 + 1)}>Aumentar</button>
        </>
    )
}