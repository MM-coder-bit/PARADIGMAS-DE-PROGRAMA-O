import java.util.List;
import java.util.Scanner;

public class UnidadeEmpresaMenu {

    public void menu(Scanner sc) {
        while (true) {
            System.out.println("Cadastro da unidade da empresa");
            System.out.println("1 - Listar");
            System.out.println("2 - Incluir");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Voltar");
            String opcao = sc.nextLine();
            if (opcao.equals("1")) {
                listar();
            } else if (opcao.equals("2")) {
                incluir(sc);
            } else if (opcao.equals("3")) {
                atualizar(sc);
            } else if (opcao.equals("4")) {
                excluir(sc);
            } else if (opcao.equals("5")) {
                break;
            } else {
                System.out.println("Opcao nao conhecida" + opcao);
            }
        }
    }

    private void listar() {
        UnidadeEmpresaDAO dao = new UnidadeEmpresaDAO();
        List<UnidadeEmpresa> list = dao.getList();
        for (UnidadeEmpresa p : list) {
            System.out.println("Codigo:" + p.getCodigo()
                    + " Nome da empresa:" + p.getNome()
                    + " Responsavel:" + p.getResponsaval()
                    + " Tipo:" + p.getTipo());
        }
    }

    private void incluir(Scanner sc) {
        System.out.println("Incluir uma nova empresa:");
        System.out.println("C�digo:");
        String codigo = sc.nextLine();
        System.out.println("Nome da empresa:");
        String nome = sc.nextLine();
        System.out.println("Responsavel:");
        String responsavel = sc.nextLine();
        System.out.println("Tipo:");
        String tipo = sc.nextLine();

        if (codigo == null
                || codigo.trim().length() == 0) {
            System.out.println("C�digo inv�lido.");
            return;
        }
        if (nome == null
                || nome.trim().length() == 0) {
            System.out.println("Nome inv�lido.");
            return;
        }
        int cod = 0;
        try {
            cod = Integer.parseInt(codigo);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("C�digo deve ser num�rico");
            return;
        }

        UnidadeEmpresa p = new UnidadeEmpresa();
        p.setCodigo(cod);
        p.setNome(nome);
        p.setResponsaval(responsavel);
        p.setTipo(tipo);

        UnidadeEmpresaDAO dao = new UnidadeEmpresaDAO();
        dao.inserir(p);
    }

    private void atualizar(Scanner sc) {
        System.out.println("Atualizar dados da empresa:");
        System.out.println("Informe o C�digo:");
        String codigo = sc.nextLine();

        if (codigo == null
                || codigo.trim().length() == 0) {
            System.out.println("C�digo inv�lido.");
            return;
        }
        int cod = 0;
        try {
            cod = Integer.parseInt(codigo);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("C�digo deve ser num�rico");
            return;
        }
        UnidadeEmpresaDAO dao = new UnidadeEmpresaDAO();
        UnidadeEmpresa p = dao.getUnidadeEmpresa(cod);
        if (p == null) {
            System.out.println("Empresa nao encontrado:" + cod);
            return;
        }

        System.out.println("Nome Empresa (" + p.getNome() + "):");
        String nome = sc.nextLine();
        System.out.println("Responsavel (" + p.getResponsaval() + "):");
        String responsavel = sc.nextLine();
        System.out.println("Tipo (" + p.getTipo() + "):");
        String tipo = sc.nextLine();
        p.setNome(nome);
        p.setResponsaval(responsavel);
        p.setTipo(tipo);
        dao.atualizar(p);
    }

    private void excluir(Scanner sc) {
        System.out.println("Atualizar empresa:");
        System.out.println("Informe o C�digo:");
        String codigo = sc.nextLine();

        if (codigo == null
                || codigo.trim().length() == 0) {
            System.out.println("C�digo inv�lido.");
            return;
        }
        int cod = 0;
        try {
            cod = Integer.parseInt(codigo);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("C�digo deve ser num�rico");
            return;
        }
        UnidadeEmpresaDAO dao = new UnidadeEmpresaDAO();
        UnidadeEmpresa p = dao.getUnidadeEmpresa(cod);
        if (p == null) {
            System.out.println("Empresa nao encontrado:" + cod);
            return;
        }
        dao.excluir(p);
    }

}
