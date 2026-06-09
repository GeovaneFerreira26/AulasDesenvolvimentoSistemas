import { Route, Routes } from 'react-router-dom'
import './App.css'
import Header from './components/Header'
import Footer from './components/Footer'
import Home from './pages/Home'
import SobreNos from './pages/SobreNos'
import Produtos from './pages/Produtos'
import Servicos from './pages/Servicos'




function App() {
  return (
    <>
    <Header />
    <main>
      <Routes>
        <Route path='/' element={<Home />} />
        <Route path='/produtos' element={<Produtos />} />
        <Route path='/servicos' element={<Servicos />} />
        <Route path='/sobre-nos' element={<SobreNos/>}/>
      </Routes>
    </main>
    
    <Footer/>
    </>
  )
}

export default App
