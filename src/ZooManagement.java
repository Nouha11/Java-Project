import java.util.Scanner;

public class ZooManagement {

    int nbCages = 20;
    String zooName = "my Zoo";

    public ZooManagement() {}

    public ZooManagement(String zooName, int nbCages) {
        this.zooName = zooName;
        this.nbCages = nbCages;
    }

    public String toString(){
        return "ZooManagment [ zooName : " + zooName + ",  nbCages : "+ nbCages + "]";
    }


}