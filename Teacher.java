import java.util.Scanner;

public class Teacher implements GiveGrade {
    public String setContent() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You are Teacher");
        System.out.println("Write your message");
        String a = scan.nextLine();
        return  "Сообщение от учителя\n" + a;
    }
    public void TeacherMessage(GiveGrade givegrade){
        System.out.println(givegrade.setContent());
    }
}
