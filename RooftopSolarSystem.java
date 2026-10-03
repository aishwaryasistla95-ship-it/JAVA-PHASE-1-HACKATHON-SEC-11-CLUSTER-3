
    import java.util.Scanner;

 class RooftopSolarSystem {
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Rooftop Solar System Details");
        System.out.print(" Panel ID (integer): ");
        int panelId = sc.nextInt();

        System.out.print("Energy generated in kWh (decimal): ");
        double energyGenerated = sc.nextDouble();

        System.out.print("Number of solar panels (integer): ");
        int numberOfPanels = sc.nextInt();

        System.out.print("System status (character): ");
        char systemStatus = sc.next().charAt(0);

        System.out.println("Rooftop Solar System Details ");
        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy generated in kWh: " + energyGenerated);
        System.out.println("Number of solar panels: " + numberOfPanels);
        System.out.println("System status: " + systemStatus);

        System.out.println(" Energy Status ");
        if (energyGenerated >= 10.0) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }
         System.out.println(" Total Energy Calculation");
        System.out.print("Enter morning energy generated in kWh: ");
        double morningEnergy = sc.nextDouble();

        System.out.print("Enter evening energy generated in kWh: ");
        double eveningEnergy = sc.nextDouble();

        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);
        System.out.println("Total Energy Generated: " + totalEnergy + " kWh");

        sc.close();

       
    }
}
