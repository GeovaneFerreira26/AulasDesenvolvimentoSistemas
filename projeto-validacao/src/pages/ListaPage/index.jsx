import './styles.css';
import { useState, useEffect } from 'react';
import api from '../../services/api';


export default function ListaPage() {
    const [usuarios, setUsuarios] = useState([]);
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        const fetchUsuarios = async () => {
            try {
                const response = await api.get('/usuarios');
                setUsuarios(response.data);
            } catch (error) {
                console.error('Erro ao buscar usuários:', error);
            } finally {
                setLoading(false);
            }
        };

        fetchUsuarios();
    }, []);

    if (loading) {
        return <p>Carregando usuários...</p>;
    }
    return(
        <div className="lista-container">
            <h1>Lista de Usuários</h1>
            {usuarios.length === 0 ? (
                <p>Nenhum usuário encontrado.</p>
            ) : (
                <ul>
                    {usuarios.map((usuario) => (
                        <li key={usuario.id}>
                            <strong>Nome:</strong> {usuario.nome} <br />
                            <strong>Email:</strong> {usuario.email}
                        </li>
                    ))}
                </ul>
            )}
        </div>
    )

}
