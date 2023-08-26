import java.util.Scanner;
public class islem {
    public static void main(String[] args) {
        int n,k;
        Scanner take = new Scanner(System.in);
        System.out.println("Üs alınacak sayı: ");
        n = take.nextInt();
        System.out.println("Üs olacak sayı: ");
        k = take.nextInt();
        int total = 1;
        for (int i = 0; i <k;i++)
        {
            total*=n;
        }
        System.out.println("Sonuç: " + total);
    }
}
