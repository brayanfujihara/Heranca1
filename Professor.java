
package br.com.heranca;

/**
 *
 * @author brayan.4150
 */
public class Professor extends Funcionario {
    private String Disciplina[];

    public String[] getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(String[] Disciplina) {
        this.Disciplina = Disciplina;
    }
    
}
