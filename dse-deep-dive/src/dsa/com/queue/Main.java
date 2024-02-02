package dsa.com.queue;

public class Main {

  public static void main(String[] args) throws NoSuchFieldException {
    Employee employee = new Employee("Yogesh",
        "Pawar", 1);
    Employee employee1 = new Employee("Riyansh",
        "Pawar", 2);
    Employee employee2 = new Employee("Raj", "Kundra", 3);

    EmployeeQueue queue = new EmployeeQueue(3);
    queue.add(employee);
    queue.add(employee1);
    queue.add(employee2);

    queue.printQueue();
    System.out.println("Pick :" + queue.peek());
    queue.remove();
    queue.remove();
    queue.remove();

    queue.printQueue();
  }

}
