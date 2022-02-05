package p003.mobile.redmi;

import p003.mobile.Mobile;

public class RedmiMobile implements Mobile {

    private Float battery = Float.valueOf(0f);

    @Override
    public void viewFuel() {
        System.out.println("Total battery in Redmi Mobile : "+battery);
    }

    @Override
    public void process(Integer processTime) {
        //  1 Min = 1.5 Percent

        if(battery < Float.valueOf(1f)) {
            System.out.println("Your Redmi Battery got dischared , Please recharge your phone");
            battery = Float.valueOf(0f);
        } else {
            battery = battery - (1.5f) * processTime;
            if(battery<Float.valueOf(0f)) {
                battery = Float.valueOf(0f);
            }
        }

    }

    @Override
    public void refillFuel(Integer refillTime) {
        // 1 Min = 7 Percent;
        battery = battery + refillTime*7;

        if(battery>Float.valueOf(100f)) {
            battery = Float.valueOf(100f);
        }

    }

    @Override
    public void calling() {
        System.out.println("Redme Mobile phone calling , Ting tong");
    }
}
