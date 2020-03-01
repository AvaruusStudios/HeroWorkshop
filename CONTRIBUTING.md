# Contributing to Hero Workshop
The following is a set of guidelines for the contributing to the Project Hero Workshop.

## Table of Contents
1. Code of Conduct<!-- ## -->
2. Frequently Asked Questions (FAQ)<!-- ## -->
3. What Should I Know Before I Start?<!-- ## -->
    1. Directory Convention<!-- ### -->
4. How To Contribute?<!-- ## -->
    1. Reporting Issues<!-- ### -->
        1. Before Submitting A Issue<!-- #### -->
        2. How Do I Submit A Good Issue<!-- #### -->
    2. Submitting Enhancement Requests<!-- ### -->
        1. Before Submitting An Enhancement Request<!-- #### -->
        2. How Do I Submit A Good Enhancement Request<!-- #### -->
5. Project Style Guide<!-- ## -->
6. Additional Notes<!-- ## -->

## Code Of Conduct
This project and everyone participating in it is governed by the Avaruus Studios Code of Conduct. By participating, in the project you are expected to uphold the code. Please report any unacceptable behavior to 

## Frequently Asked Questions (FAQ)
We are currently in the process of building a Wiki page with Frequently Asked Questions (FAQs).

> **Note:** Please don't submit an issue to ask questions. You'll get faster results by reviewing the Frequently Asked Questions (FAQs).

## What Should I Know Before I Start
Hero Workshop is an open source project to support the players of the Star Wars Role Playing Game. We aim to make it easier to crete a character and build a unique story with other fellow players.

The Hero Generator Module is as a modular JavaFX application. Every tab you interact with and the menubar are their own FXML file. The Game Master Module will also be a modular JavaFX application.

### Directory Convention
There is a convention that has been adopted to make understanding where everything goes easier.
* Java Class Files
All Java Class files reside in the following directory:`src/main/java`.
* A class that deals with the display or manipulation of items from the sourcebooks to the Hero Generator Module would reside in the following directory: `src/main/java/com/avaruus/db`
* A class that deals with the interaction of the user interface or is a controller for an FXML file would reside in the following directory: `src/main/java/com/avaruus/heroworkshop/ui/controllers`
* The main application is the HeroWorkshopMain.java which is in the following directory: `src/main/java/com/avaruus/heroworkshop/HeroWorkshopMain.java`
* Resource Files
Every resource file resides in the following directory:`src/main/resources`.
* Database Files: The database files being used to store the required data from the rulebooks is a JavaScript Object Notation (JSON) file. There will be multiple sourcebooks which may or may not add data to any number of controls. Each sourcebook will have their own JSON file and will structured the same way. These JSON files will be in the following directory: `src/main/resources/db`
* Object Description Files: The very lengthy and descriptive text about every object will be Markdown (.md) files. This will be to alleviate any overly descriptive to test in the JavaScript Object Notation (JSON) files. Each sourcebook will have their own directory and it will be split up into sub categories: Species, Classes, Skills, Feats, Equipment. These Markdown files will be located in the following directory in a sub-folder for the sourcebook the pertain to: `src/main/resources/db`
* The JavaFX XML Files: The JavaFX XML (.fxml) files are those which describe the way the user interface will look. The user interface is built to be modular, so each piece of the user interface has its' own (.fxml) file. These files are located in the following directory: `src/main/resources/fxml`.
* Icon Files: Image files which are used as icons will be located in the following directory: `src/main/resources/icons`.
* Sourcebooks: The sourcebooks are the rules and guidelines on how to run you storytelling experience and live in the Star Wars Universe through the experiences of your created character. These source can be used as reference and are located in the following directory: `src/main/resources/sourcebooks`

## How Can I Contribute
Currently, we need developers to help develop the Hero Workshop. The areas we are in need of help are in the following:
* Software Development (Java): This should have a focus on JavaFX.
* Back-End Development (Database): Currently, the database convention we are going with is to utilise JavaScript Object Notation (JSON) files. If you would like to discuss and suggest a better way, please do.
* Web Developer (Web Design): The purpose of the this position is to design a dynamic webpage which looks like the current Star Wars Role Playing Game Character Sheet. The design would have to allow for variables to be populated via the Hero Generator Module.

If you cannot help with the above positions, please feel free to check back with us when there is a working release.

### Reporting Issues
This section guides you in submitting a issue for Hero Workshop. Following these guidelines help the maintainers and developers of the project understand your reported issue in the Hero Workshop, reproduce the issue, and find related reports.

Before creating a issue report, please check the list of already reported issues to see if your issue has been reported already. When creating a issue report, please include as many details as possible about the reported issue. Please follow the required issue template, this helps us resolve issues faster.

