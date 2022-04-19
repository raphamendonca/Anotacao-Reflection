package br.com.letscode.pokedex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/pokemons")
@RestController
public class PokemonController {

    @Autowired
    private PokemonClient client;

    @GetMapping()
    public ResponseEntity<PokemonResponse> buscarPokemons(
            @RequestParam Integer limit, @RequestParam Integer offset
    ){
        return ResponseEntity.ok(client.buscar(limit, offset));
    }

    @GetMapping("/{nome}")
    public ResponseEntity<PokemonDetailResponse> buscarPokemons(
            @PathVariable String nome
    ){

        return ResponseEntity.ok(client.buscar(nome));

    }



}
