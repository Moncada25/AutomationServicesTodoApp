package com.bookverse.certification.packapps.questions;

import static com.bookverse.certification.packapps.userinterfaces.ApiTasksElements.TASKS_IN_JSON_FORMAT;

import com.bookverse.certification.packapps.models.Task;
import com.bookverse.certification.packapps.utils.ConverterJson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Collection;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

public class TheTasksOnTheJson implements Question<Boolean> {

  public static TheTasksOnTheJson correspondToThoseOfTheService() {
    return new TheTasksOnTheJson();
  }

  @Subject("compare results of json and service for tasks")
  @Override
  public Boolean answeredBy(Actor actor) {

    Type tasksType = new TypeToken<Collection<Task>>() {
    }.getType();

    Collection<Task> resultTasksWeb = ConverterJson
        .fromJson(TASKS_IN_JSON_FORMAT.resolveFor(actor).getText(), tasksType);
    Collection<Task> resultTasksService = SerenityRest.lastResponse().body().as(tasksType);

    return resultTasksWeb.toString().equals(resultTasksService.toString());
  }

  private TheTasksOnTheJson() {
  }
}
