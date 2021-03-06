package edu.unlv.cs.whoseturn.client.views.desktop.navigation;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.FlowPanel;

import edu.unlv.cs.whoseturn.client.views.View;
import edu.unlv.cs.whoseturn.client.views.desktop.AdminPanel;
import edu.unlv.cs.whoseturn.client.views.desktop.CategoryAdd;
import edu.unlv.cs.whoseturn.client.views.desktop.CategoryEdit;
import edu.unlv.cs.whoseturn.client.views.desktop.TurnAdd;
import edu.unlv.cs.whoseturn.client.views.desktop.TurnList;
import edu.unlv.cs.whoseturn.client.views.desktop.UserAdd;
import edu.unlv.cs.whoseturn.client.views.desktop.Main;
import edu.unlv.cs.whoseturn.client.views.desktop.UserDisplay;
import edu.unlv.cs.whoseturn.client.views.desktop.UserEdit;

/**
 * This is a navigation bar that gives a bunch of links, useful during
 * development process.
 */
public class NavigationBarListEverything implements View {

    /**
     * @wbp.parser.entryPoint
     */
    @Override
    public final Widget asWidget() {

        /**
         * A panel used for navigating between various views of our program.
         */
        FlowPanel navigationBar = new FlowPanel();

        /**
         * Links to admin pane.
         */
        Button adminNavItem = new Button();
        adminNavItem.setText("Admin Panel");
        adminNavItem.addClickHandler(new ClickHandler() {
            public void onClick(final ClickEvent event) {
                RootPanel.get("overall").clear();
                RootPanel.get("overall").add((new AdminPanel()).asWidget());
            }
        });
        navigationBar.add(adminNavItem);

        /**
         * Links to create category
         */
        Button createCategory = new Button();
        createCategory.setText("Category Add");
        createCategory.addClickHandler(new ClickHandler() {
            public void onClick(final ClickEvent event) {
                RootPanel.get("overall").clear();
                RootPanel.get("overall").add((new CategoryAdd()).asWidget());
            }
        });
        navigationBar.add(createCategory);

        /**
         * Links to edit category
         */
        Button editCategory = new Button();
        editCategory.setText("Category Edit");
        editCategory.addClickHandler(new ClickHandler() {
            public void onClick(final ClickEvent event) {
                RootPanel.get("overall").clear();
                RootPanel.get("overall").add((new CategoryEdit()).asWidget());
            }
        });
        navigationBar.add(editCategory);

        /**
         * Links to list categories
         */
        Button listCategory = new Button();
        listCategory.setText("Category List");
        listCategory.addClickHandler(new ClickHandler() {
            public void onClick(final ClickEvent event) {
                RootPanel.get("overall").clear();
                RootPanel.get("overall").add((new CategoryAdd()).asWidget());
            }
        });
        navigationBar.add(listCategory);

        /**
         * Links to main pane.
         */
        Button mainNavItem = new Button();
        mainNavItem.setText("Main");
        mainNavItem.addClickHandler(new ClickHandler() {
            public void onClick(final ClickEvent event) {
                RootPanel.get("overall").clear();
                RootPanel.get("overall").add((new Main()).asWidget());
            }
        });
        navigationBar.add(mainNavItem);

        /**
         * Links to profile display.
         */
        Button profileDisplayNavItem = new Button();
        profileDisplayNavItem.setText("Profile Display");
        profileDisplayNavItem.addClickHandler(new ClickHandler() {
            public void onClick(final ClickEvent event) {
                RootPanel.get("overall").clear();
                RootPanel.get("overall").add((new UserDisplay()).asWidget());
            }
        });
        navigationBar.add(profileDisplayNavItem);

        /**
         * Links to profileManagement.
         */
        Button profileManagementNavItem = new Button();
        profileManagementNavItem.setText("Profile Management");
        profileManagementNavItem.addClickHandler(new ClickHandler() {
            public void onClick(final ClickEvent event) {
                RootPanel.get("overall").clear();
                RootPanel.get("overall").add((new UserEdit()).asWidget());
            }
        });
        navigationBar.add(profileManagementNavItem);

        /**
         * Links to create user.
         */
        Button createUserNavItem = new Button();
        createUserNavItem.setText("User Add");
        createUserNavItem.addClickHandler(new ClickHandler() {
            public void onClick(final ClickEvent event) {
                RootPanel.get("overall").clear();
                RootPanel.get("overall").add((new UserAdd()).asWidget());
            }
        });
        navigationBar.add(createUserNavItem);

        /**
         * Links to create Turn
         */
        Button createTurnNavItem = new Button();
        createTurnNavItem.setText("Turn Add");
        createTurnNavItem.addClickHandler(new ClickHandler() {
            public void onClick(final ClickEvent event) {
                RootPanel.get("overall").clear();
                RootPanel.get("overall").add((new TurnAdd()).asWidget());
            }
        });
        navigationBar.add(createTurnNavItem);

        /**
         * Links to create Turn
         */
        Button listTurnNavItem = new Button();
        listTurnNavItem.setText("Turn List");
        listTurnNavItem.addClickHandler(new ClickHandler() {
            public void onClick(final ClickEvent event) {
                RootPanel.get("overall").clear();
                RootPanel.get("overall").add((new TurnList()).asWidget());
            }
        });
        navigationBar.add(listTurnNavItem);

        return navigationBar;
    }
}
