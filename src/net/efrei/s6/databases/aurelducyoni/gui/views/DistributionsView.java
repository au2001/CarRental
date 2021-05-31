package net.efrei.s6.databases.aurelducyoni.gui.views;

import com.sun.net.httpserver.HttpExchange;
import net.efrei.s6.databases.aurelducyoni.controllers.UserController;
import net.efrei.s6.databases.aurelducyoni.gui.AuthenticatedView;
import net.efrei.s6.databases.aurelducyoni.gui.HTTPResponse;

public class DistributionsView extends AuthenticatedView {

    public DistributionsView(UserController userController) {
        super(userController);
    }

    @Override
    protected HTTPResponse handleGet(HttpExchange exchange) {
        return new HTTPResponse("Hello, World!"); // TODO
    }

}
