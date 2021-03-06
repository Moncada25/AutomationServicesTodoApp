package com.bookverse.certification.packapps.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class EditTaskOnFrontElements {

  public static final Target ASSIGNMENT_TASK = Target.the("assignment of task to edit on frontend")
      .locatedBy("//input[@id = 'assignment']");
  public static final Target TITLE_TASK = Target.the("title of task to edit on frontend")
      .locatedBy("//input[@id = 'title']");
  public static final Target POINTS_TASK = Target.the("points of task to edit on frontend")
      .locatedBy("//input[@id = 'points']");
  public static final Target DESCRIPTION_TASK = Target.the("title of task to edit on frontend")
      .locatedBy("//textarea[@id = 'description']");
  public static final Target ID_TASK = Target.the("id of task to edit on frontend")
      .locatedBy("//input[@id = 'idHidden']");
  public static final Target DATE_TASK = Target.the("date of task to edit on frontend")
      .locatedBy("//input[@id = 'dateHidden']");

  private EditTaskOnFrontElements() {
  }
}
