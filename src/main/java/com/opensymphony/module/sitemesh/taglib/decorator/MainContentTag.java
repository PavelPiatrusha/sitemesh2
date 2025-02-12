package com.opensymphony.module.sitemesh.taglib.decorator;

import com.opensymphony.module.sitemesh.taglib.AbstractTag;

public class MainContentTag extends AbstractTag {
    public final int doEndTag() {
        try {
            getPage().writeMainContent(getOut());
        }
        catch (Exception e) {
            trace(e);
        }
        return EVAL_PAGE;
    }

}
