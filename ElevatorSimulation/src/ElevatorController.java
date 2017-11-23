
public class ElevatorController {
    private Elevator mElevator ;
    ElevatorController(Elevator mElevator){
        this.mElevator = mElevator;
    }
    public void outsideEvent(int floorNumber){
        mElevator.addDestination(floorNumber);
    }
    public void insideEvent(int floorNumber){
        mElevator.addDestination(floorNumber);
    }
    public void nextStep(){
        mElevator.moveNext();
    }
    public void status(){
        System.out.println("Current Floor : " + mElevator.getCurrentFloor() + " Next Stoppage: " + mElevator.nextDestination() + " Direction : " + mElevator.getDirection());
    }
    
    
}  
