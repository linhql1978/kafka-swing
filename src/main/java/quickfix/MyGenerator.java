package quickfix;


import org.quickfixj.codegenerator.MessageCodeGenerator;
import org.quickfixj.codegenerator.MessageCodeGenerator.Task;

import java.io.File;

public class MyGenerator {
    public static void main(String[] args) {

        Task task = new Task();
        task.setName("Custom 4.4");
        task.setSpecification(new File("spec/CustomFIX.xml"));
        task.setTransformDirectory(new File("codeGenerator"));
        task.setOutputBaseDirectory(new File("src/main/java"));
        task.setMessagePackage("quickfix.messages");
        task.setFieldPackage("quickfix.fields");
        MessageCodeGenerator codeGenerator = new MessageCodeGenerator();
        codeGenerator.generate(task);

    }
}
