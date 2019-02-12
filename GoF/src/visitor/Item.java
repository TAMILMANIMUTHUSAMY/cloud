package visitor;

/**
 * author    : gbs04229
 * Created on: Feb 12, 2019 18:17:36
 * Project   : GoF
 * File Name : Item.java
 */
public abstract class Item {
    protected String code;
    protected String description;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
