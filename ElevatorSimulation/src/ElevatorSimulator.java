import java.util.*;
public class ElevatorSimulator {

    public static void printString(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printString("Enter single char for outside and inside 'o' and 'i' respectively");
        printString("Example : o 5 is interpreted as someone wants to use lift at floor 5");
        printString("Example : i 3 is interpreted as someone wants to go floor num 3");
        printString("Enter 'exit' to quit the program and enter to continue the program");
        printString("Enter Number of floor :");
        int totalFloor = Integer.parseInt(sc.nextLine());
        Elevator mElevator = new Elevator(totalFloor);
        ElevatorController eController = new ElevatorController(mElevator);
       String cInput = sc.nextLine();
       while(!cInput.equals("exit")){
           String cArr[] = cInput.split(" ");
           if(cArr.length == 2){
               if(cArr[0].equals("o")){
                   int floorNumber = Integer.parseInt(cArr[1]);
                   eController.outsideEvent(floorNumber);
               }
               if(cArr[0].equals("i")){
                   int floorNumber = Integer.parseInt(cArr[1]);
                   eController.insideEvent(floorNumber);
               }           
           }
           eController.status();
           eController.nextStep();
           cInput = sc.nextLine();
       }
       sc.close();
    }

}
