package azerty.com;

/*

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static String msgClient;
	public static String msgServeur;
	
   public static void main(String[] args) {
      
      final Socket clientSocket;
      final BufferedReader in;
      final PrintWriter out;
      final Scanner sc = new Scanner(System.in);
  
      try {
         /*
         * les informations du serveur ( port et adresse IP ou nom d'hote
         * 127.0.0.1 est l'adresse local de la machine
         
         clientSocket = new Socket("127.0.0.1",5300);
   
         //flux pour envoyer
         out = new PrintWriter(clientSocket.getOutputStream());
         //flux pour recevoir
         in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
   
         Thread envoyer = new Thread(new Runnable() {
             //String msg;
              @Override
              public void run() {
                while(true){
                  msgClient = sc.nextLine();
                  out.println(msgClient);
                  out.flush();
                }
             }
         });
         envoyer.start();
   
        Thread recevoir = new Thread(new Runnable() {
            //String msg;
            @Override
            public void run() {
               try {
                 msgServeur = in.readLine();
                 while(msgServeur!=null){
                    System.out.println("Serveur : "+msgServeur);
                    msgServeur = in.readLine();
                 }
                 System.out.println("Serveur d�conect�");
                 out.close();
                 clientSocket.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
            }
        });
        recevoir.start();
   
      } catch (IOException e) {
           e.printStackTrace();
      }
  }
}
*/