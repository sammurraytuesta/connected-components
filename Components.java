import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Stack;

/** Author: Samantha Murray Tuesta
 *  Date: November 14, 2020
 *  Purpose: Create a class "Components" that recieves a file as input and returns
 *  the number of connected components within the graph as listed in the file
*/

public class Components {

    //adjacency matrix
    public static boolean[][] adj;
    //array that keeps track of visited nodes
    public static boolean[] visited;

    /** Main program: creates an adjaceny matrix from a given file then computes and prints the number of connected components */
    public static void main(String[] args) {
        if (args.length != 1){
            //checks for a filename in the command line
            System.out.println("Requires 1 argument: filename");
            return;
        }
        try{
            //reads the file 
            File file = new File(args[0]);
            Scanner scanner = new Scanner(file);
            //prints out number of connected components within the graph
            System.out.println(connectComp(scanner));  
        }
        catch (FileNotFoundException e){
            //catches whether or not a valid filename has been input to the command line
            System.out.println("Could not find file");
        }
    }

    /** Return the number of connected components */
    private static int connectComp(Scanner sc){
        //reads first line for integer and sets it as the sizes for adj and visited
        int V = sc.nextInt();
        adj = new boolean[V][V];
        visited = new boolean[V];
        //initialize count to keep track of connected components
        int count = 0;
        //reads file for nodes and places them in boolean adj matrix accordingly
        while(sc.hasNextLine()){
            int row = sc.nextInt();
            int col = sc.nextInt();
            //sets boolean at an edge (u, v) to true if exists between row (node) and col (node)
            adj[row][col] = true;
            //accounts for the inverse as well
            adj[col][row] = true;
        }
        //for each node in the graph
        for (int i = 0; i < visited.length; i++){
            //check each node if not yet visited for its connectivity to its neighbors
            for (int j = 0; j < visited.length; j++){
                if (!visited[j]){
                    //calls dfs to find where the connection stops 
                    dfs(j);
                    //adds to count every time dfs is called because dfs tells us connectivity
                    count++;
                }
            }
        }  
        //returns number of connected components  
        return count;
    }

    /** visit all nodes explorable from u
     * pre: u is unvisited */
    private static void dfs(int nodeID){
        //uses a stack to iteratively visit nodes
        Stack<Integer> s = new Stack<Integer>();
        //push node we want to check for connections
        s.push(nodeID);
        while(!s.isEmpty()){
            int u = s.pop();
            if (visited[u] == false){
                //visit the node we are on 
                visited[u] = true;
                //v keeps track of the (col) number of the node that is connected to our node
                int v = 0;
                //for each edge (u, v)
                for(boolean bool : adj[u]){
                    if(bool == true){
                        //push the connected/neighboring node
                        s.push(v);
                    }
                    //increment v as we go
                    v++;
                }
            }
        }
        
    }
}
