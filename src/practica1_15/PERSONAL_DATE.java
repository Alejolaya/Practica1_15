/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_15;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PERSONAL_DATE {
    private String name,lastname,id,birth,address,phone;
    private int age;
    
    public void loading_data(){
    Scanner kbi =new Scanner(System.in);
    System.out.println("First Name:");
    name=kbi.next();
    System.out.println("Lastname:");
    lastname=kbi.next();
    System.out.println("Age:");
    age=kbi.nextInt();
    System.out.println("Id:");
    id=kbi.next();
    System.out.println("Birthdate DD/MM/YY:");
    birth=kbi.next();
    System.out.println("Address:");
    kbi.next();
    address=kbi.nextLine();
    System.out.println("Telehone number:");
    phone=kbi.next();
             
    }
    
    public void Show_Data(){
        System.out.println("Name:"+name);
        System.out.println("LastName:"+lastname);
        System.out.println("Age:"+age);
        System.out.println("Id:"+id);
        System.out.println("Birthdate:"+birth);
        System.out.println("Address:"+address);
        System.out.println("Telephone number:"+phone);
    }
    
}
