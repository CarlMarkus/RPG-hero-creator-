# RPG Hero
## RPG Hero Game 
A RPG console game made in Java where you can create your own hero. 

## Description
The game can be played in a Java console. You can create the following heros: Warrior, Mage, Ranger and Rogue. 

The heros can level up and equip weapon or armor. 

## Installation
JDK: corretto-17 Amazon Corretto version 17.0.4 

Project can be opened in intellij. 

## Usage
To create a new hero: 

  Warrior warriorObject = new Warrior("WarriorName"); ¨

  Mage mageObject = new Mage("MageName");

To level up: 

  warriorObject.levelUp();

Create a weapon: 

  Weapon hammer = new Weapon("hammer",2,Slot.WEAPON, 5, WeaponType.HAMMERS);

Equip: 

  warriorObject.equipWeapon(hammer);

