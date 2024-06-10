Liam Bowers - ST10446537
# My-weather-app
This app will provide the forecast for the week.
The user is prompted to to the start button.
This will take you to the main screen.
This screen will prompt you to press the weather forecast button which will take you to the detail screen.
This screen will display the forecast the week from Monday to Friday.
There are exit buttons to exit the app whenever the user is finish with the app or need to just exit in general.
https://github.com/VCCT-IMAD5112-2024-G1/My-weather-app.git
 

The app is made to show the next week's weather forecast. Every forecast contains details about the day, the range of temperatures, and the weather.  
It could read something like this, "Monday: 12° and 25°, Sunny." This indicates that Monday will have bright skies and a temperature range of 12 to 25 degrees Celsius. 
The code uses an array to store these forecasts. An array is like a list where you can store multiple pieces of information together. In this case, the array holds all the weather forecasts for the week. 
Next, the code sets up the layout of the detail screen. It includes a text view where the weather forecasts will be displayed, and a button that allows the user to close the app. 
To display the forecasts, the code creates a string variable called "weatherDisplay." It then adds each forecast from the array to this string, separating them with line breaks ("\n"). Once all the forecasts are added, the string is set as the text for the text view, so the user can see the weather predictions. 
Now, let's talk about the button. When the user clicks the button, the app needs to close. The code sets up a click listener for the button, which means it listens for when the button is clicked. When the button is clicked, the app calls the "finish" method on the current activity. 
An activity is like a screen or a page in the app. Calling "finish" on the activity closes it, so the user goes back to the previous screen. Additionally, the code calls "System.exit(0)" to exit the entire app. 
In simpler terms, it's like when you're reading the weather on your phone, and when you're done, you click a button to go back to the home screen. 
In conclusion, the code you provided is for a weather app's detail screen. It displays weather forecasts for the upcoming week and allows the user to close the app when they're done. It's a simple but essential part of the app's functionality, making it easier for users to check the weather on the go. 
