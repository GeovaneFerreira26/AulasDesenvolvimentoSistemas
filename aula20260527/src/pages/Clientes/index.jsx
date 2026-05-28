import './style.css'
import logo_ggk from '../../assets/logo_ggk.svg'

// CONTEÚDO PRINCIPAL DA PÁGINA.
export default function Clientes(){
    return(
        <div className='clientes'>
        <h3>Cadastrar Clientes</h3>
        <img src={ logo_ggk } alt="Logo da empresa" />
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolores cumque sequi nobis eius necessitatibus libero quibusdam, culpa rerum alias possimus delectus sapiente vitae labore eligendi dolorum hic dicta magnam aspernatur?</p>
        </div>
    )
}