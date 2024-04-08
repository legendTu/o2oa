package com.x.portal.core.entity;

import com.x.base.core.entity.JsonProperties;
import com.x.base.core.project.annotation.FieldDescribe;

public class PortalProperties extends JsonProperties {
    @FieldDescribe("角标关联脚本.")
    private String cornerMarkScript;
    @FieldDescribe("角标脚本.")
    private String cornerMarkScriptText;

    public PortalProperties() {
    }

    public String getCornerMarkScript() {
        return this.cornerMarkScript;
    }

    public void setCornerMarkScript(String cornerMarkScript) {
        this.cornerMarkScript = cornerMarkScript;
    }

    public String getCornerMarkScriptText() {
        return this.cornerMarkScriptText;
    }

    public void setCornerMarkScriptText(String cornerMarkScriptText) {
        this.cornerMarkScriptText = cornerMarkScriptText;
    }
}
