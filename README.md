# HeroWorkshop
![GitHub](https://img.shields.io/github/license/AvaruusStudios/HeroWorkshop.svg?style=plastic)

Hero Workshop is a Pen+Paper Role-Playing Game Hero Generator which can then be used to the play via a chat application.

## Table Of Contents
- [Development](#development)
- [Description](#description)
- [Installation](#installation)
- [Usage](#usage)
- [Support](#support)
- [Roadmap and Changelog](#roadmap-and-changelog)
  - [Roadmap](#roadmap)
  - [Changelog](#changelog)
- [Contributing](#contributing)
- [Authors and Acknowledgements](#authors-and-acknowledgement)
  - [Authors](#authors)
  - [Acknowledgements](#acknowledgements)
- [License](#license)
- [Project Status](#project-status)

## Development
Prerequisites:
  - JDK12 Installed: https://jdk.java.net/12/
  - Maven Installed: https://maven.apache.org/install.html
  - OpenJFX Installed: https://openjfx.io/index.html
  
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
The Hero Workshop is designed to allow players to electronically create a Role-Playing Game (RPG) Hero for use with the D20 Role-Playing Game (RPG) System and use that Hero to play with other via the application Game Chat module.

The application will consist of two modules: the Hero Generator and the Game Chat
  - The Hero Generator is the part of the application that allows the user to create a Hero. Following the instructions via the Hero Guides the user will create a Hero to facilatate play in the Game Chat module.
  - The Game Chat module is the part of the application that allows the user to use the created Hero to play the game with the Game Master.

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

## Authors and Acknowledgement

### Authors
Troy Pilewski ([@troypilewski](https://github.com/troypilewski))  
<!-- Sumant Khapre ([@sumant2000](https://github.com/sumant2000))  -->
<!-- Mindaugas Vasiliauskas ([@mivasiliauskas](https://github.com/mivasiliauskas))  -->
<!-- Saurav Bhuju ([@sbhuju61](https://github.com/sbhuju61))  -->
<!-- Justin Nichols ([@justinnichols](https://github.com/justinnichols)) -->

### Acknowledgements

## License
The project is licensed under the GNU General Public License v3.0. The full license can be found in our [HERE](LICENSE)

## Project Status
The project is currently in the intial phases of design and development.
