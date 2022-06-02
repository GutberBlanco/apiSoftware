package bo.edu.ucb.ingsoft.bot.dto;

import java.util.Date;

public class ReserveDtoApi {
    private int idcliente;
    private int idsubsidiary;
    private ProductreDtoApi productreDtoApi;
    private String date;

    public ReserveDtoApi(int idcliente, int idsubsidiary, ProductreDtoApi productreDtoApi, String date) {
        this.idcliente = idcliente;
        this.idsubsidiary = idsubsidiary;
        this.productreDtoApi = productreDtoApi;
        this.date = date;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdsubsidiary() {
        return idsubsidiary;
    }

    public void setIdsubsidiary(int idsubsidiary) {
        this.idsubsidiary = idsubsidiary;
    }

    public ProductreDtoApi getProductreDtoApi() {
        return productreDtoApi;
    }

    public void setProductreDtoApi(ProductreDtoApi productreDtoApi) {
        this.productreDtoApi = productreDtoApi;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
