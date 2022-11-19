import java.util.Scanner;

public class Teste{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int time;
        System.out.println("Que horas são?");
        time = sc.nextInt();
        
        if (time < 12) {
            System.out.println("Bom dia!");
        } else if (time < 18) {
            System.out.println("Boa tarde!");
        } else if (time < 24) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Esse horario não existe no padrão brasileiro!");
        }
        
        sc.close();
    }
}