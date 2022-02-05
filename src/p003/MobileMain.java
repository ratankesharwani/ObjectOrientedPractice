package p003;
import p003.mobile.Mobile;
import p003.mobile.apple.AppleMobile;
import p003.mobile.huwawi.HuwaiMobile;
import p003.mobile.nokia.NokiaPhone;
import p003.mobile.redmi.RedmiMobile;
import p003.mobile.samsung.SamsungMobile;
public class MobileMain {
    public static void whichMobile(Machine machine) {

        if(machine instanceof NokiaPhone) {
            System.out.println("Nokia");
        }
        if(machine instanceof  Mobile) {
            System.out.println("Mobile");
        }
        if(machine instanceof AppleMobile) {
            System.out.println("Apple Mobile");
        }
        if(machine instanceof SamsungMobile) {
            System.out.println("Samsung phone");
        }
        if(machine instanceof RedmiMobile) {
            System.out.println("Redmi");
        }
        if(machine instanceof HuwaiMobile) {
            System.out.println("Huwai");
        }
        if(machine instanceof Machine) {
            System.out.println("Machine");
        }

        if(machine instanceof Object) {
            System.out.println("Object");
        }




    }
    public static void main(String[] args) {
        Mobile mobileA = new RedmiMobile();
        Mobile mobileB = new SamsungMobile();
        Mobile mobileC = new AppleMobile();
        Mobile mobileD = new HuwaiMobile();
        Mobile mobileE = new NokiaPhone();

        Mobile mobileZ = new Mobile() {
            private Float battery = Float.valueOf(0f);
            @Override
            public void calling() {
                System.out.println("I don't know");
            }

            @Override
            public void viewFuel() {

            }

            @Override
            public void process(Integer processTime) {

            }

            @Override
            public void refillFuel(Integer refillTime) {

            }
        };
        whichMobile(mobileD);

      //  mobileA.calling();
        System.out.println("---------------------");

        mobileB.calling();
        mobileB.viewFuel();
        mobileB.refillFuel(15);
        mobileB.viewFuel();
        mobileB.process(180);
        mobileB.viewFuel();
        mobileB.refillFuel(3000);
        mobileB.viewFuel();

        System.out.println("---------------------");
        mobileC.calling();
        mobileC.viewFuel();
        mobileC.refillFuel(15);
        mobileC.viewFuel();
        mobileC.process(180);
        mobileC.viewFuel();
        mobileC.refillFuel(3000);
        mobileC.viewFuel();

        System.out.println("---------------------");
        mobileD.calling();
        mobileD.viewFuel();
        mobileD.refillFuel(15);
        mobileD.viewFuel();
        mobileD.process(180);
        mobileD.viewFuel();
        mobileD.refillFuel(3000);
        mobileD.viewFuel();

        System.out.println("---------------------");
        mobileA.calling();
        mobileA.viewFuel();
        mobileA.refillFuel(15);
        mobileA.viewFuel();
        mobileA.process(180);
        mobileA.viewFuel();
        mobileA.refillFuel(3000);
        mobileA.viewFuel();


        System.out.println("---------------------");
        mobileC.calling();
        mobileC.refillFuel(15);
        mobileC.process(180);
        mobileC.refillFuel(3000);


    }
}
