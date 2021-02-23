package AcmeOrderSystem;

public class MyDate {
 int day;
 int month;
 int year;
public MyDate(){}
    {
        this.day=01;
        this.month=01;
        this.year=2000;
    }
    public MyDate(int m , int d, int y){
    this.month=m;
    this.day=d;
    this.year=y;

}
    @Override
    public String toString() {

    return day+"/"+month+"/"+ year;
//        return "MyDate{" +
//                "day=" + day +
//                ", month=" + month +
//                ", year=" + year +
//                '}';
    }


    public void setDate(int m , int d, int y)
    {
        this.month=m;
        this.day=d;
        this.year=y;
    }



}
