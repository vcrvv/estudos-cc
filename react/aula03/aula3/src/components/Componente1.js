

export default function Componente1(props) {

    return(
        <> 
            <h2>Esse é o Componente1</h2>

            <p>O nome recebido do componente pai é {props.nome}</p>

            <p>O valor vindo de App é {props.valor}, valorState {props.valorState}</p>

            <button onClick={props.aumentar}>Aumentar pelo componente filho</button>

            {props.children}
        </>
    )

}