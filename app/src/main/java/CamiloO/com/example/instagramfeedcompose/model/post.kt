package CamiloO.com.example.instagramfeedcompose.model

data class Post(
    val id: Int,
    val username: String,
    val userAvatarUrl: String,
    val postImageUrl: String,
    val likesCount: Int,
    val caption: String,
    val timeAgo: String
)