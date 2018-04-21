package javis.app.persistent.po;

import javis.app.persistent.base.BaseEntity;

public class UserGroup extends BaseEntity {
    private String name;

    private String level;

    private Integer pid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}