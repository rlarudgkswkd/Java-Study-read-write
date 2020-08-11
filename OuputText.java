import java.util.Scanner;
import java.io.FileOutputStream;
//import java.io.IOException;
import java.io.OutputStream;

public class OuputText {
    public static void main(String[] args) {
        try {
            String name;
            int age;
            String address;
            String characteristic;
            String Profession;
    
            Scanner scan = new Scanner(System.in,"euc-kr");
            
            System.out.print("Input Name:");
            name = scan.nextLine();
            System.out.print("Input Age:");
            age = scan.nextInt();
            scan.nextLine();
            System.out.print("Input Address:");
            address = scan.nextLine();
    
            System.out.print("Input characteristic:");
            characteristic = scan.nextLine();
            
    
            System.out.print("Input Profession:");
            Profession = scan.nextLine();
    
            System.out.println();
            System.out.println("name: \""+ name + "\"");
            System.out.println("age: \""+ age + "\"");
            System.out.println("address: \""+ address + "\"");
            System.out.println("Characteristic: \""+ characteristic + "\"");
            System.out.println("Profession: \""+ Profession + "\"");
            
            
            scan.close();

            /* 여기는 파일 입출력 부분 */
            /* 먼저 입력  */
            OutputStream output = new FileOutputStream("info.txt");
            
            //Name
            byte[] by=name.getBytes();
            output.write(("Name : ").getBytes());
            output.write(by);
            output.write("\n".getBytes());

            //Age
            String age_str = Integer.toString(age);
            output.write(("Age : ").getBytes());
            output.write(age_str.getBytes());
            output.write("\n".getBytes());

            //Address
            output.write(("Address : ").getBytes());
            output.write(address.getBytes());
            output.write("\n".getBytes());

            //Characteristics
            output.write(("Character : ").getBytes());
            output.write(characteristic.getBytes());
            output.write("\n".getBytes());

            //Profession
            output.write(("Profession : ").getBytes());
            output.write(Profession.getBytes());
            output.write("\n".getBytes());
            output.close();

        } catch (Exception e) {
            e.getStackTrace();
        } 
        
    }
}