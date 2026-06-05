
/**
 * Escreva uma descrição da classe CadastroPets aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */


public class CadastroPets {
    public static void mediaNotas(Pets[] turma) {
        double soma = 0;
        int cont = 0;
        
        for (int i = 0; i < turma.length; i++) {
            if (turma[i].getIdade() < 6) {
                soma = soma + turma[i].getNota();
                cont++;
            }
        }
        if (cont > 0) {
            double media = soma / cont;
            System.out.println(" Soma das médias dos Pets menores de 6 anos: " + media);
        } else {
            System.out.println(" Nenhum Pet menor de 6 anos foi encontrado");
        }
    }
   
    public static void donoNatalino(Pets[] turma) {
        for (int i = 0; i < turma.length; i++) {
            if (turma[i].getDono().getNome().equals("Natalino")) {
                System.out.println(" Existe um dono de um Pet que se chama Natalino ");
            } else {
                System.out.println(" Não existe um dono de Pet chamado Natalino ");
            }
        }
    }
   
    public static void buscanotaNatalino(Pets[] turma) {
        for (int i = 0; i < turma.length; i++) {
            if (turma[i].getDono().getNome().equals("Natalino")) {
                System.out.println(" A nota do Pet do Natalino é: " + turma[i].getNota());
            } else { 
                System.out.println(" Não foi possível encontrar a nota ");
            }
        }
    }
}