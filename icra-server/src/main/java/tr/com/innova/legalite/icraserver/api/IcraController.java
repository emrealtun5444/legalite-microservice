package tr.com.innova.legalite.icraserver.api;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.innova.legalite.icraserver.dto.IcraDto;
import tr.com.innova.legalite.icraserver.dto.SistemParametreDto;
import tr.com.innova.legalite.icraserver.proxy.AdminServiceProxy;

@RequestMapping("/icra-server")
@RestController
@RequiredArgsConstructor
public class IcraController {

    @Autowired
    private AdminServiceProxy adminServiceProxy;

    @GetMapping("/icra-acilabilir-mi/dosyaNo/{dosyaNo}")
    public IcraDto icraAc(@PathVariable String dosyaNo) {
        SistemParametreDto sistemParametre = adminServiceProxy.getSistemParametre("ICRA_ACILABILIR_MI");
        return IcraDto.builder().id(1L).icraDairesi(sistemParametre.getValue()).dosyaNo(dosyaNo).build();
    }


}
