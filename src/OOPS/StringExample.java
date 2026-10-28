package OOPS;

class Mobile {
    String brand;
    String price;
    static String name;


    public void show() {
        System.out.println(brand + " " + price + " " + name);
    }
}


public class StringExample {


    static void main(String[] args) {

        String str = "Mega";
        System.out.println(str);

        // There a two ways to create the string
        String s = new String("Mega");
        System.out.println(s.concat(str));


        /**
         * Here we working with string buffer and bulider
         * diff between bulider and buffer means buffer is the thread safe but builder its not but both has same methods
         *
         */

        StringBuffer buffer = new StringBuffer("Dinesh"); // In buffer you can change the string  it give the extra 21 spaces
        StringBuffer stringBuffer = new StringBuffer("Dinesh");
        System.out.println(buffer == stringBuffer);


        Mobile mobile = new Mobile();
        mobile.brand = "Redmi";
        mobile.price = "7000";
        Mobile.name = "Phone";


        // H
        Mobile mobile1 = new Mobile();
        mobile.brand = "MOTO";
        mobile.price = "10000";
        Mobile.name = "Phone";

        mobile.show();
        mobile1.show();

    }

}
