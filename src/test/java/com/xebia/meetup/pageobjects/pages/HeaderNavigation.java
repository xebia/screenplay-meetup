package com.xebia.meetup.pageobjects.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HeaderNavigation extends PageObject {

    @FindBy(css="#nav-messages a")
    WebElementFacade messagesLink;

    @FindBy(css="#nav-profile a")
    WebElementFacade accountDropdown;

    @FindBy(id="headerAvatar")
    WebElementFacade avatar;

    @FindBy(css="#nav-account-links a[href*=\"logout\"]")
    WebElementFacade logoutLink;

    public boolean avatarIsVisible() {
        return avatar.isCurrentlyVisible();
    }

    public void goto_messages_page() {
        messagesLink.click();
    }

    public void logout() {
        accountDropdown.click();
        logoutLink.click();
    }

}