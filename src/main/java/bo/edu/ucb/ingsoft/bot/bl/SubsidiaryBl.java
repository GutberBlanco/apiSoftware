package bo.edu.ucb.ingsoft.bot.bl;

import bo.edu.ucb.ingsoft.bot.dao.SubsidiaryDao;
import bo.edu.ucb.ingsoft.bot.dto.SubsidiaryDto;
import bo.edu.ucb.ingsoft.bot.dto.SubsidiaryDtoApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubsidiaryBl {
    private SubsidiaryDao subsidiaryDao;

    @Autowired
    public SubsidiaryBl(SubsidiaryDao subsidiaryDao){
        this.subsidiaryDao = subsidiaryDao;
    }

    public List<SubsidiaryDtoApi> listSubsidiaries(Integer pageSize, Integer pageNumber){
        if(pageSize==null){
            pageSize=5;
        }
        if(pageNumber==null){
            pageNumber=0;
        }
        List <SubsidiaryDtoApi> resultList = new ArrayList<>();
        List <SubsidiaryDto> subsidiaryDtoList = subsidiaryDao.listSubdiaries(pageSize, pageNumber*pageSize);
        for(SubsidiaryDto subsidiaryDto : subsidiaryDtoList){
            SubsidiaryDtoApi subsidiaryDtoApi = new SubsidiaryDtoApi(subsidiaryDto.getId(), subsidiaryDto.getName(),
                    subsidiaryDto.getLocation(), subsidiaryDto.getTimetable(), subsidiaryDto.getNumber());
            resultList.add(subsidiaryDtoApi);

        }
        return resultList;
    }
}
