/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class abc{
        String name;
        int age;
       
        void setName(String s){
            name  = s;
        }
        void setAge(int a){
            age = a;
        }
        String getname(){
            return name;
        }
       
        int getAge(){
            return age;
        }
}
public class Main
{
public static void main(String[] args) {
   abc obj = new abc();
   obj.setName("pawan");
   obj.setAge(20);
  System.out.println(obj.getname());
    System.out.println(obj.getAge());
}
}