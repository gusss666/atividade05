
package universidade1;

import java.util.ArrayList;


public class Unidade {
    
    private String nome;
    private String gestor;
    
    private ArrayList<Curso> listaCursos = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGestor() {
        return gestor;
    }

    public void setGestor(String gestor) {
        this.gestor = gestor;
    }
    
    public void adicionaCurso(Curso curso){
        listaCursos.add(curso);
    }
    
    
}
