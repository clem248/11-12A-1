import java.util.Scanner;
public class Student implements GiveGrade {
    public String setContent(){
        Scanner scan = new Scanner(System.in);
        System.out.println("You are student");
        System.out.println("Write your message");
        String a = scan.nextLine();
        return "Сообщение от студента\n" + a;
    }
    public void StudentMes(GiveGrade giveGrade){
        System.out.println(giveGrade.setContent());
    }
}
