package controllers

import play.api._
import play.api.mvc._

class Puzzle extends Controller {

  def show = Action {
    Ok(views.html.puzzle.show())
  }

}
