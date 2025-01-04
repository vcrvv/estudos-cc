import { useState } from "react";
import Componente1 from "./components/Componente1";


export default function App(){

    var nome = 'Javascript'

    var valor = 0

    const [valorState, setValorState] = useState(0)

    function aumentar() {
      valor += 1
      setValorState(valorState + 1)
    }

    return(
      <>
        <h1>Ola Mundo vindo do componente App!</h1>
        <p>O nome da linguagem é {nome} </p>
        <p>O valor é {valor}, valorState {valorState}</p>

        <Componente1   nome={nome} valor={valor} valorState={valorState} aumentar={aumentar}>
          <p>Componente passado de pai para filho</p>
        </Componente1>
  
        <button onClick={aumentar}>Aumentar valor</button>
      </>
    )
}