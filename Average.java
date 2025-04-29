package Expt1; 
import java.util.Scanner; 

class Average { 
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter the number of elements: "); 
        int n = sc.nextInt(); 
        
        int[] numbers = new int[n]; 
        int sum = 0; 
        int count = 0; 

        System.out.println("Enter all the numbers (only non-negative numbers are accepted): "); 
        
        while (count < n) { 
            int input = sc.nextInt(); 
            
            if (input < 0) {
                System.out.println("Negative numbers are not allowed. Please enter a non-negative number.");
            } else {
                numbers[count] = input; 
                sum += numbers[count]; 
                count++; 
            }
        }
        
        double average = (double)sum / n; 
        System.out.println("Sum = "+ sum);
        System.out.println("Average = " + average);
    }
}
