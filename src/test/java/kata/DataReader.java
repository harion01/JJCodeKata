package kata;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataReader {
    public DataReader(String filePath){
        this.readData(filePath);
    }
    public List<String> getInputArr() {
        return inputArr;
    }

    public List<String> getOutputArr() {
        return outputArr;
    }

    public List<String> inputArr;
    public List<String> outputArr;


    //read resource data from file
    public void readData(String fileFullPath){

        try {
            File file = new File(fileFullPath);
            String data = IOUtils.toString(
                    file.toURI(),
                    "UTF-8"
            );

            inputArr = parseSection(data, "INPUTSTART", "INPUTEND");
            outputArr = parseSection(data, "OUTPUTSTART", "OUTPUTEND");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    //parse section of data from given fileContent.
    //start index is SectionStart, end index is SectionEnd
    //parse every line between start and end
    public List<String> parseSection(String fileContent, String SectionStart, String SectionEnd){
        List<String> values = new ArrayList<>();
        String sectionData = fileContent.substring(fileContent.indexOf(SectionStart)+SectionStart.length(), fileContent.indexOf(SectionEnd));
        if(sectionData != null){
            String split[] = sectionData.split("\n");
            for(int i = 0; i < split.length; i++){
                String data = split[i].trim();
                if(data.length() > 0){
                    values.add(data);
                }
            }
        }

        return values;
    }



}
