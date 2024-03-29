import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Controle de Ordem de Servi�o");
            System.out.println("1 - Prestador");
            System.out.println("2 - Unidade da Empresa");
            System.out.println("3 - Tipo de Servico");
            System.out.println("4 - Ordem de Servico");
            System.out.println("5 - Sair");
            String opcao = sc.nextLine();
            if (opcao.equals("1")) {
                PrestadorMenu p = new PrestadorMenu();
                p.menu(sc);
            } else if (opcao.equals("2")) {
                UnidadeEmpresaMenu p = new UnidadeEmpresaMenu();
                p.menu(sc);
            } else if (opcao.equals("5")) {
                break;
            } else {
                System.out.println("Opcao nao conhecida");
            }
        }
        sc.close();
        System.out.println("Programa encerrado.");
    }

}
