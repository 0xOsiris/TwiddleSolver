
/**
 *
 * @author Leyton Taylor
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
  
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial state: ");
        String initialState = input.next();
        Solver puzzleSolver = new Solver(initialState, "123456789");
        System.out.println(puzzleSolver.BFS());
 
    }
    public String search(String initialState){
        Solver puzzleSolver = new Solver(initialState, "123456789");
        return puzzleSolver.BFS();
    }
    
}







