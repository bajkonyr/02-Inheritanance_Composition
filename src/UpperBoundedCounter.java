public class UpperBoundedCounter {

    int value1, limit;

    UpperBoundedCounter() {
    }

    UpperBoundedCounter(int num) {
        value1 = num;
    }

    UpperBoundedCounter(int num, int num2) {
        value1 = num;
        limit = num2;
    }

    public int getVal() {
        return value1;

    }

    public int getLimit() {
        return limit;
    }


    public int up() {
        if (value1 < limit) {
            value1++;
        }
        return value1;
    }

    public int down() {
        return value1--;
    }

    public String toString() {
        return "A Counter with a value of " + value1 + " and a limit of " + limit;
    }
}