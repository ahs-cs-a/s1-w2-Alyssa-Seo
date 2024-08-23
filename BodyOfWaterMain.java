public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Dead Sea", true, 15, 100);
        BodyOfWater b1= new BodyOfWater("Dead Sea", 1000);
    
        System.out.println(b.name());
        System.out.println(b1.name());
        System.out.println(b.largestDiameter());
        System.out.println(b1.largestDiameter());
        System.out.println(b1.avgDepth());
        System.out.println(b.isSaltWater());
        b1. setname("arctic circle");
        System.out.println(b1.name());
    }
}
