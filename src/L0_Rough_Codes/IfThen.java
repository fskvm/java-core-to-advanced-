package L0_Rough_Codes;

public class IfThen {
    public static void main(String[] args) {

        int result = 100;

//        if(result = 100) {
//            System.out.println("This is true");      so error because int cannot be converted to boolean
//        }
        if(result == 100) {
            System.out.println("This is true");
        }
        boolean isCar0 = false;
        if(isCar0 == true) {
            System.out.println("This is not supposed to happen 0"); // no error because isCar0 is boolean type and reassinging value i.e false to true
        }
        boolean isCar = false;
        if(isCar == true) {
            System.out.println("This is not supposed to happen 0");
        }
        boolean isCar1 = false;
        if(isCar1 == false) {
            System.out.println("This is not supposed to happen 1");
        }
        boolean isCar2 = false;
        if(isCar2 != true) {
            System.out.println("This is not supposed to happen 2");
        }
        boolean isCar3 = false;
        if(isCar3 != false) {
            System.out.println("This is not supposed to happen 3");
        }
        boolean isCar4 = false;
        if(!isCar4) {
            System.out.println("This is not supposed to happen 4");
        }
        boolean isCar5 = true;
        if(!isCar5) {
            System.out.println("This is not supposed to happen 5");
        }
    }
}
