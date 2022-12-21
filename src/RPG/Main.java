package RPG;


import RPG.Characters.Mage;
import RPG.Characters.Ranger;
import RPG.Characters.Rogue;
import RPG.Characters.Warrior;
import RPG.Item.Armor;
import RPG.Item.Slot;
import RPG.Item.Weapon;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Warrior thor = new Warrior("Thor") ;

        Weapon mjolnir = new Weapon("Mjolnir", 1, Slot.WEAPON, Weapon.Type.HAMMER,5, 4.5);
        thor.Equip(mjolnir);

        Armor chestPlate = new Armor("Chest plate", 1, Slot.BODY, Armor.Type.PLATE, 10, 2, 1);
        thor.Equip(chestPlate);


        thor.display();

        System.out.println();

        Mage Odin = new Mage("Odin") ;

        Weapon staff = new Weapon("Staff", 1, Slot.WEAPON, Weapon.Type.STAFF,3, 2.5);
        Odin.Equip(staff);

        Armor cloth = new Armor("CLOTH", 1, Slot.BODY, Armor.Type.CLOTH, 8, 1, 3);
        Odin.Equip(cloth);


        Odin.display();

        System.out.println();

        Rogue Loke = new Rogue("Loke") ;

        Weapon dagger = new Weapon("Dagger", 1, Slot.WEAPON, Weapon.Type.DAGGER,2, 4.5);
        Loke.Equip(dagger);

        Armor mail = new Armor("MAIL", 1, Slot.BODY, Armor.Type.MAIL, 7, 1, 2);
        Loke.Equip(mail);


        Loke.display();


        System.out.println();

        Ranger Balder = new Ranger("Balder") ;

        Weapon bow = new Weapon("BOW", 1, Slot.WEAPON, Weapon.Type.BOW,1, 2.5);
        Balder.Equip(bow);

        Armor leather = new Armor("LEATHER", 1, Slot.BODY, Armor.Type.LEATHER, 5, 2, 1);
        Balder.Equip(leather);


        Balder.display();

    }
}


