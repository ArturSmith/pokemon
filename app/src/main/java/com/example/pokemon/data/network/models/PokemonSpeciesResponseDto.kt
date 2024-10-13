package com.example.pokemon.data.network.models

import com.google.gson.annotations.SerializedName

data class PokemonSpeciesResponseDto(
    @SerializedName("evolution_chain")
    val evolutionChainDto: EvolutionChainDto
)

data class EvolutionChainDto(
    val url: String
)
