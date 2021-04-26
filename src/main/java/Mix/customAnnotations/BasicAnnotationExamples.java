package Mix.customAnnotations;
@MyAnnotation(tags={"JAVA" , "Annotations"})
public class BasicAnnotationExamples {
    @MyAnnotation
    private String name ="My Name";


    @MyAnnotation
    public BasicAnnotationExamples()
    {

    }
    @MyAnnotation
    public void doIt()
    {

    }
    public void printText(@MyAnnotation String text)
    {
       @MyAnnotation String localVar="Some text";
    }

    @MyAnnotation
    public static void main(String[] args) {

    }


}
