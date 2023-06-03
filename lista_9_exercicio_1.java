import java.util.HashMap;
import java.util.Map;

class Pokemon {
    private String codigoIdentificador;
    private String nome;
    private String tipo;

    public Pokemon(String codigoIdentificador, String nome, String tipo) {
        this.codigoIdentificador = codigoIdentificador;
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

class Pokedex {
    private Map<String, Pokemon> pokemons = new HashMap<>();

    public void adicionarPokemon(Pokemon pokemon) {
        pokemons.put(pokemon.getCodigoIdentificador(), pokemon);
    }

    public Map<String, Pokemon> getPokemons() {
        return pokemons;
    }
}

class Main {
    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();

        Pokemon pokemon1 = new Pokemon("001", "Bulbasaur", "Planta/Veneno");
        Pokemon pokemon2 = new Pokemon("002", "Charmander", "Fogo");
        Pokemon pokemon3 = new Pokemon("003", "Squirtle", "Água");

        pokedex.adicionarPokemon(pokemon1);
        pokedex.adicionarPokemon(pokemon2);
        pokedex.adicionarPokemon(pokemon3);

        Map<String, Pokemon> pokemons = pokedex.getPokemons();
        for (Pokemon pokemon : pokemons.values()) {
            System.out.println("Código: " + pokemon.getCodigoIdentificador());
            System.out.println("Nome: " + pokemon.getNome());
            System.out.println("Tipo: " + pokemon.getTipo());
            System.out.println();
        }
    }
}