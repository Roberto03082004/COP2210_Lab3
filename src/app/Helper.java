package app;

public class Helper {

    //----------------------------------------------------------------
    //Part 2 Step 3
    public static void displayInfo(){
        System.out.println("=============================");
        System.out.println("DISPLAY INFO FROM HELPER CLASS");
        System.out.println("=============================");

    }//end displayInfo

    //----------------------------------------------------------------
    //Part 2 Step 5
    public static void complexArea(int circleMultiplier, int rectangleMultiplier, int triangleMultiplier) {
        Controller.calculateAreaOfRectangle(14.2, 20.7);
        Controller.calculateAreaOfTriangle(33.2, 16.2);

        double value1 = circleMultiplier * Controller.calculateAreaOfCircle(10.7);
        double value2 = rectangleMultiplier * Controller.getAreaOfRectangle();
        double value3 = triangleMultiplier * Controller.getAreaOfTriangle();

        double results = value1 + value2 + value3;

        System.out.println("==============================");
        System.out.println("COMPLEX AREA FROM HELPER CLASS");
        System.out.println("==============================");

        System.out.printf("Results: \t\t\t\t%.3f\n", results);
        System.out.printf("circleMultiplier: \t\t%d\n", circleMultiplier);
        System.out.printf("rectangleMultiplier: \t%d\n", rectangleMultiplier);
        System.out.printf("triangleMultiplier: \t%d\n", triangleMultiplier);
    }//end of complexArea
}//end of Helper
