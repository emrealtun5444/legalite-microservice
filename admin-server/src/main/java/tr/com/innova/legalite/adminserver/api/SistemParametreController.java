package tr.com.innova.legalite.adminserver.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.innova.legalite.adminserver.dto.SistemParametreDto;

@RequestMapping("/admin-server")
@RestController
public class SistemParametreController {

    @GetMapping("/sistem-parametre/kod/{kod}")
    public SistemParametreDto getSistemParametre(@PathVariable String kod) {
        return SistemParametreDto.builder().kodu(kod).id(1L).name("Icra Dairesi").value("ANKARA ICRA DAIRESI").build();
    }


}
