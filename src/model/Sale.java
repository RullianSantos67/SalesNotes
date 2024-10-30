package model;

import model.Product;
import model.SaleItem;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<SaleItem> items = new ArrayList<>();

    public void addProduct(String description, double price, int quantity) {
        Product product = new Product();
        product.setDescription(description);
        product.setPrice(price);

        SaleItem saleItem = new SaleItem();
        saleItem.setProduct(product);
        saleItem.setQuantity(quantity);

        items.add(saleItem);  
    }

    public double getTotal() {
        return items.stream().mapToDouble(SaleItem::getSubtotal).sum();
    }

    public List<SaleItem> getItems() {
        return items;
    }

    public void displaySaleItems() {
        if (items.isEmpty()) {
            System.out.println("Nenhum item na venda.");
        } else {
            for (SaleItem item : items) {
                String itemStr = String.format("%s - %d - %.2f", item.getProduct().getDescription(), item.getQuantity(), item.getSubtotal());
                System.out.println(itemStr);
            }
            System.out.println(String.format("Total: %.2f", getTotal()));
        }
    }
}
