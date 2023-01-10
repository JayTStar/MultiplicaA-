public class App {
    public static void main(String[] args) throws Exception {
        int number = 3;

        System.out.println("Tabela de multiplicação de " + String.valueOf(number));
        for(int i = 0; i <= 10; i++){
            System.out.println(String.valueOf(number) + "x" + String.valueOf(i) + "=" + String.valueOf(number * i));
        }
    }
}
