package tr.com.innova.legalite.icraserver.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tr.com.innova.legalite.icraserver.dto.IcraDto;
import tr.com.innova.legalite.icraserver.dto.Notification;
import tr.com.innova.legalite.icraserver.dto.SistemParametreDto;
import tr.com.innova.legalite.icraserver.proxy.AdminServiceProxy;

@Service
public class IcraServiceImp implements IcraService {

    @Autowired
    private AdminServiceProxy adminServiceProxy;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    @Transactional
    public IcraDto dosyaOlustur(String dosyaNo) {
        SistemParametreDto sistemParametre = adminServiceProxy.getSistemParametre("DEFAULT_ICRA_DAIRESI");
        IcraDto icraDto = IcraDto.builder().id(1L).icraDairesi(sistemParametre.getValue()).dosyaNo(dosyaNo).build();
        this.hatirlatmaGonder(icraDto);
        return icraDto;
    }

    public void hatirlatmaGonder(final IcraDto icraDto) {
        Notification notificationLoc = new Notification();
        notificationLoc.setDestination("Dosya No: " + icraDto.getDosyaNo());
        notificationLoc.setMessage("Sayın Osman , Dosyanız olusturulmustur");
        this.rabbitTemplate.convertAndSend("notf_exchange_topic",
                "notify.email.xyz",
                notificationLoc);
    }
}
