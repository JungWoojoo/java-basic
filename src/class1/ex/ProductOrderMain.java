package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder dooBoo = new ProductOrder();
        dooBoo.productName = "두부";
        dooBoo.price = 2000;
        dooBoo.quantity = 2;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;

        ProductOrder cola = new ProductOrder();
        cola.productName = "콜라";
        cola.price = 1500;
        cola.quantity = 2;

        ProductOrder[] orders = {dooBoo, kimchi, cola};

        int total = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
            int totalPrice = order.price * order.quantity;
            total += totalPrice;
        }
        System.out.println("총 주문가격 = " + total);
    }
}
