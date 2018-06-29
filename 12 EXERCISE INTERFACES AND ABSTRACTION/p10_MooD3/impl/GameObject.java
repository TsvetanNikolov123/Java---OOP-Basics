package p10_MooD3.impl;

public abstract class GameObject {

    private String name;
    private String hashedPassword;
    private int level;

    protected GameObject(String username, int level) {
        this.setName(username);
        this.hashedPassword = this.generateHashPassword();
        this.setLevel(level);
    }
    public abstract String generateHashPassword();

    private void setName(String name) {
        this.name = name;
    }

    private void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return this.name;
    }

}
