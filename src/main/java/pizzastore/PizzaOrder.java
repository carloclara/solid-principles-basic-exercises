package pizzastore;

public interface PizzaOrder {

    void acceptOrderOnline();
    void acceptPaymentsOnline();
    void acceptWalkInOrders();
    void acceptOnlyCash();

}
