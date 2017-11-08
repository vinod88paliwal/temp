package com.hubberspot.javaee.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
 
public class OnlineUsersCounter implements HttpSessionListener {
 
 private static int numberOfUsersOnline;
	ServletContext ctx=null;
  
 public OnlineUsersCounter() {
  numberOfUsersOnline = 0;
 }
  
 public static int getNumberOfUsersOnline() {
  return numberOfUsersOnline;
 }
  
    public void sessionCreated(HttpSessionEvent event) {
 
     System.out.println("Session created by Id : " + event.getSession().getId());
     synchronized (this) {
   numberOfUsersOnline++;
  
   ctx=event.getSession().getServletContext();
	ctx.setAttribute("totalusers", numberOfUsersOnline);
	
     }
      
    }
 
    public void sessionDestroyed(HttpSessionEvent event) {
      
     System.out.println("Session destroyed by Id : " + event.getSession().getId());
     synchronized (this) {
   numberOfUsersOnline--;
  }
 
    }
  
}
