package crm.trophate.annotation;

public class Main {

    public static void main(String[] args) {
        getName(Tank.class);
    }

    public static void getName(Class<?> c) {
        LandCarrier landCarrier = c.getAnnotation(LandCarrier.class);
        if (landCarrier != null) {
            System.out.println(landCarrier.name());
        }
    }

}
