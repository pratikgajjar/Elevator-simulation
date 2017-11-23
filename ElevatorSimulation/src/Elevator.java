
public class Elevator {
    private int totalFloor ;
    private boolean floors[] ;
    public enum Direction {
        NONE,UP,DOWN
    }
    private Direction mDirection = Direction.NONE;
    private int currentFloor = 0;
    private int nextFloor = -1;
    private int countUp = 0 ;
    private int countDown = 0 ;
    private int maxPoint = -1 ;
    private int minPoint = totalFloor ;
    
    Elevator(int totalFloor){
        if(totalFloor <= 0) throw new IllegalArgumentException() ;
        this.totalFloor = totalFloor;
        floors = new boolean[totalFloor + 1];
    }
    public int getCurrentFloor(){
        return currentFloor;
    }
    public int nextDestination(){
        if(mDirection == Direction.UP){
            for(int i = currentFloor+1 ;i <= totalFloor ;i++){
               if(floors[i]) return i ; 
            }
        }
        if(mDirection == Direction.DOWN){
            for(int i = currentFloor-1 ; i >= 0 ; i--){
               if(floors[i]) return i ; 
            }
        }
        return -1;
    }
    public void moveNext(){
        if(countUp + countDown == 0) return;
        if(mDirection == Direction.DOWN){
            if(floors[--currentFloor]){
                floors[currentFloor] = false ;
                if(--countDown == 0){
                    mDirection = (countUp > 0 ) ? Direction.UP : Direction.NONE ;
                    minPoint = totalFloor + 1;
                }
            }
        }
        if(mDirection == Direction.UP){
            if(floors[++currentFloor]){
                floors[currentFloor] = false;
                if(--countUp == 0){
                    mDirection = (countDown > 0) ? Direction.DOWN : Direction.NONE;
                    maxPoint = -1;
                }
            }
        }
    }
    public void addDestination(int floorNumber){
        if(floorNumber < 0 && floorNumber > totalFloor )throw new IllegalArgumentException();
        if(currentFloor==floorNumber || floors[floorNumber]) return;
        floors[floorNumber] = true;
        if(floorNumber > currentFloor){
            countUp++;
            maxPoint = max(maxPoint , floorNumber);
        }
        else{
            countDown++;
            minPoint = min(minPoint , floorNumber);
        }
        if(mDirection == Direction.NONE){
            mDirection = (currentFloor > floorNumber) ? Direction.DOWN : Direction.UP;
        }
    }
    public Direction getDirection(){
        return mDirection;
    }
    public int max(int a , int b){
        if(a > b) return a ;
        return b;
    }
    public int min(int a , int b){
        if(a < b) return a;
        return b;
    }
    
}
