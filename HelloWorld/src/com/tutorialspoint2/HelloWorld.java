package com.tutorialspoint2;

public class HelloWorld {
   private String message;
   private String message2;
   private Inject ij;
   
   public void setMessage(String message){
      this.message  = message;
   }
   
   public void setMessage2(String message){
	   this.message2 = message;
   }
   
   public void setObject(Inject ij){
	   this.ij = ij;
   }

   public void getMessage(){
      System.out.println("Your Message : " + message);
      System.out.println("Message2: "+ message2);
   }
   
   public void getObject(){
	   System.out.println(ij);
   }
   
   public void init(){
	   System.out.println("Hello vamshi vijay in init");
   }
   
   public void destroy(){
	   System.out.println("Bye vamshi vijay in destroy");
   }
}



