public class Shape {
    float a, b, c;
    Shape(float a){
        this.a = a;
    }
    Shape(float a, float b){
        this.a = a;
        this.b = b;
    }

    Shape(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    float cal_area(float a){
        return a*a;
    }
    float cal_area(float a, float b){
        return a*b;
    }
    float cal_area(float a, float b, float c){
        float s = (a+b+c)/2;
        return (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

}
