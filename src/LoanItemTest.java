import java.util.Scanner;

public class LoanItemTest {
    int id;
    String type;
    String title;

    void LoanItem(int id, String type, String title) {
        this.id = id;
        this.type = type;
        this.title = title;
    }
}

public class LoanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1. Velkomstbesked
        System.out.println("Velkommen til lånesystemet!");

        //2. Spørg hvor mange lån der skal registreres
        System.out.print("Hvor mange lån vil du registrere?");
        int antal = input.nextInt();
        input.nextLine();

        //3. Tjek om tallet er gyldigt
        if (antal <= 0) {
            System.out.println("2");
            return;
            //4. Opret array
            LoanItem[] items = new LoanItem[antal];

            //5. For-løkke til at spørge om type og titel
            for (int i = 0; i < antal; i++) {
                System.out.println("nITEM no. " + (i + 1));

                String type;
                String typeInput;
                if (typeInput.equals("B")) {
                    type = "Book";
                } else if (typeInput.equals("V")) {
                    type = "Video";
                else
                    System.out.println("Ugyldig type - standard: Book");
                    type = "Book";
                }
                System.out.print("Title: ");
                String title = input.nextLine();

                String type;
                items[i] = new LoanItem(i + 1, type, title);
            }

            //6.udskriv listen præcis som på billedet
            System.out.println();
            System.out.println("LIST OF LOAN ITEMS");
            System.out.println("ID\tType\tTitle");
            for (LoanItem item : items) {
                System.out.println(item.id + "\t" + item.type + "\t" + item.title);
            }
            input.close();
        }
        }