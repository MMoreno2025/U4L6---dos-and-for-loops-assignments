//Malia Moreno | 21 November 2024//
package com.mycompany.u4l6moreloops;
import java.util.Scanner;

public class U4L6MoreLoops {
    public static void main(String[] args) {
        //define scanner and global variables//
        Scanner scan = new Scanner(System.in);
        final int MAX_LINES = 10;       //You are able to change this varaible and the code would work the same//
        int globalSpace01 = MAX_LINES;
        int globalSpace02 = MAX_LINES;
        int globalSpace03 = 1;
        
        //define variables to break loops and determin patterns//
        String breakLoop = "n";
        String patternChoice = "";
        
        
        //main while loop that breaks if user types y but keeps going if user types n//
        while(!breakLoop.equalsIgnoreCase("y")){
            //asking user what pattern they would liike to see//
            System.out.print("What pattern would you like to see? (a, b, c, d)\t");
            patternChoice = scan.next();
            
            //pattern choice a//
            if(patternChoice.equalsIgnoreCase("a")){
                //prints amount of stars based on MAX_LINES and decreases the amount each time//
                for(int row = MAX_LINES; row>0; row--){
                    for(int star=row; star>0; star--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            //pattern choice b//
            }else if(patternChoice.equalsIgnoreCase("b")){
                for(int row=MAX_LINES; row>0; row--){
                    //first prints number of spaces based on MAX_LINES-1 and decreases for each row//
                    for(int space=(row-1); space>0; space--){
                        System.out.print(" ");
                    }
                    //then prints stars based on the reminina space in each line//
                    for(int star = (MAX_LINES-globalSpace01); star>0; star--){
                        System.out.print("*");
                    }
                    System.out.println();
                    //global space variable used to determin remaining space for stars//
                    globalSpace01--;
                }
            //pattern choice c//
            }else if(patternChoice.equalsIgnoreCase("c")){
                for(int row=MAX_LINES; row>0; row--){
                    //prints number of spaces based on remaining space besides stars, uses max lines//
                    for(int space=(MAX_LINES-row); space>0; space--){
                        System.out.print(" ");
                    }
                    //prints normally dependent on number of stars per row, comes after spaces//
                    for(int star = (globalSpace02-1); star>0; star--){
                        System.out.print("*");
                    }
                    System.out.println();
                    globalSpace02--;        //second globals space variable used for stars//
                }
            //pattern choice d//
            }else if(patternChoice.equalsIgnoreCase("d")){
                for(int row=(MAX_LINES/2); row>0; row--){
                    //prints amount of spaces and decreases each line//
                    for(int space=(row-1); space>0; space--){
                        System.out.print(" ");
                    }
                    //prints stars for each line and increases//
                    for(int star=(globalSpace03); star>0; star--){
                        System.out.print("*");
                    }
                    System.out.println();
                    globalSpace03=globalSpace03+2;
                }
                globalSpace03=MAX_LINES-1;
                for(int row=(MAX_LINES/2); row>0; row--){
                    //stars and spaces change inversly to the previouse two for loops//
                    for(int space=((MAX_LINES/2)-row); space>0; space--){
                        System.out.print(" ");
                    }
                    for(int star=(globalSpace03); star>0; star--){
                        System.out.print("*");
                    }
                    System.out.println();
                    globalSpace03=globalSpace03-2;
                }
            }
            
            //asking user if they want to break the loop and end the code//
            System.out.print("\nWould you like to stop> (y/n)\t");
            breakLoop = scan.next();
        }
        
        //final line before code ends//
        System.out.println("\n\nGood bye!");
    }
}
