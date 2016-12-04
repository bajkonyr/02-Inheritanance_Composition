public class Counter

{
    int value1;

    Counter(){
    }

    Counter(int a) {
        value1=a ;
    }

    public void up() {
        value1++;
    }

    public void down() {
        value1--;
    }

    public int  getVal(){
        return (value1);
    }

    public String toString(){
        return "A Counter with a value of " + value1;
    }
}