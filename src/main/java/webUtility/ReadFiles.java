package webUtility;


import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.tika.Tika;
import org.junit.Assert;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class ReadFiles {

    LogFileMessage log = new LogFileMessage();
private    Map<String, String> mimeTypeMapping = new HashMap<>();



    public List<File> readFilesFromDirectory(String[] filetypes, String dir_location) throws IOException {
        System.out.println("Search for the supported file type");
        //find the given extension file types in the directory and returns files information
        List<File> files;
        File dir = new File(dir_location);
        files = (List<File>) FileUtils.listFiles(dir, filetypes, true);
        return files;
    }

    public void supportedMimeType() {
        mimeTypeMapping.put("csv", "text/CSV");
        mimeTypeMapping.put("xls", "application/vnd.ms-excel");
        mimeTypeMapping.put("xlsx", "application/vnd.ms-excel");
    }

    ///Check the Mime type return the file with correct extension
    public String[] SearchForFileType(String [] mimType ) {

        supportedMimeType();
        List<String> result = new ArrayList<>();
        List<String> stringList = new ArrayList<String>(Arrays.asList(mimType));
        stringList.forEach(s ->
                {
                    List<String>  fileExtension =  mimeTypeMapping.entrySet()
                            .stream()
                            .filter(p -> p.getValue().equalsIgnoreCase(s))
                            .map(Map.Entry::getKey)
                            .collect(Collectors.toList()
                            );
                    try {
                        Assert.assertTrue(fileExtension.size() > 0);
                    } catch (AssertionError e) {
                        System.out.println("Invalid Mimetype"+s.toString());
                        log.error(e.getMessage());
                    }
                    fileExtension.forEach(x->{result.add(x);});
                }
        );
        String[] filetypes=result.stream().toArray(String[]::new);
        System.out.println("List of all select File types"+Arrays.toString(filetypes));
        return filetypes;
    }


    public void displayFileinfo(List<File> files) {

        System.out.println("Total number of files found:  " + files.size());
        files.forEach(file -> {
            System.out.println("###########################################");
            System.out.println("file name:  " + file.getName());
            System.out.println("file mime type:  " + getMimeType(file));
            System.out.println("file Extension:  " + FilenameUtils.getExtension(file.getName()));
            System.out.println("file size:  " + file.length());
        });
    }
    public String getMimeType(File file){
            Tika mimeTika = new Tika();
            String mimeType;
            try {
                mimeType = mimeTika.detect(new File (file.getAbsolutePath()));
            } catch (IOException exp) {
                mimeType = "Unknown";
            }
        return mimeType;
        }
    }

