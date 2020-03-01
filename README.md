# HeroWorkshop
![GitHub](https://img.shields.io/github/license/AvaruusStudios/HeroWorkshop.svg?style=plastic)

Hero Workshop is a Pen+Paper Role-Playing Game Hero Generator which can then be used to the play via a chat application.

## Table Of Contents
* [Development](#development)
* [Description](#description)
* [Installation](#installation)
* [Usage](#usage)
* [Support](#support)
* [Roadmap and Changelog](#roadmap-and-changelog)
  * [Roadmap](#roadmap)
  * [Changelog](#changelog)
* [Contributing](#contributing)
* [Authors and Acknowledgements](#authors-and-acknowledgement)
  * [Authors](#authors)
  * [Acknowledgements](#acknowledgements)
* [License](#license)
* [Project Status](#project-status)

## Development
Prerequisites:
  * JDK13 Installed: https://jdk.java.net/13/
  * Maven Installed: https://maven.apache.org/install.html
  * OpenJFX Installed: https://openjfx.io/index.html
  
Build:
```
~/HeroWorkshop> mvn clean compile
```

Run:
```
~/HeroWorkshop> mvn spring-boot:run -Dspring-boot.run.arguments="--module-path \path\to\javafx-sdk\lib","--add-modules javafx.controls,javafx.fxml"
```

Package:
```
~/HeroWorkshop> mvn package
```
This will output a `hero-workshop-${version}.jar` in the `target` folder.  This is a self-running JAR file, so it should be able to be double-clicked to run, though on Windows you may need to run via a command line: `java -jar \path\to\jar\file`.  However, it currently does require the Java runtime to be installed.  Native packaging is still TBD.

## Description
At its core, The Star Wars Role-Playing Game (RPG) is about telling a story. The Game Master along with the players tell the story together, guiding the heroes through quests for credits and fame, battling with deadly foes, daring rescues, courtly intrigue, and much more. You explore the universe and sprawling galaxies of the Star Wars saga through the personification of the players heroes.

The Star Wars RPG is played in the D20 System. This means that to resolve an action in the D20 System, a player rolls a 20-sided die and adds modifiers based on the natural aptitude of the character (defined by six attributes: Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma) and how skilled the character is in various fields (such as in combat), as well as other, situational modifiers. If the result is greater than or equal to a target number (called a Difficulty Class or DC) then the action succeeds. This is called the Core Mechanic. This system is consistently used for all action resolution in the d20 System.  

The Hero Workshop is designed to bridge the gap between the old fashioned way of writing everything down with a pen+paper and allow players to electronically create a Role-Playing Game (RPG) Hero for use with the Star Wars Role-Playing Game (RPG) and use that Hero to play with others via the application Game Chat module.

The application will consist of two modules: the Hero Workshop and The Game Master Module
* By following the user guide and going the each tab, **The Hero Generator Module** allows a player to create a character in the Star Wars Universe for play in in the D20 System. The character can also be saved and open in The Game Master Module to allow play with other players.
* At its core, **The Game Master Module** is a chat room hosted by The Game Master (GM) Module (Storyteller of the game). Players then connect to the chat session of the GM and load their character to use during play.

## Installation
Installation can be achieved by extracting the archive (.zip) to a directory of your choosing and running the main application in the bin folder.

## Usage
For application usage, please refer to our detailed USERGUIDE.md 

## Support
To submit and issue with the application:

## Roadmap and Changelog

### Roadmap (Planned Implementations)

### Changelog

## Contributing
For contribution, please refer to our detailed guide CONTRIBUTING.md

## Authors and Acknowledgement

### Authors
Troy Pilewski ([@troypilewski](https://github.com/troypilewski))  
Justin Nichols ([@justinnichols](https://github.com/justinnichols))  
15Nova22 ([@15Nova22](https://github.com/15Nova22))  
BattlestarSC ([@BattlestarSC](https://github.com/BattlestarSC))
<!-- Sumant Khapre ([@sumant2000](https://github.com/sumant2000))  -->
<!-- Mindaugas Vasiliauskas ([@mivasiliauskas](https://github.com/mivasiliauskas))  -->
<!-- Saurav Bhuju ([@sbhuju61](https://github.com/sbhuju61))  -->


<!-- <a href="https://github.com/AvaruusStudios/HeroWorkshop/graphs/contributors">
  <img src="https://contributors-img.firebaseapp.com/image?repo=AvaruusStudios/HeroWorkshop" />
</a> -->

### Acknowledgements

## License
The project is licensed under the GNU General Public License v3.0. The full license can be found in our [HERE](LICENSE)

## Project Status
The project is currently in the intial phases of design and development.
