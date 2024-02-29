/* Mustafa Nafia
 * Professor: Dr.Walsh
 * Course: C202 - Markov Chain
 * Date: 10/13/2019
 */



import java.util.Random;


public class MarkovChain {

    public static void main(String[] args) { 
       Random randomGenerator = new Random();
      // the state transition matrix
      double[][] transition = { { 0.9, 0.05, 0.05},
                                { 0.05, 0.9, 0.05},
                                { 0.05, 0.05, 0.9}
                              };
                              
                              
                              
         int randomInt = randomGenerator.nextInt(3) + 1;
                       
         System.out.println("The random cola selection between 1 and 3 is: " + randomInt);
                              
                              
     if(randomInt == 1) { 
            System.out.println("cola 1 was purchased");
            System.out.println("Cola 1 probability: " );
                             
             for (int i = 0; i < transition.length; ++i) {
             System.out.print(" " + transition[0][i]);
         
        }
                        }
                        
                               
   if(randomInt == 2) { 
              System.out.println("cola 2 was purchased");
              System.out.println("Cola 2 probability: " );
                             
             for (int i = 0; i < transition.length; ++i) {
             System.out.print(" " + transition[1][i]);
                        
        }
                        }
                               
    if(randomInt == 3) { 
          System.out.println("cola 3 was purchased");
          System.out.println("Cola 3 probability: " );
                             
            for (int i = 0; i < transition.length; ++i) {
          System.out.print(" " + transition[2][i]);
                                       
      }
     
    }
    System.out.println();                          
    System.out.println("The next predicted cola  is Cola " + randomInt);    
    //System.out.println("Cola " + randomInt);
    
    if(randomInt == 1) {
     System.out.println("The next probablity is: " +  .90 * .90 + " " + (1-0.81)/2 + " " + ((1-0.81)/2));  
 
  }
  
  
   if(randomInt == 2) {
     System.out.println("The next probablity is: " + (1-0.81)/2 + " " + .90 * .90 + " " + (1-0.81)/2);  
    }
    
     if(randomInt == 3) {
     System.out.println("The next probablity is: " + (1-0.81)/2 + " " + (1-0.81)/2 + " " + .90 * .90);
    }
    
  
  
  

 }
}
