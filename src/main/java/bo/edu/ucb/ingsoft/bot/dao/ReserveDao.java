package bo.edu.ucb.ingsoft.bot.dao;

import bo.edu.ucb.ingsoft.bot.dto.ProductreDtoApi;
import bo.edu.ucb.ingsoft.bot.dto.ReserveDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface ReserveDao {
    @Insert("INSERT INTO  \"Reserve\" (client_id, subsidiary_id, status, date) VAlUES (#{client_id}, " +
            "1, '1', #{date})")
    public void createReserve(@Param("client_id") int clientId, @Param("date") Date date);

    @Insert("INSERT INTO  \"reserveapi\" (id_cliente, subsidiary, products, date) VAlUES (#{id_cliente}, " +
            "#{subsidiary}, #{products}, #{date})")
    public void addReserve(@Param("id_cliente") int id_cliente, @Param("subsidiary") int subsidiary,
                           @Param("products") ProductreDtoApi products, @Param("date") String date);

    @Select("SELECT * FROM \"Reserve\"")
    public List<ReserveDto> listAllReserve();

}
