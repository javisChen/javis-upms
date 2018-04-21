package javis.app.persistent.po;

import javis.app.persistent.base.BaseEntity;

public class UserUserGroupR extends BaseEntity {
    private Integer userId;

    private Integer userGroupId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }
}