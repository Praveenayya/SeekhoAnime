# Seekho Anime
A brief description of the Android app that uses the Jikan API to fetch and display a list of anime series, allowing
users to view details and trailers.

## Assumptions made
- The App assumes stable internet connection for fetching the data
- Trailers are opened using Youtube url provided in the Jikan Api if no trailer url then we are displaying the poster image of anime

## Features Implemeted
- Fetching and displaying the list of anime in a recyclerview using the Jikan API in HomeScreen Activity
-  Checking the internet connection before fetching the data from api
-  Fetching the Anime details for the selected anime using anime_id in AnimeDetailsScreen activity
-  Allowing users to watch the trailers if available in jikan api response otherwise showing only poster of anime
-  Displaying genre,ratings,poster and no of episodes

## Limitations
- The app does not support offline of anime data
-  If the internet connection is not available, the app displays an alert with the message "No Internet Connection." but, a retry option to fetch the data again is not implemented.
