package dsa.com.stack;

public class Main {

  public static void main(String[] args) {
    Employee employee = new Employee("Yogesh",
        "Pawar", 1);
    Employee employee1 = new Employee("Riyansh",
        "Pawar", 2);
    Employee employee2 = new Employee("Raj", "Kundra", 3);

    LinkedListStack stack = new LinkedListStack();
    stack.push(employee);
    stack.push(employee1);
    stack.push(employee2);
    stack.printStack();
    System.out.println(stack.peek());

    ArrayStack arrayStack = new ArrayStack(3);
    arrayStack.push(employee);
    arrayStack.push(employee1);
    arrayStack.push(employee2);
    arrayStack.printStack();
    System.out.println(arrayStack.peek());

  }

}
