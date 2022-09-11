import java.util.Scanner;
/**
 * Here is the collection of questions and answer asked or might be asked
 * in ComPro programming Test by Maharishi International University IOWA, USA
 */

public class MaharishiCollection {

    //Function to find next Perfect Square
    public static int nextPerfectSquare(int n) {
        int i=0; 
        while(true){
            i++;
        if (n<i*i)
            return i*i;
        if(n==i*i)
            return (i+1)*(i+1);
        }
    }
    public static void main(String[] args) {

        System.out.println("Enter number : ");
        Scanner scan = new Scanner(System.in);

        // input from the user
        int number = scan.nextInt();

        // function called
        int nextSuqare = nextPerfectSquare(number);

        //printing the value
        System.out.println(nextSuqare);
        
    }
    
}
