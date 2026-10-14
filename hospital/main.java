package hospital;

public class main {

    public static void main(String[] args) {

        Outpatient patient1 =
                new Outpatient("Abdullahi", 20, 30);

        Inpatient patient2 =
                new Inpatient("ibrahim", 20, 50, 4);

        patient1.displayInfo();

        System.out.println();

        patient2.displayInfo();
    }
}