package dsa.com.queue;

public class RunCircular {

  public static void main(String[] args) {
    CicularQueue queue = new CicularQueue(3);

    Employee e1 = new Employee("Yogesh", "Pawar", 1);
    Employee e2 = new Employee("Raj", "Kundra", 2);
    Employee e3 = new Employee("Ravi", "Kishan", 3);
    Employee e4 = new Employee("Shilpa", "Shetty", 4);
    Employee e5 = new Employee("Jane", "Jones", 123);
    Employee e6 = new Employee("John", "Doe", 4567);
    Employee e7 = new Employee("Mary", "Smith", 22);
    Employee e8 = new Employee("Mike", "Wilson", 3245);
    Employee e9 = new Employee("Bill", "End", 78);
    queue.add(e1);
    queue.remove();
    queue.add(e2);
    queue.add(e3);
    queue.remove();
    queue.add(e4);
    queue.add(e9);
    queue.remove();
    queue.add(e5);
    queue.add(e6);
    queue.remove();
    queue.add(e7);
    queue.add(e8);

    queue.printQueue();
  }

}
