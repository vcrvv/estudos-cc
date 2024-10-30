import { useState } from "react";
import Comp from "./components/Comp";
import Comp2 from "./components/Comp2";
import Comp3 from "./components/Comp3";
import Comp4 from "./components/Comp4";

export default function App(){

  const [componente, setComponente] = useState(false)

  return(
    <>
      <h1>Ciclo de Vida</h1>
      {componente ? <Comp/> : ""}
      <button onClick={()=>setComponente(!componente)}>
        {componente ? "Desmontar" : "Montar"}
      </button> 
      
      <br/>
      <Comp2/>
      <br/>
      <Comp3/>
      <br/>
      <Comp4/>

    </>
  )

}