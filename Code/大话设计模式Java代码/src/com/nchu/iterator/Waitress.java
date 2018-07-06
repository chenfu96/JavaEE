package com.nchu.iterator;

import java.util.Iterator;

public class Waitress {  
  
    private Iterator<MenuItem> iterator = null;  
    private Menu menu = null;  
      
    public Waitress(Menu menu) {  
        this.menu = menu;  
    }  
      
    public void printMenu() {  
        System.out.println("\n²Ëµ¥£º");  
        iterator = menu.createIterator();  
        while(iterator.hasNext()) {  
            System.out.println(iterator.next());  
        }  
    }  
} 