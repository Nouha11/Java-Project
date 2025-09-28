import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ZooManagement zm = new ZooManagement();
        Scanner sc = new Scanner(System.in);

        System.out.print("zooName : ");
        zm.zooName = sc.nextLine();

        System.out.print("nbrCages : ");
        zm.nbCages = sc.nextInt();

        System.out.println("zooName : "+zm.zooName);
        System.out.println("nbrCages : "+zm.nbCages);

        System.out.println(zm);

        ZooManagement zm2 = new ZooManagement("my Zoo",80);
        System.out.println(zm2);

        Animal chat = new Animal();
        Animal chien = new Animal();

        chat.name="Michou";
        chat.age=1;
        chat.family="chat";
        chat.isMammal=true;
        System.out.println(chat);


        chien.name="loulou";
        chien.age=2;
        chat.family="chien";
        chien.isMammal=true;
        System.out.println(chien);

        Animal lion = new Animal("Chat","simba",15,true);
        System.out.println(lion);

        Zoo zoo2 = new Zoo("frigya","sousse",100);
        System.out.println(zoo2);
        zoo2.displayZoo();



    }
}