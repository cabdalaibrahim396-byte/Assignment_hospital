package hospital;

public class Hospital {
}
/// patient class
  class Patient {

     String name;
     double consultFee;

    public Patient(String name, double consultFee) {
        this.name = name;
        this.consultFee = consultFee;
    }

    public double calculateBill() {
        return 0;
    }
}

/// outpatient class
 class Outpatient extends Patient {

    private double labCharge;

    public Outpatient(String name,
                      double consultFee,
                      double labCharge) {

        super(name, consultFee);
        this.labCharge = labCharge;
    }

    @Override
    public double calculateBill() {
        return labCharge + consultFee;
    }

    public void displayInfo() {
        System.out.println("_______ OUTPATIENT _______");
        System.out.println("Name: " + name);
        System.out.println("Consult Fee: " + consultFee);
        System.out.println("Lab Charge: " + labCharge);
        System.out.println("Total Bill: " + calculateBill());
    }
}

///outpatient class

 class Inpatient extends Patient {

     double roomCharge;
     int numberOfDays;

    public Inpatient(String name,
                     double consultFee,
                     double roomCharge,
                     int numberOfDays) {

        super(name, consultFee);
        this.roomCharge = roomCharge;
        this.numberOfDays = numberOfDays;
    }

    @Override
    public double calculateBill() {
        return (numberOfDays * roomCharge) + consultFee;
    }

    public void displayInfo() {
        System.out.println("^^^^INPATIENT ^^^^^");
        System.out.println("Name: " + name);
        System.out.println("Consult Fee: " + consultFee);
        System.out.println("Room Charge: " + roomCharge);
        System.out.println("Number Of Days: " + numberOfDays);
        System.out.println("Total Bill: " + calculateBill());
    }
}