package p003.mobile.nokia;

import p003.mobile.Mobile;

public class NokiaPhone implements Mobile {

    private Float battery = Float.valueOf(0f);

    @Override
    public void viewFuel() {
        System.out.println("Total Battery Percentage in your Nokia mobile : "+battery);
    }

    @Override
    public void process(Integer processTime) {
        // 1 Min = 3 Percent
        if(battery<Float.valueOf(1f)) {
            System.out.println("Your Nokia phone battery is dischared : Please charge your phone");
            battery = Float.valueOf(0f);
        } else {
            battery = battery - 3*processTime;
            if(battery < Float.valueOf(0f)) {
                battery = Float.valueOf(0f);
            }
        }
    }

    @Override
    public void refillFuel(Integer refillTime) {
        // 1 Min  = 4 %
        battery = battery + refillTime*4;
        if(battery>Float.valueOf(100f)) {
            battery = Float.valueOf(100f);
        }
    }

    @Override
    public void calling() {
        System.out.println("Nokia phone calling..");
    }
}
