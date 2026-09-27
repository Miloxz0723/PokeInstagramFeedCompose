package CamiloO.com.example.instagramfeedcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import CamiloO.com.example.instagramfeedcompose.data.DataSource
import CamiloO.com.example.instagramfeedcompose.ui.components.PostCard
import CamiloO.com.example.instagramfeedcompose.ui.components.StorySection
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    InstagramFeedScreen()
                }
            }
        }
    }
}

@Composable
fun InstagramFeedScreen() {
    val dataSource = DataSource()
    val stories = dataSource.loadStories()
    val posts = dataSource.loadPosts()

    LazyColumn {
        item {
            StorySection(stories = stories)
            HorizontalDivider(color = Color.LightGray, thickness = 0.5.dp)
        }

        items(posts) { post ->
            PostCard(post = post)
        }
        item {
            Text(
                text = "Has llegado al final 🎉",
                color = Color.Gray,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp),
                textAlign = TextAlign.Center
            )
        }
    }

}