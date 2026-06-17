import './styles.css'

export default function Footer() {
    return(
        <footer className='footer'>
            <p>&copy; {new Date().getFullYear()} - All rights reserved.
                <br />
                SENAI - Bahia
            </p>
        </footer>
    )
}