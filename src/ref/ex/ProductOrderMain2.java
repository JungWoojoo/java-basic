package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder dooBoo = createOrder("두부", 2000, 2);
        ProductOrder kimchi = createOrder("김치", 5000, 1);
        ProductOrder cola = createOrder("콜라", 1500, 2);

        ProductOrder[] orders = {dooBoo, kimchi, cola};
        printOrders(orders);
        getTotalAmount(orders);
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명 = " + order.productName + ", 가격 = " + order.price + ", 수량 = " + order.quantity);
        }
    }

    static void getTotalAmount(ProductOrder[] orders){
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        System.out.println("총 결제 금액 = " + total);
    }
}
