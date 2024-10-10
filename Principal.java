
package br.com.heranca;

/**
 *
 * @author brayan.4150
 */
public class Principal {
    
    public static void main(String[] args){
        //Pessoa p = new Pessoa();
        //Funcionario f = new Funcioanrio();
        
        
        Aluno a = new Aluno() {};
        a.setNome("Joaquim");
        a.setIdade(18);
        a.setSexo('M');
        a.setEmail("joaquim@gmail.com");
        a.setMatricula(123456789);
        a.setNotas(new int[]{10, 5, 5, 6});
        
        System.out.println(a.getNome());
        System.out.println(a.getEmail());
        for(int nota: a.getNotas()){
        System.out.println(nota);
        }
        
        System.out.println("----------------------------------------------------");
    }

}
