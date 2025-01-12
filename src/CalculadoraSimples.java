import javax.swing.JOptionPane;

public class CalculadoraSimples {

    public static void main (String[] args) {
        short opt;
        double val1, val2;

        do {
            opt = Short.parseShort(JOptionPane.showInputDialog("opt: "));

            if (opt == 0){
                break;
            }

            val1 = Double.parseDouble(JOptionPane.showInputDialog("val1: "));
            val2 = Double.parseDouble(JOptionPane.showInputDialog("val2: "));

            System.out.println("resultado: " + Calcular(opt, val1, val2));

        } while (opt != 0);
    }

    static double Calcular(short opt, double x, double y){
        double res = 0;
        switch(opt){
            case 1:
                res = x + y;
                break;
            case 2:
                res = x - y;
                break;
            case 3:
                res = x * y;
                break;
            case 4:
                res = x / y;
                break;
        }
        return res;
    }
}
