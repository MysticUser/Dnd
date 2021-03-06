package Roles;

import handlers.Skill;

import java.util.ArrayList;

import static handlers.Utilities.getSkills;
/*
The Fighter Role/class
@Author Trym Staurheim
todo add fighting style choice method.
 */

public class Fighter extends Role {
    private String secondWind;
    private String fightingStyle;

    public Fighter(String roleNameIn, int baseHpIn, int amountOfSkillsIn, ArrayList<Skill> chosenRoleSkillsIn, String fightingStyleIn, String secondWindIn, int valueIn) {
        super(roleNameIn, baseHpIn, amountOfSkillsIn, chosenRoleSkillsIn, valueIn);
        setFightingStyle(fightingStyleIn);
        setSecondWind(secondWindIn);
    }

    public String getSecondWind() {
        return secondWind;
    }

    private void setSecondWind(String secondWindIn) {
        this.secondWind = secondWindIn;
    }

    public String getFightingStyle() {
        return fightingStyle;
    }

    private void setFightingStyle(String fightingStyleIn) {
        this.fightingStyle = fightingStyleIn;
    }

    @Override
    public ArrayList<String> availableRoleSkills() {
        ArrayList<String> availableRoleSkills = new ArrayList<>();
        availableRoleSkills.add(getSkills().getString("acrobatics"));
        availableRoleSkills.add(getSkills().getString("animalhandling"));
        availableRoleSkills.add(getSkills().getString("athletics"));
        availableRoleSkills.add(getSkills().getString("history"));
        availableRoleSkills.add(getSkills().getString("insight"));
        availableRoleSkills.add(getSkills().getString("intimidation"));
        availableRoleSkills.add(getSkills().getString("perception"));
        availableRoleSkills.add(getSkills().getString("survival"));
        return availableRoleSkills;
    }

}
