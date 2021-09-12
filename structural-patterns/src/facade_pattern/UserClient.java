package facade_pattern;

public class UserClient {
    public static void main(String[] args){
        ShopFacade lets_do_shopping = new ShopFacade();
        lets_do_shopping.selectProduct();
        lets_do_shopping.orderProduct();
    }
}
