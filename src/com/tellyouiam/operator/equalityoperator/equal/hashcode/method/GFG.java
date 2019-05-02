package com.tellyouiam.operator.equalityoperator.equal.hashcode.method;

public class GFG {

    /**
     * Here, First we are comparing the hashCode on both Objects (i.e. g1 and g2)
     * and if same hashcode is generated by both the Objects that does not mean that
     * they are equal as hashcode can be same for different Objects also,
     * if they have the same id (in this case). So if get the generated hashcode values are equal
     * for both the Objects, after that we compare the both these Objects w.r.t their state for
     * that we override equals(Object) method within the class.
     * And if both Objects have the same state according to the equals(Object) method then they are equal otherwise not
     * */

    public static void main(String[] args) {

        // creating the Objects of Geek class.
        Geek g1 = new Geek("aa", 1);
        Geek g2 = new Geek("aa", 1);

        // comparing above created Objects.
        if(g1.hashCode() == g2.hashCode()) //Cùng giá trị hashCode chưa chắc đã bằng nhau.
        {

            if(g1.equals(g2)) //Nếu không override equal() và hashCode() thì if statement sẽ trả về true.
                //Không giống trường hợp ở Budgie Class
             System.out.println("Both Objects are equal. ");
            else
                System.out.println("Both Objects are not equal. ");

        }
        else
            System.out.println("Both Objects are not equal. ");
        System.out.println(g1.hashCode());
        System.out.println(g2.hashCode());
    }
}