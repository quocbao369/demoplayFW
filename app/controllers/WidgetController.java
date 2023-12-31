package controllers;

import models.Widget;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.data.Form;
import play.data.FormFactory;
import play.i18n.MessagesApi;
import play.mvc.*;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

import static play.libs.Scala.asScala;


@Singleton
public class WidgetController extends Controller {

    private final Form<WidgetData> form;
    private final MessagesApi messagesApi;
    private final List<Widget> widgets;

    private final Logger logger = LoggerFactory.getLogger(getClass()) ;

    @Inject
    public WidgetController(FormFactory formFactory, MessagesApi messagesApi) {
        this.form = formFactory.form(WidgetData.class);
        this.messagesApi = messagesApi;
        this.widgets = com.google.common.collect.Lists.newArrayList(
                new Widget("Product 1", 1000),
                new Widget("Product 2", 2000),
                new Widget("Product 3", 3000)
        );
    }

    public Result index() {
        return ok(views.html.index.render());
    }

    public Result listWidgets(Http.Request request) {
        return ok(views.html.listWidgets.render(asScala(widgets), form, request, messagesApi.preferred(request)));
    }

    public Result createWidget(Http.Request request) {
        final Form<WidgetData> boundForm = form.bindFromRequest(request);

        if (boundForm.hasErrors()) {
            logger.error("errors = {}", boundForm.errors());
            return badRequest(views.html.listWidgets.render(asScala(widgets), boundForm, request, messagesApi.preferred(request)));
        } else {
            WidgetData data = boundForm.get();
            widgets.add(new Widget(data.getName(), data.getPrice()));
            return redirect(routes.WidgetController.listWidgets())
                .flashing("info", "Widget added!");
        }
    }
}
