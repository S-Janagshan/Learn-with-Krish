package org.example;
public class Application {

    public static void main(String[] args) {

        Employee employee1=new Employee(001,987,"Jana","972551578V","KVD");

        Employee employee2=new Employee(002,986,"Shan","992107856V","PPD");

        Employee employee3=new Employee(001,985,"John","961561570V","VVT");

        System.out.println(employee1.equals(employee2));

        System.out.println("Employee 1 : "+employee1);
        System.out.println("Employee 2 :"+employee2);
        System.out.println("Employee 3 :"+employee3);

        System.out.println(employee1.equals(employee3));

        employee2.setEmpId(001);
        employee2.setEmpCode(8131357);

        System.out.println(employee1.equals(employee2));

        System.out.println("Employee 1 : "+employee1);
        System.out.println("Employee 2 :"+employee2);
        System.out.println("Employee 3 :"+employee3);
    }

}