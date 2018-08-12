import java.io.*;
public class RockPaperScissorGame
{
    public static void main(String args[]) throws IOException
    {
        String input,user,comp,choice;
        int cmp=0,ply=0;
        BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Instruction to play the game ");
        System.out.println("1. dont try to cheat bcoz you cannot");
        System.out.println("2. type quit to quit the game and see your points ");
        System.out.println("3. Hope you win ");
        String arr[]={"rock","paper","scissor"};
        while(true)
            {
              System.out.print("Enter your choice :  ");
             choice = buff.readLine();
             user=choice.toLowerCase();
             if(user.compareTo("quit")==0)
             {
                 break;
                }
             comp=arr[(int)Math.floor(Math.random()*3)];
              System.out.println("Computer chooses  "+comp);
              if(user.compareTo(comp)==0)
              {
                  System.out.println("It's a tie");
                }
                else if(((user.compareTo("rock")==0)&&(comp.compareTo("scissor")==0))||
                ((user.compareTo("paper")==0)&&(comp.compareTo("rock")==0))||
                ((user.compareTo("scissor")==0)&&(comp.compareTo("paper")==0)))
                {
                   System.out.println("You wins"); 
                   ply+=1;
                }
                else if(((user.compareTo("rock")==0)&&(comp.compareTo("paper")==0))||
                ((user.compareTo("paper")==0)&&(comp.compareTo("scissor")==0))||
                ((user.compareTo("scissor")==0)&&(comp.compareTo("rock")==0)))
                {
                   System.out.println("Computer wins");
                   cmp+=1;
                }
                else 
                {
                    System.out.println("Wrong Input");
                }
              }
              System.out.println("-----------------Points Table------------------------");
              System.out.println("Computer  :  "+cmp);
              System.out.println("Player    :  "+ply);
              System.out.println("-------------------------------------------------------");
              System.out.println("If had fun playing than pls follow  ");
    }
}
 