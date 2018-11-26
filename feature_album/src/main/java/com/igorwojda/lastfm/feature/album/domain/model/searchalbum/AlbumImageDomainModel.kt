package com.igorwojda.lastfm.feature.album.domain.model.searchalbum

import com.igorwojda.lastfm.feature.album.domain.enum.AlbumDomainImageSize

data class AlbumImageDomainModel(
    val url: String,
    val size: AlbumDomainImageSize
)
