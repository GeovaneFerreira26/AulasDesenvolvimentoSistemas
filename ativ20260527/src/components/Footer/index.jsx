import './style.css'
import logo_livro from '../../assets/logo_livro.svg'
export default function Footer(){
    return(
        <footer className='footer'>
            <img src= { logo_livro} alt="Logo do Livro" />
            <p>
                &copy; {new Date().getFullYear()} - Todos os direitos reservados.
                <br />
                SENAI - BA - GGK DEV
            </p>
        </footer>
    )
}