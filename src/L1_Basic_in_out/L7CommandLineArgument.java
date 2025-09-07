package L1_Basic_in_out;

public class L7CommandLineArgument {
        public static void main(String[] args){

            //    Example of command-line argument that prints all the values passed as arguments.The arguments is of string type by default.
            //! To pass any argument as sentence or string, we need to use double quotes.
            System.out.println("Demo of Command Line Arguments");
            System.out.println("Number of arguments: " + args.length); //? here args is an array of string type
                                                                       //? "length" is a property of array that returns the length of the array
            if(args.length > 0) {                                                          //? "." is used to access the property of an object.
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument at index " + i + ":" + args[i]);
              }
            }
            else
            {
                 System.out.println("No arguments passed.");
            }

            System.out.println("Sum of two arguments: " +  args[0] + args[1]); //? here the sum is not calculated but concatenated
        }
}
