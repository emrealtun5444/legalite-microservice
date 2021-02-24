package tr.com.innova.legalite.adminservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class SistemParametreDto implements Serializable {
    private Long id;
    private String kodu;
    private String name;
    private String value;
}
