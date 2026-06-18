import { useEffect, useState } from 'react'
import api from '../../services/api'
import './style.css'
import { toast } from 'react-toastify'

export default function ListaUsuarioPage() {
    const [usuarios, setUsuarios] = useState([])

    useEffect(() => {
        async function buscarUsuarios() {
            try {
                //Se der certo
                const response = await api.get('/usuarios')
                setUsuarios(response.data)
            } catch (erro) {
                //Se der errado
                toast.erro ('Erro ao buscar usuários')
            }
        }
        buscarUsuarios()
    }, [])
    
    return (
        <div className='lista-usuarios'>
            <h1>Lista de Usuários Cadastrados</h1>
            {
            usuarios.length === 0 ? (
                <p>Nenhum usuário cadastrado.</p>
            ) : (
                <table className='tabela-usuarios'>
                    <thead>
                        <tr>
                            <th>Nome</th>
                            <th>Email</th>
                        </tr>
                    </thead>
                    <tbody>
                        {usuarios.map((usuario) => (
                            <tr key={usuario.email}>
                                <td>{usuario.nome}</td>
                                <td>{usuario.email}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            )}
        </div>
    )
}
        