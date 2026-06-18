import { toast } from 'react-toastify';
import './style.css'
import api from '../../services/api';
import { useState } from 'react';

export default function CadastroPage() {
  const [nome, setNome] = useState('');
  const [email, setEmail] = useState('');
  const [senha, setSenha] = useState('');
  const [estaEnviando, setEstaEnviando] = useState(false);

  // limpa os campos do formulário

  function limparCamposDoFormulario() {
    setNome('')
    setEmail('')
    setSenha('')
  }

  async function envioDeFormulario(event) {
    // Evita que a pagina se recarregue automaticamente ao enviar o formulário
    event.preventDefault()
    setEstaEnviando(true)

    const dadosDoFormulario = { nome, email, senha }

    try {
      // tenta cadastrar o usuário na API
      const resposta = await api.post('/usuarios', dadosDoFormulario)

      //se der certo.
      toast.success(resposta.data.mensagem)
      limparCamposDoFormulario()
    } catch (erro) {
      //se der errado.
      const mensagemDoServidor = erro?.response?.data?.mensagem
      toast.error(mensagenDoServidor)
    } finally {
      // executa dando certo ou errado.
      setEstaEnviando(false)
    }
  }

  return (
    <div className='cadastro-page'>
      <form onSubmit={envioDeFormulario}>
        <div className='grupo-form'>
          <label htmlFor='campo-nome'>Nome:</label>
          <input
            id='campo-nome'
            type="text"
            placeholder='Ex.: Larissa Mendes'
            value={nome}
            onChange={(e) => setNome(e.target.value)}
          />

        </div>
        <div className='grupo-form'>
          <label htmlFor='campo-email'>Email:</label>
          <input
            id='campo-email'
            type="email"
            placeholder='Ex.: Lari@gmail.com'
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          />
        </div>
        <div className='grupo-form'>
          <label htmlFor='campo-senha'>Senha:</label>
          <input
            id='campo-senha'
            type="password"
            placeholder='Ex.: 123456'
            value={senha}
            onChange={(e) => setSenha(e.target.value)}
          />
        </div>
        <button type='submit' disabled={estaEnviando}>
          {estaEnviando ? 'Cadastrando...' : 'Cadastrar'}
        </button>

      </form>
    </div>
  )
}