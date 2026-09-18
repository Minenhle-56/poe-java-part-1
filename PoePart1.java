/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe.part1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PoePart1 {

    public static void main(String[] args) {
        //declation of variables
        String name="";
        String surname="";
        String userName="";
        String password="";
        String cellPhone=""; 
        //calling methods
        registerUser(userName,cellPhone,password);
        loginUser(userName,password);
        returnloginStatus(name,surname);
        
        //prompting user
        Scanner myInput = new Scanner (System.in);
        System.out.print("please enter name: ");
        name = myInput.nextLine();
        System.out.print("enter surname: ");
        surname = myInput.nextLine();
        
        while(true){
            System.out.print("enter username: ");
            userName = myInput.nextLine();
            if(checkUserName(userName)){
                System.out.print("username successfully captured");
                break;
            }
            else{
                System.out.print("username incorret");
            }
        }
   
    while(true){
    System.out.print("enter pasword: ");
    password = myInput.nextLine();
    if(checkPasswordComplexity(password)){
        System.out.print("password successfully captured");
        break;
    }
    else{
        System.out.print("password is not correctly formatted");
    }
}
    while(true){
        System.out.print("enter cellphone number: ");
        cellPhone = myInput.nextLine();
        if(checkCellPhoneNumber(cellPhone)){
            System.out.print("cell successfully added");
            break;
        }
        else{
            System.out.print("cellphone number incorrect");
        }
    }
    myInput.close();
    }

            static boolean checkUserName(String userName){
            while(userName.contains("_") && userName.length() <5){
            }
            if(userName.contains("_") && userName.length() <5){
                System.out.print("username successfuly captured ");
            }
            else{
                System.out.print("user name incorrect, ensure that it is no more than five charactres and contains a hyphen");
            }
               return true;
            } 

            
            //check password
            static boolean checkPasswordComplexity(String password){
                while (password.matches(".*[A-Z]*.") && password.length()>=8){
            }
            if(password.contains(".*[0-9]*.") && password.contains(".*[!@#$%^&*?+_-={}():;/|].*")){
                System.out.print("password successfully captured");
                return true;
            }
            
            else{
                System.out.print("password is not correctly formatted; please ensure that that the password contains at least characters, a capital letter, a number and a special character");
            }
            return false;
            }

            //check cellphone number
            static boolean checkCellPhoneNumber(String cellPhone){
                // check country code and length
          return cellPhone.matches("^\\+27[0-9]{9}$") && cellPhone.length()<9;
               
           }

            static void registerUser(String userName, String cellPhone, String password){
             if(!checkUserName(userName)){
                 System.out.print("user name is not correctly formatted; please ensure that your username contains an underscore and is no more the five characters in length");
                 return;
             }
                
            if(checkPasswordComplexity(password)){
                 System.out.print("password is not corectly formatted; please ensure that that the password contains at least characters, a capital letter, a number and a special character");
                 return;
            }
          
             if(!checkCellPhoneNumber(cellPhone)){
                 System.out.print("cellphone number incorretly formatted");
             }
            
             else{
              System.out.print("user name successfully captured. password successfully captured. cellphone successfully added");
                 return;
             }
            }

            static boolean loginUser(String userName, String password){ 
                return userName.equals(userName)&& password.equals(password);
            }
            static void returnloginStatus(String name, String surname){
                System.out.print("welcome" + name + "," + surname);
                return;
            }
    }



