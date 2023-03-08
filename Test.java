import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        System.out.println(result());

        }
        public static int result (){
            Scanner sc = new Scanner(System.in);
            int a,b;
            System.out.println("podaj a");
            a = sc.nextInt();
            System.out.println("podaj b");
            b = sc.nextInt();
            if(a>b){
                return a;
            }else return b;
        }

    }

