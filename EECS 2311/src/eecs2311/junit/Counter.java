package eecs2311.junit;

public class Counter {

    private int data;
    
    public Counter() {
        data = 0;
    }
    
    public int reset() {
    	data = 0;
    	return this.data;
    }
    
    public int increment() {
        data++;
        return data;
    }
    
    public int increment(int n) {
        data += n;
        return data;
    }
    
    public int decrement() {
        data--;
        return data;
    }
    
    public int decrement(int n) {
        data -= n;
        return data;
    }
}