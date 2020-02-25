import java.awt.*;


public class loopbutton extends Frame{

public loopbutton(String buttons){


	
      
   super(buttons);
    
   setLayout(new FlowLayout());
   
   String[] btnname={"Login","Logout","Home","Exit"};
   
   for(int i=0;i<4;i++){
   
     Button b1=new Button(btnname[i]);
     add(b1); 
  
   }
   }
  public static void main(String[] args){
 
 loopbutton button=new loopbutton("buttons");
      button.setVisible(true);
      button.setSize(400,150);
 
 
 
 
 }
}
