package by.yukho.entity;

public class Division extends Entity {
    private String battalionType;
    private float speed;
    private float organization;
    private float recoveryRate;
    private float softAttack;
    private float defence;
    private float breakthrough;

    public Division() {
    }

    public Division(String battalionType, float speed, float organization, float recoveryRate, float softAttack, float defence, float breakthrough) {
        this.battalionType = battalionType;
        this.speed = speed;
        this.organization = organization;
        this.recoveryRate = recoveryRate;
        this.softAttack = softAttack;
        this.defence = defence;
        this.breakthrough = breakthrough;
    }

    public String getBattalionType() {
        return battalionType;
    }

    public void setBattalionType(String battalionType) {
        this.battalionType = battalionType;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getOrganization() {
        return organization;
    }

    public void setOrganization(float organization) {
        this.organization = organization;
    }

    public float getRecoveryRate() {
        return recoveryRate;
    }

    public void setRecoveryRate(float recoveryRate) {
        this.recoveryRate = recoveryRate;
    }

    public float getSoftAttack() {
        return softAttack;
    }

    public void setSoftAttack(float softAttack) {
        this.softAttack = softAttack;
    }

    public float getDefence() {
        return defence;
    }

    public void setDefence(float defence) {
        this.defence = defence;
    }

    public float getBreakthrough() {
        return breakthrough;
    }

    public void setBreakthrough(float breakthrough) {
        this.breakthrough = breakthrough;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Division{");
        sb.append("Battalion Type = ").append(battalionType);
        sb.append("; Speed = ").append(speed);
        sb.append("; Organization = ").append(organization);
        sb.append("; Recovery rate = ").append(recoveryRate);
        sb.append("; Soft attack = ").append(softAttack);
        sb.append("; Defence = ").append(defence);
        sb.append("; Breakthrough = ").append(breakthrough).append("\n");
        return sb.toString();
    }
}
