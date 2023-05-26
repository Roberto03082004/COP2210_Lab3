package app;

public class Controller {

    //-------------------------------------------------------------------
    //Part 2 Step 5
    private static double areaOfTriangle;
    private static double areaOfRectangle;

    public static void main(String[] args){
        //------------------------------------------------------------------
        //Part 1 Step 3
        yourInfoHeader();

        //------------------------------------------------------------------
        //Part 1 Step 5
        displayHeaderForPartA();

        //------------------------------------------------------------------
        //Part 1 Step 8
        double radius = 8.25;
        double area = calculateAreaOfCircle(radius);
        displaySingleResult(area, "calculateAreaOfCircle\n");

        //------------------------------------------------------------------
        //Part 1 Step 9
        int value1 = 5;
        double value2 = 59.5;
        multipleNumbersIntAndDouble(value1, value2);
        System.out.println();

        //------------------------------------------------------------------
        //Part 2 Step 1
        displayHeaderForPartB();

        //------------------------------------------------------------------
        //Part 2 Step 1
        calculateAreaOfTriangleWithOutput(36.3, 18.2);
        System.out.println();

        //------------------------------------------------------------------
        //Part 2 step 2
        double base = 17.16332;
        double height = 20.172391;
        double width = 20.51723;

        calculateAreaOfTriangle(base, height);
        calculateAreaOfRectangle(height, width);

        System.out.printf("Triangle info-> \t\tbase: \t%.3f height: \t%.5f area: %.2f%n", base, height, areaOfTriangle);
        System.out.printf("Rectangle info-> \t\theight: %.4f width: \t%.1f \t area: %.5f%n", height, width, areaOfRectangle);

        //----------------------------------------------------------------
        //Part 2 step 3
        System.out.println();
        Helper.displayInfo();

        //------------------------------------------------------------------
        //Part 2 Step 4
        double radius2 = 9.3;
        double circleArea = calculateAreaOfCircle(radius2);
        System.out.println();


        calculateAreaOfTriangle(21.5, 10.3);
        calculateAreaOfRectangle(9.4, 17.2);
        double triangleArea = areaOfTriangle;
        double rectangleArea = areaOfRectangle;
        double result = triangleArea + rectangleArea + circleArea;

        System.out.printf("Value of result: %.6f%n", result);

        //------------------------------------------------------------------
        //Part 2 Step 5
        System.out.println();
        Helper.complexArea(4, 12, 5);

    }//end of main

    //----------------------------------------------------------------
    //Part 1 Step 3
    public static void yourInfoHeader(){
        System.out.println("================================");
        System.out.println("PROGRAMMER:  " + "Roberto Callejas");
        System.out.println("PANTHER ID:  " + "6360177");
        System.out.println();
        System.out.println("CLASS \t\t COP2210 ");
        System.out.println("SECTION: \t " + "U02C");
        System.out.println("SEMESTER: \t " + "Summer 2023");
        System.out.println("CLASSTIME: \t " + "10:00 AM - 12:50 PM");
        System.out.println();
        System.out.println("Assignment:  " + "Lab 3");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies and i certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person");
        System.out.println("================================");
        System.out.println();

    }//end of yourInfoHeader

    //----------------------------------------------------------------
    //Part 1 Step 4
    public static void displayHeaderForPartA(){
        System.out.println("================================");
        System.out.println("SECTION: LAB 3a");
        System.out.println("================================\n");

    }//end of DisplayHeaderForPartA
    public static void displayHeaderForPartB(){
        System.out.println("================================");
        System.out.println("SECTION: LAB 3b");
        System.out.println("================================\n");

    }//end of DisplayHeaderForPartB

    //----------------------------------------------------------------
    //Part 1 Step 6
    public static double calculateAreaOfCircle(double radius){
        double area;
        area = Math.PI * Math.pow(radius, 2);
        //System.out.println("The area of the circle is: " + area);
        return area;

    }//end of calculateAreaOfCircle

    //----------------------------------------------------------------
    //Part 1 Step 7
    public static void displaySingleResult(double value, String methodName){

        System.out.println("================================");
        System.out.printf(methodName);

        System.out.println("================================");
        System.out.printf("Value: \t\t\t%-10.4f \n", value);

    }//end of displaySingleResult

    //----------------------------------------------------------------
    //Part 1 Step 9
    public static void multipleNumbersIntAndDouble(int firstNumber, double secondNumber){
        firstNumber = 5;
        secondNumber = 59.5;
        double result = firstNumber * secondNumber;
        System.out.println();
        System.out.println("Running multipleNumbersIntAndDouble -> 5, 59.5");
        System.out.printf("\t firstNumber: \t\t %d\n", firstNumber);
        System.out.printf("\t secondNumber: \t\t %-2.1f\n", secondNumber);
        System.out.printf("\t result: \t\t\t %-3.1f\n", result);

    }//end of multipleNumbersIntAndDouble

    //----------------------------------------------------------------
    //Part 2 Step 1
    public static void calculateAreaOfTriangleWithOutput(double base, double base1){
        double areaOfTriangle = 0.5 * base * base1;
        displaySingleResult(areaOfTriangle, "calculateAreaOfTriangleWithOutput\n");
    }//end of calculateAreaOfTriangleWithOutput

    //----------------------------------------------------------------
    //Part 2 Step 2
    public static void calculateAreaOfRectangle(double height, double width) {
        areaOfRectangle = height * width;
    }//end of calculateAreaOfRectangle

    public static void calculateAreaOfTriangle(double base, double height) {
        areaOfTriangle = 0.5 * base * height;
    }//end of calculateAreaOfTriangle

    //----------------------------------------------------------------
    //Part 2 Step 5
    public static double getAreaOfRectangle() {
        return areaOfRectangle;
    }//end of getAreaOfRectangle

    public static double getAreaOfTriangle() {
        return areaOfTriangle;
    }//end of getAreaOfTriangle


}//end of controller
