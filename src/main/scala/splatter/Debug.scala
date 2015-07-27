package splatter

object Debug {
    def printOp (o: Op) = 
        o match {
            case Plus   => "+"
            case Minus  => "-"
            case Times  => "*"
            case Div    => "/"
            case Mod    => "%"
            case Equal  => "=="
            case Nequal => "!="
            case Leq    => "<="
            case Lt     => "<"
            case Geq    => ">="
            case Gt     => ">"
            case And    => "&&"
            case Or     => "||"
            case Concat => "@"
            case Like   => "Like" // SQL
            case Not    => "Not"  // unary
            case Neg    => "Neg"  // unary
        }

}