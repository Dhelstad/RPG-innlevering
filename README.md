# RPG

### This package contains classes for creating and managing characters and items in a role-playing console game (RPG).

Classes
Mage: represents a character with magical abilities.

Warrior: represents a character with physical combat abilities.

Armor: represents a piece of armor that a character can equip to increase their defense.

Weapon: represents a weapon that a character can equip to increase their attack power.

## Usage:

### To use this package, you will need to import the necessary classes. For example:

#### Copy code:
import RPG.Characters.Mage;

import RPG.Characters.Warrior;

import RPG.Item.Armor;

import RPG.Item.Slot;

import RPG.Item.Weapon;

### some hero's can equip different weapon types:
Mages – Staff, Wand<br>

 Rangers – Bow<br>

 Rogues – Dagger, Sword<br>

Warriors – Axe, Hammer, Sword

### and some hero's can also equip different armor types:
Mages – Cloth<br>

Rangers – Leather, Mail<br>

Rogues – Leather, Mail<br>

Warriors – Mail, Plate<br>

### You can then create instances of these classes and use their methods to manage your characters and items. For example:

#### Copy code:
Warrior thor = new Warrior("Thor");

Weapon mjolnir = new Weapon("Mjolnir", 1, Slot.WEAPON, Weapon.Type.HAMMER, 5, 4.5);
thor.Equip(mjolnir);

Armor chestPlate = new Armor("Chest plate", 1, Slot.BODY, Armor.Type.PLATE, 10, 2, 1);
thor.Equip(chestPlate);

thor.display();

## Additional Notes
The display() method of the Warrior class can be used to display the character's current attributes, including their equipped items.
