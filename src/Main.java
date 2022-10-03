import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Toplam tutarı öğrenmek için aldığınız ürünlerin kilosunu yazınız.");
        double armut=2.14,elma = 3.67, patlican=5,domates=1.11, muz=1.11;
        int arKg,elKg,patKg,domKg,muzKg;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut: ");
        arKg=scanner.nextInt();

        System.out.print("Elma: ");
        elKg=scanner.nextInt();

        System.out.print("Patlıcan: ");
        patKg=scanner.nextInt();

        System.out.print("Domates: ");
        domKg=scanner.nextInt();

        System.out.print("Muz: ");
        muzKg=scanner.nextInt();

       double price = (armut*arKg)+(elma*elKg)+(muzKg*muz)+(patlican*patKg)+(domates*domKg);
        System.out.print("Toplam ödemeniz gereken tutar "+price+" TL'dir.");
    }
}