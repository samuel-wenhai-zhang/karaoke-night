[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-7f7980b617ed060a017424585567c406b6ee15c891e84e1186181d67ecf80aa0.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=12572370)
# Karaoke Night

For this project, you are going to create an app for a Karaoke DJ. The DJ needs to be able to have people sign up for a song as well as report out who is up next and which song they want to sing.  People should sing songs in the order in which they sign up.

Here are some additional specifications:

The main menu for the app should have 3 options:
* Add a song
* Get the next song in the queue
* Exit

###  Add song

Add song should bring up option for users to enter the song by number. They should also have an option to list all songs.
  * A song will consist of the title, artist, and length of the song (stored as a string, for example 3:26 for three minutes twenty six seconds). The song will also have an index number that users will use to pick the song. Songs will need to be loaded from an external file (songs.txt).
  * The playlist should store the karaoke singer’s name and the song that they will sing.  

### Get next song

This should retrieve the singer, song title, and artist for the next song in the queue and then remove this song from the queue. If there are no singers in the queue, it should state as such.

Sample Output:
```
Would you like to:
1. Add a song
2. Get the next song in the queue
3. Exit
> 1
Please enter the song number(enter to list songs) 
1 - Thriller by Michael Jackson  5:57
2 - Roar by Katy Perry  3:42
3 - Don't Stop Believin' by Journey  4:11
4 - Thunder by  Imagine Dragons  3:24
5 - Blinding Lights by Weeknd  3:22
6 - Livin On A Prayer by Bon Jovi  4:24
7 - Positions by Ariana Grande  2:52
8 - Ghostbusters by Ray Parker Jr.  4:06
Please enter the song number(enter to list songs) 3
Please enter the name of the performer: Kyle
Would you like to:
1. Add a song
2. Get the next song in the queue
3. Exit
> 1
Please enter the song number(enter to list songs) 6
Please enter the name of the performer: Mimi
Would you like to:
1. Add a song
2. Get the next song in the queue
3. Exit
> 2
Next up: Kyle will be singing Don't Stop Believin' by Journey.
Would you like to:
1. Add a song
2. Get the next song in the queue
3. Exit
> 2
Next up: Mimi will be singing Livin On A Prayer by Bon Jovi.
Would you like to:
1. Add a song
2. Get the next song in the queue
3. Exit
> 2
There are no singers in the queue.
Would you like to:
1. Add a song
2. Get the next song in the queue
3. Exit
> 3
```
