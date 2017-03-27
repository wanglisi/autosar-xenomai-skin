import java.util.HashMap;
import java.util.Map;

import org.apache.commons.cli.*;
import org.eclipse.emf.mwe.core.WorkflowRunner;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;


public class Worfklow {
	public static final String DOT_SEPARATOR = ".";
	public static String getFileExtension(String file) {
        if (file == null) {
            return null;
        }
        int extIndex = file.lastIndexOf(DOT_SEPARATOR);

        if (extIndex == -1) {
            return "";
        } else {
            return file.substring(extIndex + 1);
        }
    }
	
	public static void main(String[] args) {
		Options options = new Options();

        Option model = new Option("m", "model", true, "Autosar Model");
        model.setRequired(true);
        options.addOption(model);

        Option destdir = new Option("d", "destdir", true, "Destination Directory (Default : src-gen");
        destdir.setRequired(false);
        options.addOption(destdir);

        CommandLineParser parser = new GnuParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd;

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("utility-name", options);
            System.exit(1);
            return;
        }
        String modelFile = cmd.getOptionValue("model");
        String destDirectory = cmd.getOptionValue("destdir");

        if(modelFile != null){
        	if(!getFileExtension(modelFile).equals("arxml"))
        		System.out.println("ERROR : Model is not an AUTOSAR XML file (.arxml)");        	
        	else{
        		String wfFile = "workflow/workflow.mwe";
	    		Map<String, String> properties = new HashMap<String, String>();
	    		Map<String, String> slotContents = new HashMap<String, String>();
	    		properties.put("model",modelFile);
	    		if(destDirectory != null)
	    			properties.put("destdir",destDirectory);
	    		else
	    			properties.put("destdir","src-gen");
	    		new WorkflowRunner().run(wfFile ,new NullProgressMonitor(), properties, slotContents);
        	}
        }		
	}
}
