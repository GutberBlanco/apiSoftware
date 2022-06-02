package bo.edu.ucb.ingsoft.bot.dao;

import bo.edu.ucb.ingsoft.bot.dto.SubsidiaryDto;
import bo.edu.ucb.ingsoft.bot.dto.SubsidiaryDtoApi;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubsidiaryDao {
    /*@Select("SELECT subsidiary_id, name, location, timetable, number FROM \"Subsidiary\" WHERE status='1'" +
            "LIMIT #{limit} OFFSET #{offset}")*/
    @Select("SELECT * FROM \"Subsidiary\" WHERE status='1'" +
            "LIMIT #{limit} OFFSET #{offset}")
    List<SubsidiaryDto> listSubdiaries(@Param("limit") Integer limit, @Param("offset") Integer offset);
}
