
/**
 * Escreva uma descrição da classe AppPets aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AppPets {
    public static void main(String[] args) {
        
        Pessoa dono1 = new Pessoa("1234567", "Natalino");
        Pessoa dono2 = new Pessoa("2345678", "Gisele");
        Pessoa dono3 = new Pessoa("3456789", "Danielle");
        
        
        Pets pet1 = new Pets("Natalino", 9.5, dono1, 4); 
        Pets pet2 = new Pets("Cadente", 8.0, dono2, 7); 
        Pets pet3 = new Pets("Bolinha", 6.0, dono3, 3); 
        
        Pets[] turma = new Pets[3];
        turma[0] = pet1;
        turma[1] = pet2;
        turma[2] = pet3;
        
        System.out.println("--- MÉDIA ---");
        CadastroPets.mediaNotas(turma);
        
        System.out.println("\n--- VERIFICAR DONO ---");
        CadastroPets.donoNatalino(turma);
        
        System.out.println("\n--- BUSCAR NOTA ---");
        CadastroPets.buscanotaNatalino(turma);
    }
}