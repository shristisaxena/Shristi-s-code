package javafiles;

public class pattern {
    public static void main(String[] args) {

       int no = 5;

      // loop to keep count of no of rows
       for(int i = 1; i <= no; i++) {

        // inner loop to keep count of *
        for(int j = 1; j <= i; ++j) {

            System.out.print("*"); // Print *
        }
        // Change to new line once inner loop is finished
        System.out.println();
       }

            
        }


    }

