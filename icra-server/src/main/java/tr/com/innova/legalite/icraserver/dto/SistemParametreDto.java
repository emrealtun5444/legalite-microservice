package tr.com.innova.legalite.icraserver.dto;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SistemParametreDto implements Serializable {
	private Long id;
	private String kodu;
	private String name;
	private String value;
}
