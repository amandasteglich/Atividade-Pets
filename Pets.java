
/**
 * Escreva uma descrição da classe Pets aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Pets
{
    private String nome;
    private double nota;
    private Pessoa dono;
    private int idade;
    
    public Pets(String nome, double nota, Pessoa dono, int idade){
        this.nome = nome;
        this.nota = nota;
        this.dono = dono;
        this.idade = idade;
    }
    
    public double getNota(){
        return nota;
    }
    
    public void setNota(double nota){
        this.nota = nota;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public Pessoa getDono(){
        return dono;
    }
    
    public void setDono(Pessoa dono){
        this.dono  = dono;
    }
   
    public String toString(){
        return " Nome: " + nome + 
        " Nota: " + nota + 
        " Idade: " + idade + 
        " Dono:" + dono;
    }
}