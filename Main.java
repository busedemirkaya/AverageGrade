import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int math, chemistry, physics, music, biology;
        Scanner input = new Scanner(System.in);

        System.out.println("Math Grade: ");
        math = input.nextInt();

        System.out.println("Chemistry Grade: ");
        chemistry = input.nextInt();

        System.out.println("Physics Grade: ");
        physics = input.nextInt();

        System.out.println("Music Grade:");
        music = input.nextInt();

        System.out.println("Biology Grade:");
        biology = input.nextInt();

        double average = (math + chemistry + physics + music + biology) / 5;
        if ( average > 100) {
            System.out.println("You entered the wrong value. Please, enter between 0 and 100."); }
        else if (average > 55) {
                System.out.println("You passed the class. Congratulations.");
                System.out.println("Your Average: "+ average);
            } else {
            System.out.println("Sorry. You cannot pass the class.");
            System.out.println("Your Average: "+ average);
        }

    }

}