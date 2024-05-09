import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import static java.nio.file.StandardOpenOption.*;

import static java.nio.file.AccessMode.*;

public class Main {
    public static void main(String[] args) {

         Scanner keyboard = new Scanner(System.in);
         String maker;
         String model;
         String year;
         double price;
         int miles;
         String feat;
         boolean isRunning = true;
         String switchChoice;
         char choice;
         ArrayList<Vehicle> myArrayOfVehicles =  new ArrayList<>();

     

         do{
             System.out.println("What type of vehicle would you like to add? ");
             System.out.println("C for coupe, S for sedan, U for SUV and Q to quit");
             switchChoice = keyboard.nextLine();
             choice = switchChoice.toUpperCase().charAt(0);

             switch(choice){

                 case 'C':

                     System.out.println("Enter the car's maker: ");
                     maker = keyboard.nextLine();
                     System.out.println("Enter the car's model: ");
                     model = keyboard.nextLine();
                     System.out.println("Enter the car's year: ");
                     year = keyboard.nextLine();
                     System.out.println("Enter Sedan features: ");
                     feat = keyboard.nextLine();
                     System.out.println("Enter the car's price: ");
                     price = keyboard.nextDouble();
                     System.out.println("Enter the car's miles: ");
                     miles = keyboard.nextInt();


                     Coupe newCoupe = new Coupe(maker,model,year,price,miles);
                     newCoupe.setFeatures(feat);

                     System.out.println("The " + year + " " + maker + " " + model + " costs $" + price + " and has " + miles + " miles" + " and has " + newCoupe.getFeatures());
                     myArrayOfVehicles.add(newCoupe);
                     break;

                 case 'S':

                     System.out.println("Enter the car's maker: ");
                     maker = keyboard.nextLine();
                     System.out.println("Enter the car's model: ");
                     model = keyboard.nextLine();
                     System.out.println("Enter the car's year: ");
                     year = keyboard.nextLine();
                     System.out.println("Enter Sedan features: ");
                     feat = keyboard.nextLine();
                     System.out.println("Enter the car's price: ");
                     price = keyboard.nextDouble();
                     System.out.println("Enter the car's miles: ");
                     miles = keyboard.nextInt();

                     Sedan newSedan = new Sedan(maker,model,year,price,miles);
                     newSedan.setFeatures(feat);

                     System.out.println("The " + year + " " + maker + " " + model + " costs $" + price + " and has " + miles + " miles" + " and has " + newSedan.getFeatures());
                     myArrayOfVehicles.add(newSedan);
                     break;

                 case 'U':

                     System.out.println("Enter the car's maker: ");
                     maker = keyboard.nextLine();
                     System.out.println("Enter the car's model: ");
                     model = keyboard.nextLine();
                     System.out.println("Enter the car's year: ");
                     year = keyboard.nextLine();
                     System.out.println("Enter Sedan features: ");
                     feat = keyboard.nextLine();
                     System.out.println("Enter the car's price: ");
                     price = keyboard.nextDouble();
                     System.out.println("Enter the car's miles: ");
                     miles = keyboard.nextInt();

                     SUV newSUV = new SUV(maker,model,year,price,miles);
                     newSUV.setFeatures(feat);

                     System.out.println("The " + year + " " + maker + " " + model + " costs $" + price + " and has " + miles + " miles" + " and has " + newSUV.getFeatures());
                     myArrayOfVehicles.add(newSUV);
                     break;

                 case 'Q':
                     isRunning = false;
                     break;

                 default:

                     System.out.println("Please enter a valid choice");
                     break;







            }
             for(Vehicle vehicle : myArrayOfVehicles){
                 System.out.println(vehicle.getMaker() + " " + vehicle.getModel());
                 

                 
             }
             System.out.println("Press Enter button to exit");

             keyboard.nextLine();


         }while(isRunning);

         Path fPath = Paths.get("G:\\FOR_JAVA\\CarLot\\CarLotInventory.txt");
        String delimiter = ",";
        String s = "";
        final int QUIT = 0;

             try{
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(fPath, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));

            String title = "  year  " + delimiter + "  make  " + delimiter + "  model  " + delimiter + " features "  + delimiter + "  price  " + delimiter + "  miles  ";
            writer.write(title);
            
            for(Vehicle vehicle : myArrayOfVehicles){
                 System.out.println(vehicle.getMaker() + " " + vehicle.getModel());
                 s = vehicle.year + delimiter + vehicle.maker + delimiter + vehicle.model + delimiter + vehicle.feat + delimiter + vehicle.price + delimiter + vehicle.miles;
                 writer.write(s, 0, s.length());
                 writer.newLine();


                 
             }
             writer.close();

            






         }catch(IOException e){
            System.out.println("Error Message: " + e);
         }
         



























         /*

        System.out.println("Enter the car's maker: ");
        maker = keyboard.nextLine();
        System.out.println("Enter the car's model: ");
        model = keyboard.nextLine();
        System.out.println("Enter the car's year: ");
        year = keyboard.nextLine();
        System.out.println("Enter Sedan features: ");
        feat = keyboard.nextLine();
        System.out.println("Enter the car's price: ");
        price = keyboard.nextDouble();
        System.out.println("Enter the car's miles: ");
        miles = keyboard.nextInt();



        Sedan mySedan = new Sedan(maker, model, year, price, miles);
        mySedan.setFeatures(feat);

        System.out.println("The " + year + " " + maker + " " + model + " costs $" + price + " and has " + miles + " miles" + " and has " + mySedan.getFeatures());

        */

    }
}