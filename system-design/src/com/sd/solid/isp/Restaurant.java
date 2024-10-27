package com.sd.solid.isp;

/**
 * This interface is violation of Interface Segregation Principle as each method is related to
 * different entity. e.g Waiter responsible to serve the customer Chef responsible to cook the food
 * and HouseKeeping responsible to wash the dishes. so if any of these above classes implements this
 * interface then they will have to implementing the method which is not related to their work.
 * <P>To resolve this we can segregate the interfaces into small peace of code
 * WaiterInterface <I>ChefInterface</I> <I>HouseKeepingInterface</I>
 * </P>
 */
public interface Restaurant {

  void washDishes();

  void serveCustomers();

  void cookFood();

}
