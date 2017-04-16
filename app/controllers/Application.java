package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
/*
    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
*/
    public static Result sobre(){
       // return ok("sobre");
        return ok(views.html.sobre.render("top 100 filmes cut", play.core.PlayVersion.current()) );
    }

}
