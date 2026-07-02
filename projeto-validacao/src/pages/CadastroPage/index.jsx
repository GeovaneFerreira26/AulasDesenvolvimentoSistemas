import { toast } from 'react-toastify';
import './styles.css';
import * as yup from 'yup';
import { useForm } from 'react-hook-form';
import { yupResolver } from '@hookform/resolvers/yup';
import api from '../../services/api';

//Validação de formulário
const esquemaDeCadastro = yup.object({
    nome: yup
        .string()
        .required('O nome é obrigatório'),
    email: yup
        .string()
        .email('Digite um e-mail válido')
        .required('O e-mail é obrigatório'),
    senha: yup
        .string()
        .min(6, 'A senha deve ter no mínimo 6 caracteres')
        .required('A senha é obrigatória'),
    confirmarSenha: yup
        .string()
        .oneOf([yup.ref('senha'), null], 'As senhas devem ser iguais')
        .required('A confirmação de senha é obrigatória'),
})

export default function CadastroPage(){

    //Configuração do formulário com react-hook-form.
    const {
        register: registrarCampo,
        handleSubmit: lidarComEnvioDoFormulario,
        formState: { errors: errosDeValidacao, isSubmitting:     formularioEstaSendoEnviado},
        setError: definirErroNoCampo,
        reset: reiniciarFormulario,
    } = useForm({
        resolver: yupResolver(esquemaDeCadastro),
        defaultValues: {
            nome: '',
            email: '',
            senha: '',
            confirmarSenha: '',
        },

    })

    async function enviarFormulario(dadosDoFormulario) {
        const dadosParaApi = {
            nome: dadosDoFormulario.nome,
            email: dadosDoFormulario.email,
            senha: dadosDoFormulario.senha,
        }

        try {
            const resposta = await api.post('/usuarios', dadosParaApi)
            toast.success('Usuário cadastrado com sucesso!')
            reiniciarFormulario()
        } catch (erro) {
            const codigoDeStatus = erro.response?.status
            const mensagemDoServidor = erro.response?.data?.mensagem || 'Ocorreu um erro ao cadastrar o usuário. Por favor, tente novamente.'
            if(codigoDeStatus === 400) {
                definirErroNoCampo('email', { type: 'server', message: mensagemDoServidor })
            }
            toast.error(mensagemDoServidor)
            console.error('Erro ao cadastrar usuário:', erro)   
        }
    }

    return (
        <div className="cadastro-container">
            <h1>Cadastro de Usuário</h1>
            <form noValidate onSubmit={lidarComEnvioDoFormulario(enviarFormulario)}>
                {/* Campo de Nome */}
                <div className='form-group'>
                    <label htmlFor="nome">Nome:</label>
                    <input
                        type="text"
                        id="nome"
                        placeholder='Ex. Larissa Nunes'
                        {...registrarCampo('nome')}
                        className={errosDeValidacao.nome ? 'input-error' : ''}
                    />
                    {errosDeValidacao.nome &&
                    (<p className='error-message'>{errosDeValidacao.nome.message}</p>)}
                </div>
                {/* Campo de E-mail */}
                <div className='form-group'>
                    <label htmlFor="email">E-mail:</label>
                    <input
                        type="email"
                        id="email"
                        placeholder='Ex. larissa@example.com'
                        {...registrarCampo('email')}
                        className={errosDeValidacao.email ? 'input-error' : ''}
                    />
                    {errosDeValidacao.email &&
                    (<p className='error-message'>{errosDeValidacao.email.message}</p>)}
                </div>
                {/* Campo de Senha */}
                <div className='form-group'>
                    <label htmlFor="senha">Senha:</label>
                    <input
                        type="password"
                        id="senha"
                        placeholder='Ex. 123456'
                        {...registrarCampo('senha')}
                        className={errosDeValidacao.senha ? 'input-error' : ''}
                    />
                    {errosDeValidacao.senha &&
                    (<p className='error-message'>{errosDeValidacao.senha.message}</p>)}
                </div>
                {/* Campo de Confirmar Senha */}
                <div className='form-group'>
                    <label htmlFor="confirmarSenha">Confirmar Senha:</label>
                    <input
                        type="password"
                        id="confirmarSenha"
                        placeholder='Ex. 123456'
                        {...registrarCampo('confirmarSenha')}
                        className={errosDeValidacao.confirmarSenha ? 'input-error' : ''}
                    />
                    {errosDeValidacao.confirmarSenha &&
                    (<p className='error-message'>{errosDeValidacao.confirmarSenha.message}</p>)}
                </div>
                <button type="submit" disabled={formularioEstaSendoEnviado}>
                    {formularioEstaSendoEnviado ? 'Cadastrando...' : 'Cadastrar'}
                </button>
            </form>
        </div>
    )
        
}