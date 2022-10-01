package com.example.flixter

/**
 * This interface is used by the [LatestMoviesRecyclerViewAdapter] to ensure
 * it has an appropriate Listener.
 *
 * In this app, it's implemented by [LatestMovieFragment]
 */
interface OnListFragmentInteractionListener {
    fun onItemClick(item: LatestMovie)
}