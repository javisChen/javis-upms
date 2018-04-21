package javis.app.persistent.po;

import javis.app.persistent.base.BaseEntity;

public class RoleUserGroupR extends BaseEntity {
    private Integer userGroupId;

    private Integer roleId;

    public Integer getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}