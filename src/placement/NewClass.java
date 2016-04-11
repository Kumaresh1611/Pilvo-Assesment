package placement;

import java.io.File;
import java.util.Scanner;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import com.aspose.cells.*;
import jxl.SheetSettings;
//
public class NewClass {
    public static void main(String[] args) throws Exception{
            
        int i,j;
        int[][] myList = new int[13][13];
        int[] my = new int[13];
        int[] S = new int[13];
        int[] J = new int[13];
        int[] list = new int[13];
        int[] kl = new int[13];
        
        Scanner reader = new Scanner(System.in); 
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the number of Candidates: ");
        int n = reader.nextInt();
        //ALL THREE INTERVIEWERS INTERVIEW A SINGLE CANDIDATE AT A TIME AND ENTER THEIR MARK INDIVIDUALLY
        for(i=0;i<n;i++){
            System.out.println("Marks of the candidate "+(i+1));
            for(j=0;j<n;j++){
                myList[i][j] = k.nextInt();
            }
        }
        //SUMS UP THE MARK OF EACH INDIVIDUAL CANDIDATE
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                my[i] = my[i]+myList[i][j];
            }
        }
        for(int h=0;h<3;h++){
            J[h]=my[h];
        }
     
      //SORT THE CANDIDATES BASED ON THEIR MARKS 
      for (int c = 0; c < 3; c++) {
      for (int d = 0; d < 2; d++) {
        if (J[d] < J[d+1]) 
        {
          int swap = J[d];
          J[d]   = J[d+1];
          J[d+1] = swap;
        }
        
      }
      //RANK THE CANDIDATES
      for( i = 0;i<3;i++){
          for(j =0;j<3;j++){
              if(J[i]==my[j]){
                  list[i]=j;
              }
          }
      }
    }
 
   for (int c = 0; c < 3; c++) 
      kl[c]=((list[c]+1));
    //INTERVIEWER 1
    File f1 = new File("C:\\Users\\elcot\\Desktop\\INTERVIEWER1_ASSESMENT.xls");
        WritableWorkbook myexcel1 = Workbook.createWorkbook(f1);
        WritableSheet mysheet1 = myexcel1.createSheet("mysheet1",0);
     for(i=0;i<3;i++){
        Label l1 = new Label(0,i,Integer.toString(myList[i][0]));
        //}
        mysheet1.addCell(l1);
    }
        /* Password for Worksheet */
//java.lang.Boolean set_protected = new java.lang.Boolean(true);
//Worksheet_settings.setProtected(set_protected);
  
        myexcel1.write();
        myexcel1.close();
        //INTERVIEWER 2
        File f3 = new File("C:\\Users\\elcot\\Desktop\\INTERVIEWER2_ASSESMENT.xls");
        WritableWorkbook myexcel2 = Workbook.createWorkbook(f3);
        WritableSheet mysheet2 = myexcel2.createSheet("mysheet2",0);
     for(i=0;i<3;i++){
        Label l2 = new Label(0,i,Integer.toString(myList[i][1]));
        //}
        mysheet2.addCell(l2);
    }
        myexcel2.write();
        myexcel2.close();
        //INTERVIEWER 3
        File f2 = new File("C:\\Users\\elcot\\Desktop\\INTERVIEWER3_ASSESMENT.xls");
        WritableWorkbook myexcel3 = Workbook.createWorkbook(f2);
        WritableSheet mysheet3 = myexcel3.createSheet("mysheet3",0);
     for(i=0;i<3;i++){
        Label l1 = new Label(0,i,Integer.toString(myList[i][2]));
        //}
        mysheet3.addCell(l1);
    }
        myexcel3.write();
        myexcel3.close();
    //RESULT
     File f = new File("C:\\Users\\elcot\\Desktop\\FINAL_RESULT.xls");
        WritableWorkbook myexcel = Workbook.createWorkbook(f);
        WritableSheet mysheet = myexcel.createSheet("mysheet",0);
     for(i=0;i<3;i++){
        Label l = new Label(0,i,Integer.toString(kl[i]));
        //}
        mysheet.addCell(l);
    }
     SheetSettings Worksheet_settings=mysheet.getSettings();
Worksheet_settings.setPassword("password");
        myexcel.write();
        myexcel.close();
        
  }
    
}
