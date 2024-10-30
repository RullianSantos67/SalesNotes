import model.Sale;

public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();


        sale.addProduct("Arroz Thaitiana", 20, 2);
        sale.addProduct("Feijão Preto", 10, 1);
        sale.addProduct("Macarrão Santa Amália", 15, 3);

        sale.displaySaleItems();
    }
}
