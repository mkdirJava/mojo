package sample.plugin;


import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Goal which touches a timestamp file.
 */
@Mojo( name = "hi", defaultPhase = LifecyclePhase.PROCESS_SOURCES )
public class MyMojo
    extends AbstractMojo {

    /**
     * The greeting to display.
     */
    @Parameter( property = "hi.greeting", defaultValue = "Hello World!" )
    private String greeting;

    public void execute()
        throws MojoExecutionException
    {
        System.out.println("This is FROM MEEEEEE!!!!!!!");
        System.out.println(greeting);

    }

}
