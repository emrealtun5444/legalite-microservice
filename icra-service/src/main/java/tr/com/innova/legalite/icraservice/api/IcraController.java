package tr.com.innova.legalite.icraservice.api;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.com.innova.legalite.icraservice.dto.IcraDto;
import tr.com.innova.legalite.icraservice.service.IcraService;

@RequestMapping("/icra-service")
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
