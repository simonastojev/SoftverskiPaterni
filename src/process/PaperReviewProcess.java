package process;

import context.Paper;
import java.util.Scanner;

/*
 * @author Dusan
 */

public class PaperReviewProcess {
    private final Paper paper;
    public PaperReviewProcess() {
        paper = new Paper();
    }
    
            
     public void reviewPaperProcess() {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Get current state");
            System.out.println("2.Do something with paper in curent state");
            System.out.println("3.Exit application");
            System.out.println("Your choice is:");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Paper current state: ");
                    break;
                case 2:
                    break;
                case 3:
            }
        } while (choice != 3);

        input.close();
    }
}
