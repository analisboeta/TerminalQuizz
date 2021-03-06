package org.academiadecodigo.quizzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * Created by codecadet on 08/11/16.
 */
public class FileManager {

    /**
     * File reader and converter.
     * @param path - path to the file to read.
     * @returns - linked list of strings.
     * @throws IOException
     * This method reads each line of a given file, specified by its path, and converts into a container of strings
     */
    public static LinkedList<String> readFile(String path) throws IOException {

        BufferedReader bReader = new BufferedReader(new FileReader(path));

        LinkedList<String>lines = new LinkedList<>();
        String line;

        while ((line = bReader.readLine()) != null) {
            lines.add(line);

        }
        bReader.close();
        return lines;

    }

}
