package Mix.customAnnotations;

import java.lang.annotation.*;

//https://www.youtube.com/watch?v=UlhtkjfxUUU
// To decide on which the annotations would be valid
//@Target({ElementType.FIELD ,ElementType.TYPE ,ElementType.METHOD,ElementType.CONSTRUCTOR ,ElementType.PARAMETER ,ElementType.LOCAL_VARIABLE})

@Inherited
@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface MyAnnotation {

String name() default "GUNJAN";
int count() default 2 ;
String [] tags() default {"JAVA" , "Annotaions"};
}
