import './styles.css'

export default function Footer() {
  return (
    <footer>
        <div className='footer'>
        <p>&copy; {new Date().getFullYear()} Gegeka. Todos os direitos reservados.</p>
        <br />
            <p>Desenvolvido por Gegeka</p>
        </div>
    </footer>
  )
}