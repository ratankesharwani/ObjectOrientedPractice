package p003;

import p003.mobile.Mobile;
import p003.vehicle.Vehicle;

public class MachineMain {
    public static void typeOfMachine(Machine machine) {
        if(machine instanceof Vehicle) {
            System.out.println("The Machine is Vehicle Type");
        }
        if(machine instanceof Mobile) {
            System.out.println("The Machine is Mobile Type");
        }
    }

    public static void main(String[] args) {

    }
}
