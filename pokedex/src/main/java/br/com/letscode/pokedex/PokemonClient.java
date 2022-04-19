package br.com.letscode.pokedex;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "pokemons",
        url= "https://pokeapi.co/api/v2/pokemon")
public interface PokemonClient {

    @GetMapping()
    PokemonResponse buscar(@RequestParam Integer limit, @RequestParam Integer offset);

    @GetMapping("/{nome}")
    PokemonDetailResponse buscar(@PathVariable String nome);


}
