# Elevator-simulation
To run the programm compile and execute ElevatorSimulator.java. <br>
Sample input-output
```
Enter single char for outside and inside 'o' and 'i' respectively
Example : o 5 is interpreted as someone wants to use lift at floor 5
Example : i 3 is interpreted as someone wants to go floor num 3
Enter 'exit' to quit the program and enter to continue the program
Enter Number of floor :
5
i 5
Current Floor : 0 Next Stoppage: 5 Direction : UP
i 4
Current Floor : 1 Next Stoppage: 4 Direction : UP

Current Floor : 2 Next Stoppage: 4 Direction : UP

Current Floor : 3 Next Stoppage: 4 Direction : UP

Current Floor : 4 Next Stoppage: 5 Direction : UP

Current Floor : 5 Next Stoppage: -1 Direction : NONE
o 3
Current Floor : 5 Next Stoppage: 3 Direction : DOWN

Current Floor : 4 Next Stoppage: 3 Direction : DOWN

Current Floor : 3 Next Stoppage: -1 Direction : NONE
o 2
Current Floor : 3 Next Stoppage: 2 Direction : DOWN

Current Floor : 2 Next Stoppage: -1 Direction : NONE
o 0
Current Floor : 2 Next Stoppage: 0 Direction : DOWN

Current Floor : 1 Next Stoppage: 0 Direction : DOWN

Current Floor : 0 Next Stoppage: -1 Direction : NONE
