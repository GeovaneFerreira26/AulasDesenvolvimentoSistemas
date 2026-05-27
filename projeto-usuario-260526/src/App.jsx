import './App.css'
import Footer from './components/Footer'
import Header from './components/Header'
import AdicionarUsuario from './pages/AdicionarUsuario'

function App() {
  
  return (
    <>
      <Header />
      <main>
        <AdicionarUsuario />
      </main>
      <Footer />
    </>
  )
}

export default App
