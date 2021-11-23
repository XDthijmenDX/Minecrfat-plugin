package lemmensthijmen.cosmetics;

public class CheckIfArmourIsOn {

    private boolean helmet;
    private boolean chestplate;
    private boolean leggings;
    private boolean boots;

    public CheckIfArmourIsOn(){
        helmet = false;
        chestplate = false;
        leggings = false;
        boots = false;
    }

    public void setHelmet(boolean helmet) {
        this.helmet = helmet;
    }

    public void setChestplate(boolean chestplate) {
        this.chestplate = chestplate;
    }

    public void setLeggings(boolean leggings) {
        this.leggings = leggings;
    }

    public void setBoots(boolean boots) {
        this.boots = boots;
    }

    public boolean getHelmet(){
        return helmet;
    }

    public boolean getChestplate() {
        return chestplate;
    }

    public boolean getLeggings() {
        return leggings;
    }

    public boolean getBoots() {
        return boots;
    }
}
