package bo.edu.ucb.ingsoft.bot.dto;

public class ProductreDtoApi {
    private int id_product;
    private int stock;

    public ProductreDtoApi(int id_product, int stock) {
        this.id_product = id_product;
        this.stock = stock;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
