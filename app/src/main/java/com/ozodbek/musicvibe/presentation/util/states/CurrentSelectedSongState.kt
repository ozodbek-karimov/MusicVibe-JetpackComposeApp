package com.ozodbek.musicvibe.presentation.util.states

import com.ozodbek.musicvibe.domain.models.MusicResourceModel


data class CurrentSelectedSongState(
    val showBottomBar: Boolean = false,
    val isPlaying: Boolean = false,
    val current: MusicResourceModel? = null,
    val isRepeating: Boolean = false,
)

sealed interface SongEvents {
    object ToggleIsPlaying : SongEvents

    object ToggleIsRepeating : SongEvents

    object ForwardCurrentMedia : SongEvents

    object RewindCurrentMedia : SongEvents

    data class OnTrackPositionChange(val pos: Float) : SongEvents
}