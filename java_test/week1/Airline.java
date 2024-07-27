package week1;
import java.util.*;
public class Airline{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean seats[]=new boolean[10];
    Arrays.fill(seats,false);
    while(true){
      System.out.println("Enter Seat Preference (1 first 2 Economy): ");
      int seatPreference = in.nextInt();
      int seatNumber=0;
      boolean isFirstFull=false,isEconomyFull=false;
      if(seatPreference == 1)
      {
        for(int i=0;i<5;i++){
          if(!seats[i]){
            seatNumber=i+1;
            seats[i]=true;
            isFirstFull=false;
            break;
          }
          else{
            isFirstFull=true;
          }
        }
        if(!isFirstFull){
          System.out.println("Boarding Pass:- \nFirst class\nseat number :"+seatNumber);
        }
        if(isFirstFull){
          System.out.println("First class full,Are you with Economy class(1 to Yes . 2 to No):");
          int response=in.nextInt();
          if(response==1)
          {
            for(int i=5 ; i<10;i++){
              if ( !seats[i] ) {
                seats[i] = true;
                seatNumber = i+1;
                isEconomyFull = false;
                break;
              }
              else {
                isEconomyFull = true;
              }
            }
            if ( !isEconomyFull ) {
              System.out.println("Boarding Pass : \n"+"Seat Number : "+(seatNumber)+"\n"+"Class : Economy");
            }
            if ( isEconomyFull ) {
              System.out.println("All seats are Full!");
            }
          }
          else{
            System.out.println("Next Flight leave in 3hrs");
          }
        }
      } 
      else if(seatPreference==2){
        for ( int i = 5 ; i < 10 ; i++ ) {
          if ( !seats[i] ) {
            seats[i] = true;
            seatNumber = i+1;
            isEconomyFull = false;
            break;
          }
          else {
            isEconomyFull = true;
          }
        }
        if ( !isEconomyFull ) {
          System.out.println("Boarding Pass : \n"+"Seat Number : "+(seatNumber)+"\n"+"Class : Economy");
        }
        if ( isEconomyFull ) {
          System.out.println("Economy is Full! Are you okay with the First Class?\n1 -- Yes\n2 -- No");
          int response = in.nextInt();
          if ( response == 1 ) {
            for ( int i = 0 ; i < 5 ; i++ ) {
              if ( !seats[i] ) {
              seats[i] = true;
              seatNumber = i+1;
              isFirstFull = false;
              break;
              }
              else {
              isFirstFull = true;
              }
            }
            if ( !isFirstFull ) {
              System.out.println("Boarding Pass : \n"+"Seat Number : "+(seatNumber)+"\n"+"Class : First Class");
            }
            if ( isFirstFull ) {
              System.out.println("All seats are Full!");
            }
          }
        }
      }
      else{
        System.out.println("Invalid Preference Re-enter");
      }
      if(isFirstFull && isEconomyFull)
        break;
    }
  }
}