package javis.app.persistent.po;

import javis.app.persistent.base.BaseEntity;

public class Authority extends BaseEntity {
    private String name;

    private Integer roleId;

    private Integer type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}