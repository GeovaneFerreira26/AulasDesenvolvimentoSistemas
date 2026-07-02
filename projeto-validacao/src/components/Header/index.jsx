import { Link } from 'react-router-dom';
import './styles.css';

export default function Header() {
    return (
        <header>
            <div className='header'>
                <nav>
                    <Link to="/">Home</Link>
                    <Link to="/cadastro">Cadastro</Link>
                    <Link to="/lista">Lista</Link>
                </nav>
            </div>
        </header>
    )
}