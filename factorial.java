public class factorial {
    public static void main(String[] args) {
    int num;                                   // create variables
    
    int fact=1;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a factorial number: ");    // ask the user to enter the factorial number
    num = input.nextInt();
    
    for (int i=2;i<=num; i++){
        fact=fact*i;                             // multiply all the numbers below the factorial number
    }

    System.out.println("The factorial is: "+fact);      // output the result
    }
}

