import java.util.Scanner;

public class longNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of names you want:  ");
        int n = input.nextInt();
        longNames(n);
    }

    public static void longNames(int n) {
        String name = "", longest = "";
        int longestLength = 0, ties = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name #" + i + ": ");
            name = input.next();
            int length = name.length();
            if (length > longestLength) {
                longest = name;
                longestLength = length;
                ties = 0;
            } else if (length == longestLength) {
                ties++;
            }
        }

        longest = longest.substring(0, 1).toUpperCase() + longest.substring(1);

        if (ties > 0) {
            System.out.printf("(There were %d ties for the longest names!)\n", ties+1);
        } else {
            System.out.printf("%s's name is longest\n", longest);
        }
    }
}
