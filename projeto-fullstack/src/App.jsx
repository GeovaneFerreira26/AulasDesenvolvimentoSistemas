import './App.css'
import Header from './components/Header'
import Footer from './components/Footer'
import { Route, Routes } from 'react-router-dom'
import HomePage from './pages/HomePage'
import CadastroPage from './pages/CadastroPage'
import ListaUsuarioPage from './pages/ListaUsuarioPage'

function App() {


  return (
    <>
      <Header />
      <main>
        <Routes>
          <Route path="/" element={<HomePage />}/>
          <Route path="/cadastro" element={<CadastroPage />}/>
          <Route path="/lista-usuarios" element={<ListaUsuarioPage />}/>
        </Routes>

      </main>
      <Footer />
    </>
  )
}

export default App
