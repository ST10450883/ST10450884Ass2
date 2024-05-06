# ST10450884Ass2
 IMAD ICE 5
⦁	Purpose
The purpose of my app is to create a virtual pet so that the user can experience how it is like owning and caring for a pet. The user will be able to feed, play with and nurture their virtual pet to keep them happy and healthy. The app's focus is to have learn how to take care of your pet while having fun. 
⦁	Design considerations 
The name of the app will be Danger
 
 
 
There are three types of buttons which are the feed, clean and play button. Each button has a specific action it's going to do. If you were to click the play button the picture will change to Danger playing and his status of happiness will increase.
 
If you were to click the feed button the picture will change to Danger eating meat and his status of hunger will increase
 
If you were to click the clean button the picture will change to Danger after being cleaned and his status of clean will increase
 
The design of the app is very simple and doesn't contain a colorful  background color so the user can focus on the main function of the app which is the buttons and status of the virtual pet Danger. The pictures of Danger grab the attention of the user because with each button you click it does a different action according to the type of button you chose.

The app runs smoothly and is user friendly, it's easy to follow because of how the buttons and text view are constructed. The first button, the feed button is connected to the hunger text view and the second button, the clean button is connected to the clean text view. The same applies with the last button, it is connected to the last text view.

The app consists of necessary elements and example of some of those elements is the feed, clean and play button. The buttons are essential because they determine the result of the text views. The font of the app is clearly visible and text size, also the spacing of the button is well spaced and isn't crowded between each other.

The reason I chose the image is because of the pet displays all the actions that is required from the app 

3.Github and Github actions

Github url:ST10450883/ST10450884Ass2 (github.com)

Manual Testing:

import org.junit.Assert.*
import org.junit.Test
 
class MyUnitTest {
 
@Test
fun testWhenStatement() {
val result = when (25) {
96 -> "Queen Elizabeth II was famous because of the reigning British monarch; she has been the longest-reigning monarch since " +
"ascended to the throne in 1952 surpassing Queen Victoria's record in 2015."
 
78 -> "Mahatma Gandi was famous for his nonviolent resistance. He is renowned influential leader known for his philosophy of nonviolent " +
"resistance played a pivotal role in India's independence movement against British rule."
 
32 -> "Alexander the Great was famous for his military tactics and strategy. He was a brilliant military strategist, he utilized innovative tactics" +
" and combined arms warfare including infantry, cavalry, and siege engines to defeat numerically superior forces."
 
else -> "Nobody famous known to me died at this age"
}
 
assertEquals("Nobody famous known to me died at this age", result)
}
}


Automated Testing:
name: Run Tests
on:
push:
jobs:
test:
  runs-on:ubuntu-latest
  steps:
   - name: Set up JDR
     uses: actions/setup-java@v2
     with:
      distribution: 'adopt'
      java-version: '11'
  - name: Check out code
    uses:actions/checkout@v2
  - name: Build and test
    run: ./gradlew test
4) Link to Youtube video:
https://youtu.be/pGJ18gZzIMY?si=z7fq75lQqhwLWCal
5) Referencing list:
Gerber, A. and Craig, C., 2015. Android Studio. Wygodne i efektywne tworzenie aplikacji.



