import java.util.Scanner;
class JobPricing {
String description;
    double materials;
    double hoursOnJob;
    double hoursTraveling;
    double price;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter job description: ");
    description = input.nextLine();
    System.out.print("Enter cost of materials: ");
    materials = input.nextDouble();
    System.out.print("Enter hours on the job work: ");
    hoursOnJob = input.nextDouble();
    System.out.print("Enter hours traveling: ");
    hoursTraveling = input.nextDouble();
    price = computePrice(materials, hoursOnJob, hoursTraveling);
    System.out.println("The price for " + description +
                       " is $" + price);
     }
                       
     public static double computePrice(double materials, double hours, double travel) {
    double workedTotal = (hours*35)+materials;
    double travelTotal = (travel*12);
    double totalCost = workedTotal+travelTotal;
    return totalCost;
    }
    
}
