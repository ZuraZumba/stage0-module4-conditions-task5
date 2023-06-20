package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public void printRange(int number) {
        switch (number){
            case 6,7,8,9,10:
                System.out.println("number is between 6 and 10");
                break;
            case 1, 2, 3, 4, 5:
                System.out.println("number is between 1 and 5");
                break;
            default:
                System.out.println("out of range");
                break;
        }
    }
    public static void main (String [] args){
        RangeNumbersPrinter rangeNumbersPrinter = new RangeNumbersPrinter();
        int number = 0;
        rangeNumbersPrinter.printRange(number);
    }
}
