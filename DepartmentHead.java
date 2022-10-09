import java.util.Scanner;

public class DepartmentHead implements GiveGrade {
    public String setContent() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You are department-head");
        System.out.println("Write your message");
        String a = scan.nextLine();
        return  "Сообщение от завведующего кафедрой\n" + a;
    }
    public void ProfMessage(GiveGrade givegrade){
        System.out.println(givegrade.setContent());
    }
}
