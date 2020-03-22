public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car c = new Car(41,"WJ","KL",278,100);
        Engine e = new Engine(31,"JH","JoJo",300,60);

        Car clone = (Car) c.clone();
        Engine clone2 = (Engine) e.clone2();

        //До

        System.out.println(c);
        System.out.println(clone);
        System.out.println(" ");
        System.out.println(e);
        System.out.println(clone2);

        //-----------------------

        clone.name = new String("Jw");
        clone2.eName = new String("Dio");
        System.out.println(" ");
        System.out.println(" ");

        //-----------------------

        //После

        System.out.println(" ");
        System.out.println(c);
        System.out.println(clone);
        System.out.println(" ");
        System.out.println(e);
        System.out.println(clone2);
    }
}