> **Note:** If you find a **`CLOSED`** issue that seems like it is the same thing you are experiencing, open a new issue and select the closed issues as a related issue.

#### Before Submitting A Issue Report
* Perform a cursory search to see if the issue has already been reported. If it has already been reported and is still **`OPEN`**, add a comment to the existing issue instead of opening a new issue.

#### How Do I Submit A Good Issue Report
Issues are tracked as GitHub Issues. Create an issue from within the repository and provide the following information via the template.

Explain the issue and include additional details to help developers and maintainers reproduce the issue:
* Use a clear and descriptive title for the issue to identify the problem.
* Describe the exact step which reproduce the issue with as many details as possible. For example, For example, start by explaining how you started Hero Workshop. When listing steps, don't just say what you did, but explain how you did it. For example, if you moved the cursor to the end of a line, explain if you used the mouse, the arrow keys, or a keyboard shortcut?
* Describe the state of the Hero Workshop after following your steps and point out what the issue is with the Hero Workshop.
* Describe what what you expected to see happen within the Hero Workshop and why.
* Include screenshots or animated Graphic Interchange Files (GIFs), which show you demonstrating the prescribed steps and clearly demonstrates the issue you are having with the Hero Workshop. You can use [LICEcap](https://www.cockos.com/licecap/) to record GIFs on macOS and Windows, and [Silentcast](https://github.com/colinkeenan/silentcast) on Linux.

Provide more context by answering the following questions:
1. Can you reproduce the issue?
2. Did the problem start happening recently (ie. after you updated to a newer version of the Hero Workshop) or was this always an issue?
3. Can you reproduce the issue with an older release of the Hero Workshop? You can download older version of the Hero Workshop from the release pages.
4. Can you reliably reproduce the issue? If not, provide details about how often the problem happens and under which conditions it normally happens.

Include details about your configuration and environment:
1. Which version of the Hero Workshop are you using? You can get the current version of the Hero Workshop by viewing the `About` page from the `Help` menu.
2. What is the name and version of the Operating System (OS) you are using?
3. Are you running Hero Workshop in a Virtual Machine (VM)? If so, which Virtual Machine (VM) software are you using and which Operating System (OS) and version are used for the host and the guest?

### Submitting Enhancements
This section guides you through submitting an enhancement suggestion for Hero Workshop, including completely new features and minor improvements to existing functionality. Following these guidelines helps Developers and Maintainers understand your suggestion and find related suggestions.

Before creating enhancement suggestions, please check this list as you might find out that you don't need to create one. When you are creating an enhancement suggestion, please include as many details as possible. Fill in the template, including the steps that you imagine you would take if the feature you're requesting existed.

#### Before Submitting An Enhancement Request
Before Submitting an enhancement request:
* Review the changelog for the Hero Workshop - you might discover the enhancement has already been implemented. Ensure that you are using the latest version of the Hero Workshop.
* Perform a cursory search to see if the enhancement has already been reported. If it has already been reported and is still **`OPEN`**, add a comment to the existing issue instead of opening a new issue.

#### How Do I Submit A Good Enhancement Request
Enhancements Requests are tracked as GitHub Issues. Create an issue from within the repository and provide the following information via the template.
* Use a clear and descriptive title for the enhancement request you are submitting.
* Provide a step-by-step description of the suggested enhancement in as many details as possible.
* Provide specific examples to demonstrate the steps. Include copy/paste snippets which you use in those examples, as Markdown Code Blocks.
* Describe the current operation of the Hero Workshop and what you would expect to see instead and why.
* IInclude screenshots or animated Graphic Interchange Files (GIFs), which show you demonstrating the prescribed steps and clearly demonstrates the part of the Hero Workshop you are suggesting the enhancement for. You can use [LICEcap](https://www.cockos.com/licecap/) to record GIFs on macOS and Windows, and [Silentcast](https://github.com/colinkeenan/silentcast) on Linux.
* Explain why this enhancement would be useful to users of Hero Workshop.
* Specify which version of Hero Workshop you are using.
* Specify which name and version of the Operating System (OS) you are using.

## Project Style Guide
This section guides you through the convention used while developing Hero Workshop, including but not limited to, `Commit Messages`, `Java Language Styling`, `Documentation Guide`. Following these guidelines helps Developers and Maintainers and the community which submits code to Hero Workshop all conform to the same code style and understand everything.

### Commit Messages
When making `Commit Messages` please follow these guidelines:
* Use past tense ("Added feature" not "Add feature"). This is because the commit message you are submitting is after you completed work, therefore the work you completed is in the past.
* If multiple items were worked on in one commit, separate each item worked on with a semi-colon (;).

### Java Language Styling

### Documentation Guides
