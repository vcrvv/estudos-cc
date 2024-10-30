

export default function Comp3(){

    function criarLink(nome, url){
            return <a href={url}>{nome}</a>
    }
    
    
    return(
        <div>
            <p>{criarLink('FIAP', 'https://www.fiap.com.br')}</p>
            <p>{criarLink('GOOGLE', 'https://www.google.com')}</p>
        </div>
    )
}