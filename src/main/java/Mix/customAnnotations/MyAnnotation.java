package Mix.customAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.FIELD ,ElementType.TYPE ,ElementType.METHOD,ElementType.CONSTRUCTOR ,ElementType.PARAMETER ,ElementType.LOCAL_VARIABLE})
public @interface MyAnnotation {

String name() default "GUNJAN";
int count() default 2 ;
String [] tags() default {"JAVA" , "Annotaions"};
}
