package tr.com.innova.legalite.icraserver.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tr.com.innova.legalite.icraserver.dto.SistemParametreDto;

@FeignClient(name="admin-server")
public interface AdminServiceProxy {
	
	@GetMapping("/admin-server/sistem-parametre/kod/{kod}")
	public SistemParametreDto getSistemParametre(
			@PathVariable String kod);

}
