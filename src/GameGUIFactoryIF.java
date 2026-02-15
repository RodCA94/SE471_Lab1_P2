// Abstract Factory
public interface GameGUIFactoryIF {
    CharacterPanel_IF createCharacterPanel();
    WeaponPanel_IF createWeaponPanel();
}

// Concrete Factories
class BeginnerGUIFactory implements GameGUIFactoryIF {

    public CharacterPanel_IF createCharacterPanel() {
        return new Beginner_CharacterPanel();
    }

    public WeaponPanel_IF createWeaponPanel(){
        return new Beginner_WeaponPanel();
    }
}

class IntermediateGUIFactory implements GameGUIFactoryIF {

    public CharacterPanel_IF createCharacterPanel() {
        return new Intermediate_CharacterPanel();
    }

    public WeaponPanel_IF createWeaponPanel(){
        return new Intermediate_WeaponPanel();
    }
}

class AdvancedGUIFactory implements GameGUIFactoryIF {

    public CharacterPanel_IF createCharacterPanel() {
        return new Advanced_CharacterPanel();
    }

    @Override
    public WeaponPanel_IF createWeaponPanel() {
        return new Advanced_WeaponPanel();
    }
}
