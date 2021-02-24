package tr.com.innova.legalite.icraservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tr.com.innova.legalite.servicecommon.dto.SistemParametreDto;

@FeignClient(name="admin-service")
public interface AdminServiceProxy {
	
	@GetMapping("/admin-service/sistem-parametre/kod/{kod}")
	public SistemParametreDto getSistemParametre(
			@PathVariable String kod);

}
