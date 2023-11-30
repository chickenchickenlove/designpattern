package com.me.designpattern.behavioral_pattern.template_method.after_template_callback;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
    private String path;
    private final ProcessorFunction function;

    public FileProcessor(String path, ProcessorFunction function) {
        this.path = path;
        this.function = function;
    }

    public int process() {
        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int result = 0;
            String line = null;
            while((line = reader.readLine()) != null) {
                result = this.function.doProcess(result, line);
            }
            return result;
        } catch (IOException e) {
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
        }
    }
}
