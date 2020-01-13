/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author srinivsi
 */
public class PrintStudent
{
    public static void main(String[] args)
    {
        // Student[] list = new  Student[3];//array of object declarion
       
         Student s1= new Student();//an object for Student class
        s1.setName("sivagami");
        s1.setSid(234);
        Student s2= new Student();//an object for Student class
        s2.setName("sivi");
        s2.setSid(234);
        Student s3= new Student();//an object for Student class
        s3.setName("sivai");
        s3.setSid(234);
        Student[] list = new  Student[]{s1,s2,s3};
    //list[0]=s1;//storing object in array
    //list[1]=s2;
    //list[2]=s3;
    for(int i=0;i<list.length;i++)
    {
        System.out.println(list[i].getName()+ " " +list[i].getSid());
    }
    
}
}
