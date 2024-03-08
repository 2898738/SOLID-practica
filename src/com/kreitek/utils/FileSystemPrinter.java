package com.kreitek.utils;

import com.kreitek.items.directories.Directory;
import com.kreitek.items.FileSystemItem;
import com.kreitek.items.directories.DirectoryItem;
import com.kreitek.service.FileManager;

public class FileSystemPrinter {

    private final FileManager fileManager;

    public FileSystemPrinter() {
        this.fileManager = new FileManager();
    }

    public static void print(FileSystemItem item, int nivel) {
        String indentation = "\t".repeat(nivel);
        String message = String.format("%s%s = %d bytes", indentation, item.getFullPath(), FileManager.calculateSize(item));
        System.out.println(message);

        if (item instanceof Directory) {

            for (FileSystemItem file : ((DirectoryItem) item).listFiles()) {
                print(file, nivel + 1);
            }
        }

    }

}
