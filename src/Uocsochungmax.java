import java.util.Scanner;

public class Uocsochungmax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1:");
        int number1=sc.nextInt();
        System.out.println("Enter number2:");
        int number2=sc.nextInt();
        int ucmax=1;
        for (int i=1;i<number2 ||i<number1;i++){
            if (number1%i==0 && number2%i==0){
                if (i>ucmax){
                    ucmax=i;
                }
            }

        }
        System.out.println("ước số chung lớn nhất là :"+ucmax);
    }
}
