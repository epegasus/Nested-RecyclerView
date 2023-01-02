# Nested-RecyclerView
This is a nested recyclerView, parent is for categories while child is for it's movies

![Nested RecyclerView](https://user-images.githubusercontent.com/100923337/210268053-3f8d25cd-f28e-4c7e-87b3-7fe6e4fde5e8.png)

### Data Sets are as follow:

#### Categories

    val categoriesList = listOf(
        Category(0, "Featured Movies"),
        Category(1, "Latest Movies"),
        Category(2, "Action"),
        Category(3, "Comedy"),
        Category(4, "Romantic")
    )

#### Movies

    private val moviesList = listOf(
        Movie(id = 0, imageId = R.drawable.img_placeholder, title = "Avatar", categoryId = 0),
        Movie(id = 1, imageId = R.drawable.img_placeholder, title = "Glass Onion", categoryId = 0),
        Movie(id = 2, imageId = R.drawable.img_placeholder, title = "Violent", categoryId = 0),
        Movie(id = 3, imageId = R.drawable.img_placeholder, title = "Black Adam", categoryId = 0),
        Movie(id = 4, imageId = R.drawable.img_placeholder, title = "Matilda", categoryId = 0),

        Movie(id = 5, imageId = R.drawable.img_placeholder, title = "Wakanda Forever", categoryId = 1),
        Movie(id = 6, imageId = R.drawable.img_placeholder, title = "Strange World", categoryId = 1),
        Movie(id = 7, imageId = R.drawable.img_placeholder, title = "Emancipation", categoryId = 1),
        Movie(id = 8, imageId = R.drawable.img_placeholder, title = "Bashes", categoryId = 1),
        Movie(id = 9, imageId = R.drawable.img_placeholder, title = "Smile", categoryId = 1),

        Movie(id = 10, imageId = R.drawable.img_placeholder, title = "Brave Heart", categoryId = 2),
        Movie(id = 11, imageId = R.drawable.img_placeholder, title = "Avengers", categoryId = 2),
        Movie(id = 12, imageId = R.drawable.img_placeholder, title = "Old Boy", categoryId = 2),
        Movie(id = 13, imageId = R.drawable.img_placeholder, title = "Spider Man", categoryId = 2),
        Movie(id = 14, imageId = R.drawable.img_placeholder, title = "Matrix", categoryId = 2),

        Movie(id = 15, imageId = R.drawable.img_placeholder, title = "CoCo", categoryId = 3),
        Movie(id = 16, imageId = R.drawable.img_placeholder, title = "Jungle Cruise", categoryId = 3),
        Movie(id = 17, imageId = R.drawable.img_placeholder, title = "Boss Baby", categoryId = 3),
        Movie(id = 18, imageId = R.drawable.img_placeholder, title = "City Lights", categoryId = 3),
        Movie(id = 19, imageId = R.drawable.img_placeholder, title = "Parasite", categoryId = 3),

        Movie(id = 20, imageId = R.drawable.img_placeholder, title = "Queen Bees", categoryId = 4),
        Movie(id = 21, imageId = R.drawable.img_placeholder, title = "Before Sunrise", categoryId = 4),
        Movie(id = 22, imageId = R.drawable.img_placeholder, title = "Rebecca", categoryId = 4),
        Movie(id = 23, imageId = R.drawable.img_placeholder, title = "Your Name", categoryId = 4),
        Movie(id = 24, imageId = R.drawable.img_placeholder, title = "Finding You", categoryId = 4),
    )
