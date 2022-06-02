package bo.edu.ucb.ingsoft.bot.api;

import bo.edu.ucb.ingsoft.bot.bl.ReserveBl;
import bo.edu.ucb.ingsoft.bot.dto.ReserveDto;
import bo.edu.ucb.ingsoft.bot.dto.ReserveDtoApi;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reserves")
public class ReservesApi {
    private ReserveBl reserveBl;

    public ReservesApi(ReserveBl reserveBl) {
        this.reserveBl = reserveBl;
    }
    @PostMapping(path = "/")
    String newReserve(@RequestBody ReserveDtoApi reserveDtoApi){
        return reserveBl.saveReserve(reserveDtoApi);
    }

}
