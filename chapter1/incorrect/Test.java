@FunctionalInterface    //ERROR: Not a functional interface.
                        //       Contains more than one abstract 
                        //       method.
public interface Test       
{
       String process(String x);
       String process2(String x);
}
