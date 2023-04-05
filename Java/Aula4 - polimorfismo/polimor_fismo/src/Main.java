import java.util.ArrayList;
import java.util.List;

// Teste de Polimorfismo
public class Main {
    public static void main(String[] args) {
        System.out.println("polimorfismo: Soma 10+20:");
        Execute ex = new Soma();
        System.out.println(ex.execute(10, 20));
        System.out.println("polimorfismo Parametrico: 10*20:");
        ex = new Multiplica();
        System.out.println(ex.execute(10, 20));

        System.out.println(execute(10, 20, new Multiplica()));

        // Polimorfismo Parametrico
        List<Execute> list = new ArrayList<Execute>();
        list.add(ex);

        // Utilizacao de um polimorfismo por sobrecarga
        System.out.println("polimorfismo por sobrecarga = Soma 10+20:");
        Soma ex1 = new SuperSoma();
        System.out.println(execute(10, 20, ex1));

        // Polimorfismo por Coercao
        System.out.println("polimorfismo por coercao = Soma 1+2.0:");
        double x = 1 + 2.0;
        System.out.println(x);
    }

    /**
     * Este codigo pode somar, multiplicar ...
     */
    public static double execute(int val1, int val2, Execute ex) {
        return ex.execute(val1, val2);
    }
}
