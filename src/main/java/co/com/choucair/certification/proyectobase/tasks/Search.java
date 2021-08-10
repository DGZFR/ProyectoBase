package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements  Task {
//para implementar el metodo alt enter en task y generar metodo

    private String courses;

    public Search(String courses) {

    this.courses = courses;

    }


    public static Search the(String courses) {

        return Tasks.instrumented(Search.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(SearchCoursePage.BUTTON_UC),
                //añadimos todas las instrucciones que se requieren para lograr iniciar sesion
                Enter.theValue(courses).into(SearchCoursePage.INPUT_COURSE),
                Click.on(SearchCoursePage.BUTTON_GO),
                Click.on(SearchCoursePage.SELECT_COURSE)

        );


    }
}
