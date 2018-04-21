package javis.app.persistent.po;

import javis.app.persistent.base.BaseEntity;

public class Role extends BaseEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}