package com.raven.main;

import java.sql.*;  

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class cona{
  public  Connection c;
   public Statement s;
    public cona(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c = DriverManager.getConnection("jdbc:mysql:///project4","root","");    
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}
