/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement;

import java.util.Scanner;




/**
 *
 * @author elcot
 */
public class Placement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int j;
        
        int[][] myList = new int[3][3];
        int[] my = new int[3];
        int[] S = new int[3];
      
        int[] J = new int[3];
           int[] list = new int[3];
        
        Scanner reader = new Scanner(System.in); 
        Scanner k = new Scanner(System.in);// Reading from System.in
System.out.println("Enter the number of Candidates: ");
int n = reader.nextInt();
        for(i=0;i<n;i++){
            System.out.println("Marks of the candidate "+(i+1));
            for(j=0;j<n;j++){
                myList[i][j] = k.nextInt();
            }
        }
        
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                my[i] = my[i]+myList[i][j];
            }
        }
        for(int h=0;h<n;h++){
            J[h]=my[h];
        }
        for(i=0;i<n;i++){
            
                System.out.println(my[i]);
            
        }
       
        for (int c = 0; c < ( n - 1 ); c++) {
      for (int d = 0; d < n - c - 1; d++) {
        if (my[d] < my[d+1]) /* For descending order use < */
        {
          //int swap       = my[d];
          //my[d]   = my[d+1];
          //my[d+1] = swap;
          //S[d] = d+1;
            int swap       = J[d];
          J[d]   = J[d+1];
          J[d+1] = swap;
        }
        
      }
    }
  for( i = 0;i<3;i++){
          for(j =0;j<3;j++){
              if(J[i]==my[j]){
                  list[i]=j;
              }
          }
      }
    System.out.println("Sorted list of numbers");
 
    for (int c = 0; c < n; c++) 
      System.out.println(list[c]);
  }
    }
    

