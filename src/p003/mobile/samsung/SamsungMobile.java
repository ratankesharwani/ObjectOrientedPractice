package p003.mobile.samsung;

import p003.mobile.Mobile;

public class SamsungMobile implements Mobile {
    private Float battery = Float.valueOf(0f);
    @Override
    public void viewFuel() {
        System.out.println("Total battery in Redmi Mobile "+battery);
    }

    @Override
    public void process(Integer processTime) {
     if(battery< Float.valueOf(1f)){
         System.out.println("your Samsoong Phone battery is discharged, Please Recharge ");
         battery = Float.valueOf(0f);
     }
     else{
         //1 min = 3 %
         battery = battery-processTime*3;
         if (battery < Float.valueOf(0f)) {
             battery= Float.valueOf(0f);
         }
     }
    }

    @Override
    public void refillFuel(Integer refillTime) {
         //1 min =6%
        battery=battery+refillTime*6;
        if(battery>Float.valueOf(100f)){
            battery = Float.valueOf(100f);
        }
    }

    @Override
    public void calling() {
        System.out.println("Samsoong Phone is calling < dinka chika ");
    }
}
