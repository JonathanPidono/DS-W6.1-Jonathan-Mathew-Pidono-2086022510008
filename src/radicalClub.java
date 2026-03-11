import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class radicalClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan umur daftar antriannya: ");
        String input = scanner.nextLine();
        String[] tokens = input.trim().split(" ");

        Queue<Integer> valid = new PriorityQueue<>();
        Queue<Integer> invalid = new PriorityQueue<>();

        for(int i = 0; i < tokens.length; i++){
            int age = Integer.parseInt(tokens[i]);
            if(age >= 28 && age <= 118){
                valid.add(age);
            } else  {
                invalid.add(age);
            }
        }

        System.out.println(valid);
        System.out.println(invalid);
        scanner.close();
    } 
}