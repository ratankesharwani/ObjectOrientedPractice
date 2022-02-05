package p003.mobile.apple;

import p003.mobile.Mobile;

public class AppleMobile implements Mobile {
    private Float battery = Float.valueOf(0f);
    @Override
    public void calling() {
        System.out.println("Apple Ringtone");
        viewFuel();
    }

    @Override
    public void viewFuel() {
        System.out.println("Total Apple battery "+battery+"%");
    }

    @Override
    public void process(Integer processTime) {
            // 1 Min = 0.5% and Max battery =100% min battery = 0%
      if(battery<Float.valueOf(1f)) {
          battery = Float.valueOf(0f);
          System.out.println("Your battery got discharged : Please recharge your mobile.");
      } else {
          Float totalUsedBattery = processTime * 0.5f;
          battery =  battery - totalUsedBattery;
          if(battery < Float.valueOf(0f)) {
              battery = Float.valueOf(0f);
          }
      }
    viewFuel();
    }

    @Override
    public void refillFuel(Integer refillTime) {
        // 1 Min = 1 percent
        battery =battery + Float.valueOf(refillTime);

        if(battery> Float.valueOf(100)) {
            battery = Float.valueOf(100);
        }
        viewFuel();
    }


}
