package bo.edu.ucb.ingsoft.bot.bl;
import bo.edu.ucb.ingsoft.bot.dao.ProductDao;
import bo.edu.ucb.ingsoft.bot.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductBl {

    private ProductDao productDao;
    List<ProductDto> result = new ArrayList<>();

    @Autowired
    public ProductBl(ProductDao productDao){
        this.productDao = productDao;
    }
    public List<ProductDto> listAllProduct(){
        return productDao.findAllProducts();
    }

    public List<ProductDto> listproduct() {
        return result;
    }

    public List<ProductDtoApi> listProductsByName(String name, Integer pageSize, Integer pageNumber){
        if(name==null){
            name=" ";
        }
        if(pageSize==null){
            pageSize=5;
        }
        if(pageNumber==null){
            pageNumber=0;
        }

        List <ProductDtoApi> resultList = new ArrayList<>();
        List <ProductDto> productDtoList = productDao.listProductsByName(name+"%", pageSize, pageNumber);
        for(ProductDto productDto : productDtoList){
            ProductDtoApi productDtoApi = new ProductDtoApi(productDto.getId(), productDto.getName(),
                    productDto.getPrice(), productDto.getStock());
            resultList.add(productDtoApi);

        }
        return resultList;
    }
}
