package com.example.pokemon.data.network.mappers

import com.example.pokemon.data.network.models.PokemonListResponseDto
import com.example.pokemon.data.network.models.PokemonListResultDto
import com.example.pokemon.data.network.models.PokemonResponseDto
import com.example.pokemon.data.network.models.PokemonSpeciesResponseDto
import com.example.pokemon.domain.entity.Pokemon
import com.example.pokemon.domain.entity.PokemonList
import com.example.pokemon.domain.entity.PokemonListResult
import com.example.pokemon.domain.entity.PokemonSpecies

fun PokemonResponseDto.toEntity(): Pokemon {
    return Pokemon(
        id,
        name,
        speciesDto.name,
        speciesDto.url,
        spritesDto.frontDefault ?: "",
        spritesDto.backDefault ?: ""
    )
}

fun PokemonListResponseDto.toEntity(): PokemonList {
    return PokemonList(count, results.map { it.toEntity() })
}

fun PokemonSpeciesResponseDto.toEntity(): PokemonSpecies {
    return PokemonSpecies(evolutionChainDto.url)
}

private fun PokemonListResultDto.toEntity(): PokemonListResult {
    return PokemonListResult(name, url)
}




