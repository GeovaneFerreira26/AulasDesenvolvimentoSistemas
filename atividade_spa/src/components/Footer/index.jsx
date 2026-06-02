import './style.css'

// FICARÁ NO FINAL DAS PÁGINAS (RODA-PÉ)
export default function Footer(){
    return(
        <footer className='footer'>
            <p>
                &copy; {new Date().getFullYear()} - Todos os direitos reservados.
                <br />
                SENAI Bahia
                <br />
                Idealizado e desenvolvido por GGK DEV 👨🏾‍💻
            </p>
        </footer>
    )
}