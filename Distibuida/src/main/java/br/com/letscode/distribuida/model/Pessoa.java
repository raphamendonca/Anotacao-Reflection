package br.com.letscode.distribuida.model;

import br.com.letscode.distribuida.annotation.Mascara;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

    private String nome;

    @Mascara
    private String documento;

}
