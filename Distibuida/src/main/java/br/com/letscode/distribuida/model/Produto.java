package br.com.letscode.distribuida.model;

import br.com.letscode.distribuida.annotation.NaoImpar;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Produto {
    private String nome;
    private String descricao;
    private Integer valor;
    @NaoImpar
    private Integer qtd;
}
