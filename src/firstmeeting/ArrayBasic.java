/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstmeeting;

/**
 *
 * @author dania
 */

class Employee{
    public int age;
    public String name;
    Employee(int age, String name){
        this.age = age;
        this.name = name;
    }
}
public class ArrayBasic {
    public static void main(String[] args) {
        System.out.println("Learning Array");
        int n = 2;
        int[] arr;
        arr = new int[n];
        arr[0] = 10;
        arr[1] = 20;
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index Ke " + i + " : " + arr[i]);
        }
        
        System.out.println();
        System.out.println("Array of Object");
        Employee[] empArr;
        empArr = new Employee[n];
        empArr[0] = new Employee(26, "Daniar Nur Amin");
        empArr[1] = new Employee(23, "Mega Rianti");
        for (int i = 0; i < empArr.length; i++) {
            System.out.println("Employee " + (i + 1) + " : Name " + empArr[i].name + " and Age " + empArr[i].age);
        }
    }
}
