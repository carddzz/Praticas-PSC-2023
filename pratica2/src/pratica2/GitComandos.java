package pratica2;
import java.util.Scanner;

public class GitComandos {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dos comandos Git ('git clone', 'git fetch' ou 'git pull'): ");
        String comando = scanner.nextLine();

        switch (comando) {
            case "git clone":
                System.out.println("Comando 'git clone':");
                System.out.println("Este comando é usado para criar uma cópia local de um repositório Git remoto.");
                System.out.println("Exemplo: git clone https://github.com/usuario/repositorio.git");
                break;
            case "git fetch":
                System.out.println("Comando 'git fetch':");
                System.out.println("Este comando é usado para buscar as atualizações do repositório remoto, mas não aplica essas alterações no seu repositório local.");
                System.out.println("Exemplo: git fetch origin");
                break;
            case "git pull":
                System.out.println("Comando 'git pull':");
                System.out.println("Este comando é usado para buscar as atualizações do repositório remoto e aplicá-las ao seu repositório local.");
                System.out.println("Exemplo: git pull origin master");
                break;
            default:
                System.out.println("Comando não reconhecido.");
                break;
        }

        scanner.close();
    }

}
