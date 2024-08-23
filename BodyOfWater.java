public class BodyOfWater {
    private String name;
    private boolean isSaltWater;
    private double largestDiameter;
    private double avgDepth;
    
    public BodyOfWater(String n, boolean s, double l, double D){
        name = n;
        isSaltWater = s;
        largestDiameter = l;
        avgDepth = D;
    }

    public BodyOfWater(String n, double D) {
        name = n;
        avgDepth = D;
    }

    public void setname(String n){
        name = n;
    }
    public void setlargestDiameter(double D){
        largestDiameter = D;
    }

    public double avgDepth(){
        return avgDepth;
    }

    public String name(){
        return name;
    }

    public double largestDiameter(){
        return largestDiameter;
    }

    public boolean isSaltWater(){
        return isSaltWater;
    }
}