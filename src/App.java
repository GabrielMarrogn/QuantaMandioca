import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int total = 225;

        for(int i = 1; i <= 5; i++){
            int a = sc.nextInt();
            switch (i) {
                case 1:
                total += (a * 300);
                break;
                case 2:
                total += (a * 1500);
                break;
                case 3:
                total += (a * 600);
                break;
                case 4:
                total += (a * 1000);
                break;
                case 5:
                total += (a * 150);
                break;
            }
        }
        
        sc.close();
        System.out.println(total);
    }
}

