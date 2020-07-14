import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Nashorn2 {
    public static void main(String[] args) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
        try {
            nashorn.eval(new FileReader("Demo.js"));
            Invocable invocable = (Invocable) nashorn;
            Object result = invocable.invokeFunction("isPrime", 257);
            System.out.println(257 + " isPrime? : " + result);
        } catch (Exception e) {
            System.out.println("Error executing script : " + e.getMessage());
        }
    }
}
