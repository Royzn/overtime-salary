import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalJam = 0;
        boolean beriPeringatan = false;

        int days = 1;
        while (days<=7){
            System.out.println("Masukkan jam kerja hari ke-" + days + ": ");
            while (!sc.hasNextInt()){
                System.out.println("Masukkan angka yang valid!");
                sc.next();
            }
            int jam = sc.nextInt();
            if(jam < 0){
                System.out.println("Nilai tidak boleh negatif.");
                continue;
            }

            if(jam < 4){
                beriPeringatan = true;
            }
            totalJam+=jam;
            days++;
        }

        double rata2 = totalJam / 7;

        if (beriPeringatan){
            System.out.println("\nKurang Disiplin");
        }else if (rata2 >= 8){
            System.out.println("\nBonus Rp 200.000");
        } else {
            System.out.println("\nBekerja dengan baik");
        }

    }
}