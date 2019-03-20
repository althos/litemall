package org.linlinjava.litemall.admin.util;

import java.util.List;

public class PermVo {
    /**
     * id
     */
    private String id;
    /**
     * 名称
     */
    private String label;
    /**
     * api
     */
    private String api;
    /**
     * 按钮
     */
    private List<PermVo> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getApi() {
        return api;
    }

    public List<PermVo> getChildren() {
        return children;
    }

    public void setChildren(List<PermVo> children) {
        this.children = children;
    }

}
