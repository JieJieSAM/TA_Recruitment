package com.bupt.tarecruitment.storage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class JsonFileStore {
    public String read(Path path) throws IOException {
        if (!Files.exists(path)) {
            return "[]";
        }
        return Files.readString(path, StandardCharsets.UTF_8);
    }

    public void write(Path path, String content) throws IOException {
        if (path.getParent() != null) {
            Files.createDirectories(path.getParent());
        }
        Files.writeString(path, content, StandardCharsets.UTF_8);
    }
}
