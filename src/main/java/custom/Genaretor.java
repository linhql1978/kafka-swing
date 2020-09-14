package custom;


import org.quickfixj.codegenerator.MessageCodeGenerator;
import org.quickfixj.codegenerator.MessageCodeGenerator.Task;

import java.io.File;

public class Genaretor {
    public static void main(String[] args) {
        Task task = new Task();
        task.setName("Custom 4.4");
        task.setSpecification(new File("spec/CustomFIX.xml"));
        task.setTransformDirectory(new File("stransforms"));
        task.setOutputBaseDirectory(new File("src/main/java"));
        task.setMessagePackage("custom.messages");
        task.setFieldPackage("custom.fields");

        MessageCodeGenerator codeGenerator = new MessageCodeGenerator();
        codeGenerator.generate(task);
    }
}
