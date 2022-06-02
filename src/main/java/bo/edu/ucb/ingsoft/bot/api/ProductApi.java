package bo.edu.ucb.ingsoft.bot.api;

import bo.edu.ucb.ingsoft.bot.bl.ProductBl;
import bo.edu.ucb.ingsoft.bot.dto.ProductDtoApi;
import bo.edu.ucb.ingsoft.bot.dto.SubsidiaryDtoApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/v1/products")
public class ProductApi {
    private ProductBl productBl;

    public ProductApi(ProductBl productBl) {
        this.productBl = productBl;
    }

    @GetMapping(path = "/", produces = APPLICATION_JSON_VALUE)
    public List<ProductDtoApi> listSubsidiaries(@RequestParam(value = "name", required = false) String name,
                                                @RequestParam(value = "pageSize", required = false) Integer pageSize,
                                                @RequestParam(value = "pageNumber", required = false) Integer pageNumber){
        return productBl.listProductsByName(name, pageSize, pageNumber);
    }
}
