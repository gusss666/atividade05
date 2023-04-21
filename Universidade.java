package universidade1;

import java.util.ArrayList;


public class Universidade {
    
    private String nome;
    private String endereço;
    private String cidade;
    
    private ArrayList<Unidade> listaUnidades = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public void adicionaUnidade(Unidade unidade) {
        listaUnidades.add(unidade);
    }
    
}
