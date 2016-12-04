
public class BoundedCounter
{
    int value1, upperlimit,lowerlimit;

    BoundedCounter(){
    }

    BoundedCounter(int num) {
        value1 = num;
        upperlimit = 10;
    }
    BoundedCounter(int num, int num2){
        value1=num;
        upperlimit=num2;
    }

    BoundedCounter(int num, int num2, int num3){
        value1=num;
        lowerlimit=num3;
        upperlimit=num2;
    }

    public int getVal(){
        return value1;
    }

    public int getLowerLimit(){
        return lowerlimit;
    }

    public int getUpperLimit(){
        return upperlimit;
    }


    public void up() {
        if(value1<upperlimit) {
            value1++;
        }

    }

    public void down() {
        if(value1>lowerlimit)
            value1--;
    }

    public  String toString() {
        return "A Counter with a value of " + value1 + ", lower limit of "+ lowerlimit+ ", and upper limit "+ upperlimit;
    }
}