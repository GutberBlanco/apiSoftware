package bo.edu.ucb.ingsoft.bot.dao;

import bo.edu.ucb.ingsoft.bot.dto.ProductDto;
import bo.edu.ucb.ingsoft.bot.dto.SubsidiaryDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductDao {
    @Select("SELECT p.product_id as id, p.name as name, p.price as price, p.stock as stock, p.status as status" +
            " FROM \"Product\" p")
    List<ProductDto> findAllProducts();

    @Select("SELECT * FROM \"Product\" WHERE status='1' and name LIKE #{name}" +
            " LIMIT #{limit} OFFSET #{offset}")
    List<ProductDto> listProductsByName(@Param("name") String name, @Param("limit") Integer limit, @Param("offset") Integer offset);
}
