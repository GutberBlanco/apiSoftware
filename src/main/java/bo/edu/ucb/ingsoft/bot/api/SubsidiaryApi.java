package bo.edu.ucb.ingsoft.bot.api;


import bo.edu.ucb.ingsoft.bot.bl.SubsidiaryBl;
import bo.edu.ucb.ingsoft.bot.dto.SubsidiaryDtoApi;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/v1/subsidiary")
public class SubsidiaryApi {

    private SubsidiaryBl subsidiaryBl;

    public SubsidiaryApi(SubsidiaryBl subsidiaryBl){
        this.subsidiaryBl = subsidiaryBl;
    }

    @GetMapping(path = "/", produces = APPLICATION_JSON_VALUE)
    public List<SubsidiaryDtoApi> listSubsidiaries(@RequestParam(value = "pageSize", required = false) Integer pageSize,
                                                  @RequestParam(value = "pageNumber", required = false) Integer pageNumber){
        return subsidiaryBl.listSubsidiaries(pageSize, pageNumber);
    }
}
