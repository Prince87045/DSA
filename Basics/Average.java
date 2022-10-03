//Average of 2 numbers
public class Average {
    public static float add(float a,float b,float c){
        float sum=(float) a+b+c;
        float avg=sum/3;
        return (float) avg;
    }
    public static void main(String[] args) {
       float avg= (float) add(3.72f,5.76f,8.52f);
       System.out.println(avg);
    }
}
