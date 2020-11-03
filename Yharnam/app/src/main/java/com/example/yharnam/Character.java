package com.example.yharnam;

public class Character {
    private String name, origin, gender;
    private int level, insight;
    private int vitality, endurance, strength, skill, bloodtinge, arcane;
    private String rh1, rh2, lh1, lh2;
    private String headArmor, chestArmor, handArmor, legArmor;
    private String rune1, rune2, rune3, oathRune;
    private int hp, stamina, discovery, rh1Damage, rh2Damage, lh1Damage, lh2Damage, physDef, slowPois, rapidPois, frenzyRes, beasthood;
    private int physical, vsBlunt, vsThrust, blood, arcane_reduction, fire, bolt;


    public Character(String name,
                     String origin,
                     String gender){

        this.name = name;
        this.origin = origin;
        this.gender = gender;

        this.level = 0;
        this.insight = 0;
        this.vitality = 0;
        this.endurance = 0;
        this.strength = 0;
        this.skill = 0;
        this.bloodtinge = 0;
        this.arcane = 0;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getOrigin(){
        return this.origin;
    }

    public void setOrigin(String origin){
        this.origin = origin;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getInsight() {
        return insight;
    }

    public void setInsight(int insight) {
        this.insight = insight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public int getBloodtinge() {
        return bloodtinge;
    }

    public void setBloodtinge(int bloodtinge) {
        this.bloodtinge = bloodtinge;
    }

    public int getArcane() {
        return arcane;
    }

    public void setArcane(int arcane) {
        this.arcane = arcane;
    }

    public String getRh1() {
        return rh1;
    }

    public void setRh1(String rh1) {
        this.rh1 = rh1;
    }

    public String getRh2() {
        return rh2;
    }

    public void setRh2(String rh2) {
        this.rh2 = rh2;
    }

    public String getLh1() {
        return lh1;
    }

    public void setLh1(String lh1) {
        this.lh1 = lh1;
    }

    public String getLh2() {
        return lh2;
    }

    public void setLh2(String lh2) {
        this.lh2 = lh2;
    }

    public String getHeadArmor() {
        return headArmor;
    }

    public void setHeadArmor(String headArmor) {
        this.headArmor = headArmor;
    }

    public String getChestArmor() {
        return chestArmor;
    }

    public void setChestArmor(String chestArmor) {
        this.chestArmor = chestArmor;
    }

    public String getHandArmor() {
        return handArmor;
    }

    public void setHandArmor(String handArmor) {
        this.handArmor = handArmor;
    }

    public String getLegArmor() {
        return legArmor;
    }

    public void setLegArmor(String legArmor) {
        this.legArmor = legArmor;
    }

    public String getRune1() {
        return rune1;
    }

    public void setRune1(String rune1) {
        this.rune1 = rune1;
    }

    public String getRune2() {
        return rune2;
    }

    public void setRune2(String rune2) {
        this.rune2 = rune2;
    }

    public String getRune3() {
        return rune3;
    }

    public void setRune3(String rune3) {
        this.rune3 = rune3;
    }

    public String getOathRune() {
        return oathRune;
    }

    public void setOathRune(String oathRune) {
        this.oathRune = oathRune;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getDiscovery() {
        return discovery;
    }

    public void setDiscovery(int discovery) {
        this.discovery = discovery;
    }

    public int getRh1Damage() {
        return rh1Damage;
    }

    public void setRh1Damage(int rh1Damage) {
        this.rh1Damage = rh1Damage;
    }

    public int getRh2Damage() {
        return rh2Damage;
    }

    public void setRh2Damage(int rh2Damage) {
        this.rh2Damage = rh2Damage;
    }

    public int getLh1Damage() {
        return lh1Damage;
    }

    public void setLh1Damage(int lh1Damage) {
        this.lh1Damage = lh1Damage;
    }

    public int getLh2Damage() {
        return lh2Damage;
    }

    public void setLh2Damage(int lh2Damage) {
        this.lh2Damage = lh2Damage;
    }

    public int getPhysDef() {
        return physDef;
    }

    public void setPhysDef(int physDef) {
        this.physDef = physDef;
    }

    public int getSlowPois() {
        return slowPois;
    }

    public void setSlowPois(int slowPois) {
        this.slowPois = slowPois;
    }

    public int getRapidPois() {
        return rapidPois;
    }

    public void setRapidPois(int rapidPois) {
        this.rapidPois = rapidPois;
    }

    public int getFrenzyRes() {
        return frenzyRes;
    }

    public void setFrenzyRes(int frenzyRes) {
        this.frenzyRes = frenzyRes;
    }

    public int getBeasthood() {
        return beasthood;
    }

    public void setBeasthood(int beasthood) {
        this.beasthood = beasthood;
    }

    public int getPhysical() {
        return physical;
    }

    public void setPhysical(int physical) {
        this.physical = physical;
    }

    public int getVsBlunt() {
        return vsBlunt;
    }

    public void setVsBlunt(int vsBlunt) {
        this.vsBlunt = vsBlunt;
    }

    public int getVsThrust() {
        return vsThrust;
    }

    public void setVsThrust(int vsThrust) {
        this.vsThrust = vsThrust;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getArcane_reduction() {
        return arcane_reduction;
    }

    public void setArcane_reduction(int arcane_reduction) {
        this.arcane_reduction = arcane_reduction;
    }

    public int getFire() {
        return fire;
    }

    public void setFire(int fire) {
        this.fire = fire;
    }

    public int getBolt() {
        return bolt;
    }

    public void setBolt(int bolt) {
        this.bolt = bolt;
    }
}
