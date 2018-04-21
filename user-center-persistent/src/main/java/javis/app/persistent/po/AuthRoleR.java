package javis.app.persistent.po;

import javis.app.persistent.base.BaseEntity;

public class AuthRoleR extends BaseEntity {
    private Integer authId;

    private Integer roleId;

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}