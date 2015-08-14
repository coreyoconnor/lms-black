package scala.lms.black

import eval._
import parser._

object repl {
  def idcont = mkCont[NoRep]{x => x}
  val global_env = init_env
  def ev(s: String) = {
    val Success(e, _) = parseAll(exp, s)
    base_eval[NoRep](e, global_env, idcont)
  }
}