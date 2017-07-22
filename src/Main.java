import annotation.CanWatch;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Movie runner = new Movie("MOM","DLF");
        Method[] methods = runner.getClass().getMethods();
        for(Method method:methods) {
            CanWatch canWatch=method.getAnnotation(CanWatch.class);
            if(canWatch!=null && canWatch.flag()) {
                System.out.println("You are eligible to watch this movie " + method.getName());
                try {
                    method.invoke(runner);
                }catch (Exception ex){
                    System.out.println("Exception   : "+ex.getMessage());
                }
            }
        }
    }
}
