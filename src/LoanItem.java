import java.util.Scanner;

public class LoanItem {
    int id;
    String type;
    String title;

    LoanItem(int id, String type, String title) {
        this.id = id;
        this.type = type;
        this.title = title;
    }

    public static class LoanProgram {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            //1. velkomstbesked
            System.out.println("Velkommen til lånesystemet!");

            //2. Spørg hvor mange ting der skal registreres
            System.out.print("Hvor mange lån vil du registrere?");
            int antal = input.nextInt();
            input.nextLine(); // "Spiser" linjeskift

            //3. Validate input (simpelt check)
            if (antal<=0) {
                System.out.println("Du skal indtaste et positivt tal.");
                return;
            }
            //4. Opret array
            LoanItem [] items = new LoanItem[antal];

            //5. Spørg for hver ting
            for (int i = 0; i < antal; i++) {
                System.out.println("nITEM.no. " + (i+1));

                System.out.print("Type (B for book eller V for video): ");
                String type = input.nextLine().trim ().toUpperCase();
                String typeName = type.equals("B") ? "Book" : "Video";

                System.out.print("Title: ");
                String title = input.nextLine();

                //6.Opret objekt og læg i array
                items[i] = new LoanItem(i+1, typeName, title);
            }

            //7. Udskriv liste
            System.out.println("nLIST OF LOAN ITEMS:");
            System.out.println("ID\tType\tTitle");
            for (LoanItem item : items ) {
                System.out.println(item.id+"\t"+item.type+"\t"+item.title);
            }

        }
    }
}
