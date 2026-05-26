import { useState } from 'react'
import './style.css'

export default function InfoCurso(){
    const [nome, setNome] = useState('LÓGICA DE PROGRAMAÇÃO👨🏾‍💻')
    const [cargaHoraria, setCargaHoraria] = useState(162)
    const [dataInicio, setDataInicio] = useState('03/02/2025')
    const [dataTermino, setDataTermino] = useState('23/07/2026')
    const [notaFinal , setNotaFinal] = useState(10)
    const [situacaoAluno, setSituacaoAluno] = useState('APROVADO')

    return(
        <div className='info-curso'>
            <h2>Dados do Curso</h2>
            <p>{ nome }</p>
            <p>Carga Horária: { cargaHoraria } horas</p>
            <p>Início: { dataInicio }</p>
            <p>Término: { dataTermino }</p>
            <p>Nota Final: { notaFinal }</p>
            <p><strong>Situação do Aluno: { situacaoAluno }</strong></p>
            
        </div>
    )
}