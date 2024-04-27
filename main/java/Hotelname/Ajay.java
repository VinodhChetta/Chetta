
package Hotelname;
import java.util.Scanner;
public  class Ajay  {
    static String user;
    public static void hot(){
 
       final String[] hotels={"nethra","saravanabavan","hukeem","alifha","kannappa","raja-kafe","thai-hotel"};
       int i=0;
       System.out.println("............................These Hotels Are Only Available Now.Please Choose Any Of One:.............................");
       System.out.println("==============================================================================================================================");
       while(i<hotels.length){
       System.out.println(hotels[i]);
       i++;
       }
      //hotel given by users
       Scanner in=new Scanner(System.in); 
          user=in.next();
       
           if(user.equalsIgnoreCase(hotels[0])||user.equalsIgnoreCase(hotels[1])||user.equalsIgnoreCase(hotels[2])||user.equalsIgnoreCase(hotels[3])||user.equalsIgnoreCase(hotels[4])||user.equalsIgnoreCase(hotels[5])||user.equalsIgnoreCase(hotels[6])){
            System.out.println("==============================================================================================================================");
          System.out.println("->->->->->->->->->->->->->->->->->->->->->->->->->->WELCOME OUR"+" "+""+user.toUpperCase()+"<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-");
          //items.item();
           }
           else{
           System.out.println("Sorry You Choose Unknown Hotel Name!!");
           }
       
    }
}
