package day11.task1;

public class Warehouse {
    int countPickedOrders;
    int countDeliveredOrders;

    public int getPickedOrders(){
        return countPickedOrders;
    }

    public int getDeliveredOrders(){
        return countDeliveredOrders;
    }

    public String toString(){
        return countPickedOrders + "," + countDeliveredOrders;
    }
}
