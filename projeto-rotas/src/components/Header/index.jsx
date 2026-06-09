import { Link, NavLink } from 'react-router-dom'
import './style.css'

export default function Header(){
    return(
        <header>
        <div>
            <Link to="/" className='header-logo'>
                        <h1>EMPRESA GGK EMPREENDIMENTOS</h1>
            </Link>
        </div>
        <nav>
            <NavLink>
                <Link to="/">HOME</Link>
            </NavLink>
            <NavLink>
                <Link to="/produtos">PRODUTOS</Link>
            </NavLink>
            <NavLink>
                <Link to="/servicos">SERVIÇOS</Link>
            </NavLink>
            <NavLink>
                <Link to="/sobre-nos">SOBRE NÓS</Link>
            </NavLink>
        </nav>
        </header>
    )
}