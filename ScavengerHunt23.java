import java.util.Scanner;
public class ScavengerHunt23 {

    Node head;

    ScavengerHunt23() {
        this.head = null;
    }

    void addPoint(String question, String answer) {
        Node newNode = new Node(question, answer);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.nextNode != null) {
                current = current.nextNode;
            }
            current.nextNode = newNode;
        }
    }

    boolean playGame() {
        Scanner scanner = new Scanner(System.in);
        Node current = head;
        while (current != null) {
            System.out.println(current.question);
            System.out.print("Jawaban Anda adalah : "); 
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(current.answer)) {
                System.out.println("Jawaban yang BENAR! Anda dapat melanjutkan ke pertanyaan berikutnya.");
                current = current.nextNode;
            } else {
                System.out.println("Jawaban yang SALAH! Coba lagi.");
                return false; 
            }
        }
        scanner.close();
        return true; 
    }
}