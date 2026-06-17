import './style.css'

export default function CadastroPage() {
    const [nome, setNome] = useState('');
    const [email, setEmail] = useState('');
    const [senha, setSenha] = useState('');
    const [estaEnviando, setEstaEnviando] = useState(false);

    function limparCamposDoFormulario() {
        setNome('');
        setEmail('');
        setSenha('');
    }

    async function enviarFormulario(event) {
        event.preventDefault();
        setEstaEnviando(true);

        const dadosDoFormulario = {
            nome,
            email,
            senha
        };

        try {
            const resposta = await api.post('/', dadosDoFormulario);
            console.log('Resposta do servidor:', resposta.data);
            alert('Usuário cadastrado com sucesso!');
            limparCamposDoFormulario();
        } catch (error) {
            console.error('Erro ao cadastrar usuário:', error);
            alert('Ocorreu um erro ao cadastrar o usuário. Por favor, tente novamente.');
        } finally {
            setEstaEnviando(false);
        }   
    }
}