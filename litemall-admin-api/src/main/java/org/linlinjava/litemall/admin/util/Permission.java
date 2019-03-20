package org.linlinjava.litemall.admin.util;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.linlinjava.litemall.admin.annotation.RequiresPermissionsDesc;
import org.springframework.web.bind.annotation.RequestMapping;

public class Permission {
    /**
     * 权限码
     */
    private RequiresPermissions requiresPermissions;
    /**
     * 权限名
     */
    private RequiresPermissionsDesc requiresPermissionsDesc;
    /**
     * 对应的api
     */
    private String api;

    public RequiresPermissions getRequiresPermissions() {
        return requiresPermissions;
    }

    public RequiresPermissionsDesc getRequiresPermissionsDesc() {
        return requiresPermissionsDesc;
    }

    public void setRequiresPermissions(RequiresPermissions requiresPermissions) {
        this.requiresPermissions = requiresPermissions;
    }

    public void setRequiresPermissionsDesc(RequiresPermissionsDesc requiresPermissionsDesc) {
        this.requiresPermissionsDesc = requiresPermissionsDesc;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }
}
