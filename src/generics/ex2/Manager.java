package immutable.generics.ex2;

public class Manager <U,P> {
    U user;
    P product;

    public Manager(U user, P product) {
        this.user = user;
        this.product = product;
    }

    public void getUser() {
        System.out.println("User : " + this.user);
    }
    public void getProduct(){
        System.out.println("Product : " + this.product);
    }

    public void displayInfo() {
        getUser();
        getProduct();
    }
}
