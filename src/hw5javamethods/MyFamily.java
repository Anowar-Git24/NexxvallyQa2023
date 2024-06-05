package hw5javamethods;

public class MyFamily {
    
    public int child1Age = 10;
    public int child2Age = 8;
    public int child3Age = 6;
    public int child4Age = 4;

    // Step 3: Implement a return type method which is int type with a different name
    
    public int calculateTotalAge() {
        int sum = child1Age + child2Age + child3Age + child4Age;
        System.out.println("The sum of my children's ages is: " + sum);
        return sum;
    }

    // Step 4: Create a main method after the method, Instantiate the class and call the method by the object
    
    public static void main(String[] args) {
        MyFamily family = new MyFamily();
        family.calculateTotalAge();
    }
}
