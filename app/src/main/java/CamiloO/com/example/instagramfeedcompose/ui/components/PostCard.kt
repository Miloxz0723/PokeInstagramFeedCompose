package CamiloO.com.example.instagramfeedcompose.ui.components



import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import CamiloO.com.example.instagramfeedcompose.model.Post

@Composable
fun PostCard(post: Post) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            AsyncImage(
                model = post.userAvatarUrl,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = post.username, fontWeight = FontWeight.Bold,
                    color = Color.White
            )
        }

        AsyncImage(
            model = post.postImageUrl,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp)
        )

        Column(modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)) {
            Text(
                text = "${post.likesCount} Me gusta",
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                color = Color.White

            )
            Spacer(modifier = Modifier.height(2.dp))
            Row {
                Text(text = "${post.username} ", fontWeight = FontWeight.Bold, fontSize = 14.sp)
                Text(text = post.caption, fontSize = 14.sp,
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(text = post.timeAgo, color = Color.Gray, fontSize = 11.sp)
        }
        Spacer(modifier = Modifier.height(12.dp))
    }
}