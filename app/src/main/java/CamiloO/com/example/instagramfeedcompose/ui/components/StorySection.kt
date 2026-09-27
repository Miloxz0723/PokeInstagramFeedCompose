package CamiloO.com.example.instagramfeedcompose.ui.components

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import CamiloO.com.example.instagramfeedcompose.model.Story

@Composable
fun StorySection(stories: List<Story>) {
    LazyRow {
        items(stories) { story ->
            StoryItem(story = story)
        }
    }
}