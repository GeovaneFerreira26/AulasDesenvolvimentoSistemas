package com.example.atividade20260512.service;

import com.example.atividade20260512.dto.CursoRequestDTO;
import com.example.atividade20260512.dto.CursoResponseDTO;
import com.example.atividade20260512.model.CursosModel;
import com.example.atividade20260512.repository.CursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursosService {
    @Autowired
    private CursosRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public List<CursoResponseDTO> listarCursos(){
        return (List<CursoResponseDTO>) repository.findAll().stream().map(CursosModel->new CursoResponseDTO(CursosModel.getCurso(),CursosModel.getSemestres(),CursosModel.getModalidade(),CursosModel.getMedia(),CursosModel.getTurno())).toList();
    }
    public CursosModel cadastroCursos(CursoRequestDTO cursoDTO) {
        if (repository.findByCurso(cursoDTO.getCurso()).isPresent()) {
            throw new RuntimeException("Curso já Cadastrado. ❌");
        }

        CursosModel novoCurso = new CursosModel();
        novoCurso.setCurso(cursoDTO.getCurso());
        novoCurso.setSemestres(cursoDTO.getSemestres());
        novoCurso.setModalidade(cursoDTO.getModalidade());
        novoCurso.setMedia(cursoDTO.getMedia());
        novoCurso.setTurno(cursoDTO.getTurno());

        return repository.save(novoCurso);
    }
    public CursosModel modifyCurso (Long id, CursoRequestDTO cursoDTO){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Curso não encontrado! ❌");
        }
        CursosModel novoDadoCurso = repository.findById(id).get();
        novoDadoCurso.setCurso(cursoDTO.getCurso());
        novoDadoCurso.setSemestres(cursoDTO.getSemestres());
        novoDadoCurso.setModalidade(cursoDTO.getModalidade());
        novoDadoCurso.setMedia(cursoDTO.getMedia());
        novoDadoCurso.setTurno(cursoDTO.getTurno());

        return repository.save(novoDadoCurso);

    }

    public  void removerCurso(Long id){
        if (!repository.existsById(id)){
            throw new RuntimeException("Curso não encontrado.❌");
        }
        repository.deleteById(id);
    }


}
