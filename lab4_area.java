import java.util.*;

public class lab4_area {

//    float cal_area(float a){
//        return a*a;
//    }
//    float cal_area(float a, float b){
//        return a*b;
//    }
//    float cal_area(float a, float b, float c){
//        float s = (a+b+c)/2;
//        return (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
//    }

    public static void main(String[] args) {
//        lab4_area ob1 = new lab4_area();
        Shape ob1 = new Shape(5);
        Shape ob2 = new Shape(5, 4);
        Shape ob3 = new Shape(3, 4, 5);
        System.out.println(ob1.cal_area());
        System.out.println(ob2.cal_area());
        System.out.println(ob3.cal_area(3, 4, 5));
    }

}
