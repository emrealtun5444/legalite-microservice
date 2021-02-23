package tr.com.innova.legalite.icraserver.api;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.com.innova.legalite.icraserver.dto.IcraDto;
import tr.com.innova.legalite.icraserver.service.IcraService;

@RequestMapping("/icra-server")
@RestController
@RequiredArgsConstructor
public class IcraController {

    @Autowired
    private IcraService icraService;

    @PostMapping("/icra-olustur/dosyaNo/{dosyaNo}")
    public IcraDto icraAc(@PathVariable String dosyaNo) {
        return icraService.dosyaOlustur(dosyaNo);
    }


}
