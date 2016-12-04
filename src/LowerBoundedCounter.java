public class LowerBoundedCounter
{
    int value1, limit;

    LowerBoundedCounter(){
    }

    LowerBoundedCounter(int num){
        value1=num;
    }

    LowerBoundedCounter(int num, int num2){
        value1=num;
        limit=num2;
    }

    public int  getVal(){
        return value1;
    }

    public int  getLimit(){
        return limit;
    }


    public void up() {
        value1++;

    }

    public void down() {
        if (value1 > limit) {
            value1--;
        }
    }

    public  String toString() {
        return "A Counter with a value of " + value1 + " and a limit of "+ limit;
    }
}