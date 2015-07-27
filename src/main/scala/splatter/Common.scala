package splatter

//  What is a Rep? Or, called a LINQ Expr by Wadler on his Scala example slide.
sealed abstract class Rep

sealed trait Op
case object Plus extends Op
case object Minus extends Op
case object Times extends Op
case object Div extends Op
case object Mod extends Op
case object Equal extends Op
case object Nequal extends Op
case object Leq extends Op
case object Lt extends Op
case object Geq extends Op
case object Gt extends Op
case object And extends Op
case object Or extends Op
case object Concat extends Op
case object Not extends Op
case object Neg extends Op
case object Like extends Op
