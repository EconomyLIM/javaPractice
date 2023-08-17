package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Launch {
	public static void main(String[] args) throws IOException {
	      Thread th1 = new Thread(new Runnable() {
	         String[] dishes = {"신기범", "임경재", "이상문"};
	         @Override
	         public void run() {
	            while(true) {
	               System.out.println(dishes[(int)(Math.random()*dishes.length)]);
	               try {
	                  Thread.sleep(10);
	               } catch (InterruptedException e) {
	                  e.printStackTrace();
	               }
	            }
	         }
	      });
	      th1.setDaemon(true);
	      th1.start();
	      
	      int i = 0;
	      while(i++ <= 2) {
	         try {
	            Thread.sleep(500);
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	      }
	   }
}
