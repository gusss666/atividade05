package universidade1;

import java.util.ArrayList;


public class Curso {
    
    private String nome;
    private String coordenador;
    
    private ArrayList<Disciplina> listaDisciplina = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }
    
    public void adicionarDisciplina(Disciplina disciplina) {
        listaDisciplina.add(disciplina);
    }
    
    
}
