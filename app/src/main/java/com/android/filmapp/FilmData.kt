package com.android.filmapp

object FilmData {
    private val data = arrayOf(
        arrayOf(
            "Avenger: End Game",
            "Adrift in space with no food or water, Tony Stark sends a message to Pepper Potts as his oxygen supply starts to dwindle. Meanwhile, the remaining Avengers -- Thor, Black Widow, Captain America and Bruce Banner -- must figure out a way to bring back their vanquished allies for an epic showdown with Thanos -- the evil demigod who decimated the planet and the universe.",
            "https://upload.wikimedia.org/wikipedia/en/0/0d/Avengers_Endgame_poster.jpg"
        ),
        arrayOf(
            "Titanic",
            "James Cameron's \"Titanic\" is an epic, action-packed romance set against the ill-fated maiden voyage of the R.M.S. Titanic; the pride and joy of the White Star Line and, at the time, the largest moving object ever built. She was the most luxurious liner of her era -- the \"ship of dreams\" -- which ultimately carried over 1,500 people to their death in the ice cold waters of the North Atlantic in the early hours of April 15, 1912.",
            "https://upload.wikimedia.org/wikipedia/en/1/18/Titanic_%281997_film%29_poster.png"
        ),
        arrayOf(
            "Interstellar",
            "In Earth's future, a global crop blight and second Dust Bowl are slowly rendering the planet uninhabitable. Professor Brand (Michael Caine), a brilliant NASA physicist, is working on plans to save mankind by transporting Earth's population to a new home via a wormhole. But first, Brand must send former NASA pilot Cooper (Matthew McConaughey) and a team of researchers through the wormhole and across the galaxy to find out which of three planets could be mankind's new home.",
            "https://upload.wikimedia.org/wikipedia/en/b/bc/Interstellar_film_poster.jpg"
        ),
        arrayOf(
            "Memento",
            "Leonard (Guy Pearce) is tracking down the man who raped and murdered his wife. The difficulty, however, of locating his wife's killer is compounded by the fact that he suffers from a rare, untreatable form of memory loss. Although he can recall details of life before his accident, Leonard cannot remember what happened fifteen minutes ago, where he's going, or why.",
            "https://upload.wikimedia.org/wikipedia/en/c/c7/Memento_poster.jpg"
            ),
        arrayOf(
            "Tenet",
            "A secret agent is given a single word as his weapon and sent to prevent the onset of World War III. He must travel through time and bend the laws of nature in order to be successful in his mission.",
            "https://upload.wikimedia.org/wikipedia/en/1/14/Tenet_movie_poster.jpg"
            ),
        arrayOf(
            "Spiderman",
            "With Spider-Man's identity now revealed, our friendly neighborhood web-slinger is unmasked and no longer able to separate his normal life as Peter Parker from the high stakes of being a superhero. When Peter asks for help from Doctor Strange, the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
            "https://upload.wikimedia.org/wikipedia/en/0/00/Spider-Man_No_Way_Home_poster.jpg"
            ),
        arrayOf(
            "Superman",
            "Just before the destruction of the planet Krypton, scientist Jor-El (Marlon Brando) sends his infant son Kal-El on a spaceship to Earth. Raised by kindly farmers Jonathan (Glenn Ford) and Martha Kent (Phyllis Thaxter), young Clark (Christopher Reeve) discovers the source of his superhuman powers and moves to Metropolis to fight evil. As Superman, he battles the villainous Lex Luthor (Gene Hackman), while, as novice reporter Clark Kent, he attempts to woo co-worker Lois Lane (Margot Kidder).",
            "https://upload.wikimedia.org/wikipedia/en/b/b3/Superman_%26_Lois_%28TV_series%29.png",
            ),
        arrayOf(
            "Thor: Love And Thunder",
            "Thor embarks on a journey unlike anything he's ever faced -- a quest for inner peace. However, his retirement gets interrupted by Gorr the God Butcher, a galactic killer who seeks the extinction of the gods. To combat the threat, Thor enlists the help of King Valkyrie, Korg and ex-girlfriend Jane Foster, who -- to his surprise -- inexplicably wields his magical hammer. Together, they set out on a harrowing cosmic adventure to uncover the mystery of the God Butcher's vengeance.",
            "https://upload.wikimedia.org/wikipedia/en/8/88/Thor_Love_and_Thunder_poster.jpeg"
            ),
        arrayOf(
            "Parasite",
            "Greed and class discrimination threaten the newly formed symbiotic relationship between the wealthy Park family and the destitute Kim clan.",
            "https://upload.wikimedia.org/wikipedia/en/5/53/Parasite_%282019_film%29.png"
            ),
        arrayOf(
            "Naruto",
            "Manga Naruto bercerita seputar kehidupan tokoh utamanya, Naruto Uzumaki, seorang ninja yang hiperaktif, periang, dan ambisius yang ingin mewujudkan keinginannya untuk mendapatkan gelar Hokage, pemimpin dan ninja terkuat di desanya.",
            "https://upload.wikimedia.org/wikipedia/en/9/94/NarutoCoverTankobon1.jpg"
            )
    )

    val listData: ArrayList<Film>
        get() {
            val list = arrayListOf<Film>()
            for (aData in data) {
                val hero = Film()
                hero.judul = aData[0]
                hero.sinopsis = aData[1]
                hero.cover = aData[2]

                list.add(hero)
            }
            return list
        }
}