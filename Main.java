import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the company to Car: ");
        String company=sc.nextLine();
        car.setCompany(company);
        System.out.println("Enter the name of Car: ");
        String name=sc.nextLine();
        car.setModel(name);
        System.out.println("how many doors car have: ");
        int Door=sc.nextInt();
        car.setDoors(Door);
        System.out.println("Is car convertible: ");
        boolean convertible=sc.nextBoolean();
        car.setConvertible(convertible);
        System.out.println("Enter the Colour of car: ");
        String colour=sc.next();                 
        car.setColor(colour);
        System.out.println("make = " + car.getCompany());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setCompany("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("red");

        targa.describeCar();
    }
}
