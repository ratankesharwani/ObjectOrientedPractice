package p003.mobile.huwawi;

import p003.mobile.Mobile;

public class HuwaiMobile implements Mobile {
    private Float battery =  Float.valueOf(0f);
    @Override
    public void viewFuel() {
        System.out.println("Total Huwaie battery "+battery+"%");
    }

    @Override
    public void process(Integer processTime) {
        // 1 Min = 1 Percent

        if(battery < Float.valueOf(1f)) {
            battery = Float.valueOf(0f);
            System.out.println("Your Hawaie mobile Battery is low : "+battery+" % , Please recharge your phone.");
        } else {
            battery =battery-processTime;
            if(battery < Float.valueOf(0f)) {
                battery = Float.valueOf(0f);
            }
        }
    }

    @Override
    public void refillFuel(Integer refillTime) {
        // 1 Min =2 Percent
        battery =  battery + refillTime*2;
        if(battery>Float.valueOf(100f)) {
            battery = Float.valueOf(100f);
        }
    }

    @Override
    public void calling() {
        System.out.println("Hawaie Mobile calling");
    }
}
