package com.techlabs.facade;

import java.io.IOException;
  
public class FacadePatternClient {  
    public static void main(String args[]) throws NumberFormatException, IOException{  
          
            ShopKeeper sk=new ShopKeeper();  
              
                  sk.iphoneSale();  
                  sk.samsungSale();        
                  sk.blackberrySale();       
              
   }  
}  
