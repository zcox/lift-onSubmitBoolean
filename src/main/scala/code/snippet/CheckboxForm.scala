package code.snippet

import net.liftweb.util.Helpers._
import net.liftweb.http._
import net.liftweb.http.SHtml._

class CheckboxForm {
  def render = 
    "name=doesItWork" #> onSubmitBoolean(b => println("doesItWork = " + b)) &
    "name=message" #> onSubmit(s => println("message = " + s)) &
    "type=submit" #> onSubmitUnit(() => println("submitted, param = " + S.param("doesItWork")))
}
