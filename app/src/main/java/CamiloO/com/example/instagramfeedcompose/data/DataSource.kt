package CamiloO.com.example.instagramfeedcompose.data

import CamiloO.com.example.instagramfeedcompose.model.Post
import CamiloO.com.example.instagramfeedcompose.model.Story

class DataSource {
    fun loadStories(): List<Story> {
        return listOf(
            Story(1, "Mudkip", "https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/full/258.png"),
            Story(2, "Eevee", "https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/full/133.png"),
            Story(3, "Umbreon", "https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/full/197.png"),
            Story(4, "Espeon", "https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/full/196.png"),
            Story(5, "Rotom", "https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/full/479.png"),
            Story(6, "Ferropúas", "https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/full/995.png")
        )
    }

    fun loadPosts(): List<Post> {
        return listOf(
            Post(
                id = 1,
                username = "Coleccionista Pokemon",
                userAvatarUrl = "https://assets.pokemon.com/static2/_ui/img/global/psyduck.png",
                postImageUrl = "https://assets.pokemon.com/static-assets/content-assets/cms2-es-xl/img/cards/web/30TH/30TH_LA_66.png",
                likesCount = 1000,
                caption = "La increible carta que me salio",
                timeAgo = "Hace 1 horas"
            ),
            Post(
                id = 2,
                username = "VIAJES POKEMON",
                userAvatarUrl = "https://imagenes.hobbyconsolas.com/files/image_1280_720/uploads/imagenes/2026/08/24/6a8c91c18e8b01-47264311.jpeg",
                postImageUrl = "https://media.revistagq.com/photos/620276fc4d5ecebfc14b55eb/16:9/w_1600,c_limit/Leyendas-Poke%CC%81mon-Arceus.jpg",
                likesCount = 500,
                caption = "Pokemon arceus un viaje lleno de descubrimiento y miles de aventuras",
                timeAgo = "Hace 2 minutos"
            ),
            Post(
                id = 3,
                username = "BATALLAS_POKEMON",
                userAvatarUrl = "https://www.reddit.com/media?url=https%3A%2F%2Fpreview.redd.it%2Fshiny-mudkip-after-1032-eggs-so-glad-to-get-my-favourite-v0-l2i0vgo74cg71.jpg%3Fwidth%3D1080%26crop%3Dsmart%26auto%3Dwebp%26s%3D7fa3eee6c9b694fe958c888974189ab1a73c5e75",
                postImageUrl = "https://images.wikidexcdn.net/mwuploads/wikidex/9/9a/latest/20081019175052/Combate_doble_contra_Slugma_y_Graveler_DP.png",
                likesCount = 1280,
                caption = "Gran combate quien saldra vencedor ",
                timeAgo = "Hace 15 minutos"
            ),
            Post(
                id = 4,
                username = "MIKE",
                userAvatarUrl = "https://fotografias-neox.atresmedia.com/clipping/cmsimages01/2016/04/07/77E30C57-52CD-43A6-BAAC-72C0AB20327C/97.jpg?crop=610,343,x0,y0&width=1600&height=900&optimize=high&format=webply",
                postImageUrl = "https://gaming-cdn.com/images/news/articles/15898/cover/1000x563/la-expansion-megadimension-de-leyendas-pokemon-z-a-saldra-el-10-de-diciembre-cover690cb0b4e27ec.jpg",
                likesCount = 890,
                caption = "En busca de un nuevo universo",
                timeAgo = "Hace 1 hora"
        )
        )
    }
}